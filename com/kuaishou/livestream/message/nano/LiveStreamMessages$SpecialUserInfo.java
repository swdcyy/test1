package com.kuaishou.livestream.message.nano.LiveStreamMessages$SpecialUserInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SpecialUserInfo extends MessageNano	// class@00137d
{
    public int onSaleCount;
    public static LiveStreamMessages$SpecialUserInfo[] _emptyArray;

    public void LiveStreamMessages$SpecialUserInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SpecialUserInfo[] emptyArray(){
       if (LiveStreamMessages$SpecialUserInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SpecialUserInfo._emptyArray == null) {
             LiveStreamMessages$SpecialUserInfo[] specialUserI = new LiveStreamMessages$SpecialUserInfo[0];
             LiveStreamMessages$SpecialUserInfo._emptyArray = specialUserI;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SpecialUserInfo._emptyArray;
    }
    public static LiveStreamMessages$SpecialUserInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SpecialUserInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$SpecialUserInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SpecialUserInfo(), p0);
    }
    public LiveStreamMessages$SpecialUserInfo clear(){
       this.onSaleCount = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SpecialUserInfo tonSaleCount = this.onSaleCount;
       if (tonSaleCount != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tonSaleCount);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SpecialUserInfo mergeFrom(CodedInputByteBufferNano p0){
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
             this.onSaleCount = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SpecialUserInfo tonSaleCount = this.onSaleCount;
       if (tonSaleCount != null) {
          p0.writeUInt32(1, tonSaleCount);
       }
       super.writeTo(p0);
       return;
    }
}
