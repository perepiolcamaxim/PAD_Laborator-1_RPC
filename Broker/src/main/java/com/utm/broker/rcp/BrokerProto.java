// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BrokerProto.proto

package com.utm.broker.rcp;

public final class BrokerProto {
  private BrokerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_utm_broker_BrokerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_utm_broker_BrokerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_utm_broker_BrokerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_utm_broker_BrokerResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021BrokerProto.proto\022\016com.utm.broker\"/\n\rB" +
      "rokerRequest\022\r\n\005topic\030\001 \001(\t\022\017\n\007message\030\002" +
      " \001(\t\"\"\n\016BrokerResponse\022\020\n\010greeting\030\001 \001(\t" +
      "2W\n\rBrokerService\022F\n\005hello\022\035.com.utm.bro" +
      "ker.BrokerRequest\032\036.com.utm.broker.Broke" +
      "rResponseB\026\n\022com.utm.broker.rcpP\001b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_utm_broker_BrokerRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_utm_broker_BrokerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_utm_broker_BrokerRequest_descriptor,
        new java.lang.String[] { "Topic", "Message", });
    internal_static_com_utm_broker_BrokerResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_utm_broker_BrokerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_utm_broker_BrokerResponse_descriptor,
        new java.lang.String[] { "Greeting", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
