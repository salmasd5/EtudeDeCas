// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reservation.proto

package com.daigham.EtudeDeCas.stub;

/**
 * Protobuf type {@code com.chalabi.EtudeDeCas.ReservationList}
 */
public  final class ReservationList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.chalabi.EtudeDeCas.ReservationList)
    ReservationListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReservationList.newBuilder() to construct.
  private ReservationList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReservationList() {
    reservations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReservationList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReservationList(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              reservations_ = new java.util.ArrayList<Reservation>();
              mutable_bitField0_ |= 0x00000001;
            }
            reservations_.add(
                input.readMessage(Reservation.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        reservations_ = java.util.Collections.unmodifiableList(reservations_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ReservationOuterClass.internal_static_com_chalabi_EtudeDeCas_ReservationList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ReservationOuterClass.internal_static_com_chalabi_EtudeDeCas_ReservationList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ReservationList.class, ReservationList.Builder.class);
  }

  public static final int RESERVATIONS_FIELD_NUMBER = 1;
  private java.util.List<Reservation> reservations_;
  /**
   * <code>repeated .com.chalabi.EtudeDeCas.Reservation reservations = 1;</code>
   */
  public java.util.List<Reservation> getReservationsList() {
    return reservations_;
  }
  /**
   * <code>repeated .com.chalabi.EtudeDeCas.Reservation reservations = 1;</code>
   */
  public java.util.List<? extends ReservationOrBuilder>
      getReservationsOrBuilderList() {
    return reservations_;
  }
  /**
   * <code>repeated .com.chalabi.EtudeDeCas.Reservation reservations = 1;</code>
   */
  public int getReservationsCount() {
    return reservations_.size();
  }
  /**
   * <code>repeated .com.chalabi.EtudeDeCas.Reservation reservations = 1;</code>
   */
  public Reservation getReservations(int index) {
    return reservations_.get(index);
  }
  /**
   * <code>repeated .com.chalabi.EtudeDeCas.Reservation reservations = 1;</code>
   */
  public ReservationOrBuilder getReservationsOrBuilder(
      int index) {
    return reservations_.get(index);
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
    for (int i = 0; i < reservations_.size(); i++) {
      output.writeMessage(1, reservations_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < reservations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, reservations_.get(i));
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
    if (!(obj instanceof ReservationList)) {
      return super.equals(obj);
    }
    ReservationList other = (ReservationList) obj;

    if (!getReservationsList()
        .equals(other.getReservationsList())) return false;
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
    if (getReservationsCount() > 0) {
      hash = (37 * hash) + RESERVATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getReservationsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ReservationList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ReservationList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ReservationList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ReservationList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ReservationList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ReservationList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ReservationList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ReservationList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ReservationList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ReservationList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ReservationList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ReservationList parseFrom(
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
  public static Builder newBuilder(ReservationList prototype) {
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
   * Protobuf type {@code com.chalabi.EtudeDeCas.ReservationList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.chalabi.EtudeDeCas.ReservationList)
          ReservationListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ReservationOuterClass.internal_static_com_chalabi_EtudeDeCas_ReservationList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ReservationOuterClass.internal_static_com_chalabi_EtudeDeCas_ReservationList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ReservationList.class, ReservationList.Builder.class);
    }

    // Construct using com.chalabi.EtudeDeCas.stubs.ReservationList.newBuilder()
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
        getReservationsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (reservationsBuilder_ == null) {
        reservations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        reservationsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ReservationOuterClass.internal_static_com_chalabi_EtudeDeCas_ReservationList_descriptor;
    }

    @java.lang.Override
    public ReservationList getDefaultInstanceForType() {
      return ReservationList.getDefaultInstance();
    }

    @java.lang.Override
    public ReservationList build() {
      ReservationList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ReservationList buildPartial() {
      ReservationList result = new ReservationList(this);
      int from_bitField0_ = bitField0_;
      if (reservationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          reservations_ = java.util.Collections.unmodifiableList(reservations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.reservations_ = reservations_;
      } else {
        result.reservations_ = reservationsBuilder_.build();
      }
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
      if (other instanceof ReservationList) {
        return mergeFrom((ReservationList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ReservationList other) {
      if (other == ReservationList.getDefaultInstance()) return this;
      if (reservationsBuilder_ == null) {
        if (!other.reservations_.isEmpty()) {
          if (reservations_.isEmpty()) {
            reservations_ = other.reservations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureReservationsIsMutable();
            reservations_.addAll(other.reservations_);
          }
          onChanged();
        }
      } else {
        if (!other.reservations_.isEmpty()) {
          if (reservationsBuilder_.isEmpty()) {
            reservationsBuilder_.dispose();
            reservationsBuilder_ = null;
            reservations_ = other.reservations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            reservationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getReservationsFieldBuilder() : null;
          } else {
            reservationsBuilder_.addAllMessages(other.reservations_);
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
      ReservationList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ReservationList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<Reservation> reservations_ =
      java.util.Collections.emptyList();
    private void ensureReservationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        reservations_ = new java.util.ArrayList<Reservation>(reservations_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            Reservation, Reservation.Builder, ReservationOrBuilder> reservationsBuilder_;

    /**
     * <code>repeated .com.chalabi.EtudeDeCas.Reservation reservations = 1;</code>
     */
    public java.util.List<Reservation> getReservationsList() {
      if (reservationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(reservations_);
      } else {
        return reservationsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.chalabi.EtudeDeCas.Reservation reservations = 1;</code>
     */
    public int getReservationsCount() {
      if (reservationsBuilder_ == null) {
        return reservations_.size();
      } else {
        return reservationsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.chalabi.EtudeDeCas.Reservation reservations = 1;</code>
     */
    public Reservation getReservations(int index) {
      if (reservationsBuilder_ == null) {
        return reservations_.get(index);
      } else {
        return reservationsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.chalabi.EtudeDeCas.Reservation reservations = 1;</code>
     */
    public Builder setReservations(
        int index, Reservation value) {
      if (reservationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReservationsIsMutable();
        reservations_.set(index, value);
        onChanged();
      } else {
        reservationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.chalabi.EtudeDeCas.Reservation reservations = 1;</code>
     */
    public Builder setReservations(
        int index, Reservation.Builder builderForValue) {
      if (reservationsBuilder_ == null) {
        ensureReservationsIsMutable();
        reservations_.set(index, builderForValue.build());
        onChanged();
      } else {
        reservationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.chalabi.EtudeDeCas.Reservation reservations = 1;</code>
     */
    public Builder addReservations(Reservation value) {
      if (reservationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReservationsIsMutable();
        reservations_.add(value);
        onChanged();
      } else {
        reservationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.chalabi.EtudeDeCas.Reservation reservations = 1;</code>
     */
    public Builder addReservations(
        int index, Reservation value) {
      if (reservationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReservationsIsMutable();
        reservations_.add(index, value);
        onChanged();
      } else {
        reservationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.chalabi.EtudeDeCas.Reservation reservations = 1;</code>
     */
    public Builder addReservations(
        Reservation.Builder builderForValue) {
      if (reservationsBuilder_ == null) {
        ensureReservationsIsMutable();
        reservations_.add(builderForValue.build());
        onChanged();
      } else {
        reservationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.chalabi.EtudeDeCas.Reservation reservations = 1;</code>
     */
    public Builder addReservations(
        int index, Reservation.Builder builderForValue) {
      if (reservationsBuilder_ == null) {
        ensureReservationsIsMutable();
        reservations_.add(index, builderForValue.build());
        onChanged();
      } else {
        reservationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.chalabi.EtudeDeCas.Reservation reservations = 1;</code>
     */
    public Builder addAllReservations(
        java.lang.Iterable<? extends Reservation> values) {
      if (reservationsBuilder_ == null) {
        ensureReservationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, reservations_);
        onChanged();
      } else {
        reservationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.chalabi.EtudeDeCas.Reservation reservations = 1;</code>
     */
    public Builder clearReservations() {
      if (reservationsBuilder_ == null) {
        reservations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        reservationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.chalabi.EtudeDeCas.Reservation reservations = 1;</code>
     */
    public Builder removeReservations(int index) {
      if (reservationsBuilder_ == null) {
        ensureReservationsIsMutable();
        reservations_.remove(index);
        onChanged();
      } else {
        reservationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.chalabi.EtudeDeCas.Reservation reservations = 1;</code>
     */
    public Reservation.Builder getReservationsBuilder(
        int index) {
      return getReservationsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.chalabi.EtudeDeCas.Reservation reservations = 1;</code>
     */
    public ReservationOrBuilder getReservationsOrBuilder(
        int index) {
      if (reservationsBuilder_ == null) {
        return reservations_.get(index);  } else {
        return reservationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.chalabi.EtudeDeCas.Reservation reservations = 1;</code>
     */
    public java.util.List<? extends ReservationOrBuilder>
         getReservationsOrBuilderList() {
      if (reservationsBuilder_ != null) {
        return reservationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(reservations_);
      }
    }
    /**
     * <code>repeated .com.chalabi.EtudeDeCas.Reservation reservations = 1;</code>
     */
    public Reservation.Builder addReservationsBuilder() {
      return getReservationsFieldBuilder().addBuilder(
          Reservation.getDefaultInstance());
    }
    /**
     * <code>repeated .com.chalabi.EtudeDeCas.Reservation reservations = 1;</code>
     */
    public Reservation.Builder addReservationsBuilder(
        int index) {
      return getReservationsFieldBuilder().addBuilder(
          index, Reservation.getDefaultInstance());
    }
    /**
     * <code>repeated .com.chalabi.EtudeDeCas.Reservation reservations = 1;</code>
     */
    public java.util.List<Reservation.Builder>
         getReservationsBuilderList() {
      return getReservationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
            Reservation, Reservation.Builder, ReservationOrBuilder>
        getReservationsFieldBuilder() {
      if (reservationsBuilder_ == null) {
        reservationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                Reservation, Reservation.Builder, ReservationOrBuilder>(
                reservations_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        reservations_ = null;
      }
      return reservationsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.chalabi.EtudeDeCas.ReservationList)
  }

  // @@protoc_insertion_point(class_scope:com.chalabi.EtudeDeCas.ReservationList)
  private static final ReservationList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ReservationList();
  }

  public static ReservationList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReservationList>
      PARSER = new com.google.protobuf.AbstractParser<ReservationList>() {
    @java.lang.Override
    public ReservationList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReservationList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReservationList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReservationList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ReservationList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

