package com.kuaishou.client.log.stat.packages.nano.ClientStat$LivePlayBizStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidContainer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;

public final class ClientStat$LivePlayBizStatEvent extends MessageNano	// class@0007e7
{
    public String aggregationSessionId;
    public String anchorUserId;
    public long backgroundDuration;
    public long bizPendingDuration;
    public long blockCnt;
    public long bufferTime;
    public String clientId;
    public int closeReason;
    public int contentType;
    public int enterAction;
    public long externalIcon;
    public String extraParams;
    public long fullscreenDuration;
    public String groupId;
    public boolean initiativeLeave;
    public String interStExParams;
    public StidContainerProto$StidContainer interStidContainer;
    public StidContainerProto$StidContainer internalStidContainer;
    public String internalStidContainerJson;
    public boolean isAnchor;
    public boolean isAutoPlay;
    public boolean isBackground;
    public int isBarrageOn;
    public String isDidappear;
    public boolean isFollowNow;
    public boolean isNormalPlay;
    public boolean isOutsideApp;
    public boolean isSlidePlay;
    public long landscapeDuration;
    public long likeCnt;
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
    public String liveRecoLabel;
    public int liveRoomStatusOnEnter;
    public String liveStreamHost;
    public String liveStreamId;
    public String liveStreamIp;
    public int liveStreamType;
    public int liveStyle;
    public long onlineCntEnter;
    public String onlineCntEnterStr;
    public long onlineCntLeave;
    public String onlineCntLeaveStr;
    public int playerStatus;
    public int playerType;
    public long portraitDuration;
    public long postCommentCnt;
    public String pushUrl;
    public int referLiveSourceType;
    public ClientEvent$UrlPackage referUrlPackage;
    public String searchParams;
    public String searchSessionId;
    public String sessionId;
    public long showIndexPlusOne;
    public int sourceType;
    public int sourceTypeNew;
    public String sourceUrl;
    public long suspendDuration;
    public int switchFloatWindowReason;
    public String tagType;
    public long totalDuration;
    public String unionLiveAuthor;
    public String unionLiveId;
    public int uploadReason;
    public ClientEvent$UrlPackage urlPackage;
    public int viewStatus;
    public static ClientStat$LivePlayBizStatEvent[] _emptyArray;

    public void ClientStat$LivePlayBizStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$LivePlayBizStatEvent[] emptyArray(){
       if (ClientStat$LivePlayBizStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$LivePlayBizStatEvent._emptyArray == null) {
             ClientStat$LivePlayBizStatEvent[] livePlayBizS = new ClientStat$LivePlayBizStatEvent[0];
             ClientStat$LivePlayBizStatEvent._emptyArray = livePlayBizS;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$LivePlayBizStatEvent._emptyArray;
    }
    public static ClientStat$LivePlayBizStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$LivePlayBizStatEvent().mergeFrom(p0);
    }
    public static ClientStat$LivePlayBizStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$LivePlayBizStatEvent(), p0);
    }
    public ClientStat$LivePlayBizStatEvent clear(){
       this.sessionId = "";
       this.liveStreamId = "";
       this.pushUrl = "";
       this.clientId = "";
       this.liveStreamHost = "";
       this.liveStreamIp = "";
       this.liveStreamType = 0;
       this.playerType = 0;
       this.liveRoomStatusOnEnter = 0;
       this.initiativeLeave = false;
       this.livePlayStartTime = 0;
       this.livePlayEndTime = 0;
       this.totalDuration = 0;
       this.landscapeDuration = 0;
       this.portraitDuration = 0;
       this.fullscreenDuration = 0;
       this.onlineCntEnter = 0;
       this.onlineCntLeave = 0;
       this.likeCnt = 0;
       this.postCommentCnt = 0;
       this.urlPackage = null;
       this.referUrlPackage = null;
       this.isBackground = false;
       this.suspendDuration = 0;
       this.isSlidePlay = false;
       this.sourceType = 0;
       this.playerStatus = 0;
       this.closeReason = 0;
       this.uploadReason = 0;
       this.liveEntranceType = 0;
       this.sourceUrl = "";
       this.contentType = 0;
       this.sourceTypeNew = 0;
       this.isBarrageOn = 0;
       this.isAnchor = false;
       this.isAutoPlay = false;
       this.searchSessionId = "";
       this.onlineCntEnterStr = "";
       this.onlineCntLeaveStr = "";
       this.searchParams = "";
       this.referLiveSourceType = 0;
       this.aggregationSessionId = "";
       this.liveOperationType = 0;
       this.showIndexPlusOne = 0;
       this.externalIcon = 0;
       this.viewStatus = 0;
       this.switchFloatWindowReason = 0;
       this.livePlayerBizType = 0;
       this.liveIconType = "";
       this.liveRecoLabel = "";
       this.bufferTime = 0;
       this.blockCnt = 0;
       this.enterAction = 0;
       this.isNormalPlay = false;
       this.isFollowNow = false;
       this.anchorUserId = "";
       this.unionLiveAuthor = "";
       this.unionLiveId = "";
       this.internalStidContainer = null;
       this.internalStidContainerJson = "";
       this.isOutsideApp = false;
       this.interStidContainer = null;
       this.backgroundDuration = 0;
       this.bizPendingDuration = 0;
       this.groupId = "";
       this.liveIconTextType = "";
       this.liveIconReasonTextType = "";
       this.liveIconReasonExtraInfo = "";
       this.liveIconTextExtraInfo = "";
       this.tagType = "";
       this.liveStyle = 0;
       this.isDidappear = "";
       this.interStExParams = "";
       this.extraParams = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.sessionId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.sessionId);
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.liveStreamId);
       }
       if (!(this.pushUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.pushUrl);
       }
       if (!(this.clientId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.clientId);
       }
       if (!(this.liveStreamHost).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.liveStreamHost);
       }
       if (!(this.liveStreamIp).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.liveStreamIp);
       }
       ClientStat$LivePlayBizStatEvent tliveStreamT = this.liveStreamType;
       if (tliveStreamT != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(7, tliveStreamT);
       }
       tliveStreamT = this.playerType;
       if (tliveStreamT != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, tliveStreamT);
       }
       tliveStreamT = this.liveRoomStatusOnEnter;
       if (tliveStreamT != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(9, tliveStreamT);
       }
       tliveStreamT = this.initiativeLeave;
       if (tliveStreamT != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(10, tliveStreamT);
       }
       ClientStat$LivePlayBizStatEvent tlivePlaySta = this.livePlayStartTime;
       if (tlivePlaySta) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(11, tlivePlaySta);
       }
       tlivePlaySta = this.livePlayEndTime;
       if (tlivePlaySta) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(12, tlivePlaySta);
       }
       tlivePlaySta = this.totalDuration;
       if (tlivePlaySta) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(13, tlivePlaySta);
       }
       tlivePlaySta = this.landscapeDuration;
       if (tlivePlaySta) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(14, tlivePlaySta);
       }
       tlivePlaySta = this.portraitDuration;
       if (tlivePlaySta) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(15, tlivePlaySta);
       }
       tlivePlaySta = this.fullscreenDuration;
       if (tlivePlaySta) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(16, tlivePlaySta);
       }
       tlivePlaySta = this.onlineCntEnter;
       if (tlivePlaySta) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(17, tlivePlaySta);
       }
       tlivePlaySta = this.onlineCntLeave;
       if (tlivePlaySta) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(18, tlivePlaySta);
       }
       tlivePlaySta = this.likeCnt;
       if (tlivePlaySta) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(19, tlivePlaySta);
       }
       tlivePlaySta = this.postCommentCnt;
       if (tlivePlaySta) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(20, tlivePlaySta);
       }
       tliveStreamT = this.urlPackage;
       if (tliveStreamT != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(21, tliveStreamT);
       }
       tliveStreamT = this.referUrlPackage;
       if (tliveStreamT != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(22, tliveStreamT);
       }
       tliveStreamT = this.isBackground;
       if (tliveStreamT != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(23, tliveStreamT);
       }
       tlivePlaySta = this.suspendDuration;
       if (tlivePlaySta) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(24, tlivePlaySta);
       }
       tliveStreamT = this.isSlidePlay;
       if (tliveStreamT != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(25, tliveStreamT);
       }
       tliveStreamT = this.sourceType;
       if (tliveStreamT != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(26, tliveStreamT);
       }
       tliveStreamT = this.playerStatus;
       if (tliveStreamT != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(27, tliveStreamT);
       }
       tliveStreamT = this.closeReason;
       if (tliveStreamT != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(28, tliveStreamT);
       }
       tliveStreamT = this.uploadReason;
       if (tliveStreamT != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(29, tliveStreamT);
       }
       tliveStreamT = this.liveEntranceType;
       if (tliveStreamT != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(30, tliveStreamT);
       }
       if (!(this.sourceUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(31, this.sourceUrl);
       }
       tliveStreamT = this.contentType;
       if (tliveStreamT != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(32, tliveStreamT);
       }
       tliveStreamT = this.sourceTypeNew;
       if (tliveStreamT != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(33, tliveStreamT);
       }
       tliveStreamT = this.isBarrageOn;
       if (tliveStreamT != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(34, tliveStreamT);
       }
       tliveStreamT = this.isAnchor;
       if (tliveStreamT != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(35, tliveStreamT);
       }
       tliveStreamT = this.isAutoPlay;
       if (tliveStreamT != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(36, tliveStreamT);
       }
       if (!(this.searchSessionId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(37, this.searchSessionId);
       }
       if (!(this.onlineCntEnterStr).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(38, this.onlineCntEnterStr);
       }
       if (!(this.onlineCntLeaveStr).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(39, this.onlineCntLeaveStr);
       }
       if (!(this.searchParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(40, this.searchParams);
       }
       tliveStreamT = this.referLiveSourceType;
       if (tliveStreamT != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(41, tliveStreamT);
       }
       if (!(this.aggregationSessionId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(42, this.aggregationSessionId);
       }
       tlivePlaySta = this.liveOperationType;
       if (tlivePlaySta) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(43, tlivePlaySta);
       }
       tlivePlaySta = this.showIndexPlusOne;
       if (tlivePlaySta) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(44, tlivePlaySta);
       }
       tlivePlaySta = this.externalIcon;
       if (tlivePlaySta) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(45, tlivePlaySta);
       }
       tliveStreamT = this.viewStatus;
       if (tliveStreamT != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(46, tliveStreamT);
       }
       tliveStreamT = this.switchFloatWindowReason;
       if (tliveStreamT != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(47, tliveStreamT);
       }
       tliveStreamT = this.livePlayerBizType;
       if (tliveStreamT != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(48, tliveStreamT);
       }
       if (!(this.liveIconType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(49, this.liveIconType);
       }
       if (!(this.liveRecoLabel).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(50, this.liveRecoLabel);
       }
       tlivePlaySta = this.bufferTime;
       if (tlivePlaySta) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(51, tlivePlaySta);
       }
       tlivePlaySta = this.blockCnt;
       if (tlivePlaySta) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(52, tlivePlaySta);
       }
       tliveStreamT = this.enterAction;
       if (tliveStreamT != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(53, tliveStreamT);
       }
       tliveStreamT = this.isNormalPlay;
       if (tliveStreamT != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(54, tliveStreamT);
       }
       tliveStreamT = this.isFollowNow;
       if (tliveStreamT != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(55, tliveStreamT);
       }
       if (!(this.anchorUserId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(56, this.anchorUserId);
       }
       if (!(this.unionLiveAuthor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(57, this.unionLiveAuthor);
       }
       if (!(this.unionLiveId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(58, this.unionLiveId);
       }
       tliveStreamT = this.internalStidContainer;
       if (tliveStreamT != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(59, tliveStreamT);
       }
       if (!(this.internalStidContainerJson).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(60, this.internalStidContainerJson);
       }
       tliveStreamT = this.isOutsideApp;
       if (tliveStreamT != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(61, tliveStreamT);
       }
       tliveStreamT = this.interStidContainer;
       if (tliveStreamT != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(62, tliveStreamT);
       }
       tlivePlaySta = this.backgroundDuration;
       if (tlivePlaySta) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(63, tlivePlaySta);
       }
       tlivePlaySta = this.bizPendingDuration;
       if (tlivePlaySta) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(64, tlivePlaySta);
       }
       if (!(this.groupId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(65, this.groupId);
       }
       if (!(this.liveIconTextType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(66, this.liveIconTextType);
       }
       if (!(this.liveIconReasonTextType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(67, this.liveIconReasonTextType);
       }
       if (!(this.liveIconReasonExtraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(68, this.liveIconReasonExtraInfo);
       }
       if (!(this.liveIconTextExtraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(69, this.liveIconTextExtraInfo);
       }
       if (!(this.tagType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(70, this.tagType);
       }
       tliveStreamT = this.liveStyle;
       if (tliveStreamT != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(71, tliveStreamT);
       }
       if (!(this.isDidappear).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(72, this.isDidappear);
       }
       if (!(this.interStExParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(73, this.interStExParams);
       }
       if (!(this.extraParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(74, this.extraParams);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$LivePlayBizStatEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          int i1 = 4;
          switch (i){
              case 0:
                return this;
              case 10:
                this.sessionId = p0.readString();
                break;
              case 18:
                this.liveStreamId = p0.readString();
                break;
              case 26:
                this.pushUrl = p0.readString();
                break;
              case '"':
                this.clientId = p0.readString();
                break;
              case '*':
                this.liveStreamHost = p0.readString();
                break;
              case '2':
                this.liveStreamIp = p0.readString();
                break;
              case '8':
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.liveStreamType = i;
                }
                break;
              case '@':
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && (i != i1 && i != 5))))) {
                   continue ;
                }else {
                   this.playerType = i;
                }
                break;
              case 'H':
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.liveRoomStatusOnEnter = i;
                }
                break;
              case 'P':
                this.initiativeLeave = p0.readBool();
                break;
              case 'X':
                this.livePlayStartTime = p0.readUInt64();
                break;
              case '`':
                this.livePlayEndTime = p0.readUInt64();
                break;
              case 'h':
                this.totalDuration = p0.readUInt64();
                break;
              case 'p':
                this.landscapeDuration = p0.readUInt64();
                break;
              case 'x':
                this.portraitDuration = p0.readUInt64();
                break;
              case 128:
                this.fullscreenDuration = p0.readUInt64();
                break;
              case 136:
                this.onlineCntEnter = p0.readUInt64();
                break;
              case 144:
                this.onlineCntLeave = p0.readUInt64();
                break;
              case 152:
                this.likeCnt = p0.readUInt64();
                break;
              case 160:
                this.postCommentCnt = p0.readUInt64();
                break;
              case 170:
                if (this.urlPackage == null) {
                   this.urlPackage = new ClientEvent$UrlPackage();
                }
                p0.readMessage(this.urlPackage);
                break;
              case 178:
                if (this.referUrlPackage == null) {
                   this.referUrlPackage = new ClientEvent$UrlPackage();
                }
                p0.readMessage(this.referUrlPackage);
                break;
              case 184:
                this.isBackground = p0.readBool();
                break;
              case 192:
                this.suspendDuration = p0.readUInt64();
                break;
              case 200:
                this.isSlidePlay = p0.readBool();
                break;
              case 208:
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
                    case 1:
                      break;
                    default:
                }
                this.sourceType = i;
                break;
              case 216:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.playerStatus = i;
                }
                break;
              case 224:
                i = p0.readInt32();
                if (i && i != 1) {
                   continue ;
                }else {
                   this.closeReason = i;
                }
                break;
              case 232:
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
                    case 1:
                      break;
                    default:
                }
                this.uploadReason = i;
                break;
              case 240:
                i = p0.readInt32();
                if (i && i != 1) {
                   continue ;
                }else {
                   this.liveEntranceType = i;
                }
                break;
              case 250:
                this.sourceUrl = p0.readString();
                break;
              case 256:
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
              case 264:
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
                this.sourceTypeNew = i;
                break;
              case 272:
                this.isBarrageOn = p0.readUInt32();
                break;
              case 280:
                this.isAnchor = p0.readBool();
                break;
              case 288:
                this.isAutoPlay = p0.readBool();
                break;
              case 298:
                this.searchSessionId = p0.readString();
                break;
              case 306:
                this.onlineCntEnterStr = p0.readString();
                break;
              case 314:
                this.onlineCntLeaveStr = p0.readString();
                break;
              case 322:
                this.searchParams = p0.readString();
                break;
              case 328:
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
              case 338:
                this.aggregationSessionId = p0.readString();
                break;
              case 344:
                this.liveOperationType = p0.readUInt64();
                break;
              case 352:
                this.showIndexPlusOne = p0.readUInt64();
                break;
              case 360:
                this.externalIcon = p0.readUInt64();
                break;
              case 368:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && i != i1)))) {
                   continue ;
                }else {
                   this.viewStatus = i;
                }
                break;
              case 376:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && i != i1)))) {
                   continue ;
                }else {
                   this.switchFloatWindowReason = i;
                }
                break;
              case 384:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.livePlayerBizType = i;
                }
                break;
              case 394:
                this.liveIconType = p0.readString();
                break;
              case 402:
                this.liveRecoLabel = p0.readString();
                break;
              case 408:
                this.bufferTime = p0.readUInt64();
                break;
              case 416:
                this.blockCnt = p0.readUInt64();
                break;
              case 424:
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
              case 432:
                this.isNormalPlay = p0.readBool();
                break;
              case 440:
                this.isFollowNow = p0.readBool();
                break;
              case 450:
                this.anchorUserId = p0.readString();
                break;
              case 458:
                this.unionLiveAuthor = p0.readString();
                break;
              case 466:
                this.unionLiveId = p0.readString();
                break;
              case 474:
                if (this.internalStidContainer == null) {
                   this.internalStidContainer = new StidContainerProto$StidContainer();
                }
                p0.readMessage(this.internalStidContainer);
                break;
              case 482:
                this.internalStidContainerJson = p0.readString();
                break;
              case 488:
                this.isOutsideApp = p0.readBool();
                break;
              case 498:
                if (this.interStidContainer == null) {
                   this.interStidContainer = new StidContainerProto$StidContainer();
                }
                p0.readMessage(this.interStidContainer);
                break;
              case 504:
                this.backgroundDuration = p0.readUInt64();
                break;
              case 512:
                this.bizPendingDuration = p0.readUInt64();
                break;
              case 522:
                this.groupId = p0.readString();
                break;
              case 530:
                this.liveIconTextType = p0.readString();
                break;
              case 538:
                this.liveIconReasonTextType = p0.readString();
                break;
              case 546:
                this.liveIconReasonExtraInfo = p0.readString();
                break;
              case 554:
                this.liveIconTextExtraInfo = p0.readString();
                break;
              case 562:
                this.tagType = p0.readString();
                break;
              case 568:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && i != i1)))) {
                   continue ;
                }else {
                   this.liveStyle = i;
                }
                break;
              case 578:
                this.isDidappear = p0.readString();
                break;
              case 586:
                this.interStExParams = p0.readString();
                break;
              case 594:
                this.extraParams = p0.readString();
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
       if (!(this.sessionId).equals(str)) {
          p0.writeString(1, this.sessionId);
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(2, this.liveStreamId);
       }
       if (!(this.pushUrl).equals(str)) {
          p0.writeString(3, this.pushUrl);
       }
       if (!(this.clientId).equals(str)) {
          p0.writeString(4, this.clientId);
       }
       if (!(this.liveStreamHost).equals(str)) {
          p0.writeString(5, this.liveStreamHost);
       }
       if (!(this.liveStreamIp).equals(str)) {
          p0.writeString(6, this.liveStreamIp);
       }
       ClientStat$LivePlayBizStatEvent tliveStreamT = this.liveStreamType;
       if (tliveStreamT != null) {
          p0.writeInt32(7, tliveStreamT);
       }
       tliveStreamT = this.playerType;
       if (tliveStreamT != null) {
          p0.writeInt32(8, tliveStreamT);
       }
       tliveStreamT = this.liveRoomStatusOnEnter;
       if (tliveStreamT != null) {
          p0.writeInt32(9, tliveStreamT);
       }
       tliveStreamT = this.initiativeLeave;
       if (tliveStreamT != null) {
          p0.writeBool(10, tliveStreamT);
       }
       ClientStat$LivePlayBizStatEvent tlivePlaySta = this.livePlayStartTime;
       if (tlivePlaySta) {
          p0.writeUInt64(11, tlivePlaySta);
       }
       tlivePlaySta = this.livePlayEndTime;
       if (tlivePlaySta) {
          p0.writeUInt64(12, tlivePlaySta);
       }
       tlivePlaySta = this.totalDuration;
       if (tlivePlaySta) {
          p0.writeUInt64(13, tlivePlaySta);
       }
       tlivePlaySta = this.landscapeDuration;
       if (tlivePlaySta) {
          p0.writeUInt64(14, tlivePlaySta);
       }
       tlivePlaySta = this.portraitDuration;
       if (tlivePlaySta) {
          p0.writeUInt64(15, tlivePlaySta);
       }
       tlivePlaySta = this.fullscreenDuration;
       if (tlivePlaySta) {
          p0.writeUInt64(16, tlivePlaySta);
       }
       tlivePlaySta = this.onlineCntEnter;
       if (tlivePlaySta) {
          p0.writeUInt64(17, tlivePlaySta);
       }
       tlivePlaySta = this.onlineCntLeave;
       if (tlivePlaySta) {
          p0.writeUInt64(18, tlivePlaySta);
       }
       tlivePlaySta = this.likeCnt;
       if (tlivePlaySta) {
          p0.writeUInt64(19, tlivePlaySta);
       }
       tlivePlaySta = this.postCommentCnt;
       if (tlivePlaySta) {
          p0.writeUInt64(20, tlivePlaySta);
       }
       tliveStreamT = this.urlPackage;
       if (tliveStreamT != null) {
          p0.writeMessage(21, tliveStreamT);
       }
       tliveStreamT = this.referUrlPackage;
       if (tliveStreamT != null) {
          p0.writeMessage(22, tliveStreamT);
       }
       tliveStreamT = this.isBackground;
       if (tliveStreamT != null) {
          p0.writeBool(23, tliveStreamT);
       }
       tlivePlaySta = this.suspendDuration;
       if (tlivePlaySta) {
          p0.writeUInt64(24, tlivePlaySta);
       }
       tliveStreamT = this.isSlidePlay;
       if (tliveStreamT != null) {
          p0.writeBool(25, tliveStreamT);
       }
       tliveStreamT = this.sourceType;
       if (tliveStreamT != null) {
          p0.writeInt32(26, tliveStreamT);
       }
       tliveStreamT = this.playerStatus;
       if (tliveStreamT != null) {
          p0.writeInt32(27, tliveStreamT);
       }
       tliveStreamT = this.closeReason;
       if (tliveStreamT != null) {
          p0.writeInt32(28, tliveStreamT);
       }
       tliveStreamT = this.uploadReason;
       if (tliveStreamT != null) {
          p0.writeInt32(29, tliveStreamT);
       }
       tliveStreamT = this.liveEntranceType;
       if (tliveStreamT != null) {
          p0.writeInt32(30, tliveStreamT);
       }
       if (!(this.sourceUrl).equals(str)) {
          p0.writeString(31, this.sourceUrl);
       }
       tliveStreamT = this.contentType;
       if (tliveStreamT != null) {
          p0.writeInt32(32, tliveStreamT);
       }
       tliveStreamT = this.sourceTypeNew;
       if (tliveStreamT != null) {
          p0.writeInt32(33, tliveStreamT);
       }
       tliveStreamT = this.isBarrageOn;
       if (tliveStreamT != null) {
          p0.writeUInt32(34, tliveStreamT);
       }
       tliveStreamT = this.isAnchor;
       if (tliveStreamT != null) {
          p0.writeBool(35, tliveStreamT);
       }
       tliveStreamT = this.isAutoPlay;
       if (tliveStreamT != null) {
          p0.writeBool(36, tliveStreamT);
       }
       if (!(this.searchSessionId).equals(str)) {
          p0.writeString(37, this.searchSessionId);
       }
       if (!(this.onlineCntEnterStr).equals(str)) {
          p0.writeString(38, this.onlineCntEnterStr);
       }
       if (!(this.onlineCntLeaveStr).equals(str)) {
          p0.writeString(39, this.onlineCntLeaveStr);
       }
       if (!(this.searchParams).equals(str)) {
          p0.writeString(40, this.searchParams);
       }
       tliveStreamT = this.referLiveSourceType;
       if (tliveStreamT != null) {
          p0.writeInt32(41, tliveStreamT);
       }
       if (!(this.aggregationSessionId).equals(str)) {
          p0.writeString(42, this.aggregationSessionId);
       }
       tlivePlaySta = this.liveOperationType;
       if (tlivePlaySta) {
          p0.writeUInt64(43, tlivePlaySta);
       }
       tlivePlaySta = this.showIndexPlusOne;
       if (tlivePlaySta) {
          p0.writeUInt64(44, tlivePlaySta);
       }
       tlivePlaySta = this.externalIcon;
       if (tlivePlaySta) {
          p0.writeUInt64(45, tlivePlaySta);
       }
       tliveStreamT = this.viewStatus;
       if (tliveStreamT != null) {
          p0.writeInt32(46, tliveStreamT);
       }
       tliveStreamT = this.switchFloatWindowReason;
       if (tliveStreamT != null) {
          p0.writeInt32(47, tliveStreamT);
       }
       tliveStreamT = this.livePlayerBizType;
       if (tliveStreamT != null) {
          p0.writeInt32(48, tliveStreamT);
       }
       if (!(this.liveIconType).equals(str)) {
          p0.writeString(49, this.liveIconType);
       }
       if (!(this.liveRecoLabel).equals(str)) {
          p0.writeString(50, this.liveRecoLabel);
       }
       tlivePlaySta = this.bufferTime;
       if (tlivePlaySta) {
          p0.writeUInt64(51, tlivePlaySta);
       }
       tlivePlaySta = this.blockCnt;
       if (tlivePlaySta) {
          p0.writeUInt64(52, tlivePlaySta);
       }
       tliveStreamT = this.enterAction;
       if (tliveStreamT != null) {
          p0.writeInt32(53, tliveStreamT);
       }
       tliveStreamT = this.isNormalPlay;
       if (tliveStreamT != null) {
          p0.writeBool(54, tliveStreamT);
       }
       tliveStreamT = this.isFollowNow;
       if (tliveStreamT != null) {
          p0.writeBool(55, tliveStreamT);
       }
       if (!(this.anchorUserId).equals(str)) {
          p0.writeString(56, this.anchorUserId);
       }
       if (!(this.unionLiveAuthor).equals(str)) {
          p0.writeString(57, this.unionLiveAuthor);
       }
       if (!(this.unionLiveId).equals(str)) {
          p0.writeString(58, this.unionLiveId);
       }
       tliveStreamT = this.internalStidContainer;
       if (tliveStreamT != null) {
          p0.writeMessage(59, tliveStreamT);
       }
       if (!(this.internalStidContainerJson).equals(str)) {
          p0.writeString(60, this.internalStidContainerJson);
       }
       tliveStreamT = this.isOutsideApp;
       if (tliveStreamT != null) {
          p0.writeBool(61, tliveStreamT);
       }
       tliveStreamT = this.interStidContainer;
       if (tliveStreamT != null) {
          p0.writeMessage(62, tliveStreamT);
       }
       tlivePlaySta = this.backgroundDuration;
       if (tlivePlaySta) {
          p0.writeUInt64(63, tlivePlaySta);
       }
       tlivePlaySta = this.bizPendingDuration;
       if (tlivePlaySta) {
          p0.writeUInt64(64, tlivePlaySta);
       }
       if (!(this.groupId).equals(str)) {
          p0.writeString(65, this.groupId);
       }
       if (!(this.liveIconTextType).equals(str)) {
          p0.writeString(66, this.liveIconTextType);
       }
       if (!(this.liveIconReasonTextType).equals(str)) {
          p0.writeString(67, this.liveIconReasonTextType);
       }
       if (!(this.liveIconReasonExtraInfo).equals(str)) {
          p0.writeString(68, this.liveIconReasonExtraInfo);
       }
       if (!(this.liveIconTextExtraInfo).equals(str)) {
          p0.writeString(69, this.liveIconTextExtraInfo);
       }
       if (!(this.tagType).equals(str)) {
          p0.writeString(70, this.tagType);
       }
       tliveStreamT = this.liveStyle;
       if (tliveStreamT != null) {
          p0.writeInt32(71, tliveStreamT);
       }
       if (!(this.isDidappear).equals(str)) {
          p0.writeString(72, this.isDidappear);
       }
       if (!(this.interStExParams).equals(str)) {
          p0.writeString(73, this.interStExParams);
       }
       if (!(this.extraParams).equals(str)) {
          p0.writeString(74, this.extraParams);
       }
       super.writeTo(p0);
       return;
    }
}
