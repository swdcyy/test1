package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCPkStart;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Map;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$CohesionGameInfo;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$PKFlowDiversionPayInfo;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$PkSkinTheme;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$PkValuesTip;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$PkFirstBloodHint;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$PkGameInfo;
import com.kuaishou.livestream.message.nano.LiveShopMessages$LiveInteractiveRoomShopCartStatus;

public final class LiveStreamMessages$SCPkStart extends MessageNano	// class@00135f
{
    public long animationDisplayDuration;
    public int autoMatchAgain;
    public long autoMatchAgainDurationMs;
    public LiveStreamMessages$CohesionGameInfo cohesionGameInfo;
    public Map continuousWinRouteUrl;
    public LiveStreamMessages$PkSkinTheme customPkSkinTheme;
    public boolean enableCohesionGame;
    public boolean enableContinuousWin;
    public boolean enablePkFirstBlood;
    public boolean enableReopenAtEndInAdvance;
    public boolean enableReopenAtPenalty;
    public boolean enableScoreRuleAutoShow;
    public LiveStreamMessages$PkFirstBloodHint firstBloodHint;
    public LiveStreamMessages$PKFlowDiversionPayInfo flowDiversionPayInfo;
    public boolean forbidPopCounterpartProfile;
    public LiveStreamMessages$PkGameInfo gameInfo;
    public long inviterId;
    public long koModeCloseTime;
    public long koModeOpenTime;
    public long koSuccessCountdownMillis;
    public long koTargetScoreDiff;
    public long lastWinnerId;
    public long luckEnabledEndTime;
    public long luckEnabledStartTime;
    public int luckyGiftId;
    public String luckyGiftToken;
    public long luckyTimeRequiredWatchDuration;
    public long matchAgainSelectTimeoutMs;
    public boolean pkBountyActivity;
    public String pkId;
    public int pkType;
    public LiveStreamMessages$PkValuesTip pkValuesTip;
    public boolean queryFollow;
    public long queryFollowMaxDelayMillis;
    public long reopenDisplayBeforeEndDuration;
    public long reopenRespondTimeoutMillis;
    public String scoreRule;
    public long scoreRuleAutoShowMillisAfterPkStart;
    public String scoreRuleRoute;
    public Map seasonContinueWinUrl;
    public boolean seasonGame;
    public String seasonLevelJumpUrl;
    public LiveShopMessages$LiveInteractiveRoomShopCartStatus shopCartStatus;
    public boolean showRuleEntrance;
    public boolean smallTalk;
    public long time;
    public static LiveStreamMessages$SCPkStart[] _emptyArray;

    public void LiveStreamMessages$SCPkStart(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCPkStart[] emptyArray(){
       if (LiveStreamMessages$SCPkStart._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCPkStart._emptyArray == null) {
             LiveStreamMessages$SCPkStart[] sCPkStartArr = new LiveStreamMessages$SCPkStart[0];
             LiveStreamMessages$SCPkStart._emptyArray = sCPkStartArr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCPkStart._emptyArray;
    }
    public static LiveStreamMessages$SCPkStart parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCPkStart().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCPkStart parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCPkStart(), p0);
    }
    public LiveStreamMessages$SCPkStart clear(){
       this.pkId = "";
       this.time = 0;
       this.queryFollow = false;
       this.queryFollowMaxDelayMillis = 0;
       this.shopCartStatus = null;
       this.forbidPopCounterpartProfile = false;
       this.gameInfo = null;
       this.enablePkFirstBlood = false;
       this.firstBloodHint = null;
       this.enableReopenAtPenalty = false;
       this.reopenDisplayBeforeEndDuration = 0;
       this.enableReopenAtEndInAdvance = false;
       this.reopenRespondTimeoutMillis = 0;
       this.koTargetScoreDiff = 0;
       this.koSuccessCountdownMillis = 0;
       this.continuousWinRouteUrl = null;
       this.enableContinuousWin = false;
       this.koModeOpenTime = 0;
       this.koModeCloseTime = 0;
       this.pkType = 0;
       this.lastWinnerId = 0;
       this.animationDisplayDuration = 0;
       this.luckyGiftId = 0;
       this.luckEnabledStartTime = 0;
       this.luckEnabledEndTime = 0;
       this.luckyTimeRequiredWatchDuration = 0;
       this.scoreRule = "";
       this.enableScoreRuleAutoShow = false;
       this.scoreRuleAutoShowMillisAfterPkStart = 0;
       this.luckyGiftToken = "";
       this.pkBountyActivity = false;
       this.pkValuesTip = null;
       this.autoMatchAgain = 0;
       this.autoMatchAgainDurationMs = 0;
       this.inviterId = 0;
       this.matchAgainSelectTimeoutMs = 0;
       this.customPkSkinTheme = null;
       this.seasonGame = false;
       this.seasonLevelJumpUrl = "";
       this.seasonContinueWinUrl = null;
       this.flowDiversionPayInfo = null;
       this.scoreRuleRoute = "";
       this.showRuleEntrance = false;
       this.enableCohesionGame = false;
       this.cohesionGameInfo = null;
       this.smallTalk = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.pkId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.pkId);
       }
       LiveStreamMessages$SCPkStart ttime = this.time;
       LiveStreamMessages$SCPkStart sCPkStart = null;
       if (ttime - sCPkStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttime);
       }
       LiveStreamMessages$SCPkStart tqueryFollow = this.queryFollow;
       if (tqueryFollow != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tqueryFollow);
       }
       ttime = this.queryFollowMaxDelayMillis;
       int i1 = 4;
       if (ttime - sCPkStart) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(i1, ttime);
       }
       ttime = this.shopCartStatus;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, ttime);
       }
       ttime = this.forbidPopCounterpartProfile;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, ttime);
       }
       ttime = this.gameInfo;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, ttime);
       }
       ttime = this.enablePkFirstBlood;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(8, ttime);
       }
       ttime = this.firstBloodHint;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, ttime);
       }
       ttime = this.enableReopenAtPenalty;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(10, ttime);
       }
       LiveStreamMessages$SCPkStart treopenDispl = this.reopenDisplayBeforeEndDuration;
       if (treopenDispl - sCPkStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(11, treopenDispl);
       }
       ttime = this.enableReopenAtEndInAdvance;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(12, ttime);
       }
       treopenDispl = this.reopenRespondTimeoutMillis;
       if (treopenDispl - sCPkStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(13, treopenDispl);
       }
       treopenDispl = this.koTargetScoreDiff;
       if (treopenDispl - sCPkStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(14, treopenDispl);
       }
       treopenDispl = this.koSuccessCountdownMillis;
       if (treopenDispl - sCPkStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(15, treopenDispl);
       }
       ttime = this.continuousWinRouteUrl;
       if (ttime != null) {
          i = i + InternalNano.computeMapFieldSize(ttime, 16, i1, 9);
       }
       ttime = this.enableContinuousWin;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(17, ttime);
       }
       treopenDispl = this.koModeOpenTime;
       if (treopenDispl - sCPkStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(18, treopenDispl);
       }
       treopenDispl = this.koModeCloseTime;
       if (treopenDispl - sCPkStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(19, treopenDispl);
       }
       ttime = this.pkType;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(20, ttime);
       }
       treopenDispl = this.lastWinnerId;
       if (treopenDispl - sCPkStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(21, treopenDispl);
       }
       treopenDispl = this.animationDisplayDuration;
       if (treopenDispl - sCPkStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(22, treopenDispl);
       }
       ttime = this.luckyGiftId;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(23, ttime);
       }
       treopenDispl = this.luckEnabledStartTime;
       if (treopenDispl - sCPkStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(24, treopenDispl);
       }
       treopenDispl = this.luckEnabledEndTime;
       if (treopenDispl - sCPkStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(25, treopenDispl);
       }
       treopenDispl = this.luckyTimeRequiredWatchDuration;
       if (treopenDispl - sCPkStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(26, treopenDispl);
       }
       if (!(this.scoreRule).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(27, this.scoreRule);
       }
       ttime = this.enableScoreRuleAutoShow;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(28, ttime);
       }
       treopenDispl = this.scoreRuleAutoShowMillisAfterPkStart;
       if (treopenDispl - sCPkStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(29, treopenDispl);
       }
       if (!(this.luckyGiftToken).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(30, this.luckyGiftToken);
       }
       ttime = this.pkBountyActivity;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(31, ttime);
       }
       ttime = this.pkValuesTip;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(32, ttime);
       }
       ttime = this.autoMatchAgain;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(33, ttime);
       }
       treopenDispl = this.autoMatchAgainDurationMs;
       if (treopenDispl - sCPkStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(34, treopenDispl);
       }
       treopenDispl = this.inviterId;
       if (treopenDispl - sCPkStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(35, treopenDispl);
       }
       treopenDispl = this.matchAgainSelectTimeoutMs;
       if (treopenDispl - sCPkStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(36, treopenDispl);
       }
       ttime = this.customPkSkinTheme;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(37, ttime);
       }
       ttime = this.seasonGame;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(38, ttime);
       }
       if (!(this.seasonLevelJumpUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(39, this.seasonLevelJumpUrl);
       }
       ttime = this.seasonContinueWinUrl;
       if (ttime != null) {
          i = i + InternalNano.computeMapFieldSize(ttime, 40, i1, 9);
       }
       tqueryFollow = this.flowDiversionPayInfo;
       if (tqueryFollow != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(41, tqueryFollow);
       }
       if (!(this.scoreRuleRoute).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(42, this.scoreRuleRoute);
       }
       tqueryFollow = this.showRuleEntrance;
       if (tqueryFollow != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(43, tqueryFollow);
       }
       tqueryFollow = this.enableCohesionGame;
       if (tqueryFollow != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(44, tqueryFollow);
       }
       tqueryFollow = this.cohesionGameInfo;
       if (tqueryFollow != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(45, tqueryFollow);
       }
       tqueryFollow = this.smallTalk;
       if (tqueryFollow != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(47, tqueryFollow);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCPkStart mergeFrom(CodedInputByteBufferNano p0){
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
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
                this.queryFollow = p0.readBool();
                break;
              case 32:
                this.queryFollowMaxDelayMillis = p0.readInt64();
                break;
              case '*':
                if (this.shopCartStatus == null) {
                   this.shopCartStatus = new LiveShopMessages$LiveInteractiveRoomShopCartStatus();
                }
                p0.readMessage(this.shopCartStatus);
                break;
              case '0':
                this.forbidPopCounterpartProfile = p0.readBool();
                break;
              case ':':
                if (this.gameInfo == null) {
                   this.gameInfo = new LiveStreamMessages$PkGameInfo();
                }
                p0.readMessage(this.gameInfo);
                break;
              case '@':
                this.enablePkFirstBlood = p0.readBool();
                break;
              case 'J':
                if (this.firstBloodHint == null) {
                   this.firstBloodHint = new LiveStreamMessages$PkFirstBloodHint();
                }
                p0.readMessage(this.firstBloodHint);
                break;
              case 'P':
                this.enableReopenAtPenalty = p0.readBool();
                break;
              case 'X':
                this.reopenDisplayBeforeEndDuration = p0.readUInt64();
                break;
              case '`':
                this.enableReopenAtEndInAdvance = p0.readBool();
                break;
              case 'h':
                this.reopenRespondTimeoutMillis = p0.readUInt64();
                break;
              case 'p':
                this.koTargetScoreDiff = p0.readUInt64();
                break;
              case 'x':
                this.koSuccessCountdownMillis = p0.readUInt64();
                break;
              case 130:
                this.continuousWinRouteUrl = InternalNano.mergeMapEntry(p0, this.continuousWinRouteUrl, mapFactory, 4, 9, null, 8, 18);
                break;
              case 136:
                this.enableContinuousWin = p0.readBool();
                break;
              case 144:
                this.koModeOpenTime = p0.readUInt64();
                break;
              case 152:
                this.koModeCloseTime = p0.readUInt64();
                break;
              case 160:
                i = p0.readInt32();
                switch (i){
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 1:
                      break;
                    default:
                }
                this.pkType = i;
                break;
              case 168:
                this.lastWinnerId = p0.readUInt64();
                break;
              case 176:
                this.animationDisplayDuration = p0.readUInt64();
                break;
              case 184:
                this.luckyGiftId = p0.readUInt32();
                break;
              case 192:
                this.luckEnabledStartTime = p0.readUInt64();
                break;
              case 200:
                this.luckEnabledEndTime = p0.readUInt64();
                break;
              case 208:
                this.luckyTimeRequiredWatchDuration = p0.readUInt64();
                break;
              case 218:
                this.scoreRule = p0.readString();
                break;
              case 224:
                this.enableScoreRuleAutoShow = p0.readBool();
                break;
              case 232:
                this.scoreRuleAutoShowMillisAfterPkStart = p0.readUInt64();
                break;
              case 242:
                this.luckyGiftToken = p0.readString();
                break;
              case 248:
                this.pkBountyActivity = p0.readBool();
                break;
              case 258:
                if (this.pkValuesTip == null) {
                   this.pkValuesTip = new LiveStreamMessages$PkValuesTip();
                }
                p0.readMessage(this.pkValuesTip);
                break;
              case 264:
                this.autoMatchAgain = p0.readUInt32();
                break;
              case 272:
                this.autoMatchAgainDurationMs = p0.readUInt64();
                break;
              case 280:
                this.inviterId = p0.readUInt64();
                break;
              case 288:
                this.matchAgainSelectTimeoutMs = p0.readUInt64();
                break;
              case 298:
                if (this.customPkSkinTheme == null) {
                   this.customPkSkinTheme = new LiveStreamMessages$PkSkinTheme();
                }
                p0.readMessage(this.customPkSkinTheme);
                break;
              case 304:
                this.seasonGame = p0.readBool();
                break;
              case 314:
                this.seasonLevelJumpUrl = p0.readString();
                break;
              case 322:
                this.seasonContinueWinUrl = InternalNano.mergeMapEntry(p0, this.seasonContinueWinUrl, mapFactory, 4, 9, null, 8, 18);
                break;
              case 330:
                if (this.flowDiversionPayInfo == null) {
                   this.flowDiversionPayInfo = new LiveStreamMessages$PKFlowDiversionPayInfo();
                }
                p0.readMessage(this.flowDiversionPayInfo);
                break;
              case 338:
                this.scoreRuleRoute = p0.readString();
                break;
              case 344:
                this.showRuleEntrance = p0.readBool();
                break;
              case 352:
                this.enableCohesionGame = p0.readBool();
                break;
              case 362:
                if (this.cohesionGameInfo == null) {
                   this.cohesionGameInfo = new LiveStreamMessages$CohesionGameInfo();
                }
                p0.readMessage(this.cohesionGameInfo);
                break;
              case 376:
                this.smallTalk = p0.readBool();
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
       LiveStreamMessages$SCPkStart ttime = this.time;
       LiveStreamMessages$SCPkStart sCPkStart = null;
       if (ttime - sCPkStart) {
          p0.writeUInt64(2, ttime);
       }
       LiveStreamMessages$SCPkStart tqueryFollow = this.queryFollow;
       if (tqueryFollow != null) {
          p0.writeBool(3, tqueryFollow);
       }
       ttime = this.queryFollowMaxDelayMillis;
       int i = 4;
       if (ttime - sCPkStart) {
          p0.writeInt64(i, ttime);
       }
       ttime = this.shopCartStatus;
       if (ttime != null) {
          p0.writeMessage(5, ttime);
       }
       ttime = this.forbidPopCounterpartProfile;
       if (ttime != null) {
          p0.writeBool(6, ttime);
       }
       ttime = this.gameInfo;
       if (ttime != null) {
          p0.writeMessage(7, ttime);
       }
       ttime = this.enablePkFirstBlood;
       if (ttime != null) {
          p0.writeBool(8, ttime);
       }
       ttime = this.firstBloodHint;
       if (ttime != null) {
          p0.writeMessage(9, ttime);
       }
       ttime = this.enableReopenAtPenalty;
       if (ttime != null) {
          p0.writeBool(10, ttime);
       }
       LiveStreamMessages$SCPkStart treopenDispl = this.reopenDisplayBeforeEndDuration;
       if (treopenDispl - sCPkStart) {
          p0.writeUInt64(11, treopenDispl);
       }
       ttime = this.enableReopenAtEndInAdvance;
       if (ttime != null) {
          p0.writeBool(12, ttime);
       }
       treopenDispl = this.reopenRespondTimeoutMillis;
       if (treopenDispl - sCPkStart) {
          p0.writeUInt64(13, treopenDispl);
       }
       treopenDispl = this.koTargetScoreDiff;
       if (treopenDispl - sCPkStart) {
          p0.writeUInt64(14, treopenDispl);
       }
       treopenDispl = this.koSuccessCountdownMillis;
       if (treopenDispl - sCPkStart) {
          p0.writeUInt64(15, treopenDispl);
       }
       ttime = this.continuousWinRouteUrl;
       if (ttime != null) {
          InternalNano.serializeMapField(p0, ttime, 16, i, 9);
       }
       ttime = this.enableContinuousWin;
       if (ttime != null) {
          p0.writeBool(17, ttime);
       }
       treopenDispl = this.koModeOpenTime;
       if (treopenDispl - sCPkStart) {
          p0.writeUInt64(18, treopenDispl);
       }
       treopenDispl = this.koModeCloseTime;
       if (treopenDispl - sCPkStart) {
          p0.writeUInt64(19, treopenDispl);
       }
       ttime = this.pkType;
       if (ttime != null) {
          p0.writeInt32(20, ttime);
       }
       treopenDispl = this.lastWinnerId;
       if (treopenDispl - sCPkStart) {
          p0.writeUInt64(21, treopenDispl);
       }
       treopenDispl = this.animationDisplayDuration;
       if (treopenDispl - sCPkStart) {
          p0.writeUInt64(22, treopenDispl);
       }
       ttime = this.luckyGiftId;
       if (ttime != null) {
          p0.writeUInt32(23, ttime);
       }
       treopenDispl = this.luckEnabledStartTime;
       if (treopenDispl - sCPkStart) {
          p0.writeUInt64(24, treopenDispl);
       }
       treopenDispl = this.luckEnabledEndTime;
       if (treopenDispl - sCPkStart) {
          p0.writeUInt64(25, treopenDispl);
       }
       treopenDispl = this.luckyTimeRequiredWatchDuration;
       if (treopenDispl - sCPkStart) {
          p0.writeUInt64(26, treopenDispl);
       }
       if (!(this.scoreRule).equals(str)) {
          p0.writeString(27, this.scoreRule);
       }
       ttime = this.enableScoreRuleAutoShow;
       if (ttime != null) {
          p0.writeBool(28, ttime);
       }
       treopenDispl = this.scoreRuleAutoShowMillisAfterPkStart;
       if (treopenDispl - sCPkStart) {
          p0.writeUInt64(29, treopenDispl);
       }
       if (!(this.luckyGiftToken).equals(str)) {
          p0.writeString(30, this.luckyGiftToken);
       }
       ttime = this.pkBountyActivity;
       if (ttime != null) {
          p0.writeBool(31, ttime);
       }
       ttime = this.pkValuesTip;
       if (ttime != null) {
          p0.writeMessage(32, ttime);
       }
       ttime = this.autoMatchAgain;
       if (ttime != null) {
          p0.writeUInt32(33, ttime);
       }
       treopenDispl = this.autoMatchAgainDurationMs;
       if (treopenDispl - sCPkStart) {
          p0.writeUInt64(34, treopenDispl);
       }
       treopenDispl = this.inviterId;
       if (treopenDispl - sCPkStart) {
          p0.writeUInt64(35, treopenDispl);
       }
       treopenDispl = this.matchAgainSelectTimeoutMs;
       if (treopenDispl - sCPkStart) {
          p0.writeUInt64(36, treopenDispl);
       }
       ttime = this.customPkSkinTheme;
       if (ttime != null) {
          p0.writeMessage(37, ttime);
       }
       ttime = this.seasonGame;
       if (ttime != null) {
          p0.writeBool(38, ttime);
       }
       if (!(this.seasonLevelJumpUrl).equals(str)) {
          p0.writeString(39, this.seasonLevelJumpUrl);
       }
       ttime = this.seasonContinueWinUrl;
       if (ttime != null) {
          InternalNano.serializeMapField(p0, ttime, 40, i, 9);
       }
       tqueryFollow = this.flowDiversionPayInfo;
       if (tqueryFollow != null) {
          p0.writeMessage(41, tqueryFollow);
       }
       if (!(this.scoreRuleRoute).equals(str)) {
          p0.writeString(42, this.scoreRuleRoute);
       }
       tqueryFollow = this.showRuleEntrance;
       if (tqueryFollow != null) {
          p0.writeBool(43, tqueryFollow);
       }
       tqueryFollow = this.enableCohesionGame;
       if (tqueryFollow != null) {
          p0.writeBool(44, tqueryFollow);
       }
       tqueryFollow = this.cohesionGameInfo;
       if (tqueryFollow != null) {
          p0.writeMessage(45, tqueryFollow);
       }
       tqueryFollow = this.smallTalk;
       if (tqueryFollow != null) {
          p0.writeBool(47, tqueryFollow);
       }
       super.writeTo(p0);
       return;
    }
}
