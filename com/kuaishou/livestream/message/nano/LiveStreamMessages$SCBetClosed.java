package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCBetClosed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCBetClosed extends MessageNano	// class@001328
{
    public long maxDelayMillis;
    public static LiveStreamMessages$SCBetClosed[] _emptyArray;

    public void LiveStreamMessages$SCBetClosed(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCBetClosed[] emptyArray(){
       if (LiveStreamMessages$SCBetClosed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCBetClosed._emptyArray == null) {
             LiveStreamMessages$SCBetClosed[] sCBetClosedA = new LiveStreamMessages$SCBetClosed[0];
             LiveStreamMessages$SCBetClosed._emptyArray = sCBetClosedA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCBetClosed._emptyArray;
    }
    public static LiveStreamMessages$SCBetClosed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCBetClosed().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCBetClosed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCBetClosed(), p0);
    }
    public LiveStreamMessages$SCBetClosed clear(){
       this.maxDelayMillis = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCBetClosed tmaxDelayMil = this.maxDelayMillis;
       if (tmaxDelayMil) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tmaxDelayMil);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCBetClosed mergeFrom(CodedInputByteBufferNano p0){
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
             this.maxDelayMillis = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCBetClosed tmaxDelayMil = this.maxDelayMillis;
       if (tmaxDelayMil) {
          p0.writeUInt64(1, tmaxDelayMil);
       }
       super.writeTo(p0);
       return;
    }
}
