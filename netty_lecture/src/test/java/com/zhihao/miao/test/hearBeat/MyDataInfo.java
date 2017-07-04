// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/protobuf/HearBeat.proto

package com.zhihao.miao.test.hearBeat;

public final class MyDataInfo {
  private MyDataInfo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HearBeatOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.zhihao.miao.test.hearBeat.HearBeat)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required .com.zhihao.miao.test.hearBeat.HearBeat.HearBeatType hearBeatType = 1;</code>
     */
    boolean hasHearBeatType();
    /**
     * <code>required .com.zhihao.miao.test.hearBeat.HearBeat.HearBeatType hearBeatType = 1;</code>
     */
    com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat.HearBeatType getHearBeatType();

    /**
     * <code>optional string data = 2;</code>
     */
    boolean hasData();
    /**
     * <code>optional string data = 2;</code>
     */
    java.lang.String getData();
    /**
     * <code>optional string data = 2;</code>
     */
    com.google.protobuf.ByteString
        getDataBytes();
  }
  /**
   * Protobuf type {@code com.zhihao.miao.test.hearBeat.HearBeat}
   */
  public  static final class HearBeat extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.zhihao.miao.test.hearBeat.HearBeat)
      HearBeatOrBuilder {
    // Use HearBeat.newBuilder() to construct.
    private HearBeat(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HearBeat() {
      hearBeatType_ = 1;
      data_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HearBeat(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();
              com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat.HearBeatType value = com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat.HearBeatType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                hearBeatType_ = rawValue;
              }
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              data_ = bs;
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
      return com.zhihao.miao.test.hearBeat.MyDataInfo.internal_static_com_zhihao_miao_test_hearBeat_HearBeat_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zhihao.miao.test.hearBeat.MyDataInfo.internal_static_com_zhihao_miao_test_hearBeat_HearBeat_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat.class, com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat.Builder.class);
    }

    /**
     * <pre>
     *包的类型
     * </pre>
     *
     * Protobuf enum {@code com.zhihao.miao.test.hearBeat.HearBeat.HearBeatType}
     */
    public enum HearBeatType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <pre>
       *心跳包
       * </pre>
       *
       * <code>HEARTBEAT = 1;</code>
       */
      HEARTBEAT(1),
      /**
       * <pre>
       *数据包
       * </pre>
       *
       * <code>DATA = 2;</code>
       */
      DATA(2),
      ;

      /**
       * <pre>
       *心跳包
       * </pre>
       *
       * <code>HEARTBEAT = 1;</code>
       */
      public static final int HEARTBEAT_VALUE = 1;
      /**
       * <pre>
       *数据包
       * </pre>
       *
       * <code>DATA = 2;</code>
       */
      public static final int DATA_VALUE = 2;


      public final int getNumber() {
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static HearBeatType valueOf(int value) {
        return forNumber(value);
      }

      public static HearBeatType forNumber(int value) {
        switch (value) {
          case 1: return HEARTBEAT;
          case 2: return DATA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<HearBeatType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          HearBeatType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<HearBeatType>() {
              public HearBeatType findValueByNumber(int number) {
                return HearBeatType.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat.getDescriptor().getEnumTypes().get(0);
      }

      private static final HearBeatType[] VALUES = values();

      public static HearBeatType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private HearBeatType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:com.zhihao.miao.test.hearBeat.HearBeat.HearBeatType)
    }

    private int bitField0_;
    public static final int HEARBEATTYPE_FIELD_NUMBER = 1;
    private int hearBeatType_;
    /**
     * <code>required .com.zhihao.miao.test.hearBeat.HearBeat.HearBeatType hearBeatType = 1;</code>
     */
    public boolean hasHearBeatType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .com.zhihao.miao.test.hearBeat.HearBeat.HearBeatType hearBeatType = 1;</code>
     */
    public com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat.HearBeatType getHearBeatType() {
      com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat.HearBeatType result = com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat.HearBeatType.valueOf(hearBeatType_);
      return result == null ? com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat.HearBeatType.HEARTBEAT : result;
    }

    public static final int DATA_FIELD_NUMBER = 2;
    private volatile java.lang.Object data_;
    /**
     * <code>optional string data = 2;</code>
     */
    public boolean hasData() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string data = 2;</code>
     */
    public java.lang.String getData() {
      java.lang.Object ref = data_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          data_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string data = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDataBytes() {
      java.lang.Object ref = data_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        data_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasHearBeatType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, hearBeatType_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, data_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, hearBeatType_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, data_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat)) {
        return super.equals(obj);
      }
      com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat other = (com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat) obj;

      boolean result = true;
      result = result && (hasHearBeatType() == other.hasHearBeatType());
      if (hasHearBeatType()) {
        result = result && hearBeatType_ == other.hearBeatType_;
      }
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
      if (hasHearBeatType()) {
        hash = (37 * hash) + HEARBEATTYPE_FIELD_NUMBER;
        hash = (53 * hash) + hearBeatType_;
      }
      if (hasData()) {
        hash = (37 * hash) + DATA_FIELD_NUMBER;
        hash = (53 * hash) + getData().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code com.zhihao.miao.test.hearBeat.HearBeat}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.zhihao.miao.test.hearBeat.HearBeat)
        com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeatOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.zhihao.miao.test.hearBeat.MyDataInfo.internal_static_com_zhihao_miao_test_hearBeat_HearBeat_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.zhihao.miao.test.hearBeat.MyDataInfo.internal_static_com_zhihao_miao_test_hearBeat_HearBeat_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat.class, com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat.Builder.class);
      }

      // Construct using com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat.newBuilder()
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
      public Builder clear() {
        super.clear();
        hearBeatType_ = 1;
        bitField0_ = (bitField0_ & ~0x00000001);
        data_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.zhihao.miao.test.hearBeat.MyDataInfo.internal_static_com_zhihao_miao_test_hearBeat_HearBeat_descriptor;
      }

      public com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat getDefaultInstanceForType() {
        return com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat.getDefaultInstance();
      }

      public com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat build() {
        com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat buildPartial() {
        com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat result = new com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.hearBeatType_ = hearBeatType_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.data_ = data_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat) {
          return mergeFrom((com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat other) {
        if (other == com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat.getDefaultInstance()) return this;
        if (other.hasHearBeatType()) {
          setHearBeatType(other.getHearBeatType());
        }
        if (other.hasData()) {
          bitField0_ |= 0x00000002;
          data_ = other.data_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasHearBeatType()) {
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int hearBeatType_ = 1;
      /**
       * <code>required .com.zhihao.miao.test.hearBeat.HearBeat.HearBeatType hearBeatType = 1;</code>
       */
      public boolean hasHearBeatType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .com.zhihao.miao.test.hearBeat.HearBeat.HearBeatType hearBeatType = 1;</code>
       */
      public com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat.HearBeatType getHearBeatType() {
        com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat.HearBeatType result = com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat.HearBeatType.valueOf(hearBeatType_);
        return result == null ? com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat.HearBeatType.HEARTBEAT : result;
      }
      /**
       * <code>required .com.zhihao.miao.test.hearBeat.HearBeat.HearBeatType hearBeatType = 1;</code>
       */
      public Builder setHearBeatType(com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat.HearBeatType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        hearBeatType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>required .com.zhihao.miao.test.hearBeat.HearBeat.HearBeatType hearBeatType = 1;</code>
       */
      public Builder clearHearBeatType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        hearBeatType_ = 1;
        onChanged();
        return this;
      }

      private java.lang.Object data_ = "";
      /**
       * <code>optional string data = 2;</code>
       */
      public boolean hasData() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string data = 2;</code>
       */
      public java.lang.String getData() {
        java.lang.Object ref = data_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            data_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string data = 2;</code>
       */
      public com.google.protobuf.ByteString
          getDataBytes() {
        java.lang.Object ref = data_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          data_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string data = 2;</code>
       */
      public Builder setData(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        data_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string data = 2;</code>
       */
      public Builder clearData() {
        bitField0_ = (bitField0_ & ~0x00000002);
        data_ = getDefaultInstance().getData();
        onChanged();
        return this;
      }
      /**
       * <code>optional string data = 2;</code>
       */
      public Builder setDataBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        data_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.zhihao.miao.test.hearBeat.HearBeat)
    }

    // @@protoc_insertion_point(class_scope:com.zhihao.miao.test.hearBeat.HearBeat)
    private static final com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat();
    }

    public static com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<HearBeat>
        PARSER = new com.google.protobuf.AbstractParser<HearBeat>() {
      public HearBeat parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new HearBeat(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HearBeat> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HearBeat> getParserForType() {
      return PARSER;
    }

    public com.zhihao.miao.test.hearBeat.MyDataInfo.HearBeat getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_zhihao_miao_test_hearBeat_HearBeat_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_zhihao_miao_test_hearBeat_HearBeat_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033src/protobuf/HearBeat.proto\022\035com.zhiha" +
      "o.miao.test.hearBeat\"\215\001\n\010HearBeat\022J\n\014hea" +
      "rBeatType\030\001 \002(\01624.com.zhihao.miao.test.h" +
      "earBeat.HearBeat.HearBeatType\022\014\n\004data\030\002 " +
      "\001(\t\"\'\n\014HearBeatType\022\r\n\tHEARTBEAT\020\001\022\010\n\004DA" +
      "TA\020\002B-\n\035com.zhihao.miao.test.hearBeatB\nM" +
      "yDataInfoH\001"
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
    internal_static_com_zhihao_miao_test_hearBeat_HearBeat_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_zhihao_miao_test_hearBeat_HearBeat_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_zhihao_miao_test_hearBeat_HearBeat_descriptor,
        new java.lang.String[] { "HearBeatType", "Data", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}