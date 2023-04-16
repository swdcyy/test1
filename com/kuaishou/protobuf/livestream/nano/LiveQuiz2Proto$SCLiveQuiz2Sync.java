package com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$SCLiveQuiz2Sync;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$LiveQuiz2Model;

public final class LiveQuiz2Proto$SCLiveQuiz2Sync extends MessageNano	// class@000cef
{
    public LiveQuiz2Proto$LiveQuiz2Model liveQuiz;
    public long maxDelayMs;
    public int syncType;
    public static LiveQuiz2Proto$SCLiveQuiz2Sync[] _emptyArray;

    public void LiveQuiz2Proto$SCLiveQuiz2Sync(){
       super();
       this.clear();
    }
    public static LiveQuiz2Proto$SCLiveQuiz2Sync[] emptyArray(){
       if (LiveQuiz2Proto$SCLiveQuiz2Sync._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveQuiz2Proto$SCLiveQuiz2Sync._emptyArray == null) {
             LiveQuiz2Proto$SCLiveQuiz2Sync[] sCLiveQuiz2S = new LiveQuiz2Proto$SCLiveQuiz2Sync[0];
             LiveQuiz2Proto$SCLiveQuiz2Sync._emptyArray = sCLiveQuiz2S;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveQuiz2Proto$SCLiveQuiz2Sync._emptyArray;
    }
    public static LiveQuiz2Proto$SCLiveQuiz2Sync parseFrom(CodedInputByteBufferNano p0){
       return new LiveQuiz2Proto$SCLiveQuiz2Sync().mergeFrom(p0);
    }
    public static LiveQuiz2Proto$SCLiveQuiz2Sync parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveQuiz2Proto$SCLiveQuiz2Sync(), p0);
    }
    public LiveQuiz2Proto$SCLiveQuiz2Sync clear(){
       this.syncType = 0;
       this.liveQuiz = null;
       this.maxDelayMs = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveQuiz2Proto$SCLiveQuiz2Sync tsyncType = this.syncType;
       if (tsyncType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tsyncType);
       }
       tsyncType = this.liveQuiz;
       if (tsyncType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tsyncType);
       }
       tsyncType = this.maxDelayMs;
       if (tsyncType) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tsyncType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveQuiz2Proto$SCLiveQuiz2Sync mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.maxDelayMs = p0.readUInt64();
                }
             }else if(this.liveQuiz == null){
                this.liveQuiz = new LiveQuiz2Proto$LiveQuiz2Model();
             }
             p0.readMessage(this.liveQuiz);
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.syncType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveQuiz2Proto$SCLiveQuiz2Sync tsyncType = this.syncType;
       if (tsyncType != null) {
          p0.writeInt32(1, tsyncType);
       }
       tsyncType = this.liveQuiz;
       if (tsyncType != null) {
          p0.writeMessage(2, tsyncType);
       }
       tsyncType = this.maxDelayMs;
       if (tsyncType) {
          p0.writeUInt64(3, tsyncType);
       }
       super.writeTo(p0);
       return;
    }
}
