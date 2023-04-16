package com.kuaishou.protobuf.merchant.message.nano.DeliveryCouponMessages$CloseDeliveryCouponActionSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class DeliveryCouponMessages$CloseDeliveryCouponActionSignal extends MessageNano	// class@000ded
{
    public String deliveryId;
    public int deliveryType;
    public static DeliveryCouponMessages$CloseDeliveryCouponActionSignal[] _emptyArray;

    public void DeliveryCouponMessages$CloseDeliveryCouponActionSignal(){
       super();
       this.clear();
    }
    public static DeliveryCouponMessages$CloseDeliveryCouponActionSignal[] emptyArray(){
       if (DeliveryCouponMessages$CloseDeliveryCouponActionSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (DeliveryCouponMessages$CloseDeliveryCouponActionSignal._emptyArray == null) {
             DeliveryCouponMessages$CloseDeliveryCouponActionSignal[] uCloseDelive = new DeliveryCouponMessages$CloseDeliveryCouponActionSignal[0];
             DeliveryCouponMessages$CloseDeliveryCouponActionSignal._emptyArray = uCloseDelive;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return DeliveryCouponMessages$CloseDeliveryCouponActionSignal._emptyArray;
    }
    public static DeliveryCouponMessages$CloseDeliveryCouponActionSignal parseFrom(CodedInputByteBufferNano p0){
       return new DeliveryCouponMessages$CloseDeliveryCouponActionSignal().mergeFrom(p0);
    }
    public static DeliveryCouponMessages$CloseDeliveryCouponActionSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new DeliveryCouponMessages$CloseDeliveryCouponActionSignal(), p0);
    }
    public DeliveryCouponMessages$CloseDeliveryCouponActionSignal clear(){
       this.deliveryId = "";
       this.deliveryType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.deliveryId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.deliveryId);
       }
       DeliveryCouponMessages$CloseDeliveryCouponActionSignal tdeliveryTyp = this.deliveryType;
       if (tdeliveryTyp != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tdeliveryTyp);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public DeliveryCouponMessages$CloseDeliveryCouponActionSignal mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.deliveryType = i;
                }
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
       DeliveryCouponMessages$CloseDeliveryCouponActionSignal tdeliveryTyp = this.deliveryType;
       if (tdeliveryTyp != null) {
          p0.writeInt32(2, tdeliveryTyp);
       }
       super.writeTo(p0);
       return;
    }
}
