package ds.waterquality;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.util.*;

public class WaterQualityService extends WaterQualityServiceGrpc.WaterQualityServiceImplBase {
    private Map<String, List<WaterQuality>> waterQualityDataMap = new HashMap<>();
    private Map<String, Double> waterQualityThresholdMap = new HashMap<>();

    public WaterQualityService() {
        // Load initial data into the waterQualityDataMap
        this.waterQualityDataMap = new HashMap<>();
        List<WaterQuality> location1Data = Arrays.asList(
                WaterQuality.newBuilder().setLocation("Location 1").setTimestamp("2022-01-01 00:00:00").setTemperature(25).setPh(7.4).setTurbidity(6).setDissolvedOxygen(40).build(),
                WaterQuality.newBuilder().setLocation("Location 1").setTimestamp("2022-01-01 01:00:00").setTemperature(24.6).setPh(7.6).setTurbidity(6).setDissolvedOxygen(44).build(),
                WaterQuality.newBuilder().setLocation("Location 1").setTimestamp("2022-01-01 02:00:00").setTemperature(22.2).setPh(7.8).setTurbidity(5).setDissolvedOxygen(55).build(),
                WaterQuality.newBuilder().setLocation("Location 1").setTimestamp("2022-01-01 03:00:00").setTemperature(24).setPh(7.3).setTurbidity(6).setDissolvedOxygen(43).build()
        );
        List<WaterQuality> location2Data = Arrays.asList(
                WaterQuality.newBuilder().setLocation("Location 2").setTimestamp("2022-01-01 00:00:00").setTemperature(22).setPh(7.6).setTurbidity(8).setDissolvedOxygen(42).build(),
                WaterQuality.newBuilder().setLocation("Location 2").setTimestamp("2022-01-01 01:00:00").setTemperature(21.6).setPh(7.6).setTurbidity(8).setDissolvedOxygen(43).build(),
                WaterQuality.newBuilder().setLocation("Location 2").setTimestamp("2022-01-01 02:00:00").setTemperature(21.2).setPh(7.4).setTurbidity(7).setDissolvedOxygen(54).build(),
                WaterQuality.newBuilder().setLocation("Location 2").setTimestamp("2022-01-01 03:00:00").setTemperature(23).setPh(7.5).setTurbidity(7).setDissolvedOxygen(55).build()
        );
        this.waterQualityDataMap.put("Location 1", location1Data);
        this.waterQualityDataMap.put("Location 2", location2Data);
    }

    @Override
    public void getWaterQualityData(WaterQualityRequest request, StreamObserver<WaterQualityResponse> responseObserver) {

        String location = request.getLocation();
        String start_time = request.getStartTime();
        String end_time = request.getEndTime();
        List<WaterQuality> data = waterQualityDataMap.get(location);

        if (data == null) {
            responseObserver.onError(Status.NOT_FOUND
                    .withDescription("No water quality data found for location: " + location)
                    .asRuntimeException());
            return;
        }
        List<WaterQuality> resData = new ArrayList<>();
        for (WaterQuality datum : data) {
            if (datum.getTimestamp().compareTo(start_time) >= 0 && datum.getTimestamp().compareTo(end_time) <= 0) {
                resData.add(datum);
            }
        }
        WaterQualityResponse response = WaterQualityResponse.newBuilder().addAllData(resData).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void setWaterQualityThreshold(WaterQualityThresholdRequest request, StreamObserver<WaterQualityThresholdResponse> responseObserver) {
        String location = request.getLocation();
        double threshold = request.getThresholdValue();
        waterQualityThresholdMap.put(location, threshold);

        WaterQualityThresholdResponse response = WaterQualityThresholdResponse.newBuilder()
                .setMessage("Threshold value set successfully")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void streamWaterQualityData(WaterQualityStreamingRequest request, StreamObserver<WaterQualityStreamingResponse> responseObserver) {

        String location = request.getLocation();
        int durationSeconds = request.getDuration();

        // Set up a timer to stop streaming after the requested duration
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                responseObserver.onCompleted();
                timer.cancel();
            }
        }, durationSeconds * 1000);

        // Continuously stream data for the requested location
        List<WaterQuality> data = waterQualityDataMap.get(location);
        int dataIndex = 0;
        while (!Thread.currentThread().isInterrupted() && dataIndex < data.size()) {
            WaterQuality dataPoint = data.get(dataIndex);
            if (dataPoint.getLocation().equals(location)) {
                WaterQualityStreamingResponse response = WaterQualityStreamingResponse.newBuilder().setData(dataPoint).build();
                responseObserver.onNext(response);
            }
            dataIndex++;

            // Sleep for 1 second before streaming the next data point
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
