package com.kuaishou.client.log.stat.packages.nano.ClientStat$AudienceStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$TrafficSlicePackage;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$ResolutionSlicePackage;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidContainer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import java.lang.System;

public final class ClientStat$AudienceStatEvent extends MessageNano	// class@0007a6
{
    public String aggregationSessionId;
    public long analyzeDnsDuration;
    public long analyzeStreamInfoDuration;
    public long backgroundCount;
    public long backgroundDuration;
    public long badFpsDuration;
    public int batteryLevel;
    public int batteryTemperature;
    public long bestFpsDuration;
    public long betterFpsDuration;
    public long blockCnt;
    public long blockCntOld;
    public String boardPlatform;
    public long bufferTime;
    public long bufferTimeOld;
    public String businessTimeCostParams;
    public long cdnTraffic;
    public int cid;
    public String clientId;
    public long commentPanelReactDuration;
    public long componentBindDuration;
    public long componentDidappear;
    public long connectHttpDuration;
    public int contentType;
    public long decodeFirstPackageDuration;
    public String dnsProviderName;
    public String dnsResolveHost;
    public String dnsResolvedIp;
    public String dnsResolvedUrl;
    public String dnsResolverName;
    public long dropPackageTotalDuration;
    public long emptyFpsDuration;
    public int enterAction;
    public long externalIcon;
    public long firstFeedTime;
    public long firstRaceStartTime;
    public long firstScreenAllPreparedDuration;
    public long firstScreenAppPrepareDuration;
    public long firstScreenAppRenderingDuration;
    public long firstScreenDropPackageDuration;
    public long firstScreenPlayerRenderingDuration;
    public long firstScreenPlayerTotalDuration;
    public long firstScreenPlayerViewReadyDuration;
    public long firstScreenTotalDuration;
    public long firstScreenWaitForPlayDuration;
    public long floatingWindowBlockCnt;
    public long floatingWindowBufferTime;
    public long fullscreenDuration;
    public long giftPanelReactDuration;
    public long glassesBlockCnt;
    public String groupId;
    public long hideCount;
    public long hideDuration;
    public boolean initiativeLeave;
    public String interStExParams;
    public StidContainerProto$StidContainer interStidContainer;
    public StidContainerProto$StidContainer internalStidContainer;
    public String internalStidContainerJson;
    public boolean isAutoPlay;
    public boolean isCharging;
    public String isDidappear;
    public boolean isFirstEnterLive;
    public boolean isFollowEnter;
    public boolean isFollowLeave;
    public boolean isNormalPlay;
    public boolean isPausedBeforeFirstScreen;
    public boolean isReopen;
    public boolean isSlidePlay;
    public String kwaiSignature;
    public int lac;
    public long landscapeDuration;
    public long likeCnt;
    public long liveDecodeType;
    public int liveEntranceType;
    public String liveIconReasonExtraInfo;
    public String liveIconReasonTextType;
    public String liveIconTextExtraInfo;
    public String liveIconTextType;
    public String liveIconType;
    public long liveOperationType;
    public long livePlayEndTime;
    public long livePlayStartTime;
    public int livePlayerBizType;
    public long livePlayerRenderStartTime;
    public String livePlayerRenderedStartTime;
    public String livePolicy;
    public String liveRecoLabel;
    public int liveRoomStatusOnEnter;
    public int liveStatus;
    public String liveStreamHost;
    public String liveStreamId;
    public String liveStreamIp;
    public int liveStreamType;
    public int liveStyle;
    public String liveVideoEncodeInfo;
    public int manifestSwitchStatus;
    public int mcc;
    public int mnc;
    public long normalFpsDuration;
    public long onlineCntEnter;
    public String onlineCntEnterStr;
    public long onlineCntLeave;
    public String onlineCntLeaveStr;
    public long openCodecDuration;
    public long openStreamDuration;
    public long p2SpTraffic;
    public long pageClickToAppearDuration;
    public long pageClickToComponentReadyDuration;
    public long pageClickToPlayerRenderedDuration;
    public long pageClickToResponseDuration;
    public long playerPlayDuration;
    public String playerQosJson;
    public int playerType;
    public long portraitDuration;
    public long postCommentCnt;
    public long preDecodeFirstPackageDuration;
    public long prepareTime;
    public String pushUrl;
    public String raceVersion;
    public long realtimeUploadCnt;
    public long receiveFirstPackageDuration;
    public int referLiveSourceType;
    public ClientEvent$UrlPackage referUrlPackage;
    public long renderFirstPackageDuration;
    public ClientStat$ResolutionSlicePackage[] resolutionSlicePackage;
    public long retryCnt;
    public int rssi;
    public int screenOrientationLeaveType;
    public int screenOrientationSwitchCnt;
    public String searchParams;
    public String searchSessionId;
    public String sessionId;
    public long showIndexPlusOne;
    public String socName;
    public int sourceType;
    public String sourceUrl;
    public long streamDuration;
    public long stuckCnt;
    public long suspendDuration;
    public String tagType;
    public long totalDuration;
    public long traffic;
    public ClientStat$TrafficSlicePackage[] trafficSlicePackage;
    public String unionLiveAuthor;
    public String unionLiveId;
    public ClientEvent$UrlPackage urlPackage;
    public long viewInflateDuration;
    public String xKsCache;
    public static ClientStat$AudienceStatEvent[] _emptyArray;

    public void ClientStat$AudienceStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$AudienceStatEvent[] emptyArray(){
       if (ClientStat$AudienceStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$AudienceStatEvent._emptyArray == null) {
             ClientStat$AudienceStatEvent[] uAudienceSta = new ClientStat$AudienceStatEvent[0];
             ClientStat$AudienceStatEvent._emptyArray = uAudienceSta;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$AudienceStatEvent._emptyArray;
    }
    public static ClientStat$AudienceStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$AudienceStatEvent().mergeFrom(p0);
    }
    public static ClientStat$AudienceStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$AudienceStatEvent(), p0);
    }
    public ClientStat$AudienceStatEvent clear(){
       this.liveStreamId = "";
       this.fullscreenDuration = 0;
       this.totalDuration = 0;
       this.likeCnt = 0;
       this.onlineCntEnter = 0;
       this.onlineCntLeave = 0;
       this.initiativeLeave = false;
       this.traffic = 0;
       this.bufferTime = 0;
       this.prepareTime = 0;
       this.stuckCnt = 0;
       this.liveStreamHost = "";
       this.liveStreamIp = "";
       this.retryCnt = 0;
       this.pushUrl = "";
       this.trafficSlicePackage = ClientStat$TrafficSlicePackage.emptyArray();
       this.firstScreenTotalDuration = 0;
       this.analyzeDnsDuration = 0;
       this.connectHttpDuration = 0;
       this.openStreamDuration = 0;
       this.analyzeStreamInfoDuration = 0;
       this.openCodecDuration = 0;
       this.receiveFirstPackageDuration = 0;
       this.preDecodeFirstPackageDuration = 0;
       this.decodeFirstPackageDuration = 0;
       this.renderFirstPackageDuration = 0;
       this.firstScreenDropPackageDuration = 0;
       this.dropPackageTotalDuration = 0;
       this.liveDecodeType = 0;
       this.dnsResolvedUrl = "";
       this.dnsProviderName = "";
       this.bestFpsDuration = 0;
       this.betterFpsDuration = 0;
       this.normalFpsDuration = 0;
       this.badFpsDuration = 0;
       this.emptyFpsDuration = 0;
       this.dnsResolveHost = "";
       this.dnsResolvedIp = "";
       this.dnsResolverName = "";
       this.liveVideoEncodeInfo = "";
       this.playerQosJson = "";
       this.streamDuration = 0;
       this.blockCnt = 0;
       this.liveStreamType = 0;
       this.realtimeUploadCnt = 0;
       this.resolutionSlicePackage = ClientStat$ResolutionSlicePackage.emptyArray();
       this.landscapeDuration = 0;
       this.portraitDuration = 0;
       this.screenOrientationSwitchCnt = 0;
       this.screenOrientationLeaveType = 0;
       this.urlPackage = null;
       this.referUrlPackage = null;
       this.livePlayStartTime = 0;
       this.livePlayEndTime = 0;
       this.firstFeedTime = 0;
       this.firstRaceStartTime = 0;
       this.raceVersion = "";
       this.backgroundDuration = 0;
       this.rssi = 0;
       this.mcc = 0;
       this.mnc = 0;
       this.lac = 0;
       this.cid = 0;
       this.clientId = "";
       this.cdnTraffic = 0;
       this.p2SpTraffic = 0;
       this.livePolicy = "";
       this.firstScreenWaitForPlayDuration = 0;
       this.firstScreenAllPreparedDuration = 0;
       this.firstScreenPlayerTotalDuration = 0;
       this.isAutoPlay = false;
       this.bufferTimeOld = 0;
       this.blockCntOld = 0;
       this.postCommentCnt = 0;
       this.liveStatus = 0;
       this.kwaiSignature = "";
       this.glassesBlockCnt = 0;
       this.suspendDuration = 0;
       this.playerType = 0;
       this.hideDuration = 0;
       this.hideCount = 0;
       this.backgroundCount = 0;
       this.liveRoomStatusOnEnter = 0;
       this.floatingWindowBlockCnt = 0;
       this.floatingWindowBufferTime = 0;
       this.isSlidePlay = false;
       this.xKsCache = "";
       this.firstScreenAppPrepareDuration = 0;
       this.firstScreenPlayerRenderingDuration = 0;
       this.manifestSwitchStatus = 0;
       this.firstScreenPlayerViewReadyDuration = 0;
       this.liveEntranceType = 0;
       this.contentType = 0;
       this.sourceType = 0;
       this.firstScreenAppRenderingDuration = 0;
       this.playerPlayDuration = 0;
       this.sourceUrl = "";
       this.sessionId = "";
       this.searchSessionId = "";
       this.onlineCntEnterStr = "";
       this.onlineCntLeaveStr = "";
       this.searchParams = "";
       this.referLiveSourceType = 0;
       this.aggregationSessionId = "";
       this.liveOperationType = 0;
       this.showIndexPlusOne = 0;
       this.enterAction = 0;
       this.externalIcon = 0;
       this.isNormalPlay = false;
       this.viewInflateDuration = 0;
       this.componentBindDuration = 0;
       this.livePlayerBizType = 0;
       this.isFollowEnter = false;
       this.isFollowLeave = false;
       this.isPausedBeforeFirstScreen = false;
       this.liveIconType = "";
       this.liveRecoLabel = "";
       this.isReopen = false;
       this.batteryLevel = 0;
       this.batteryTemperature = 0;
       this.isCharging = false;
       this.pageClickToResponseDuration = 0;
       this.pageClickToAppearDuration = 0;
       this.pageClickToPlayerRenderedDuration = 0;
       this.pageClickToComponentReadyDuration = 0;
       this.giftPanelReactDuration = 0;
       this.commentPanelReactDuration = 0;
       this.isFirstEnterLive = false;
       this.componentDidappear = 0;
       this.businessTimeCostParams = "";
       this.unionLiveAuthor = "";
       this.unionLiveId = "";
       this.livePlayerRenderedStartTime = "";
       this.livePlayerRenderStartTime = 0;
       this.internalStidContainer = null;
       this.internalStidContainerJson = "";
       this.interStidContainer = null;
       this.groupId = "";
       this.liveIconTextType = "";
       this.liveIconReasonTextType = "";
       this.liveIconReasonExtraInfo = "";
       this.liveIconTextExtraInfo = "";
       this.tagType = "";
       this.liveStyle = 0;
       this.socName = "";
       this.boardPlatform = "";
       this.isDidappear = "";
       this.interStExParams = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       ClientStat$AudienceStatEvent tfullscreenD = this.fullscreenDuration;
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
       tfullscreenD = this.onlineCntEnter;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tfullscreenD);
       }
       tfullscreenD = this.onlineCntLeave;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tfullscreenD);
       }
       ClientStat$AudienceStatEvent tinitiativeL = this.initiativeLeave;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, tinitiativeL);
       }
       tfullscreenD = this.traffic;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tfullscreenD);
       }
       tfullscreenD = this.bufferTime;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, tfullscreenD);
       }
       tfullscreenD = this.prepareTime;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(10, tfullscreenD);
       }
       tfullscreenD = this.stuckCnt;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(11, tfullscreenD);
       }
       if (!(this.liveStreamHost).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.liveStreamHost);
       }
       if (!(this.liveStreamIp).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.liveStreamIp);
       }
       tfullscreenD = this.retryCnt;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(14, tfullscreenD);
       }
       if (!(this.pushUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(15, this.pushUrl);
       }
       tinitiativeL = this.trafficSlicePackage;
       int i1 = 0;
       if (tinitiativeL != null && tinitiativeL.length > 0) {
          int i2 = 0;
          ClientStat$AudienceStatEvent ttrafficSlic = this.trafficSlicePackage;
          while (i2 < ttrafficSlic.length) {
             object oobject = ttrafficSlic[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(16, oobject);
             }
             i2 = i2 + 1;
          }
       }
       ClientStat$AudienceStatEvent tfirstScreen = this.firstScreenTotalDuration;
       if (tfirstScreen) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(17, tfirstScreen);
       }
       tfirstScreen = this.analyzeDnsDuration;
       if (tfirstScreen) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(18, tfirstScreen);
       }
       tfirstScreen = this.connectHttpDuration;
       if (tfirstScreen) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(19, tfirstScreen);
       }
       tfirstScreen = this.openStreamDuration;
       if (tfirstScreen) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(20, tfirstScreen);
       }
       tfirstScreen = this.analyzeStreamInfoDuration;
       if (tfirstScreen) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(21, tfirstScreen);
       }
       tfirstScreen = this.openCodecDuration;
       if (tfirstScreen) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(22, tfirstScreen);
       }
       tfirstScreen = this.receiveFirstPackageDuration;
       if (tfirstScreen) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(23, tfirstScreen);
       }
       tfirstScreen = this.preDecodeFirstPackageDuration;
       if (tfirstScreen) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(24, tfirstScreen);
       }
       tfirstScreen = this.decodeFirstPackageDuration;
       if (tfirstScreen) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(25, tfirstScreen);
       }
       tfirstScreen = this.renderFirstPackageDuration;
       if (tfirstScreen) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(26, tfirstScreen);
       }
       tfirstScreen = this.firstScreenDropPackageDuration;
       if (tfirstScreen) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(27, tfirstScreen);
       }
       tfirstScreen = this.dropPackageTotalDuration;
       if (tfirstScreen) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(28, tfirstScreen);
       }
       tfirstScreen = this.liveDecodeType;
       if (tfirstScreen) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(29, tfirstScreen);
       }
       if (!(this.dnsResolvedUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(30, this.dnsResolvedUrl);
       }
       if (!(this.dnsProviderName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(31, this.dnsProviderName);
       }
       tfirstScreen = this.bestFpsDuration;
       if (tfirstScreen) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(32, tfirstScreen);
       }
       tfirstScreen = this.betterFpsDuration;
       if (tfirstScreen) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(33, tfirstScreen);
       }
       tfirstScreen = this.normalFpsDuration;
       if (tfirstScreen) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(34, tfirstScreen);
       }
       tfirstScreen = this.badFpsDuration;
       if (tfirstScreen) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(35, tfirstScreen);
       }
       tfirstScreen = this.emptyFpsDuration;
       if (tfirstScreen) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(36, tfirstScreen);
       }
       if (!(this.dnsResolveHost).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(37, this.dnsResolveHost);
       }
       if (!(this.dnsResolvedIp).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(38, this.dnsResolvedIp);
       }
       if (!(this.dnsResolverName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(39, this.dnsResolverName);
       }
       if (!(this.liveVideoEncodeInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(40, this.liveVideoEncodeInfo);
       }
       if (!(this.playerQosJson).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(41, this.playerQosJson);
       }
       tfirstScreen = this.streamDuration;
       if (tfirstScreen) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(42, tfirstScreen);
       }
       tfirstScreen = this.blockCnt;
       if (tfirstScreen) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(43, tfirstScreen);
       }
       tinitiativeL = this.liveStreamType;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(44, tinitiativeL);
       }
       tfirstScreen = this.realtimeUploadCnt;
       if (tfirstScreen) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(45, tfirstScreen);
       }
       tinitiativeL = this.resolutionSlicePackage;
       if (tinitiativeL != null && tinitiativeL.length > 0) {
          tinitiativeL = this.resolutionSlicePackage;
          while (i1 < tinitiativeL.length) {
             object oobject1 = tinitiativeL[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(46, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tfullscreenD = this.landscapeDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(47, tfullscreenD);
       }
       tfullscreenD = this.portraitDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(48, tfullscreenD);
       }
       tinitiativeL = this.screenOrientationSwitchCnt;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(49, tinitiativeL);
       }
       tinitiativeL = this.screenOrientationLeaveType;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(50, tinitiativeL);
       }
       tinitiativeL = this.urlPackage;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(51, tinitiativeL);
       }
       tinitiativeL = this.referUrlPackage;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(52, tinitiativeL);
       }
       tfullscreenD = this.livePlayStartTime;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(53, tfullscreenD);
       }
       tfullscreenD = this.livePlayEndTime;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(54, tfullscreenD);
       }
       tfullscreenD = this.firstFeedTime;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(55, tfullscreenD);
       }
       tfullscreenD = this.firstRaceStartTime;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(56, tfullscreenD);
       }
       if (!(this.raceVersion).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(57, this.raceVersion);
       }
       tfullscreenD = this.backgroundDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(58, tfullscreenD);
       }
       tinitiativeL = this.rssi;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(59, tinitiativeL);
       }
       tinitiativeL = this.mcc;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(60, tinitiativeL);
       }
       tinitiativeL = this.mnc;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(61, tinitiativeL);
       }
       tinitiativeL = this.lac;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(62, tinitiativeL);
       }
       tinitiativeL = this.cid;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(63, tinitiativeL);
       }
       if (!(this.clientId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(64, this.clientId);
       }
       tfullscreenD = this.cdnTraffic;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(65, tfullscreenD);
       }
       tfullscreenD = this.p2SpTraffic;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(66, tfullscreenD);
       }
       if (!(this.livePolicy).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(67, this.livePolicy);
       }
       tfullscreenD = this.firstScreenWaitForPlayDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(68, tfullscreenD);
       }
       tfullscreenD = this.firstScreenAllPreparedDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(69, tfullscreenD);
       }
       tfullscreenD = this.firstScreenPlayerTotalDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(70, tfullscreenD);
       }
       tinitiativeL = this.isAutoPlay;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(71, tinitiativeL);
       }
       tfullscreenD = this.bufferTimeOld;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(72, tfullscreenD);
       }
       tfullscreenD = this.blockCntOld;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(73, tfullscreenD);
       }
       tfullscreenD = this.postCommentCnt;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(74, tfullscreenD);
       }
       tinitiativeL = this.liveStatus;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(75, tinitiativeL);
       }
       if (!(this.kwaiSignature).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(76, this.kwaiSignature);
       }
       tfullscreenD = this.glassesBlockCnt;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(77, tfullscreenD);
       }
       tfullscreenD = this.suspendDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(78, tfullscreenD);
       }
       tinitiativeL = this.playerType;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(79, tinitiativeL);
       }
       tfullscreenD = this.hideDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(80, tfullscreenD);
       }
       tfullscreenD = this.hideCount;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(81, tfullscreenD);
       }
       tfullscreenD = this.backgroundCount;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(82, tfullscreenD);
       }
       tinitiativeL = this.liveRoomStatusOnEnter;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(83, tinitiativeL);
       }
       tfullscreenD = this.floatingWindowBlockCnt;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(84, tfullscreenD);
       }
       tfullscreenD = this.floatingWindowBufferTime;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(85, tfullscreenD);
       }
       tinitiativeL = this.isSlidePlay;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(86, tinitiativeL);
       }
       if (!(this.xKsCache).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(87, this.xKsCache);
       }
       tfullscreenD = this.firstScreenAppPrepareDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(88, tfullscreenD);
       }
       tfullscreenD = this.firstScreenPlayerRenderingDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(89, tfullscreenD);
       }
       tinitiativeL = this.manifestSwitchStatus;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(90, tinitiativeL);
       }
       tfullscreenD = this.firstScreenPlayerViewReadyDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(91, tfullscreenD);
       }
       tinitiativeL = this.liveEntranceType;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(92, tinitiativeL);
       }
       tinitiativeL = this.contentType;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(93, tinitiativeL);
       }
       tinitiativeL = this.sourceType;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(94, tinitiativeL);
       }
       tfullscreenD = this.firstScreenAppRenderingDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(95, tfullscreenD);
       }
       tfullscreenD = this.playerPlayDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(96, tfullscreenD);
       }
       if (!(this.sourceUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(97, this.sourceUrl);
       }
       if (!(this.sessionId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(98, this.sessionId);
       }
       if (!(this.searchSessionId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(99, this.searchSessionId);
       }
       if (!(this.onlineCntEnterStr).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(100, this.onlineCntEnterStr);
       }
       if (!(this.onlineCntLeaveStr).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(101, this.onlineCntLeaveStr);
       }
       if (!(this.searchParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(102, this.searchParams);
       }
       tinitiativeL = this.referLiveSourceType;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(103, tinitiativeL);
       }
       if (!(this.aggregationSessionId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(104, this.aggregationSessionId);
       }
       tfullscreenD = this.liveOperationType;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(105, tfullscreenD);
       }
       tfullscreenD = this.showIndexPlusOne;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(106, tfullscreenD);
       }
       tinitiativeL = this.enterAction;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(107, tinitiativeL);
       }
       tfullscreenD = this.externalIcon;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(108, tfullscreenD);
       }
       tinitiativeL = this.isNormalPlay;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(109, tinitiativeL);
       }
       tfullscreenD = this.viewInflateDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(110, tfullscreenD);
       }
       tfullscreenD = this.componentBindDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(111, tfullscreenD);
       }
       tinitiativeL = this.livePlayerBizType;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(112, tinitiativeL);
       }
       tinitiativeL = this.isFollowEnter;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(113, tinitiativeL);
       }
       tinitiativeL = this.isFollowLeave;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(114, tinitiativeL);
       }
       tinitiativeL = this.isPausedBeforeFirstScreen;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(115, tinitiativeL);
       }
       if (!(this.liveIconType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(116, this.liveIconType);
       }
       if (!(this.liveRecoLabel).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(117, this.liveRecoLabel);
       }
       tinitiativeL = this.isReopen;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(118, tinitiativeL);
       }
       tinitiativeL = this.batteryLevel;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(119, tinitiativeL);
       }
       tinitiativeL = this.batteryTemperature;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(120, tinitiativeL);
       }
       tinitiativeL = this.isCharging;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(121, tinitiativeL);
       }
       tfullscreenD = this.pageClickToResponseDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(122, tfullscreenD);
       }
       tfullscreenD = this.pageClickToAppearDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(123, tfullscreenD);
       }
       tfullscreenD = this.pageClickToPlayerRenderedDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(124, tfullscreenD);
       }
       tfullscreenD = this.pageClickToComponentReadyDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(125, tfullscreenD);
       }
       tfullscreenD = this.giftPanelReactDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(126, tfullscreenD);
       }
       tfullscreenD = this.commentPanelReactDuration;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(127, tfullscreenD);
       }
       tinitiativeL = this.isFirstEnterLive;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(128, tinitiativeL);
       }
       tfullscreenD = this.componentDidappear;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(129, tfullscreenD);
       }
       if (!(this.businessTimeCostParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(130, this.businessTimeCostParams);
       }
       if (!(this.unionLiveAuthor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(131, this.unionLiveAuthor);
       }
       if (!(this.unionLiveId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(132, this.unionLiveId);
       }
       if (!(this.livePlayerRenderedStartTime).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(133, this.livePlayerRenderedStartTime);
       }
       tfullscreenD = this.livePlayerRenderStartTime;
       if (tfullscreenD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(134, tfullscreenD);
       }
       tinitiativeL = this.internalStidContainer;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(135, tinitiativeL);
       }
       if (!(this.internalStidContainerJson).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(136, this.internalStidContainerJson);
       }
       tinitiativeL = this.interStidContainer;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(137, tinitiativeL);
       }
       if (!(this.groupId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(138, this.groupId);
       }
       if (!(this.liveIconTextType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(139, this.liveIconTextType);
       }
       if (!(this.liveIconReasonTextType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(140, this.liveIconReasonTextType);
       }
       if (!(this.liveIconReasonExtraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(141, this.liveIconReasonExtraInfo);
       }
       if (!(this.liveIconTextExtraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(142, this.liveIconTextExtraInfo);
       }
       if (!(this.tagType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(143, this.tagType);
       }
       tinitiativeL = this.liveStyle;
       if (tinitiativeL != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(144, tinitiativeL);
       }
       if (!(this.socName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(145, this.socName);
       }
       if (!(this.boardPlatform).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(146, this.boardPlatform);
       }
       if (!(this.isDidappear).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(147, this.isDidappear);
       }
       if (!(this.interStExParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(148, this.interStExParams);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$AudienceStatEvent mergeFrom(CodedInputByteBufferNano p0){
       int i2;
       while (true) {
          int i = p0.readTag();
          ClientStat$AudienceStatEvent uAudienceSta = 4;
          int i1 = 3;
          ClientStat$TrafficSlicePackage[] trafficSlice = 2;
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
                this.onlineCntEnter = p0.readUInt64();
                break;
              case '0':
                this.onlineCntLeave = p0.readUInt64();
                break;
              case '8':
                this.initiativeLeave = p0.readBool();
                break;
              case '@':
                this.traffic = p0.readUInt64();
                break;
              case 'H':
                this.bufferTime = p0.readUInt64();
                break;
              case 'P':
                this.prepareTime = p0.readUInt64();
                break;
              case 'X':
                this.stuckCnt = p0.readUInt64();
                break;
              case 'b':
                this.liveStreamHost = p0.readString();
                break;
              case 'j':
                this.liveStreamIp = p0.readString();
                break;
              case 'p':
                this.retryCnt = p0.readUInt64();
                break;
              case 'z':
                this.pushUrl = p0.readString();
                break;
              case 130:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 130);
                uAudienceSta = this.trafficSlicePackage;
                i1 = (uAudienceSta == null)? 0: uAudienceSta.length;
                i = i + i1;
                trafficSlice = new ClientStat$TrafficSlicePackage[i];
                if (i1) {
                   System.arraycopy(uAudienceSta, 0, trafficSlice, 0, i1);
                }
                i2 = i - 1;
                while (i1 < i2) {
                   trafficSlice[i1] = new ClientStat$TrafficSlicePackage();
                   p0.readMessage(trafficSlice[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                trafficSlice[i1] = new ClientStat$TrafficSlicePackage();
                p0.readMessage(trafficSlice[i1]);
                this.trafficSlicePackage = trafficSlice;
                break;
              case 136:
                this.firstScreenTotalDuration = p0.readUInt64();
                break;
              case 144:
                this.analyzeDnsDuration = p0.readUInt64();
                break;
              case 152:
                this.connectHttpDuration = p0.readUInt64();
                break;
              case 160:
                this.openStreamDuration = p0.readUInt64();
                break;
              case 168:
                this.analyzeStreamInfoDuration = p0.readUInt64();
                break;
              case 176:
                this.openCodecDuration = p0.readUInt64();
                break;
              case 184:
                this.receiveFirstPackageDuration = p0.readUInt64();
                break;
              case 192:
                this.preDecodeFirstPackageDuration = p0.readUInt64();
                break;
              case 200:
                this.decodeFirstPackageDuration = p0.readUInt64();
                break;
              case 208:
                this.renderFirstPackageDuration = p0.readUInt64();
                break;
              case 216:
                this.firstScreenDropPackageDuration = p0.readUInt64();
                break;
              case 224:
                this.dropPackageTotalDuration = p0.readUInt64();
                break;
              case 232:
                this.liveDecodeType = p0.readUInt64();
                break;
              case 242:
                this.dnsResolvedUrl = p0.readString();
                break;
              case 250:
                this.dnsProviderName = p0.readString();
                break;
              case 256:
                this.bestFpsDuration = p0.readUInt64();
                break;
              case 264:
                this.betterFpsDuration = p0.readUInt64();
                break;
              case 272:
                this.normalFpsDuration = p0.readUInt64();
                break;
              case 280:
                this.badFpsDuration = p0.readUInt64();
                break;
              case 288:
                this.emptyFpsDuration = p0.readUInt64();
                break;
              case 298:
                this.dnsResolveHost = p0.readString();
                break;
              case 306:
                this.dnsResolvedIp = p0.readString();
                break;
              case 314:
                this.dnsResolverName = p0.readString();
                break;
              case 322:
                this.liveVideoEncodeInfo = p0.readString();
                break;
              case 330:
                this.playerQosJson = p0.readString();
                break;
              case 336:
                this.streamDuration = p0.readUInt64();
                break;
              case 344:
                this.blockCnt = p0.readUInt64();
                break;
              case 352:
                i = p0.readInt32();
                if (i && (i != 1 && (i != trafficSlice && i != i1))) {
                   continue ;
                }else {
                   this.liveStreamType = i;
                }
                break;
              case 360:
                this.realtimeUploadCnt = p0.readUInt64();
                break;
              case 370:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 370);
                uAudienceSta = this.resolutionSlicePackage;
                i1 = (uAudienceSta == null)? 0: uAudienceSta.length;
                i = i + i1;
                ClientStat$ResolutionSlicePackage[] resolutionSl = new ClientStat$ResolutionSlicePackage[i];
                if (i1) {
                   System.arraycopy(uAudienceSta, 0, resolutionSl, 0, i1);
                }
                i2 = i - 1;
                while (i1 < i2) {
                   resolutionSl[i1] = new ClientStat$ResolutionSlicePackage();
                   p0.readMessage(resolutionSl[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                resolutionSl[i1] = new ClientStat$ResolutionSlicePackage();
                p0.readMessage(resolutionSl[i1]);
                this.resolutionSlicePackage = resolutionSl;
                break;
              case 376:
                this.landscapeDuration = p0.readUInt64();
                break;
              case 384:
                this.portraitDuration = p0.readUInt64();
                break;
              case 392:
                this.screenOrientationSwitchCnt = p0.readUInt32();
                break;
              case 400:
                i = p0.readInt32();
                if (i && (i != 1 && i != trafficSlice)) {
                   continue ;
                }else {
                   this.screenOrientationLeaveType = i;
                }
                break;
              case 410:
                if (this.urlPackage == null) {
                   this.urlPackage = new ClientEvent$UrlPackage();
                }
                p0.readMessage(this.urlPackage);
                break;
              case 418:
                if (this.referUrlPackage == null) {
                   this.referUrlPackage = new ClientEvent$UrlPackage();
                }
                p0.readMessage(this.referUrlPackage);
                break;
              case 424:
                this.livePlayStartTime = p0.readUInt64();
                break;
              case 432:
                this.livePlayEndTime = p0.readUInt64();
                break;
              case 440:
                this.firstFeedTime = p0.readUInt64();
                break;
              case 448:
                this.firstRaceStartTime = p0.readUInt64();
                break;
              case 458:
                this.raceVersion = p0.readString();
                break;
              case 464:
                this.backgroundDuration = p0.readUInt64();
                break;
              case 472:
                this.rssi = p0.readUInt32();
                break;
              case 480:
                this.mcc = p0.readUInt32();
                break;
              case 488:
                this.mnc = p0.readUInt32();
                break;
              case 496:
                this.lac = p0.readUInt32();
                break;
              case 504:
                this.cid = p0.readUInt32();
                break;
              case 514:
                this.clientId = p0.readString();
                break;
              case 520:
                this.cdnTraffic = p0.readUInt64();
                break;
              case 528:
                this.p2SpTraffic = p0.readUInt64();
                break;
              case 538:
                this.livePolicy = p0.readString();
                break;
              case 544:
                this.firstScreenWaitForPlayDuration = p0.readUInt64();
                break;
              case 552:
                this.firstScreenAllPreparedDuration = p0.readUInt64();
                break;
              case 560:
                this.firstScreenPlayerTotalDuration = p0.readUInt64();
                break;
              case 568:
                this.isAutoPlay = p0.readBool();
                break;
              case 576:
                this.bufferTimeOld = p0.readUInt64();
                break;
              case 584:
                this.blockCntOld = p0.readUInt64();
                break;
              case 592:
                this.postCommentCnt = p0.readUInt64();
                break;
              case 600:
                i = p0.readInt32();
                if (i && (i != 1 && (i != trafficSlice && i != i1))) {
                   continue ;
                }else {
                   this.liveStatus = i;
                }
                break;
              case 610:
                this.kwaiSignature = p0.readString();
                break;
              case 616:
                this.glassesBlockCnt = p0.readUInt64();
                break;
              case 624:
                this.suspendDuration = p0.readUInt64();
                break;
              case 632:
                i = p0.readInt32();
                if (i && (i != 1 && (i != trafficSlice && (i != i1 && (i != uAudienceSta && i != 5))))) {
                   continue ;
                }else {
                   this.playerType = i;
                }
                break;
              case 640:
                this.hideDuration = p0.readUInt64();
                break;
              case 648:
                this.hideCount = p0.readUInt64();
                break;
              case 656:
                this.backgroundCount = p0.readUInt64();
                break;
              case 664:
                i = p0.readInt32();
                if (i && (i != 1 && (i != trafficSlice && i != i1))) {
                   continue ;
                }else {
                   this.liveRoomStatusOnEnter = i;
                }
                break;
              case 672:
                this.floatingWindowBlockCnt = p0.readUInt64();
                break;
              case 680:
                this.floatingWindowBufferTime = p0.readUInt64();
                break;
              case 688:
                this.isSlidePlay = p0.readBool();
                break;
              case 698:
                this.xKsCache = p0.readString();
                break;
              case 704:
                this.firstScreenAppPrepareDuration = p0.readUInt64();
                break;
              case 712:
                this.firstScreenPlayerRenderingDuration = p0.readUInt64();
                break;
              case 720:
                i = p0.readInt32();
                if (i && (i != 1 && (i != trafficSlice && i != i1))) {
                   continue ;
                }else {
                   this.manifestSwitchStatus = i;
                }
                break;
              case 728:
                this.firstScreenPlayerViewReadyDuration = p0.readUInt64();
                break;
              case 736:
                i = p0.readInt32();
                if (i && i != 1) {
                   continue ;
                }else {
                   this.liveEntranceType = i;
                }
                break;
              case 744:
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
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 1:
                      break;
                    default:
                }
                this.contentType = i;
                break;
              case 752:
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
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case '!':
                    case '"':
                    case '#':
                    case '$':
                    case '%':
                    case '&':
                    case 39:
                    case '(':
                    case ')':
                    case '*':
                    case '+':
                    case ',':
                    case '-':
                    case '.':
                    case '/':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '[':
                    case 92:
                    case ']':
                    case '^':
                    case '_':
                    case '`':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                    case '{':
                    case '|':
                    case '}':
                    case '~':
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                    case 131:
                    case 132:
                    case 133:
                    case 134:
                    case 135:
                    case 136:
                    case 137:
                    case 138:
                    case 139:
                    case 140:
                    case 141:
                    case 142:
                    case 143:
                    case 144:
                    case 145:
                    case 146:
                    case 147:
                    case 148:
                    case 149:
                    case 150:
                    case 151:
                    case 152:
                    case 153:
                    case 154:
                    case 155:
                    case 156:
                    case 157:
                    case 158:
                    case 159:
                    case 160:
                    case 161:
                    case 162:
                    case 163:
                    case 164:
                    case 165:
                    case 166:
                    case 167:
                    case 168:
                    case 169:
                    case 170:
                    case 171:
                    case 172:
                    case 173:
                    case 174:
                    case 175:
                    case 176:
                    case 177:
                    case 178:
                    case 179:
                    case 180:
                    case 181:
                    case 182:
                    case 183:
                    case 184:
                    case 185:
                    case 186:
                    case 187:
                    case 188:
                    case 189:
                    case 190:
                    case 191:
                    case 192:
                    case 193:
                    case 194:
                    case 195:
                    case 196:
                    case 197:
                    case 198:
                    case 199:
                    case 200:
                    case 201:
                    case 202:
                    case 203:
                    case 204:
                    case 205:
                    case 206:
                    case 207:
                    case 208:
                    case 209:
                    case 210:
                    case 211:
                    case 212:
                    case 213:
                    case 214:
                    case 215:
                    case 216:
                    case 217:
                    case 218:
                    case 219:
                    case 220:
                    case 221:
                    case 222:
                    case 223:
                    case 224:
                    case 225:
                    case 226:
                    case 227:
                    case 228:
                    case 229:
                    case 230:
                    case 231:
                    case 232:
                    case 233:
                    case 234:
                    case 235:
                    case 236:
                    case 237:
                    case 238:
                    case 239:
                    case 240:
                    case 241:
                    case 242:
                    case 243:
                    case 244:
                    case 245:
                    case 246:
                    case 247:
                    case 248:
                    case 249:
                    case 250:
                    case 251:
                    case 252:
                    case 253:
                    case 254:
                    case 255:
                    case 256:
                    case 257:
                    case 258:
                    case 259:
                    case 260:
                    case 261:
                    case 262:
                    case 263:
                    case 264:
                    case 265:
                    case 266:
                    case 267:
                    case 268:
                    case 269:
                    case 270:
                    case 271:
                    case 272:
                    case 273:
                    case 274:
                    case 275:
                    case 276:
                    case 277:
                    case 278:
                    case 279:
                    case 280:
                    case 281:
                    case 282:
                    case 283:
                    case 284:
                    case 285:
                    case 286:
                    case 287:
                    case 288:
                    case 289:
                    case 290:
                    case 291:
                    case 292:
                    case 293:
                    case 294:
                    case 295:
                    case 296:
                    case 297:
                    case 298:
                    case 299:
                    case 300:
                    case 301:
                    case 302:
                    case 303:
                    case 304:
                    case 305:
                    case 306:
                    case 307:
                    case 308:
                    case 309:
                    case 310:
                    case 311:
                    case 312:
                    case 313:
                    case 314:
                    case 315:
                    case 316:
                    case 317:
                    case 318:
                    case 319:
                    case 320:
                    case 321:
                    case 322:
                    case 323:
                    case 324:
                    case 325:
                    case 326:
                    case 327:
                    case 328:
                    case 329:
                    case 330:
                    case 331:
                    case 332:
                    case 333:
                    case 334:
                    case 335:
                    case 336:
                    case 337:
                    case 338:
                    case 339:
                    case 340:
                    case 341:
                    case 342:
                    case 343:
                    case 1:
                      break;
                    default:
                }
                this.sourceType = i;
                break;
              case 760:
                this.firstScreenAppRenderingDuration = p0.readUInt64();
                break;
              case 768:
                this.playerPlayDuration = p0.readUInt64();
                break;
              case 778:
                this.sourceUrl = p0.readString();
                break;
              case 786:
                this.sessionId = p0.readString();
                break;
              case 794:
                this.searchSessionId = p0.readString();
                break;
              case 802:
                this.onlineCntEnterStr = p0.readString();
                break;
              case 810:
                this.onlineCntLeaveStr = p0.readString();
                break;
              case 818:
                this.searchParams = p0.readString();
                break;
              case 824:
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
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case '!':
                    case '"':
                    case '#':
                    case '$':
                    case '%':
                    case '&':
                    case 39:
                    case '(':
                    case ')':
                    case '*':
                    case '+':
                    case ',':
                    case '-':
                    case '.':
                    case '/':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '[':
                    case 92:
                    case ']':
                    case '^':
                    case '_':
                    case '`':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                    case '{':
                    case '|':
                    case '}':
                    case '~':
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                    case 131:
                    case 132:
                    case 133:
                    case 134:
                    case 135:
                    case 136:
                    case 137:
                    case 138:
                    case 139:
                    case 140:
                    case 141:
                    case 142:
                    case 143:
                    case 144:
                    case 145:
                    case 146:
                    case 147:
                    case 148:
                    case 149:
                    case 150:
                    case 151:
                    case 152:
                    case 153:
                    case 154:
                    case 155:
                    case 156:
                    case 157:
                    case 158:
                    case 159:
                    case 160:
                    case 161:
                    case 162:
                    case 163:
                    case 164:
                    case 165:
                    case 166:
                    case 167:
                    case 168:
                    case 169:
                    case 170:
                    case 171:
                    case 172:
                    case 173:
                    case 174:
                    case 175:
                    case 176:
                    case 177:
                    case 178:
                    case 179:
                    case 180:
                    case 181:
                    case 182:
                    case 183:
                    case 184:
                    case 185:
                    case 186:
                    case 187:
                    case 188:
                    case 189:
                    case 190:
                    case 191:
                    case 192:
                    case 193:
                    case 194:
                    case 195:
                    case 196:
                    case 197:
                    case 198:
                    case 199:
                    case 200:
                    case 201:
                    case 202:
                    case 203:
                    case 204:
                    case 205:
                    case 206:
                    case 207:
                    case 208:
                    case 209:
                    case 210:
                    case 211:
                    case 212:
                    case 213:
                    case 214:
                    case 215:
                    case 216:
                    case 217:
                    case 218:
                    case 219:
                    case 220:
                    case 221:
                    case 222:
                    case 223:
                    case 224:
                    case 225:
                    case 226:
                    case 227:
                    case 228:
                    case 229:
                    case 230:
                    case 231:
                    case 232:
                    case 233:
                    case 234:
                    case 235:
                    case 236:
                    case 237:
                    case 238:
                    case 239:
                    case 240:
                    case 241:
                    case 242:
                    case 243:
                    case 244:
                    case 245:
                    case 246:
                    case 247:
                    case 248:
                    case 249:
                    case 250:
                    case 251:
                    case 252:
                    case 253:
                    case 254:
                    case 255:
                    case 256:
                    case 257:
                    case 258:
                    case 259:
                    case 260:
                    case 261:
                    case 262:
                    case 263:
                    case 264:
                    case 265:
                    case 266:
                    case 267:
                    case 268:
                    case 269:
                    case 270:
                    case 271:
                    case 272:
                    case 273:
                    case 274:
                    case 275:
                    case 276:
                    case 277:
                    case 278:
                    case 279:
                    case 280:
                    case 281:
                    case 282:
                    case 283:
                    case 284:
                    case 285:
                    case 286:
                    case 287:
                    case 288:
                    case 289:
                    case 290:
                    case 291:
                    case 292:
                    case 293:
                    case 294:
                    case 295:
                    case 296:
                    case 297:
                    case 298:
                    case 299:
                    case 300:
                    case 301:
                    case 302:
                    case 303:
                    case 304:
                    case 305:
                    case 306:
                    case 307:
                    case 308:
                    case 309:
                    case 310:
                    case 311:
                    case 312:
                    case 313:
                    case 314:
                    case 315:
                    case 316:
                    case 317:
                    case 318:
                    case 319:
                    case 320:
                    case 321:
                    case 322:
                    case 323:
                    case 324:
                    case 325:
                    case 326:
                    case 327:
                    case 328:
                    case 329:
                    case 330:
                    case 331:
                    case 332:
                    case 333:
                    case 334:
                    case 335:
                    case 336:
                    case 337:
                    case 338:
                    case 339:
                    case 340:
                    case 341:
                    case 342:
                    case 343:
                    case 1:
                      break;
                    default:
                }
                this.referLiveSourceType = i;
                break;
              case 834:
                this.aggregationSessionId = p0.readString();
                break;
              case 840:
                this.liveOperationType = p0.readUInt64();
                break;
              case 848:
                this.showIndexPlusOne = p0.readUInt64();
                break;
              case 856:
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
                    case 1:
                      break;
                    default:
                }
                this.enterAction = i;
                break;
              case 864:
                this.externalIcon = p0.readUInt64();
                break;
              case 872:
                this.isNormalPlay = p0.readBool();
                break;
              case 880:
                this.viewInflateDuration = p0.readUInt64();
                break;
              case 888:
                this.componentBindDuration = p0.readUInt64();
                break;
              case 896:
                i = p0.readInt32();
                if (i && (i != 1 && (i != trafficSlice && i != i1))) {
                   continue ;
                }else {
                   this.livePlayerBizType = i;
                }
                break;
              case 904:
                this.isFollowEnter = p0.readBool();
                break;
              case 912:
                this.isFollowLeave = p0.readBool();
                break;
              case 920:
                this.isPausedBeforeFirstScreen = p0.readBool();
                break;
              case 930:
                this.liveIconType = p0.readString();
                break;
              case 938:
                this.liveRecoLabel = p0.readString();
                break;
              case 944:
                this.isReopen = p0.readBool();
                break;
              case 952:
                this.batteryLevel = p0.readUInt32();
                break;
              case 960:
                this.batteryTemperature = p0.readUInt32();
                break;
              case 968:
                this.isCharging = p0.readBool();
                break;
              case 976:
                this.pageClickToResponseDuration = p0.readUInt64();
                break;
              case 984:
                this.pageClickToAppearDuration = p0.readUInt64();
                break;
              case 992:
                this.pageClickToPlayerRenderedDuration = p0.readUInt64();
                break;
              case 1000:
                this.pageClickToComponentReadyDuration = p0.readUInt64();
                break;
              case 1008:
                this.giftPanelReactDuration = p0.readUInt64();
                break;
              case 1016:
                this.commentPanelReactDuration = p0.readUInt64();
                break;
              case 1024:
                this.isFirstEnterLive = p0.readBool();
                break;
              case 1032:
                this.componentDidappear = p0.readUInt64();
                break;
              case 1042:
                this.businessTimeCostParams = p0.readString();
                break;
              case 1050:
                this.unionLiveAuthor = p0.readString();
                break;
              case 1058:
                this.unionLiveId = p0.readString();
                break;
              case 1066:
                this.livePlayerRenderedStartTime = p0.readString();
                break;
              case 1072:
                this.livePlayerRenderStartTime = p0.readUInt64();
                break;
              case 1082:
                if (this.internalStidContainer == null) {
                   this.internalStidContainer = new StidContainerProto$StidContainer();
                }
                p0.readMessage(this.internalStidContainer);
                break;
              case 1090:
                this.internalStidContainerJson = p0.readString();
                break;
              case 1098:
                if (this.interStidContainer == null) {
                   this.interStidContainer = new StidContainerProto$StidContainer();
                }
                p0.readMessage(this.interStidContainer);
                break;
              case 1106:
                this.groupId = p0.readString();
                break;
              case 1114:
                this.liveIconTextType = p0.readString();
                break;
              case 1122:
                this.liveIconReasonTextType = p0.readString();
                break;
              case 1130:
                this.liveIconReasonExtraInfo = p0.readString();
                break;
              case 1138:
                this.liveIconTextExtraInfo = p0.readString();
                break;
              case 1146:
                this.tagType = p0.readString();
                break;
              case 1152:
                i = p0.readInt32();
                if (i && (i != 1 && (i != trafficSlice && (i != i1 && i != uAudienceSta)))) {
                   continue ;
                }else {
                   this.liveStyle = i;
                }
                break;
              case 1162:
                this.socName = p0.readString();
                break;
              case 1170:
                this.boardPlatform = p0.readString();
                break;
              case 1178:
                this.isDidappear = p0.readString();
                break;
              case 1186:
                this.interStExParams = p0.readString();
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
       ClientStat$AudienceStatEvent tfullscreenD = this.fullscreenDuration;
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
       tfullscreenD = this.onlineCntEnter;
       if (tfullscreenD) {
          p0.writeUInt64(5, tfullscreenD);
       }
       tfullscreenD = this.onlineCntLeave;
       if (tfullscreenD) {
          p0.writeUInt64(6, tfullscreenD);
       }
       ClientStat$AudienceStatEvent tinitiativeL = this.initiativeLeave;
       if (tinitiativeL != null) {
          p0.writeBool(7, tinitiativeL);
       }
       tfullscreenD = this.traffic;
       if (tfullscreenD) {
          p0.writeUInt64(8, tfullscreenD);
       }
       tfullscreenD = this.bufferTime;
       if (tfullscreenD) {
          p0.writeUInt64(9, tfullscreenD);
       }
       tfullscreenD = this.prepareTime;
       if (tfullscreenD) {
          p0.writeUInt64(10, tfullscreenD);
       }
       tfullscreenD = this.stuckCnt;
       if (tfullscreenD) {
          p0.writeUInt64(11, tfullscreenD);
       }
       if (!(this.liveStreamHost).equals(str)) {
          p0.writeString(12, this.liveStreamHost);
       }
       if (!(this.liveStreamIp).equals(str)) {
          p0.writeString(13, this.liveStreamIp);
       }
       tfullscreenD = this.retryCnt;
       if (tfullscreenD) {
          p0.writeUInt64(14, tfullscreenD);
       }
       if (!(this.pushUrl).equals(str)) {
          p0.writeString(15, this.pushUrl);
       }
       tinitiativeL = this.trafficSlicePackage;
       int i = 0;
       if (tinitiativeL != null && tinitiativeL.length > 0) {
          int i1 = 0;
          ClientStat$AudienceStatEvent ttrafficSlic = this.trafficSlicePackage;
          while (i1 < ttrafficSlic.length) {
             object oobject = ttrafficSlic[i1];
             if (oobject != null) {
                p0.writeMessage(16, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ClientStat$AudienceStatEvent tfirstScreen = this.firstScreenTotalDuration;
       if (tfirstScreen) {
          p0.writeUInt64(17, tfirstScreen);
       }
       tfirstScreen = this.analyzeDnsDuration;
       if (tfirstScreen) {
          p0.writeUInt64(18, tfirstScreen);
       }
       tfirstScreen = this.connectHttpDuration;
       if (tfirstScreen) {
          p0.writeUInt64(19, tfirstScreen);
       }
       tfirstScreen = this.openStreamDuration;
       if (tfirstScreen) {
          p0.writeUInt64(20, tfirstScreen);
       }
       tfirstScreen = this.analyzeStreamInfoDuration;
       if (tfirstScreen) {
          p0.writeUInt64(21, tfirstScreen);
       }
       tfirstScreen = this.openCodecDuration;
       if (tfirstScreen) {
          p0.writeUInt64(22, tfirstScreen);
       }
       tfirstScreen = this.receiveFirstPackageDuration;
       if (tfirstScreen) {
          p0.writeUInt64(23, tfirstScreen);
       }
       tfirstScreen = this.preDecodeFirstPackageDuration;
       if (tfirstScreen) {
          p0.writeUInt64(24, tfirstScreen);
       }
       tfirstScreen = this.decodeFirstPackageDuration;
       if (tfirstScreen) {
          p0.writeUInt64(25, tfirstScreen);
       }
       tfirstScreen = this.renderFirstPackageDuration;
       if (tfirstScreen) {
          p0.writeUInt64(26, tfirstScreen);
       }
       tfirstScreen = this.firstScreenDropPackageDuration;
       if (tfirstScreen) {
          p0.writeUInt64(27, tfirstScreen);
       }
       tfirstScreen = this.dropPackageTotalDuration;
       if (tfirstScreen) {
          p0.writeUInt64(28, tfirstScreen);
       }
       tfirstScreen = this.liveDecodeType;
       if (tfirstScreen) {
          p0.writeUInt64(29, tfirstScreen);
       }
       if (!(this.dnsResolvedUrl).equals(str)) {
          p0.writeString(30, this.dnsResolvedUrl);
       }
       if (!(this.dnsProviderName).equals(str)) {
          p0.writeString(31, this.dnsProviderName);
       }
       tfirstScreen = this.bestFpsDuration;
       if (tfirstScreen) {
          p0.writeUInt64(32, tfirstScreen);
       }
       tfirstScreen = this.betterFpsDuration;
       if (tfirstScreen) {
          p0.writeUInt64(33, tfirstScreen);
       }
       tfirstScreen = this.normalFpsDuration;
       if (tfirstScreen) {
          p0.writeUInt64(34, tfirstScreen);
       }
       tfirstScreen = this.badFpsDuration;
       if (tfirstScreen) {
          p0.writeUInt64(35, tfirstScreen);
       }
       tfirstScreen = this.emptyFpsDuration;
       if (tfirstScreen) {
          p0.writeUInt64(36, tfirstScreen);
       }
       if (!(this.dnsResolveHost).equals(str)) {
          p0.writeString(37, this.dnsResolveHost);
       }
       if (!(this.dnsResolvedIp).equals(str)) {
          p0.writeString(38, this.dnsResolvedIp);
       }
       if (!(this.dnsResolverName).equals(str)) {
          p0.writeString(39, this.dnsResolverName);
       }
       if (!(this.liveVideoEncodeInfo).equals(str)) {
          p0.writeString(40, this.liveVideoEncodeInfo);
       }
       if (!(this.playerQosJson).equals(str)) {
          p0.writeString(41, this.playerQosJson);
       }
       tfirstScreen = this.streamDuration;
       if (tfirstScreen) {
          p0.writeUInt64(42, tfirstScreen);
       }
       tfirstScreen = this.blockCnt;
       if (tfirstScreen) {
          p0.writeUInt64(43, tfirstScreen);
       }
       tinitiativeL = this.liveStreamType;
       if (tinitiativeL != null) {
          p0.writeInt32(44, tinitiativeL);
       }
       tfirstScreen = this.realtimeUploadCnt;
       if (tfirstScreen) {
          p0.writeUInt64(45, tfirstScreen);
       }
       tinitiativeL = this.resolutionSlicePackage;
       if (tinitiativeL != null && tinitiativeL.length > 0) {
          tinitiativeL = this.resolutionSlicePackage;
          while (i < tinitiativeL.length) {
             object oobject1 = tinitiativeL[i];
             if (oobject1 != null) {
                p0.writeMessage(46, oobject1);
             }
             i = i + 1;
          }
       }
       tfullscreenD = this.landscapeDuration;
       if (tfullscreenD) {
          p0.writeUInt64(47, tfullscreenD);
       }
       tfullscreenD = this.portraitDuration;
       if (tfullscreenD) {
          p0.writeUInt64(48, tfullscreenD);
       }
       tinitiativeL = this.screenOrientationSwitchCnt;
       if (tinitiativeL != null) {
          p0.writeUInt32(49, tinitiativeL);
       }
       tinitiativeL = this.screenOrientationLeaveType;
       if (tinitiativeL != null) {
          p0.writeInt32(50, tinitiativeL);
       }
       tinitiativeL = this.urlPackage;
       if (tinitiativeL != null) {
          p0.writeMessage(51, tinitiativeL);
       }
       tinitiativeL = this.referUrlPackage;
       if (tinitiativeL != null) {
          p0.writeMessage(52, tinitiativeL);
       }
       tfullscreenD = this.livePlayStartTime;
       if (tfullscreenD) {
          p0.writeUInt64(53, tfullscreenD);
       }
       tfullscreenD = this.livePlayEndTime;
       if (tfullscreenD) {
          p0.writeUInt64(54, tfullscreenD);
       }
       tfullscreenD = this.firstFeedTime;
       if (tfullscreenD) {
          p0.writeUInt64(55, tfullscreenD);
       }
       tfullscreenD = this.firstRaceStartTime;
       if (tfullscreenD) {
          p0.writeUInt64(56, tfullscreenD);
       }
       if (!(this.raceVersion).equals(str)) {
          p0.writeString(57, this.raceVersion);
       }
       tfullscreenD = this.backgroundDuration;
       if (tfullscreenD) {
          p0.writeUInt64(58, tfullscreenD);
       }
       tinitiativeL = this.rssi;
       if (tinitiativeL != null) {
          p0.writeUInt32(59, tinitiativeL);
       }
       tinitiativeL = this.mcc;
       if (tinitiativeL != null) {
          p0.writeUInt32(60, tinitiativeL);
       }
       tinitiativeL = this.mnc;
       if (tinitiativeL != null) {
          p0.writeUInt32(61, tinitiativeL);
       }
       tinitiativeL = this.lac;
       if (tinitiativeL != null) {
          p0.writeUInt32(62, tinitiativeL);
       }
       tinitiativeL = this.cid;
       if (tinitiativeL != null) {
          p0.writeUInt32(63, tinitiativeL);
       }
       if (!(this.clientId).equals(str)) {
          p0.writeString(64, this.clientId);
       }
       tfullscreenD = this.cdnTraffic;
       if (tfullscreenD) {
          p0.writeUInt64(65, tfullscreenD);
       }
       tfullscreenD = this.p2SpTraffic;
       if (tfullscreenD) {
          p0.writeUInt64(66, tfullscreenD);
       }
       if (!(this.livePolicy).equals(str)) {
          p0.writeString(67, this.livePolicy);
       }
       tfullscreenD = this.firstScreenWaitForPlayDuration;
       if (tfullscreenD) {
          p0.writeUInt64(68, tfullscreenD);
       }
       tfullscreenD = this.firstScreenAllPreparedDuration;
       if (tfullscreenD) {
          p0.writeUInt64(69, tfullscreenD);
       }
       tfullscreenD = this.firstScreenPlayerTotalDuration;
       if (tfullscreenD) {
          p0.writeUInt64(70, tfullscreenD);
       }
       tinitiativeL = this.isAutoPlay;
       if (tinitiativeL != null) {
          p0.writeBool(71, tinitiativeL);
       }
       tfullscreenD = this.bufferTimeOld;
       if (tfullscreenD) {
          p0.writeUInt64(72, tfullscreenD);
       }
       tfullscreenD = this.blockCntOld;
       if (tfullscreenD) {
          p0.writeUInt64(73, tfullscreenD);
       }
       tfullscreenD = this.postCommentCnt;
       if (tfullscreenD) {
          p0.writeUInt64(74, tfullscreenD);
       }
       tinitiativeL = this.liveStatus;
       if (tinitiativeL != null) {
          p0.writeInt32(75, tinitiativeL);
       }
       if (!(this.kwaiSignature).equals(str)) {
          p0.writeString(76, this.kwaiSignature);
       }
       tfullscreenD = this.glassesBlockCnt;
       if (tfullscreenD) {
          p0.writeUInt64(77, tfullscreenD);
       }
       tfullscreenD = this.suspendDuration;
       if (tfullscreenD) {
          p0.writeUInt64(78, tfullscreenD);
       }
       tinitiativeL = this.playerType;
       if (tinitiativeL != null) {
          p0.writeInt32(79, tinitiativeL);
       }
       tfullscreenD = this.hideDuration;
       if (tfullscreenD) {
          p0.writeUInt64(80, tfullscreenD);
       }
       tfullscreenD = this.hideCount;
       if (tfullscreenD) {
          p0.writeUInt64(81, tfullscreenD);
       }
       tfullscreenD = this.backgroundCount;
       if (tfullscreenD) {
          p0.writeUInt64(82, tfullscreenD);
       }
       tinitiativeL = this.liveRoomStatusOnEnter;
       if (tinitiativeL != null) {
          p0.writeInt32(83, tinitiativeL);
       }
       tfullscreenD = this.floatingWindowBlockCnt;
       if (tfullscreenD) {
          p0.writeUInt64(84, tfullscreenD);
       }
       tfullscreenD = this.floatingWindowBufferTime;
       if (tfullscreenD) {
          p0.writeUInt64(85, tfullscreenD);
       }
       tinitiativeL = this.isSlidePlay;
       if (tinitiativeL != null) {
          p0.writeBool(86, tinitiativeL);
       }
       if (!(this.xKsCache).equals(str)) {
          p0.writeString(87, this.xKsCache);
       }
       tfullscreenD = this.firstScreenAppPrepareDuration;
       if (tfullscreenD) {
          p0.writeUInt64(88, tfullscreenD);
       }
       tfullscreenD = this.firstScreenPlayerRenderingDuration;
       if (tfullscreenD) {
          p0.writeUInt64(89, tfullscreenD);
       }
       tinitiativeL = this.manifestSwitchStatus;
       if (tinitiativeL != null) {
          p0.writeInt32(90, tinitiativeL);
       }
       tfullscreenD = this.firstScreenPlayerViewReadyDuration;
       if (tfullscreenD) {
          p0.writeUInt64(91, tfullscreenD);
       }
       tinitiativeL = this.liveEntranceType;
       if (tinitiativeL != null) {
          p0.writeInt32(92, tinitiativeL);
       }
       tinitiativeL = this.contentType;
       if (tinitiativeL != null) {
          p0.writeInt32(93, tinitiativeL);
       }
       tinitiativeL = this.sourceType;
       if (tinitiativeL != null) {
          p0.writeInt32(94, tinitiativeL);
       }
       tfullscreenD = this.firstScreenAppRenderingDuration;
       if (tfullscreenD) {
          p0.writeUInt64(95, tfullscreenD);
       }
       tfullscreenD = this.playerPlayDuration;
       if (tfullscreenD) {
          p0.writeUInt64(96, tfullscreenD);
       }
       if (!(this.sourceUrl).equals(str)) {
          p0.writeString(97, this.sourceUrl);
       }
       if (!(this.sessionId).equals(str)) {
          p0.writeString(98, this.sessionId);
       }
       if (!(this.searchSessionId).equals(str)) {
          p0.writeString(99, this.searchSessionId);
       }
       if (!(this.onlineCntEnterStr).equals(str)) {
          p0.writeString(100, this.onlineCntEnterStr);
       }
       if (!(this.onlineCntLeaveStr).equals(str)) {
          p0.writeString(101, this.onlineCntLeaveStr);
       }
       if (!(this.searchParams).equals(str)) {
          p0.writeString(102, this.searchParams);
       }
       tinitiativeL = this.referLiveSourceType;
       if (tinitiativeL != null) {
          p0.writeInt32(103, tinitiativeL);
       }
       if (!(this.aggregationSessionId).equals(str)) {
          p0.writeString(104, this.aggregationSessionId);
       }
       tfullscreenD = this.liveOperationType;
       if (tfullscreenD) {
          p0.writeUInt64(105, tfullscreenD);
       }
       tfullscreenD = this.showIndexPlusOne;
       if (tfullscreenD) {
          p0.writeUInt64(106, tfullscreenD);
       }
       tinitiativeL = this.enterAction;
       if (tinitiativeL != null) {
          p0.writeInt32(107, tinitiativeL);
       }
       tfullscreenD = this.externalIcon;
       if (tfullscreenD) {
          p0.writeUInt64(108, tfullscreenD);
       }
       tinitiativeL = this.isNormalPlay;
       if (tinitiativeL != null) {
          p0.writeBool(109, tinitiativeL);
       }
       tfullscreenD = this.viewInflateDuration;
       if (tfullscreenD) {
          p0.writeUInt64(110, tfullscreenD);
       }
       tfullscreenD = this.componentBindDuration;
       if (tfullscreenD) {
          p0.writeUInt64(111, tfullscreenD);
       }
       tinitiativeL = this.livePlayerBizType;
       if (tinitiativeL != null) {
          p0.writeInt32(112, tinitiativeL);
       }
       tinitiativeL = this.isFollowEnter;
       if (tinitiativeL != null) {
          p0.writeBool(113, tinitiativeL);
       }
       tinitiativeL = this.isFollowLeave;
       if (tinitiativeL != null) {
          p0.writeBool(114, tinitiativeL);
       }
       tinitiativeL = this.isPausedBeforeFirstScreen;
       if (tinitiativeL != null) {
          p0.writeBool(115, tinitiativeL);
       }
       if (!(this.liveIconType).equals(str)) {
          p0.writeString(116, this.liveIconType);
       }
       if (!(this.liveRecoLabel).equals(str)) {
          p0.writeString(117, this.liveRecoLabel);
       }
       tinitiativeL = this.isReopen;
       if (tinitiativeL != null) {
          p0.writeBool(118, tinitiativeL);
       }
       tinitiativeL = this.batteryLevel;
       if (tinitiativeL != null) {
          p0.writeUInt32(119, tinitiativeL);
       }
       tinitiativeL = this.batteryTemperature;
       if (tinitiativeL != null) {
          p0.writeUInt32(120, tinitiativeL);
       }
       tinitiativeL = this.isCharging;
       if (tinitiativeL != null) {
          p0.writeBool(121, tinitiativeL);
       }
       tfullscreenD = this.pageClickToResponseDuration;
       if (tfullscreenD) {
          p0.writeUInt64(122, tfullscreenD);
       }
       tfullscreenD = this.pageClickToAppearDuration;
       if (tfullscreenD) {
          p0.writeUInt64(123, tfullscreenD);
       }
       tfullscreenD = this.pageClickToPlayerRenderedDuration;
       if (tfullscreenD) {
          p0.writeUInt64(124, tfullscreenD);
       }
       tfullscreenD = this.pageClickToComponentReadyDuration;
       if (tfullscreenD) {
          p0.writeUInt64(125, tfullscreenD);
       }
       tfullscreenD = this.giftPanelReactDuration;
       if (tfullscreenD) {
          p0.writeUInt64(126, tfullscreenD);
       }
       tfullscreenD = this.commentPanelReactDuration;
       if (tfullscreenD) {
          p0.writeUInt64(127, tfullscreenD);
       }
       tinitiativeL = this.isFirstEnterLive;
       if (tinitiativeL != null) {
          p0.writeBool(128, tinitiativeL);
       }
       tfullscreenD = this.componentDidappear;
       if (tfullscreenD) {
          p0.writeUInt64(129, tfullscreenD);
       }
       if (!(this.businessTimeCostParams).equals(str)) {
          p0.writeString(130, this.businessTimeCostParams);
       }
       if (!(this.unionLiveAuthor).equals(str)) {
          p0.writeString(131, this.unionLiveAuthor);
       }
       if (!(this.unionLiveId).equals(str)) {
          p0.writeString(132, this.unionLiveId);
       }
       if (!(this.livePlayerRenderedStartTime).equals(str)) {
          p0.writeString(133, this.livePlayerRenderedStartTime);
       }
       tfullscreenD = this.livePlayerRenderStartTime;
       if (tfullscreenD) {
          p0.writeUInt64(134, tfullscreenD);
       }
       tinitiativeL = this.internalStidContainer;
       if (tinitiativeL != null) {
          p0.writeMessage(135, tinitiativeL);
       }
       if (!(this.internalStidContainerJson).equals(str)) {
          p0.writeString(136, this.internalStidContainerJson);
       }
       tinitiativeL = this.interStidContainer;
       if (tinitiativeL != null) {
          p0.writeMessage(137, tinitiativeL);
       }
       if (!(this.groupId).equals(str)) {
          p0.writeString(138, this.groupId);
       }
       if (!(this.liveIconTextType).equals(str)) {
          p0.writeString(139, this.liveIconTextType);
       }
       if (!(this.liveIconReasonTextType).equals(str)) {
          p0.writeString(140, this.liveIconReasonTextType);
       }
       if (!(this.liveIconReasonExtraInfo).equals(str)) {
          p0.writeString(141, this.liveIconReasonExtraInfo);
       }
       if (!(this.liveIconTextExtraInfo).equals(str)) {
          p0.writeString(142, this.liveIconTextExtraInfo);
       }
       if (!(this.tagType).equals(str)) {
          p0.writeString(143, this.tagType);
       }
       tinitiativeL = this.liveStyle;
       if (tinitiativeL != null) {
          p0.writeInt32(144, tinitiativeL);
       }
       if (!(this.socName).equals(str)) {
          p0.writeString(145, this.socName);
       }
       if (!(this.boardPlatform).equals(str)) {
          p0.writeString(146, this.boardPlatform);
       }
       if (!(this.isDidappear).equals(str)) {
          p0.writeString(147, this.isDidappear);
       }
       if (!(this.interStExParams).equals(str)) {
          p0.writeString(148, this.interStExParams);
       }
       super.writeTo(p0);
       return;
    }
}
