package com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$LiveQuiz2Ended;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveQuiz2Proto$LiveQuiz2Ended extends MessageNano	// class@000cde
{
    public int endType;
    public long maxWaitAwardReviewSignalDurationMs;
    public long toastAwardMaxDelayMs;
    public static LiveQuiz2Proto$LiveQuiz2Ended[] _emptyArray;

    public void LiveQuiz2Proto$LiveQuiz2Ended(){
       super();
       this.clear();
    }
    public static LiveQuiz2Proto$LiveQuiz2Ended[] emptyArray(){
       if (LiveQuiz2Proto$LiveQuiz2Ended._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveQuiz2Proto$LiveQuiz2Ended._emptyArray == null) {
             LiveQuiz2Proto$LiveQuiz2Ended[] liveQuiz2End = new LiveQuiz2Proto$LiveQuiz2Ended[0];
             LiveQuiz2Proto$LiveQuiz2Ended._emptyArray = liveQuiz2End;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveQuiz2Proto$LiveQuiz2Ended._emptyArray;
    }
    public static LiveQuiz2Proto$LiveQuiz2Ended parseFrom(CodedInputByteBufferNano p0){
       return new LiveQuiz2Proto$LiveQuiz2Ended().mergeFrom(p0);
    }
    public static LiveQuiz2Proto$LiveQuiz2Ended parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveQuiz2Proto$LiveQuiz2Ended(), p0);
    }
    public LiveQuiz2Proto$LiveQuiz2Ended clear(){
       this.endType = 0;
       this.toastAwardMaxDelayMs = 0;
       this.maxWaitAwardReviewSignalDurationMs = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveQuiz2Proto$LiveQuiz2Ended tendType = this.endType;
       if (tendType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tendType);
       }
       tendType = this.toastAwardMaxDelayMs;
       int i1 = 0;
       if (tendType - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tendType);
       }
       tendType = this.maxWaitAwardReviewSignalDurationMs;
       if (tendType - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tendType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveQuiz2Proto$LiveQuiz2Ended mergeFrom(CodedInputByteBufferNano p0){
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
                   this.maxWaitAwardReviewSignalDurationMs = p0.readUInt64();
                }
             }else {
                this.toastAwardMaxDelayMs = p0.readUInt64();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.endType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveQuiz2Proto$LiveQuiz2Ended tendType = this.endType;
       if (tendType != null) {
          p0.writeInt32(1, tendType);
       }
       tendType = this.toastAwardMaxDelayMs;
       int i = 0;
       if (tendType - i) {
          p0.writeUInt64(2, tendType);
       }
       tendType = this.maxWaitAwardReviewSignalDurationMs;
       if (tendType - i) {
          p0.writeUInt64(3, tendType);
       }
       super.writeTo(p0);
       return;
    }
}
