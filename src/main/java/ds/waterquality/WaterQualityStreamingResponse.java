// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: waterquality.proto

package ds.waterquality;

/**
 * Protobuf type {@code waterquality.WaterQualityStreamingResponse}
 */
public  final class WaterQualityStreamingResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:waterquality.WaterQualityStreamingResponse)
    WaterQualityStreamingResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WaterQualityStreamingResponse.newBuilder() to construct.
  private WaterQualityStreamingResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WaterQualityStreamingResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WaterQualityStreamingResponse(
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
            ds.waterquality.WaterQuality.Builder subBuilder = null;
            if (data_ != null) {
              subBuilder = data_.toBuilder();
            }
            data_ = input.readMessage(ds.waterquality.WaterQuality.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(data_);
              data_ = subBuilder.buildPartial();
            }

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
    return ds.waterquality.WaterQualityProto.internal_static_waterquality_WaterQualityStreamingResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ds.waterquality.WaterQualityProto.internal_static_waterquality_WaterQualityStreamingResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ds.waterquality.WaterQualityStreamingResponse.class, ds.waterquality.WaterQualityStreamingResponse.Builder.class);
  }

  public static final int DATA_FIELD_NUMBER = 1;
  private ds.waterquality.WaterQuality data_;
  /**
   * <code>.waterquality.WaterQuality data = 1;</code>
   */
  public boolean hasData() {
    return data_ != null;
  }
  /**
   * <code>.waterquality.WaterQuality data = 1;</code>
   */
  public ds.waterquality.WaterQuality getData() {
    return data_ == null ? ds.waterquality.WaterQuality.getDefaultInstance() : data_;
  }
  /**
   * <code>.waterquality.WaterQuality data = 1;</code>
   */
  public ds.waterquality.WaterQualityOrBuilder getDataOrBuilder() {
    return getData();
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
    if (data_ != null) {
      output.writeMessage(1, getData());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (data_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getData());
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
    if (!(obj instanceof ds.waterquality.WaterQualityStreamingResponse)) {
      return super.equals(obj);
    }
    ds.waterquality.WaterQualityStreamingResponse other = (ds.waterquality.WaterQualityStreamingResponse) obj;

    boolean result = true;
    result = result && (hasData() == other.hasData());
    if (hasData()) {
      result = result && getData()
          .equals(other.getData());
    }
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
    if (hasData()) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ds.waterquality.WaterQualityStreamingResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.waterquality.WaterQualityStreamingResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.waterquality.WaterQualityStreamingResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.waterquality.WaterQualityStreamingResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.waterquality.WaterQualityStreamingResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.waterquality.WaterQualityStreamingResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.waterquality.WaterQualityStreamingResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.waterquality.WaterQualityStreamingResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.waterquality.WaterQualityStreamingResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ds.waterquality.WaterQualityStreamingResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.waterquality.WaterQualityStreamingResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.waterquality.WaterQualityStreamingResponse parseFrom(
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
  public static Builder newBuilder(ds.waterquality.WaterQualityStreamingResponse prototype) {
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
   * Protobuf type {@code waterquality.WaterQualityStreamingResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:waterquality.WaterQualityStreamingResponse)
      ds.waterquality.WaterQualityStreamingResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ds.waterquality.WaterQualityProto.internal_static_waterquality_WaterQualityStreamingResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ds.waterquality.WaterQualityProto.internal_static_waterquality_WaterQualityStreamingResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ds.waterquality.WaterQualityStreamingResponse.class, ds.waterquality.WaterQualityStreamingResponse.Builder.class);
    }

    // Construct using ds.waterquality.WaterQualityStreamingResponse.newBuilder()
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
      if (dataBuilder_ == null) {
        data_ = null;
      } else {
        data_ = null;
        dataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ds.waterquality.WaterQualityProto.internal_static_waterquality_WaterQualityStreamingResponse_descriptor;
    }

    @java.lang.Override
    public ds.waterquality.WaterQualityStreamingResponse getDefaultInstanceForType() {
      return ds.waterquality.WaterQualityStreamingResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ds.waterquality.WaterQualityStreamingResponse build() {
      ds.waterquality.WaterQualityStreamingResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ds.waterquality.WaterQualityStreamingResponse buildPartial() {
      ds.waterquality.WaterQualityStreamingResponse result = new ds.waterquality.WaterQualityStreamingResponse(this);
      if (dataBuilder_ == null) {
        result.data_ = data_;
      } else {
        result.data_ = dataBuilder_.build();
      }
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
      if (other instanceof ds.waterquality.WaterQualityStreamingResponse) {
        return mergeFrom((ds.waterquality.WaterQualityStreamingResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ds.waterquality.WaterQualityStreamingResponse other) {
      if (other == ds.waterquality.WaterQualityStreamingResponse.getDefaultInstance()) return this;
      if (other.hasData()) {
        mergeData(other.getData());
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
      ds.waterquality.WaterQualityStreamingResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ds.waterquality.WaterQualityStreamingResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private ds.waterquality.WaterQuality data_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        ds.waterquality.WaterQuality, ds.waterquality.WaterQuality.Builder, ds.waterquality.WaterQualityOrBuilder> dataBuilder_;
    /**
     * <code>.waterquality.WaterQuality data = 1;</code>
     */
    public boolean hasData() {
      return dataBuilder_ != null || data_ != null;
    }
    /**
     * <code>.waterquality.WaterQuality data = 1;</code>
     */
    public ds.waterquality.WaterQuality getData() {
      if (dataBuilder_ == null) {
        return data_ == null ? ds.waterquality.WaterQuality.getDefaultInstance() : data_;
      } else {
        return dataBuilder_.getMessage();
      }
    }
    /**
     * <code>.waterquality.WaterQuality data = 1;</code>
     */
    public Builder setData(ds.waterquality.WaterQuality value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        data_ = value;
        onChanged();
      } else {
        dataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.waterquality.WaterQuality data = 1;</code>
     */
    public Builder setData(
        ds.waterquality.WaterQuality.Builder builderForValue) {
      if (dataBuilder_ == null) {
        data_ = builderForValue.build();
        onChanged();
      } else {
        dataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.waterquality.WaterQuality data = 1;</code>
     */
    public Builder mergeData(ds.waterquality.WaterQuality value) {
      if (dataBuilder_ == null) {
        if (data_ != null) {
          data_ =
            ds.waterquality.WaterQuality.newBuilder(data_).mergeFrom(value).buildPartial();
        } else {
          data_ = value;
        }
        onChanged();
      } else {
        dataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.waterquality.WaterQuality data = 1;</code>
     */
    public Builder clearData() {
      if (dataBuilder_ == null) {
        data_ = null;
        onChanged();
      } else {
        data_ = null;
        dataBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.waterquality.WaterQuality data = 1;</code>
     */
    public ds.waterquality.WaterQuality.Builder getDataBuilder() {
      
      onChanged();
      return getDataFieldBuilder().getBuilder();
    }
    /**
     * <code>.waterquality.WaterQuality data = 1;</code>
     */
    public ds.waterquality.WaterQualityOrBuilder getDataOrBuilder() {
      if (dataBuilder_ != null) {
        return dataBuilder_.getMessageOrBuilder();
      } else {
        return data_ == null ?
            ds.waterquality.WaterQuality.getDefaultInstance() : data_;
      }
    }
    /**
     * <code>.waterquality.WaterQuality data = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ds.waterquality.WaterQuality, ds.waterquality.WaterQuality.Builder, ds.waterquality.WaterQualityOrBuilder> 
        getDataFieldBuilder() {
      if (dataBuilder_ == null) {
        dataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ds.waterquality.WaterQuality, ds.waterquality.WaterQuality.Builder, ds.waterquality.WaterQualityOrBuilder>(
                getData(),
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      return dataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:waterquality.WaterQualityStreamingResponse)
  }

  // @@protoc_insertion_point(class_scope:waterquality.WaterQualityStreamingResponse)
  private static final ds.waterquality.WaterQualityStreamingResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ds.waterquality.WaterQualityStreamingResponse();
  }

  public static ds.waterquality.WaterQualityStreamingResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WaterQualityStreamingResponse>
      PARSER = new com.google.protobuf.AbstractParser<WaterQualityStreamingResponse>() {
    @java.lang.Override
    public WaterQualityStreamingResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WaterQualityStreamingResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WaterQualityStreamingResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WaterQualityStreamingResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ds.waterquality.WaterQualityStreamingResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

