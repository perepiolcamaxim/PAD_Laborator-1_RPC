package com.utm.broker.services;

import com.utm.broker.Connection;
import com.utm.broker.ConnectionStorage;
import com.utm.common.rcp.subscriber.SubscribeRequest;
import com.utm.common.rcp.subscriber.SubscribeResponse;
import com.utm.common.rcp.subscriber.SubscriberGrpc;
import io.grpc.stub.StreamObserver;

public class ReceiverService extends SubscriberGrpc.SubscriberImplBase {

    @Override
    public void subscribe(SubscribeRequest request, StreamObserver<SubscribeResponse> responseObserver) {
        Connection connection = new Connection(request.getAddress(), request.getTopic());
        ConnectionStorage.add(connection);
        System.out.println("New client subscriber: " + request.getAddress() + request.getTopic());
        SubscribeResponse.Builder response = SubscribeResponse.newBuilder();
        response.setIsSuccess(true);
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
