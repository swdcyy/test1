package com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$SCLiveQuiz2QuestionReviewed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$LiveQuiz2OptionWithStat;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$LiveQuiz2RevivedCountInfo;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$LiveQuiz2Ended;
import java.lang.System;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$LiveQuiz2Model;

public final class LiveQuiz2Proto$SCLiveQuiz2QuestionReviewed extends MessageNano	// class@000ced
{
    public String correctOptionId;
    public LiveQuiz2Proto$LiveQuiz2Ended ended;
    public String eraserErrorAnswer;
    public LiveQuiz2Proto$LiveQuiz2Model liveQuiz;
    public String logoPicUrl;
    public LiveQuiz2Proto$LiveQuiz2OptionWithStat[] optionWithStat;
    public long queryGiftMaxDelayMs;
    public int questionNumber;
    public long requestAfterAnswerMaxDelayMs;
    public long requestAfterAnswerMinDelayMs;
    public long reviewEndTime;
    public long reviewStartTime;
    public LiveQuiz2Proto$LiveQuiz2RevivedCountInfo revivedCountInfo;
    public long syncMaxDelayMs;
    public String title;
    public static LiveQuiz2Proto$SCLiveQuiz2QuestionReviewed[] _emptyArray;

    public void LiveQuiz2Proto$SCLiveQuiz2QuestionReviewed(){
       super();
       this.clear();
    }
    public static LiveQuiz2Proto$SCLiveQuiz2QuestionReviewed[] emptyArray(){
       if (LiveQuiz2Proto$SCLiveQuiz2QuestionReviewed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveQuiz2Proto$SCLiveQuiz2QuestionReviewed._emptyArray == null) {
             LiveQuiz2Proto$SCLiveQuiz2QuestionReviewed[] sCLiveQuiz2Q = new LiveQuiz2Proto$SCLiveQuiz2QuestionReviewed[0];
             LiveQuiz2Proto$SCLiveQuiz2QuestionReviewed._emptyArray = sCLiveQuiz2Q;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveQuiz2Proto$SCLiveQuiz2QuestionReviewed._emptyArray;
    }
    public static LiveQuiz2Proto$SCLiveQuiz2QuestionReviewed parseFrom(CodedInputByteBufferNano p0){
       return new LiveQuiz2Proto$SCLiveQuiz2QuestionReviewed().mergeFrom(p0);
    }
    public static LiveQuiz2Proto$SCLiveQuiz2QuestionReviewed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveQuiz2Proto$SCLiveQuiz2QuestionReviewed(), p0);
    }
    public LiveQuiz2Proto$SCLiveQuiz2QuestionReviewed clear(){
       this.liveQuiz = null;
       this.questionNumber = 0;
       this.reviewStartTime = 0;
       this.reviewEndTime = 0;
       this.title = "";
       this.optionWithStat = LiveQuiz2Proto$LiveQuiz2OptionWithStat.emptyArray();
       this.correctOptionId = "";
       this.ended = null;
       this.syncMaxDelayMs = 0;
       this.revivedCountInfo = null;
       this.logoPicUrl = "";
       this.queryGiftMaxDelayMs = 0;
       this.requestAfterAnswerMaxDelayMs = 0;
       this.requestAfterAnswerMinDelayMs = 0;
       this.eraserErrorAnswer = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       LiveQuiz2Proto$SCLiveQuiz2QuestionReviewed toptionWithS;
       int i = super.computeSerializedSize();
       LiveQuiz2Proto$SCLiveQuiz2QuestionReviewed tliveQuiz = this.liveQuiz;
       if (tliveQuiz != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tliveQuiz);
       }
       tliveQuiz = this.questionNumber;
       if (tliveQuiz != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tliveQuiz);
       }
       tliveQuiz = this.reviewStartTime;
       if (tliveQuiz) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tliveQuiz);
       }
       tliveQuiz = this.reviewEndTime;
       if (tliveQuiz) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tliveQuiz);
       }
       String str = "";
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.title);
       }
       tliveQuiz = this.optionWithStat;
       if (tliveQuiz != null && tliveQuiz.length > 0) {
          int i1 = 0;
          toptionWithS = this.optionWithStat;
          while (i1 < toptionWithS.length) {
             object oobject = toptionWithS[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(6, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.correctOptionId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.correctOptionId);
       }
       tliveQuiz = this.ended;
       if (tliveQuiz != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, tliveQuiz);
       }
       toptionWithS = this.syncMaxDelayMs;
       if (toptionWithS) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, toptionWithS);
       }
       tliveQuiz = this.revivedCountInfo;
       if (tliveQuiz != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(10, tliveQuiz);
       }
       if (!(this.logoPicUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.logoPicUrl);
       }
       toptionWithS = this.queryGiftMaxDelayMs;
       if (toptionWithS) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(12, toptionWithS);
       }
       toptionWithS = this.requestAfterAnswerMaxDelayMs;
       if (toptionWithS) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(13, toptionWithS);
       }
       toptionWithS = this.requestAfterAnswerMinDelayMs;
       if (toptionWithS) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(14, toptionWithS);
       }
       if (!(this.eraserErrorAnswer).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(15, this.eraserErrorAnswer);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveQuiz2Proto$SCLiveQuiz2QuestionReviewed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                if (this.liveQuiz == null) {
                   this.liveQuiz = new LiveQuiz2Proto$LiveQuiz2Model();
                }
                p0.readMessage(this.liveQuiz);
                break;
              case 16:
                this.questionNumber = p0.readUInt32();
                break;
              case 24:
                this.reviewStartTime = p0.readUInt64();
                break;
              case 32:
                this.reviewEndTime = p0.readUInt64();
                break;
              case '*':
                this.title = p0.readString();
                break;
              case '2':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 50);
                LiveQuiz2Proto$SCLiveQuiz2QuestionReviewed toptionWithS = this.optionWithStat;
                int i1 = (toptionWithS == null)? 0: toptionWithS.length;
                i = i + i1;
                LiveQuiz2Proto$LiveQuiz2OptionWithStat[] liveQuiz2Opt = new LiveQuiz2Proto$LiveQuiz2OptionWithStat[i];
                if (i1) {
                   System.arraycopy(toptionWithS, 0, liveQuiz2Opt, 0, i1);
                }
                int i2 = i - 1;
                while (i1 < i2) {
                   liveQuiz2Opt[i1] = new LiveQuiz2Proto$LiveQuiz2OptionWithStat();
                   p0.readMessage(liveQuiz2Opt[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                liveQuiz2Opt[i1] = new LiveQuiz2Proto$LiveQuiz2OptionWithStat();
                p0.readMessage(liveQuiz2Opt[i1]);
                this.optionWithStat = liveQuiz2Opt;
                break;
              case ':':
                this.correctOptionId = p0.readString();
                break;
              case 'B':
                if (this.ended == null) {
                   this.ended = new LiveQuiz2Proto$LiveQuiz2Ended();
                }
                p0.readMessage(this.ended);
                break;
              case 'H':
                this.syncMaxDelayMs = p0.readUInt64();
                break;
              case 'R':
                if (this.revivedCountInfo == null) {
                   this.revivedCountInfo = new LiveQuiz2Proto$LiveQuiz2RevivedCountInfo();
                }
                p0.readMessage(this.revivedCountInfo);
                break;
              case 'Z':
                this.logoPicUrl = p0.readString();
                break;
              case '`':
                this.queryGiftMaxDelayMs = p0.readUInt64();
                break;
              case 'h':
                this.requestAfterAnswerMaxDelayMs = p0.readUInt64();
                break;
              case 'p':
                this.requestAfterAnswerMinDelayMs = p0.readUInt64();
                break;
              case 'z':
                this.eraserErrorAnswer = p0.readString();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveQuiz2Proto$SCLiveQuiz2QuestionReviewed toptionWithS;
       LiveQuiz2Proto$SCLiveQuiz2QuestionReviewed tliveQuiz = this.liveQuiz;
       if (tliveQuiz != null) {
          p0.writeMessage(1, tliveQuiz);
       }
       tliveQuiz = this.questionNumber;
       if (tliveQuiz != null) {
          p0.writeUInt32(2, tliveQuiz);
       }
       tliveQuiz = this.reviewStartTime;
       if (tliveQuiz) {
          p0.writeUInt64(3, tliveQuiz);
       }
       tliveQuiz = this.reviewEndTime;
       if (tliveQuiz) {
          p0.writeUInt64(4, tliveQuiz);
       }
       String str = "";
       if (!(this.title).equals(str)) {
          p0.writeString(5, this.title);
       }
       tliveQuiz = this.optionWithStat;
       if (tliveQuiz != null && tliveQuiz.length > 0) {
          int i = 0;
          toptionWithS = this.optionWithStat;
          while (i < toptionWithS.length) {
             object oobject = toptionWithS[i];
             if (oobject != null) {
                p0.writeMessage(6, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.correctOptionId).equals(str)) {
          p0.writeString(7, this.correctOptionId);
       }
       tliveQuiz = this.ended;
       if (tliveQuiz != null) {
          p0.writeMessage(8, tliveQuiz);
       }
       toptionWithS = this.syncMaxDelayMs;
       if (toptionWithS) {
          p0.writeUInt64(9, toptionWithS);
       }
       tliveQuiz = this.revivedCountInfo;
       if (tliveQuiz != null) {
          p0.writeMessage(10, tliveQuiz);
       }
       if (!(this.logoPicUrl).equals(str)) {
          p0.writeString(11, this.logoPicUrl);
       }
       toptionWithS = this.queryGiftMaxDelayMs;
       if (toptionWithS) {
          p0.writeUInt64(12, toptionWithS);
       }
       toptionWithS = this.requestAfterAnswerMaxDelayMs;
       if (toptionWithS) {
          p0.writeUInt64(13, toptionWithS);
       }
       toptionWithS = this.requestAfterAnswerMinDelayMs;
       if (toptionWithS) {
          p0.writeUInt64(14, toptionWithS);
       }
       if (!(this.eraserErrorAnswer).equals(str)) {
          p0.writeString(15, this.eraserErrorAnswer);
       }
       super.writeTo(p0);
       return;
    }
}
