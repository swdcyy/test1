package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCShopThirdControl;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCShopThirdControl extends MessageNano	// class@00136c
{
    public boolean negative;
    public static LiveStreamMessages$SCShopThirdControl[] _emptyArray;

    public void LiveStreamMessages$SCShopThirdControl(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCShopThirdControl[] emptyArray(){
       if (LiveStreamMessages$SCShopThirdControl._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCShopThirdControl._emptyArray == null) {
             LiveStreamMessages$SCShopThirdControl[] sCShopThirdC = new LiveStreamMessages$SCShopThirdControl[0];
             LiveStreamMessages$SCShopThirdControl._emptyArray = sCShopThirdC;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCShopThirdControl._emptyArray;
    }
    public static LiveStreamMessages$SCShopThirdControl parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCShopThirdControl().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCShopThirdControl parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCShopThirdControl(), p0);
    }
    public LiveStreamMessages$SCShopThirdControl clear(){
       this.negative = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCShopThirdControl tnegative = this.negative;
       if (tnegative != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tnegative);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCShopThirdControl mergeFrom(CodedInputByteBufferNano p0){
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
             this.negative = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCShopThirdControl tnegative = this.negative;
       if (tnegative != null) {
          p0.writeBool(1, tnegative);
       }
       super.writeTo(p0);
       return;
    }
}
