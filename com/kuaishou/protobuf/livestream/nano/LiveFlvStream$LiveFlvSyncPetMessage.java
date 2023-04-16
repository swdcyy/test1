package com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvSyncPetMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveFlvStream$LiveFlvSyncPetMessage extends MessageNano	// class@000c74
{
    public int actionId;
    public int messageType;
    public static LiveFlvStream$LiveFlvSyncPetMessage[] _emptyArray;

    public void LiveFlvStream$LiveFlvSyncPetMessage(){
       super();
       this.clear();
    }
    public static LiveFlvStream$LiveFlvSyncPetMessage[] emptyArray(){
       if (LiveFlvStream$LiveFlvSyncPetMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFlvStream$LiveFlvSyncPetMessage._emptyArray == null) {
             LiveFlvStream$LiveFlvSyncPetMessage[] liveFlvSyncP = new LiveFlvStream$LiveFlvSyncPetMessage[0];
             LiveFlvStream$LiveFlvSyncPetMessage._emptyArray = liveFlvSyncP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFlvStream$LiveFlvSyncPetMessage._emptyArray;
    }
    public static LiveFlvStream$LiveFlvSyncPetMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveFlvStream$LiveFlvSyncPetMessage().mergeFrom(p0);
    }
    public static LiveFlvStream$LiveFlvSyncPetMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFlvStream$LiveFlvSyncPetMessage(), p0);
    }
    public LiveFlvStream$LiveFlvSyncPetMessage clear(){
       this.actionId = 0;
       this.messageType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveFlvStream$LiveFlvSyncPetMessage tactionId = this.actionId;
       if (tactionId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tactionId);
       }
       tactionId = this.messageType;
       if (tactionId != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tactionId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFlvStream$LiveFlvSyncPetMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                i = p0.readInt32();
                if (i && i != 1) {
                   continue ;
                }else {
                   this.messageType = i;
                }
             }
          }else {
             this.actionId = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveFlvStream$LiveFlvSyncPetMessage tactionId = this.actionId;
       if (tactionId != null) {
          p0.writeUInt32(1, tactionId);
       }
       tactionId = this.messageType;
       if (tactionId != null) {
          p0.writeInt32(2, tactionId);
       }
       super.writeTo(p0);
       return;
    }
}
