package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCRenderingMagicFaceEnableAuthorPart;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCRenderingMagicFaceEnableAuthorPart extends MessageNano	// class@001367
{
    public long time;
    public static LiveStreamMessages$SCRenderingMagicFaceEnableAuthorPart[] _emptyArray;

    public void LiveStreamMessages$SCRenderingMagicFaceEnableAuthorPart(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCRenderingMagicFaceEnableAuthorPart[] emptyArray(){
       if (LiveStreamMessages$SCRenderingMagicFaceEnableAuthorPart._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCRenderingMagicFaceEnableAuthorPart._emptyArray == null) {
             LiveStreamMessages$SCRenderingMagicFaceEnableAuthorPart[] sCRenderingM = new LiveStreamMessages$SCRenderingMagicFaceEnableAuthorPart[0];
             LiveStreamMessages$SCRenderingMagicFaceEnableAuthorPart._emptyArray = sCRenderingM;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCRenderingMagicFaceEnableAuthorPart._emptyArray;
    }
    public static LiveStreamMessages$SCRenderingMagicFaceEnableAuthorPart parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCRenderingMagicFaceEnableAuthorPart().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCRenderingMagicFaceEnableAuthorPart parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCRenderingMagicFaceEnableAuthorPart(), p0);
    }
    public LiveStreamMessages$SCRenderingMagicFaceEnableAuthorPart clear(){
       this.time = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCRenderingMagicFaceEnableAuthorPart ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCRenderingMagicFaceEnableAuthorPart mergeFrom(CodedInputByteBufferNano p0){
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
       LiveStreamMessages$SCRenderingMagicFaceEnableAuthorPart ttime = this.time;
       if (ttime) {
          p0.writeUInt64(1, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
