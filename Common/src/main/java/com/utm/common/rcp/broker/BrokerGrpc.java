package com.utm.common.rcp.broker;

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
    comments = "Source: BrokerProto.proto")
public final class BrokerGrpc {

  private BrokerGrpc() {}

  public static final String SERVICE_NAME = "com.utm.common.Broker";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.utm.common.rcp.broker.BrokerRequest,
      com.utm.common.rcp.broker.BrokerResponse> getHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "hello",
      requestType = com.utm.common.rcp.broker.BrokerRequest.class,
      responseType = com.utm.common.rcp.broker.BrokerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.utm.common.rcp.broker.BrokerRequest,
      com.utm.common.rcp.broker.BrokerResponse> getHelloMethod() {
    io.grpc.MethodDescriptor<com.utm.common.rcp.broker.BrokerRequest, com.utm.common.rcp.broker.BrokerResponse> getHelloMethod;
    if ((getHelloMethod = BrokerGrpc.getHelloMethod) == null) {
      synchronized (BrokerGrpc.class) {
        if ((getHelloMethod = BrokerGrpc.getHelloMethod) == null) {
          BrokerGrpc.getHelloMethod = getHelloMethod = 
              io.grpc.MethodDescriptor.<com.utm.common.rcp.broker.BrokerRequest, com.utm.common.rcp.broker.BrokerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.utm.common.Broker", "hello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.utm.common.rcp.broker.BrokerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.utm.common.rcp.broker.BrokerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BrokerMethodDescriptorSupplier("hello"))
                  .build();
          }
        }
     }
     return getHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BrokerStub newStub(io.grpc.Channel channel) {
    return new BrokerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BrokerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BrokerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BrokerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BrokerFutureStub(channel);
  }

  /**
   */
  public static abstract class BrokerImplBase implements io.grpc.BindableService {

    /**
     */
    public void hello(com.utm.common.rcp.broker.BrokerRequest request,
        io.grpc.stub.StreamObserver<com.utm.common.rcp.broker.BrokerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHelloMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.utm.common.rcp.broker.BrokerRequest,
                com.utm.common.rcp.broker.BrokerResponse>(
                  this, METHODID_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class BrokerStub extends io.grpc.stub.AbstractStub<BrokerStub> {
    private BrokerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BrokerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrokerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BrokerStub(channel, callOptions);
    }

    /**
     */
    public void hello(com.utm.common.rcp.broker.BrokerRequest request,
        io.grpc.stub.StreamObserver<com.utm.common.rcp.broker.BrokerResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BrokerBlockingStub extends io.grpc.stub.AbstractStub<BrokerBlockingStub> {
    private BrokerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BrokerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrokerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BrokerBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.utm.common.rcp.broker.BrokerResponse> hello(
        com.utm.common.rcp.broker.BrokerRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BrokerFutureStub extends io.grpc.stub.AbstractStub<BrokerFutureStub> {
    private BrokerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BrokerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrokerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BrokerFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BrokerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BrokerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HELLO:
          serviceImpl.hello((com.utm.common.rcp.broker.BrokerRequest) request,
              (io.grpc.stub.StreamObserver<com.utm.common.rcp.broker.BrokerResponse>) responseObserver);
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

  private static abstract class BrokerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BrokerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.utm.common.rcp.broker.BrokerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Broker");
    }
  }

  private static final class BrokerFileDescriptorSupplier
      extends BrokerBaseDescriptorSupplier {
    BrokerFileDescriptorSupplier() {}
  }

  private static final class BrokerMethodDescriptorSupplier
      extends BrokerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BrokerMethodDescriptorSupplier(String methodName) {
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
      synchronized (BrokerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BrokerFileDescriptorSupplier())
              .addMethod(getHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
