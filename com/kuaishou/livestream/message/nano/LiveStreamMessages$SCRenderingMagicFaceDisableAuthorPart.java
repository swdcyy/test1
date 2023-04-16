package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCRenderingMagicFaceDisableAuthorPart;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCRenderingMagicFaceDisableAuthorPart extends MessageNano	// class@001364
{
    public long time;
    public static LiveStreamMessages$SCRenderingMagicFaceDisableAuthorPart[] _emptyArray;

    public void LiveStreamMessages$SCRenderingMagicFaceDisableAuthorPart(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCRenderingMagicFaceDisableAuthorPart[] emptyArray(){
       if (LiveStreamMessages$SCRenderingMagicFaceDisableAuthorPart._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCRenderingMagicFaceDisableAuthorPart._emptyArray == null) {
             LiveStreamMessages$SCRenderingMagicFaceDisableAuthorPart[] sCRenderingM = new LiveStreamMessages$SCRenderingMagicFaceDisableAuthorPart[0];
             LiveStreamMessages$SCRenderingMagicFaceDisableAuthorPart._emptyArray = sCRenderingM;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCRenderingMagicFaceDisableAuthorPart._emptyArray;
    }
    public static LiveStreamMessages$SCRenderingMagicFaceDisableAuthorPart parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCRenderingMagicFaceDisableAuthorPart().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCRenderingMagicFaceDisableAuthorPart parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCRenderingMagicFaceDisableAuthorPart(), p0);
    }
    public LiveStreamMessages$SCRenderingMagicFaceDisableAuthorPart clear(){
       this.time = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCRenderingMagicFaceDisableAuthorPart ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCRenderingMagicFaceDisableAuthorPart mergeFrom(CodedInputByteBufferNano p0){
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
       LiveStreamMessages$SCRenderingMagicFaceDisableAuthorPart ttime = this.time;
       if (ttime) {
          p0.writeUInt64(1, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
