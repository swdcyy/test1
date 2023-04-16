package com.kuaishou.protobuf.merchant.message.nano.DeliveryCouponMessages$CurrentLiveDeliveryCouponStateSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.merchant.message.nano.DeliveryCouponMessages$DeliveryCouponInfo;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class DeliveryCouponMessages$CurrentLiveDeliveryCouponStateSignal extends MessageNano	// class@000df0
{
    public DeliveryCouponMessages$DeliveryCouponInfo[] deliveryCouponInfo;
    public boolean needClientCheckReceive;
    public long signalTime;
    public static DeliveryCouponMessages$CurrentLiveDeliveryCouponStateSignal[] _emptyArray;

    public void DeliveryCouponMessages$CurrentLiveDeliveryCouponStateSignal(){
       super();
       this.clear();
    }
    public static DeliveryCouponMessages$CurrentLiveDeliveryCouponStateSignal[] emptyArray(){
       if (DeliveryCouponMessages$CurrentLiveDeliveryCouponStateSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (DeliveryCouponMessages$CurrentLiveDeliveryCouponStateSignal._emptyArray == null) {
             DeliveryCouponMessages$CurrentLiveDeliveryCouponStateSignal[] uCurrentLive = new DeliveryCouponMessages$CurrentLiveDeliveryCouponStateSignal[0];
             DeliveryCouponMessages$CurrentLiveDeliveryCouponStateSignal._emptyArray = uCurrentLive;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return DeliveryCouponMessages$CurrentLiveDeliveryCouponStateSignal._emptyArray;
    }
    public static DeliveryCouponMessages$CurrentLiveDeliveryCouponStateSignal parseFrom(CodedInputByteBufferNano p0){
       return new DeliveryCouponMessages$CurrentLiveDeliveryCouponStateSignal().mergeFrom(p0);
    }
    public static DeliveryCouponMessages$CurrentLiveDeliveryCouponStateSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new DeliveryCouponMessages$CurrentLiveDeliveryCouponStateSignal(), p0);
    }
    public DeliveryCouponMessages$CurrentLiveDeliveryCouponStateSignal clear(){
       this.deliveryCouponInfo = DeliveryCouponMessages$DeliveryCouponInfo.emptyArray();
       this.needClientCheckReceive = false;
       this.signalTime = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       DeliveryCouponMessages$CurrentLiveDeliveryCouponStateSignal tdeliveryCou = this.deliveryCouponInfo;
       if (tdeliveryCou != null && tdeliveryCou.length > 0) {
          int i1 = 0;
          DeliveryCouponMessages$CurrentLiveDeliveryCouponStateSignal tdeliveryCou1 = this.deliveryCouponInfo;
          while (i1 < tdeliveryCou1.length) {
             object oobject = tdeliveryCou1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tdeliveryCou = this.needClientCheckReceive;
       if (tdeliveryCou != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tdeliveryCou);
       }
       tdeliveryCou = this.signalTime;
       if (tdeliveryCou) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(3, tdeliveryCou);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public DeliveryCouponMessages$CurrentLiveDeliveryCouponStateSignal mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 16) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.signalTime = p0.readInt64();
                }
             }else {
                this.needClientCheckReceive = p0.readBool();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             DeliveryCouponMessages$CurrentLiveDeliveryCouponStateSignal tdeliveryCou = this.deliveryCouponInfo;
             int i2 = (tdeliveryCou == null)? 0: tdeliveryCou.length;
             i = i + i2;
             DeliveryCouponMessages$DeliveryCouponInfo[] uDeliveryCou = new DeliveryCouponMessages$DeliveryCouponInfo[i];
             if (i2) {
                System.arraycopy(tdeliveryCou, 0, uDeliveryCou, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                uDeliveryCou[i2] = new DeliveryCouponMessages$DeliveryCouponInfo();
                p0.readMessage(uDeliveryCou[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             uDeliveryCou[i2] = new DeliveryCouponMessages$DeliveryCouponInfo();
             p0.readMessage(uDeliveryCou[i2]);
             this.deliveryCouponInfo = uDeliveryCou;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       DeliveryCouponMessages$CurrentLiveDeliveryCouponStateSignal tdeliveryCou = this.deliveryCouponInfo;
       if (tdeliveryCou != null && tdeliveryCou.length > 0) {
          int i = 0;
          DeliveryCouponMessages$CurrentLiveDeliveryCouponStateSignal tdeliveryCou1 = this.deliveryCouponInfo;
          while (i < tdeliveryCou1.length) {
             object oobject = tdeliveryCou1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       tdeliveryCou = this.needClientCheckReceive;
       if (tdeliveryCou != null) {
          p0.writeBool(2, tdeliveryCou);
       }
       tdeliveryCou = this.signalTime;
       if (tdeliveryCou) {
          p0.writeInt64(3, tdeliveryCou);
       }
       super.writeTo(p0);
       return;
    }
}
