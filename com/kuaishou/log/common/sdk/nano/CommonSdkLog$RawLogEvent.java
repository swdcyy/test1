package com.kuaishou.log.common.sdk.nano.CommonSdkLog$RawLogEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

public final class CommonSdkLog$RawLogEvent extends MessageNano	// class@00149c
{
    public boolean authentication;
    public String clientId;
    public String deviceId;
    public String exploreLocale;
    public String ip;
    public byte[] rawEvent;
    public String serverHostname;
    public long serverTimestamp;
    public int type;
    public long userId;
    public static CommonSdkLog$RawLogEvent[] _emptyArray;

    public void CommonSdkLog$RawLogEvent(){
       super();
       this.clear();
    }
    public static CommonSdkLog$RawLogEvent[] emptyArray(){
       if (CommonSdkLog$RawLogEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (CommonSdkLog$RawLogEvent._emptyArray == null) {
             CommonSdkLog$RawLogEvent[] rawLogEventA = new CommonSdkLog$RawLogEvent[0];
             CommonSdkLog$RawLogEvent._emptyArray = rawLogEventA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return CommonSdkLog$RawLogEvent._emptyArray;
    }
    public static CommonSdkLog$RawLogEvent parseFrom(CodedInputByteBufferNano p0){
       return new CommonSdkLog$RawLogEvent().mergeFrom(p0);
    }
    public static CommonSdkLog$RawLogEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new CommonSdkLog$RawLogEvent(), p0);
    }
    public CommonSdkLog$RawLogEvent clear(){
       this.clientId = "";
       this.deviceId = "";
       this.authentication = false;
       this.type = 0;
       this.userId = 0;
       this.serverHostname = "";
       this.serverTimestamp = 0;
       this.ip = "";
       this.exploreLocale = "";
       this.rawEvent = WireFormatNano.EMPTY_BYTES;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.clientId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.clientId);
       }
       if (!(this.deviceId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.deviceId);
       }
       CommonSdkLog$RawLogEvent tauthenticat = this.authentication;
       if (tauthenticat != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tauthenticat);
       }
       tauthenticat = this.type;
       if (tauthenticat != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tauthenticat);
       }
       CommonSdkLog$RawLogEvent tuserId = this.userId;
       if (tuserId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tuserId);
       }
       if (!(this.serverHostname).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.serverHostname);
       }
       tuserId = this.serverTimestamp;
       if (tuserId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tuserId);
       }
       if (!(this.ip).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.ip);
       }
       if (!(this.exploreLocale).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.exploreLocale);
       }
       if (!Arrays.equals(this.rawEvent, WireFormatNano.EMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(10, this.rawEvent);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public CommonSdkLog$RawLogEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.clientId = p0.readString();
                break;
              case 18:
                this.deviceId = p0.readString();
                break;
              case 24:
                this.authentication = p0.readBool();
                break;
              case 32:
                this.type = p0.readInt32();
                break;
              case '(':
                this.userId = p0.readUInt64();
                break;
              case '2':
                this.serverHostname = p0.readString();
                break;
              case '8':
                this.serverTimestamp = p0.readUInt64();
                break;
              case 'B':
                this.ip = p0.readString();
                break;
              case 'J':
                this.exploreLocale = p0.readString();
                break;
              case 'R':
                this.rawEvent = p0.readBytes();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.clientId).equals(str)) {
          p0.writeString(1, this.clientId);
       }
       if (!(this.deviceId).equals(str)) {
          p0.writeString(2, this.deviceId);
       }
       CommonSdkLog$RawLogEvent tauthenticat = this.authentication;
       if (tauthenticat != null) {
          p0.writeBool(3, tauthenticat);
       }
       tauthenticat = this.type;
       if (tauthenticat != null) {
          p0.writeInt32(4, tauthenticat);
       }
       CommonSdkLog$RawLogEvent tuserId = this.userId;
       if (tuserId) {
          p0.writeUInt64(5, tuserId);
       }
       if (!(this.serverHostname).equals(str)) {
          p0.writeString(6, this.serverHostname);
       }
       tuserId = this.serverTimestamp;
       if (tuserId) {
          p0.writeUInt64(7, tuserId);
       }
       if (!(this.ip).equals(str)) {
          p0.writeString(8, this.ip);
       }
       if (!(this.exploreLocale).equals(str)) {
          p0.writeString(9, this.exploreLocale);
       }
       if (!Arrays.equals(this.rawEvent, WireFormatNano.EMPTY_BYTES)) {
          p0.writeBytes(10, this.rawEvent);
       }
       super.writeTo(p0);
       return;
    }
}
