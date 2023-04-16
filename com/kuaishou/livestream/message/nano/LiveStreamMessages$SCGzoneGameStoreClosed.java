package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCGzoneGameStoreClosed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCGzoneGameStoreClosed extends MessageNano	// class@001330
{
    public static LiveStreamMessages$SCGzoneGameStoreClosed[] _emptyArray;

    public void LiveStreamMessages$SCGzoneGameStoreClosed(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCGzoneGameStoreClosed[] emptyArray(){
       if (LiveStreamMessages$SCGzoneGameStoreClosed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCGzoneGameStoreClosed._emptyArray == null) {
             LiveStreamMessages$SCGzoneGameStoreClosed[] sCGzoneGameS = new LiveStreamMessages$SCGzoneGameStoreClosed[0];
             LiveStreamMessages$SCGzoneGameStoreClosed._emptyArray = sCGzoneGameS;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCGzoneGameStoreClosed._emptyArray;
    }
    public static LiveStreamMessages$SCGzoneGameStoreClosed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCGzoneGameStoreClosed().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCGzoneGameStoreClosed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCGzoneGameStoreClosed(), p0);
    }
    public LiveStreamMessages$SCGzoneGameStoreClosed clear(){
       this.cachedSize = -1;
       return this;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCGzoneGameStoreClosed mergeFrom(CodedInputByteBufferNano p0){
       int i;
       do {
          i = p0.readTag();
       } while (!i || !WireFormatNano.parseUnknownField(p0, i));
       return this;
    }
}
