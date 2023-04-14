package ds.waterquality;

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
    comments = "Source: waterquality.proto")
public final class WaterQualityServiceGrpc {

  private WaterQualityServiceGrpc() {}

  public static final String SERVICE_NAME = "waterquality.WaterQualityService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.waterquality.WaterQualityRequest,
      ds.waterquality.WaterQualityResponse> getGetWaterQualityDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWaterQualityData",
      requestType = ds.waterquality.WaterQualityRequest.class,
      responseType = ds.waterquality.WaterQualityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.waterquality.WaterQualityRequest,
      ds.waterquality.WaterQualityResponse> getGetWaterQualityDataMethod() {
    io.grpc.MethodDescriptor<ds.waterquality.WaterQualityRequest, ds.waterquality.WaterQualityResponse> getGetWaterQualityDataMethod;
    if ((getGetWaterQualityDataMethod = WaterQualityServiceGrpc.getGetWaterQualityDataMethod) == null) {
      synchronized (WaterQualityServiceGrpc.class) {
        if ((getGetWaterQualityDataMethod = WaterQualityServiceGrpc.getGetWaterQualityDataMethod) == null) {
          WaterQualityServiceGrpc.getGetWaterQualityDataMethod = getGetWaterQualityDataMethod = 
              io.grpc.MethodDescriptor.<ds.waterquality.WaterQualityRequest, ds.waterquality.WaterQualityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "waterquality.WaterQualityService", "GetWaterQualityData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.waterquality.WaterQualityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.waterquality.WaterQualityResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WaterQualityServiceMethodDescriptorSupplier("GetWaterQualityData"))
                  .build();
          }
        }
     }
     return getGetWaterQualityDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.waterquality.WaterQualityThresholdRequest,
      ds.waterquality.WaterQualityThresholdResponse> getSetWaterQualityThresholdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetWaterQualityThreshold",
      requestType = ds.waterquality.WaterQualityThresholdRequest.class,
      responseType = ds.waterquality.WaterQualityThresholdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.waterquality.WaterQualityThresholdRequest,
      ds.waterquality.WaterQualityThresholdResponse> getSetWaterQualityThresholdMethod() {
    io.grpc.MethodDescriptor<ds.waterquality.WaterQualityThresholdRequest, ds.waterquality.WaterQualityThresholdResponse> getSetWaterQualityThresholdMethod;
    if ((getSetWaterQualityThresholdMethod = WaterQualityServiceGrpc.getSetWaterQualityThresholdMethod) == null) {
      synchronized (WaterQualityServiceGrpc.class) {
        if ((getSetWaterQualityThresholdMethod = WaterQualityServiceGrpc.getSetWaterQualityThresholdMethod) == null) {
          WaterQualityServiceGrpc.getSetWaterQualityThresholdMethod = getSetWaterQualityThresholdMethod = 
              io.grpc.MethodDescriptor.<ds.waterquality.WaterQualityThresholdRequest, ds.waterquality.WaterQualityThresholdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "waterquality.WaterQualityService", "SetWaterQualityThreshold"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.waterquality.WaterQualityThresholdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.waterquality.WaterQualityThresholdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WaterQualityServiceMethodDescriptorSupplier("SetWaterQualityThreshold"))
                  .build();
          }
        }
     }
     return getSetWaterQualityThresholdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.waterquality.WaterQualityStreamingRequest,
      ds.waterquality.WaterQualityStreamingResponse> getStreamWaterQualityDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamWaterQualityData",
      requestType = ds.waterquality.WaterQualityStreamingRequest.class,
      responseType = ds.waterquality.WaterQualityStreamingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ds.waterquality.WaterQualityStreamingRequest,
      ds.waterquality.WaterQualityStreamingResponse> getStreamWaterQualityDataMethod() {
    io.grpc.MethodDescriptor<ds.waterquality.WaterQualityStreamingRequest, ds.waterquality.WaterQualityStreamingResponse> getStreamWaterQualityDataMethod;
    if ((getStreamWaterQualityDataMethod = WaterQualityServiceGrpc.getStreamWaterQualityDataMethod) == null) {
      synchronized (WaterQualityServiceGrpc.class) {
        if ((getStreamWaterQualityDataMethod = WaterQualityServiceGrpc.getStreamWaterQualityDataMethod) == null) {
          WaterQualityServiceGrpc.getStreamWaterQualityDataMethod = getStreamWaterQualityDataMethod = 
              io.grpc.MethodDescriptor.<ds.waterquality.WaterQualityStreamingRequest, ds.waterquality.WaterQualityStreamingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "waterquality.WaterQualityService", "StreamWaterQualityData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.waterquality.WaterQualityStreamingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.waterquality.WaterQualityStreamingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WaterQualityServiceMethodDescriptorSupplier("StreamWaterQualityData"))
                  .build();
          }
        }
     }
     return getStreamWaterQualityDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WaterQualityServiceStub newStub(io.grpc.Channel channel) {
    return new WaterQualityServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WaterQualityServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WaterQualityServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WaterQualityServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WaterQualityServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class WaterQualityServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getWaterQualityData(ds.waterquality.WaterQualityRequest request,
        io.grpc.stub.StreamObserver<ds.waterquality.WaterQualityResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetWaterQualityDataMethod(), responseObserver);
    }

    /**
     */
    public void setWaterQualityThreshold(ds.waterquality.WaterQualityThresholdRequest request,
        io.grpc.stub.StreamObserver<ds.waterquality.WaterQualityThresholdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetWaterQualityThresholdMethod(), responseObserver);
    }

    /**
     */
    public void streamWaterQualityData(ds.waterquality.WaterQualityStreamingRequest request,
        io.grpc.stub.StreamObserver<ds.waterquality.WaterQualityStreamingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStreamWaterQualityDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetWaterQualityDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.waterquality.WaterQualityRequest,
                ds.waterquality.WaterQualityResponse>(
                  this, METHODID_GET_WATER_QUALITY_DATA)))
          .addMethod(
            getSetWaterQualityThresholdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.waterquality.WaterQualityThresholdRequest,
                ds.waterquality.WaterQualityThresholdResponse>(
                  this, METHODID_SET_WATER_QUALITY_THRESHOLD)))
          .addMethod(
            getStreamWaterQualityDataMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ds.waterquality.WaterQualityStreamingRequest,
                ds.waterquality.WaterQualityStreamingResponse>(
                  this, METHODID_STREAM_WATER_QUALITY_DATA)))
          .build();
    }
  }

  /**
   */
  public static final class WaterQualityServiceStub extends io.grpc.stub.AbstractStub<WaterQualityServiceStub> {
    private WaterQualityServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WaterQualityServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WaterQualityServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WaterQualityServiceStub(channel, callOptions);
    }

    /**
     */
    public void getWaterQualityData(ds.waterquality.WaterQualityRequest request,
        io.grpc.stub.StreamObserver<ds.waterquality.WaterQualityResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetWaterQualityDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setWaterQualityThreshold(ds.waterquality.WaterQualityThresholdRequest request,
        io.grpc.stub.StreamObserver<ds.waterquality.WaterQualityThresholdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetWaterQualityThresholdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void streamWaterQualityData(ds.waterquality.WaterQualityStreamingRequest request,
        io.grpc.stub.StreamObserver<ds.waterquality.WaterQualityStreamingResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getStreamWaterQualityDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WaterQualityServiceBlockingStub extends io.grpc.stub.AbstractStub<WaterQualityServiceBlockingStub> {
    private WaterQualityServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WaterQualityServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WaterQualityServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WaterQualityServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ds.waterquality.WaterQualityResponse getWaterQualityData(ds.waterquality.WaterQualityRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetWaterQualityDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public ds.waterquality.WaterQualityThresholdResponse setWaterQualityThreshold(ds.waterquality.WaterQualityThresholdRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetWaterQualityThresholdMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<ds.waterquality.WaterQualityStreamingResponse> streamWaterQualityData(
        ds.waterquality.WaterQualityStreamingRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getStreamWaterQualityDataMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WaterQualityServiceFutureStub extends io.grpc.stub.AbstractStub<WaterQualityServiceFutureStub> {
    private WaterQualityServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WaterQualityServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WaterQualityServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WaterQualityServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.waterquality.WaterQualityResponse> getWaterQualityData(
        ds.waterquality.WaterQualityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetWaterQualityDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.waterquality.WaterQualityThresholdResponse> setWaterQualityThreshold(
        ds.waterquality.WaterQualityThresholdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetWaterQualityThresholdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_WATER_QUALITY_DATA = 0;
  private static final int METHODID_SET_WATER_QUALITY_THRESHOLD = 1;
  private static final int METHODID_STREAM_WATER_QUALITY_DATA = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WaterQualityServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WaterQualityServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_WATER_QUALITY_DATA:
          serviceImpl.getWaterQualityData((ds.waterquality.WaterQualityRequest) request,
              (io.grpc.stub.StreamObserver<ds.waterquality.WaterQualityResponse>) responseObserver);
          break;
        case METHODID_SET_WATER_QUALITY_THRESHOLD:
          serviceImpl.setWaterQualityThreshold((ds.waterquality.WaterQualityThresholdRequest) request,
              (io.grpc.stub.StreamObserver<ds.waterquality.WaterQualityThresholdResponse>) responseObserver);
          break;
        case METHODID_STREAM_WATER_QUALITY_DATA:
          serviceImpl.streamWaterQualityData((ds.waterquality.WaterQualityStreamingRequest) request,
              (io.grpc.stub.StreamObserver<ds.waterquality.WaterQualityStreamingResponse>) responseObserver);
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

  private static abstract class WaterQualityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WaterQualityServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.waterquality.WaterQualityProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WaterQualityService");
    }
  }

  private static final class WaterQualityServiceFileDescriptorSupplier
      extends WaterQualityServiceBaseDescriptorSupplier {
    WaterQualityServiceFileDescriptorSupplier() {}
  }

  private static final class WaterQualityServiceMethodDescriptorSupplier
      extends WaterQualityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WaterQualityServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (WaterQualityServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WaterQualityServiceFileDescriptorSupplier())
              .addMethod(getGetWaterQualityDataMethod())
              .addMethod(getSetWaterQualityThresholdMethod())
              .addMethod(getStreamWaterQualityDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
