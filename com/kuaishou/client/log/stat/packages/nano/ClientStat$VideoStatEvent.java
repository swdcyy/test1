package com.kuaishou.client.log.stat.packages.nano.ClientStat$VideoStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.lang.Double;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidContainer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;

public final class ClientStat$VideoStatEvent extends MessageNano	// class@00081a
{
    public String atlasParams;
    public double averageFps;
    public long backgroundPlayDuration;
    public int batteryLevel;
    public int batteryTemperature;
    public long beginPlayTime;
    public String bizType;
    public String bluetoothDeviceInfo;
    public String boardPlatform;
    public long bufferDuration;
    public long calculateManualPauseDuration;
    public int cid;
    public int clickPauseCnt;
    public long clickToFirstFrameDuration;
    public int collectAfterStatus;
    public int collectBeforeStatus;
    public int collectType;
    public long commentMaximizeDuration;
    public long commentPauseDuration;
    public boolean commentStatusAfterPlay;
    public boolean commentStatusBeforePlay;
    public long commentStayDuration;
    public String contentParams;
    public long detailPlayedDuration;
    public String dnsProviderName;
    public String dnsResolveHost;
    public String dnsResolvedIp;
    public String dnsResolvedUrl;
    public String dnsResolverName;
    public boolean downloaded;
    public long duration;
    public int enterPlayerAction;
    public long enterTime;
    public int entryAuthorProfileCnt;
    public String expParams;
    public int fastPlayType;
    public long followPlayedDuration;
    public boolean followStatusAfterPlay;
    public boolean followStatusBeforePlay;
    public long fullscreenDuration;
    public int fullscreenStayCount;
    public String gradeLevel;
    public boolean hasUsedEarphone;
    public long hiddenCommentCnt;
    public long hiddenCommentStayDuration;
    public long homeAutoPlayDuration;
    public long homeAutoPlayMaxDuration;
    public String interStExParams;
    public StidContainerProto$StidContainer interStidContainer;
    public StidContainerProto$StidContainer internalStidContainer;
    public String internalStidContainerJson;
    public boolean isAtFriendInComment;
    public boolean isBackwardPlay;
    public boolean isBlackScreen;
    public boolean isCharging;
    public boolean isClickAddBlacklist;
    public boolean isClickDownloadPhoto;
    public boolean isClickNegativePhoto;
    public boolean isClickTakeSameFrame;
    public boolean isClickTakeSameStyle;
    public boolean isCopyComment;
    public boolean isEnlargePlay;
    public boolean isFastForwardPlay;
    public boolean isHorizontalScreenPlay;
    public boolean isLowPowerMode;
    public boolean isStayCommentAreaEndPlay;
    public String kwaiSignature;
    public int lac;
    public int leaveAction;
    public int leavePlayStatus;
    public long leaveTime;
    public boolean likeStatusAfterPlay;
    public boolean likeStatusBeforePlay;
    public long manualPauseDuration;
    public int mcc;
    public int mediaType;
    public int mnc;
    public long musicStationBackgroundCount;
    public long musicStationBackgroundDuration;
    public long musicStationBackgroundPlayDuration;
    public long musicStationSourceType;
    public long onHookDuration;
    public long otherPauseDuration;
    public long photoId;
    public String photoSearchParams;
    public int playPosture;
    public String playSessionId;
    public int playSoundVolume;
    public String playUrl;
    public String playUrlIp;
    public int playUrlIpSource;
    public int playVideoType;
    public long playedDuration;
    public int playedLoopCount;
    public String playerType;
    public String playingStyle;
    public long popupWindowPlayedDuration;
    public long prefetchSize;
    public long prepareDuration;
    public String qosInfo;
    public ClientEvent$UrlPackage referUrlPackage;
    public int rssi;
    public String sPhotoId;
    public String searchSessionId;
    public String sessionUuid;
    public long smallWindowPlayDuration;
    public String socName;
    public boolean specialLikeStatusAfterPlay;
    public boolean specialLikeStatusBeforePlay;
    public int stalledCount;
    public long stayAuthorProfileDuration;
    public int subtype;
    public String summary;
    public ClientEvent$UrlPackage urlPackage;
    public String videoApplicationInfoJson;
    public int videoBitrate;
    public int videoDownloadSpeed;
    public String videoProfile;
    public String videoQosJson;
    public int videoType;
    public String xKsCache;
    public static ClientStat$VideoStatEvent[] _emptyArray;

    public void ClientStat$VideoStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$VideoStatEvent[] emptyArray(){
       if (ClientStat$VideoStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$VideoStatEvent._emptyArray == null) {
             ClientStat$VideoStatEvent[] videoStatEve = new ClientStat$VideoStatEvent[0];
             ClientStat$VideoStatEvent._emptyArray = videoStatEve;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$VideoStatEvent._emptyArray;
    }
    public static ClientStat$VideoStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$VideoStatEvent().mergeFrom(p0);
    }
    public static ClientStat$VideoStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$VideoStatEvent(), p0);
    }
    public ClientStat$VideoStatEvent clear(){
       this.duration = 0;
       this.playedDuration = 0;
       this.downloaded = false;
       this.prepareDuration = 0;
       this.enterTime = 0;
       this.leaveTime = 0;
       this.bufferDuration = 0;
       this.commentPauseDuration = 0;
       this.otherPauseDuration = 0;
       this.videoType = 0;
       this.playVideoType = 0;
       this.stalledCount = 0;
       this.photoId = 0;
       this.dnsResolvedUrl = "";
       this.dnsProviderName = "";
       this.dnsResolveHost = "";
       this.dnsResolvedIp = "";
       this.dnsResolverName = "";
       this.playUrl = "";
       this.leaveAction = 0;
       this.prefetchSize = 0;
       this.averageFps = 0;
       this.commentStayDuration = 0;
       this.qosInfo = "";
       this.playUrlIp = "";
       this.playUrlIpSource = 0;
       this.mediaType = 0;
       this.sPhotoId = "";
       this.urlPackage = null;
       this.referUrlPackage = null;
       this.popupWindowPlayedDuration = 0;
       this.homeAutoPlayDuration = 0;
       this.homeAutoPlayMaxDuration = 0;
       this.bluetoothDeviceInfo = "";
       this.videoQosJson = "";
       this.playedLoopCount = 0;
       this.clickToFirstFrameDuration = 0;
       this.rssi = 0;
       this.mcc = 0;
       this.mnc = 0;
       this.lac = 0;
       this.cid = 0;
       this.videoProfile = "";
       this.videoBitrate = 0;
       this.videoDownloadSpeed = 0;
       this.enterPlayerAction = 0;
       this.kwaiSignature = "";
       this.bizType = "";
       this.beginPlayTime = 0;
       this.hasUsedEarphone = false;
       this.xKsCache = "";
       this.fullscreenDuration = 0;
       this.fullscreenStayCount = 0;
       this.manualPauseDuration = 0;
       this.calculateManualPauseDuration = 0;
       this.musicStationSourceType = 0;
       this.summary = "";
       this.followPlayedDuration = 0;
       this.detailPlayedDuration = 0;
       this.boardPlatform = "";
       this.contentParams = "";
       this.musicStationBackgroundDuration = 0;
       this.musicStationBackgroundCount = 0;
       this.subtype = 0;
       this.musicStationBackgroundPlayDuration = 0;
       this.searchSessionId = "";
       this.leavePlayStatus = 0;
       this.playPosture = 0;
       this.playSoundVolume = 0;
       this.entryAuthorProfileCnt = 0;
       this.stayAuthorProfileDuration = 0;
       this.isHorizontalScreenPlay = false;
       this.isEnlargePlay = false;
       this.fastPlayType = 0;
       this.clickPauseCnt = 0;
       this.followStatusBeforePlay = false;
       this.followStatusAfterPlay = false;
       this.specialLikeStatusBeforePlay = false;
       this.specialLikeStatusAfterPlay = false;
       this.likeStatusBeforePlay = false;
       this.likeStatusAfterPlay = false;
       this.isAtFriendInComment = false;
       this.isCopyComment = false;
       this.isClickAddBlacklist = false;
       this.isClickNegativePhoto = false;
       this.isClickTakeSameFrame = false;
       this.isClickTakeSameStyle = false;
       this.collectType = 0;
       this.isClickDownloadPhoto = false;
       this.isStayCommentAreaEndPlay = false;
       this.playSessionId = "";
       this.isFastForwardPlay = false;
       this.isBackwardPlay = false;
       this.collectBeforeStatus = 0;
       this.collectAfterStatus = 0;
       this.photoSearchParams = "";
       this.commentMaximizeDuration = 0;
       this.hiddenCommentStayDuration = 0;
       this.sessionUuid = "";
       this.commentStatusBeforePlay = false;
       this.commentStatusAfterPlay = false;
       this.hiddenCommentCnt = 0;
       this.isBlackScreen = false;
       this.videoApplicationInfoJson = "";
       this.socName = "";
       this.expParams = "";
       this.backgroundPlayDuration = 0;
       this.batteryLevel = 0;
       this.batteryTemperature = 0;
       this.isCharging = false;
       this.isLowPowerMode = false;
       this.atlasParams = "";
       this.playingStyle = "";
       this.playerType = "";
       this.internalStidContainer = null;
       this.internalStidContainerJson = "";
       this.interStidContainer = null;
       this.smallWindowPlayDuration = 0;
       this.gradeLevel = "";
       this.interStExParams = "";
       this.onHookDuration = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$VideoStatEvent tduration = this.duration;
       int i1 = 0;
       if (tduration - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tduration);
       }
       tduration = this.playedDuration;
       if (tduration - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tduration);
       }
       tduration = this.downloaded;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tduration);
       }
       tduration = this.prepareDuration;
       if (tduration - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tduration);
       }
       tduration = this.enterTime;
       if (tduration - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tduration);
       }
       tduration = this.leaveTime;
       if (tduration - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tduration);
       }
       tduration = this.bufferDuration;
       if (tduration - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tduration);
       }
       tduration = this.commentPauseDuration;
       if (tduration - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tduration);
       }
       tduration = this.otherPauseDuration;
       if (tduration - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, tduration);
       }
       tduration = this.videoType;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(10, tduration);
       }
       tduration = this.playVideoType;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(11, tduration);
       }
       tduration = this.stalledCount;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(12, tduration);
       }
       tduration = this.photoId;
       if (tduration - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(13, tduration);
       }
       String str = "";
       if (!(this.dnsResolvedUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.dnsResolvedUrl);
       }
       if (!(this.dnsProviderName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(15, this.dnsProviderName);
       }
       if (!(this.dnsResolveHost).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(16, this.dnsResolveHost);
       }
       if (!(this.dnsResolvedIp).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(17, this.dnsResolvedIp);
       }
       if (!(this.dnsResolverName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(18, this.dnsResolverName);
       }
       if (!(this.playUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(19, this.playUrl);
       }
       tduration = this.leaveAction;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(20, tduration);
       }
       ClientStat$VideoStatEvent tprefetchSiz = this.prefetchSize;
       if (tprefetchSiz - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(21, tprefetchSiz);
       }
       if (Double.doubleToLongBits(this.averageFps) - Double.doubleToLongBits(0)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(22, this.averageFps);
       }
       tprefetchSiz = this.commentStayDuration;
       if (tprefetchSiz - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(23, tprefetchSiz);
       }
       if (!(this.qosInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(24, this.qosInfo);
       }
       if (!(this.playUrlIp).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(25, this.playUrlIp);
       }
       tduration = this.playUrlIpSource;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(26, tduration);
       }
       tduration = this.mediaType;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(27, tduration);
       }
       if (!(this.sPhotoId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(28, this.sPhotoId);
       }
       tduration = this.urlPackage;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(29, tduration);
       }
       tduration = this.referUrlPackage;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(30, tduration);
       }
       tprefetchSiz = this.popupWindowPlayedDuration;
       if (tprefetchSiz - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(31, tprefetchSiz);
       }
       tprefetchSiz = this.homeAutoPlayDuration;
       if (tprefetchSiz - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(32, tprefetchSiz);
       }
       tprefetchSiz = this.homeAutoPlayMaxDuration;
       if (tprefetchSiz - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(33, tprefetchSiz);
       }
       if (!(this.bluetoothDeviceInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(34, this.bluetoothDeviceInfo);
       }
       if (!(this.videoQosJson).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(35, this.videoQosJson);
       }
       tduration = this.playedLoopCount;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(36, tduration);
       }
       tprefetchSiz = this.clickToFirstFrameDuration;
       if (tprefetchSiz - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(37, tprefetchSiz);
       }
       tduration = this.rssi;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(38, tduration);
       }
       tduration = this.mcc;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(39, tduration);
       }
       tduration = this.mnc;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(40, tduration);
       }
       tduration = this.lac;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(41, tduration);
       }
       tduration = this.cid;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(42, tduration);
       }
       if (!(this.videoProfile).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(43, this.videoProfile);
       }
       tduration = this.videoBitrate;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(44, tduration);
       }
       tduration = this.videoDownloadSpeed;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(45, tduration);
       }
       tduration = this.enterPlayerAction;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(46, tduration);
       }
       if (!(this.kwaiSignature).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(47, this.kwaiSignature);
       }
       if (!(this.bizType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(48, this.bizType);
       }
       tprefetchSiz = this.beginPlayTime;
       if (tprefetchSiz - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(49, tprefetchSiz);
       }
       tduration = this.hasUsedEarphone;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(50, tduration);
       }
       if (!(this.xKsCache).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(51, this.xKsCache);
       }
       tprefetchSiz = this.fullscreenDuration;
       if (tprefetchSiz - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(52, tprefetchSiz);
       }
       tduration = this.fullscreenStayCount;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(53, tduration);
       }
       tprefetchSiz = this.manualPauseDuration;
       if (tprefetchSiz - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(54, tprefetchSiz);
       }
       tprefetchSiz = this.calculateManualPauseDuration;
       if (tprefetchSiz - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(55, tprefetchSiz);
       }
       tprefetchSiz = this.musicStationSourceType;
       if (tprefetchSiz - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(56, tprefetchSiz);
       }
       if (!(this.summary).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(57, this.summary);
       }
       tprefetchSiz = this.followPlayedDuration;
       if (tprefetchSiz - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(58, tprefetchSiz);
       }
       tprefetchSiz = this.detailPlayedDuration;
       if (tprefetchSiz - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(59, tprefetchSiz);
       }
       if (!(this.boardPlatform).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(60, this.boardPlatform);
       }
       if (!(this.contentParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(61, this.contentParams);
       }
       tprefetchSiz = this.musicStationBackgroundDuration;
       if (tprefetchSiz - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(62, tprefetchSiz);
       }
       tprefetchSiz = this.musicStationBackgroundCount;
       if (tprefetchSiz - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(63, tprefetchSiz);
       }
       tduration = this.subtype;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(64, tduration);
       }
       tprefetchSiz = this.musicStationBackgroundPlayDuration;
       if (tprefetchSiz - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(65, tprefetchSiz);
       }
       if (!(this.searchSessionId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(66, this.searchSessionId);
       }
       tduration = this.leavePlayStatus;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(67, tduration);
       }
       tduration = this.playPosture;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(68, tduration);
       }
       tduration = this.playSoundVolume;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(69, tduration);
       }
       tduration = this.entryAuthorProfileCnt;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(70, tduration);
       }
       tprefetchSiz = this.stayAuthorProfileDuration;
       if (tprefetchSiz - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(71, tprefetchSiz);
       }
       tduration = this.isHorizontalScreenPlay;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(72, tduration);
       }
       tduration = this.isEnlargePlay;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(73, tduration);
       }
       tduration = this.fastPlayType;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(74, tduration);
       }
       tduration = this.clickPauseCnt;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(75, tduration);
       }
       tduration = this.followStatusBeforePlay;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(76, tduration);
       }
       tduration = this.followStatusAfterPlay;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(77, tduration);
       }
       tduration = this.specialLikeStatusBeforePlay;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(78, tduration);
       }
       tduration = this.specialLikeStatusAfterPlay;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(79, tduration);
       }
       tduration = this.likeStatusBeforePlay;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(80, tduration);
       }
       tduration = this.likeStatusAfterPlay;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(81, tduration);
       }
       tduration = this.isAtFriendInComment;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(82, tduration);
       }
       tduration = this.isCopyComment;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(83, tduration);
       }
       tduration = this.isClickAddBlacklist;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(84, tduration);
       }
       tduration = this.isClickNegativePhoto;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(85, tduration);
       }
       tduration = this.isClickTakeSameFrame;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(86, tduration);
       }
       tduration = this.isClickTakeSameStyle;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(87, tduration);
       }
       tduration = this.collectType;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(88, tduration);
       }
       tduration = this.isClickDownloadPhoto;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(89, tduration);
       }
       tduration = this.isStayCommentAreaEndPlay;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(90, tduration);
       }
       if (!(this.playSessionId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(91, this.playSessionId);
       }
       tduration = this.isFastForwardPlay;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(92, tduration);
       }
       tduration = this.isBackwardPlay;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(93, tduration);
       }
       tduration = this.collectBeforeStatus;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(94, tduration);
       }
       tduration = this.collectAfterStatus;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(95, tduration);
       }
       if (!(this.photoSearchParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(96, this.photoSearchParams);
       }
       tprefetchSiz = this.commentMaximizeDuration;
       if (tprefetchSiz - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(97, tprefetchSiz);
       }
       tprefetchSiz = this.hiddenCommentStayDuration;
       if (tprefetchSiz - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(98, tprefetchSiz);
       }
       if (!(this.sessionUuid).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(99, this.sessionUuid);
       }
       tduration = this.commentStatusBeforePlay;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(100, tduration);
       }
       tduration = this.commentStatusAfterPlay;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(101, tduration);
       }
       tprefetchSiz = this.hiddenCommentCnt;
       if (tprefetchSiz - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(102, tprefetchSiz);
       }
       tduration = this.isBlackScreen;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(103, tduration);
       }
       if (!(this.videoApplicationInfoJson).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(104, this.videoApplicationInfoJson);
       }
       if (!(this.socName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(105, this.socName);
       }
       if (!(this.expParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(106, this.expParams);
       }
       tprefetchSiz = this.backgroundPlayDuration;
       if (tprefetchSiz - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(107, tprefetchSiz);
       }
       tduration = this.batteryLevel;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(108, tduration);
       }
       tduration = this.batteryTemperature;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(109, tduration);
       }
       tduration = this.isCharging;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(110, tduration);
       }
       tduration = this.isLowPowerMode;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(111, tduration);
       }
       if (!(this.atlasParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(112, this.atlasParams);
       }
       if (!(this.playingStyle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(113, this.playingStyle);
       }
       if (!(this.playerType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(114, this.playerType);
       }
       tduration = this.internalStidContainer;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(115, tduration);
       }
       if (!(this.internalStidContainerJson).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(116, this.internalStidContainerJson);
       }
       tduration = this.interStidContainer;
       if (tduration != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(117, tduration);
       }
       tprefetchSiz = this.smallWindowPlayDuration;
       if (tprefetchSiz - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(118, tprefetchSiz);
       }
       if (!(this.gradeLevel).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(119, this.gradeLevel);
       }
       if (!(this.interStExParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(120, this.interStExParams);
       }
       tduration = this.onHookDuration;
       if (tduration - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(121, tduration);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$VideoStatEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          int i1 = 4;
          switch (i){
              case 0:
                return this;
              case 8:
                this.duration = p0.readUInt64();
                break;
              case 16:
                this.playedDuration = p0.readUInt64();
                break;
              case 24:
                this.downloaded = p0.readBool();
                break;
              case 32:
                this.prepareDuration = p0.readUInt64();
                break;
              case '(':
                this.enterTime = p0.readUInt64();
                break;
              case '0':
                this.leaveTime = p0.readUInt64();
                break;
              case '8':
                this.bufferDuration = p0.readUInt64();
                break;
              case '@':
                this.commentPauseDuration = p0.readUInt64();
                break;
              case 'H':
                this.otherPauseDuration = p0.readUInt64();
                break;
              case 'P':
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.videoType = i;
                }
                break;
              case 'X':
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.playVideoType = i;
                }
                break;
              case '`':
                this.stalledCount = p0.readUInt32();
                break;
              case 'h':
                this.photoId = p0.readUInt64();
                break;
              case 'r':
                this.dnsResolvedUrl = p0.readString();
                break;
              case 'z':
                this.dnsProviderName = p0.readString();
                break;
              case 130:
                this.dnsResolveHost = p0.readString();
                break;
              case 138:
                this.dnsResolvedIp = p0.readString();
                break;
              case 146:
                this.dnsResolverName = p0.readString();
                break;
              case 154:
                this.playUrl = p0.readString();
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
                    case 10:
                    case 11:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 1:
                      break;
                    default:
                }
                this.leaveAction = i;
                break;
              case 168:
                this.prefetchSize = p0.readUInt64();
                break;
              case 177:
                this.averageFps = p0.readDouble();
                break;
              case 184:
                this.commentStayDuration = p0.readUInt64();
                break;
              case 194:
                this.qosInfo = p0.readString();
                break;
              case 202:
                this.playUrlIp = p0.readString();
                break;
              case 208:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.playUrlIpSource = i;
                }
                break;
              case 216:
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
                    case 1:
                      break;
                    default:
                }
                this.mediaType = i;
                break;
              case 226:
                this.sPhotoId = p0.readString();
                break;
              case 234:
                if (this.urlPackage == null) {
                   this.urlPackage = new ClientEvent$UrlPackage();
                }
                p0.readMessage(this.urlPackage);
                break;
              case 242:
                if (this.referUrlPackage == null) {
                   this.referUrlPackage = new ClientEvent$UrlPackage();
                }
                p0.readMessage(this.referUrlPackage);
                break;
              case 248:
                this.popupWindowPlayedDuration = p0.readUInt64();
                break;
              case 256:
                this.homeAutoPlayDuration = p0.readUInt64();
                break;
              case 264:
                this.homeAutoPlayMaxDuration = p0.readUInt64();
                break;
              case 274:
                this.bluetoothDeviceInfo = p0.readString();
                break;
              case 282:
                this.videoQosJson = p0.readString();
                break;
              case 288:
                this.playedLoopCount = p0.readUInt32();
                break;
              case 296:
                this.clickToFirstFrameDuration = p0.readUInt64();
                break;
              case 304:
                this.rssi = p0.readUInt32();
                break;
              case 312:
                this.mcc = p0.readUInt32();
                break;
              case 320:
                this.mnc = p0.readUInt32();
                break;
              case 328:
                this.lac = p0.readUInt32();
                break;
              case 336:
                this.cid = p0.readUInt32();
                break;
              case 346:
                this.videoProfile = p0.readString();
                break;
              case 352:
                this.videoBitrate = p0.readUInt32();
                break;
              case 360:
                this.videoDownloadSpeed = p0.readUInt32();
                break;
              case 368:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && (i != i1 && i != 5))))) {
                   continue ;
                }else {
                   this.enterPlayerAction = i;
                }
                break;
              case 378:
                this.kwaiSignature = p0.readString();
                break;
              case 386:
                this.bizType = p0.readString();
                break;
              case 392:
                this.beginPlayTime = p0.readUInt64();
                break;
              case 400:
                this.hasUsedEarphone = p0.readBool();
                break;
              case 410:
                this.xKsCache = p0.readString();
                break;
              case 416:
                this.fullscreenDuration = p0.readUInt64();
                break;
              case 424:
                this.fullscreenStayCount = p0.readUInt32();
                break;
              case 432:
                this.manualPauseDuration = p0.readUInt64();
                break;
              case 440:
                this.calculateManualPauseDuration = p0.readUInt64();
                break;
              case 448:
                this.musicStationSourceType = p0.readUInt64();
                break;
              case 458:
                this.summary = p0.readString();
                break;
              case 464:
                this.followPlayedDuration = p0.readUInt64();
                break;
              case 472:
                this.detailPlayedDuration = p0.readUInt64();
                break;
              case 482:
                this.boardPlatform = p0.readString();
                break;
              case 490:
                this.contentParams = p0.readString();
                break;
              case 496:
                this.musicStationBackgroundDuration = p0.readUInt64();
                break;
              case 504:
                this.musicStationBackgroundCount = p0.readUInt64();
                break;
              case 512:
                i = p0.readInt32();
                if (i && i != 1) {
                   continue ;
                }else {
                   this.subtype = i;
                }
                break;
              case 520:
                this.musicStationBackgroundPlayDuration = p0.readUInt64();
                break;
              case 530:
                this.searchSessionId = p0.readString();
                break;
              case 536:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.leavePlayStatus = i;
                }
                break;
              case 544:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && i != i1)))) {
                   continue ;
                }else {
                   this.playPosture = i;
                }
                break;
              case 552:
                this.playSoundVolume = p0.readUInt32();
                break;
              case 560:
                this.entryAuthorProfileCnt = p0.readUInt32();
                break;
              case 568:
                this.stayAuthorProfileDuration = p0.readUInt64();
                break;
              case 576:
                this.isHorizontalScreenPlay = p0.readBool();
                break;
              case 584:
                this.isEnlargePlay = p0.readBool();
                break;
              case 592:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.fastPlayType = i;
                }
                break;
              case 600:
                this.clickPauseCnt = p0.readUInt32();
                break;
              case 608:
                this.followStatusBeforePlay = p0.readBool();
                break;
              case 616:
                this.followStatusAfterPlay = p0.readBool();
                break;
              case 624:
                this.specialLikeStatusBeforePlay = p0.readBool();
                break;
              case 632:
                this.specialLikeStatusAfterPlay = p0.readBool();
                break;
              case 640:
                this.likeStatusBeforePlay = p0.readBool();
                break;
              case 648:
                this.likeStatusAfterPlay = p0.readBool();
                break;
              case 656:
                this.isAtFriendInComment = p0.readBool();
                break;
              case 664:
                this.isCopyComment = p0.readBool();
                break;
              case 672:
                this.isClickAddBlacklist = p0.readBool();
                break;
              case 680:
                this.isClickNegativePhoto = p0.readBool();
                break;
              case 688:
                this.isClickTakeSameFrame = p0.readBool();
                break;
              case 696:
                this.isClickTakeSameStyle = p0.readBool();
                break;
              case 704:
                i = p0.readInt32();
                if (i && i != 1) {
                   continue ;
                }else {
                   this.collectType = i;
                }
                break;
              case 712:
                this.isClickDownloadPhoto = p0.readBool();
                break;
              case 720:
                this.isStayCommentAreaEndPlay = p0.readBool();
                break;
              case 730:
                this.playSessionId = p0.readString();
                break;
              case 736:
                this.isFastForwardPlay = p0.readBool();
                break;
              case 744:
                this.isBackwardPlay = p0.readBool();
                break;
              case 752:
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.collectBeforeStatus = i;
                }
                break;
              case 760:
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.collectAfterStatus = i;
                }
                break;
              case 770:
                this.photoSearchParams = p0.readString();
                break;
              case 776:
                this.commentMaximizeDuration = p0.readUInt64();
                break;
              case 784:
                this.hiddenCommentStayDuration = p0.readUInt64();
                break;
              case 794:
                this.sessionUuid = p0.readString();
                break;
              case 800:
                this.commentStatusBeforePlay = p0.readBool();
                break;
              case 808:
                this.commentStatusAfterPlay = p0.readBool();
                break;
              case 816:
                this.hiddenCommentCnt = p0.readUInt64();
                break;
              case 824:
                this.isBlackScreen = p0.readBool();
                break;
              case 834:
                this.videoApplicationInfoJson = p0.readString();
                break;
              case 842:
                this.socName = p0.readString();
                break;
              case 850:
                this.expParams = p0.readString();
                break;
              case 856:
                this.backgroundPlayDuration = p0.readUInt64();
                break;
              case 864:
                this.batteryLevel = p0.readInt32();
                break;
              case 872:
                this.batteryTemperature = p0.readInt32();
                break;
              case 880:
                this.isCharging = p0.readBool();
                break;
              case 888:
                this.isLowPowerMode = p0.readBool();
                break;
              case 898:
                this.atlasParams = p0.readString();
                break;
              case 906:
                this.playingStyle = p0.readString();
                break;
              case 914:
                this.playerType = p0.readString();
                break;
              case 922:
                if (this.internalStidContainer == null) {
                   this.internalStidContainer = new StidContainerProto$StidContainer();
                }
                p0.readMessage(this.internalStidContainer);
                break;
              case 930:
                this.internalStidContainerJson = p0.readString();
                break;
              case 938:
                if (this.interStidContainer == null) {
                   this.interStidContainer = new StidContainerProto$StidContainer();
                }
                p0.readMessage(this.interStidContainer);
                break;
              case 944:
                this.smallWindowPlayDuration = p0.readUInt64();
                break;
              case 954:
                this.gradeLevel = p0.readString();
                break;
              case 962:
                this.interStExParams = p0.readString();
                break;
              case 968:
                this.onHookDuration = p0.readUInt64();
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
       ClientStat$VideoStatEvent tduration = this.duration;
       int i = 0;
       if (tduration - i) {
          p0.writeUInt64(1, tduration);
       }
       tduration = this.playedDuration;
       if (tduration - i) {
          p0.writeUInt64(2, tduration);
       }
       tduration = this.downloaded;
       if (tduration != null) {
          p0.writeBool(3, tduration);
       }
       tduration = this.prepareDuration;
       if (tduration - i) {
          p0.writeUInt64(4, tduration);
       }
       tduration = this.enterTime;
       if (tduration - i) {
          p0.writeUInt64(5, tduration);
       }
       tduration = this.leaveTime;
       if (tduration - i) {
          p0.writeUInt64(6, tduration);
       }
       tduration = this.bufferDuration;
       if (tduration - i) {
          p0.writeUInt64(7, tduration);
       }
       tduration = this.commentPauseDuration;
       if (tduration - i) {
          p0.writeUInt64(8, tduration);
       }
       tduration = this.otherPauseDuration;
       if (tduration - i) {
          p0.writeUInt64(9, tduration);
       }
       tduration = this.videoType;
       if (tduration != null) {
          p0.writeInt32(10, tduration);
       }
       tduration = this.playVideoType;
       if (tduration != null) {
          p0.writeInt32(11, tduration);
       }
       tduration = this.stalledCount;
       if (tduration != null) {
          p0.writeUInt32(12, tduration);
       }
       tduration = this.photoId;
       if (tduration - i) {
          p0.writeUInt64(13, tduration);
       }
       String str = "";
       if (!(this.dnsResolvedUrl).equals(str)) {
          p0.writeString(14, this.dnsResolvedUrl);
       }
       if (!(this.dnsProviderName).equals(str)) {
          p0.writeString(15, this.dnsProviderName);
       }
       if (!(this.dnsResolveHost).equals(str)) {
          p0.writeString(16, this.dnsResolveHost);
       }
       if (!(this.dnsResolvedIp).equals(str)) {
          p0.writeString(17, this.dnsResolvedIp);
       }
       if (!(this.dnsResolverName).equals(str)) {
          p0.writeString(18, this.dnsResolverName);
       }
       if (!(this.playUrl).equals(str)) {
          p0.writeString(19, this.playUrl);
       }
       tduration = this.leaveAction;
       if (tduration != null) {
          p0.writeInt32(20, tduration);
       }
       ClientStat$VideoStatEvent tprefetchSiz = this.prefetchSize;
       if (tprefetchSiz - i) {
          p0.writeUInt64(21, tprefetchSiz);
       }
       if (Double.doubleToLongBits(this.averageFps) - Double.doubleToLongBits(0)) {
          p0.writeDouble(22, this.averageFps);
       }
       tprefetchSiz = this.commentStayDuration;
       if (tprefetchSiz - i) {
          p0.writeUInt64(23, tprefetchSiz);
       }
       if (!(this.qosInfo).equals(str)) {
          p0.writeString(24, this.qosInfo);
       }
       if (!(this.playUrlIp).equals(str)) {
          p0.writeString(25, this.playUrlIp);
       }
       tduration = this.playUrlIpSource;
       if (tduration != null) {
          p0.writeInt32(26, tduration);
       }
       tduration = this.mediaType;
       if (tduration != null) {
          p0.writeInt32(27, tduration);
       }
       if (!(this.sPhotoId).equals(str)) {
          p0.writeString(28, this.sPhotoId);
       }
       tduration = this.urlPackage;
       if (tduration != null) {
          p0.writeMessage(29, tduration);
       }
       tduration = this.referUrlPackage;
       if (tduration != null) {
          p0.writeMessage(30, tduration);
       }
       tprefetchSiz = this.popupWindowPlayedDuration;
       if (tprefetchSiz - i) {
          p0.writeUInt64(31, tprefetchSiz);
       }
       tprefetchSiz = this.homeAutoPlayDuration;
       if (tprefetchSiz - i) {
          p0.writeUInt64(32, tprefetchSiz);
       }
       tprefetchSiz = this.homeAutoPlayMaxDuration;
       if (tprefetchSiz - i) {
          p0.writeUInt64(33, tprefetchSiz);
       }
       if (!(this.bluetoothDeviceInfo).equals(str)) {
          p0.writeString(34, this.bluetoothDeviceInfo);
       }
       if (!(this.videoQosJson).equals(str)) {
          p0.writeString(35, this.videoQosJson);
       }
       tduration = this.playedLoopCount;
       if (tduration != null) {
          p0.writeUInt32(36, tduration);
       }
       tprefetchSiz = this.clickToFirstFrameDuration;
       if (tprefetchSiz - i) {
          p0.writeUInt64(37, tprefetchSiz);
       }
       tduration = this.rssi;
       if (tduration != null) {
          p0.writeUInt32(38, tduration);
       }
       tduration = this.mcc;
       if (tduration != null) {
          p0.writeUInt32(39, tduration);
       }
       tduration = this.mnc;
       if (tduration != null) {
          p0.writeUInt32(40, tduration);
       }
       tduration = this.lac;
       if (tduration != null) {
          p0.writeUInt32(41, tduration);
       }
       tduration = this.cid;
       if (tduration != null) {
          p0.writeUInt32(42, tduration);
       }
       if (!(this.videoProfile).equals(str)) {
          p0.writeString(43, this.videoProfile);
       }
       tduration = this.videoBitrate;
       if (tduration != null) {
          p0.writeUInt32(44, tduration);
       }
       tduration = this.videoDownloadSpeed;
       if (tduration != null) {
          p0.writeUInt32(45, tduration);
       }
       tduration = this.enterPlayerAction;
       if (tduration != null) {
          p0.writeInt32(46, tduration);
       }
       if (!(this.kwaiSignature).equals(str)) {
          p0.writeString(47, this.kwaiSignature);
       }
       if (!(this.bizType).equals(str)) {
          p0.writeString(48, this.bizType);
       }
       tprefetchSiz = this.beginPlayTime;
       if (tprefetchSiz - i) {
          p0.writeUInt64(49, tprefetchSiz);
       }
       tduration = this.hasUsedEarphone;
       if (tduration != null) {
          p0.writeBool(50, tduration);
       }
       if (!(this.xKsCache).equals(str)) {
          p0.writeString(51, this.xKsCache);
       }
       tprefetchSiz = this.fullscreenDuration;
       if (tprefetchSiz - i) {
          p0.writeUInt64(52, tprefetchSiz);
       }
       tduration = this.fullscreenStayCount;
       if (tduration != null) {
          p0.writeUInt32(53, tduration);
       }
       tprefetchSiz = this.manualPauseDuration;
       if (tprefetchSiz - i) {
          p0.writeUInt64(54, tprefetchSiz);
       }
       tprefetchSiz = this.calculateManualPauseDuration;
       if (tprefetchSiz - i) {
          p0.writeUInt64(55, tprefetchSiz);
       }
       tprefetchSiz = this.musicStationSourceType;
       if (tprefetchSiz - i) {
          p0.writeUInt64(56, tprefetchSiz);
       }
       if (!(this.summary).equals(str)) {
          p0.writeString(57, this.summary);
       }
       tprefetchSiz = this.followPlayedDuration;
       if (tprefetchSiz - i) {
          p0.writeUInt64(58, tprefetchSiz);
       }
       tprefetchSiz = this.detailPlayedDuration;
       if (tprefetchSiz - i) {
          p0.writeUInt64(59, tprefetchSiz);
       }
       if (!(this.boardPlatform).equals(str)) {
          p0.writeString(60, this.boardPlatform);
       }
       if (!(this.contentParams).equals(str)) {
          p0.writeString(61, this.contentParams);
       }
       tprefetchSiz = this.musicStationBackgroundDuration;
       if (tprefetchSiz - i) {
          p0.writeUInt64(62, tprefetchSiz);
       }
       tprefetchSiz = this.musicStationBackgroundCount;
       if (tprefetchSiz - i) {
          p0.writeUInt64(63, tprefetchSiz);
       }
       tduration = this.subtype;
       if (tduration != null) {
          p0.writeInt32(64, tduration);
       }
       tprefetchSiz = this.musicStationBackgroundPlayDuration;
       if (tprefetchSiz - i) {
          p0.writeUInt64(65, tprefetchSiz);
       }
       if (!(this.searchSessionId).equals(str)) {
          p0.writeString(66, this.searchSessionId);
       }
       tduration = this.leavePlayStatus;
       if (tduration != null) {
          p0.writeInt32(67, tduration);
       }
       tduration = this.playPosture;
       if (tduration != null) {
          p0.writeInt32(68, tduration);
       }
       tduration = this.playSoundVolume;
       if (tduration != null) {
          p0.writeUInt32(69, tduration);
       }
       tduration = this.entryAuthorProfileCnt;
       if (tduration != null) {
          p0.writeUInt32(70, tduration);
       }
       tprefetchSiz = this.stayAuthorProfileDuration;
       if (tprefetchSiz - i) {
          p0.writeUInt64(71, tprefetchSiz);
       }
       tduration = this.isHorizontalScreenPlay;
       if (tduration != null) {
          p0.writeBool(72, tduration);
       }
       tduration = this.isEnlargePlay;
       if (tduration != null) {
          p0.writeBool(73, tduration);
       }
       tduration = this.fastPlayType;
       if (tduration != null) {
          p0.writeInt32(74, tduration);
       }
       tduration = this.clickPauseCnt;
       if (tduration != null) {
          p0.writeUInt32(75, tduration);
       }
       tduration = this.followStatusBeforePlay;
       if (tduration != null) {
          p0.writeBool(76, tduration);
       }
       tduration = this.followStatusAfterPlay;
       if (tduration != null) {
          p0.writeBool(77, tduration);
       }
       tduration = this.specialLikeStatusBeforePlay;
       if (tduration != null) {
          p0.writeBool(78, tduration);
       }
       tduration = this.specialLikeStatusAfterPlay;
       if (tduration != null) {
          p0.writeBool(79, tduration);
       }
       tduration = this.likeStatusBeforePlay;
       if (tduration != null) {
          p0.writeBool(80, tduration);
       }
       tduration = this.likeStatusAfterPlay;
       if (tduration != null) {
          p0.writeBool(81, tduration);
       }
       tduration = this.isAtFriendInComment;
       if (tduration != null) {
          p0.writeBool(82, tduration);
       }
       tduration = this.isCopyComment;
       if (tduration != null) {
          p0.writeBool(83, tduration);
       }
       tduration = this.isClickAddBlacklist;
       if (tduration != null) {
          p0.writeBool(84, tduration);
       }
       tduration = this.isClickNegativePhoto;
       if (tduration != null) {
          p0.writeBool(85, tduration);
       }
       tduration = this.isClickTakeSameFrame;
       if (tduration != null) {
          p0.writeBool(86, tduration);
       }
       tduration = this.isClickTakeSameStyle;
       if (tduration != null) {
          p0.writeBool(87, tduration);
       }
       tduration = this.collectType;
       if (tduration != null) {
          p0.writeInt32(88, tduration);
       }
       tduration = this.isClickDownloadPhoto;
       if (tduration != null) {
          p0.writeBool(89, tduration);
       }
       tduration = this.isStayCommentAreaEndPlay;
       if (tduration != null) {
          p0.writeBool(90, tduration);
       }
       if (!(this.playSessionId).equals(str)) {
          p0.writeString(91, this.playSessionId);
       }
       tduration = this.isFastForwardPlay;
       if (tduration != null) {
          p0.writeBool(92, tduration);
       }
       tduration = this.isBackwardPlay;
       if (tduration != null) {
          p0.writeBool(93, tduration);
       }
       tduration = this.collectBeforeStatus;
       if (tduration != null) {
          p0.writeInt32(94, tduration);
       }
       tduration = this.collectAfterStatus;
       if (tduration != null) {
          p0.writeInt32(95, tduration);
       }
       if (!(this.photoSearchParams).equals(str)) {
          p0.writeString(96, this.photoSearchParams);
       }
       tprefetchSiz = this.commentMaximizeDuration;
       if (tprefetchSiz - i) {
          p0.writeUInt64(97, tprefetchSiz);
       }
       tprefetchSiz = this.hiddenCommentStayDuration;
       if (tprefetchSiz - i) {
          p0.writeUInt64(98, tprefetchSiz);
       }
       if (!(this.sessionUuid).equals(str)) {
          p0.writeString(99, this.sessionUuid);
       }
       tduration = this.commentStatusBeforePlay;
       if (tduration != null) {
          p0.writeBool(100, tduration);
       }
       tduration = this.commentStatusAfterPlay;
       if (tduration != null) {
          p0.writeBool(101, tduration);
       }
       tprefetchSiz = this.hiddenCommentCnt;
       if (tprefetchSiz - i) {
          p0.writeUInt64(102, tprefetchSiz);
       }
       tduration = this.isBlackScreen;
       if (tduration != null) {
          p0.writeBool(103, tduration);
       }
       if (!(this.videoApplicationInfoJson).equals(str)) {
          p0.writeString(104, this.videoApplicationInfoJson);
       }
       if (!(this.socName).equals(str)) {
          p0.writeString(105, this.socName);
       }
       if (!(this.expParams).equals(str)) {
          p0.writeString(106, this.expParams);
       }
       tprefetchSiz = this.backgroundPlayDuration;
       if (tprefetchSiz - i) {
          p0.writeUInt64(107, tprefetchSiz);
       }
       tduration = this.batteryLevel;
       if (tduration != null) {
          p0.writeInt32(108, tduration);
       }
       tduration = this.batteryTemperature;
       if (tduration != null) {
          p0.writeInt32(109, tduration);
       }
       tduration = this.isCharging;
       if (tduration != null) {
          p0.writeBool(110, tduration);
       }
       tduration = this.isLowPowerMode;
       if (tduration != null) {
          p0.writeBool(111, tduration);
       }
       if (!(this.atlasParams).equals(str)) {
          p0.writeString(112, this.atlasParams);
       }
       if (!(this.playingStyle).equals(str)) {
          p0.writeString(113, this.playingStyle);
       }
       if (!(this.playerType).equals(str)) {
          p0.writeString(114, this.playerType);
       }
       tduration = this.internalStidContainer;
       if (tduration != null) {
          p0.writeMessage(115, tduration);
       }
       if (!(this.internalStidContainerJson).equals(str)) {
          p0.writeString(116, this.internalStidContainerJson);
       }
       tduration = this.interStidContainer;
       if (tduration != null) {
          p0.writeMessage(117, tduration);
       }
       tprefetchSiz = this.smallWindowPlayDuration;
       if (tprefetchSiz - i) {
          p0.writeUInt64(118, tprefetchSiz);
       }
       if (!(this.gradeLevel).equals(str)) {
          p0.writeString(119, this.gradeLevel);
       }
       if (!(this.interStExParams).equals(str)) {
          p0.writeString(120, this.interStExParams);
       }
       tduration = this.onHookDuration;
       if (tduration - i) {
          p0.writeUInt64(121, tduration);
       }
       super.writeTo(p0);
       return;
    }
}
