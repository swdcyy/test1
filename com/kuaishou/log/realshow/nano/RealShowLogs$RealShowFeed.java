package com.kuaishou.log.realshow.nano.RealShowLogs$RealShowFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.lang.Double;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidPackage;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidContainer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTransList;

public final class RealShowLogs$RealShowFeed extends MessageNano	// class@0014b2
{
    public String actionLogId;
    public String appStatus;
    public long authorId;
    public int browseType;
    public String caidVersion;
    public long clientIncrementId;
    public String clientPage;
    public long clientTimestamp;
    public StidContainerProto$StidPackage commonStid;
    public String containerId;
    public long containerItemIndex;
    public long coverDecodeMs;
    public long coverDownloadCostMs;
    public String coverFormat;
    public String coverResolution;
    public long coverSize;
    public String currentCaid;
    public double distance;
    public int enterAction;
    public String entryPageSource;
    public String expParams;
    public String expTag;
    public ClientEvent$ExpTagTransList expTagList;
    public String feedId;
    public int feedType;
    public String gameId;
    public String grantBrowseType;
    public String interStExParams;
    public StidContainerProto$StidContainer interStidContainer;
    public String interactiveModel;
    public boolean isAppPrelaunch;
    public boolean isAppPrelaunching;
    public boolean isBackground;
    public boolean isFollow;
    public boolean isNormalLive;
    public boolean isSlide;
    public String ksOrderId;
    public String lastCaid;
    public String lastCaidVersion;
    public String liveStreamId;
    public int liveStyle;
    public String momentId;
    public String pageCode;
    public long photoId;
    public String reason;
    public String reportContext;
    public String sAuthorId;
    public String sPhotoId;
    public String serverExpTag;
    public long serverLiveStreamId;
    public String sessionId;
    public long showIndexPlusOne;
    public int showPosition;
    public int subtype;
    public String topPage;
    public String unionLiveAuthor;
    public String unionLiveId;
    public boolean useSmartCover;
    public long videoDurationInMs;
    public static RealShowLogs$RealShowFeed[] _emptyArray;

    public void RealShowLogs$RealShowFeed(){
       super();
       this.clear();
    }
    public static RealShowLogs$RealShowFeed[] emptyArray(){
       if (RealShowLogs$RealShowFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (RealShowLogs$RealShowFeed._emptyArray == null) {
             RealShowLogs$RealShowFeed[] realShowFeed = new RealShowLogs$RealShowFeed[0];
             RealShowLogs$RealShowFeed._emptyArray = realShowFeed;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return RealShowLogs$RealShowFeed._emptyArray;
    }
    public static RealShowLogs$RealShowFeed parseFrom(CodedInputByteBufferNano p0){
       return new RealShowLogs$RealShowFeed().mergeFrom(p0);
    }
    public static RealShowLogs$RealShowFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new RealShowLogs$RealShowFeed(), p0);
    }
    public RealShowLogs$RealShowFeed clear(){
       this.feedType = 0;
       this.authorId = 0;
       this.photoId = 0;
       this.liveStreamId = "";
       this.expTag = "";
       this.showIndexPlusOne = 0;
       this.showPosition = 0;
       this.serverLiveStreamId = 0;
       this.reason = "";
       this.distance = 0;
       this.coverDecodeMs = 0;
       this.coverResolution = "";
       this.coverFormat = "";
       this.sAuthorId = "";
       this.sPhotoId = "";
       this.coverDownloadCostMs = 0;
       this.coverSize = 0;
       this.gameId = "";
       this.sessionId = "";
       this.serverExpTag = "";
       this.useSmartCover = false;
       this.ksOrderId = "";
       this.clientPage = "";
       this.containerId = "";
       this.containerItemIndex = 0;
       this.videoDurationInMs = 0;
       this.momentId = "";
       this.browseType = 0;
       this.enterAction = 0;
       this.subtype = 0;
       this.reportContext = "";
       this.expParams = "";
       this.feedId = "";
       this.entryPageSource = "";
       this.expTagList = null;
       this.isNormalLive = false;
       this.isSlide = false;
       this.currentCaid = "";
       this.lastCaid = "";
       this.caidVersion = "";
       this.lastCaidVersion = "";
       this.topPage = "";
       this.unionLiveAuthor = "";
       this.unionLiveId = "";
       this.isBackground = false;
       this.isAppPrelaunch = false;
       this.isAppPrelaunching = false;
       this.grantBrowseType = "";
       this.appStatus = "";
       this.interStidContainer = null;
       this.interactiveModel = "";
       this.pageCode = "";
       this.isFollow = false;
       this.liveStyle = 0;
       this.actionLogId = "";
       this.clientTimestamp = 0;
       this.clientIncrementId = 0;
       this.commonStid = null;
       this.interStExParams = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       RealShowLogs$RealShowFeed tRealShowFee = this.feedType;
       if (tRealShowFee != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tRealShowFee);
       }
       tRealShowFee = this.authorId;
       int i1 = 0;
       if (tRealShowFee - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tRealShowFee);
       }
       tRealShowFee = this.photoId;
       if (tRealShowFee - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tRealShowFee);
       }
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.liveStreamId);
       }
       if (!(this.expTag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.expTag);
       }
       RealShowLogs$RealShowFeed tshowIndexPl = this.showIndexPlusOne;
       if (tshowIndexPl - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tshowIndexPl);
       }
       tRealShowFee = this.showPosition;
       if (tRealShowFee != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(7, tRealShowFee);
       }
       tshowIndexPl = this.serverLiveStreamId;
       if (tshowIndexPl - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tshowIndexPl);
       }
       if (!(this.reason).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.reason);
       }
       if (Double.doubleToLongBits(this.distance) - Double.doubleToLongBits(0)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(10, this.distance);
       }
       tshowIndexPl = this.coverDecodeMs;
       if (tshowIndexPl - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(11, tshowIndexPl);
       }
       if (!(this.coverResolution).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.coverResolution);
       }
       if (!(this.coverFormat).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.coverFormat);
       }
       if (!(this.sAuthorId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.sAuthorId);
       }
       if (!(this.sPhotoId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(15, this.sPhotoId);
       }
       tshowIndexPl = this.coverDownloadCostMs;
       if (tshowIndexPl - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(16, tshowIndexPl);
       }
       tshowIndexPl = this.coverSize;
       if (tshowIndexPl - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(17, tshowIndexPl);
       }
       if (!(this.gameId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(18, this.gameId);
       }
       if (!(this.sessionId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(19, this.sessionId);
       }
       if (!(this.serverExpTag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(20, this.serverExpTag);
       }
       tRealShowFee = this.useSmartCover;
       if (tRealShowFee != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(21, tRealShowFee);
       }
       if (!(this.ksOrderId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(22, this.ksOrderId);
       }
       if (!(this.clientPage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(23, this.clientPage);
       }
       if (!(this.containerId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(24, this.containerId);
       }
       tshowIndexPl = this.containerItemIndex;
       if (tshowIndexPl - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(25, tshowIndexPl);
       }
       tshowIndexPl = this.videoDurationInMs;
       if (tshowIndexPl - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(26, tshowIndexPl);
       }
       if (!(this.momentId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(37, this.momentId);
       }
       tRealShowFee = this.browseType;
       if (tRealShowFee != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(38, tRealShowFee);
       }
       tRealShowFee = this.enterAction;
       if (tRealShowFee != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(39, tRealShowFee);
       }
       tRealShowFee = this.subtype;
       if (tRealShowFee != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(40, tRealShowFee);
       }
       if (!(this.reportContext).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(41, this.reportContext);
       }
       if (!(this.expParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(42, this.expParams);
       }
       if (!(this.feedId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(43, this.feedId);
       }
       if (!(this.entryPageSource).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(44, this.entryPageSource);
       }
       tRealShowFee = this.expTagList;
       if (tRealShowFee != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(45, tRealShowFee);
       }
       tRealShowFee = this.isNormalLive;
       if (tRealShowFee != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(46, tRealShowFee);
       }
       tRealShowFee = this.isSlide;
       if (tRealShowFee != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(47, tRealShowFee);
       }
       if (!(this.currentCaid).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(48, this.currentCaid);
       }
       if (!(this.lastCaid).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(49, this.lastCaid);
       }
       if (!(this.caidVersion).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(50, this.caidVersion);
       }
       if (!(this.lastCaidVersion).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(51, this.lastCaidVersion);
       }
       if (!(this.topPage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(52, this.topPage);
       }
       if (!(this.unionLiveAuthor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(53, this.unionLiveAuthor);
       }
       if (!(this.unionLiveId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(54, this.unionLiveId);
       }
       tRealShowFee = this.isBackground;
       if (tRealShowFee != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(55, tRealShowFee);
       }
       tRealShowFee = this.isAppPrelaunch;
       if (tRealShowFee != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(56, tRealShowFee);
       }
       tRealShowFee = this.isAppPrelaunching;
       if (tRealShowFee != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(57, tRealShowFee);
       }
       if (!(this.grantBrowseType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(58, this.grantBrowseType);
       }
       if (!(this.appStatus).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(59, this.appStatus);
       }
       tRealShowFee = this.interStidContainer;
       if (tRealShowFee != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(60, tRealShowFee);
       }
       if (!(this.interactiveModel).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(61, this.interactiveModel);
       }
       if (!(this.pageCode).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(62, this.pageCode);
       }
       tRealShowFee = this.isFollow;
       if (tRealShowFee != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(63, tRealShowFee);
       }
       tRealShowFee = this.liveStyle;
       if (tRealShowFee != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(64, tRealShowFee);
       }
       if (!(this.actionLogId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(65, this.actionLogId);
       }
       tshowIndexPl = this.clientTimestamp;
       if (tshowIndexPl - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(66, tshowIndexPl);
       }
       tshowIndexPl = this.clientIncrementId;
       if (tshowIndexPl - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(67, tshowIndexPl);
       }
       tRealShowFee = this.commonStid;
       if (tRealShowFee != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(68, tRealShowFee);
       }
       if (!(this.interStExParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(69, this.interStExParams);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public RealShowLogs$RealShowFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
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
                    case 1:
                      break;
                    default:
                }
                this.feedType = i;
                break;
              case 16:
                this.authorId = p0.readUInt64();
                break;
              case 24:
                this.photoId = p0.readUInt64();
                break;
              case '"':
                this.liveStreamId = p0.readString();
                break;
              case '*':
                this.expTag = p0.readString();
                break;
              case '0':
                this.showIndexPlusOne = p0.readUInt64();
                break;
              case '8':
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                   continue ;
                }else {
                   this.showPosition = i;
                }
                break;
              case '@':
                this.serverLiveStreamId = p0.readUInt64();
                break;
              case 'J':
                this.reason = p0.readString();
                break;
              case 'Q':
                this.distance = p0.readDouble();
                break;
              case 'X':
                this.coverDecodeMs = p0.readUInt64();
                break;
              case 'b':
                this.coverResolution = p0.readString();
                break;
              case 'j':
                this.coverFormat = p0.readString();
                break;
              case 'r':
                this.sAuthorId = p0.readString();
                break;
              case 'z':
                this.sPhotoId = p0.readString();
                break;
              case 128:
                this.coverDownloadCostMs = p0.readUInt64();
                break;
              case 136:
                this.coverSize = p0.readUInt64();
                break;
              case 146:
                this.gameId = p0.readString();
                break;
              case 154:
                this.sessionId = p0.readString();
                break;
              case 162:
                this.serverExpTag = p0.readString();
                break;
              case 168:
                this.useSmartCover = p0.readBool();
                break;
              case 178:
                this.ksOrderId = p0.readString();
                break;
              case 186:
                this.clientPage = p0.readString();
                break;
              case 194:
                this.containerId = p0.readString();
                break;
              case 200:
                this.containerItemIndex = p0.readUInt64();
                break;
              case 208:
                this.videoDurationInMs = p0.readUInt64();
                break;
              case 298:
                this.momentId = p0.readString();
                break;
              case 304:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                   continue ;
                }else {
                   this.browseType = i;
                }
                break;
              case 312:
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
              case 320:
                i = p0.readInt32();
                if (i && i != 1) {
                   continue ;
                }else {
                   this.subtype = i;
                }
                break;
              case 330:
                this.reportContext = p0.readString();
                break;
              case 338:
                this.expParams = p0.readString();
                break;
              case 346:
                this.feedId = p0.readString();
                break;
              case 354:
                this.entryPageSource = p0.readString();
                break;
              case 362:
                if (this.expTagList == null) {
                   this.expTagList = new ClientEvent$ExpTagTransList();
                }
                p0.readMessage(this.expTagList);
                break;
              case 368:
                this.isNormalLive = p0.readBool();
                break;
              case 376:
                this.isSlide = p0.readBool();
                break;
              case 386:
                this.currentCaid = p0.readString();
                break;
              case 394:
                this.lastCaid = p0.readString();
                break;
              case 402:
                this.caidVersion = p0.readString();
                break;
              case 410:
                this.lastCaidVersion = p0.readString();
                break;
              case 418:
                this.topPage = p0.readString();
                break;
              case 426:
                this.unionLiveAuthor = p0.readString();
                break;
              case 434:
                this.unionLiveId = p0.readString();
                break;
              case 440:
                this.isBackground = p0.readBool();
                break;
              case 448:
                this.isAppPrelaunch = p0.readBool();
                break;
              case 456:
                this.isAppPrelaunching = p0.readBool();
                break;
              case 466:
                this.grantBrowseType = p0.readString();
                break;
              case 474:
                this.appStatus = p0.readString();
                break;
              case 482:
                if (this.interStidContainer == null) {
                   this.interStidContainer = new StidContainerProto$StidContainer();
                }
                p0.readMessage(this.interStidContainer);
                break;
              case 490:
                this.interactiveModel = p0.readString();
                break;
              case 498:
                this.pageCode = p0.readString();
                break;
              case 504:
                this.isFollow = p0.readBool();
                break;
              case 512:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                   continue ;
                }else {
                   this.liveStyle = i;
                }
                break;
              case 522:
                this.actionLogId = p0.readString();
                break;
              case 528:
                this.clientTimestamp = p0.readUInt64();
                break;
              case 536:
                this.clientIncrementId = p0.readUInt64();
                break;
              case 546:
                if (this.commonStid == null) {
                   this.commonStid = new StidContainerProto$StidPackage();
                }
                p0.readMessage(this.commonStid);
                break;
              case 554:
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
       RealShowLogs$RealShowFeed tRealShowFee = this.feedType;
       if (tRealShowFee != null) {
          p0.writeInt32(1, tRealShowFee);
       }
       tRealShowFee = this.authorId;
       int i = 0;
       if (tRealShowFee - i) {
          p0.writeUInt64(2, tRealShowFee);
       }
       tRealShowFee = this.photoId;
       if (tRealShowFee - i) {
          p0.writeUInt64(3, tRealShowFee);
       }
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(4, this.liveStreamId);
       }
       if (!(this.expTag).equals(str)) {
          p0.writeString(5, this.expTag);
       }
       RealShowLogs$RealShowFeed tshowIndexPl = this.showIndexPlusOne;
       if (tshowIndexPl - i) {
          p0.writeUInt64(6, tshowIndexPl);
       }
       tRealShowFee = this.showPosition;
       if (tRealShowFee != null) {
          p0.writeInt32(7, tRealShowFee);
       }
       tshowIndexPl = this.serverLiveStreamId;
       if (tshowIndexPl - i) {
          p0.writeUInt64(8, tshowIndexPl);
       }
       if (!(this.reason).equals(str)) {
          p0.writeString(9, this.reason);
       }
       if (Double.doubleToLongBits(this.distance) - Double.doubleToLongBits(0)) {
          p0.writeDouble(10, this.distance);
       }
       tshowIndexPl = this.coverDecodeMs;
       if (tshowIndexPl - i) {
          p0.writeUInt64(11, tshowIndexPl);
       }
       if (!(this.coverResolution).equals(str)) {
          p0.writeString(12, this.coverResolution);
       }
       if (!(this.coverFormat).equals(str)) {
          p0.writeString(13, this.coverFormat);
       }
       if (!(this.sAuthorId).equals(str)) {
          p0.writeString(14, this.sAuthorId);
       }
       if (!(this.sPhotoId).equals(str)) {
          p0.writeString(15, this.sPhotoId);
       }
       tshowIndexPl = this.coverDownloadCostMs;
       if (tshowIndexPl - i) {
          p0.writeUInt64(16, tshowIndexPl);
       }
       tshowIndexPl = this.coverSize;
       if (tshowIndexPl - i) {
          p0.writeUInt64(17, tshowIndexPl);
       }
       if (!(this.gameId).equals(str)) {
          p0.writeString(18, this.gameId);
       }
       if (!(this.sessionId).equals(str)) {
          p0.writeString(19, this.sessionId);
       }
       if (!(this.serverExpTag).equals(str)) {
          p0.writeString(20, this.serverExpTag);
       }
       tRealShowFee = this.useSmartCover;
       if (tRealShowFee != null) {
          p0.writeBool(21, tRealShowFee);
       }
       if (!(this.ksOrderId).equals(str)) {
          p0.writeString(22, this.ksOrderId);
       }
       if (!(this.clientPage).equals(str)) {
          p0.writeString(23, this.clientPage);
       }
       if (!(this.containerId).equals(str)) {
          p0.writeString(24, this.containerId);
       }
       tshowIndexPl = this.containerItemIndex;
       if (tshowIndexPl - i) {
          p0.writeUInt64(25, tshowIndexPl);
       }
       tshowIndexPl = this.videoDurationInMs;
       if (tshowIndexPl - i) {
          p0.writeUInt64(26, tshowIndexPl);
       }
       if (!(this.momentId).equals(str)) {
          p0.writeString(37, this.momentId);
       }
       tRealShowFee = this.browseType;
       if (tRealShowFee != null) {
          p0.writeInt32(38, tRealShowFee);
       }
       tRealShowFee = this.enterAction;
       if (tRealShowFee != null) {
          p0.writeInt32(39, tRealShowFee);
       }
       tRealShowFee = this.subtype;
       if (tRealShowFee != null) {
          p0.writeInt32(40, tRealShowFee);
       }
       if (!(this.reportContext).equals(str)) {
          p0.writeString(41, this.reportContext);
       }
       if (!(this.expParams).equals(str)) {
          p0.writeString(42, this.expParams);
       }
       if (!(this.feedId).equals(str)) {
          p0.writeString(43, this.feedId);
       }
       if (!(this.entryPageSource).equals(str)) {
          p0.writeString(44, this.entryPageSource);
       }
       tRealShowFee = this.expTagList;
       if (tRealShowFee != null) {
          p0.writeMessage(45, tRealShowFee);
       }
       tRealShowFee = this.isNormalLive;
       if (tRealShowFee != null) {
          p0.writeBool(46, tRealShowFee);
       }
       tRealShowFee = this.isSlide;
       if (tRealShowFee != null) {
          p0.writeBool(47, tRealShowFee);
       }
       if (!(this.currentCaid).equals(str)) {
          p0.writeString(48, this.currentCaid);
       }
       if (!(this.lastCaid).equals(str)) {
          p0.writeString(49, this.lastCaid);
       }
       if (!(this.caidVersion).equals(str)) {
          p0.writeString(50, this.caidVersion);
       }
       if (!(this.lastCaidVersion).equals(str)) {
          p0.writeString(51, this.lastCaidVersion);
       }
       if (!(this.topPage).equals(str)) {
          p0.writeString(52, this.topPage);
       }
       if (!(this.unionLiveAuthor).equals(str)) {
          p0.writeString(53, this.unionLiveAuthor);
       }
       if (!(this.unionLiveId).equals(str)) {
          p0.writeString(54, this.unionLiveId);
       }
       tRealShowFee = this.isBackground;
       if (tRealShowFee != null) {
          p0.writeBool(55, tRealShowFee);
       }
       tRealShowFee = this.isAppPrelaunch;
       if (tRealShowFee != null) {
          p0.writeBool(56, tRealShowFee);
       }
       tRealShowFee = this.isAppPrelaunching;
       if (tRealShowFee != null) {
          p0.writeBool(57, tRealShowFee);
       }
       if (!(this.grantBrowseType).equals(str)) {
          p0.writeString(58, this.grantBrowseType);
       }
       if (!(this.appStatus).equals(str)) {
          p0.writeString(59, this.appStatus);
       }
       tRealShowFee = this.interStidContainer;
       if (tRealShowFee != null) {
          p0.writeMessage(60, tRealShowFee);
       }
       if (!(this.interactiveModel).equals(str)) {
          p0.writeString(61, this.interactiveModel);
       }
       if (!(this.pageCode).equals(str)) {
          p0.writeString(62, this.pageCode);
       }
       tRealShowFee = this.isFollow;
       if (tRealShowFee != null) {
          p0.writeBool(63, tRealShowFee);
       }
       tRealShowFee = this.liveStyle;
       if (tRealShowFee != null) {
          p0.writeInt32(64, tRealShowFee);
       }
       if (!(this.actionLogId).equals(str)) {
          p0.writeString(65, this.actionLogId);
       }
       tshowIndexPl = this.clientTimestamp;
       if (tshowIndexPl - i) {
          p0.writeUInt64(66, tshowIndexPl);
       }
       tshowIndexPl = this.clientIncrementId;
       if (tshowIndexPl - i) {
          p0.writeUInt64(67, tshowIndexPl);
       }
       tRealShowFee = this.commonStid;
       if (tRealShowFee != null) {
          p0.writeMessage(68, tRealShowFee);
       }
       if (!(this.interStExParams).equals(str)) {
          p0.writeString(69, this.interStExParams);
       }
       super.writeTo(p0);
       return;
    }
}
