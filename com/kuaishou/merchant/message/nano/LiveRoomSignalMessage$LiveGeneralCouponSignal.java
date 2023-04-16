package com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$LiveGeneralCouponSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$GeneralCouponInfo;

public final class LiveRoomSignalMessage$LiveGeneralCouponSignal extends MessageNano	// class@001c54
{
    public String couponId;
    public LiveRoomSignalMessage$GeneralCouponInfo couponInfo;
    public String couponLink;
    public int displayIntervalMillis;
    public boolean isNegative;
    public int pendSourceType;
    public int randomTimeMills;
    public int requestDelaySecond;
    public boolean shouldRequest;
    public int subType;
    public String title;
    public static LiveRoomSignalMessage$LiveGeneralCouponSignal[] _emptyArray;

    public void LiveRoomSignalMessage$LiveGeneralCouponSignal(){
       super();
       this.clear();
    }
    public static LiveRoomSignalMessage$LiveGeneralCouponSignal[] emptyArray(){
       if (LiveRoomSignalMessage$LiveGeneralCouponSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomSignalMessage$LiveGeneralCouponSignal._emptyArray == null) {
             LiveRoomSignalMessage$LiveGeneralCouponSignal[] liveGeneralC = new LiveRoomSignalMessage$LiveGeneralCouponSignal[0];
             LiveRoomSignalMessage$LiveGeneralCouponSignal._emptyArray = liveGeneralC;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomSignalMessage$LiveGeneralCouponSignal._emptyArray;
    }
    public static LiveRoomSignalMessage$LiveGeneralCouponSignal parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomSignalMessage$LiveGeneralCouponSignal().mergeFrom(p0);
    }
    public static LiveRoomSignalMessage$LiveGeneralCouponSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomSignalMessage$LiveGeneralCouponSignal(), p0);
    }
    public LiveRoomSignalMessage$LiveGeneralCouponSignal clear(){
       this.couponId = "";
       this.isNegative = false;
       this.subType = 0;
       this.displayIntervalMillis = 0;
       this.title = "";
       this.shouldRequest = false;
       this.requestDelaySecond = 0;
       this.couponInfo = null;
       this.randomTimeMills = 0;
       this.couponLink = "";
       this.pendSourceType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.couponId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.couponId);
       }
       LiveRoomSignalMessage$LiveGeneralCouponSignal tisNegative = this.isNegative;
       if (tisNegative != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tisNegative);
       }
       tisNegative = this.subType;
       if (tisNegative != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tisNegative);
       }
       tisNegative = this.displayIntervalMillis;
       if (tisNegative != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tisNegative);
       }
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.title);
       }
       tisNegative = this.shouldRequest;
       if (tisNegative != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, tisNegative);
       }
       tisNegative = this.requestDelaySecond;
       if (tisNegative != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, tisNegative);
       }
       tisNegative = this.couponInfo;
       if (tisNegative != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, tisNegative);
       }
       tisNegative = this.randomTimeMills;
       if (tisNegative != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(9, tisNegative);
       }
       if (!(this.couponLink).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.couponLink);
       }
       tisNegative = this.pendSourceType;
       if (tisNegative != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(11, tisNegative);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomSignalMessage$LiveGeneralCouponSignal mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.couponId = p0.readString();
                break;
              case 16:
                this.isNegative = p0.readBool();
                break;
              case 24:
                this.subType = p0.readUInt32();
                break;
              case 32:
                this.displayIntervalMillis = p0.readUInt32();
                break;
              case '*':
                this.title = p0.readString();
                break;
              case '0':
                this.shouldRequest = p0.readBool();
                break;
              case '8':
                this.requestDelaySecond = p0.readUInt32();
                break;
              case 'B':
                if (this.couponInfo == null) {
                   this.couponInfo = new LiveRoomSignalMessage$GeneralCouponInfo();
                }
                p0.readMessage(this.couponInfo);
                break;
              case 'H':
                this.randomTimeMills = p0.readUInt32();
                break;
              case 'R':
                this.couponLink = p0.readString();
                break;
              case 'X':
                this.pendSourceType = p0.readUInt32();
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
       if (!(this.couponId).equals(str)) {
          p0.writeString(1, this.couponId);
       }
       LiveRoomSignalMessage$LiveGeneralCouponSignal tisNegative = this.isNegative;
       if (tisNegative != null) {
          p0.writeBool(2, tisNegative);
       }
       tisNegative = this.subType;
       if (tisNegative != null) {
          p0.writeUInt32(3, tisNegative);
       }
       tisNegative = this.displayIntervalMillis;
       if (tisNegative != null) {
          p0.writeUInt32(4, tisNegative);
       }
       if (!(this.title).equals(str)) {
          p0.writeString(5, this.title);
       }
       tisNegative = this.shouldRequest;
       if (tisNegative != null) {
          p0.writeBool(6, tisNegative);
       }
       tisNegative = this.requestDelaySecond;
       if (tisNegative != null) {
          p0.writeUInt32(7, tisNegative);
       }
       tisNegative = this.couponInfo;
       if (tisNegative != null) {
          p0.writeMessage(8, tisNegative);
       }
       tisNegative = this.randomTimeMills;
       if (tisNegative != null) {
          p0.writeUInt32(9, tisNegative);
       }
       if (!(this.couponLink).equals(str)) {
          p0.writeString(10, this.couponLink);
       }
       tisNegative = this.pendSourceType;
       if (tisNegative != null) {
          p0.writeUInt32(11, tisNegative);
       }
       super.writeTo(p0);
       return;
    }
}
