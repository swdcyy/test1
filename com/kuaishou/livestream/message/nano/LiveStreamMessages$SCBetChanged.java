package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCBetChanged;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCBetChanged extends MessageNano	// class@001327
{
    public long maxDelayMillis;
    public static LiveStreamMessages$SCBetChanged[] _emptyArray;

    public void LiveStreamMessages$SCBetChanged(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCBetChanged[] emptyArray(){
       if (LiveStreamMessages$SCBetChanged._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCBetChanged._emptyArray == null) {
             LiveStreamMessages$SCBetChanged[] sCBetChanged = new LiveStreamMessages$SCBetChanged[0];
             LiveStreamMessages$SCBetChanged._emptyArray = sCBetChanged;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCBetChanged._emptyArray;
    }
    public static LiveStreamMessages$SCBetChanged parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCBetChanged().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCBetChanged parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCBetChanged(), p0);
    }
    public LiveStreamMessages$SCBetChanged clear(){
       this.maxDelayMillis = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCBetChanged tmaxDelayMil = this.maxDelayMillis;
       if (tmaxDelayMil) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tmaxDelayMil);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCBetChanged mergeFrom(CodedInputByteBufferNano p0){
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
       LiveStreamMessages$SCBetChanged tmaxDelayMil = this.maxDelayMillis;
       if (tmaxDelayMil) {
          p0.writeUInt64(1, tmaxDelayMil);
       }
       super.writeTo(p0);
       return;
    }
}
