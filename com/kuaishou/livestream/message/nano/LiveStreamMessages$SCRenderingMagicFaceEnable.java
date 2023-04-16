package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCRenderingMagicFaceEnable;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCRenderingMagicFaceEnable extends MessageNano	// class@001365
{
    public long time;
    public static LiveStreamMessages$SCRenderingMagicFaceEnable[] _emptyArray;

    public void LiveStreamMessages$SCRenderingMagicFaceEnable(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCRenderingMagicFaceEnable[] emptyArray(){
       if (LiveStreamMessages$SCRenderingMagicFaceEnable._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCRenderingMagicFaceEnable._emptyArray == null) {
             LiveStreamMessages$SCRenderingMagicFaceEnable[] sCRenderingM = new LiveStreamMessages$SCRenderingMagicFaceEnable[0];
             LiveStreamMessages$SCRenderingMagicFaceEnable._emptyArray = sCRenderingM;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCRenderingMagicFaceEnable._emptyArray;
    }
    public static LiveStreamMessages$SCRenderingMagicFaceEnable parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCRenderingMagicFaceEnable().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCRenderingMagicFaceEnable parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCRenderingMagicFaceEnable(), p0);
    }
    public LiveStreamMessages$SCRenderingMagicFaceEnable clear(){
       this.time = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCRenderingMagicFaceEnable ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCRenderingMagicFaceEnable mergeFrom(CodedInputByteBufferNano p0){
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
       LiveStreamMessages$SCRenderingMagicFaceEnable ttime = this.time;
       if (ttime) {
          p0.writeUInt64(1, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
