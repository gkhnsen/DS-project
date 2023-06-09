// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: analysis.proto

package ds.analysis;

/**
 * Protobuf type {@code analysis.AnalysisParametersResponse}
 */
public  final class AnalysisParametersResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:analysis.AnalysisParametersResponse)
    AnalysisParametersResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AnalysisParametersResponse.newBuilder() to construct.
  private AnalysisParametersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AnalysisParametersResponse() {
    analysisResult_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AnalysisParametersResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              analysisResult_ = new java.util.ArrayList<ds.analysis.AnalysisDataParams>();
              mutable_bitField0_ |= 0x00000001;
            }
            analysisResult_.add(
                input.readMessage(ds.analysis.AnalysisDataParams.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        analysisResult_ = java.util.Collections.unmodifiableList(analysisResult_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ds.analysis.AnalysisProto.internal_static_analysis_AnalysisParametersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ds.analysis.AnalysisProto.internal_static_analysis_AnalysisParametersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ds.analysis.AnalysisParametersResponse.class, ds.analysis.AnalysisParametersResponse.Builder.class);
  }

  public static final int ANALYSISRESULT_FIELD_NUMBER = 1;
  private java.util.List<ds.analysis.AnalysisDataParams> analysisResult_;
  /**
   * <code>repeated .analysis.AnalysisDataParams analysisResult = 1;</code>
   */
  public java.util.List<ds.analysis.AnalysisDataParams> getAnalysisResultList() {
    return analysisResult_;
  }
  /**
   * <code>repeated .analysis.AnalysisDataParams analysisResult = 1;</code>
   */
  public java.util.List<? extends ds.analysis.AnalysisDataParamsOrBuilder> 
      getAnalysisResultOrBuilderList() {
    return analysisResult_;
  }
  /**
   * <code>repeated .analysis.AnalysisDataParams analysisResult = 1;</code>
   */
  public int getAnalysisResultCount() {
    return analysisResult_.size();
  }
  /**
   * <code>repeated .analysis.AnalysisDataParams analysisResult = 1;</code>
   */
  public ds.analysis.AnalysisDataParams getAnalysisResult(int index) {
    return analysisResult_.get(index);
  }
  /**
   * <code>repeated .analysis.AnalysisDataParams analysisResult = 1;</code>
   */
  public ds.analysis.AnalysisDataParamsOrBuilder getAnalysisResultOrBuilder(
      int index) {
    return analysisResult_.get(index);
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
    for (int i = 0; i < analysisResult_.size(); i++) {
      output.writeMessage(1, analysisResult_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < analysisResult_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, analysisResult_.get(i));
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
    if (!(obj instanceof ds.analysis.AnalysisParametersResponse)) {
      return super.equals(obj);
    }
    ds.analysis.AnalysisParametersResponse other = (ds.analysis.AnalysisParametersResponse) obj;

    boolean result = true;
    result = result && getAnalysisResultList()
        .equals(other.getAnalysisResultList());
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
    if (getAnalysisResultCount() > 0) {
      hash = (37 * hash) + ANALYSISRESULT_FIELD_NUMBER;
      hash = (53 * hash) + getAnalysisResultList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ds.analysis.AnalysisParametersResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.analysis.AnalysisParametersResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.analysis.AnalysisParametersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.analysis.AnalysisParametersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.analysis.AnalysisParametersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.analysis.AnalysisParametersResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.analysis.AnalysisParametersResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.analysis.AnalysisParametersResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.analysis.AnalysisParametersResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ds.analysis.AnalysisParametersResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.analysis.AnalysisParametersResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.analysis.AnalysisParametersResponse parseFrom(
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
  public static Builder newBuilder(ds.analysis.AnalysisParametersResponse prototype) {
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
   * Protobuf type {@code analysis.AnalysisParametersResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:analysis.AnalysisParametersResponse)
      ds.analysis.AnalysisParametersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ds.analysis.AnalysisProto.internal_static_analysis_AnalysisParametersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ds.analysis.AnalysisProto.internal_static_analysis_AnalysisParametersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ds.analysis.AnalysisParametersResponse.class, ds.analysis.AnalysisParametersResponse.Builder.class);
    }

    // Construct using ds.analysis.AnalysisParametersResponse.newBuilder()
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
        getAnalysisResultFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (analysisResultBuilder_ == null) {
        analysisResult_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        analysisResultBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ds.analysis.AnalysisProto.internal_static_analysis_AnalysisParametersResponse_descriptor;
    }

    @java.lang.Override
    public ds.analysis.AnalysisParametersResponse getDefaultInstanceForType() {
      return ds.analysis.AnalysisParametersResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ds.analysis.AnalysisParametersResponse build() {
      ds.analysis.AnalysisParametersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ds.analysis.AnalysisParametersResponse buildPartial() {
      ds.analysis.AnalysisParametersResponse result = new ds.analysis.AnalysisParametersResponse(this);
      int from_bitField0_ = bitField0_;
      if (analysisResultBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          analysisResult_ = java.util.Collections.unmodifiableList(analysisResult_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.analysisResult_ = analysisResult_;
      } else {
        result.analysisResult_ = analysisResultBuilder_.build();
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
      if (other instanceof ds.analysis.AnalysisParametersResponse) {
        return mergeFrom((ds.analysis.AnalysisParametersResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ds.analysis.AnalysisParametersResponse other) {
      if (other == ds.analysis.AnalysisParametersResponse.getDefaultInstance()) return this;
      if (analysisResultBuilder_ == null) {
        if (!other.analysisResult_.isEmpty()) {
          if (analysisResult_.isEmpty()) {
            analysisResult_ = other.analysisResult_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAnalysisResultIsMutable();
            analysisResult_.addAll(other.analysisResult_);
          }
          onChanged();
        }
      } else {
        if (!other.analysisResult_.isEmpty()) {
          if (analysisResultBuilder_.isEmpty()) {
            analysisResultBuilder_.dispose();
            analysisResultBuilder_ = null;
            analysisResult_ = other.analysisResult_;
            bitField0_ = (bitField0_ & ~0x00000001);
            analysisResultBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAnalysisResultFieldBuilder() : null;
          } else {
            analysisResultBuilder_.addAllMessages(other.analysisResult_);
          }
        }
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
      ds.analysis.AnalysisParametersResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ds.analysis.AnalysisParametersResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<ds.analysis.AnalysisDataParams> analysisResult_ =
      java.util.Collections.emptyList();
    private void ensureAnalysisResultIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        analysisResult_ = new java.util.ArrayList<ds.analysis.AnalysisDataParams>(analysisResult_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        ds.analysis.AnalysisDataParams, ds.analysis.AnalysisDataParams.Builder, ds.analysis.AnalysisDataParamsOrBuilder> analysisResultBuilder_;

    /**
     * <code>repeated .analysis.AnalysisDataParams analysisResult = 1;</code>
     */
    public java.util.List<ds.analysis.AnalysisDataParams> getAnalysisResultList() {
      if (analysisResultBuilder_ == null) {
        return java.util.Collections.unmodifiableList(analysisResult_);
      } else {
        return analysisResultBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .analysis.AnalysisDataParams analysisResult = 1;</code>
     */
    public int getAnalysisResultCount() {
      if (analysisResultBuilder_ == null) {
        return analysisResult_.size();
      } else {
        return analysisResultBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .analysis.AnalysisDataParams analysisResult = 1;</code>
     */
    public ds.analysis.AnalysisDataParams getAnalysisResult(int index) {
      if (analysisResultBuilder_ == null) {
        return analysisResult_.get(index);
      } else {
        return analysisResultBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .analysis.AnalysisDataParams analysisResult = 1;</code>
     */
    public Builder setAnalysisResult(
        int index, ds.analysis.AnalysisDataParams value) {
      if (analysisResultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnalysisResultIsMutable();
        analysisResult_.set(index, value);
        onChanged();
      } else {
        analysisResultBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .analysis.AnalysisDataParams analysisResult = 1;</code>
     */
    public Builder setAnalysisResult(
        int index, ds.analysis.AnalysisDataParams.Builder builderForValue) {
      if (analysisResultBuilder_ == null) {
        ensureAnalysisResultIsMutable();
        analysisResult_.set(index, builderForValue.build());
        onChanged();
      } else {
        analysisResultBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .analysis.AnalysisDataParams analysisResult = 1;</code>
     */
    public Builder addAnalysisResult(ds.analysis.AnalysisDataParams value) {
      if (analysisResultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnalysisResultIsMutable();
        analysisResult_.add(value);
        onChanged();
      } else {
        analysisResultBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .analysis.AnalysisDataParams analysisResult = 1;</code>
     */
    public Builder addAnalysisResult(
        int index, ds.analysis.AnalysisDataParams value) {
      if (analysisResultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnalysisResultIsMutable();
        analysisResult_.add(index, value);
        onChanged();
      } else {
        analysisResultBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .analysis.AnalysisDataParams analysisResult = 1;</code>
     */
    public Builder addAnalysisResult(
        ds.analysis.AnalysisDataParams.Builder builderForValue) {
      if (analysisResultBuilder_ == null) {
        ensureAnalysisResultIsMutable();
        analysisResult_.add(builderForValue.build());
        onChanged();
      } else {
        analysisResultBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .analysis.AnalysisDataParams analysisResult = 1;</code>
     */
    public Builder addAnalysisResult(
        int index, ds.analysis.AnalysisDataParams.Builder builderForValue) {
      if (analysisResultBuilder_ == null) {
        ensureAnalysisResultIsMutable();
        analysisResult_.add(index, builderForValue.build());
        onChanged();
      } else {
        analysisResultBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .analysis.AnalysisDataParams analysisResult = 1;</code>
     */
    public Builder addAllAnalysisResult(
        java.lang.Iterable<? extends ds.analysis.AnalysisDataParams> values) {
      if (analysisResultBuilder_ == null) {
        ensureAnalysisResultIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, analysisResult_);
        onChanged();
      } else {
        analysisResultBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .analysis.AnalysisDataParams analysisResult = 1;</code>
     */
    public Builder clearAnalysisResult() {
      if (analysisResultBuilder_ == null) {
        analysisResult_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        analysisResultBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .analysis.AnalysisDataParams analysisResult = 1;</code>
     */
    public Builder removeAnalysisResult(int index) {
      if (analysisResultBuilder_ == null) {
        ensureAnalysisResultIsMutable();
        analysisResult_.remove(index);
        onChanged();
      } else {
        analysisResultBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .analysis.AnalysisDataParams analysisResult = 1;</code>
     */
    public ds.analysis.AnalysisDataParams.Builder getAnalysisResultBuilder(
        int index) {
      return getAnalysisResultFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .analysis.AnalysisDataParams analysisResult = 1;</code>
     */
    public ds.analysis.AnalysisDataParamsOrBuilder getAnalysisResultOrBuilder(
        int index) {
      if (analysisResultBuilder_ == null) {
        return analysisResult_.get(index);  } else {
        return analysisResultBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .analysis.AnalysisDataParams analysisResult = 1;</code>
     */
    public java.util.List<? extends ds.analysis.AnalysisDataParamsOrBuilder> 
         getAnalysisResultOrBuilderList() {
      if (analysisResultBuilder_ != null) {
        return analysisResultBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(analysisResult_);
      }
    }
    /**
     * <code>repeated .analysis.AnalysisDataParams analysisResult = 1;</code>
     */
    public ds.analysis.AnalysisDataParams.Builder addAnalysisResultBuilder() {
      return getAnalysisResultFieldBuilder().addBuilder(
          ds.analysis.AnalysisDataParams.getDefaultInstance());
    }
    /**
     * <code>repeated .analysis.AnalysisDataParams analysisResult = 1;</code>
     */
    public ds.analysis.AnalysisDataParams.Builder addAnalysisResultBuilder(
        int index) {
      return getAnalysisResultFieldBuilder().addBuilder(
          index, ds.analysis.AnalysisDataParams.getDefaultInstance());
    }
    /**
     * <code>repeated .analysis.AnalysisDataParams analysisResult = 1;</code>
     */
    public java.util.List<ds.analysis.AnalysisDataParams.Builder> 
         getAnalysisResultBuilderList() {
      return getAnalysisResultFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        ds.analysis.AnalysisDataParams, ds.analysis.AnalysisDataParams.Builder, ds.analysis.AnalysisDataParamsOrBuilder> 
        getAnalysisResultFieldBuilder() {
      if (analysisResultBuilder_ == null) {
        analysisResultBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            ds.analysis.AnalysisDataParams, ds.analysis.AnalysisDataParams.Builder, ds.analysis.AnalysisDataParamsOrBuilder>(
                analysisResult_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        analysisResult_ = null;
      }
      return analysisResultBuilder_;
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


    // @@protoc_insertion_point(builder_scope:analysis.AnalysisParametersResponse)
  }

  // @@protoc_insertion_point(class_scope:analysis.AnalysisParametersResponse)
  private static final ds.analysis.AnalysisParametersResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ds.analysis.AnalysisParametersResponse();
  }

  public static ds.analysis.AnalysisParametersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AnalysisParametersResponse>
      PARSER = new com.google.protobuf.AbstractParser<AnalysisParametersResponse>() {
    @java.lang.Override
    public AnalysisParametersResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AnalysisParametersResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AnalysisParametersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnalysisParametersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ds.analysis.AnalysisParametersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

