package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCRenderingMagicFaceDisable;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCRenderingMagicFaceDisable extends MessageNano	// class@001362
{
    public long time;
    public static LiveStreamMessages$SCRenderingMagicFaceDisable[] _emptyArray;

    public void LiveStreamMessages$SCRenderingMagicFaceDisable(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCRenderingMagicFaceDisable[] emptyArray(){
       if (LiveStreamMessages$SCRenderingMagicFaceDisable._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCRenderingMagicFaceDisable._emptyArray == null) {
             LiveStreamMessages$SCRenderingMagicFaceDisable[] sCRenderingM = new LiveStreamMessages$SCRenderingMagicFaceDisable[0];
             LiveStreamMessages$SCRenderingMagicFaceDisable._emptyArray = sCRenderingM;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCRenderingMagicFaceDisable._emptyArray;
    }
    public static LiveStreamMessages$SCRenderingMagicFaceDisable parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCRenderingMagicFaceDisable().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCRenderingMagicFaceDisable parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCRenderingMagicFaceDisable(), p0);
    }
    public LiveStreamMessages$SCRenderingMagicFaceDisable clear(){
       this.time = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCRenderingMagicFaceDisable ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCRenderingMagicFaceDisable mergeFrom(CodedInputByteBufferNano p0){
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
             this.time = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCRenderingMagicFaceDisable ttime = this.time;
       if (ttime) {
          p0.writeUInt64(1, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
