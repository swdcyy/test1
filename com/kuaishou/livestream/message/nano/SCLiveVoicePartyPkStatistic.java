package com.kuaishou.livestream.message.nano.SCLiveVoicePartyPkStatistic;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveVoicePartyPkTeamStatistic;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCLiveVoicePartyPkStatistic extends MessageNano	// class@001453
{
    public int myTeamType;
    public long penaltyDeadline;
    public String pkId;
    public long prePenaltyDeadline;
    public LiveVoicePartyPkTeamStatistic[] teamStat;
    public long time;
    public long voteDeadline;
    public boolean voteEnd;
    public long voteEndWaitDeadline;
    public long voteStartTime;
    public static SCLiveVoicePartyPkStatistic[] _emptyArray;

    public void SCLiveVoicePartyPkStatistic(){
       super();
       this.clear();
    }
    public static SCLiveVoicePartyPkStatistic[] emptyArray(){
       if (SCLiveVoicePartyPkStatistic._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveVoicePartyPkStatistic._emptyArray == null) {
             SCLiveVoicePartyPkStatistic[] sCLiveVoiceP = new SCLiveVoicePartyPkStatistic[0];
             SCLiveVoicePartyPkStatistic._emptyArray = sCLiveVoiceP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveVoicePartyPkStatistic._emptyArray;
    }
    public static SCLiveVoicePartyPkStatistic parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveVoicePartyPkStatistic().mergeFrom(p0);
    }
    public static SCLiveVoicePartyPkStatistic parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveVoicePartyPkStatistic(), p0);
    }
    public SCLiveVoicePartyPkStatistic clear(){
       this.pkId = "";
       this.time = 0;
       this.voteStartTime = 0;
       this.voteDeadline = 0;
       this.teamStat = LiveVoicePartyPkTeamStatistic.emptyArray();
       this.voteEnd = false;
       this.voteEndWaitDeadline = 0;
       this.prePenaltyDeadline = 0;
       this.penaltyDeadline = 0;
       this.myTeamType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.pkId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.pkId);
       }
       SCLiveVoicePartyPkStatistic ttime = this.time;
       int i1 = 0;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttime);
       }
       ttime = this.voteStartTime;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ttime);
       }
       ttime = this.voteDeadline;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, ttime);
       }
       ttime = this.teamStat;
       if (ttime != null && ttime.length > 0) {
          int i2 = 0;
          SCLiveVoicePartyPkStatistic tteamStat = this.teamStat;
          while (i2 < tteamStat.length) {
             object oobject = tteamStat[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i2 = i2 + 1;
          }
       }
       ttime = this.voteEnd;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, ttime);
       }
       ttime = this.voteEndWaitDeadline;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, ttime);
       }
       ttime = this.prePenaltyDeadline;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, ttime);
       }
       ttime = this.penaltyDeadline;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, ttime);
       }
       ttime = this.myTeamType;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(10, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveVoicePartyPkStatistic mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.pkId = p0.readString();
                break;
              case 16:
                this.time = p0.readUInt64();
                break;
              case 24:
                this.voteStartTime = p0.readUInt64();
                break;
              case 32:
                this.voteDeadline = p0.readUInt64();
                break;
              case '*':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 42);
                SCLiveVoicePartyPkStatistic tteamStat = this.teamStat;
                int i1 = (tteamStat == null)? 0: tteamStat.length;
                i = i + i1;
                LiveVoicePartyPkTeamStatistic[] liveVoicePar = new LiveVoicePartyPkTeamStatistic[i];
                if (i1) {
                   System.arraycopy(tteamStat, 0, liveVoicePar, 0, i1);
                }
                int i2 = i - 1;
                while (i1 < i2) {
                   liveVoicePar[i1] = new LiveVoicePartyPkTeamStatistic();
                   p0.readMessage(liveVoicePar[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                liveVoicePar[i1] = new LiveVoicePartyPkTeamStatistic();
                p0.readMessage(liveVoicePar[i1]);
                this.teamStat = liveVoicePar;
                break;
              case '0':
                this.voteEnd = p0.readBool();
                break;
              case '8':
                this.voteEndWaitDeadline = p0.readUInt64();
                break;
              case '@':
                this.prePenaltyDeadline = p0.readUInt64();
                break;
              case 'H':
                this.penaltyDeadline = p0.readUInt64();
                break;
              case 'P':
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.myTeamType = i;
                }
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
       if (!(this.pkId).equals("")) {
          p0.writeString(1, this.pkId);
       }
       SCLiveVoicePartyPkStatistic ttime = this.time;
       int i = 0;
       if (ttime - i) {
          p0.writeUInt64(2, ttime);
       }
       ttime = this.voteStartTime;
       if (ttime - i) {
          p0.writeUInt64(3, ttime);
       }
       ttime = this.voteDeadline;
       if (ttime - i) {
          p0.writeUInt64(4, ttime);
       }
       ttime = this.teamStat;
       if (ttime != null && ttime.length > 0) {
          int i1 = 0;
          SCLiveVoicePartyPkStatistic tteamStat = this.teamStat;
          while (i1 < tteamStat.length) {
             object oobject = tteamStat[i1];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ttime = this.voteEnd;
       if (ttime != null) {
          p0.writeBool(6, ttime);
       }
       ttime = this.voteEndWaitDeadline;
       if (ttime - i) {
          p0.writeUInt64(7, ttime);
       }
       ttime = this.prePenaltyDeadline;
       if (ttime - i) {
          p0.writeUInt64(8, ttime);
       }
       ttime = this.penaltyDeadline;
       if (ttime - i) {
          p0.writeUInt64(9, ttime);
       }
       ttime = this.myTeamType;
       if (ttime != null) {
          p0.writeInt32(10, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
