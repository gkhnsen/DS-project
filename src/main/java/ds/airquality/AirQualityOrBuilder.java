// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: airquality.proto

package ds.airquality;

public interface AirQualityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:airquality.AirQuality)
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
   * <code>double pm = 3;</code>
   */
  double getPm();

  /**
   * <code>double ozone = 4;</code>
   */
  double getOzone();

  /**
   * <code>double carbon_monoxide = 5;</code>
   */
  double getCarbonMonoxide();

  /**
   * <code>double sulfur_dioxide = 6;</code>
   */
  double getSulfurDioxide();
}