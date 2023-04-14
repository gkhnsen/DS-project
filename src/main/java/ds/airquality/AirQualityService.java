package ds.airquality;

import ds.waterquality.WaterQuality;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import java.util.*;

public class AirQualityService extends AirQualityServiceGrpc.AirQualityServiceImplBase {

    private Map<String, List<AirQuality>> airQualityDataMap = new HashMap<>();
    private Map<String, Double> airQualityThresholdMap = new HashMap<>();


    public AirQualityService() {
        // Load initial data into the waterQualityDataMap
        this.airQualityDataMap = new HashMap<>();
        List< AirQuality> location1Data = Arrays.asList(
                AirQuality.newBuilder().setLocation("Location 1").setTimestamp("2022-01-01 00:00:00").setOzone(2.5).setSulfurDioxide(0.3).setCarbonMonoxide(0.8).build(),
                AirQuality.newBuilder().setLocation("Location 1").setTimestamp("2022-01-01 01:00:00").setOzone(2.8).setSulfurDioxide(0.55).setCarbonMonoxide(0.77).build(),
                AirQuality.newBuilder().setLocation("Location 1").setTimestamp("2022-01-01 02:00:00").setOzone(2.4).setSulfurDioxide(0.34).setCarbonMonoxide(0.73).build(),
                AirQuality.newBuilder().setLocation("Location 1").setTimestamp("2022-01-01 03:00:00").setOzone(2.6).setSulfurDioxide(0.44).setCarbonMonoxide(0.81).build()
        );
        List<AirQuality> location2Data = Arrays.asList(
                AirQuality.newBuilder().setLocation("Location 2").setTimestamp("2022-01-01 00:00:00").setOzone(2.9).setSulfurDioxide(0.44).setCarbonMonoxide(0.66).build(),
                AirQuality.newBuilder().setLocation("Location 2").setTimestamp("2022-01-01 01:00:00").setOzone(3.22).setSulfurDioxide(0.43).setCarbonMonoxide(0.76).build(),
                AirQuality.newBuilder().setLocation("Location 2").setTimestamp("2022-01-01 02:00:00").setOzone(3.23).setSulfurDioxide(0.48).setCarbonMonoxide(0.81).build(),
                AirQuality.newBuilder().setLocation("Location 2").setTimestamp("2022-01-01 03:00:00").setOzone(3.6).setSulfurDioxide(0.53).setCarbonMonoxide(0.89).build()
        );
        this.airQualityDataMap.put("Location 1", location1Data);
        this.airQualityDataMap.put("Location 2", location2Data);
    }

    @Override
    public void getAirQualityData(AirQualityRequest request, StreamObserver<AirQualityResponse> responseObserver) {
        String location = request.getLocation();
        String start_time = request.getStartTime();
        String end_time = request.getEndTime();
        List<AirQuality> data = airQualityDataMap.get(location);

        if (data == null) {
            responseObserver.onError(Status.NOT_FOUND
                    .withDescription("No air quality data found for location: " + location)
                    .asRuntimeException());
            return;
        }
        List<AirQuality> resData = new ArrayList<>();
        for (AirQuality datum : data) {
            if (datum.getTimestamp().compareTo(start_time) >= 0 && datum.getTimestamp().compareTo(end_time) <= 0) {
                resData.add(datum);
            }
        }
        AirQualityResponse response = AirQualityResponse.newBuilder().addAllData(resData).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void setAirQualityThreshold(AirQualityThresholdRequest request, StreamObserver<AirQualityThresholdResponse> responseObserver) {
        String location = request.getLocation();
        double threshold = request.getThresholdValue();
        airQualityThresholdMap.put(location, threshold);

        AirQualityThresholdResponse response = AirQualityThresholdResponse.newBuilder()
                .setMessage("Threshold value set successfully")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void monitorAirQuality(AirQualityMonitoringRequest request, StreamObserver<AirQualityMonitoringResponse> responseObserver) {
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
        List<AirQuality> data = airQualityDataMap.get(location);
        int dataIndex = 0;
        while (!Thread.currentThread().isInterrupted() && dataIndex < data.size()) {
            AirQuality dataPoint = data.get(dataIndex);
            if (dataPoint.getLocation().equals(location)) {
                AirQualityMonitoringResponse response = AirQualityMonitoringResponse.newBuilder().setData(dataPoint).build();
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
