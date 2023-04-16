package com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$LiveQuiz2Model;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveQuiz2Proto$LiveQuiz2Model extends MessageNano	// class@000ce5
{
    public int currencyType;
    public int groupUsageType;
    public String liveQuizId;
    public int optionShuffleType;
    public int prizeDistributeStrategy;
    public int quizFailType;
    public int reviveCardUsageType;
    public long totalAwardCurrency;
    public int totalQuestions;
    public static LiveQuiz2Proto$LiveQuiz2Model[] _emptyArray;

    public void LiveQuiz2Proto$LiveQuiz2Model(){
       super();
       this.clear();
    }
    public static LiveQuiz2Proto$LiveQuiz2Model[] emptyArray(){
       if (LiveQuiz2Proto$LiveQuiz2Model._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveQuiz2Proto$LiveQuiz2Model._emptyArray == null) {
             LiveQuiz2Proto$LiveQuiz2Model[] liveQuiz2Mod = new LiveQuiz2Proto$LiveQuiz2Model[0];
             LiveQuiz2Proto$LiveQuiz2Model._emptyArray = liveQuiz2Mod;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveQuiz2Proto$LiveQuiz2Model._emptyArray;
    }
    public static LiveQuiz2Proto$LiveQuiz2Model parseFrom(CodedInputByteBufferNano p0){
       return new LiveQuiz2Proto$LiveQuiz2Model().mergeFrom(p0);
    }
    public static LiveQuiz2Proto$LiveQuiz2Model parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveQuiz2Proto$LiveQuiz2Model(), p0);
    }
    public LiveQuiz2Proto$LiveQuiz2Model clear(){
       this.liveQuizId = "";
       this.totalQuestions = 0;
       this.totalAwardCurrency = 0;
       this.quizFailType = 0;
       this.reviveCardUsageType = 0;
       this.prizeDistributeStrategy = 0;
       this.optionShuffleType = 0;
       this.currencyType = 0;
       this.groupUsageType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.liveQuizId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveQuizId);
       }
       LiveQuiz2Proto$LiveQuiz2Model ttotalQuesti = this.totalQuestions;
       if (ttotalQuesti != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, ttotalQuesti);
       }
       ttotalQuesti = this.totalAwardCurrency;
       if (ttotalQuesti) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, ttotalQuesti);
       }
       ttotalQuesti = this.quizFailType;
       if (ttotalQuesti != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, ttotalQuesti);
       }
       ttotalQuesti = this.reviveCardUsageType;
       if (ttotalQuesti != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, ttotalQuesti);
       }
       ttotalQuesti = this.prizeDistributeStrategy;
       if (ttotalQuesti != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(7, ttotalQuesti);
       }
       ttotalQuesti = this.optionShuffleType;
       if (ttotalQuesti != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, ttotalQuesti);
       }
       ttotalQuesti = this.currencyType;
       if (ttotalQuesti != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(9, ttotalQuesti);
       }
       ttotalQuesti = this.groupUsageType;
       if (ttotalQuesti != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(10, ttotalQuesti);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveQuiz2Proto$LiveQuiz2Model mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 24) {
                if (i != 32) {
                   if (i != 40) {
                      if (i != 48) {
                         if (i != 56) {
                            if (i != 64) {
                               if (i != 72) {
                                  if (i != 80) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     i = p0.readInt32();
                                     if (i && (i != 1 && i != 2)) {
                                        continue ;
                                     }else {
                                        this.groupUsageType = i;
                                     }
                                  }
                               }else {
                                  i = p0.readInt32();
                                  if (i && (i != 1 && i != 2)) {
                                     continue ;
                                  }else {
                                     this.currencyType = i;
                                  }
                               }
                            }else {
                               i = p0.readInt32();
                               if (i && (i != 1 && i != 2)) {
                                  continue ;
                               }else {
                                  this.optionShuffleType = i;
                               }
                            }
                         }else {
                            i = p0.readInt32();
                            if (i && (i != 1 && i != 2)) {
                               continue ;
                            }else {
                               this.prizeDistributeStrategy = i;
                            }
                         }
                      }else {
                         i = p0.readInt32();
                         if (i && (i != 1 && i != 2)) {
                            continue ;
                         }else {
                            this.reviveCardUsageType = i;
                         }
                      }
                   }else {
                      i = p0.readInt32();
                      if (i && (i != 1 && i != 2)) {
                         continue ;
                      }else {
                         this.quizFailType = i;
                      }
                   }
                }else {
                   this.totalAwardCurrency = p0.readUInt64();
                }
             }else {
                this.totalQuestions = p0.readUInt32();
             }
          }else {
             this.liveQuizId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.liveQuizId).equals("")) {
          p0.writeString(1, this.liveQuizId);
       }
       LiveQuiz2Proto$LiveQuiz2Model ttotalQuesti = this.totalQuestions;
       if (ttotalQuesti != null) {
          p0.writeUInt32(3, ttotalQuesti);
       }
       ttotalQuesti = this.totalAwardCurrency;
       if (ttotalQuesti) {
          p0.writeUInt64(4, ttotalQuesti);
       }
       ttotalQuesti = this.quizFailType;
       if (ttotalQuesti != null) {
          p0.writeInt32(5, ttotalQuesti);
       }
       ttotalQuesti = this.reviveCardUsageType;
       if (ttotalQuesti != null) {
          p0.writeInt32(6, ttotalQuesti);
       }
       ttotalQuesti = this.prizeDistributeStrategy;
       if (ttotalQuesti != null) {
          p0.writeInt32(7, ttotalQuesti);
       }
       ttotalQuesti = this.optionShuffleType;
       if (ttotalQuesti != null) {
          p0.writeInt32(8, ttotalQuesti);
       }
       ttotalQuesti = this.currencyType;
       if (ttotalQuesti != null) {
          p0.writeInt32(9, ttotalQuesti);
       }
       ttotalQuesti = this.groupUsageType;
       if (ttotalQuesti != null) {
          p0.writeInt32(10, ttotalQuesti);
       }
       super.writeTo(p0);
       return;
    }
}
