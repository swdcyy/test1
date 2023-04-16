package com.kuaishou.protobuf.livestream.nano.LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeTokenReadySf2023;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeTokenReadySf2023 extends MessageNano	// class@000cfb
{
    public String correctAnswer;
    public int correctOptionId;
    public int maxRetryCount;
    public String quizId;
    public long quizIndex;
    public int quizType;
    public long requestIntervalMillis;
    public String sfLeeId;
    public static LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeTokenReadySf2023[] _emptyArray;

    public void LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeTokenReadySf2023(){
       super();
       this.clear();
    }
    public static LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeTokenReadySf2023[] emptyArray(){
       if (LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeTokenReadySf2023._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeTokenReadySf2023._emptyArray == null) {
             LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeTokenReadySf2023[] sCLiveQuizSF = new LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeTokenReadySf2023[0];
             LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeTokenReadySf2023._emptyArray = sCLiveQuizSF;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeTokenReadySf2023._emptyArray;
    }
    public static LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeTokenReadySf2023 parseFrom(CodedInputByteBufferNano p0){
       return new LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeTokenReadySf2023().mergeFrom(p0);
    }
    public static LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeTokenReadySf2023 parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeTokenReadySf2023(), p0);
    }
    public LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeTokenReadySf2023 clear(){
       this.sfLeeId = "";
       this.requestIntervalMillis = 0;
       this.maxRetryCount = 0;
       this.correctOptionId = 0;
       this.correctAnswer = "";
       this.quizType = 0;
       this.quizId = "";
       this.quizIndex = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.sfLeeId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.sfLeeId);
       }
       LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeTokenReadySf2023 trequestInte = this.requestIntervalMillis;
       if (trequestInte) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, trequestInte);
       }
       LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeTokenReadySf2023 tmaxRetryCou = this.maxRetryCount;
       if (tmaxRetryCou != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tmaxRetryCou);
       }
       tmaxRetryCou = this.correctOptionId;
       if (tmaxRetryCou != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tmaxRetryCou);
       }
       if (!(this.correctAnswer).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.correctAnswer);
       }
       tmaxRetryCou = this.quizType;
       if (tmaxRetryCou != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tmaxRetryCou);
       }
       if (!(this.quizId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.quizId);
       }
       tmaxRetryCou = this.quizIndex;
       if (tmaxRetryCou) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tmaxRetryCou);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeTokenReadySf2023 mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 42) {
                         if (i != 48) {
                            if (i != 58) {
                               if (i != 64) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  this.quizIndex = p0.readUInt64();
                               }
                            }else {
                               this.quizId = p0.readString();
                            }
                         }else {
                            i = p0.readInt32();
                            if (i && (i != 1 && i != 2)) {
                               continue ;
                            }else {
                               this.quizType = i;
                            }
                         }
                      }else {
                         this.correctAnswer = p0.readString();
                      }
                   }else {
                      this.correctOptionId = p0.readUInt32();
                   }
                }else {
                   this.maxRetryCount = p0.readUInt32();
                }
             }else {
                this.requestIntervalMillis = p0.readUInt64();
             }
          }else {
             this.sfLeeId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.sfLeeId).equals(str)) {
          p0.writeString(1, this.sfLeeId);
       }
       LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeTokenReadySf2023 trequestInte = this.requestIntervalMillis;
       if (trequestInte) {
          p0.writeUInt64(2, trequestInte);
       }
       LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeTokenReadySf2023 tmaxRetryCou = this.maxRetryCount;
       if (tmaxRetryCou != null) {
          p0.writeUInt32(3, tmaxRetryCou);
       }
       tmaxRetryCou = this.correctOptionId;
       if (tmaxRetryCou != null) {
          p0.writeUInt32(4, tmaxRetryCou);
       }
       if (!(this.correctAnswer).equals(str)) {
          p0.writeString(5, this.correctAnswer);
       }
       tmaxRetryCou = this.quizType;
       if (tmaxRetryCou != null) {
          p0.writeInt32(6, tmaxRetryCou);
       }
       if (!(this.quizId).equals(str)) {
          p0.writeString(7, this.quizId);
       }
       tmaxRetryCou = this.quizIndex;
       if (tmaxRetryCou) {
          p0.writeUInt64(8, tmaxRetryCou);
       }
       super.writeTo(p0);
       return;
    }
}
