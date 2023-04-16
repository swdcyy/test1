package com.kuaishou.protobuf.livestream.nano.LiveRevenueDeliverySellingChatInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveRevenueDeliverySellingChatInfo extends MessageNano	// class@000d06
{
    public int billingType;
    public static LiveRevenueDeliverySellingChatInfo[] _emptyArray;

    public void LiveRevenueDeliverySellingChatInfo(){
       super();
       this.clear();
    }
    public static LiveRevenueDeliverySellingChatInfo[] emptyArray(){
       if (LiveRevenueDeliverySellingChatInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRevenueDeliverySellingChatInfo._emptyArray == null) {
             LiveRevenueDeliverySellingChatInfo[] liveRevenueD = new LiveRevenueDeliverySellingChatInfo[0];
             LiveRevenueDeliverySellingChatInfo._emptyArray = liveRevenueD;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRevenueDeliverySellingChatInfo._emptyArray;
    }
    public static LiveRevenueDeliverySellingChatInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveRevenueDeliverySellingChatInfo().mergeFrom(p0);
    }
    public static LiveRevenueDeliverySellingChatInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRevenueDeliverySellingChatInfo(), p0);
    }
    public LiveRevenueDeliverySellingChatInfo clear(){
       this.billingType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveRevenueDeliverySellingChatInfo tbillingType = this.billingType;
       if (tbillingType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tbillingType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRevenueDeliverySellingChatInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             this.billingType = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveRevenueDeliverySellingChatInfo tbillingType = this.billingType;
       if (tbillingType != null) {
          p0.writeUInt32(1, tbillingType);
       }
       super.writeTo(p0);
       return;
    }
}
