package com.kuaishou.client.log.stat.packages.nano.ClientStat$AnchorStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$SoundEffectUsagePackage;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$LiveUseGlassesPackage;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class ClientStat$AnchorStatEvent extends MessageNano	// class@00079b
{
    public boolean advBeautifyEnabled;
    public long badBpsDuration;
    public long badFpsDuration;
    public boolean beautifyEnabled;
    public long bestBpsDuration;
    public long bestFpsDuration;
    public long betterBpsDuration;
    public long betterFpsDuration;
    public long blockCnt;
    public long bufferTime;
    public int cid;
    public boolean coverCaption;
    public long coverHandleCost;
    public long cpuFreqDownCnt;
    public long cpuFreqUpCnt;
    public long droppedFrameCnt;
    public long emptyBpsDuration;
    public long emptyFpsDuration;
    public long encodedVideoFrameCnt;
    public long firstFeedTime;
    public long firstRaceStartTime;
    public long fullscreenDuration;
    public long glassesBlockCnt;
    public long glassesBlockDuration;
    public String idc;
    public boolean initiativeLeave;
    public boolean isFirstEnterLive;
    public int lac;
    public long landscapeDuration;
    public long likeCnt;
    public long liveCheckResolutionRequestDuration;
    public long liveEncodeType;
    public long liveExceptionErrorCode;
    public long livePrepushRequestDuration;
    public long livePushEndTime;
    public long livePushStartTime;
    public long liveStartPushRequestDuration;
    public long liveStartToltalCost;
    public String liveStreamEncodeDetail;
    public String liveStreamHost;
    public String liveStreamId;
    public String liveStreamServerIp;
    public int liveStreamType;
    public long lpAppearDuration;
    public long lpCommentReadyDuration;
    public long lpPlayerRenderedDuration;
    public long lpResponseDuration;
    public int mcc;
    public int mnc;
    public String musicDuration;
    public long normalBpsDuration;
    public long normalFpsDuration;
    public long onlineCntLeave;
    public long openLivePushPageCost;
    public int ping;
    public long portraitDuration;
    public long prepareTime;
    public int pushCdnReason;
    public String pushUrl;
    public String raceVersion;
    public long realtimeUploadNum;
    public int resolutionType;
    public long retryCnt;
    public int rssi;
    public int screenOrientationLeaveType;
    public int screenOrientationSwitchCnt;
    public String sdkVersionNum;
    public int serverMode;
    public ClientStat$SoundEffectUsagePackage[] soundEffectUsage;
    public long startPushCost;
    public long totalDuration;
    public long traffic;
    public boolean useGlasses;
    public ClientStat$LiveUseGlassesPackage[] useGlassesPackage;
    public int videoResolutionType;
    public long waitDuration;
    public long worstBpsDuration;
    public static ClientStat$AnchorStatEvent[] _emptyArray;

    public void ClientStat$AnchorStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$AnchorStatEvent[] emptyArray(){
       if (ClientStat$AnchorStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$AnchorStatEvent._emptyArray == null) {
             ClientStat$AnchorStatEvent[] uAnchorStatE = new ClientStat$AnchorStatEvent[0];
             ClientStat$AnchorStatEvent._emptyArray = uAnchorStatE;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$AnchorStatEvent._emptyArray;
    }
    public static ClientStat$AnchorStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$AnchorStatEvent().mergeFrom(p0);
    }
    public static ClientStat$AnchorStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$AnchorStatEvent(), p0);
    }
    public ClientStat$AnchorStatEvent clear(){
       this.liveStreamId = "";
       this.fullscreenDuration = 0;
       this.totalDuration = 0;
       this.likeCnt = 0;
       this.onlineCntLeave = 0;
       this.pushUrl = "";
       this.traffic = 0;
       this.bufferTime = 0;
       this.prepareTime = 0;
       this.blockCnt = 0;
       this.retryCnt = 0;
       this.droppedFrameCnt = 0;
       this.beautifyEnabled = false;
       this.waitDuration = 0;
       this.bestBpsDuration = 0;
       this.betterBpsDuration = 0;
       this.normalBpsDuration = 0;
       this.badBpsDuration = 0;
       this.worstBpsDuration = 0;
       this.emptyBpsDuration = 0;
       this.bestFpsDuration = 0;
       this.betterFpsDuration = 0;
       this.normalFpsDuration = 0;
       this.badFpsDuration = 0;
       this.emptyFpsDuration = 0;
       this.initiativeLeave = false;
       this.soundEffectUsage = ClientStat$SoundEffectUsagePackage.emptyArray();
       this.liveStreamEncodeDetail = "";
       this.liveEncodeType = 0;
       this.videoResolutionType = 0;
       this.liveStreamHost = "";
       this.liveStreamServerIp = "";
       this.encodedVideoFrameCnt = 0;
       this.liveStreamType = 0;
       this.sdkVersionNum = "";
       this.realtimeUploadNum = 0;
       this.liveExceptionErrorCode = 0;
       this.serverMode = 0;
       this.resolutionType = 0;
       this.landscapeDuration = 0;
       this.portraitDuration = 0;
       this.screenOrientationSwitchCnt = 0;
       this.screenOrientationLeaveType = 0;
       this.ping = 0;
       this.livePushStartTime = 0;
       this.livePushEndTime = 0;
       this.firstFeedTime = 0;
       this.firstRaceStartTime = 0;
       this.raceVersion = "";
       this.idc = "";
       this.musicDuration = "";
       this.rssi = 0;
       this.mcc = 0;
       this.mnc = 0;
       this.lac = 0;
       this.cid = 0;
       this.liveStartToltalCost = 0;
       this.coverHandleCost = 0;
       this.coverCaption = false;
       this.startPushCost = 0;
       this.openLivePushPageCost = 0;
       this.advBeautifyEnabled = false;
       this.useGlasses = false;
       this.useGlassesPackage = ClientStat$LiveUseGlassesPackage.emptyArray();
       this.pushCdnReason = 0;
       this.glassesBlockCnt = 0;
       this.glassesBlockDuration = 0;
       this.cpuFreqUpCnt = 0;
       this.cpuFreqDownCnt = 0;
       this.lpResponseDuration = 0;
       this.lpAppearDuration = 0;
       this.lpPlayerRenderedDuration = 0;
       this.lpCommentReadyDuration = 0;
       this.isFirstEnterLive = false;
       this.livePrepushRequestDuration = 0;
       this.liveCheckResolutionRequestDuration = 0;
       this.liveStartPushRequestDuration = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       ClientStat$AnchorStatEvent tfullscreenD = this.fullscreenDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tfullscreenD);
       }
       tfullscreenD = this.totalDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tfullscreenD);
       }
       tfullscreenD = this.likeCnt;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tfullscreenD);
       }
       tfullscreenD = this.onlineCntLeave;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tfullscreenD);
       }
       if (!(this.pushUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.pushUrl);
       }
       tfullscreenD = this.traffic;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tfullscreenD);
       }
       tfullscreenD = this.bufferTime;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tfullscreenD);
       }
       tfullscreenD = this.prepareTime;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, tfullscreenD);
       }
       tfullscreenD = this.blockCnt;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(10, tfullscreenD);
       }
       tfullscreenD = this.retryCnt;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(12, tfullscreenD);
       }
       tfullscreenD = this.droppedFrameCnt;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(13, tfullscreenD);
       }
       ClientStat$AnchorStatEvent tbeautifyEna = this.beautifyEnabled;
       if (tbeautifyEna != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(14, tbeautifyEna);
       }
       tfullscreenD = this.waitDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(15, tfullscreenD);
       }
       tfullscreenD = this.bestBpsDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(16, tfullscreenD);
       }
       tfullscreenD = this.betterBpsDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(17, tfullscreenD);
       }
       tfullscreenD = this.normalBpsDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(18, tfullscreenD);
       }
       tfullscreenD = this.badBpsDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(19, tfullscreenD);
       }
       tfullscreenD = this.worstBpsDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(20, tfullscreenD);
       }
       tfullscreenD = this.emptyBpsDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(21, tfullscreenD);
       }
       tfullscreenD = this.bestFpsDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(22, tfullscreenD);
       }
       tfullscreenD = this.betterFpsDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(23, tfullscreenD);
       }
       tfullscreenD = this.normalFpsDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(24, tfullscreenD);
       }
       tfullscreenD = this.badFpsDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(25, tfullscreenD);
       }
       tfullscreenD = this.emptyFpsDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(26, tfullscreenD);
       }
       tbeautifyEna = this.initiativeLeave;
       if (tbeautifyEna != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(27, tbeautifyEna);
       }
       tbeautifyEna = this.soundEffectUsage;
       int i1 = 0;
       if (tbeautifyEna != null && tbeautifyEna.length > 0) {
          int i2 = 0;
          ClientStat$AnchorStatEvent tsoundEffect = this.soundEffectUsage;
          while (i2 < tsoundEffect.length) {
             object oobject = tsoundEffect[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(28, oobject);
             }
             i2 = i2 + 1;
          }
       }
       if (!(this.liveStreamEncodeDetail).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(29, this.liveStreamEncodeDetail);
       }
       ClientStat$AnchorStatEvent tliveEncodeT = this.liveEncodeType;
       if (tliveEncodeT) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(30, tliveEncodeT);
       }
       tbeautifyEna = this.videoResolutionType;
       if (tbeautifyEna != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(31, tbeautifyEna);
       }
       if (!(this.liveStreamHost).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(32, this.liveStreamHost);
       }
       if (!(this.liveStreamServerIp).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(33, this.liveStreamServerIp);
       }
       tliveEncodeT = this.encodedVideoFrameCnt;
       if (tliveEncodeT) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(34, tliveEncodeT);
       }
       tbeautifyEna = this.liveStreamType;
       if (tbeautifyEna != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(35, tbeautifyEna);
       }
       if (!(this.sdkVersionNum).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(36, this.sdkVersionNum);
       }
       tliveEncodeT = this.realtimeUploadNum;
       if (tliveEncodeT) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(37, tliveEncodeT);
       }
       tliveEncodeT = this.liveExceptionErrorCode;
       if (tliveEncodeT) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(38, tliveEncodeT);
       }
       tbeautifyEna = this.serverMode;
       if (tbeautifyEna != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(39, tbeautifyEna);
       }
       tbeautifyEna = this.resolutionType;
       if (tbeautifyEna != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(40, tbeautifyEna);
       }
       tliveEncodeT = this.landscapeDuration;
       if (tliveEncodeT) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(41, tliveEncodeT);
       }
       tliveEncodeT = this.portraitDuration;
       if (tliveEncodeT) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(42, tliveEncodeT);
       }
       tbeautifyEna = this.screenOrientationSwitchCnt;
       if (tbeautifyEna != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(43, tbeautifyEna);
       }
       tbeautifyEna = this.screenOrientationLeaveType;
       if (tbeautifyEna != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(44, tbeautifyEna);
       }
       tbeautifyEna = this.ping;
       if (tbeautifyEna != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(45, tbeautifyEna);
       }
       tliveEncodeT = this.livePushStartTime;
       if (tliveEncodeT) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(46, tliveEncodeT);
       }
       tliveEncodeT = this.livePushEndTime;
       if (tliveEncodeT) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(47, tliveEncodeT);
       }
       tliveEncodeT = this.firstFeedTime;
       if (tliveEncodeT) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(48, tliveEncodeT);
       }
       tliveEncodeT = this.firstRaceStartTime;
       if (tliveEncodeT) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(49, tliveEncodeT);
       }
       if (!(this.raceVersion).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(50, this.raceVersion);
       }
       if (!(this.idc).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(51, this.idc);
       }
       if (!(this.musicDuration).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(52, this.musicDuration);
       }
       tbeautifyEna = this.rssi;
       if (tbeautifyEna != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(53, tbeautifyEna);
       }
       tbeautifyEna = this.mcc;
       if (tbeautifyEna != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(54, tbeautifyEna);
       }
       tbeautifyEna = this.mnc;
       if (tbeautifyEna != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(55, tbeautifyEna);
       }
       tbeautifyEna = this.lac;
       if (tbeautifyEna != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(56, tbeautifyEna);
       }
       tbeautifyEna = this.cid;
       if (tbeautifyEna != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(57, tbeautifyEna);
       }
       tbeautifyEna = this.liveStartToltalCost;
       if (tbeautifyEna) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(58, tbeautifyEna);
       }
       tbeautifyEna = this.coverHandleCost;
       if (tbeautifyEna) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(59, tbeautifyEna);
       }
       tbeautifyEna = this.coverCaption;
       if (tbeautifyEna != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(60, tbeautifyEna);
       }
       tbeautifyEna = this.startPushCost;
       if (tbeautifyEna) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(61, tbeautifyEna);
       }
       tbeautifyEna = this.openLivePushPageCost;
       if (tbeautifyEna) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(62, tbeautifyEna);
       }
       tbeautifyEna = this.advBeautifyEnabled;
       if (tbeautifyEna != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(63, tbeautifyEna);
       }
       tbeautifyEna = this.useGlasses;
       if (tbeautifyEna != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(64, tbeautifyEna);
       }
       tbeautifyEna = this.useGlassesPackage;
       if (tbeautifyEna != null && tbeautifyEna.length > 0) {
          tbeautifyEna = this.useGlassesPackage;
          while (i1 < tbeautifyEna.length) {
             object oobject1 = tbeautifyEna[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(65, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tbeautifyEna = this.pushCdnReason;
       if (tbeautifyEna != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(66, tbeautifyEna);
       }
       tbeautifyEna = this.glassesBlockCnt;
       if (tbeautifyEna) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(67, tbeautifyEna);
       }
       tbeautifyEna = this.glassesBlockDuration;
       if (tbeautifyEna) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(68, tbeautifyEna);
       }
       tbeautifyEna = this.cpuFreqUpCnt;
       if (tbeautifyEna) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(69, tbeautifyEna);
       }
       tbeautifyEna = this.cpuFreqDownCnt;
       if (tbeautifyEna) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(70, tbeautifyEna);
       }
       tbeautifyEna = this.lpResponseDuration;
       if (tbeautifyEna) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(71, tbeautifyEna);
       }
       tbeautifyEna = this.lpAppearDuration;
       if (tbeautifyEna) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(72, tbeautifyEna);
       }
       tbeautifyEna = this.lpPlayerRenderedDuration;
       if (tbeautifyEna) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(73, tbeautifyEna);
       }
       tbeautifyEna = this.lpCommentReadyDuration;
       if (tbeautifyEna) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(74, tbeautifyEna);
       }
       tbeautifyEna = this.isFirstEnterLive;
       if (tbeautifyEna != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(75, tbeautifyEna);
       }
       tbeautifyEna = this.livePrepushRequestDuration;
       if (tbeautifyEna) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(76, tbeautifyEna);
       }
       tbeautifyEna = this.liveCheckResolutionRequestDuration;
       if (tbeautifyEna) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(77, tbeautifyEna);
       }
       tbeautifyEna = this.liveStartPushRequestDuration;
       if (tbeautifyEna) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(78, tbeautifyEna);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$AnchorStatEvent mergeFrom(CodedInputByteBufferNano p0){
       int i2;
       while (true) {
          int i = p0.readTag();
          ClientStat$AnchorStatEvent uAnchorStatE = 3;
          int i1 = 2;
          ClientStat$SoundEffectUsagePackage[] soundEffectU = 1;
          switch (i){
              case 0:
                return this;
              case 10:
                this.liveStreamId = p0.readString();
                break;
              case 16:
                this.fullscreenDuration = p0.readUInt64();
                break;
              case 24:
                this.totalDuration = p0.readUInt64();
                break;
              case 32:
                this.likeCnt = p0.readUInt64();
                break;
              case '(':
                this.onlineCntLeave = p0.readUInt64();
                break;
              case '2':
                this.pushUrl = p0.readString();
                break;
              case '8':
                this.traffic = p0.readUInt64();
                break;
              case '@':
                this.bufferTime = p0.readUInt64();
                break;
              case 'H':
                this.prepareTime = p0.readUInt64();
                break;
              case 'P':
                this.blockCnt = p0.readUInt64();
                break;
              case '`':
                this.retryCnt = p0.readUInt64();
                break;
              case 'h':
                this.droppedFrameCnt = p0.readUInt64();
                break;
              case 'p':
                this.beautifyEnabled = p0.readBool();
                break;
              case 'x':
                this.waitDuration = p0.readUInt64();
                break;
              case 128:
                this.bestBpsDuration = p0.readUInt64();
                break;
              case 136:
                this.betterBpsDuration = p0.readUInt64();
                break;
              case 144:
                this.normalBpsDuration = p0.readUInt64();
                break;
              case 152:
                this.badBpsDuration = p0.readUInt64();
                break;
              case 160:
                this.worstBpsDuration = p0.readUInt64();
                break;
              case 168:
                this.emptyBpsDuration = p0.readUInt64();
                break;
              case 176:
                this.bestFpsDuration = p0.readUInt64();
                break;
              case 184:
                this.betterFpsDuration = p0.readUInt64();
                break;
              case 192:
                this.normalFpsDuration = p0.readUInt64();
                break;
              case 200:
                this.badFpsDuration = p0.readUInt64();
                break;
              case 208:
                this.emptyFpsDuration = p0.readUInt64();
                break;
              case 216:
                this.initiativeLeave = p0.readBool();
                break;
              case 226:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 226);
                uAnchorStatE = this.soundEffectUsage;
                i1 = (uAnchorStatE == null)? 0: uAnchorStatE.length;
                i = i + i1;
                soundEffectU = new ClientStat$SoundEffectUsagePackage[i];
                if (i1) {
                   System.arraycopy(uAnchorStatE, 0, soundEffectU, 0, i1);
                }
                i2 = i - 1;
                while (i1 < i2) {
                   soundEffectU[i1] = new ClientStat$SoundEffectUsagePackage();
                   p0.readMessage(soundEffectU[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                soundEffectU[i1] = new ClientStat$SoundEffectUsagePackage();
                p0.readMessage(soundEffectU[i1]);
                this.soundEffectUsage = soundEffectU;
                break;
              case 234:
                this.liveStreamEncodeDetail = p0.readString();
                break;
              case 240:
                this.liveEncodeType = p0.readUInt64();
                break;
              case 248:
                this.videoResolutionType = p0.readUInt32();
                break;
              case 258:
                this.liveStreamHost = p0.readString();
                break;
              case 266:
                this.liveStreamServerIp = p0.readString();
                break;
              case 272:
                this.encodedVideoFrameCnt = p0.readUInt64();
                break;
              case 280:
                i = p0.readInt32();
                if (i && (i != soundEffectU && (i != i1 && i != uAnchorStatE))) {
                   continue ;
                }else {
                   this.liveStreamType = i;
                }
                break;
              case 290:
                this.sdkVersionNum = p0.readString();
                break;
              case 296:
                this.realtimeUploadNum = p0.readUInt64();
                break;
              case 304:
                this.liveExceptionErrorCode = p0.readInt64();
                break;
              case 312:
                i = p0.readInt32();
                if (i && (i != soundEffectU && i != i1)) {
                   continue ;
                }else {
                   this.serverMode = i;
                }
                break;
              case 320:
                i = p0.readInt32();
                if (i && (i != soundEffectU && (i != i1 && (i != uAnchorStatE && i != 4)))) {
                   continue ;
                }else {
                   this.resolutionType = i;
                }
                break;
              case 328:
                this.landscapeDuration = p0.readUInt64();
                break;
              case 336:
                this.portraitDuration = p0.readUInt64();
                break;
              case 344:
                this.screenOrientationSwitchCnt = p0.readUInt32();
                break;
              case 352:
                i = p0.readInt32();
                if (i && (i != soundEffectU && i != i1)) {
                   continue ;
                }else {
                   this.screenOrientationLeaveType = i;
                }
                break;
              case 360:
                i = p0.readInt32();
                if (i && (i != soundEffectU && i != i1)) {
                   continue ;
                }else {
                   this.ping = i;
                }
                break;
              case 368:
                this.livePushStartTime = p0.readUInt64();
                break;
              case 376:
                this.livePushEndTime = p0.readUInt64();
                break;
              case 384:
                this.firstFeedTime = p0.readUInt64();
                break;
              case 392:
                this.firstRaceStartTime = p0.readUInt64();
                break;
              case 402:
                this.raceVersion = p0.readString();
                break;
              case 410:
                this.idc = p0.readString();
                break;
              case 418:
                this.musicDuration = p0.readString();
                break;
              case 424:
                this.rssi = p0.readUInt32();
                break;
              case 432:
                this.mcc = p0.readUInt32();
                break;
              case 440:
                this.mnc = p0.readUInt32();
                break;
              case 448:
                this.lac = p0.readUInt32();
                break;
              case 456:
                this.cid = p0.readUInt32();
                break;
              case 464:
                this.liveStartToltalCost = p0.readUInt64();
                break;
              case 472:
                this.coverHandleCost = p0.readUInt64();
                break;
              case 480:
                this.coverCaption = p0.readBool();
                break;
              case 488:
                this.startPushCost = p0.readUInt64();
                break;
              case 496:
                this.openLivePushPageCost = p0.readUInt64();
                break;
              case 504:
                this.advBeautifyEnabled = p0.readBool();
                break;
              case 512:
                this.useGlasses = p0.readBool();
                break;
              case 522:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 522);
                uAnchorStatE = this.useGlassesPackage;
                i1 = (uAnchorStatE == null)? 0: uAnchorStatE.length;
                i = i + i1;
                ClientStat$LiveUseGlassesPackage[] liveUseGlass = new ClientStat$LiveUseGlassesPackage[i];
                if (i1) {
                   System.arraycopy(uAnchorStatE, 0, liveUseGlass, 0, i1);
                }
                i2 = i - 1;
                while (i1 < i2) {
                   liveUseGlass[i1] = new ClientStat$LiveUseGlassesPackage();
                   p0.readMessage(liveUseGlass[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                liveUseGlass[i1] = new ClientStat$LiveUseGlassesPackage();
                p0.readMessage(liveUseGlass[i1]);
                this.useGlassesPackage = liveUseGlass;
                break;
              case 528:
                i = p0.readInt32();
                if (i && (i != soundEffectU && (i != i1 && i != uAnchorStatE))) {
                   continue ;
                }else {
                   this.pushCdnReason = i;
                }
                break;
              case 536:
                this.glassesBlockCnt = p0.readUInt64();
                break;
              case 544:
                this.glassesBlockDuration = p0.readUInt64();
                break;
              case 552:
                this.cpuFreqUpCnt = p0.readUInt64();
                break;
              case 560:
                this.cpuFreqDownCnt = p0.readUInt64();
                break;
              case 568:
                this.lpResponseDuration = p0.readUInt64();
                break;
              case 576:
                this.lpAppearDuration = p0.readUInt64();
                break;
              case 584:
                this.lpPlayerRenderedDuration = p0.readUInt64();
                break;
              case 592:
                this.lpCommentReadyDuration = p0.readUInt64();
                break;
              case 600:
                this.isFirstEnterLive = p0.readBool();
                break;
              case 608:
                this.livePrepushRequestDuration = p0.readUInt64();
                break;
              case 616:
                this.liveCheckResolutionRequestDuration = p0.readUInt64();
                break;
              case 624:
                this.liveStartPushRequestDuration = p0.readUInt64();
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
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(1, this.liveStreamId);
       }
       ClientStat$AnchorStatEvent tfullscreenD = this.fullscreenDuration;
       if (tfullscreenD) {
          p0.writeUInt64(2, tfullscreenD);
       }
       tfullscreenD = this.totalDuration;
       if (tfullscreenD) {
          p0.writeUInt64(3, tfullscreenD);
       }
       tfullscreenD = this.likeCnt;
       if (tfullscreenD) {
          p0.writeUInt64(4, tfullscreenD);
       }
       tfullscreenD = this.onlineCntLeave;
       if (tfullscreenD) {
          p0.writeUInt64(5, tfullscreenD);
       }
       if (!(this.pushUrl).equals(str)) {
          p0.writeString(6, this.pushUrl);
       }
       tfullscreenD = this.traffic;
       if (tfullscreenD) {
          p0.writeUInt64(7, tfullscreenD);
       }
       tfullscreenD = this.bufferTime;
       if (tfullscreenD) {
          p0.writeUInt64(8, tfullscreenD);
       }
       tfullscreenD = this.prepareTime;
       if (tfullscreenD) {
          p0.writeUInt64(9, tfullscreenD);
       }
       tfullscreenD = this.blockCnt;
       if (tfullscreenD) {
          p0.writeUInt64(10, tfullscreenD);
       }
       tfullscreenD = this.retryCnt;
       if (tfullscreenD) {
          p0.writeUInt64(12, tfullscreenD);
       }
       tfullscreenD = this.droppedFrameCnt;
       if (tfullscreenD) {
          p0.writeUInt64(13, tfullscreenD);
       }
       ClientStat$AnchorStatEvent tbeautifyEna = this.beautifyEnabled;
       if (tbeautifyEna != null) {
          p0.writeBool(14, tbeautifyEna);
       }
       tfullscreenD = this.waitDuration;
       if (tfullscreenD) {
          p0.writeUInt64(15, tfullscreenD);
       }
       tfullscreenD = this.bestBpsDuration;
       if (tfullscreenD) {
          p0.writeUInt64(16, tfullscreenD);
       }
       tfullscreenD = this.betterBpsDuration;
       if (tfullscreenD) {
          p0.writeUInt64(17, tfullscreenD);
       }
       tfullscreenD = this.normalBpsDuration;
       if (tfullscreenD) {
          p0.writeUInt64(18, tfullscreenD);
       }
       tfullscreenD = this.badBpsDuration;
       if (tfullscreenD) {
          p0.writeUInt64(19, tfullscreenD);
       }
       tfullscreenD = this.worstBpsDuration;
       if (tfullscreenD) {
          p0.writeUInt64(20, tfullscreenD);
       }
       tfullscreenD = this.emptyBpsDuration;
       if (tfullscreenD) {
          p0.writeUInt64(21, tfullscreenD);
       }
       tfullscreenD = this.bestFpsDuration;
       if (tfullscreenD) {
          p0.writeUInt64(22, tfullscreenD);
       }
       tfullscreenD = this.betterFpsDuration;
       if (tfullscreenD) {
          p0.writeUInt64(23, tfullscreenD);
       }
       tfullscreenD = this.normalFpsDuration;
       if (tfullscreenD) {
          p0.writeUInt64(24, tfullscreenD);
       }
       tfullscreenD = this.badFpsDuration;
       if (tfullscreenD) {
          p0.writeUInt64(25, tfullscreenD);
       }
       tfullscreenD = this.emptyFpsDuration;
       if (tfullscreenD) {
          p0.writeUInt64(26, tfullscreenD);
       }
       tbeautifyEna = this.initiativeLeave;
       if (tbeautifyEna != null) {
          p0.writeBool(27, tbeautifyEna);
       }
       tbeautifyEna = this.soundEffectUsage;
       int i = 0;
       if (tbeautifyEna != null && tbeautifyEna.length > 0) {
          int i1 = 0;
          ClientStat$AnchorStatEvent tsoundEffect = this.soundEffectUsage;
          while (i1 < tsoundEffect.length) {
             object oobject = tsoundEffect[i1];
             if (oobject != null) {
                p0.writeMessage(28, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.liveStreamEncodeDetail).equals(str)) {
          p0.writeString(29, this.liveStreamEncodeDetail);
       }
       ClientStat$AnchorStatEvent tliveEncodeT = this.liveEncodeType;
       if (tliveEncodeT) {
          p0.writeUInt64(30, tliveEncodeT);
       }
       tbeautifyEna = this.videoResolutionType;
       if (tbeautifyEna != null) {
          p0.writeUInt32(31, tbeautifyEna);
       }
       if (!(this.liveStreamHost).equals(str)) {
          p0.writeString(32, this.liveStreamHost);
       }
       if (!(this.liveStreamServerIp).equals(str)) {
          p0.writeString(33, this.liveStreamServerIp);
       }
       tliveEncodeT = this.encodedVideoFrameCnt;
       if (tliveEncodeT) {
          p0.writeUInt64(34, tliveEncodeT);
       }
       tbeautifyEna = this.liveStreamType;
       if (tbeautifyEna != null) {
          p0.writeInt32(35, tbeautifyEna);
       }
       if (!(this.sdkVersionNum).equals(str)) {
          p0.writeString(36, this.sdkVersionNum);
       }
       tliveEncodeT = this.realtimeUploadNum;
       if (tliveEncodeT) {
          p0.writeUInt64(37, tliveEncodeT);
       }
       tliveEncodeT = this.liveExceptionErrorCode;
       if (tliveEncodeT) {
          p0.writeInt64(38, tliveEncodeT);
       }
       tbeautifyEna = this.serverMode;
       if (tbeautifyEna != null) {
          p0.writeInt32(39, tbeautifyEna);
       }
       tbeautifyEna = this.resolutionType;
       if (tbeautifyEna != null) {
          p0.writeInt32(40, tbeautifyEna);
       }
       tliveEncodeT = this.landscapeDuration;
       if (tliveEncodeT) {
          p0.writeUInt64(41, tliveEncodeT);
       }
       tliveEncodeT = this.portraitDuration;
       if (tliveEncodeT) {
          p0.writeUInt64(42, tliveEncodeT);
       }
       tbeautifyEna = this.screenOrientationSwitchCnt;
       if (tbeautifyEna != null) {
          p0.writeUInt32(43, tbeautifyEna);
       }
       tbeautifyEna = this.screenOrientationLeaveType;
       if (tbeautifyEna != null) {
          p0.writeInt32(44, tbeautifyEna);
       }
       tbeautifyEna = this.ping;
       if (tbeautifyEna != null) {
          p0.writeInt32(45, tbeautifyEna);
       }
       tliveEncodeT = this.livePushStartTime;
       if (tliveEncodeT) {
          p0.writeUInt64(46, tliveEncodeT);
       }
       tliveEncodeT = this.livePushEndTime;
       if (tliveEncodeT) {
          p0.writeUInt64(47, tliveEncodeT);
       }
       tliveEncodeT = this.firstFeedTime;
       if (tliveEncodeT) {
          p0.writeUInt64(48, tliveEncodeT);
       }
       tliveEncodeT = this.firstRaceStartTime;
       if (tliveEncodeT) {
          p0.writeUInt64(49, tliveEncodeT);
       }
       if (!(this.raceVersion).equals(str)) {
          p0.writeString(50, this.raceVersion);
       }
       if (!(this.idc).equals(str)) {
          p0.writeString(51, this.idc);
       }
       if (!(this.musicDuration).equals(str)) {
          p0.writeString(52, this.musicDuration);
       }
       tbeautifyEna = this.rssi;
       if (tbeautifyEna != null) {
          p0.writeUInt32(53, tbeautifyEna);
       }
       tbeautifyEna = this.mcc;
       if (tbeautifyEna != null) {
          p0.writeUInt32(54, tbeautifyEna);
       }
       tbeautifyEna = this.mnc;
       if (tbeautifyEna != null) {
          p0.writeUInt32(55, tbeautifyEna);
       }
       tbeautifyEna = this.lac;
       if (tbeautifyEna != null) {
          p0.writeUInt32(56, tbeautifyEna);
       }
       tbeautifyEna = this.cid;
       if (tbeautifyEna != null) {
          p0.writeUInt32(57, tbeautifyEna);
       }
       tbeautifyEna = this.liveStartToltalCost;
       if (tbeautifyEna) {
          p0.writeUInt64(58, tbeautifyEna);
       }
       tbeautifyEna = this.coverHandleCost;
       if (tbeautifyEna) {
          p0.writeUInt64(59, tbeautifyEna);
       }
       tbeautifyEna = this.coverCaption;
       if (tbeautifyEna != null) {
          p0.writeBool(60, tbeautifyEna);
       }
       tbeautifyEna = this.startPushCost;
       if (tbeautifyEna) {
          p0.writeUInt64(61, tbeautifyEna);
       }
       tbeautifyEna = this.openLivePushPageCost;
       if (tbeautifyEna) {
          p0.writeUInt64(62, tbeautifyEna);
       }
       tbeautifyEna = this.advBeautifyEnabled;
       if (tbeautifyEna != null) {
          p0.writeBool(63, tbeautifyEna);
       }
       tbeautifyEna = this.useGlasses;
       if (tbeautifyEna != null) {
          p0.writeBool(64, tbeautifyEna);
       }
       tbeautifyEna = this.useGlassesPackage;
       if (tbeautifyEna != null && tbeautifyEna.length > 0) {
          tbeautifyEna = this.useGlassesPackage;
          while (i < tbeautifyEna.length) {
             object oobject1 = tbeautifyEna[i];
             if (oobject1 != null) {
                p0.writeMessage(65, oobject1);
             }
             i = i + 1;
          }
       }
       tbeautifyEna = this.pushCdnReason;
       if (tbeautifyEna != null) {
          p0.writeInt32(66, tbeautifyEna);
       }
       tbeautifyEna = this.glassesBlockCnt;
       if (tbeautifyEna) {
          p0.writeUInt64(67, tbeautifyEna);
       }
       tbeautifyEna = this.glassesBlockDuration;
       if (tbeautifyEna) {
          p0.writeUInt64(68, tbeautifyEna);
       }
       tbeautifyEna = this.cpuFreqUpCnt;
       if (tbeautifyEna) {
          p0.writeUInt64(69, tbeautifyEna);
       }
       tbeautifyEna = this.cpuFreqDownCnt;
       if (tbeautifyEna) {
          p0.writeUInt64(70, tbeautifyEna);
       }
       tbeautifyEna = this.lpResponseDuration;
       if (tbeautifyEna) {
          p0.writeUInt64(71, tbeautifyEna);
       }
       tbeautifyEna = this.lpAppearDuration;
       if (tbeautifyEna) {
          p0.writeUInt64(72, tbeautifyEna);
       }
       tbeautifyEna = this.lpPlayerRenderedDuration;
       if (tbeautifyEna) {
          p0.writeUInt64(73, tbeautifyEna);
       }
       tbeautifyEna = this.lpCommentReadyDuration;
       if (tbeautifyEna) {
          p0.writeUInt64(74, tbeautifyEna);
       }
       tbeautifyEna = this.isFirstEnterLive;
       if (tbeautifyEna != null) {
          p0.writeBool(75, tbeautifyEna);
       }
       tbeautifyEna = this.livePrepushRequestDuration;
       if (tbeautifyEna) {
          p0.writeUInt64(76, tbeautifyEna);
       }
       tbeautifyEna = this.liveCheckResolutionRequestDuration;
       if (tbeautifyEna) {
          p0.writeUInt64(77, tbeautifyEna);
       }
       tbeautifyEna = this.liveStartPushRequestDuration;
       if (tbeautifyEna) {
          p0.writeUInt64(78, tbeautifyEna);
       }
       super.writeTo(p0);
       return;
    }
}
