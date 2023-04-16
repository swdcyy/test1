package com.kuaishou.livestream.message.nano.LiveStreamMessages$CSRaceLose;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$CSRaceLose extends MessageNano	// class@0012c2
{
    public long time;
    public static LiveStreamMessages$CSRaceLose[] _emptyArray;

    public void LiveStreamMessages$CSRaceLose(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$CSRaceLose[] emptyArray(){
       if (LiveStreamMessages$CSRaceLose._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$CSRaceLose._emptyArray == null) {
             LiveStreamMessages$CSRaceLose[] uCSRaceLoseA = new LiveStreamMessages$CSRaceLose[0];
             LiveStreamMessages$CSRaceLose._emptyArray = uCSRaceLoseA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$CSRaceLose._emptyArray;
    }
    public static LiveStreamMessages$CSRaceLose parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$CSRaceLose().mergeFrom(p0);
    }
    public static LiveStreamMessages$CSRaceLose parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$CSRaceLose(), p0);
    }
    public LiveStreamMessages$CSRaceLose clear(){
       this.time = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$CSRaceLose ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$CSRaceLose mergeFrom(CodedInputByteBufferNano p0){
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
       LiveStreamMessages$CSRaceLose ttime = this.time;
       if (ttime) {
          p0.writeUInt64(1, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
