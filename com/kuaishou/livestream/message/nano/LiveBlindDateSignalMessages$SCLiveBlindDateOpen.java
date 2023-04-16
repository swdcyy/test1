package com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateOpen;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveBlindDateSignalMessages$SCLiveBlindDateOpen extends MessageNano	// class@001119
{
    public long time;
    public static LiveBlindDateSignalMessages$SCLiveBlindDateOpen[] _emptyArray;

    public void LiveBlindDateSignalMessages$SCLiveBlindDateOpen(){
       super();
       this.clear();
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateOpen[] emptyArray(){
       if (LiveBlindDateSignalMessages$SCLiveBlindDateOpen._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveBlindDateSignalMessages$SCLiveBlindDateOpen._emptyArray == null) {
             LiveBlindDateSignalMessages$SCLiveBlindDateOpen[] sCLiveBlindD = new LiveBlindDateSignalMessages$SCLiveBlindDateOpen[0];
             LiveBlindDateSignalMessages$SCLiveBlindDateOpen._emptyArray = sCLiveBlindD;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveBlindDateSignalMessages$SCLiveBlindDateOpen._emptyArray;
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateOpen parseFrom(CodedInputByteBufferNano p0){
       return new LiveBlindDateSignalMessages$SCLiveBlindDateOpen().mergeFrom(p0);
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateOpen parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveBlindDateSignalMessages$SCLiveBlindDateOpen(), p0);
    }
    public LiveBlindDateSignalMessages$SCLiveBlindDateOpen clear(){
       this.time = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveBlindDateSignalMessages$SCLiveBlindDateOpen ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveBlindDateSignalMessages$SCLiveBlindDateOpen mergeFrom(CodedInputByteBufferNano p0){
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
       LiveBlindDateSignalMessages$SCLiveBlindDateOpen ttime = this.time;
       if (ttime) {
          p0.writeUInt64(1, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
