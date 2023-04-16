package com.kuaishou.protobuf.merchant.message.nano.LiveRoomPushCouponMessage$SCKwaishopLivePushCoupon;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.merchant.message.nano.LiveRoomPushCouponMessage$PushCouponInfo;

public final class LiveRoomPushCouponMessage$SCKwaishopLivePushCoupon extends MessageNano	// class@000df4
{
    public LiveRoomPushCouponMessage$PushCouponInfo couponInfo;
    public int sceneType;
    public static LiveRoomPushCouponMessage$SCKwaishopLivePushCoupon[] _emptyArray;

    public void LiveRoomPushCouponMessage$SCKwaishopLivePushCoupon(){
       super();
       this.clear();
    }
    public static LiveRoomPushCouponMessage$SCKwaishopLivePushCoupon[] emptyArray(){
       if (LiveRoomPushCouponMessage$SCKwaishopLivePushCoupon._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomPushCouponMessage$SCKwaishopLivePushCoupon._emptyArray == null) {
             LiveRoomPushCouponMessage$SCKwaishopLivePushCoupon[] sCKwaishopLi = new LiveRoomPushCouponMessage$SCKwaishopLivePushCoupon[0];
             LiveRoomPushCouponMessage$SCKwaishopLivePushCoupon._emptyArray = sCKwaishopLi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomPushCouponMessage$SCKwaishopLivePushCoupon._emptyArray;
    }
    public static LiveRoomPushCouponMessage$SCKwaishopLivePushCoupon parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomPushCouponMessage$SCKwaishopLivePushCoupon().mergeFrom(p0);
    }
    public static LiveRoomPushCouponMessage$SCKwaishopLivePushCoupon parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomPushCouponMessage$SCKwaishopLivePushCoupon(), p0);
    }
    public LiveRoomPushCouponMessage$SCKwaishopLivePushCoupon clear(){
       this.sceneType = 0;
       this.couponInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveRoomPushCouponMessage$SCKwaishopLivePushCoupon tsceneType = this.sceneType;
       if (tsceneType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tsceneType);
       }
       tsceneType = this.couponInfo;
       if (tsceneType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tsceneType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomPushCouponMessage$SCKwaishopLivePushCoupon mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else if(this.couponInfo == null){
                this.couponInfo = new LiveRoomPushCouponMessage$PushCouponInfo();
             }
             p0.readMessage(this.couponInfo);
          }else {
             this.sceneType = p0.readInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveRoomPushCouponMessage$SCKwaishopLivePushCoupon tsceneType = this.sceneType;
       if (tsceneType != null) {
          p0.writeInt32(1, tsceneType);
       }
       tsceneType = this.couponInfo;
       if (tsceneType != null) {
          p0.writeMessage(2, tsceneType);
       }
       super.writeTo(p0);
       return;
    }
}
