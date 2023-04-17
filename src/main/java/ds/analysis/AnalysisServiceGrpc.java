package ds.analysis;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: analysis.proto")
public final class AnalysisServiceGrpc {

  private AnalysisServiceGrpc() {}

  public static final String SERVICE_NAME = "analysis.AnalysisService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.analysis.WaterQualityAnalysisRequest,
      ds.analysis.WaterQualityAnalysisResponse> getGetWaterQualityAnalysisMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWaterQualityAnalysis",
      requestType = ds.analysis.WaterQualityAnalysisRequest.class,
      responseType = ds.analysis.WaterQualityAnalysisResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.analysis.WaterQualityAnalysisRequest,
      ds.analysis.WaterQualityAnalysisResponse> getGetWaterQualityAnalysisMethod() {
    io.grpc.MethodDescriptor<ds.analysis.WaterQualityAnalysisRequest, ds.analysis.WaterQualityAnalysisResponse> getGetWaterQualityAnalysisMethod;
    if ((getGetWaterQualityAnalysisMethod = AnalysisServiceGrpc.getGetWaterQualityAnalysisMethod) == null) {
      synchronized (AnalysisServiceGrpc.class) {
        if ((getGetWaterQualityAnalysisMethod = AnalysisServiceGrpc.getGetWaterQualityAnalysisMethod) == null) {
          AnalysisServiceGrpc.getGetWaterQualityAnalysisMethod = getGetWaterQualityAnalysisMethod = 
              io.grpc.MethodDescriptor.<ds.analysis.WaterQualityAnalysisRequest, ds.analysis.WaterQualityAnalysisResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "analysis.AnalysisService", "GetWaterQualityAnalysis"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.analysis.WaterQualityAnalysisRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.analysis.WaterQualityAnalysisResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AnalysisServiceMethodDescriptorSupplier("GetWaterQualityAnalysis"))
                  .build();
          }
        }
     }
     return getGetWaterQualityAnalysisMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.analysis.AirQualityAnalysisRequest,
      ds.analysis.AirQualityAnalysisResponse> getGetAirQualityAnalysisMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAirQualityAnalysis",
      requestType = ds.analysis.AirQualityAnalysisRequest.class,
      responseType = ds.analysis.AirQualityAnalysisResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.analysis.AirQualityAnalysisRequest,
      ds.analysis.AirQualityAnalysisResponse> getGetAirQualityAnalysisMethod() {
    io.grpc.MethodDescriptor<ds.analysis.AirQualityAnalysisRequest, ds.analysis.AirQualityAnalysisResponse> getGetAirQualityAnalysisMethod;
    if ((getGetAirQualityAnalysisMethod = AnalysisServiceGrpc.getGetAirQualityAnalysisMethod) == null) {
      synchronized (AnalysisServiceGrpc.class) {
        if ((getGetAirQualityAnalysisMethod = AnalysisServiceGrpc.getGetAirQualityAnalysisMethod) == null) {
          AnalysisServiceGrpc.getGetAirQualityAnalysisMethod = getGetAirQualityAnalysisMethod = 
              io.grpc.MethodDescriptor.<ds.analysis.AirQualityAnalysisRequest, ds.analysis.AirQualityAnalysisResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "analysis.AnalysisService", "getAirQualityAnalysis"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.analysis.AirQualityAnalysisRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.analysis.AirQualityAnalysisResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AnalysisServiceMethodDescriptorSupplier("getAirQualityAnalysis"))
                  .build();
          }
        }
     }
     return getGetAirQualityAnalysisMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.analysis.AnalysisParametersRequest,
      ds.analysis.AnalysisParametersResponse> getSetAnalysisParametersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAnalysisParameters",
      requestType = ds.analysis.AnalysisParametersRequest.class,
      responseType = ds.analysis.AnalysisParametersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.analysis.AnalysisParametersRequest,
      ds.analysis.AnalysisParametersResponse> getSetAnalysisParametersMethod() {
    io.grpc.MethodDescriptor<ds.analysis.AnalysisParametersRequest, ds.analysis.AnalysisParametersResponse> getSetAnalysisParametersMethod;
    if ((getSetAnalysisParametersMethod = AnalysisServiceGrpc.getSetAnalysisParametersMethod) == null) {
      synchronized (AnalysisServiceGrpc.class) {
        if ((getSetAnalysisParametersMethod = AnalysisServiceGrpc.getSetAnalysisParametersMethod) == null) {
          AnalysisServiceGrpc.getSetAnalysisParametersMethod = getSetAnalysisParametersMethod = 
              io.grpc.MethodDescriptor.<ds.analysis.AnalysisParametersRequest, ds.analysis.AnalysisParametersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "analysis.AnalysisService", "SetAnalysisParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.analysis.AnalysisParametersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.analysis.AnalysisParametersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AnalysisServiceMethodDescriptorSupplier("SetAnalysisParameters"))
                  .build();
          }
        }
     }
     return getSetAnalysisParametersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.analysis.StreamAnalysisDataRequest,
      ds.analysis.StreamAnalysisDataResponse> getStreamAnalysisDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamAnalysisData",
      requestType = ds.analysis.StreamAnalysisDataRequest.class,
      responseType = ds.analysis.StreamAnalysisDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ds.analysis.StreamAnalysisDataRequest,
      ds.analysis.StreamAnalysisDataResponse> getStreamAnalysisDataMethod() {
    io.grpc.MethodDescriptor<ds.analysis.StreamAnalysisDataRequest, ds.analysis.StreamAnalysisDataResponse> getStreamAnalysisDataMethod;
    if ((getStreamAnalysisDataMethod = AnalysisServiceGrpc.getStreamAnalysisDataMethod) == null) {
      synchronized (AnalysisServiceGrpc.class) {
        if ((getStreamAnalysisDataMethod = AnalysisServiceGrpc.getStreamAnalysisDataMethod) == null) {
          AnalysisServiceGrpc.getStreamAnalysisDataMethod = getStreamAnalysisDataMethod = 
              io.grpc.MethodDescriptor.<ds.analysis.StreamAnalysisDataRequest, ds.analysis.StreamAnalysisDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "analysis.AnalysisService", "StreamAnalysisData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.analysis.StreamAnalysisDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.analysis.StreamAnalysisDataResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AnalysisServiceMethodDescriptorSupplier("StreamAnalysisData"))
                  .build();
          }
        }
     }
     return getStreamAnalysisDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AnalysisServiceStub newStub(io.grpc.Channel channel) {
    return new AnalysisServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AnalysisServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AnalysisServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AnalysisServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AnalysisServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AnalysisServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getWaterQualityAnalysis(ds.analysis.WaterQualityAnalysisRequest request,
        io.grpc.stub.StreamObserver<ds.analysis.WaterQualityAnalysisResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetWaterQualityAnalysisMethod(), responseObserver);
    }

    /**
     */
    public void getAirQualityAnalysis(ds.analysis.AirQualityAnalysisRequest request,
        io.grpc.stub.StreamObserver<ds.analysis.AirQualityAnalysisResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAirQualityAnalysisMethod(), responseObserver);
    }

    /**
     */
    public void setAnalysisParameters(ds.analysis.AnalysisParametersRequest request,
        io.grpc.stub.StreamObserver<ds.analysis.AnalysisParametersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetAnalysisParametersMethod(), responseObserver);
    }

    /**
     */
    public void streamAnalysisData(ds.analysis.StreamAnalysisDataRequest request,
        io.grpc.stub.StreamObserver<ds.analysis.StreamAnalysisDataResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStreamAnalysisDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetWaterQualityAnalysisMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.analysis.WaterQualityAnalysisRequest,
                ds.analysis.WaterQualityAnalysisResponse>(
                  this, METHODID_GET_WATER_QUALITY_ANALYSIS)))
          .addMethod(
            getGetAirQualityAnalysisMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.analysis.AirQualityAnalysisRequest,
                ds.analysis.AirQualityAnalysisResponse>(
                  this, METHODID_GET_AIR_QUALITY_ANALYSIS)))
          .addMethod(
            getSetAnalysisParametersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.analysis.AnalysisParametersRequest,
                ds.analysis.AnalysisParametersResponse>(
                  this, METHODID_SET_ANALYSIS_PARAMETERS)))
          .addMethod(
            getStreamAnalysisDataMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ds.analysis.StreamAnalysisDataRequest,
                ds.analysis.StreamAnalysisDataResponse>(
                  this, METHODID_STREAM_ANALYSIS_DATA)))
          .build();
    }
  }

  /**
   */
  public static final class AnalysisServiceStub extends io.grpc.stub.AbstractStub<AnalysisServiceStub> {
    private AnalysisServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AnalysisServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnalysisServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AnalysisServiceStub(channel, callOptions);
    }

    /**
     */
    public void getWaterQualityAnalysis(ds.analysis.WaterQualityAnalysisRequest request,
        io.grpc.stub.StreamObserver<ds.analysis.WaterQualityAnalysisResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetWaterQualityAnalysisMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAirQualityAnalysis(ds.analysis.AirQualityAnalysisRequest request,
        io.grpc.stub.StreamObserver<ds.analysis.AirQualityAnalysisResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAirQualityAnalysisMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setAnalysisParameters(ds.analysis.AnalysisParametersRequest request,
        io.grpc.stub.StreamObserver<ds.analysis.AnalysisParametersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetAnalysisParametersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void streamAnalysisData(ds.analysis.StreamAnalysisDataRequest request,
        io.grpc.stub.StreamObserver<ds.analysis.StreamAnalysisDataResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getStreamAnalysisDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AnalysisServiceBlockingStub extends io.grpc.stub.AbstractStub<AnalysisServiceBlockingStub> {
    private AnalysisServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AnalysisServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnalysisServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AnalysisServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ds.analysis.WaterQualityAnalysisResponse getWaterQualityAnalysis(ds.analysis.WaterQualityAnalysisRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetWaterQualityAnalysisMethod(), getCallOptions(), request);
    }

    /**
     */
    public ds.analysis.AirQualityAnalysisResponse getAirQualityAnalysis(ds.analysis.AirQualityAnalysisRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAirQualityAnalysisMethod(), getCallOptions(), request);
    }

    /**
     */
    public ds.analysis.AnalysisParametersResponse setAnalysisParameters(ds.analysis.AnalysisParametersRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetAnalysisParametersMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<ds.analysis.StreamAnalysisDataResponse> streamAnalysisData(
        ds.analysis.StreamAnalysisDataRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getStreamAnalysisDataMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AnalysisServiceFutureStub extends io.grpc.stub.AbstractStub<AnalysisServiceFutureStub> {
    private AnalysisServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AnalysisServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnalysisServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AnalysisServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.analysis.WaterQualityAnalysisResponse> getWaterQualityAnalysis(
        ds.analysis.WaterQualityAnalysisRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetWaterQualityAnalysisMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.analysis.AirQualityAnalysisResponse> getAirQualityAnalysis(
        ds.analysis.AirQualityAnalysisRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAirQualityAnalysisMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.analysis.AnalysisParametersResponse> setAnalysisParameters(
        ds.analysis.AnalysisParametersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetAnalysisParametersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_WATER_QUALITY_ANALYSIS = 0;
  private static final int METHODID_GET_AIR_QUALITY_ANALYSIS = 1;
  private static final int METHODID_SET_ANALYSIS_PARAMETERS = 2;
  private static final int METHODID_STREAM_ANALYSIS_DATA = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AnalysisServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AnalysisServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_WATER_QUALITY_ANALYSIS:
          serviceImpl.getWaterQualityAnalysis((ds.analysis.WaterQualityAnalysisRequest) request,
              (io.grpc.stub.StreamObserver<ds.analysis.WaterQualityAnalysisResponse>) responseObserver);
          break;
        case METHODID_GET_AIR_QUALITY_ANALYSIS:
          serviceImpl.getAirQualityAnalysis((ds.analysis.AirQualityAnalysisRequest) request,
              (io.grpc.stub.StreamObserver<ds.analysis.AirQualityAnalysisResponse>) responseObserver);
          break;
        case METHODID_SET_ANALYSIS_PARAMETERS:
          serviceImpl.setAnalysisParameters((ds.analysis.AnalysisParametersRequest) request,
              (io.grpc.stub.StreamObserver<ds.analysis.AnalysisParametersResponse>) responseObserver);
          break;
        case METHODID_STREAM_ANALYSIS_DATA:
          serviceImpl.streamAnalysisData((ds.analysis.StreamAnalysisDataRequest) request,
              (io.grpc.stub.StreamObserver<ds.analysis.StreamAnalysisDataResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AnalysisServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AnalysisServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.analysis.AnalysisProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AnalysisService");
    }
  }

  private static final class AnalysisServiceFileDescriptorSupplier
      extends AnalysisServiceBaseDescriptorSupplier {
    AnalysisServiceFileDescriptorSupplier() {}
  }

  private static final class AnalysisServiceMethodDescriptorSupplier
      extends AnalysisServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AnalysisServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AnalysisServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AnalysisServiceFileDescriptorSupplier())
              .addMethod(getGetWaterQualityAnalysisMethod())
              .addMethod(getGetAirQualityAnalysisMethod())
              .addMethod(getSetAnalysisParametersMethod())
              .addMethod(getStreamAnalysisDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
