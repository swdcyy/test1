package com.kuaishou.livestream.message.nano.LiveStreamMessages$CSVoipSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import as4.w;

public final class LiveStreamMessages$CSVoipSignal extends MessageNano	// class@0012c6
{
    public w signal;
    public static LiveStreamMessages$CSVoipSignal[] _emptyArray;

    public void LiveStreamMessages$CSVoipSignal(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$CSVoipSignal[] emptyArray(){
       if (LiveStreamMessages$CSVoipSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$CSVoipSignal._emptyArray == null) {
             LiveStreamMessages$CSVoipSignal[] uCSVoipSigna = new LiveStreamMessages$CSVoipSignal[0];
             LiveStreamMessages$CSVoipSignal._emptyArray = uCSVoipSigna;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$CSVoipSignal._emptyArray;
    }
    public static LiveStreamMessages$CSVoipSignal parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$CSVoipSignal().mergeFrom(p0);
    }
    public static LiveStreamMessages$CSVoipSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$CSVoipSignal(), p0);
    }
    public LiveStreamMessages$CSVoipSignal clear(){
       this.signal = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$CSVoipSignal tsignal = this.signal;
       if (tsignal != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tsignal);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$CSVoipSignal mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else if(this.signal == null){
             this.signal = new w();
          }
          p0.readMessage(this.signal);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$CSVoipSignal tsignal = this.signal;
       if (tsignal != null) {
          p0.writeMessage(1, tsignal);
       }
       super.writeTo(p0);
       return;
    }
}
