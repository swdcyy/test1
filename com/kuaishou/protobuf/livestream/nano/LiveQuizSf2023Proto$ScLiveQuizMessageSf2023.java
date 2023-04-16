package com.kuaishou.protobuf.livestream.nano.LiveQuizSf2023Proto$ScLiveQuizMessageSf2023;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveQuizSf2023Proto$QuizCardSf2023;

public final class LiveQuizSf2023Proto$ScLiveQuizMessageSf2023 extends MessageNano	// class@000d03
{
    public long apiDelayDurationMs;
    public String correctAnswer;
    public int correctOptionId;
    public long displayDurationMs;
    public long displayTimeMs;
    public long index;
    public LiveQuizSf2023Proto$QuizCardSf2023 quizCard;
    public int type;
    public static LiveQuizSf2023Proto$ScLiveQuizMessageSf2023[] _emptyArray;

    public void LiveQuizSf2023Proto$ScLiveQuizMessageSf2023(){
       super();
       this.clear();
    }
    public static LiveQuizSf2023Proto$ScLiveQuizMessageSf2023[] emptyArray(){
       if (LiveQuizSf2023Proto$ScLiveQuizMessageSf2023._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveQuizSf2023Proto$ScLiveQuizMessageSf2023._emptyArray == null) {
             LiveQuizSf2023Proto$ScLiveQuizMessageSf2023[] scLiveQuizMe = new LiveQuizSf2023Proto$ScLiveQuizMessageSf2023[0];
             LiveQuizSf2023Proto$ScLiveQuizMessageSf2023._emptyArray = scLiveQuizMe;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveQuizSf2023Proto$ScLiveQuizMessageSf2023._emptyArray;
    }
    public static LiveQuizSf2023Proto$ScLiveQuizMessageSf2023 parseFrom(CodedInputByteBufferNano p0){
       return new LiveQuizSf2023Proto$ScLiveQuizMessageSf2023().mergeFrom(p0);
    }
    public static LiveQuizSf2023Proto$ScLiveQuizMessageSf2023 parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveQuizSf2023Proto$ScLiveQuizMessageSf2023(), p0);
    }
    public LiveQuizSf2023Proto$ScLiveQuizMessageSf2023 clear(){
       this.quizCard = null;
       this.type = 0;
       this.apiDelayDurationMs = 0;
       this.displayTimeMs = 0;
       this.displayDurationMs = 0;
       this.correctOptionId = 0;
       this.correctAnswer = "";
       this.index = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveQuizSf2023Proto$ScLiveQuizMessageSf2023 tquizCard = this.quizCard;
       if (tquizCard != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tquizCard);
       }
       tquizCard = this.type;
       if (tquizCard != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tquizCard);
       }
       tquizCard = this.apiDelayDurationMs;
       int i1 = 0;
       if (tquizCard - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tquizCard);
       }
       tquizCard = this.displayTimeMs;
       if (tquizCard - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tquizCard);
       }
       tquizCard = this.displayDurationMs;
       if (tquizCard - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tquizCard);
       }
       tquizCard = this.correctOptionId;
       if (tquizCard != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tquizCard);
       }
       if (!(this.correctAnswer).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.correctAnswer);
       }
       tquizCard = this.index;
       if (tquizCard - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tquizCard);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveQuizSf2023Proto$ScLiveQuizMessageSf2023 mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 48) {
                            if (i != 58) {
                               if (i != 64) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  this.index = p0.readUInt64();
                               }
                            }else {
                               this.correctAnswer = p0.readString();
                            }
                         }else {
                            this.correctOptionId = p0.readUInt32();
                         }
                      }else {
                         this.displayDurationMs = p0.readUInt64();
                      }
                   }else {
                      this.displayTimeMs = p0.readUInt64();
                   }
                }else {
                   this.apiDelayDurationMs = p0.readUInt64();
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.type = i;
                }
             }
          }else if(this.quizCard == null){
             this.quizCard = new LiveQuizSf2023Proto$QuizCardSf2023();
          }
          p0.readMessage(this.quizCard);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveQuizSf2023Proto$ScLiveQuizMessageSf2023 tquizCard = this.quizCard;
       if (tquizCard != null) {
          p0.writeMessage(1, tquizCard);
       }
       tquizCard = this.type;
       if (tquizCard != null) {
          p0.writeInt32(2, tquizCard);
       }
       tquizCard = this.apiDelayDurationMs;
       int i = 0;
       if (tquizCard - i) {
          p0.writeUInt64(3, tquizCard);
       }
       tquizCard = this.displayTimeMs;
       if (tquizCard - i) {
          p0.writeUInt64(4, tquizCard);
       }
       tquizCard = this.displayDurationMs;
       if (tquizCard - i) {
          p0.writeUInt64(5, tquizCard);
       }
       tquizCard = this.correctOptionId;
       if (tquizCard != null) {
          p0.writeUInt32(6, tquizCard);
       }
       if (!(this.correctAnswer).equals("")) {
          p0.writeString(7, this.correctAnswer);
       }
       tquizCard = this.index;
       if (tquizCard - i) {
          p0.writeUInt64(8, tquizCard);
       }
       super.writeTo(p0);
       return;
    }
}
