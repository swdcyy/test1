package com.kuaishou.protobuf.livestream.nano.LiveQuizProto$SCLiveQuizQuestionAsked;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveQuizProto$OptionModel;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;
import com.kuaishou.protobuf.livestream.nano.LiveQuizProto$LiveQuizModel;

public final class LiveQuizProto$SCLiveQuizQuestionAsked extends MessageNano	// class@000cf5
{
    public boolean ignoreSubmitWaitEnd;
    public LiveQuizProto$LiveQuizModel liveQuiz;
    public LiveQuizProto$OptionModel[] option;
    public long questionEndTime;
    public int questionNumber;
    public long questionStartTime;
    public long submitMaxDelayMillis;
    public long syncMaxDelayMillis;
    public long time;
    public String title;
    public long waitEndSubmitMaxDelayMillis;
    public static LiveQuizProto$SCLiveQuizQuestionAsked[] _emptyArray;

    public void LiveQuizProto$SCLiveQuizQuestionAsked(){
       super();
       this.clear();
    }
    public static LiveQuizProto$SCLiveQuizQuestionAsked[] emptyArray(){
       if (LiveQuizProto$SCLiveQuizQuestionAsked._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveQuizProto$SCLiveQuizQuestionAsked._emptyArray == null) {
             LiveQuizProto$SCLiveQuizQuestionAsked[] sCLiveQuizQu = new LiveQuizProto$SCLiveQuizQuestionAsked[0];
             LiveQuizProto$SCLiveQuizQuestionAsked._emptyArray = sCLiveQuizQu;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveQuizProto$SCLiveQuizQuestionAsked._emptyArray;
    }
    public static LiveQuizProto$SCLiveQuizQuestionAsked parseFrom(CodedInputByteBufferNano p0){
       return new LiveQuizProto$SCLiveQuizQuestionAsked().mergeFrom(p0);
    }
    public static LiveQuizProto$SCLiveQuizQuestionAsked parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveQuizProto$SCLiveQuizQuestionAsked(), p0);
    }
    public LiveQuizProto$SCLiveQuizQuestionAsked clear(){
       this.time = 0;
       this.liveQuiz = null;
       this.questionNumber = 0;
       this.questionStartTime = 0;
       this.questionEndTime = 0;
       this.title = "";
       this.option = LiveQuizProto$OptionModel.emptyArray();
       this.submitMaxDelayMillis = 0;
       this.syncMaxDelayMillis = 0;
       this.ignoreSubmitWaitEnd = false;
       this.waitEndSubmitMaxDelayMillis = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveQuizProto$SCLiveQuizQuestionAsked ttime = this.time;
       int i1 = 0;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       ttime = this.liveQuiz;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, ttime);
       }
       ttime = this.questionNumber;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, ttime);
       }
       ttime = this.questionStartTime;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, ttime);
       }
       ttime = this.questionEndTime;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, ttime);
       }
       if (!(this.title).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.title);
       }
       ttime = this.option;
       if (ttime != null && ttime.length > 0) {
          int i2 = 0;
          LiveQuizProto$SCLiveQuizQuestionAsked toption = this.option;
          while (i2 < toption.length) {
             object oobject = toption[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(7, oobject);
             }
             i2 = i2 + 1;
          }
       }
       ttime = this.submitMaxDelayMillis;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, ttime);
       }
       ttime = this.syncMaxDelayMillis;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, ttime);
       }
       ttime = this.ignoreSubmitWaitEnd;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(10, ttime);
       }
       ttime = this.waitEndSubmitMaxDelayMillis;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(11, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveQuizProto$SCLiveQuizQuestionAsked mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
                this.time = p0.readUInt64();
                break;
              case 18:
                if (this.liveQuiz == null) {
                   this.liveQuiz = new LiveQuizProto$LiveQuizModel();
                }
                p0.readMessage(this.liveQuiz);
                break;
              case 24:
                this.questionNumber = p0.readUInt32();
                break;
              case 32:
                this.questionStartTime = p0.readUInt64();
                break;
              case '(':
                this.questionEndTime = p0.readUInt64();
                break;
              case '2':
                this.title = p0.readString();
                break;
              case ':':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 58);
                LiveQuizProto$SCLiveQuizQuestionAsked toption = this.option;
                int i1 = (toption == null)? 0: toption.length;
                i = i + i1;
                LiveQuizProto$OptionModel[] optionModelA = new LiveQuizProto$OptionModel[i];
                if (i1) {
                   System.arraycopy(toption, 0, optionModelA, 0, i1);
                }
                int i2 = i - 1;
                while (i1 < i2) {
                   optionModelA[i1] = new LiveQuizProto$OptionModel();
                   p0.readMessage(optionModelA[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                optionModelA[i1] = new LiveQuizProto$OptionModel();
                p0.readMessage(optionModelA[i1]);
                this.option = optionModelA;
                break;
              case '@':
                this.submitMaxDelayMillis = p0.readUInt64();
                break;
              case 'H':
                this.syncMaxDelayMillis = p0.readUInt64();
                break;
              case 'P':
                this.ignoreSubmitWaitEnd = p0.readBool();
                break;
              case 'X':
                this.waitEndSubmitMaxDelayMillis = p0.readUInt64();
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
       LiveQuizProto$SCLiveQuizQuestionAsked ttime = this.time;
       int i = 0;
       if (ttime - i) {
          p0.writeUInt64(1, ttime);
       }
       ttime = this.liveQuiz;
       if (ttime != null) {
          p0.writeMessage(2, ttime);
       }
       ttime = this.questionNumber;
       if (ttime != null) {
          p0.writeUInt32(3, ttime);
       }
       ttime = this.questionStartTime;
       if (ttime - i) {
          p0.writeUInt64(4, ttime);
       }
       ttime = this.questionEndTime;
       if (ttime - i) {
          p0.writeUInt64(5, ttime);
       }
       if (!(this.title).equals("")) {
          p0.writeString(6, this.title);
       }
       ttime = this.option;
       if (ttime != null && ttime.length > 0) {
          int i1 = 0;
          LiveQuizProto$SCLiveQuizQuestionAsked toption = this.option;
          while (i1 < toption.length) {
             object oobject = toption[i1];
             if (oobject != null) {
                p0.writeMessage(7, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ttime = this.submitMaxDelayMillis;
       if (ttime - i) {
          p0.writeUInt64(8, ttime);
       }
       ttime = this.syncMaxDelayMillis;
       if (ttime - i) {
          p0.writeUInt64(9, ttime);
       }
       ttime = this.ignoreSubmitWaitEnd;
       if (ttime != null) {
          p0.writeBool(10, ttime);
       }
       ttime = this.waitEndSubmitMaxDelayMillis;
       if (ttime - i) {
          p0.writeUInt64(11, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
