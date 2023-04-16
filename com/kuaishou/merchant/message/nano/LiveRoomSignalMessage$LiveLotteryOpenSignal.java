package com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$LiveLotteryOpenSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$ItemInfo;

public final class LiveRoomSignalMessage$LiveLotteryOpenSignal extends MessageNano	// class@001c59
{
    public int displayIntervalMillis;
    public LiveRoomSignalMessage$ItemInfo itemInfo;
    public long openTimeMills;
    public static LiveRoomSignalMessage$LiveLotteryOpenSignal[] _emptyArray;

    public void LiveRoomSignalMessage$LiveLotteryOpenSignal(){
       super();
       this.clear();
    }
    public static LiveRoomSignalMessage$LiveLotteryOpenSignal[] emptyArray(){
       if (LiveRoomSignalMessage$LiveLotteryOpenSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomSignalMessage$LiveLotteryOpenSignal._emptyArray == null) {
             LiveRoomSignalMessage$LiveLotteryOpenSignal[] liveLotteryO = new LiveRoomSignalMessage$LiveLotteryOpenSignal[0];
             LiveRoomSignalMessage$LiveLotteryOpenSignal._emptyArray = liveLotteryO;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomSignalMessage$LiveLotteryOpenSignal._emptyArray;
    }
    public static LiveRoomSignalMessage$LiveLotteryOpenSignal parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomSignalMessage$LiveLotteryOpenSignal().mergeFrom(p0);
    }
    public static LiveRoomSignalMessage$LiveLotteryOpenSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomSignalMessage$LiveLotteryOpenSignal(), p0);
    }
    public LiveRoomSignalMessage$LiveLotteryOpenSignal clear(){
       this.itemInfo = null;
       this.displayIntervalMillis = 0;
       this.openTimeMills = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveRoomSignalMessage$LiveLotteryOpenSignal titemInfo = this.itemInfo;
       if (titemInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, titemInfo);
       }
       titemInfo = this.displayIntervalMillis;
       if (titemInfo != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, titemInfo);
       }
       titemInfo = this.openTimeMills;
       if (titemInfo) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, titemInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomSignalMessage$LiveLotteryOpenSignal mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.openTimeMills = p0.readUInt64();
                }
             }else {
                this.displayIntervalMillis = p0.readUInt32();
             }
          }else if(this.itemInfo == null){
             this.itemInfo = new LiveRoomSignalMessage$ItemInfo();
          }
          p0.readMessage(this.itemInfo);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveRoomSignalMessage$LiveLotteryOpenSignal titemInfo = this.itemInfo;
       if (titemInfo != null) {
          p0.writeMessage(1, titemInfo);
       }
       titemInfo = this.displayIntervalMillis;
       if (titemInfo != null) {
          p0.writeUInt32(2, titemInfo);
       }
       titemInfo = this.openTimeMills;
       if (titemInfo) {
          p0.writeUInt64(3, titemInfo);
       }
       super.writeTo(p0);
       return;
    }
}
