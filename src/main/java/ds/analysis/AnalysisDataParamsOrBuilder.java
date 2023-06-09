// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: analysis.proto

package ds.analysis;

public interface AnalysisDataParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:analysis.AnalysisDataParams)
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
   * <code>string time = 2;</code>
   */
  java.lang.String getTime();
  /**
   * <code>string time = 2;</code>
   */
  com.google.protobuf.ByteString
      getTimeBytes();

  /**
   * <code>map&lt;string, double&gt; analysisResult = 3;</code>
   */
  int getAnalysisResultCount();
  /**
   * <code>map&lt;string, double&gt; analysisResult = 3;</code>
   */
  boolean containsAnalysisResult(
      java.lang.String key);
  /**
   * Use {@link #getAnalysisResultMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Double>
  getAnalysisResult();
  /**
   * <code>map&lt;string, double&gt; analysisResult = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.Double>
  getAnalysisResultMap();
  /**
   * <code>map&lt;string, double&gt; analysisResult = 3;</code>
   */

  double getAnalysisResultOrDefault(
      java.lang.String key,
      double defaultValue);
  /**
   * <code>map&lt;string, double&gt; analysisResult = 3;</code>
   */

  double getAnalysisResultOrThrow(
      java.lang.String key);
}
