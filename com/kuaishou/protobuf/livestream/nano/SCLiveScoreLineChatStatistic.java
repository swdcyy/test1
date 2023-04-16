package com.kuaishou.protobuf.livestream.nano.SCLiveScoreLineChatStatistic;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatTeam;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCLiveScoreLineChatStatistic extends MessageNano	// class@000d70
{
    public int giftId;
    public String scoreLineChatId;
    public int scoreType;
    public LiveScoreLineChatTeam[] team;
    public long time;
    public long version;
    public static SCLiveScoreLineChatStatistic[] _emptyArray;

    public void SCLiveScoreLineChatStatistic(){
       super();
       this.clear();
    }
    public static SCLiveScoreLineChatStatistic[] emptyArray(){
       if (SCLiveScoreLineChatStatistic._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveScoreLineChatStatistic._emptyArray == null) {
             SCLiveScoreLineChatStatistic[] sCLiveScoreL = new SCLiveScoreLineChatStatistic[0];
             SCLiveScoreLineChatStatistic._emptyArray = sCLiveScoreL;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveScoreLineChatStatistic._emptyArray;
    }
    public static SCLiveScoreLineChatStatistic parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveScoreLineChatStatistic().mergeFrom(p0);
    }
    public static SCLiveScoreLineChatStatistic parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveScoreLineChatStatistic(), p0);
    }
    public SCLiveScoreLineChatStatistic clear(){
       this.scoreLineChatId = "";
       this.scoreType = 0;
       this.time = 0;
       this.team = LiveScoreLineChatTeam.emptyArray();
       this.giftId = 0;
       this.version = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.scoreLineChatId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.scoreLineChatId);
       }
       SCLiveScoreLineChatStatistic tscoreType = this.scoreType;
       if (tscoreType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tscoreType);
       }
       tscoreType = this.time;
       int i1 = 0;
       if (tscoreType - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tscoreType);
       }
       tscoreType = this.team;
       if (tscoreType != null && tscoreType.length > 0) {
          int i2 = 0;
          SCLiveScoreLineChatStatistic tteam = this.team;
          while (i2 < tteam.length) {
             object oobject = tteam[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tscoreType = this.giftId;
       if (tscoreType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tscoreType);
       }
       tscoreType = this.version;
       if (tscoreType - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tscoreType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveScoreLineChatStatistic mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   int i1 = 34;
                   if (i != i1) {
                      if (i != 40) {
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.version = p0.readUInt64();
                         }
                      }else {
                         this.giftId = p0.readUInt32();
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      SCLiveScoreLineChatStatistic tteam = this.team;
                      int i2 = (tteam == null)? 0: tteam.length;
                      i = i + i2;
                      LiveScoreLineChatTeam[] liveScoreLin = new LiveScoreLineChatTeam[i];
                      if (i2) {
                         System.arraycopy(tteam, 0, liveScoreLin, 0, i2);
                      }
                      i1 = i - 1;
                      while (i2 < i1) {
                         liveScoreLin[i2] = new LiveScoreLineChatTeam();
                         p0.readMessage(liveScoreLin[i2]);
                         p0.readTag();
                         i2 = i2 + 1;
                      }
                      liveScoreLin[i2] = new LiveScoreLineChatTeam();
                      p0.readMessage(liveScoreLin[i2]);
                      this.team = liveScoreLin;
                   }
                }else {
                   this.time = p0.readUInt64();
                }
             }else {
                i = p0.readInt32();
                if (i && i != 1) {
                   continue ;
                }else {
                   this.scoreType = i;
                }
             }
          }else {
             this.scoreLineChatId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.scoreLineChatId).equals("")) {
          p0.writeString(1, this.scoreLineChatId);
       }
       SCLiveScoreLineChatStatistic tscoreType = this.scoreType;
       if (tscoreType != null) {
          p0.writeInt32(2, tscoreType);
       }
       tscoreType = this.time;
       int i = 0;
       if (tscoreType - i) {
          p0.writeUInt64(3, tscoreType);
       }
       tscoreType = this.team;
       if (tscoreType != null && tscoreType.length > 0) {
          int i1 = 0;
          SCLiveScoreLineChatStatistic tteam = this.team;
          while (i1 < tteam.length) {
             object oobject = tteam[i1];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tscoreType = this.giftId;
       if (tscoreType != null) {
          p0.writeUInt32(5, tscoreType);
       }
       tscoreType = this.version;
       if (tscoreType - i) {
          p0.writeUInt64(6, tscoreType);
       }
       super.writeTo(p0);
       return;
    }
}
