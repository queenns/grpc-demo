// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: search.proto

package cn.com.xcar.proto;

/**
 * Protobuf type {@code cn.com.xcar.proto.AdvertRequest}
 */
public  final class AdvertRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cn.com.xcar.proto.AdvertRequest)
    AdvertRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdvertRequest.newBuilder() to construct.
  private AdvertRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdvertRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AdvertRequest(
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
          case 8: {
            bitField0_ |= 0x00000001;
            placeId_ = input.readInt32();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            platformId_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
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
    return cn.com.xcar.proto.SearchProto.internal_static_cn_com_xcar_proto_AdvertRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cn.com.xcar.proto.SearchProto.internal_static_cn_com_xcar_proto_AdvertRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cn.com.xcar.proto.AdvertRequest.class, cn.com.xcar.proto.AdvertRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PLACEID_FIELD_NUMBER = 1;
  private int placeId_;
  /**
   * <code>optional int32 placeId = 1;</code>
   */
  public boolean hasPlaceId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional int32 placeId = 1;</code>
   */
  public int getPlaceId() {
    return placeId_;
  }

  public static final int PLATFORMID_FIELD_NUMBER = 2;
  private int platformId_;
  /**
   * <code>optional int32 platformId = 2;</code>
   */
  public boolean hasPlatformId() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional int32 platformId = 2;</code>
   */
  public int getPlatformId() {
    return platformId_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt32(1, placeId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(2, platformId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, placeId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, platformId_);
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
    if (!(obj instanceof cn.com.xcar.proto.AdvertRequest)) {
      return super.equals(obj);
    }
    cn.com.xcar.proto.AdvertRequest other = (cn.com.xcar.proto.AdvertRequest) obj;

    if (hasPlaceId() != other.hasPlaceId()) return false;
    if (hasPlaceId()) {
      if (getPlaceId()
          != other.getPlaceId()) return false;
    }
    if (hasPlatformId() != other.hasPlatformId()) return false;
    if (hasPlatformId()) {
      if (getPlatformId()
          != other.getPlatformId()) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasPlaceId()) {
      hash = (37 * hash) + PLACEID_FIELD_NUMBER;
      hash = (53 * hash) + getPlaceId();
    }
    if (hasPlatformId()) {
      hash = (37 * hash) + PLATFORMID_FIELD_NUMBER;
      hash = (53 * hash) + getPlatformId();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cn.com.xcar.proto.AdvertRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.com.xcar.proto.AdvertRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.com.xcar.proto.AdvertRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.com.xcar.proto.AdvertRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.com.xcar.proto.AdvertRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.com.xcar.proto.AdvertRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.com.xcar.proto.AdvertRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.com.xcar.proto.AdvertRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.com.xcar.proto.AdvertRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cn.com.xcar.proto.AdvertRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.com.xcar.proto.AdvertRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.com.xcar.proto.AdvertRequest parseFrom(
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
  public static Builder newBuilder(cn.com.xcar.proto.AdvertRequest prototype) {
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
   * Protobuf type {@code cn.com.xcar.proto.AdvertRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cn.com.xcar.proto.AdvertRequest)
      cn.com.xcar.proto.AdvertRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.com.xcar.proto.SearchProto.internal_static_cn_com_xcar_proto_AdvertRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.com.xcar.proto.SearchProto.internal_static_cn_com_xcar_proto_AdvertRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.com.xcar.proto.AdvertRequest.class, cn.com.xcar.proto.AdvertRequest.Builder.class);
    }

    // Construct using cn.com.xcar.proto.AdvertRequest.newBuilder()
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
      placeId_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      platformId_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cn.com.xcar.proto.SearchProto.internal_static_cn_com_xcar_proto_AdvertRequest_descriptor;
    }

    @java.lang.Override
    public cn.com.xcar.proto.AdvertRequest getDefaultInstanceForType() {
      return cn.com.xcar.proto.AdvertRequest.getDefaultInstance();
    }

    @java.lang.Override
    public cn.com.xcar.proto.AdvertRequest build() {
      cn.com.xcar.proto.AdvertRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cn.com.xcar.proto.AdvertRequest buildPartial() {
      cn.com.xcar.proto.AdvertRequest result = new cn.com.xcar.proto.AdvertRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.placeId_ = placeId_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.platformId_ = platformId_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof cn.com.xcar.proto.AdvertRequest) {
        return mergeFrom((cn.com.xcar.proto.AdvertRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cn.com.xcar.proto.AdvertRequest other) {
      if (other == cn.com.xcar.proto.AdvertRequest.getDefaultInstance()) return this;
      if (other.hasPlaceId()) {
        setPlaceId(other.getPlaceId());
      }
      if (other.hasPlatformId()) {
        setPlatformId(other.getPlatformId());
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
      cn.com.xcar.proto.AdvertRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cn.com.xcar.proto.AdvertRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int placeId_ ;
    /**
     * <code>optional int32 placeId = 1;</code>
     */
    public boolean hasPlaceId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int32 placeId = 1;</code>
     */
    public int getPlaceId() {
      return placeId_;
    }
    /**
     * <code>optional int32 placeId = 1;</code>
     */
    public Builder setPlaceId(int value) {
      bitField0_ |= 0x00000001;
      placeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 placeId = 1;</code>
     */
    public Builder clearPlaceId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      placeId_ = 0;
      onChanged();
      return this;
    }

    private int platformId_ ;
    /**
     * <code>optional int32 platformId = 2;</code>
     */
    public boolean hasPlatformId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int32 platformId = 2;</code>
     */
    public int getPlatformId() {
      return platformId_;
    }
    /**
     * <code>optional int32 platformId = 2;</code>
     */
    public Builder setPlatformId(int value) {
      bitField0_ |= 0x00000002;
      platformId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 platformId = 2;</code>
     */
    public Builder clearPlatformId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      platformId_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:cn.com.xcar.proto.AdvertRequest)
  }

  // @@protoc_insertion_point(class_scope:cn.com.xcar.proto.AdvertRequest)
  private static final cn.com.xcar.proto.AdvertRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cn.com.xcar.proto.AdvertRequest();
  }

  public static cn.com.xcar.proto.AdvertRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<AdvertRequest>
      PARSER = new com.google.protobuf.AbstractParser<AdvertRequest>() {
    @java.lang.Override
    public AdvertRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AdvertRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AdvertRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdvertRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cn.com.xcar.proto.AdvertRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
