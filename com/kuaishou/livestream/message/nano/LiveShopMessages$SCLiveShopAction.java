package com.kuaishou.livestream.message.nano.LiveShopMessages$SCLiveShopAction;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveExtraMessages$LiveCommonAbstractSignal;

public final class LiveShopMessages$SCLiveShopAction extends MessageNano	// class@0012a4
{
    public LiveExtraMessages$LiveCommonAbstractSignal action;
    public static LiveShopMessages$SCLiveShopAction[] _emptyArray;

    public void LiveShopMessages$SCLiveShopAction(){
       super();
       this.clear();
    }
    public static LiveShopMessages$SCLiveShopAction[] emptyArray(){
       if (LiveShopMessages$SCLiveShopAction._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveShopMessages$SCLiveShopAction._emptyArray == null) {
             LiveShopMessages$SCLiveShopAction[] sCLiveShopAc = new LiveShopMessages$SCLiveShopAction[0];
             LiveShopMessages$SCLiveShopAction._emptyArray = sCLiveShopAc;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveShopMessages$SCLiveShopAction._emptyArray;
    }
    public static LiveShopMessages$SCLiveShopAction parseFrom(CodedInputByteBufferNano p0){
       return new LiveShopMessages$SCLiveShopAction().mergeFrom(p0);
    }
    public static LiveShopMessages$SCLiveShopAction parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveShopMessages$SCLiveShopAction(), p0);
    }
    public LiveShopMessages$SCLiveShopAction clear(){
       this.action = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveShopMessages$SCLiveShopAction taction = this.action;
       if (taction != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, taction);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveShopMessages$SCLiveShopAction mergeFrom(CodedInputByteBufferNano p0){
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
       LiveShopMessages$SCLiveShopAction taction = this.action;
       if (taction != null) {
          p0.writeMessage(1, taction);
       }
       super.writeTo(p0);
       return;
    }
}
