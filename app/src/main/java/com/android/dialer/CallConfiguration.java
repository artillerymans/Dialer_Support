// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: packages/apps/Dialer/java/com/android/incallui/callconfiguration/call_configuration.proto

package com.android.dialer;

/**
 * <pre>
 * Configuration for starting a call
 * </pre>
 *
 * Protobuf type {@code com.android.dialer.CallConfiguration}
 */
public  final class CallConfiguration extends
    com.google.protobuf.GeneratedMessageLite<
        CallConfiguration, CallConfiguration.Builder> implements
    // @@protoc_insertion_point(message_implements:com.android.dialer.CallConfiguration)
    CallConfigurationOrBuilder {
  private CallConfiguration() {
    callMode_ = 0;
  }
  private int bitField0_;
  public static final int CALL_MODE_FIELD_NUMBER = 1;
  private int callMode_;
  /**
   * <code>optional .com.android.dialer.Mode call_mode = 1;</code>
   */
  public boolean hasCallMode() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional .com.android.dialer.Mode call_mode = 1;</code>
   */
  public com.android.dialer.Mode getCallMode() {
    com.android.dialer.Mode result = com.android.dialer.Mode.forNumber(callMode_);
    return result == null ? com.android.dialer.Mode.MODE_UNSPECIFIED : result;
  }
  /**
   * <code>optional .com.android.dialer.Mode call_mode = 1;</code>
   */
  private void setCallMode(com.android.dialer.Mode value) {
    if (value == null) {
      throw new NullPointerException();
    }
    bitField0_ |= 0x00000001;
    callMode_ = value.getNumber();
  }
  /**
   * <code>optional .com.android.dialer.Mode call_mode = 1;</code>
   */
  private void clearCallMode() {
    bitField0_ = (bitField0_ & ~0x00000001);
    callMode_ = 0;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeEnum(1, callMode_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, callMode_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.android.dialer.CallConfiguration parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.android.dialer.CallConfiguration parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.android.dialer.CallConfiguration parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.android.dialer.CallConfiguration parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.android.dialer.CallConfiguration parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.android.dialer.CallConfiguration parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.android.dialer.CallConfiguration parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.android.dialer.CallConfiguration parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.android.dialer.CallConfiguration parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.android.dialer.CallConfiguration parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.android.dialer.CallConfiguration prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Configuration for starting a call
   * </pre>
   *
   * Protobuf type {@code com.android.dialer.CallConfiguration}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.android.dialer.CallConfiguration, Builder> implements
      // @@protoc_insertion_point(builder_implements:com.android.dialer.CallConfiguration)
      com.android.dialer.CallConfigurationOrBuilder {
    // Construct using com.android.dialer.CallConfiguration.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional .com.android.dialer.Mode call_mode = 1;</code>
     */
    public boolean hasCallMode() {
      return instance.hasCallMode();
    }
    /**
     * <code>optional .com.android.dialer.Mode call_mode = 1;</code>
     */
    public com.android.dialer.Mode getCallMode() {
      return instance.getCallMode();
    }
    /**
     * <code>optional .com.android.dialer.Mode call_mode = 1;</code>
     */
    public Builder setCallMode(com.android.dialer.Mode value) {
      copyOnWrite();
      instance.setCallMode(value);
      return this;
    }
    /**
     * <code>optional .com.android.dialer.Mode call_mode = 1;</code>
     */
    public Builder clearCallMode() {
      copyOnWrite();
      instance.clearCallMode();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:com.android.dialer.CallConfiguration)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.android.dialer.CallConfiguration();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.android.dialer.CallConfiguration other = (com.android.dialer.CallConfiguration) arg1;
        callMode_ = visitor.visitInt(hasCallMode(), callMode_,
            other.hasCallMode(), other.callMode_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
          bitField0_ |= other.bitField0_;
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!parseUnknownField(tag, input)) {
                  done = true;
                }
                break;
              }
              case 8: {
                int rawValue = input.readEnum();
                com.android.dialer.Mode value = com.android.dialer.Mode.forNumber(rawValue);
                if (value == null) {
                  super.mergeVarintField(1, rawValue);
                } else {
                  bitField0_ |= 0x00000001;
                  callMode_ = rawValue;
                }
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (com.android.dialer.CallConfiguration.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:com.android.dialer.CallConfiguration)
  private static final com.android.dialer.CallConfiguration DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new CallConfiguration();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.android.dialer.CallConfiguration getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<CallConfiguration> PARSER;

  public static com.google.protobuf.Parser<CallConfiguration> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
