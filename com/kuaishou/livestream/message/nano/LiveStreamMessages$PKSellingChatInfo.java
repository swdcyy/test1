package com.kuaishou.livestream.message.nano.LiveStreamMessages$PKSellingChatInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$PKSellingChatInfo extends MessageNano	// class@00130d
{
    public int billingType;
    public static LiveStreamMessages$PKSellingChatInfo[] _emptyArray;

    public void LiveStreamMessages$PKSellingChatInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$PKSellingChatInfo[] emptyArray(){
       if (LiveStreamMessages$PKSellingChatInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$PKSellingChatInfo._emptyArray == null) {
             LiveStreamMessages$PKSellingChatInfo[] pKSellingCha = new LiveStreamMessages$PKSellingChatInfo[0];
             LiveStreamMessages$PKSellingChatInfo._emptyArray = pKSellingCha;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$PKSellingChatInfo._emptyArray;
    }
    public static LiveStreamMessages$PKSellingChatInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$PKSellingChatInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$PKSellingChatInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$PKSellingChatInfo(), p0);
    }
    public LiveStreamMessages$PKSellingChatInfo clear(){
       this.billingType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$PKSellingChatInfo tbillingType = this.billingType;
       if (tbillingType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tbillingType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$PKSellingChatInfo mergeFrom(CodedInputByteBufferNano p0){
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
       LiveStreamMessages$PKSellingChatInfo tbillingType = this.billingType;
       if (tbillingType != null) {
          p0.writeUInt32(1, tbillingType);
       }
       super.writeTo(p0);
       return;
    }
}
