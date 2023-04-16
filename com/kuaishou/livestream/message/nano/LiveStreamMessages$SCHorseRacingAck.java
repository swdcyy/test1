package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCHorseRacingAck;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCHorseRacingAck extends MessageNano	// class@001337
{
    public long time;
    public static LiveStreamMessages$SCHorseRacingAck[] _emptyArray;

    public void LiveStreamMessages$SCHorseRacingAck(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCHorseRacingAck[] emptyArray(){
       if (LiveStreamMessages$SCHorseRacingAck._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCHorseRacingAck._emptyArray == null) {
             LiveStreamMessages$SCHorseRacingAck[] sCHorseRacin = new LiveStreamMessages$SCHorseRacingAck[0];
             LiveStreamMessages$SCHorseRacingAck._emptyArray = sCHorseRacin;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCHorseRacingAck._emptyArray;
    }
    public static LiveStreamMessages$SCHorseRacingAck parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCHorseRacingAck().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCHorseRacingAck parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCHorseRacingAck(), p0);
    }
    public LiveStreamMessages$SCHorseRacingAck clear(){
       this.time = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCHorseRacingAck ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCHorseRacingAck mergeFrom(CodedInputByteBufferNano p0){
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
       LiveStreamMessages$SCHorseRacingAck ttime = this.time;
       if (ttime) {
          p0.writeUInt64(1, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
