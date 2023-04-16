package com.kuaishou.livestream.message.nano.LiveExtraMessages$LiveCommonActionSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveExtraMessages$LiveCommonAbstractSignal;

public final class LiveExtraMessages$LiveCommonActionSignal extends MessageNano	// class@0011a2
{
    public LiveExtraMessages$LiveCommonAbstractSignal action;
    public static LiveExtraMessages$LiveCommonActionSignal[] _emptyArray;

    public void LiveExtraMessages$LiveCommonActionSignal(){
       super();
       this.clear();
    }
    public static LiveExtraMessages$LiveCommonActionSignal[] emptyArray(){
       if (LiveExtraMessages$LiveCommonActionSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveExtraMessages$LiveCommonActionSignal._emptyArray == null) {
             LiveExtraMessages$LiveCommonActionSignal[] liveCommonAc = new LiveExtraMessages$LiveCommonActionSignal[0];
             LiveExtraMessages$LiveCommonActionSignal._emptyArray = liveCommonAc;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveExtraMessages$LiveCommonActionSignal._emptyArray;
    }
    public static LiveExtraMessages$LiveCommonActionSignal parseFrom(CodedInputByteBufferNano p0){
       return new LiveExtraMessages$LiveCommonActionSignal().mergeFrom(p0);
    }
    public static LiveExtraMessages$LiveCommonActionSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveExtraMessages$LiveCommonActionSignal(), p0);
    }
    public LiveExtraMessages$LiveCommonActionSignal clear(){
       this.action = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveExtraMessages$LiveCommonActionSignal taction = this.action;
       if (taction != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, taction);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveExtraMessages$LiveCommonActionSignal mergeFrom(CodedInputByteBufferNano p0){
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
       LiveExtraMessages$LiveCommonActionSignal taction = this.action;
       if (taction != null) {
          p0.writeMessage(1, taction);
       }
       super.writeTo(p0);
       return;
    }
}
