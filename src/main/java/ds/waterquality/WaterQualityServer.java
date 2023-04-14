package ds.waterquality;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class WaterQualityServer {
    public static void main(String[] args) throws InterruptedException, IOException {
        int port = 50051;
        Server server = ServerBuilder.forPort(port)
                .addService(new WaterQualityService())
                .build();
        try {
            server.start();
            System.out.println("Server started, listening on " + port);
            server.awaitTermination();
        } catch (Exception e) {}
    }
}
