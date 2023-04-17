package ds.analysis;

import ds.airquality.*;
import ds.waterquality.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.*;

public class AnalysisService extends AnalysisServiceGrpc.AnalysisServiceImplBase {

    private final int WATER_QUALITY_PORT = 50051;
    private final int AIR_QUALITY_PORT = 50052;
    private ManagedChannel water_quality_channel;
    private ManagedChannel air_quality_channel;

    AnalysisService() {
        water_quality_channel = ManagedChannelBuilder.forAddress("localhost", WATER_QUALITY_PORT)
                .usePlaintext()
                .build();
        air_quality_channel = ManagedChannelBuilder.forAddress("localhost", AIR_QUALITY_PORT)
                .usePlaintext()
                .build();
    }

    @Override
    public void getWaterQualityAnalysis(WaterQualityAnalysisRequest request, StreamObserver<WaterQualityAnalysisResponse> responseObserver) {

        String location = request.getLocation();
        String startTime = request.getStartTime();
        String endTime = request.getEndTime();
        String type = request.getAnalysisType();

        try {
            WaterQualityServiceGrpc.WaterQualityServiceBlockingStub stub = WaterQualityServiceGrpc.newBlockingStub(water_quality_channel);

            WaterQualityRequest req = WaterQualityRequest.newBuilder()
                    .setLocation(location)
                    .setStartTime(startTime)
                    .setEndTime(endTime)
                    .build();
            List<WaterQuality> res = stub.getWaterQualityData(req).getDataList();
            List<AnalysisData> list = new ArrayList<>();

            for (WaterQuality wq : res) {
                String result = "";
                switch (type) {
                    case "ph": {
                        result = String.valueOf(wq.getPh());
                        break;
                    }
                    case "temperature": {
                        result = String.valueOf(wq.getTemperature());
                        break;
                    }
                    case "turbidity": {
                        result = String.valueOf(wq.getTurbidity());
                        break;
                    }
                    case "dissolved_oxygen": {
                        result = String.valueOf(wq.getDissolvedOxygen());
                        break;
                    }
                }
                AnalysisData temp = AnalysisData.newBuilder().setLocation(wq.getLocation()).setTime(wq.getTimestamp()).setAnalysisResult(result).build();
                list.add(temp);
            }

            WaterQualityAnalysisResponse response = WaterQualityAnalysisResponse.newBuilder()
                    .addAllWaterQualityData(list)
                    .build();
            responseObserver.onNext(response);
        } catch (Exception e) {
            WaterQualityAnalysisResponse response = WaterQualityAnalysisResponse.newBuilder()
                    .build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void getAirQualityAnalysis(AirQualityAnalysisRequest request, StreamObserver<AirQualityAnalysisResponse> responseObserver) {

        String location = request.getLocation();
        String startTime = request.getStartTime();
        String endTime = request.getEndTime();
        String type = request.getAnalysisType();

        try {
            AirQualityServiceGrpc.AirQualityServiceBlockingStub stub = AirQualityServiceGrpc.newBlockingStub(air_quality_channel);

            AirQualityRequest req = AirQualityRequest.newBuilder()
                    .setLocation(location)
                    .setStartTime(startTime)
                    .setEndTime(endTime)
                    .build();
            List<AirQuality> res = stub.getAirQualityData(req).getDataList();
            List<AnalysisData> list = new ArrayList<>();

            for (AirQuality aq : res) {
                String result = "";
                switch (type) {
                    case "pm": {
                        result = String.valueOf(aq.getPm());
                        break;
                    }
                    case "ozone": {
                        result = String.valueOf(aq.getOzone());
                        break;
                    }
                    case "carbon_monoxide": {
                        result = String.valueOf(aq.getCarbonMonoxide());
                        break;
                    }
                    case "sulfur_dioxide": {
                        result = String.valueOf(aq.getSulfurDioxide());
                        break;
                    }
                }
                AnalysisData temp = AnalysisData.newBuilder().setLocation(aq.getLocation()).setTime(aq.getTimestamp()).setAnalysisResult(result).build();
                list.add(temp);
            }

            AirQualityAnalysisResponse response = AirQualityAnalysisResponse.newBuilder()
                    .addAllAirQualityData(list)
                    .build();
            responseObserver.onNext(response);
        } catch (Exception e) {
            AirQualityAnalysisResponse response = AirQualityAnalysisResponse.newBuilder()
                    .build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void setAnalysisParameters(AnalysisParametersRequest request, StreamObserver<AnalysisParametersResponse> responseObserver) {

        String location = request.getLocation();
        String startTime = request.getStartTime();
        String endTime = request.getEndTime();
        String type = request.getAnalysisType();

        try {
            switch (type) {
                case "water quality": {
                    WaterQualityServiceGrpc.WaterQualityServiceBlockingStub stub = WaterQualityServiceGrpc.newBlockingStub(water_quality_channel);

                    WaterQualityRequest req = WaterQualityRequest.newBuilder()
                            .setLocation(location)
                            .setStartTime(startTime)
                            .setEndTime(endTime)
                            .build();
                    List<WaterQuality> res = stub.getWaterQualityData(req).getDataList();
                    List<AnalysisDataParams> list = new ArrayList<>();

                    for (WaterQuality wq : res) {
                        AnalysisDataParams temp = AnalysisDataParams.newBuilder()
                                .setLocation(wq.getLocation())
                                .setTime(wq.getTimestamp())
                                .putAnalysisResult("ph", wq.getPh())
                                .putAnalysisResult("temperature", wq.getTemperature())
                                .putAnalysisResult("turbidity", wq.getTurbidity())
                                .putAnalysisResult("dissolved_oxygen", wq.getDissolvedOxygen())
                                .build();
                        list.add(temp);
                    }
                    AnalysisParametersResponse response = AnalysisParametersResponse.newBuilder()
                            .addAllAnalysisResult(list)
                            .build();
                    responseObserver.onNext(response);
                    break;
                }
                case "air quality": {
                    AirQualityServiceGrpc.AirQualityServiceBlockingStub stub = AirQualityServiceGrpc.newBlockingStub(air_quality_channel);

                    AirQualityRequest req = AirQualityRequest.newBuilder()
                            .setLocation(location)
                            .setStartTime(startTime)
                            .setEndTime(endTime)
                            .build();
                    List<AirQuality> res = stub.getAirQualityData(req).getDataList();
                    List<AnalysisDataParams> list = new ArrayList<>();

                    for (AirQuality aq : res) {
                        AnalysisDataParams temp = AnalysisDataParams.newBuilder()
                                .setLocation(aq.getLocation())
                                .setTime(aq.getTimestamp())
                                .putAnalysisResult("ph", aq.getPm())
                                .putAnalysisResult("ozone", aq.getOzone())
                                .putAnalysisResult("carbon_monoxide", aq.getCarbonMonoxide())
                                .putAnalysisResult("sulfur_dioxide", aq.getSulfurDioxide())
                                .build();
                        list.add(temp);
                    }
                    AnalysisParametersResponse response = AnalysisParametersResponse.newBuilder()
                            .addAllAnalysisResult(list)
                            .build();
                    responseObserver.onNext(response);
                    break;
                }
            }

        } catch (Exception e) {
            AnalysisParametersResponse response = AnalysisParametersResponse.newBuilder()
                    .build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void streamAnalysisData(StreamAnalysisDataRequest request, StreamObserver<StreamAnalysisDataResponse> responseObserver) {

        String location = request.getLocation();
        int durationSeconds = request.getDuration();
        String type = request.getAnalysisType();

        try {
            switch (type) {
                case "water quality": {
                    WaterQualityServiceGrpc.WaterQualityServiceBlockingStub stub = WaterQualityServiceGrpc.newBlockingStub(water_quality_channel);

                    WaterQualityStreamingRequest req = WaterQualityStreamingRequest.newBuilder()
                            .setLocation(location)
                            .setDuration(durationSeconds)
                            .build();

                    stub.streamWaterQualityData(req).forEachRemaining(response -> {
                        WaterQuality dataPoint = response.getData();
                        responseObserver.onNext(StreamAnalysisDataResponse.newBuilder()
                                        .addAnalysisResult(AnalysisDataParams.newBuilder()
                                                .setLocation(dataPoint.getLocation())
                                                .setTime(dataPoint.getTimestamp())
                                                .putAnalysisResult("ph", dataPoint.getPh())
                                                .putAnalysisResult("temperature", dataPoint.getTemperature())
                                                .putAnalysisResult("turbidity", dataPoint.getTurbidity())
                                                .putAnalysisResult("dissolved_oxygen", dataPoint.getDissolvedOxygen()))
                                        .build());
                    });

                    break;
                }
                case "air quality": {
                    AirQualityServiceGrpc.AirQualityServiceBlockingStub stub = AirQualityServiceGrpc.newBlockingStub(air_quality_channel);

                    AirQualityMonitoringRequest req = AirQualityMonitoringRequest.newBuilder()
                            .setLocation(location)
                            .setDuration(durationSeconds)
                            .build();

                    AirQuality res = stub.monitorAirQuality(req).getData();

                    responseObserver.onNext(StreamAnalysisDataResponse.newBuilder()
                            .addAnalysisResult(AnalysisDataParams.newBuilder()
                                    .setLocation(res.getLocation())
                                    .setTime(res.getTimestamp())
                                    .putAnalysisResult("ph", res.getPm())
                                    .putAnalysisResult("ozone", res.getOzone())
                                    .putAnalysisResult("carbon_monoxide",res.getCarbonMonoxide())
                                    .putAnalysisResult("sulfur_dioxide", res.getSulfurDioxide()))
                            .build());

                    break;
                }
            }

        } catch (Exception e) {
            responseObserver.onNext(StreamAnalysisDataResponse.newBuilder().build());
        }
        responseObserver.onCompleted();
    }
}
