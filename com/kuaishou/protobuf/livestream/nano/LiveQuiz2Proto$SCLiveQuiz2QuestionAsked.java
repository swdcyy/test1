package com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$SCLiveQuiz2QuestionAsked;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$LiveQuiz2OptionModel;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$LiveQuiz2Model;

public final class LiveQuiz2Proto$SCLiveQuiz2QuestionAsked extends MessageNano	// class@000cec
{
    public String eraserErrorAnswer;
    public LiveQuiz2Proto$LiveQuiz2Model liveQuiz;
    public String logoPicUrl;
    public LiveQuiz2Proto$LiveQuiz2OptionModel[] option;
    public long questionEndTimeMs;
    public int questionNumber;
    public long questionStartTimeMs;
    public long submitMaxDelayMs;
    public long syncMaxDelayMs;
    public String title;
    public static LiveQuiz2Proto$SCLiveQuiz2QuestionAsked[] _emptyArray;

    public void LiveQuiz2Proto$SCLiveQuiz2QuestionAsked(){
       super();
       this.clear();
    }
    public static LiveQuiz2Proto$SCLiveQuiz2QuestionAsked[] emptyArray(){
       if (LiveQuiz2Proto$SCLiveQuiz2QuestionAsked._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveQuiz2Proto$SCLiveQuiz2QuestionAsked._emptyArray == null) {
             LiveQuiz2Proto$SCLiveQuiz2QuestionAsked[] sCLiveQuiz2Q = new LiveQuiz2Proto$SCLiveQuiz2QuestionAsked[0];
             LiveQuiz2Proto$SCLiveQuiz2QuestionAsked._emptyArray = sCLiveQuiz2Q;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveQuiz2Proto$SCLiveQuiz2QuestionAsked._emptyArray;
    }
    public static LiveQuiz2Proto$SCLiveQuiz2QuestionAsked parseFrom(CodedInputByteBufferNano p0){
       return new LiveQuiz2Proto$SCLiveQuiz2QuestionAsked().mergeFrom(p0);
    }
    public static LiveQuiz2Proto$SCLiveQuiz2QuestionAsked parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveQuiz2Proto$SCLiveQuiz2QuestionAsked(), p0);
    }
    public LiveQuiz2Proto$SCLiveQuiz2QuestionAsked clear(){
       this.liveQuiz = null;
       this.questionNumber = 0;
       this.questionStartTimeMs = 0;
       this.questionEndTimeMs = 0;
       this.title = "";
       this.option = LiveQuiz2Proto$LiveQuiz2OptionModel.emptyArray();
       this.submitMaxDelayMs = 0;
       this.syncMaxDelayMs = 0;
       this.logoPicUrl = "";
       this.eraserErrorAnswer = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       LiveQuiz2Proto$SCLiveQuiz2QuestionAsked toption;
       int i = super.computeSerializedSize();
       LiveQuiz2Proto$SCLiveQuiz2QuestionAsked tliveQuiz = this.liveQuiz;
       if (tliveQuiz != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tliveQuiz);
       }
       tliveQuiz = this.questionNumber;
       if (tliveQuiz != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tliveQuiz);
       }
       tliveQuiz = this.questionStartTimeMs;
       LiveQuiz2Proto$SCLiveQuiz2QuestionAsked sCLiveQuiz2Q = null;
       if (tliveQuiz - sCLiveQuiz2Q) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tliveQuiz);
       }
       tliveQuiz = this.questionEndTimeMs;
       if (tliveQuiz - sCLiveQuiz2Q) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tliveQuiz);
       }
       String str = "";
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.title);
       }
       tliveQuiz = this.option;
       if (tliveQuiz != null && tliveQuiz.length > 0) {
          int i1 = 0;
          toption = this.option;
          while (i1 < toption.length) {
             object oobject = toption[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(6, oobject);
             }
             i1 = i1 + 1;
          }
       }
       toption = this.submitMaxDelayMs;
       if (toption - sCLiveQuiz2Q) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, toption);
       }
       toption = this.syncMaxDelayMs;
       if (toption - sCLiveQuiz2Q) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, toption);
       }
       if (!(this.logoPicUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.logoPicUrl);
       }
       if (!(this.eraserErrorAnswer).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.eraserErrorAnswer);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveQuiz2Proto$SCLiveQuiz2QuestionAsked mergeFrom(CodedInputByteBufferNano p0){
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
                this.questionStartTimeMs = p0.readUInt64();
                break;
              case 32:
                this.questionEndTimeMs = p0.readUInt64();
                break;
              case '*':
                this.title = p0.readString();
                break;
              case '2':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 50);
                LiveQuiz2Proto$SCLiveQuiz2QuestionAsked toption = this.option;
                int i1 = (toption == null)? 0: toption.length;
                i = i + i1;
                LiveQuiz2Proto$LiveQuiz2OptionModel[] liveQuiz2Opt = new LiveQuiz2Proto$LiveQuiz2OptionModel[i];
                if (i1) {
                   System.arraycopy(toption, 0, liveQuiz2Opt, 0, i1);
                }
                int i2 = i - 1;
                while (i1 < i2) {
                   liveQuiz2Opt[i1] = new LiveQuiz2Proto$LiveQuiz2OptionModel();
                   p0.readMessage(liveQuiz2Opt[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                liveQuiz2Opt[i1] = new LiveQuiz2Proto$LiveQuiz2OptionModel();
                p0.readMessage(liveQuiz2Opt[i1]);
                this.option = liveQuiz2Opt;
                break;
              case '8':
                this.submitMaxDelayMs = p0.readUInt64();
                break;
              case '@':
                this.syncMaxDelayMs = p0.readUInt64();
                break;
              case 'J':
                this.logoPicUrl = p0.readString();
                break;
              case 'R':
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
       LiveQuiz2Proto$SCLiveQuiz2QuestionAsked toption;
       LiveQuiz2Proto$SCLiveQuiz2QuestionAsked tliveQuiz = this.liveQuiz;
       if (tliveQuiz != null) {
          p0.writeMessage(1, tliveQuiz);
       }
       tliveQuiz = this.questionNumber;
       if (tliveQuiz != null) {
          p0.writeUInt32(2, tliveQuiz);
       }
       tliveQuiz = this.questionStartTimeMs;
       LiveQuiz2Proto$SCLiveQuiz2QuestionAsked sCLiveQuiz2Q = null;
       if (tliveQuiz - sCLiveQuiz2Q) {
          p0.writeUInt64(3, tliveQuiz);
       }
       tliveQuiz = this.questionEndTimeMs;
       if (tliveQuiz - sCLiveQuiz2Q) {
          p0.writeUInt64(4, tliveQuiz);
       }
       String str = "";
       if (!(this.title).equals(str)) {
          p0.writeString(5, this.title);
       }
       tliveQuiz = this.option;
       if (tliveQuiz != null && tliveQuiz.length > 0) {
          int i = 0;
          toption = this.option;
          while (i < toption.length) {
             object oobject = toption[i];
             if (oobject != null) {
                p0.writeMessage(6, oobject);
             }
             i = i + 1;
          }
       }
       toption = this.submitMaxDelayMs;
       if (toption - sCLiveQuiz2Q) {
          p0.writeUInt64(7, toption);
       }
       toption = this.syncMaxDelayMs;
       if (toption - sCLiveQuiz2Q) {
          p0.writeUInt64(8, toption);
       }
       if (!(this.logoPicUrl).equals(str)) {
          p0.writeString(9, this.logoPicUrl);
       }
       if (!(this.eraserErrorAnswer).equals(str)) {
          p0.writeString(10, this.eraserErrorAnswer);
       }
       super.writeTo(p0);
       return;
    }
}
