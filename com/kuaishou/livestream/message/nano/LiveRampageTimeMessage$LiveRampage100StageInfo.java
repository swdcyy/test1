package com.kuaishou.livestream.message.nano.LiveRampageTimeMessage$LiveRampage100StageInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveRampageTimeMessage$LiveRampage100StageInfo extends MessageNano	// class@001263
{
    public long rampageEndNoticeTime;
    public long rampageEndTime;
    public long rampageStartTime;
    public static LiveRampageTimeMessage$LiveRampage100StageInfo[] _emptyArray;

    public void LiveRampageTimeMessage$LiveRampage100StageInfo(){
       super();
       this.clear();
    }
    public static LiveRampageTimeMessage$LiveRampage100StageInfo[] emptyArray(){
       if (LiveRampageTimeMessage$LiveRampage100StageInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRampageTimeMessage$LiveRampage100StageInfo._emptyArray == null) {
             LiveRampageTimeMessage$LiveRampage100StageInfo[] liveRampage1 = new LiveRampageTimeMessage$LiveRampage100StageInfo[0];
             LiveRampageTimeMessage$LiveRampage100StageInfo._emptyArray = liveRampage1;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRampageTimeMessage$LiveRampage100StageInfo._emptyArray;
    }
    public static LiveRampageTimeMessage$LiveRampage100StageInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveRampageTimeMessage$LiveRampage100StageInfo().mergeFrom(p0);
    }
    public static LiveRampageTimeMessage$LiveRampage100StageInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRampageTimeMessage$LiveRampage100StageInfo(), p0);
    }
    public LiveRampageTimeMessage$LiveRampage100StageInfo clear(){
       this.rampageStartTime = 0;
       this.rampageEndTime = 0;
       this.rampageEndNoticeTime = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveRampageTimeMessage$LiveRampage100StageInfo trampageStar = this.rampageStartTime;
       int i1 = 0;
       if (trampageStar - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, trampageStar);
       }
       trampageStar = this.rampageEndTime;
       if (trampageStar - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, trampageStar);
       }
       trampageStar = this.rampageEndNoticeTime;
       if (trampageStar - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, trampageStar);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRampageTimeMessage$LiveRampage100StageInfo mergeFrom(CodedInputByteBufferNano p0){
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
                   this.rampageEndNoticeTime = p0.readUInt64();
                }
             }else {
                this.rampageEndTime = p0.readUInt64();
             }
          }else {
             this.rampageStartTime = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveRampageTimeMessage$LiveRampage100StageInfo trampageStar = this.rampageStartTime;
       int i = 0;
       if (trampageStar - i) {
          p0.writeUInt64(1, trampageStar);
       }
       trampageStar = this.rampageEndTime;
       if (trampageStar - i) {
          p0.writeUInt64(2, trampageStar);
       }
       trampageStar = this.rampageEndNoticeTime;
       if (trampageStar - i) {
          p0.writeUInt64(3, trampageStar);
       }
       super.writeTo(p0);
       return;
    }
}
