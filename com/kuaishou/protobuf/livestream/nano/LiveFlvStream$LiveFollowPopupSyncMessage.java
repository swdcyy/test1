package com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFollowPopupSyncMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveFlvStream$LiveFollowPopupSyncMessage extends MessageNano	// class@000c78
{
    public long sequenceId;
    public static LiveFlvStream$LiveFollowPopupSyncMessage[] _emptyArray;

    public void LiveFlvStream$LiveFollowPopupSyncMessage(){
       super();
       this.clear();
    }
    public static LiveFlvStream$LiveFollowPopupSyncMessage[] emptyArray(){
       if (LiveFlvStream$LiveFollowPopupSyncMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFlvStream$LiveFollowPopupSyncMessage._emptyArray == null) {
             LiveFlvStream$LiveFollowPopupSyncMessage[] liveFollowPo = new LiveFlvStream$LiveFollowPopupSyncMessage[0];
             LiveFlvStream$LiveFollowPopupSyncMessage._emptyArray = liveFollowPo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFlvStream$LiveFollowPopupSyncMessage._emptyArray;
    }
    public static LiveFlvStream$LiveFollowPopupSyncMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveFlvStream$LiveFollowPopupSyncMessage().mergeFrom(p0);
    }
    public static LiveFlvStream$LiveFollowPopupSyncMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFlvStream$LiveFollowPopupSyncMessage(), p0);
    }
    public LiveFlvStream$LiveFollowPopupSyncMessage clear(){
       this.sequenceId = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveFlvStream$LiveFollowPopupSyncMessage tsequenceId = this.sequenceId;
       if (tsequenceId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tsequenceId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFlvStream$LiveFollowPopupSyncMessage mergeFrom(CodedInputByteBufferNano p0){
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
             this.sequenceId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveFlvStream$LiveFollowPopupSyncMessage tsequenceId = this.sequenceId;
       if (tsequenceId) {
          p0.writeUInt64(1, tsequenceId);
       }
       super.writeTo(p0);
       return;
    }
}
