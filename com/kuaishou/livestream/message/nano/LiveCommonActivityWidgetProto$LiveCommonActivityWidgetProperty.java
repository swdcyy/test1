package com.kuaishou.livestream.message.nano.LiveCommonActivityWidgetProto$LiveCommonActivityWidgetProperty;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveCommonActivityWidgetProto$LiveCommonActivityWidgetProperty extends MessageNano	// class@001145
{
    public boolean autoClose;
    public long createTime;
    public boolean dynamicNumLimit;
    public long endTime;
    public String extraInfo;
    public boolean grprShow;
    public boolean isExclusive;
    public String ksOrderId;
    public String logParams;
    public String logStatus;
    public int priority;
    public static LiveCommonActivityWidgetProto$LiveCommonActivityWidgetProperty[] _emptyArray;

    public void LiveCommonActivityWidgetProto$LiveCommonActivityWidgetProperty(){
       super();
       this.clear();
    }
    public static LiveCommonActivityWidgetProto$LiveCommonActivityWidgetProperty[] emptyArray(){
       if (LiveCommonActivityWidgetProto$LiveCommonActivityWidgetProperty._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommonActivityWidgetProto$LiveCommonActivityWidgetProperty._emptyArray == null) {
             LiveCommonActivityWidgetProto$LiveCommonActivityWidgetProperty[] liveCommonAc = new LiveCommonActivityWidgetProto$LiveCommonActivityWidgetProperty[0];
             LiveCommonActivityWidgetProto$LiveCommonActivityWidgetProperty._emptyArray = liveCommonAc;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommonActivityWidgetProto$LiveCommonActivityWidgetProperty._emptyArray;
    }
    public static LiveCommonActivityWidgetProto$LiveCommonActivityWidgetProperty parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommonActivityWidgetProto$LiveCommonActivityWidgetProperty().mergeFrom(p0);
    }
    public static LiveCommonActivityWidgetProto$LiveCommonActivityWidgetProperty parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommonActivityWidgetProto$LiveCommonActivityWidgetProperty(), p0);
    }
    public LiveCommonActivityWidgetProto$LiveCommonActivityWidgetProperty clear(){
       this.createTime = 0;
       this.priority = 0;
       this.isExclusive = false;
       this.logParams = "";
       this.logStatus = "";
       this.endTime = 0;
       this.autoClose = false;
       this.dynamicNumLimit = false;
       this.grprShow = false;
       this.ksOrderId = "";
       this.extraInfo = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveCommonActivityWidgetProto$LiveCommonActivityWidgetProperty tcreateTime = this.createTime;
       LiveCommonActivityWidgetProto$LiveCommonActivityWidgetProperty liveCommonAc = null;
       if (tcreateTime - liveCommonAc) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tcreateTime);
       }
       tcreateTime = this.priority;
       if (tcreateTime != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tcreateTime);
       }
       tcreateTime = this.isExclusive;
       if (tcreateTime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tcreateTime);
       }
       String str = "";
       if (!(this.logParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.logParams);
       }
       if (!(this.logStatus).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.logStatus);
       }
       LiveCommonActivityWidgetProto$LiveCommonActivityWidgetProperty tendTime = this.endTime;
       if (tendTime - liveCommonAc) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tendTime);
       }
       tcreateTime = this.autoClose;
       if (tcreateTime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, tcreateTime);
       }
       tcreateTime = this.dynamicNumLimit;
       if (tcreateTime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(8, tcreateTime);
       }
       tcreateTime = this.grprShow;
       if (tcreateTime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(9, tcreateTime);
       }
       if (!(this.ksOrderId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.ksOrderId);
       }
       if (!(this.extraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.extraInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommonActivityWidgetProto$LiveCommonActivityWidgetProperty mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
                this.createTime = p0.readUInt64();
                break;
              case 16:
                this.priority = p0.readUInt32();
                break;
              case 24:
                this.isExclusive = p0.readBool();
                break;
              case '"':
                this.logParams = p0.readString();
                break;
              case '*':
                this.logStatus = p0.readString();
                break;
              case '0':
                this.endTime = p0.readUInt64();
                break;
              case '8':
                this.autoClose = p0.readBool();
                break;
              case '@':
                this.dynamicNumLimit = p0.readBool();
                break;
              case 'H':
                this.grprShow = p0.readBool();
                break;
              case 'R':
                this.ksOrderId = p0.readString();
                break;
              case 'Z':
                this.extraInfo = p0.readString();
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
       LiveCommonActivityWidgetProto$LiveCommonActivityWidgetProperty tcreateTime = this.createTime;
       LiveCommonActivityWidgetProto$LiveCommonActivityWidgetProperty liveCommonAc = null;
       if (tcreateTime - liveCommonAc) {
          p0.writeUInt64(1, tcreateTime);
       }
       tcreateTime = this.priority;
       if (tcreateTime != null) {
          p0.writeUInt32(2, tcreateTime);
       }
       tcreateTime = this.isExclusive;
       if (tcreateTime != null) {
          p0.writeBool(3, tcreateTime);
       }
       String str = "";
       if (!(this.logParams).equals(str)) {
          p0.writeString(4, this.logParams);
       }
       if (!(this.logStatus).equals(str)) {
          p0.writeString(5, this.logStatus);
       }
       LiveCommonActivityWidgetProto$LiveCommonActivityWidgetProperty tendTime = this.endTime;
       if (tendTime - liveCommonAc) {
          p0.writeUInt64(6, tendTime);
       }
       tcreateTime = this.autoClose;
       if (tcreateTime != null) {
          p0.writeBool(7, tcreateTime);
       }
       tcreateTime = this.dynamicNumLimit;
       if (tcreateTime != null) {
          p0.writeBool(8, tcreateTime);
       }
       tcreateTime = this.grprShow;
       if (tcreateTime != null) {
          p0.writeBool(9, tcreateTime);
       }
       if (!(this.ksOrderId).equals(str)) {
          p0.writeString(10, this.ksOrderId);
       }
       if (!(this.extraInfo).equals(str)) {
          p0.writeString(11, this.extraInfo);
       }
       super.writeTo(p0);
       return;
    }
}
