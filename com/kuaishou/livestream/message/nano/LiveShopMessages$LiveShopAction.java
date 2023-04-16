package com.kuaishou.livestream.message.nano.LiveShopMessages$LiveShopAction;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveExtraMessages$LiveCommonAbstractSignal;

public final class LiveShopMessages$LiveShopAction extends MessageNano	// class@0012a1
{
    public LiveExtraMessages$LiveCommonAbstractSignal action;
    public static LiveShopMessages$LiveShopAction[] _emptyArray;

    public void LiveShopMessages$LiveShopAction(){
       super();
       this.clear();
    }
    public static LiveShopMessages$LiveShopAction[] emptyArray(){
       if (LiveShopMessages$LiveShopAction._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveShopMessages$LiveShopAction._emptyArray == null) {
             LiveShopMessages$LiveShopAction[] liveShopActi = new LiveShopMessages$LiveShopAction[0];
             LiveShopMessages$LiveShopAction._emptyArray = liveShopActi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveShopMessages$LiveShopAction._emptyArray;
    }
    public static LiveShopMessages$LiveShopAction parseFrom(CodedInputByteBufferNano p0){
       return new LiveShopMessages$LiveShopAction().mergeFrom(p0);
    }
    public static LiveShopMessages$LiveShopAction parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveShopMessages$LiveShopAction(), p0);
    }
    public LiveShopMessages$LiveShopAction clear(){
       this.action = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveShopMessages$LiveShopAction taction = this.action;
       if (taction != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, taction);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveShopMessages$LiveShopAction mergeFrom(CodedInputByteBufferNano p0){
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
       LiveShopMessages$LiveShopAction taction = this.action;
       if (taction != null) {
          p0.writeMessage(1, taction);
       }
       super.writeTo(p0);
       return;
    }
}
