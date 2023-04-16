package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCGzoneVirtualTradeClosed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCGzoneVirtualTradeClosed extends MessageNano	// class@001335
{
    public long time;
    public static LiveStreamMessages$SCGzoneVirtualTradeClosed[] _emptyArray;

    public void LiveStreamMessages$SCGzoneVirtualTradeClosed(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCGzoneVirtualTradeClosed[] emptyArray(){
       if (LiveStreamMessages$SCGzoneVirtualTradeClosed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCGzoneVirtualTradeClosed._emptyArray == null) {
             LiveStreamMessages$SCGzoneVirtualTradeClosed[] sCGzoneVirtu = new LiveStreamMessages$SCGzoneVirtualTradeClosed[0];
             LiveStreamMessages$SCGzoneVirtualTradeClosed._emptyArray = sCGzoneVirtu;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCGzoneVirtualTradeClosed._emptyArray;
    }
    public static LiveStreamMessages$SCGzoneVirtualTradeClosed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCGzoneVirtualTradeClosed().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCGzoneVirtualTradeClosed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCGzoneVirtualTradeClosed(), p0);
    }
    public LiveStreamMessages$SCGzoneVirtualTradeClosed clear(){
       this.time = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCGzoneVirtualTradeClosed ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCGzoneVirtualTradeClosed mergeFrom(CodedInputByteBufferNano p0){
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
       LiveStreamMessages$SCGzoneVirtualTradeClosed ttime = this.time;
       if (ttime) {
          p0.writeUInt64(1, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
