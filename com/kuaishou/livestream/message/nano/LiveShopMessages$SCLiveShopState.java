package com.kuaishou.livestream.message.nano.LiveShopMessages$SCLiveShopState;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveExtraMessages$LiveCommonAbstractSignal;

public final class LiveShopMessages$SCLiveShopState extends MessageNano	// class@0012a5
{
    public LiveExtraMessages$LiveCommonAbstractSignal state;
    public static LiveShopMessages$SCLiveShopState[] _emptyArray;

    public void LiveShopMessages$SCLiveShopState(){
       super();
       this.clear();
    }
    public static LiveShopMessages$SCLiveShopState[] emptyArray(){
       if (LiveShopMessages$SCLiveShopState._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveShopMessages$SCLiveShopState._emptyArray == null) {
             LiveShopMessages$SCLiveShopState[] sCLiveShopSt = new LiveShopMessages$SCLiveShopState[0];
             LiveShopMessages$SCLiveShopState._emptyArray = sCLiveShopSt;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveShopMessages$SCLiveShopState._emptyArray;
    }
    public static LiveShopMessages$SCLiveShopState parseFrom(CodedInputByteBufferNano p0){
       return new LiveShopMessages$SCLiveShopState().mergeFrom(p0);
    }
    public static LiveShopMessages$SCLiveShopState parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveShopMessages$SCLiveShopState(), p0);
    }
    public LiveShopMessages$SCLiveShopState clear(){
       this.state = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveShopMessages$SCLiveShopState tstate = this.state;
       if (tstate != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tstate);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveShopMessages$SCLiveShopState mergeFrom(CodedInputByteBufferNano p0){
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
       LiveShopMessages$SCLiveShopState tstate = this.state;
       if (tstate != null) {
          p0.writeMessage(1, tstate);
       }
       super.writeTo(p0);
       return;
    }
}
