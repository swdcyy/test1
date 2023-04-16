package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCPkStatistic;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$PkPlayerStatistic;
import com.kuaishou.livestream.message.nano.LivePkMessages$PkTopScoreUser;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.System;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$PkEndInfo;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$PkHighValueStatistic;
import com.kuaishou.livestream.message.nano.LivePkMessages$PkRoundInfo;

public final class LiveStreamMessages$SCPkStatistic extends MessageNano	// class@001360
{
    public String audienceTipForRevenge;
    public String authorTipForRevenge;
    public LivePkMessages$PkRoundInfo currentRound;
    public boolean disableShowRealScore;
    public boolean enableFirstBloodHint;
    public boolean endByKo;
    public LiveStreamMessages$PkEndInfo endInfo;
    public boolean forbidPopCounterpartProfile;
    public boolean hideAudiencePkBangs;
    public boolean hideScore;
    public LiveStreamMessages$PkHighValueStatistic highValueStatistic;
    public long mvpShowDialogDeadline;
    public long mvpUserId;
    public long penaltyDeadline;
    public String pkId;
    public LivePkMessages$PkTopScoreUser[] pkTopSocreUser;
    public LiveStreamMessages$PkPlayerStatistic[] playStat;
    public long prePenaltyDeadline;
    public int reopenType;
    public String revengeRuleRouteUrl;
    public boolean seasonGame;
    public long[] showRealScoreWhitelist;
    public String showType;
    public long startTime;
    public long time;
    public long voteDeadline;
    public boolean voteEnd;
    public long voteEndWaitDeadline;
    public static LiveStreamMessages$SCPkStatistic[] _emptyArray;

    public void LiveStreamMessages$SCPkStatistic(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCPkStatistic[] emptyArray(){
       if (LiveStreamMessages$SCPkStatistic._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCPkStatistic._emptyArray == null) {
             LiveStreamMessages$SCPkStatistic[] sCPkStatisti = new LiveStreamMessages$SCPkStatistic[0];
             LiveStreamMessages$SCPkStatistic._emptyArray = sCPkStatisti;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCPkStatistic._emptyArray;
    }
    public static LiveStreamMessages$SCPkStatistic parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCPkStatistic().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCPkStatistic parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCPkStatistic(), p0);
    }
    public LiveStreamMessages$SCPkStatistic clear(){
       this.pkId = "";
       this.time = 0;
       this.startTime = 0;
       this.voteDeadline = 0;
       this.playStat = LiveStreamMessages$PkPlayerStatistic.emptyArray();
       this.voteEnd = false;
       this.voteEndWaitDeadline = 0;
       this.prePenaltyDeadline = 0;
       this.penaltyDeadline = 0;
       this.showType = "";
       this.mvpUserId = 0;
       this.mvpShowDialogDeadline = 0;
       this.pkTopSocreUser = LivePkMessages$PkTopScoreUser.emptyArray();
       this.currentRound = null;
       this.hideScore = false;
       this.forbidPopCounterpartProfile = false;
       this.enableFirstBloodHint = false;
       this.endByKo = false;
       this.reopenType = 0;
       this.authorTipForRevenge = "";
       this.audienceTipForRevenge = "";
       this.revengeRuleRouteUrl = "";
       this.highValueStatistic = null;
       this.seasonGame = false;
       this.endInfo = null;
       this.showRealScoreWhitelist = WireFormatNano.EMPTY_LONG_ARRAY;
       this.disableShowRealScore = false;
       this.hideAudiencePkBangs = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i3;
       LiveStreamMessages$SCPkStatistic tplayStat;
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.pkId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.pkId);
       }
       LiveStreamMessages$SCPkStatistic ttime = this.time;
       int i1 = 2;
       LiveStreamMessages$SCPkStatistic sCPkStatisti = null;
       if (ttime - sCPkStatisti) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(i1, ttime);
       }
       ttime = this.startTime;
       if (ttime - sCPkStatisti) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ttime);
       }
       ttime = this.voteDeadline;
       if (ttime - sCPkStatisti) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, ttime);
       }
       ttime = this.playStat;
       int i2 = 0;
       if (ttime != null && ttime.length > 0) {
          i3 = 0;
          tplayStat = this.playStat;
          while (i3 < tplayStat.length) {
             object oobject = tplayStat[i3];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i3 = i3 + 1;
          }
       }
       ttime = this.voteEnd;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, ttime);
       }
       tplayStat = this.voteEndWaitDeadline;
       if (tplayStat - sCPkStatisti) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tplayStat);
       }
       tplayStat = this.prePenaltyDeadline;
       if (tplayStat - sCPkStatisti) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tplayStat);
       }
       tplayStat = this.penaltyDeadline;
       if (tplayStat - sCPkStatisti) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, tplayStat);
       }
       if (!(this.showType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.showType);
       }
       tplayStat = this.mvpUserId;
       if (tplayStat - sCPkStatisti) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(11, tplayStat);
       }
       tplayStat = this.mvpShowDialogDeadline;
       if (tplayStat - sCPkStatisti) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(12, tplayStat);
       }
       ttime = this.pkTopSocreUser;
       if (ttime != null && ttime.length > 0) {
          i3 = 0;
          sCPkStatisti = this.pkTopSocreUser;
          while (i3 < sCPkStatisti.length) {
             object oobject1 = sCPkStatisti[i3];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(13, oobject1);
             }
             i3 = i3 + 1;
          }
       }
       ttime = this.currentRound;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(14, ttime);
       }
       ttime = this.hideScore;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(15, ttime);
       }
       ttime = this.forbidPopCounterpartProfile;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(16, ttime);
       }
       ttime = this.enableFirstBloodHint;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(17, ttime);
       }
       ttime = this.endByKo;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(18, ttime);
       }
       ttime = this.reopenType;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(19, ttime);
       }
       if (!(this.authorTipForRevenge).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(20, this.authorTipForRevenge);
       }
       if (!(this.audienceTipForRevenge).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(21, this.audienceTipForRevenge);
       }
       if (!(this.revengeRuleRouteUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(22, this.revengeRuleRouteUrl);
       }
       LiveStreamMessages$SCPkStatistic thighValueSt = this.highValueStatistic;
       if (thighValueSt != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(23, thighValueSt);
       }
       thighValueSt = this.seasonGame;
       if (thighValueSt != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(24, thighValueSt);
       }
       thighValueSt = this.endInfo;
       if (thighValueSt != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(25, thighValueSt);
       }
       thighValueSt = this.showRealScoreWhitelist;
       if (thighValueSt != null && thighValueSt.length > 0) {
          int i4 = 0;
          ttime = this.showRealScoreWhitelist;
          while (i2 < ttime.length) {
             i4 = i4 + CodedOutputByteBufferNano.computeUInt64SizeNoTag(ttime[i2]);
             i2 = i2 + 1;
          }
          i = (i + i4) + (ttime.length * 2);
       }
       LiveStreamMessages$SCPkStatistic tdisableShow = this.disableShowRealScore;
       if (tdisableShow != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(27, tdisableShow);
       }
       tdisableShow = this.hideAudiencePkBangs;
       if (tdisableShow != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(28, tdisableShow);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCPkStatistic mergeFrom(CodedInputByteBufferNano p0){
       LiveStreamMessages$SCPkStatistic tplayStat;
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
              case 24:
                this.startTime = p0.readUInt64();
                break;
              case 32:
                this.voteDeadline = p0.readUInt64();
                break;
              case '*':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 42);
                tplayStat = this.playStat;
                i2 = (tplayStat == null)? 0: tplayStat.length;
                i = i + i2;
                LiveStreamMessages$PkPlayerStatistic[] pkPlayerStat = new LiveStreamMessages$PkPlayerStatistic[i];
                if (i2) {
                   System.arraycopy(tplayStat, i1, pkPlayerStat, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   pkPlayerStat[i2] = new LiveStreamMessages$PkPlayerStatistic();
                   p0.readMessage(pkPlayerStat[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                pkPlayerStat[i2] = new LiveStreamMessages$PkPlayerStatistic();
                p0.readMessage(pkPlayerStat[i2]);
                this.playStat = pkPlayerStat;
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
              case 'R':
                this.showType = p0.readString();
                break;
              case 'X':
                this.mvpUserId = p0.readUInt64();
                break;
              case '`':
                this.mvpShowDialogDeadline = p0.readUInt64();
                break;
              case 'j':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 106);
                tplayStat = this.pkTopSocreUser;
                i2 = (tplayStat == null)? 0: tplayStat.length;
                i = i + i2;
                LivePkMessages$PkTopScoreUser[] pkTopScoreUs = new LivePkMessages$PkTopScoreUser[i];
                if (i2) {
                   System.arraycopy(tplayStat, i1, pkTopScoreUs, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   pkTopScoreUs[i2] = new LivePkMessages$PkTopScoreUser();
                   p0.readMessage(pkTopScoreUs[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                pkTopScoreUs[i2] = new LivePkMessages$PkTopScoreUser();
                p0.readMessage(pkTopScoreUs[i2]);
                this.pkTopSocreUser = pkTopScoreUs;
                break;
              case 'r':
                if (this.currentRound == null) {
                   this.currentRound = new LivePkMessages$PkRoundInfo();
                }
                p0.readMessage(this.currentRound);
                break;
              case 'x':
                this.hideScore = p0.readBool();
                break;
              case 128:
                this.forbidPopCounterpartProfile = p0.readBool();
                break;
              case 136:
                this.enableFirstBloodHint = p0.readBool();
                break;
              case 144:
                this.endByKo = p0.readBool();
                break;
              case 152:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.reopenType = i;
                }
                break;
              case 162:
                this.authorTipForRevenge = p0.readString();
                break;
              case 170:
                this.audienceTipForRevenge = p0.readString();
                break;
              case 178:
                this.revengeRuleRouteUrl = p0.readString();
                break;
              case 186:
                if (this.highValueStatistic == null) {
                   this.highValueStatistic = new LiveStreamMessages$PkHighValueStatistic();
                }
                p0.readMessage(this.highValueStatistic);
                break;
              case 192:
                this.seasonGame = p0.readBool();
                break;
              case 202:
                if (this.endInfo == null) {
                   this.endInfo = new LiveStreamMessages$PkEndInfo();
                }
                p0.readMessage(this.endInfo);
                break;
              case 208:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 208);
                tplayStat = this.showRealScoreWhitelist;
                i2 = (tplayStat == null)? 0: tplayStat.length;
                i = i + i2;
                long[] olongArray = new long[i];
                if (i2) {
                   System.arraycopy(tplayStat, i1, olongArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   olongArray[i2] = p0.readUInt64();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                olongArray[i2] = p0.readUInt64();
                this.showRealScoreWhitelist = olongArray;
                break;
              case 210:
                i = p0.pushLimit(p0.readRawVarint32());
                int position = p0.getPosition();
                i2 = 0;
                while (p0.getBytesUntilLimit() > 0) {
                   p0.readUInt64();
                   i2 = i2 + 1;
                }
                p0.rewindToPosition(position);
                tplayStat = this.showRealScoreWhitelist;
                int i3 = (tplayStat == null)? 0: tplayStat.length;
                i2 = i2 + i3;
                long[] olongArray1 = new long[i2];
                if (i3) {
                   System.arraycopy(tplayStat, i1, olongArray1, i1, i3);
                }
                while (i3 < i2) {
                   olongArray1[i3] = p0.readUInt64();
                   i3 = i3 + 1;
                }
                this.showRealScoreWhitelist = olongArray1;
                p0.popLimit(i);
                break;
              case 216:
                this.disableShowRealScore = p0.readBool();
                break;
              case 224:
                this.hideAudiencePkBangs = p0.readBool();
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
       int i2;
       LiveStreamMessages$SCPkStatistic tplayStat1;
       object oobject;
       String str = "";
       if (!(this.pkId).equals(str)) {
          p0.writeString(1, this.pkId);
       }
       LiveStreamMessages$SCPkStatistic ttime = this.time;
       int i = 0;
       if (ttime - i) {
          p0.writeUInt64(2, ttime);
       }
       ttime = this.startTime;
       if (ttime - i) {
          p0.writeUInt64(3, ttime);
       }
       ttime = this.voteDeadline;
       if (ttime - i) {
          p0.writeUInt64(4, ttime);
       }
       LiveStreamMessages$SCPkStatistic tplayStat = this.playStat;
       int i1 = 0;
       if (tplayStat != null && tplayStat.length > 0) {
          i2 = 0;
          tplayStat1 = this.playStat;
          while (i2 < tplayStat1.length) {
             oobject = tplayStat1[i2];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tplayStat = this.voteEnd;
       if (tplayStat != null) {
          p0.writeBool(6, tplayStat);
       }
       LiveStreamMessages$SCPkStatistic tvoteEndWait = this.voteEndWaitDeadline;
       if (tvoteEndWait - i) {
          p0.writeUInt64(7, tvoteEndWait);
       }
       tvoteEndWait = this.prePenaltyDeadline;
       if (tvoteEndWait - i) {
          p0.writeUInt64(8, tvoteEndWait);
       }
       tvoteEndWait = this.penaltyDeadline;
       if (tvoteEndWait - i) {
          p0.writeUInt64(9, tvoteEndWait);
       }
       if (!(this.showType).equals(str)) {
          p0.writeString(10, this.showType);
       }
       tvoteEndWait = this.mvpUserId;
       if (tvoteEndWait - i) {
          p0.writeUInt64(11, tvoteEndWait);
       }
       tvoteEndWait = this.mvpShowDialogDeadline;
       if (tvoteEndWait - i) {
          p0.writeUInt64(12, tvoteEndWait);
       }
       tplayStat = this.pkTopSocreUser;
       if (tplayStat != null && tplayStat.length > 0) {
          i2 = 0;
          tplayStat1 = this.pkTopSocreUser;
          while (i2 < tplayStat1.length) {
             oobject = tplayStat1[i2];
             if (oobject != null) {
                p0.writeMessage(13, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tplayStat = this.currentRound;
       if (tplayStat != null) {
          p0.writeMessage(14, tplayStat);
       }
       tplayStat = this.hideScore;
       if (tplayStat != null) {
          p0.writeBool(15, tplayStat);
       }
       tplayStat = this.forbidPopCounterpartProfile;
       if (tplayStat != null) {
          p0.writeBool(16, tplayStat);
       }
       tplayStat = this.enableFirstBloodHint;
       if (tplayStat != null) {
          p0.writeBool(17, tplayStat);
       }
       tplayStat = this.endByKo;
       if (tplayStat != null) {
          p0.writeBool(18, tplayStat);
       }
       tplayStat = this.reopenType;
       if (tplayStat != null) {
          p0.writeInt32(19, tplayStat);
       }
       if (!(this.authorTipForRevenge).equals(str)) {
          p0.writeString(20, this.authorTipForRevenge);
       }
       if (!(this.audienceTipForRevenge).equals(str)) {
          p0.writeString(21, this.audienceTipForRevenge);
       }
       if (!(this.revengeRuleRouteUrl).equals(str)) {
          p0.writeString(22, this.revengeRuleRouteUrl);
       }
       tplayStat = this.highValueStatistic;
       if (tplayStat != null) {
          p0.writeMessage(23, tplayStat);
       }
       tplayStat = this.seasonGame;
       if (tplayStat != null) {
          p0.writeBool(24, tplayStat);
       }
       tplayStat = this.endInfo;
       if (tplayStat != null) {
          p0.writeMessage(25, tplayStat);
       }
       tplayStat = this.showRealScoreWhitelist;
       if (tplayStat != null && tplayStat.length > 0) {
          tplayStat = this.showRealScoreWhitelist;
          while (i1 < tplayStat.length) {
             p0.writeUInt64(26, tplayStat[i1]);
             i1 = i1 + 1;
          }
       }
       tplayStat = this.disableShowRealScore;
       if (tplayStat != null) {
          p0.writeBool(27, tplayStat);
       }
       tplayStat = this.hideAudiencePkBangs;
       if (tplayStat != null) {
          p0.writeBool(28, tplayStat);
       }
       super.writeTo(p0);
       return;
    }
}
