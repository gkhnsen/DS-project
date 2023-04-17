package ds.analysis;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class AnalysisServer {
    public static void main(String[] args) throws Exception {
        AnalysisService analysisService = new AnalysisService();

        int port = 50053;
        Server server = ServerBuilder.forPort(port)
                .addService(analysisService)
                .build();

        try {
            server.start();
            System.out.println("Server started, listening on " + port);
            server.awaitTermination();
        } catch (Exception e) {}
    }
}
