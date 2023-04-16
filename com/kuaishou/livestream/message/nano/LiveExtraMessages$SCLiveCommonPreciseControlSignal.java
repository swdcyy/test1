package com.kuaishou.livestream.message.nano.LiveExtraMessages$SCLiveCommonPreciseControlSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveExtraMessages$LiveCommonAbstractSignal;

public final class LiveExtraMessages$SCLiveCommonPreciseControlSignal extends MessageNano	// class@0011a3
{
    public LiveExtraMessages$LiveCommonAbstractSignal action;
    public static LiveExtraMessages$SCLiveCommonPreciseControlSignal[] _emptyArray;

    public void LiveExtraMessages$SCLiveCommonPreciseControlSignal(){
       super();
       this.clear();
    }
    public static LiveExtraMessages$SCLiveCommonPreciseControlSignal[] emptyArray(){
       if (LiveExtraMessages$SCLiveCommonPreciseControlSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveExtraMessages$SCLiveCommonPreciseControlSignal._emptyArray == null) {
             LiveExtraMessages$SCLiveCommonPreciseControlSignal[] sCLiveCommon = new LiveExtraMessages$SCLiveCommonPreciseControlSignal[0];
             LiveExtraMessages$SCLiveCommonPreciseControlSignal._emptyArray = sCLiveCommon;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveExtraMessages$SCLiveCommonPreciseControlSignal._emptyArray;
    }
    public static LiveExtraMessages$SCLiveCommonPreciseControlSignal parseFrom(CodedInputByteBufferNano p0){
       return new LiveExtraMessages$SCLiveCommonPreciseControlSignal().mergeFrom(p0);
    }
    public static LiveExtraMessages$SCLiveCommonPreciseControlSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveExtraMessages$SCLiveCommonPreciseControlSignal(), p0);
    }
    public LiveExtraMessages$SCLiveCommonPreciseControlSignal clear(){
       this.action = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveExtraMessages$SCLiveCommonPreciseControlSignal taction = this.action;
       if (taction != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, taction);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveExtraMessages$SCLiveCommonPreciseControlSignal mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else if(this.action == null){
             this.action = new LiveExtraMessages$LiveCommonAbstractSignal();
          }
          p0.readMessage(this.action);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveExtraMessages$SCLiveCommonPreciseControlSignal taction = this.action;
       if (taction != null) {
          p0.writeMessage(1, taction);
       }
       super.writeTo(p0);
       return;
    }
}
