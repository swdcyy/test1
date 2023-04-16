package com.kuaishou.livestream.message.nano.TeamPkStatisticInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.TeamStatisticInfo;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class TeamPkStatisticInfo extends MessageNano	// class@001473
{
    public long penaltyDeadline;
    public long startTime;
    public TeamStatisticInfo[] teamStatisticInfo;
    public long time;
    public long voteDeadline;
    public boolean voteEnd;
    public long voteEndWaitDeadline;
    public static TeamPkStatisticInfo[] _emptyArray;

    public void TeamPkStatisticInfo(){
       super();
       this.clear();
    }
    public static TeamPkStatisticInfo[] emptyArray(){
       if (TeamPkStatisticInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (TeamPkStatisticInfo._emptyArray == null) {
             TeamPkStatisticInfo[] teamPkStatis = new TeamPkStatisticInfo[0];
             TeamPkStatisticInfo._emptyArray = teamPkStatis;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return TeamPkStatisticInfo._emptyArray;
    }
    public static TeamPkStatisticInfo parseFrom(CodedInputByteBufferNano p0){
       return new TeamPkStatisticInfo().mergeFrom(p0);
    }
    public static TeamPkStatisticInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new TeamPkStatisticInfo(), p0);
    }
    public TeamPkStatisticInfo clear(){
       this.startTime = 0;
       this.voteDeadline = 0;
       this.voteEnd = false;
       this.penaltyDeadline = 0;
       this.voteEndWaitDeadline = 0;
       this.teamStatisticInfo = TeamStatisticInfo.emptyArray();
       this.time = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       TeamPkStatisticInfo tstartTime = this.startTime;
       int i1 = 0;
       if (tstartTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tstartTime);
       }
       tstartTime = this.voteDeadline;
       if (tstartTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tstartTime);
       }
       tstartTime = this.voteEnd;
       if (tstartTime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tstartTime);
       }
       tstartTime = this.penaltyDeadline;
       if (tstartTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tstartTime);
       }
       tstartTime = this.voteEndWaitDeadline;
       if (tstartTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tstartTime);
       }
       tstartTime = this.teamStatisticInfo;
       if (tstartTime != null && tstartTime.length > 0) {
          int i2 = 0;
          TeamPkStatisticInfo tteamStatist = this.teamStatisticInfo;
          while (i2 < tteamStatist.length) {
             object oobject = tteamStatist[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(6, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tstartTime = this.time;
       if (tstartTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tstartTime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public TeamPkStatisticInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         int i1 = 50;
                         if (i != i1) {
                            if (i != 56) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.time = p0.readUInt64();
                            }
                         }else {
                            i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                            TeamPkStatisticInfo tteamStatist = this.teamStatisticInfo;
                            int i2 = (tteamStatist == null)? 0: tteamStatist.length;
                            i = i + i2;
                            TeamStatisticInfo[] teamStatisti = new TeamStatisticInfo[i];
                            if (i2) {
                               System.arraycopy(tteamStatist, 0, teamStatisti, 0, i2);
                            }
                            i1 = i - 1;
                            while (i2 < i1) {
                               teamStatisti[i2] = new TeamStatisticInfo();
                               p0.readMessage(teamStatisti[i2]);
                               p0.readTag();
                               i2 = i2 + 1;
                            }
                            teamStatisti[i2] = new TeamStatisticInfo();
                            p0.readMessage(teamStatisti[i2]);
                            this.teamStatisticInfo = teamStatisti;
                         }
                      }else {
                         this.voteEndWaitDeadline = p0.readUInt64();
                      }
                   }else {
                      this.penaltyDeadline = p0.readUInt64();
                   }
                }else {
                   this.voteEnd = p0.readBool();
                }
             }else {
                this.voteDeadline = p0.readUInt64();
             }
          }else {
             this.startTime = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       TeamPkStatisticInfo tstartTime = this.startTime;
       int i = 0;
       if (tstartTime - i) {
          p0.writeUInt64(1, tstartTime);
       }
       tstartTime = this.voteDeadline;
       if (tstartTime - i) {
          p0.writeUInt64(2, tstartTime);
       }
       tstartTime = this.voteEnd;
       if (tstartTime != null) {
          p0.writeBool(3, tstartTime);
       }
       tstartTime = this.penaltyDeadline;
       if (tstartTime - i) {
          p0.writeUInt64(4, tstartTime);
       }
       tstartTime = this.voteEndWaitDeadline;
       if (tstartTime - i) {
          p0.writeUInt64(5, tstartTime);
       }
       tstartTime = this.teamStatisticInfo;
       if (tstartTime != null && tstartTime.length > 0) {
          int i1 = 0;
          TeamPkStatisticInfo tteamStatist = this.teamStatisticInfo;
          while (i1 < tteamStatist.length) {
             object oobject = tteamStatist[i1];
             if (oobject != null) {
                p0.writeMessage(6, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tstartTime = this.time;
       if (tstartTime - i) {
          p0.writeUInt64(7, tstartTime);
       }
       super.writeTo(p0);
       return;
    }
}
