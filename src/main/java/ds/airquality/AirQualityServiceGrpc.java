package ds.airquality;

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
    comments = "Source: airquality.proto")
public final class AirQualityServiceGrpc {

  private AirQualityServiceGrpc() {}

  public static final String SERVICE_NAME = "airquality.AirQualityService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.airquality.AirQualityRequest,
      ds.airquality.AirQualityResponse> getGetAirQualityDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAirQualityData",
      requestType = ds.airquality.AirQualityRequest.class,
      responseType = ds.airquality.AirQualityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.airquality.AirQualityRequest,
      ds.airquality.AirQualityResponse> getGetAirQualityDataMethod() {
    io.grpc.MethodDescriptor<ds.airquality.AirQualityRequest, ds.airquality.AirQualityResponse> getGetAirQualityDataMethod;
    if ((getGetAirQualityDataMethod = AirQualityServiceGrpc.getGetAirQualityDataMethod) == null) {
      synchronized (AirQualityServiceGrpc.class) {
        if ((getGetAirQualityDataMethod = AirQualityServiceGrpc.getGetAirQualityDataMethod) == null) {
          AirQualityServiceGrpc.getGetAirQualityDataMethod = getGetAirQualityDataMethod = 
              io.grpc.MethodDescriptor.<ds.airquality.AirQualityRequest, ds.airquality.AirQualityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "airquality.AirQualityService", "GetAirQualityData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.airquality.AirQualityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.airquality.AirQualityResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AirQualityServiceMethodDescriptorSupplier("GetAirQualityData"))
                  .build();
          }
        }
     }
     return getGetAirQualityDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.airquality.AirQualityThresholdRequest,
      ds.airquality.AirQualityThresholdResponse> getSetAirQualityThresholdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAirQualityThreshold",
      requestType = ds.airquality.AirQualityThresholdRequest.class,
      responseType = ds.airquality.AirQualityThresholdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.airquality.AirQualityThresholdRequest,
      ds.airquality.AirQualityThresholdResponse> getSetAirQualityThresholdMethod() {
    io.grpc.MethodDescriptor<ds.airquality.AirQualityThresholdRequest, ds.airquality.AirQualityThresholdResponse> getSetAirQualityThresholdMethod;
    if ((getSetAirQualityThresholdMethod = AirQualityServiceGrpc.getSetAirQualityThresholdMethod) == null) {
      synchronized (AirQualityServiceGrpc.class) {
        if ((getSetAirQualityThresholdMethod = AirQualityServiceGrpc.getSetAirQualityThresholdMethod) == null) {
          AirQualityServiceGrpc.getSetAirQualityThresholdMethod = getSetAirQualityThresholdMethod = 
              io.grpc.MethodDescriptor.<ds.airquality.AirQualityThresholdRequest, ds.airquality.AirQualityThresholdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "airquality.AirQualityService", "SetAirQualityThreshold"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.airquality.AirQualityThresholdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.airquality.AirQualityThresholdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AirQualityServiceMethodDescriptorSupplier("SetAirQualityThreshold"))
                  .build();
          }
        }
     }
     return getSetAirQualityThresholdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.airquality.AirQualityMonitoringRequest,
      ds.airquality.AirQualityMonitoringResponse> getMonitorAirQualityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MonitorAirQuality",
      requestType = ds.airquality.AirQualityMonitoringRequest.class,
      responseType = ds.airquality.AirQualityMonitoringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.airquality.AirQualityMonitoringRequest,
      ds.airquality.AirQualityMonitoringResponse> getMonitorAirQualityMethod() {
    io.grpc.MethodDescriptor<ds.airquality.AirQualityMonitoringRequest, ds.airquality.AirQualityMonitoringResponse> getMonitorAirQualityMethod;
    if ((getMonitorAirQualityMethod = AirQualityServiceGrpc.getMonitorAirQualityMethod) == null) {
      synchronized (AirQualityServiceGrpc.class) {
        if ((getMonitorAirQualityMethod = AirQualityServiceGrpc.getMonitorAirQualityMethod) == null) {
          AirQualityServiceGrpc.getMonitorAirQualityMethod = getMonitorAirQualityMethod = 
              io.grpc.MethodDescriptor.<ds.airquality.AirQualityMonitoringRequest, ds.airquality.AirQualityMonitoringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "airquality.AirQualityService", "MonitorAirQuality"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.airquality.AirQualityMonitoringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.airquality.AirQualityMonitoringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AirQualityServiceMethodDescriptorSupplier("MonitorAirQuality"))
                  .build();
          }
        }
     }
     return getMonitorAirQualityMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AirQualityServiceStub newStub(io.grpc.Channel channel) {
    return new AirQualityServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AirQualityServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AirQualityServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AirQualityServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AirQualityServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AirQualityServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAirQualityData(ds.airquality.AirQualityRequest request,
        io.grpc.stub.StreamObserver<ds.airquality.AirQualityResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAirQualityDataMethod(), responseObserver);
    }

    /**
     */
    public void setAirQualityThreshold(ds.airquality.AirQualityThresholdRequest request,
        io.grpc.stub.StreamObserver<ds.airquality.AirQualityThresholdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetAirQualityThresholdMethod(), responseObserver);
    }

    /**
     */
    public void monitorAirQuality(ds.airquality.AirQualityMonitoringRequest request,
        io.grpc.stub.StreamObserver<ds.airquality.AirQualityMonitoringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMonitorAirQualityMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAirQualityDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.airquality.AirQualityRequest,
                ds.airquality.AirQualityResponse>(
                  this, METHODID_GET_AIR_QUALITY_DATA)))
          .addMethod(
            getSetAirQualityThresholdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.airquality.AirQualityThresholdRequest,
                ds.airquality.AirQualityThresholdResponse>(
                  this, METHODID_SET_AIR_QUALITY_THRESHOLD)))
          .addMethod(
            getMonitorAirQualityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.airquality.AirQualityMonitoringRequest,
                ds.airquality.AirQualityMonitoringResponse>(
                  this, METHODID_MONITOR_AIR_QUALITY)))
          .build();
    }
  }

  /**
   */
  public static final class AirQualityServiceStub extends io.grpc.stub.AbstractStub<AirQualityServiceStub> {
    private AirQualityServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirQualityServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirQualityServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirQualityServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAirQualityData(ds.airquality.AirQualityRequest request,
        io.grpc.stub.StreamObserver<ds.airquality.AirQualityResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAirQualityDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setAirQualityThreshold(ds.airquality.AirQualityThresholdRequest request,
        io.grpc.stub.StreamObserver<ds.airquality.AirQualityThresholdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetAirQualityThresholdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void monitorAirQuality(ds.airquality.AirQualityMonitoringRequest request,
        io.grpc.stub.StreamObserver<ds.airquality.AirQualityMonitoringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMonitorAirQualityMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AirQualityServiceBlockingStub extends io.grpc.stub.AbstractStub<AirQualityServiceBlockingStub> {
    private AirQualityServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirQualityServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirQualityServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirQualityServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ds.airquality.AirQualityResponse getAirQualityData(ds.airquality.AirQualityRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAirQualityDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public ds.airquality.AirQualityThresholdResponse setAirQualityThreshold(ds.airquality.AirQualityThresholdRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetAirQualityThresholdMethod(), getCallOptions(), request);
    }

    /**
     */
    public ds.airquality.AirQualityMonitoringResponse monitorAirQuality(ds.airquality.AirQualityMonitoringRequest request) {
      return blockingUnaryCall(
          getChannel(), getMonitorAirQualityMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AirQualityServiceFutureStub extends io.grpc.stub.AbstractStub<AirQualityServiceFutureStub> {
    private AirQualityServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirQualityServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirQualityServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirQualityServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.airquality.AirQualityResponse> getAirQualityData(
        ds.airquality.AirQualityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAirQualityDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.airquality.AirQualityThresholdResponse> setAirQualityThreshold(
        ds.airquality.AirQualityThresholdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetAirQualityThresholdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.airquality.AirQualityMonitoringResponse> monitorAirQuality(
        ds.airquality.AirQualityMonitoringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMonitorAirQualityMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AIR_QUALITY_DATA = 0;
  private static final int METHODID_SET_AIR_QUALITY_THRESHOLD = 1;
  private static final int METHODID_MONITOR_AIR_QUALITY = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AirQualityServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AirQualityServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AIR_QUALITY_DATA:
          serviceImpl.getAirQualityData((ds.airquality.AirQualityRequest) request,
              (io.grpc.stub.StreamObserver<ds.airquality.AirQualityResponse>) responseObserver);
          break;
        case METHODID_SET_AIR_QUALITY_THRESHOLD:
          serviceImpl.setAirQualityThreshold((ds.airquality.AirQualityThresholdRequest) request,
              (io.grpc.stub.StreamObserver<ds.airquality.AirQualityThresholdResponse>) responseObserver);
          break;
        case METHODID_MONITOR_AIR_QUALITY:
          serviceImpl.monitorAirQuality((ds.airquality.AirQualityMonitoringRequest) request,
              (io.grpc.stub.StreamObserver<ds.airquality.AirQualityMonitoringResponse>) responseObserver);
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

  private static abstract class AirQualityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AirQualityServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.airquality.AirQualityProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AirQualityService");
    }
  }

  private static final class AirQualityServiceFileDescriptorSupplier
      extends AirQualityServiceBaseDescriptorSupplier {
    AirQualityServiceFileDescriptorSupplier() {}
  }

  private static final class AirQualityServiceMethodDescriptorSupplier
      extends AirQualityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AirQualityServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AirQualityServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AirQualityServiceFileDescriptorSupplier())
              .addMethod(getGetAirQualityDataMethod())
              .addMethod(getSetAirQualityThresholdMethod())
              .addMethod(getMonitorAirQualityMethod())
              .build();
        }
      }
    }
    return result;
  }
}
