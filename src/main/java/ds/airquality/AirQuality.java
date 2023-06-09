// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: airquality.proto

package ds.airquality;

/**
 * Protobuf type {@code airquality.AirQuality}
 */
public  final class AirQuality extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:airquality.AirQuality)
    AirQualityOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AirQuality.newBuilder() to construct.
  private AirQuality(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AirQuality() {
    location_ = "";
    timestamp_ = "";
    pm_ = 0D;
    ozone_ = 0D;
    carbonMonoxide_ = 0D;
    sulfurDioxide_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AirQuality(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            location_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            timestamp_ = s;
            break;
          }
          case 25: {

            pm_ = input.readDouble();
            break;
          }
          case 33: {

            ozone_ = input.readDouble();
            break;
          }
          case 41: {

            carbonMonoxide_ = input.readDouble();
            break;
          }
          case 49: {

            sulfurDioxide_ = input.readDouble();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ds.airquality.AirQualityProto.internal_static_airquality_AirQuality_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ds.airquality.AirQualityProto.internal_static_airquality_AirQuality_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ds.airquality.AirQuality.class, ds.airquality.AirQuality.Builder.class);
  }

  public static final int LOCATION_FIELD_NUMBER = 1;
  private volatile java.lang.Object location_;
  /**
   * <code>string location = 1;</code>
   */
  public java.lang.String getLocation() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      location_ = s;
      return s;
    }
  }
  /**
   * <code>string location = 1;</code>
   */
  public com.google.protobuf.ByteString
      getLocationBytes() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      location_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 2;
  private volatile java.lang.Object timestamp_;
  /**
   * <code>string timestamp = 2;</code>
   */
  public java.lang.String getTimestamp() {
    java.lang.Object ref = timestamp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      timestamp_ = s;
      return s;
    }
  }
  /**
   * <code>string timestamp = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTimestampBytes() {
    java.lang.Object ref = timestamp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      timestamp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PM_FIELD_NUMBER = 3;
  private double pm_;
  /**
   * <code>double pm = 3;</code>
   */
  public double getPm() {
    return pm_;
  }

  public static final int OZONE_FIELD_NUMBER = 4;
  private double ozone_;
  /**
   * <code>double ozone = 4;</code>
   */
  public double getOzone() {
    return ozone_;
  }

  public static final int CARBON_MONOXIDE_FIELD_NUMBER = 5;
  private double carbonMonoxide_;
  /**
   * <code>double carbon_monoxide = 5;</code>
   */
  public double getCarbonMonoxide() {
    return carbonMonoxide_;
  }

  public static final int SULFUR_DIOXIDE_FIELD_NUMBER = 6;
  private double sulfurDioxide_;
  /**
   * <code>double sulfur_dioxide = 6;</code>
   */
  public double getSulfurDioxide() {
    return sulfurDioxide_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getLocationBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, location_);
    }
    if (!getTimestampBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, timestamp_);
    }
    if (pm_ != 0D) {
      output.writeDouble(3, pm_);
    }
    if (ozone_ != 0D) {
      output.writeDouble(4, ozone_);
    }
    if (carbonMonoxide_ != 0D) {
      output.writeDouble(5, carbonMonoxide_);
    }
    if (sulfurDioxide_ != 0D) {
      output.writeDouble(6, sulfurDioxide_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getLocationBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, location_);
    }
    if (!getTimestampBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, timestamp_);
    }
    if (pm_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, pm_);
    }
    if (ozone_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, ozone_);
    }
    if (carbonMonoxide_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, carbonMonoxide_);
    }
    if (sulfurDioxide_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, sulfurDioxide_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ds.airquality.AirQuality)) {
      return super.equals(obj);
    }
    ds.airquality.AirQuality other = (ds.airquality.AirQuality) obj;

    boolean result = true;
    result = result && getLocation()
        .equals(other.getLocation());
    result = result && getTimestamp()
        .equals(other.getTimestamp());
    result = result && (
        java.lang.Double.doubleToLongBits(getPm())
        == java.lang.Double.doubleToLongBits(
            other.getPm()));
    result = result && (
        java.lang.Double.doubleToLongBits(getOzone())
        == java.lang.Double.doubleToLongBits(
            other.getOzone()));
    result = result && (
        java.lang.Double.doubleToLongBits(getCarbonMonoxide())
        == java.lang.Double.doubleToLongBits(
            other.getCarbonMonoxide()));
    result = result && (
        java.lang.Double.doubleToLongBits(getSulfurDioxide())
        == java.lang.Double.doubleToLongBits(
            other.getSulfurDioxide()));
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation().hashCode();
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + getTimestamp().hashCode();
    hash = (37 * hash) + PM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPm()));
    hash = (37 * hash) + OZONE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getOzone()));
    hash = (37 * hash) + CARBON_MONOXIDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getCarbonMonoxide()));
    hash = (37 * hash) + SULFUR_DIOXIDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getSulfurDioxide()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ds.airquality.AirQuality parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.airquality.AirQuality parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.airquality.AirQuality parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.airquality.AirQuality parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.airquality.AirQuality parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.airquality.AirQuality parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.airquality.AirQuality parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.airquality.AirQuality parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.airquality.AirQuality parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ds.airquality.AirQuality parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.airquality.AirQuality parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.airquality.AirQuality parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ds.airquality.AirQuality prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code airquality.AirQuality}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:airquality.AirQuality)
      ds.airquality.AirQualityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ds.airquality.AirQualityProto.internal_static_airquality_AirQuality_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ds.airquality.AirQualityProto.internal_static_airquality_AirQuality_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ds.airquality.AirQuality.class, ds.airquality.AirQuality.Builder.class);
    }

    // Construct using ds.airquality.AirQuality.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      location_ = "";

      timestamp_ = "";

      pm_ = 0D;

      ozone_ = 0D;

      carbonMonoxide_ = 0D;

      sulfurDioxide_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ds.airquality.AirQualityProto.internal_static_airquality_AirQuality_descriptor;
    }

    @java.lang.Override
    public ds.airquality.AirQuality getDefaultInstanceForType() {
      return ds.airquality.AirQuality.getDefaultInstance();
    }

    @java.lang.Override
    public ds.airquality.AirQuality build() {
      ds.airquality.AirQuality result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ds.airquality.AirQuality buildPartial() {
      ds.airquality.AirQuality result = new ds.airquality.AirQuality(this);
      result.location_ = location_;
      result.timestamp_ = timestamp_;
      result.pm_ = pm_;
      result.ozone_ = ozone_;
      result.carbonMonoxide_ = carbonMonoxide_;
      result.sulfurDioxide_ = sulfurDioxide_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ds.airquality.AirQuality) {
        return mergeFrom((ds.airquality.AirQuality)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ds.airquality.AirQuality other) {
      if (other == ds.airquality.AirQuality.getDefaultInstance()) return this;
      if (!other.getLocation().isEmpty()) {
        location_ = other.location_;
        onChanged();
      }
      if (!other.getTimestamp().isEmpty()) {
        timestamp_ = other.timestamp_;
        onChanged();
      }
      if (other.getPm() != 0D) {
        setPm(other.getPm());
      }
      if (other.getOzone() != 0D) {
        setOzone(other.getOzone());
      }
      if (other.getCarbonMonoxide() != 0D) {
        setCarbonMonoxide(other.getCarbonMonoxide());
      }
      if (other.getSulfurDioxide() != 0D) {
        setSulfurDioxide(other.getSulfurDioxide());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ds.airquality.AirQuality parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ds.airquality.AirQuality) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object location_ = "";
    /**
     * <code>string location = 1;</code>
     */
    public java.lang.String getLocation() {
      java.lang.Object ref = location_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        location_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string location = 1;</code>
     */
    public com.google.protobuf.ByteString
        getLocationBytes() {
      java.lang.Object ref = location_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        location_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string location = 1;</code>
     */
    public Builder setLocation(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      location_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string location = 1;</code>
     */
    public Builder clearLocation() {
      
      location_ = getDefaultInstance().getLocation();
      onChanged();
      return this;
    }
    /**
     * <code>string location = 1;</code>
     */
    public Builder setLocationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      location_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object timestamp_ = "";
    /**
     * <code>string timestamp = 2;</code>
     */
    public java.lang.String getTimestamp() {
      java.lang.Object ref = timestamp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        timestamp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string timestamp = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTimestampBytes() {
      java.lang.Object ref = timestamp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        timestamp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string timestamp = 2;</code>
     */
    public Builder setTimestamp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string timestamp = 2;</code>
     */
    public Builder clearTimestamp() {
      
      timestamp_ = getDefaultInstance().getTimestamp();
      onChanged();
      return this;
    }
    /**
     * <code>string timestamp = 2;</code>
     */
    public Builder setTimestampBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      timestamp_ = value;
      onChanged();
      return this;
    }

    private double pm_ ;
    /**
     * <code>double pm = 3;</code>
     */
    public double getPm() {
      return pm_;
    }
    /**
     * <code>double pm = 3;</code>
     */
    public Builder setPm(double value) {
      
      pm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double pm = 3;</code>
     */
    public Builder clearPm() {
      
      pm_ = 0D;
      onChanged();
      return this;
    }

    private double ozone_ ;
    /**
     * <code>double ozone = 4;</code>
     */
    public double getOzone() {
      return ozone_;
    }
    /**
     * <code>double ozone = 4;</code>
     */
    public Builder setOzone(double value) {
      
      ozone_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double ozone = 4;</code>
     */
    public Builder clearOzone() {
      
      ozone_ = 0D;
      onChanged();
      return this;
    }

    private double carbonMonoxide_ ;
    /**
     * <code>double carbon_monoxide = 5;</code>
     */
    public double getCarbonMonoxide() {
      return carbonMonoxide_;
    }
    /**
     * <code>double carbon_monoxide = 5;</code>
     */
    public Builder setCarbonMonoxide(double value) {
      
      carbonMonoxide_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double carbon_monoxide = 5;</code>
     */
    public Builder clearCarbonMonoxide() {
      
      carbonMonoxide_ = 0D;
      onChanged();
      return this;
    }

    private double sulfurDioxide_ ;
    /**
     * <code>double sulfur_dioxide = 6;</code>
     */
    public double getSulfurDioxide() {
      return sulfurDioxide_;
    }
    /**
     * <code>double sulfur_dioxide = 6;</code>
     */
    public Builder setSulfurDioxide(double value) {
      
      sulfurDioxide_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double sulfur_dioxide = 6;</code>
     */
    public Builder clearSulfurDioxide() {
      
      sulfurDioxide_ = 0D;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:airquality.AirQuality)
  }

  // @@protoc_insertion_point(class_scope:airquality.AirQuality)
  private static final ds.airquality.AirQuality DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ds.airquality.AirQuality();
  }

  public static ds.airquality.AirQuality getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AirQuality>
      PARSER = new com.google.protobuf.AbstractParser<AirQuality>() {
    @java.lang.Override
    public AirQuality parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AirQuality(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AirQuality> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AirQuality> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ds.airquality.AirQuality getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

