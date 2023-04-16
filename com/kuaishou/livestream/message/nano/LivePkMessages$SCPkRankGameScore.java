package com.kuaishou.livestream.message.nano.LivePkMessages$SCPkRankGameScore;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LivePkMessages$PkRankGameAuthorScore;
import com.kuaishou.livestream.message.nano.LivePkMessages$PkRankGameEndStatistic;
import com.kuaishou.livestream.message.nano.LivePkMessages$PkRankGameWinningStreakInfo;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LivePkMessages$SCPkRankGameScore extends MessageNano	// class@00122c
{
    public LivePkMessages$PkRankGameAuthorScore[] authorScoreList;
    public long deadline;
    public int endReason;
    public LivePkMessages$PkRankGameEndStatistic[] endStatistic;
    public long interruptAuthorId;
    public boolean isEnd;
    public String pkId;
    public LivePkMessages$PkRankGameWinningStreakInfo[] winningStreakInfo;
    public static LivePkMessages$SCPkRankGameScore[] _emptyArray;

    public void LivePkMessages$SCPkRankGameScore(){
       super();
       this.clear();
    }
    public static LivePkMessages$SCPkRankGameScore[] emptyArray(){
       if (LivePkMessages$SCPkRankGameScore._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePkMessages$SCPkRankGameScore._emptyArray == null) {
             LivePkMessages$SCPkRankGameScore[] sCPkRankGame = new LivePkMessages$SCPkRankGameScore[0];
             LivePkMessages$SCPkRankGameScore._emptyArray = sCPkRankGame;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePkMessages$SCPkRankGameScore._emptyArray;
    }
    public static LivePkMessages$SCPkRankGameScore parseFrom(CodedInputByteBufferNano p0){
       return new LivePkMessages$SCPkRankGameScore().mergeFrom(p0);
    }
    public static LivePkMessages$SCPkRankGameScore parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePkMessages$SCPkRankGameScore(), p0);
    }
    public LivePkMessages$SCPkRankGameScore clear(){
       this.pkId = "";
       this.authorScoreList = LivePkMessages$PkRankGameAuthorScore.emptyArray();
       this.deadline = 0;
       this.isEnd = false;
       this.endStatistic = LivePkMessages$PkRankGameEndStatistic.emptyArray();
       this.endReason = 0;
       this.winningStreakInfo = LivePkMessages$PkRankGameWinningStreakInfo.emptyArray();
       this.interruptAuthorId = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       LivePkMessages$SCPkRankGameScore tauthorScore1;
       object oobject;
       int i = super.computeSerializedSize();
       if (!(this.pkId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.pkId);
       }
       LivePkMessages$SCPkRankGameScore tauthorScore = this.authorScoreList;
       int i1 = 0;
       if (tauthorScore != null && tauthorScore.length > 0) {
          i2 = 0;
          tauthorScore1 = this.authorScoreList;
          while (i2 < tauthorScore1.length) {
             oobject = tauthorScore1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tauthorScore1 = this.deadline;
       if (tauthorScore1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tauthorScore1);
       }
       tauthorScore = this.isEnd;
       if (tauthorScore != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, tauthorScore);
       }
       tauthorScore = this.endStatistic;
       if (tauthorScore != null && tauthorScore.length > 0) {
          i2 = 0;
          tauthorScore1 = this.endStatistic;
          while (i2 < tauthorScore1.length) {
             oobject = tauthorScore1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tauthorScore = this.endReason;
       if (tauthorScore != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tauthorScore);
       }
       tauthorScore = this.winningStreakInfo;
       if (tauthorScore != null && tauthorScore.length > 0) {
          tauthorScore = this.winningStreakInfo;
          while (i1 < tauthorScore.length) {
             object oobject1 = tauthorScore[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(7, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tauthorScore = this.interruptAuthorId;
       if (tauthorScore) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tauthorScore);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePkMessages$SCPkRankGameScore mergeFrom(CodedInputByteBufferNano p0){
       LivePkMessages$SCPkRankGameScore twinningStre;
       int i2;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             int i1 = 18;
             if (i != i1) {
                if (i != 24) {
                   if (i != 32) {
                      i1 = 42;
                      if (i != i1) {
                         if (i != 48) {
                            i1 = 58;
                            if (i != i1) {
                               if (i != 64) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  this.interruptAuthorId = p0.readUInt64();
                               }
                            }else {
                               i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                               twinningStre = this.winningStreakInfo;
                               i2 = (twinningStre == null)? 0: twinningStre.length;
                               i = i + i2;
                               LivePkMessages$PkRankGameWinningStreakInfo[] pkRankGameWi = new LivePkMessages$PkRankGameWinningStreakInfo[i];
                               if (i2) {
                                  System.arraycopy(twinningStre, 0, pkRankGameWi, 0, i2);
                               }
                               i1 = i - 1;
                               while (i2 < i1) {
                                  pkRankGameWi[i2] = new LivePkMessages$PkRankGameWinningStreakInfo();
                                  p0.readMessage(pkRankGameWi[i2]);
                                  p0.readTag();
                                  i2 = i2 + 1;
                               }
                               pkRankGameWi[i2] = new LivePkMessages$PkRankGameWinningStreakInfo();
                               p0.readMessage(pkRankGameWi[i2]);
                               this.winningStreakInfo = pkRankGameWi;
                            }
                         }else {
                            i = p0.readInt32();
                            if (i && (i != 1 && i != 2)) {
                               continue ;
                            }else {
                               this.endReason = i;
                            }
                         }
                      }else {
                         i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                         twinningStre = this.endStatistic;
                         i2 = (twinningStre == null)? 0: twinningStre.length;
                         i = i + i2;
                         LivePkMessages$PkRankGameEndStatistic[] pkRankGameEn = new LivePkMessages$PkRankGameEndStatistic[i];
                         if (i2) {
                            System.arraycopy(twinningStre, 0, pkRankGameEn, 0, i2);
                         }
                         i1 = i - 1;
                         while (i2 < i1) {
                            pkRankGameEn[i2] = new LivePkMessages$PkRankGameEndStatistic();
                            p0.readMessage(pkRankGameEn[i2]);
                            p0.readTag();
                            i2 = i2 + 1;
                         }
                         pkRankGameEn[i2] = new LivePkMessages$PkRankGameEndStatistic();
                         p0.readMessage(pkRankGameEn[i2]);
                         this.endStatistic = pkRankGameEn;
                      }
                   }else {
                      this.isEnd = p0.readBool();
                   }
                }else {
                   this.deadline = p0.readUInt64();
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                twinningStre = this.authorScoreList;
                i2 = (twinningStre == null)? 0: twinningStre.length;
                i = i + i2;
                LivePkMessages$PkRankGameAuthorScore[] pkRankGameAu = new LivePkMessages$PkRankGameAuthorScore[i];
                if (i2) {
                   System.arraycopy(twinningStre, 0, pkRankGameAu, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   pkRankGameAu[i2] = new LivePkMessages$PkRankGameAuthorScore();
                   p0.readMessage(pkRankGameAu[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                pkRankGameAu[i2] = new LivePkMessages$PkRankGameAuthorScore();
                p0.readMessage(pkRankGameAu[i2]);
                this.authorScoreList = pkRankGameAu;
             }
          }else {
             this.pkId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       int i1;
       LivePkMessages$SCPkRankGameScore tauthorScore1;
       object oobject;
       if (!(this.pkId).equals("")) {
          p0.writeString(1, this.pkId);
       }
       LivePkMessages$SCPkRankGameScore tauthorScore = this.authorScoreList;
       int i = 0;
       if (tauthorScore != null && tauthorScore.length > 0) {
          i1 = 0;
          tauthorScore1 = this.authorScoreList;
          while (i1 < tauthorScore1.length) {
             oobject = tauthorScore1[i1];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tauthorScore1 = this.deadline;
       if (tauthorScore1) {
          p0.writeUInt64(3, tauthorScore1);
       }
       tauthorScore = this.isEnd;
       if (tauthorScore != null) {
          p0.writeBool(4, tauthorScore);
       }
       tauthorScore = this.endStatistic;
       if (tauthorScore != null && tauthorScore.length > 0) {
          i1 = 0;
          tauthorScore1 = this.endStatistic;
          while (i1 < tauthorScore1.length) {
             oobject = tauthorScore1[i1];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tauthorScore = this.endReason;
       if (tauthorScore != null) {
          p0.writeInt32(6, tauthorScore);
       }
       tauthorScore = this.winningStreakInfo;
       if (tauthorScore != null && tauthorScore.length > 0) {
          tauthorScore = this.winningStreakInfo;
          while (i < tauthorScore.length) {
             object oobject1 = tauthorScore[i];
             if (oobject1 != null) {
                p0.writeMessage(7, oobject1);
             }
             i = i + 1;
          }
       }
       tauthorScore = this.interruptAuthorId;
       if (tauthorScore) {
          p0.writeUInt64(8, tauthorScore);
       }
       super.writeTo(p0);
       return;
    }
}
