// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: waterquality.proto

package ds.waterquality;

public interface WaterQualityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:waterquality.WaterQuality)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string location = 1;</code>
   */
  java.lang.String getLocation();
  /**
   * <code>string location = 1;</code>
   */
  com.google.protobuf.ByteString
      getLocationBytes();

  /**
   * <code>string timestamp = 2;</code>
   */
  java.lang.String getTimestamp();
  /**
   * <code>string timestamp = 2;</code>
   */
  com.google.protobuf.ByteString
      getTimestampBytes();

  /**
   * <code>double ph = 3;</code>
   */
  double getPh();

  /**
   * <code>double temperature = 4;</code>
   */
  double getTemperature();

  /**
   * <code>double turbidity = 5;</code>
   */
  double getTurbidity();

  /**
   * <code>double dissolved_oxygen = 6;</code>
   */
  double getDissolvedOxygen();
}
