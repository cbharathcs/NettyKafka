// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: QueryProto.proto

package com.integ.model;

public final class QueryProto {
  private QueryProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface QueryParamOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional string queryKey = 1;
    /**
     * <code>optional string queryKey = 1;</code>
     */
    boolean hasQueryKey();
    /**
     * <code>optional string queryKey = 1;</code>
     */
    java.lang.String getQueryKey();
    /**
     * <code>optional string queryKey = 1;</code>
     */
    com.google.protobuf.ByteString
        getQueryKeyBytes();

    // optional string queryValue = 2;
    /**
     * <code>optional string queryValue = 2;</code>
     */
    boolean hasQueryValue();
    /**
     * <code>optional string queryValue = 2;</code>
     */
    java.lang.String getQueryValue();
    /**
     * <code>optional string queryValue = 2;</code>
     */
    com.google.protobuf.ByteString
        getQueryValueBytes();
  }
  /**
   * Protobuf type {@code QueryParam}
   */
  public static final class QueryParam extends
      com.google.protobuf.GeneratedMessage
      implements QueryParamOrBuilder {
    // Use QueryParam.newBuilder() to construct.
    private QueryParam(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private QueryParam(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final QueryParam defaultInstance;
    public static QueryParam getDefaultInstance() {
      return defaultInstance;
    }

    public QueryParam getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private QueryParam(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            case 10: {
              bitField0_ |= 0x00000001;
              queryKey_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              queryValue_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.integ.model.QueryProto.internal_static_QueryParam_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.integ.model.QueryProto.internal_static_QueryParam_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              QueryProto.QueryParam.class, QueryProto.QueryParam.Builder.class);
    }

    public static com.google.protobuf.Parser<QueryParam> PARSER =
        new com.google.protobuf.AbstractParser<QueryParam>() {
      public QueryParam parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new QueryParam(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<QueryParam> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional string queryKey = 1;
    public static final int QUERYKEY_FIELD_NUMBER = 1;
    private java.lang.Object queryKey_;
    /**
     * <code>optional string queryKey = 1;</code>
     */
    public boolean hasQueryKey() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string queryKey = 1;</code>
     */
    public java.lang.String getQueryKey() {
      java.lang.Object ref = queryKey_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          queryKey_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string queryKey = 1;</code>
     */
    public com.google.protobuf.ByteString
        getQueryKeyBytes() {
      java.lang.Object ref = queryKey_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        queryKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string queryValue = 2;
    public static final int QUERYVALUE_FIELD_NUMBER = 2;
    private java.lang.Object queryValue_;
    /**
     * <code>optional string queryValue = 2;</code>
     */
    public boolean hasQueryValue() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string queryValue = 2;</code>
     */
    public java.lang.String getQueryValue() {
      java.lang.Object ref = queryValue_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          queryValue_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string queryValue = 2;</code>
     */
    public com.google.protobuf.ByteString
        getQueryValueBytes() {
      java.lang.Object ref = queryValue_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        queryValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      queryKey_ = "";
      queryValue_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getQueryKeyBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getQueryValueBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getQueryKeyBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getQueryValueBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static QueryParam parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static QueryParam parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static QueryParam parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static QueryParam parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static QueryParam parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static QueryParam parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static QueryParam parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static QueryParam parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static QueryParam parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static QueryParam parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(QueryProto.QueryParam prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code QueryParam}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements QueryProto.QueryParamOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.integ.model.QueryProto.internal_static_QueryParam_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.integ.model.QueryProto.internal_static_QueryParam_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                QueryProto.QueryParam.class, QueryProto.QueryParam.Builder.class);
      }

      // Construct using com.integ.model.QueryProto.QueryParam.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        queryKey_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        queryValue_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.integ.model.QueryProto.internal_static_QueryParam_descriptor;
      }

      public QueryParam getDefaultInstanceForType() {
        return com.integ.model.QueryProto.QueryParam.getDefaultInstance();
      }

      public QueryParam build() {
        QueryProto.QueryParam result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public QueryParam buildPartial() {
        QueryProto.QueryParam result = new QueryProto.QueryParam(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.queryKey_ = queryKey_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.queryValue_ = queryValue_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof QueryProto.QueryParam) {
          return mergeFrom((QueryProto.QueryParam)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(QueryProto.QueryParam other) {
        if (other == com.integ.model.QueryProto.QueryParam.getDefaultInstance()) return this;
        if (other.hasQueryKey()) {
          bitField0_ |= 0x00000001;
          queryKey_ = other.queryKey_;
          onChanged();
        }
        if (other.hasQueryValue()) {
          bitField0_ |= 0x00000002;
          queryValue_ = other.queryValue_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        QueryProto.QueryParam parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (QueryProto.QueryParam) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional string queryKey = 1;
      private java.lang.Object queryKey_ = "";
      /**
       * <code>optional string queryKey = 1;</code>
       */
      public boolean hasQueryKey() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string queryKey = 1;</code>
       */
      public java.lang.String getQueryKey() {
        java.lang.Object ref = queryKey_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          queryKey_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string queryKey = 1;</code>
       */
      public com.google.protobuf.ByteString
          getQueryKeyBytes() {
        java.lang.Object ref = queryKey_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          queryKey_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string queryKey = 1;</code>
       */
      public Builder setQueryKey(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        queryKey_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string queryKey = 1;</code>
       */
      public Builder clearQueryKey() {
        bitField0_ = (bitField0_ & ~0x00000001);
        queryKey_ = getDefaultInstance().getQueryKey();
        onChanged();
        return this;
      }
      /**
       * <code>optional string queryKey = 1;</code>
       */
      public Builder setQueryKeyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        queryKey_ = value;
        onChanged();
        return this;
      }

      // optional string queryValue = 2;
      private java.lang.Object queryValue_ = "";
      /**
       * <code>optional string queryValue = 2;</code>
       */
      public boolean hasQueryValue() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string queryValue = 2;</code>
       */
      public java.lang.String getQueryValue() {
        java.lang.Object ref = queryValue_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          queryValue_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string queryValue = 2;</code>
       */
      public com.google.protobuf.ByteString
          getQueryValueBytes() {
        java.lang.Object ref = queryValue_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          queryValue_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string queryValue = 2;</code>
       */
      public Builder setQueryValue(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        queryValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string queryValue = 2;</code>
       */
      public Builder clearQueryValue() {
        bitField0_ = (bitField0_ & ~0x00000002);
        queryValue_ = getDefaultInstance().getQueryValue();
        onChanged();
        return this;
      }
      /**
       * <code>optional string queryValue = 2;</code>
       */
      public Builder setQueryValueBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        queryValue_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:QueryParam)
    }

    static {
      defaultInstance = new QueryParam(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:QueryParam)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_QueryParam_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_QueryParam_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020QueryProto.proto\"2\n\nQueryParam\022\020\n\010quer" +
      "yKey\030\001 \001(\t\022\022\n\nqueryValue\030\002 \001(\tB\037\n\021com.pr" +
      "otobuf.packB\nQueryProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_QueryParam_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_QueryParam_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_QueryParam_descriptor,
              new java.lang.String[] { "QueryKey", "QueryValue", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
