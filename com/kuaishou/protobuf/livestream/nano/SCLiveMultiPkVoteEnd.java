package com.kuaishou.protobuf.livestream.nano.SCLiveMultiPkVoteEnd;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkTeam;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.System;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkBottomTip;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkContinuousWin;

public final class SCLiveMultiPkVoteEnd extends MessageNano	// class@000d65
{
    public LiveMultiPkBottomTip bottomTip;
    public LiveMultiPkContinuousWin continuousWin;
    public long[] enableShowRealScoreUser;
    public long penaltyDeadline;
    public String penaltyText;
    public String pkId;
    public long prePenaltyDeadline;
    public LiveMultiPkTeam[] team;
    public long time;
    public int voteEndType;
    public static SCLiveMultiPkVoteEnd[] _emptyArray;

    public void SCLiveMultiPkVoteEnd(){
       super();
       this.clear();
    }
    public static SCLiveMultiPkVoteEnd[] emptyArray(){
       if (SCLiveMultiPkVoteEnd._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveMultiPkVoteEnd._emptyArray == null) {
             SCLiveMultiPkVoteEnd[] sCLiveMultiP = new SCLiveMultiPkVoteEnd[0];
             SCLiveMultiPkVoteEnd._emptyArray = sCLiveMultiP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveMultiPkVoteEnd._emptyArray;
    }
    public static SCLiveMultiPkVoteEnd parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveMultiPkVoteEnd().mergeFrom(p0);
    }
    public static SCLiveMultiPkVoteEnd parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveMultiPkVoteEnd(), p0);
    }
    public SCLiveMultiPkVoteEnd clear(){
       this.pkId = "";
       this.time = 0;
       this.team = LiveMultiPkTeam.emptyArray();
       this.prePenaltyDeadline = 0;
       this.penaltyDeadline = 0;
       this.penaltyText = "";
       this.continuousWin = null;
       this.voteEndType = 0;
       this.bottomTip = null;
       this.enableShowRealScoreUser = WireFormatNano.EMPTY_LONG_ARRAY;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.pkId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.pkId);
       }
       SCLiveMultiPkVoteEnd ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttime);
       }
       SCLiveMultiPkVoteEnd tteam = this.team;
       int i1 = 0;
       if (tteam != null && tteam.length > 0) {
          i2 = 0;
          SCLiveMultiPkVoteEnd tteam1 = this.team;
          while (i2 < tteam1.length) {
             object oobject = tteam1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i2 = i2 + 1;
          }
       }
       SCLiveMultiPkVoteEnd tprePenaltyD = this.prePenaltyDeadline;
       if (tprePenaltyD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tprePenaltyD);
       }
       tprePenaltyD = this.penaltyDeadline;
       if (tprePenaltyD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tprePenaltyD);
       }
       if (!(this.penaltyText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.penaltyText);
       }
       tteam = this.continuousWin;
       if (tteam != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, tteam);
       }
       tteam = this.voteEndType;
       if (tteam != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, tteam);
       }
       tteam = this.bottomTip;
       if (tteam != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, tteam);
       }
       tteam = this.enableShowRealScoreUser;
       if (tteam != null && tteam.length > 0) {
          i2 = 0;
          SCLiveMultiPkVoteEnd tenableShowR = this.enableShowRealScoreUser;
          while (i1 < tenableShowR.length) {
             i2 = i2 + CodedOutputByteBufferNano.computeUInt64SizeNoTag(tenableShowR[i1]);
             i1 = i1 + 1;
          }
          i = (i + i2) + (tenableShowR.length * 1);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveMultiPkVoteEnd mergeFrom(CodedInputByteBufferNano p0){
       SCLiveMultiPkVoteEnd tteam;
       int i2;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 10:
                this.pkId = p0.readString();
                break;
              case 16:
                this.time = p0.readUInt64();
                break;
              case 26:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 26);
                tteam = this.team;
                i2 = (tteam == null)? 0: tteam.length;
                i = i + i2;
                LiveMultiPkTeam[] liveMultiPkT = new LiveMultiPkTeam[i];
                if (i2) {
                   System.arraycopy(tteam, i1, liveMultiPkT, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveMultiPkT[i2] = new LiveMultiPkTeam();
                   p0.readMessage(liveMultiPkT[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveMultiPkT[i2] = new LiveMultiPkTeam();
                p0.readMessage(liveMultiPkT[i2]);
                this.team = liveMultiPkT;
                break;
              case 32:
                this.prePenaltyDeadline = p0.readUInt64();
                break;
              case '(':
                this.penaltyDeadline = p0.readUInt64();
                break;
              case '2':
                this.penaltyText = p0.readString();
                break;
              case ':':
                if (this.continuousWin == null) {
                   this.continuousWin = new LiveMultiPkContinuousWin();
                }
                p0.readMessage(this.continuousWin);
                break;
              case '@':
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.voteEndType = i;
                }
                break;
              case 'J':
                if (this.bottomTip == null) {
                   this.bottomTip = new LiveMultiPkBottomTip();
                }
                p0.readMessage(this.bottomTip);
                break;
              case 'P':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 80);
                tteam = this.enableShowRealScoreUser;
                i2 = (tteam == null)? 0: tteam.length;
                i = i + i2;
                long[] olongArray = new long[i];
                if (i2) {
                   System.arraycopy(tteam, i1, olongArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   olongArray[i2] = p0.readUInt64();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                olongArray[i2] = p0.readUInt64();
                this.enableShowRealScoreUser = olongArray;
                break;
              case 'R':
                i = p0.pushLimit(p0.readRawVarint32());
                int position = p0.getPosition();
                i2 = 0;
                while (p0.getBytesUntilLimit() > 0) {
                   p0.readUInt64();
                   i2 = i2 + 1;
                }
                p0.rewindToPosition(position);
                tteam = this.enableShowRealScoreUser;
                int i3 = (tteam == null)? 0: tteam.length;
                i2 = i2 + i3;
                long[] olongArray1 = new long[i2];
                if (i3) {
                   System.arraycopy(tteam, i1, olongArray1, i1, i3);
                }
                while (i3 < i2) {
                   olongArray1[i3] = p0.readUInt64();
                   i3 = i3 + 1;
                }
                this.enableShowRealScoreUser = olongArray1;
                p0.popLimit(i);
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
       String str = "";
       if (!(this.pkId).equals(str)) {
          p0.writeString(1, this.pkId);
       }
       SCLiveMultiPkVoteEnd ttime = this.time;
       if (ttime) {
          p0.writeUInt64(2, ttime);
       }
       SCLiveMultiPkVoteEnd tteam = this.team;
       int i = 0;
       if (tteam != null && tteam.length > 0) {
          int i1 = 0;
          SCLiveMultiPkVoteEnd tteam1 = this.team;
          while (i1 < tteam1.length) {
             object oobject = tteam1[i1];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       SCLiveMultiPkVoteEnd tprePenaltyD = this.prePenaltyDeadline;
       if (tprePenaltyD) {
          p0.writeUInt64(4, tprePenaltyD);
       }
       tprePenaltyD = this.penaltyDeadline;
       if (tprePenaltyD) {
          p0.writeUInt64(5, tprePenaltyD);
       }
       if (!(this.penaltyText).equals(str)) {
          p0.writeString(6, this.penaltyText);
       }
       tteam = this.continuousWin;
       if (tteam != null) {
          p0.writeMessage(7, tteam);
       }
       tteam = this.voteEndType;
       if (tteam != null) {
          p0.writeInt32(8, tteam);
       }
       tteam = this.bottomTip;
       if (tteam != null) {
          p0.writeMessage(9, tteam);
       }
       tteam = this.enableShowRealScoreUser;
       if (tteam != null && tteam.length > 0) {
          tteam = this.enableShowRealScoreUser;
          while (i < tteam.length) {
             p0.writeUInt64(10, tteam[i]);
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
