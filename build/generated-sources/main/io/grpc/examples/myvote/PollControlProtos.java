// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: myvote.proto

package io.grpc.examples.myvote;

public final class PollControlProtos {
  private PollControlProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_example_myvote_Poll_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_grpc_example_myvote_Poll_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014myvote.proto\022\023grpc.example.myvote\"\\\n\004P" +
      "oll\022\n\n\002id\030\001 \001(\003\022\020\n\010question\030\002 \001(\t\022\022\n\nsta" +
      "rted_at\030\003 \001(\t\022\022\n\nexpired_at\030\004 \001(\t\022\016\n\006cho" +
      "ice\030\005 \003(\t2E\n\005Polls\022<\n\004post\022\031.grpc.exampl" +
      "e.myvote.Poll\032\031.grpc.example.myvote.Poll" +
      "B.\n\027io.grpc.examples.myvoteB\021PollControl" +
      "ProtosP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_grpc_example_myvote_Poll_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grpc_example_myvote_Poll_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_grpc_example_myvote_Poll_descriptor,
        new java.lang.String[] { "Id", "Question", "StartedAt", "ExpiredAt", "Choice", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
