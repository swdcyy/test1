package com.kuaishou.livestream.message.nano.LiveStreamMessages$LiveActivityPendantBizMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$LiveActivityPendantTreasureBoxMessage;

public final class LiveStreamMessages$LiveActivityPendantBizMessage extends MessageNano	// class@0012e5
{
    public int bizDetailType;
    public LiveStreamMessages$LiveActivityPendantTreasureBoxMessage treasureBoxMessage;
    public static LiveStreamMessages$LiveActivityPendantBizMessage[] _emptyArray;

    public void LiveStreamMessages$LiveActivityPendantBizMessage(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$LiveActivityPendantBizMessage[] emptyArray(){
       if (LiveStreamMessages$LiveActivityPendantBizMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$LiveActivityPendantBizMessage._emptyArray == null) {
             LiveStreamMessages$LiveActivityPendantBizMessage[] liveActivity = new LiveStreamMessages$LiveActivityPendantBizMessage[0];
             LiveStreamMessages$LiveActivityPendantBizMessage._emptyArray = liveActivity;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$LiveActivityPendantBizMessage._emptyArray;
    }
    public static LiveStreamMessages$LiveActivityPendantBizMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$LiveActivityPendantBizMessage().mergeFrom(p0);
    }
    public static LiveStreamMessages$LiveActivityPendantBizMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$LiveActivityPendantBizMessage(), p0);
    }
    public LiveStreamMessages$LiveActivityPendantBizMessage clear(){
       this.bizDetailType = 0;
       this.treasureBoxMessage = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$LiveActivityPendantBizMessage tbizDetailTy = this.bizDetailType;
       if (tbizDetailTy != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tbizDetailTy);
       }
       tbizDetailTy = this.treasureBoxMessage;
       if (tbizDetailTy != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tbizDetailTy);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$LiveActivityPendantBizMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else if(this.treasureBoxMessage == null){
                this.treasureBoxMessage = new LiveStreamMessages$LiveActivityPendantTreasureBoxMessage();
             }
             p0.readMessage(this.treasureBoxMessage);
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.bizDetailType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$LiveActivityPendantBizMessage tbizDetailTy = this.bizDetailType;
       if (tbizDetailTy != null) {
          p0.writeInt32(1, tbizDetailTy);
       }
       tbizDetailTy = this.treasureBoxMessage;
       if (tbizDetailTy != null) {
          p0.writeMessage(2, tbizDetailTy);
       }
       super.writeTo(p0);
       return;
    }
}
