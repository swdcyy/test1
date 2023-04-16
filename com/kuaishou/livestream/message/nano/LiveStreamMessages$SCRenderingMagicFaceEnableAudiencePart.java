package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCRenderingMagicFaceEnableAudiencePart;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCRenderingMagicFaceEnableAudiencePart extends MessageNano	// class@001366
{
    public long time;
    public static LiveStreamMessages$SCRenderingMagicFaceEnableAudiencePart[] _emptyArray;

    public void LiveStreamMessages$SCRenderingMagicFaceEnableAudiencePart(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCRenderingMagicFaceEnableAudiencePart[] emptyArray(){
       if (LiveStreamMessages$SCRenderingMagicFaceEnableAudiencePart._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCRenderingMagicFaceEnableAudiencePart._emptyArray == null) {
             LiveStreamMessages$SCRenderingMagicFaceEnableAudiencePart[] sCRenderingM = new LiveStreamMessages$SCRenderingMagicFaceEnableAudiencePart[0];
             LiveStreamMessages$SCRenderingMagicFaceEnableAudiencePart._emptyArray = sCRenderingM;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCRenderingMagicFaceEnableAudiencePart._emptyArray;
    }
    public static LiveStreamMessages$SCRenderingMagicFaceEnableAudiencePart parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCRenderingMagicFaceEnableAudiencePart().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCRenderingMagicFaceEnableAudiencePart parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCRenderingMagicFaceEnableAudiencePart(), p0);
    }
    public LiveStreamMessages$SCRenderingMagicFaceEnableAudiencePart clear(){
       this.time = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCRenderingMagicFaceEnableAudiencePart ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCRenderingMagicFaceEnableAudiencePart mergeFrom(CodedInputByteBufferNano p0){
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
       LiveStreamMessages$SCRenderingMagicFaceEnableAudiencePart ttime = this.time;
       if (ttime) {
          p0.writeUInt64(1, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
