package com.kuaishou.protobuf.merchant.message.nano.DeliveryCouponMessages$DeliveryCouponInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.merchant.message.nano.DeliveryCouponMessages$CouponInfo;

public final class DeliveryCouponMessages$DeliveryCouponInfo extends MessageNano	// class@000df1
{
    public DeliveryCouponMessages$CouponInfo couponInfo;
    public String deliveryId;
    public long endTime;
    public long startTime;
    public static DeliveryCouponMessages$DeliveryCouponInfo[] _emptyArray;

    public void DeliveryCouponMessages$DeliveryCouponInfo(){
       super();
       this.clear();
    }
    public static DeliveryCouponMessages$DeliveryCouponInfo[] emptyArray(){
       if (DeliveryCouponMessages$DeliveryCouponInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (DeliveryCouponMessages$DeliveryCouponInfo._emptyArray == null) {
             DeliveryCouponMessages$DeliveryCouponInfo[] uDeliveryCou = new DeliveryCouponMessages$DeliveryCouponInfo[0];
             DeliveryCouponMessages$DeliveryCouponInfo._emptyArray = uDeliveryCou;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return DeliveryCouponMessages$DeliveryCouponInfo._emptyArray;
    }
    public static DeliveryCouponMessages$DeliveryCouponInfo parseFrom(CodedInputByteBufferNano p0){
       return new DeliveryCouponMessages$DeliveryCouponInfo().mergeFrom(p0);
    }
    public static DeliveryCouponMessages$DeliveryCouponInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new DeliveryCouponMessages$DeliveryCouponInfo(), p0);
    }
    public DeliveryCouponMessages$DeliveryCouponInfo clear(){
       this.deliveryId = "";
       this.startTime = 0;
       this.endTime = 0;
       this.couponInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.deliveryId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.deliveryId);
       }
       DeliveryCouponMessages$DeliveryCouponInfo tstartTime = this.startTime;
       int i1 = 0;
       if (tstartTime - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(2, tstartTime);
       }
       tstartTime = this.endTime;
       if (tstartTime - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(3, tstartTime);
       }
       tstartTime = this.couponInfo;
       if (tstartTime != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, tstartTime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public DeliveryCouponMessages$DeliveryCouponInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 42) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else if(this.couponInfo == null){
                      this.couponInfo = new DeliveryCouponMessages$CouponInfo();
                   }
                   p0.readMessage(this.couponInfo);
                }else {
                   this.endTime = p0.readInt64();
                }
             }else {
                this.startTime = p0.readInt64();
             }
          }else {
             this.deliveryId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.deliveryId).equals("")) {
          p0.writeString(1, this.deliveryId);
       }
       DeliveryCouponMessages$DeliveryCouponInfo tstartTime = this.startTime;
       int i = 0;
       if (tstartTime - i) {
          p0.writeInt64(2, tstartTime);
       }
       tstartTime = this.endTime;
       if (tstartTime - i) {
          p0.writeInt64(3, tstartTime);
       }
       tstartTime = this.couponInfo;
       if (tstartTime != null) {
          p0.writeMessage(5, tstartTime);
       }
       super.writeTo(p0);
       return;
    }
}
