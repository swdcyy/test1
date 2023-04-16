package com.kuaishou.protobuf.merchant.message.nano.LiveRoomPushCouponMessage$SCKwaishopLiveSkyFallPendantDestroy;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveRoomPushCouponMessage$SCKwaishopLiveSkyFallPendantDestroy extends MessageNano	// class@000df5
{
    public String buyerCouponId;
    public static LiveRoomPushCouponMessage$SCKwaishopLiveSkyFallPendantDestroy[] _emptyArray;

    public void LiveRoomPushCouponMessage$SCKwaishopLiveSkyFallPendantDestroy(){
       super();
       this.clear();
    }
    public static LiveRoomPushCouponMessage$SCKwaishopLiveSkyFallPendantDestroy[] emptyArray(){
       if (LiveRoomPushCouponMessage$SCKwaishopLiveSkyFallPendantDestroy._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomPushCouponMessage$SCKwaishopLiveSkyFallPendantDestroy._emptyArray == null) {
             LiveRoomPushCouponMessage$SCKwaishopLiveSkyFallPendantDestroy[] sCKwaishopLi = new LiveRoomPushCouponMessage$SCKwaishopLiveSkyFallPendantDestroy[0];
             LiveRoomPushCouponMessage$SCKwaishopLiveSkyFallPendantDestroy._emptyArray = sCKwaishopLi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomPushCouponMessage$SCKwaishopLiveSkyFallPendantDestroy._emptyArray;
    }
    public static LiveRoomPushCouponMessage$SCKwaishopLiveSkyFallPendantDestroy parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomPushCouponMessage$SCKwaishopLiveSkyFallPendantDestroy().mergeFrom(p0);
    }
    public static LiveRoomPushCouponMessage$SCKwaishopLiveSkyFallPendantDestroy parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomPushCouponMessage$SCKwaishopLiveSkyFallPendantDestroy(), p0);
    }
    public LiveRoomPushCouponMessage$SCKwaishopLiveSkyFallPendantDestroy clear(){
       this.buyerCouponId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.buyerCouponId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.buyerCouponId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomPushCouponMessage$SCKwaishopLiveSkyFallPendantDestroy mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             this.buyerCouponId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.buyerCouponId).equals("")) {
          p0.writeString(1, this.buyerCouponId);
       }
       super.writeTo(p0);
       return;
    }
}
