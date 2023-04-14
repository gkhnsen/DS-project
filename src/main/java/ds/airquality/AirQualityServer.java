package ds.airquality;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class AirQualityServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 50052;
        Server server = ServerBuilder.forPort(port)
                .addService(new AirQualityService())
                .build();
        try {
            server.start();
            System.out.println("Server started, listening on " + port);
            server.awaitTermination();
        } catch (Exception e) {}
    }
}
