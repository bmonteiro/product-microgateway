// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/api/api.proto

package org.wso2.gateway.discovery.api;

public final class ApiProto {
  private ApiProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wso2_discovery_api_Api_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wso2_discovery_api_Api_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034wso2/discovery/api/api.proto\022\022wso2.dis" +
      "covery.api\032!wso2/discovery/api/Endpoint." +
      "proto\032!wso2/discovery/api/Resource.proto" +
      "\032*wso2/discovery/api/endpoint_security.p" +
      "roto\"\250\003\n\003Api\022\n\n\002id\030\001 \001(\t\022\r\n\005title\030\002 \001(\t\022" +
      "\017\n\007version\030\003 \001(\t\022\026\n\016swaggerVersion\030\004 \001(\t" +
      "\022\023\n\013description\030\005 \001(\t\0224\n\016productionUrls\030" +
      "\006 \003(\0132\034.wso2.discovery.api.Endpoint\0221\n\013s" +
      "andboxUrls\030\007 \003(\0132\034.wso2.discovery.api.En" +
      "dpoint\022/\n\tresources\030\010 \003(\0132\034.wso2.discove" +
      "ry.api.Resource\022\020\n\010basePath\030\t \001(\t\022\014\n\004tie" +
      "r\030\n \001(\t\022\031\n\021apiLifeCycleState\030\013 \001(\t\022\026\n\016se" +
      "curityScheme\030\014 \003(\t\022>\n\020endpointSecurity\030\r" +
      " \001(\0132$.wso2.discovery.api.EndpointSecuri" +
      "ty\022\033\n\023authorizationHeader\030\016 \001(\tBk\n\036org.w" +
      "so2.gateway.discovery.apiB\010ApiProtoP\001Z=g" +
      "ithub.com/envoyproxy/go-control-plane/ws" +
      "o2/discovery/api;apib\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.wso2.gateway.discovery.api.EndpointProto.getDescriptor(),
          org.wso2.gateway.discovery.api.ResourceProto.getDescriptor(),
          org.wso2.gateway.discovery.api.EndpointSecurityProto.getDescriptor(),
        });
    internal_static_wso2_discovery_api_Api_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_wso2_discovery_api_Api_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wso2_discovery_api_Api_descriptor,
        new java.lang.String[] { "Id", "Title", "Version", "SwaggerVersion", "Description", "ProductionUrls", "SandboxUrls", "Resources", "BasePath", "Tier", "ApiLifeCycleState", "SecurityScheme", "EndpointSecurity", "AuthorizationHeader", });
    org.wso2.gateway.discovery.api.EndpointProto.getDescriptor();
    org.wso2.gateway.discovery.api.ResourceProto.getDescriptor();
    org.wso2.gateway.discovery.api.EndpointSecurityProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
