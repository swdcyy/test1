package com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateClose;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveBlindDateSignalMessages$SCLiveBlindDateClose extends MessageNano	// class@001116
{
    public long time;
    public static LiveBlindDateSignalMessages$SCLiveBlindDateClose[] _emptyArray;

    public void LiveBlindDateSignalMessages$SCLiveBlindDateClose(){
       super();
       this.clear();
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateClose[] emptyArray(){
       if (LiveBlindDateSignalMessages$SCLiveBlindDateClose._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveBlindDateSignalMessages$SCLiveBlindDateClose._emptyArray == null) {
             LiveBlindDateSignalMessages$SCLiveBlindDateClose[] sCLiveBlindD = new LiveBlindDateSignalMessages$SCLiveBlindDateClose[0];
             LiveBlindDateSignalMessages$SCLiveBlindDateClose._emptyArray = sCLiveBlindD;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveBlindDateSignalMessages$SCLiveBlindDateClose._emptyArray;
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateClose parseFrom(CodedInputByteBufferNano p0){
       return new LiveBlindDateSignalMessages$SCLiveBlindDateClose().mergeFrom(p0);
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateClose parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveBlindDateSignalMessages$SCLiveBlindDateClose(), p0);
    }
    public LiveBlindDateSignalMessages$SCLiveBlindDateClose clear(){
       this.time = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveBlindDateSignalMessages$SCLiveBlindDateClose ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveBlindDateSignalMessages$SCLiveBlindDateClose mergeFrom(CodedInputByteBufferNano p0){
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
       LiveBlindDateSignalMessages$SCLiveBlindDateClose ttime = this.time;
       if (ttime) {
          p0.writeUInt64(1, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
