package com.kuaishou.livestream.message.nano.LiveExtraMessages$SCLiveCommonStateSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveExtraMessages$LiveCommonAbstractSignal;

public final class LiveExtraMessages$SCLiveCommonStateSignal extends MessageNano	// class@0011a4
{
    public LiveExtraMessages$LiveCommonAbstractSignal state;
    public static LiveExtraMessages$SCLiveCommonStateSignal[] _emptyArray;

    public void LiveExtraMessages$SCLiveCommonStateSignal(){
       super();
       this.clear();
    }
    public static LiveExtraMessages$SCLiveCommonStateSignal[] emptyArray(){
       if (LiveExtraMessages$SCLiveCommonStateSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveExtraMessages$SCLiveCommonStateSignal._emptyArray == null) {
             LiveExtraMessages$SCLiveCommonStateSignal[] sCLiveCommon = new LiveExtraMessages$SCLiveCommonStateSignal[0];
             LiveExtraMessages$SCLiveCommonStateSignal._emptyArray = sCLiveCommon;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveExtraMessages$SCLiveCommonStateSignal._emptyArray;
    }
    public static LiveExtraMessages$SCLiveCommonStateSignal parseFrom(CodedInputByteBufferNano p0){
       return new LiveExtraMessages$SCLiveCommonStateSignal().mergeFrom(p0);
    }
    public static LiveExtraMessages$SCLiveCommonStateSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveExtraMessages$SCLiveCommonStateSignal(), p0);
    }
    public LiveExtraMessages$SCLiveCommonStateSignal clear(){
       this.state = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveExtraMessages$SCLiveCommonStateSignal tstate = this.state;
       if (tstate != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tstate);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveExtraMessages$SCLiveCommonStateSignal mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else if(this.state == null){
             this.state = new LiveExtraMessages$LiveCommonAbstractSignal();
          }
          p0.readMessage(this.state);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveExtraMessages$SCLiveCommonStateSignal tstate = this.state;
       if (tstate != null) {
          p0.writeMessage(1, tstate);
       }
       super.writeTo(p0);
       return;
    }
}
