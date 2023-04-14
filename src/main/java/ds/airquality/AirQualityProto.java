// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: airquality.proto

package ds.airquality;

public final class AirQualityProto {
  private AirQualityProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_airquality_AirQualityRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_airquality_AirQualityRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_airquality_AirQualityResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_airquality_AirQualityResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_airquality_AirQuality_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_airquality_AirQuality_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_airquality_AirQualityThresholdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_airquality_AirQualityThresholdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_airquality_AirQualityThresholdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_airquality_AirQualityThresholdResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_airquality_AirQualityMonitoringRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_airquality_AirQualityMonitoringRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_airquality_AirQualityMonitoringResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_airquality_AirQualityMonitoringResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020airquality.proto\022\nairquality\"K\n\021AirQua" +
      "lityRequest\022\020\n\010location\030\001 \001(\t\022\022\n\nstart_t" +
      "ime\030\002 \001(\t\022\020\n\010end_time\030\003 \001(\t\":\n\022AirQualit" +
      "yResponse\022$\n\004data\030\001 \003(\0132\026.airquality.Air" +
      "Quality\"}\n\nAirQuality\022\020\n\010location\030\001 \001(\t\022" +
      "\021\n\ttimestamp\030\002 \001(\t\022\n\n\002pm\030\003 \001(\001\022\r\n\005ozone\030" +
      "\004 \001(\001\022\027\n\017carbon_monoxide\030\005 \001(\001\022\026\n\016sulfur" +
      "_dioxide\030\006 \001(\001\"G\n\032AirQualityThresholdReq" +
      "uest\022\020\n\010location\030\001 \001(\t\022\027\n\017threshold_valu" +
      "e\030\002 \001(\005\".\n\033AirQualityThresholdResponse\022\017" +
      "\n\007message\030\001 \001(\t\"A\n\033AirQualityMonitoringR" +
      "equest\022\020\n\010location\030\001 \001(\t\022\020\n\010duration\030\002 \001" +
      "(\005\"D\n\034AirQualityMonitoringResponse\022$\n\004da" +
      "ta\030\001 \001(\0132\026.airquality.AirQuality2\300\002\n\021Air" +
      "QualityService\022T\n\021GetAirQualityData\022\035.ai" +
      "rquality.AirQualityRequest\032\036.airquality." +
      "AirQualityResponse\"\000\022k\n\026SetAirQualityThr" +
      "eshold\022&.airquality.AirQualityThresholdR" +
      "equest\032\'.airquality.AirQualityThresholdR" +
      "esponse\"\000\022h\n\021MonitorAirQuality\022\'.airqual" +
      "ity.AirQualityMonitoringRequest\032(.airqua" +
      "lity.AirQualityMonitoringResponse\"\000B\"\n\rd" +
      "s.airqualityB\017AirQualityProtoP\001b\006proto3"
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
    internal_static_airquality_AirQualityRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_airquality_AirQualityRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_airquality_AirQualityRequest_descriptor,
        new java.lang.String[] { "Location", "StartTime", "EndTime", });
    internal_static_airquality_AirQualityResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_airquality_AirQualityResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_airquality_AirQualityResponse_descriptor,
        new java.lang.String[] { "Data", });
    internal_static_airquality_AirQuality_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_airquality_AirQuality_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_airquality_AirQuality_descriptor,
        new java.lang.String[] { "Location", "Timestamp", "Pm", "Ozone", "CarbonMonoxide", "SulfurDioxide", });
    internal_static_airquality_AirQualityThresholdRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_airquality_AirQualityThresholdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_airquality_AirQualityThresholdRequest_descriptor,
        new java.lang.String[] { "Location", "ThresholdValue", });
    internal_static_airquality_AirQualityThresholdResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_airquality_AirQualityThresholdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_airquality_AirQualityThresholdResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_airquality_AirQualityMonitoringRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_airquality_AirQualityMonitoringRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_airquality_AirQualityMonitoringRequest_descriptor,
        new java.lang.String[] { "Location", "Duration", });
    internal_static_airquality_AirQualityMonitoringResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_airquality_AirQualityMonitoringResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_airquality_AirQualityMonitoringResponse_descriptor,
        new java.lang.String[] { "Data", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
