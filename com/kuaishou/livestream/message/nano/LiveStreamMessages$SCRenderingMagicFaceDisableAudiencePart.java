package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCRenderingMagicFaceDisableAudiencePart;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCRenderingMagicFaceDisableAudiencePart extends MessageNano	// class@001363
{
    public long time;
    public static LiveStreamMessages$SCRenderingMagicFaceDisableAudiencePart[] _emptyArray;

    public void LiveStreamMessages$SCRenderingMagicFaceDisableAudiencePart(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCRenderingMagicFaceDisableAudiencePart[] emptyArray(){
       if (LiveStreamMessages$SCRenderingMagicFaceDisableAudiencePart._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCRenderingMagicFaceDisableAudiencePart._emptyArray == null) {
             LiveStreamMessages$SCRenderingMagicFaceDisableAudiencePart[] sCRenderingM = new LiveStreamMessages$SCRenderingMagicFaceDisableAudiencePart[0];
             LiveStreamMessages$SCRenderingMagicFaceDisableAudiencePart._emptyArray = sCRenderingM;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCRenderingMagicFaceDisableAudiencePart._emptyArray;
    }
    public static LiveStreamMessages$SCRenderingMagicFaceDisableAudiencePart parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCRenderingMagicFaceDisableAudiencePart().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCRenderingMagicFaceDisableAudiencePart parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCRenderingMagicFaceDisableAudiencePart(), p0);
    }
    public LiveStreamMessages$SCRenderingMagicFaceDisableAudiencePart clear(){
       this.time = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCRenderingMagicFaceDisableAudiencePart ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCRenderingMagicFaceDisableAudiencePart mergeFrom(CodedInputByteBufferNano p0){
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
       LiveStreamMessages$SCRenderingMagicFaceDisableAudiencePart ttime = this.time;
       if (ttime) {
          p0.writeUInt64(1, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
