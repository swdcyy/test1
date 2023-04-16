package com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$AskRecordMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveRoomSignalMessage$AskRecordMessage extends MessageNano	// class@001c3e
{
    public long displayIntervalMillis;
    public boolean openAnimation;
    public long totalNumber;
    public static LiveRoomSignalMessage$AskRecordMessage[] _emptyArray;

    public void LiveRoomSignalMessage$AskRecordMessage(){
       super();
       this.clear();
    }
    public static LiveRoomSignalMessage$AskRecordMessage[] emptyArray(){
       if (LiveRoomSignalMessage$AskRecordMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomSignalMessage$AskRecordMessage._emptyArray == null) {
             LiveRoomSignalMessage$AskRecordMessage[] uAskRecordMe = new LiveRoomSignalMessage$AskRecordMessage[0];
             LiveRoomSignalMessage$AskRecordMessage._emptyArray = uAskRecordMe;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomSignalMessage$AskRecordMessage._emptyArray;
    }
    public static LiveRoomSignalMessage$AskRecordMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomSignalMessage$AskRecordMessage().mergeFrom(p0);
    }
    public static LiveRoomSignalMessage$AskRecordMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomSignalMessage$AskRecordMessage(), p0);
    }
    public LiveRoomSignalMessage$AskRecordMessage clear(){
       this.totalNumber = 0;
       this.displayIntervalMillis = 0;
       this.openAnimation = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveRoomSignalMessage$AskRecordMessage ttotalNumber = this.totalNumber;
       int i1 = 0;
       if (ttotalNumber - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttotalNumber);
       }
       ttotalNumber = this.displayIntervalMillis;
       if (ttotalNumber - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttotalNumber);
       }
       ttotalNumber = this.openAnimation;
       if (ttotalNumber != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, ttotalNumber);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomSignalMessage$AskRecordMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.openAnimation = p0.readBool();
                }
             }else {
                this.displayIntervalMillis = p0.readUInt64();
             }
          }else {
             this.totalNumber = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveRoomSignalMessage$AskRecordMessage ttotalNumber = this.totalNumber;
       int i = 0;
       if (ttotalNumber - i) {
          p0.writeUInt64(1, ttotalNumber);
       }
       ttotalNumber = this.displayIntervalMillis;
       if (ttotalNumber - i) {
          p0.writeUInt64(2, ttotalNumber);
       }
       ttotalNumber = this.openAnimation;
       if (ttotalNumber != null) {
          p0.writeBool(3, ttotalNumber);
       }
       super.writeTo(p0);
       return;
    }
}
