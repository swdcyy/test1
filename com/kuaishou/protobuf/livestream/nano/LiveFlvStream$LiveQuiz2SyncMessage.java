package com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveQuiz2SyncMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveFlvStream$LiveQuiz2SyncMessage extends MessageNano	// class@000c7f
{
    public int questionNumber;
    public String quizId;
    public int syncMessageType;
    public static LiveFlvStream$LiveQuiz2SyncMessage[] _emptyArray;

    public void LiveFlvStream$LiveQuiz2SyncMessage(){
       super();
       this.clear();
    }
    public static LiveFlvStream$LiveQuiz2SyncMessage[] emptyArray(){
       if (LiveFlvStream$LiveQuiz2SyncMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFlvStream$LiveQuiz2SyncMessage._emptyArray == null) {
             LiveFlvStream$LiveQuiz2SyncMessage[] liveQuiz2Syn = new LiveFlvStream$LiveQuiz2SyncMessage[0];
             LiveFlvStream$LiveQuiz2SyncMessage._emptyArray = liveQuiz2Syn;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFlvStream$LiveQuiz2SyncMessage._emptyArray;
    }
    public static LiveFlvStream$LiveQuiz2SyncMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveFlvStream$LiveQuiz2SyncMessage().mergeFrom(p0);
    }
    public static LiveFlvStream$LiveQuiz2SyncMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFlvStream$LiveQuiz2SyncMessage(), p0);
    }
    public LiveFlvStream$LiveQuiz2SyncMessage clear(){
       this.syncMessageType = 0;
       this.quizId = "";
       this.questionNumber = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveFlvStream$LiveQuiz2SyncMessage tsyncMessage = this.syncMessageType;
       if (tsyncMessage != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tsyncMessage);
       }
       if (!(this.quizId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.quizId);
       }
       tsyncMessage = this.questionNumber;
       if (tsyncMessage != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tsyncMessage);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFlvStream$LiveQuiz2SyncMessage mergeFrom(CodedInputByteBufferNano p0){
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
                   this.questionNumber = p0.readUInt32();
                }
             }else {
                this.quizId = p0.readString();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.syncMessageType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveFlvStream$LiveQuiz2SyncMessage tsyncMessage = this.syncMessageType;
       if (tsyncMessage != null) {
          p0.writeInt32(1, tsyncMessage);
       }
       if (!(this.quizId).equals("")) {
          p0.writeString(2, this.quizId);
       }
       tsyncMessage = this.questionNumber;
       if (tsyncMessage != null) {
          p0.writeUInt32(3, tsyncMessage);
       }
       super.writeTo(p0);
       return;
    }
}
