package com.kuaishou.client.log.stat.packages.nano.ClientStat$ResolutionSlicePackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$ResolutionSlicePackage extends MessageNano	// class@001421
{
    public long analyzeDnsDuration;
    public long analyzeStreamInfoDuration;
    public long backgroundCount;
    public long backgroundDuration;
    public long badFpsDuration;
    public long bestFpsDuration;
    public long betterFpsDuration;
    public long blockCnt;
    public long blockCntOld;
    public long bufferTime;
    public long bufferTimeOld;
    public long cdnTraffic;
    public int cid;
    public long connectHttpDuration;
    public long decodeFirstPackageDuration;
    public String dnsResolveHost;
    public String dnsResolvedIp;
    public String dnsResolverName;
    public long dropPackageTotalDuration;
    public long emptyFpsDuration;
    public long firstScreenAllPreparedDuration;
    public long firstScreenDropPackageDuration;
    public long firstScreenPlayerTotalDuration;
    public long firstScreenTotalDuration;
    public long firstScreenWaitForPlayDuration;
    public long floatingWindowBlockCnt;
    public long floatingWindowBufferTime;
    public long fullscreenDuration;
    public long hideCount;
    public long hideDuration;
    public int lac;
    public long landscapeDuration;
    public long liveDecodeType;
    public String livePolicy;
    public String liveStreamHost;
    public String liveStreamIp;
    public String liveVideoEncodeInfo;
    public int mcc;
    public int mnc;
    public long normalFpsDuration;
    public long openCodecDuration;
    public long openStreamDuration;
    public long p2SpTraffic;
    public long playStartTime;
    public String playerQosJson;
    public int playerType;
    public long portraitDuration;
    public long preDecodeFirstPackageDuration;
    public long prepareTime;
    public String pullCdn;
    public String pushCdn;
    public String pushUrl;
    public long receiveFirstPackageDuration;
    public long renderFirstPackageDuration;
    public int resolutionType;
    public long retryCnt;
    public int rssi;
    public int screenOrientationLeaveType;
    public int screenOrientationSwitchCnt;
    public long streamDuration;
    public long suspendDuration;
    public long totalDuration;
    public long traffic;
    public static ClientStat$ResolutionSlicePackage[] _emptyArray;

    public void ClientStat$ResolutionSlicePackage(){
       super();
       this.clear();
    }
    public static ClientStat$ResolutionSlicePackage[] emptyArray(){
       if (ClientStat$ResolutionSlicePackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$ResolutionSlicePackage._emptyArray == null) {
             ClientStat$ResolutionSlicePackage[] resolutionSl = new ClientStat$ResolutionSlicePackage[0];
             ClientStat$ResolutionSlicePackage._emptyArray = resolutionSl;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$ResolutionSlicePackage._emptyArray;
    }
    public static ClientStat$ResolutionSlicePackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$ResolutionSlicePackage().mergeFrom(p0);
    }
    public static ClientStat$ResolutionSlicePackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$ResolutionSlicePackage(), p0);
    }
    public ClientStat$ResolutionSlicePackage clear(){
       this.playStartTime = 0;
       this.fullscreenDuration = 0;
       this.totalDuration = 0;
       this.traffic = 0;
       this.bufferTime = 0;
       this.prepareTime = 0;
       this.liveStreamHost = "";
       this.liveStreamIp = "";
       this.retryCnt = 0;
       this.pushUrl = "";
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
       this.resolutionType = 0;
       this.landscapeDuration = 0;
       this.portraitDuration = 0;
       this.screenOrientationSwitchCnt = 0;
       this.screenOrientationLeaveType = 0;
       this.backgroundDuration = 0;
       this.rssi = 0;
       this.mcc = 0;
       this.mnc = 0;
       this.lac = 0;
       this.cid = 0;
       this.pushCdn = "";
       this.pullCdn = "";
       this.cdnTraffic = 0;
       this.p2SpTraffic = 0;
       this.livePolicy = "";
       this.firstScreenWaitForPlayDuration = 0;
       this.firstScreenAllPreparedDuration = 0;
       this.firstScreenPlayerTotalDuration = 0;
       this.bufferTimeOld = 0;
       this.blockCntOld = 0;
       this.suspendDuration = 0;
       this.playerType = 0;
       this.hideDuration = 0;
       this.hideCount = 0;
       this.backgroundCount = 0;
       this.floatingWindowBlockCnt = 0;
       this.floatingWindowBufferTime = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$ResolutionSlicePackage tplayStartTi = this.playStartTime;
       int i1 = 0;
       if (tplayStartTi - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tplayStartTi);
       }
       tplayStartTi = this.fullscreenDuration;
       if (tplayStartTi - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tplayStartTi);
       }
       tplayStartTi = this.totalDuration;
       if (tplayStartTi - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tplayStartTi);
       }
       tplayStartTi = this.traffic;
       if (tplayStartTi - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tplayStartTi);
       }
       tplayStartTi = this.bufferTime;
       if (tplayStartTi - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tplayStartTi);
       }
       tplayStartTi = this.prepareTime;
       if (tplayStartTi - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tplayStartTi);
       }
       String str = "";
       if (!(this.liveStreamHost).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.liveStreamHost);
       }
       if (!(this.liveStreamIp).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.liveStreamIp);
       }
       ClientStat$ResolutionSlicePackage tretryCnt = this.retryCnt;
       if (tretryCnt - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, tretryCnt);
       }
       if (!(this.pushUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.pushUrl);
       }
       tretryCnt = this.firstScreenTotalDuration;
       if (tretryCnt - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(11, tretryCnt);
       }
       tretryCnt = this.analyzeDnsDuration;
       if (tretryCnt - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(12, tretryCnt);
       }
       tretryCnt = this.connectHttpDuration;
       if (tretryCnt - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(13, tretryCnt);
       }
       tretryCnt = this.openStreamDuration;
       if (tretryCnt - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(14, tretryCnt);
       }
       tretryCnt = this.analyzeStreamInfoDuration;
       if (tretryCnt - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(15, tretryCnt);
       }
       tretryCnt = this.openCodecDuration;
       if (tretryCnt - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(16, tretryCnt);
       }
       tretryCnt = this.receiveFirstPackageDuration;
       if (tretryCnt - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(17, tretryCnt);
       }
       tretryCnt = this.preDecodeFirstPackageDuration;
       if (tretryCnt - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(18, tretryCnt);
       }
       tretryCnt = this.decodeFirstPackageDuration;
       if (tretryCnt - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(19, tretryCnt);
       }
       tretryCnt = this.renderFirstPackageDuration;
       if (tretryCnt - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(20, tretryCnt);
       }
       tretryCnt = this.firstScreenDropPackageDuration;
       if (tretryCnt - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(21, tretryCnt);
       }
       tretryCnt = this.dropPackageTotalDuration;
       if (tretryCnt - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(22, tretryCnt);
       }
       tretryCnt = this.liveDecodeType;
       if (tretryCnt - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(23, tretryCnt);
       }
       tretryCnt = this.bestFpsDuration;
       if (tretryCnt - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(24, tretryCnt);
       }
       tretryCnt = this.betterFpsDuration;
       if (tretryCnt - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(25, tretryCnt);
       }
       tretryCnt = this.normalFpsDuration;
       if (tretryCnt - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(26, tretryCnt);
       }
       tretryCnt = this.badFpsDuration;
       if (tretryCnt - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(27, tretryCnt);
       }
       tretryCnt = this.emptyFpsDuration;
       if (tretryCnt - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(28, tretryCnt);
       }
       if (!(this.dnsResolveHost).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(29, this.dnsResolveHost);
       }
       if (!(this.dnsResolvedIp).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(30, this.dnsResolvedIp);
       }
       if (!(this.dnsResolverName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(31, this.dnsResolverName);
       }
       if (!(this.liveVideoEncodeInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(32, this.liveVideoEncodeInfo);
       }
       if (!(this.playerQosJson).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(33, this.playerQosJson);
       }
       tretryCnt = this.streamDuration;
       if (tretryCnt - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(34, tretryCnt);
       }
       tretryCnt = this.blockCnt;
       if (tretryCnt - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(35, tretryCnt);
       }
       tplayStartTi = this.resolutionType;
       if (tplayStartTi != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(36, tplayStartTi);
       }
       tretryCnt = this.landscapeDuration;
       if (tretryCnt - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(37, tretryCnt);
       }
       tretryCnt = this.portraitDuration;
       if (tretryCnt - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(38, tretryCnt);
       }
       tplayStartTi = this.screenOrientationSwitchCnt;
       if (tplayStartTi != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(39, tplayStartTi);
       }
       tplayStartTi = this.screenOrientationLeaveType;
       if (tplayStartTi != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(40, tplayStartTi);
       }
       tretryCnt = this.backgroundDuration;
       if (tretryCnt - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(41, tretryCnt);
       }
       tplayStartTi = this.rssi;
       if (tplayStartTi != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(42, tplayStartTi);
       }
       tplayStartTi = this.mcc;
       if (tplayStartTi != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(43, tplayStartTi);
       }
       tplayStartTi = this.mnc;
       if (tplayStartTi != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(44, tplayStartTi);
       }
       tplayStartTi = this.lac;
       if (tplayStartTi != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(45, tplayStartTi);
       }
       tplayStartTi = this.cid;
       if (tplayStartTi != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(46, tplayStartTi);
       }
       if (!(this.pushCdn).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(47, this.pushCdn);
       }
       if (!(this.pullCdn).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(48, this.pullCdn);
       }
       tretryCnt = this.cdnTraffic;
       if (tretryCnt - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(49, tretryCnt);
       }
       tretryCnt = this.p2SpTraffic;
       if (tretryCnt - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(50, tretryCnt);
       }
       if (!(this.livePolicy).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(51, this.livePolicy);
       }
       tplayStartTi = this.firstScreenWaitForPlayDuration;
       if (tplayStartTi - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(52, tplayStartTi);
       }
       tplayStartTi = this.firstScreenAllPreparedDuration;
       if (tplayStartTi - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(53, tplayStartTi);
       }
       tplayStartTi = this.firstScreenPlayerTotalDuration;
       if (tplayStartTi - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(54, tplayStartTi);
       }
       tplayStartTi = this.bufferTimeOld;
       if (tplayStartTi - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(55, tplayStartTi);
       }
       tplayStartTi = this.blockCntOld;
       if (tplayStartTi - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(56, tplayStartTi);
       }
       tplayStartTi = this.suspendDuration;
       if (tplayStartTi - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(57, tplayStartTi);
       }
       tplayStartTi = this.playerType;
       if (tplayStartTi != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(58, tplayStartTi);
       }
       tplayStartTi = this.hideDuration;
       if (tplayStartTi - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(59, tplayStartTi);
       }
       tplayStartTi = this.hideCount;
       if (tplayStartTi - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(60, tplayStartTi);
       }
       tplayStartTi = this.backgroundCount;
       if (tplayStartTi - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(61, tplayStartTi);
       }
       tplayStartTi = this.floatingWindowBlockCnt;
       if (tplayStartTi - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(62, tplayStartTi);
       }
       tplayStartTi = this.floatingWindowBufferTime;
       if (tplayStartTi - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(63, tplayStartTi);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$ResolutionSlicePackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          int i1 = 4;
          switch (i){
              case 0:
                return this;
              case 8:
                this.playStartTime = p0.readUInt64();
                break;
              case 16:
                this.fullscreenDuration = p0.readUInt64();
                break;
              case 24:
                this.totalDuration = p0.readUInt64();
                break;
              case 32:
                this.traffic = p0.readUInt64();
                break;
              case '(':
                this.bufferTime = p0.readUInt64();
                break;
              case '0':
                this.prepareTime = p0.readUInt64();
                break;
              case ':':
                this.liveStreamHost = p0.readString();
                break;
              case 'B':
                this.liveStreamIp = p0.readString();
                break;
              case 'H':
                this.retryCnt = p0.readUInt64();
                break;
              case 'R':
                this.pushUrl = p0.readString();
                break;
              case 'X':
                this.firstScreenTotalDuration = p0.readUInt64();
                break;
              case '`':
                this.analyzeDnsDuration = p0.readUInt64();
                break;
              case 'h':
                this.connectHttpDuration = p0.readUInt64();
                break;
              case 'p':
                this.openStreamDuration = p0.readUInt64();
                break;
              case 'x':
                this.analyzeStreamInfoDuration = p0.readUInt64();
                break;
              case 128:
                this.openCodecDuration = p0.readUInt64();
                break;
              case 136:
                this.receiveFirstPackageDuration = p0.readUInt64();
                break;
              case 144:
                this.preDecodeFirstPackageDuration = p0.readUInt64();
                break;
              case 152:
                this.decodeFirstPackageDuration = p0.readUInt64();
                break;
              case 160:
                this.renderFirstPackageDuration = p0.readUInt64();
                break;
              case 168:
                this.firstScreenDropPackageDuration = p0.readUInt64();
                break;
              case 176:
                this.dropPackageTotalDuration = p0.readUInt64();
                break;
              case 184:
                this.liveDecodeType = p0.readUInt64();
                break;
              case 192:
                this.bestFpsDuration = p0.readUInt64();
                break;
              case 200:
                this.betterFpsDuration = p0.readUInt64();
                break;
              case 208:
                this.normalFpsDuration = p0.readUInt64();
                break;
              case 216:
                this.badFpsDuration = p0.readUInt64();
                break;
              case 224:
                this.emptyFpsDuration = p0.readUInt64();
                break;
              case 234:
                this.dnsResolveHost = p0.readString();
                break;
              case 242:
                this.dnsResolvedIp = p0.readString();
                break;
              case 250:
                this.dnsResolverName = p0.readString();
                break;
              case 258:
                this.liveVideoEncodeInfo = p0.readString();
                break;
              case 266:
                this.playerQosJson = p0.readString();
                break;
              case 272:
                this.streamDuration = p0.readUInt64();
                break;
              case 280:
                this.blockCnt = p0.readUInt64();
                break;
              case 288:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && i != i1)))) {
                   continue ;
                }else {
                   this.resolutionType = i;
                }
                break;
              case 296:
                this.landscapeDuration = p0.readUInt64();
                break;
              case 304:
                this.portraitDuration = p0.readUInt64();
                break;
              case 312:
                this.screenOrientationSwitchCnt = p0.readUInt32();
                break;
              case 320:
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.screenOrientationLeaveType = i;
                }
                break;
              case 328:
                this.backgroundDuration = p0.readUInt64();
                break;
              case 336:
                this.rssi = p0.readUInt32();
                break;
              case 344:
                this.mcc = p0.readUInt32();
                break;
              case 352:
                this.mnc = p0.readUInt32();
                break;
              case 360:
                this.lac = p0.readUInt32();
                break;
              case 368:
                this.cid = p0.readUInt32();
                break;
              case 378:
                this.pushCdn = p0.readString();
                break;
              case 386:
                this.pullCdn = p0.readString();
                break;
              case 392:
                this.cdnTraffic = p0.readUInt64();
                break;
              case 400:
                this.p2SpTraffic = p0.readUInt64();
                break;
              case 410:
                this.livePolicy = p0.readString();
                break;
              case 416:
                this.firstScreenWaitForPlayDuration = p0.readUInt64();
                break;
              case 424:
                this.firstScreenAllPreparedDuration = p0.readUInt64();
                break;
              case 432:
                this.firstScreenPlayerTotalDuration = p0.readUInt64();
                break;
              case 440:
                this.bufferTimeOld = p0.readUInt64();
                break;
              case 448:
                this.blockCntOld = p0.readUInt64();
                break;
              case 456:
                this.suspendDuration = p0.readUInt64();
                break;
              case 464:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && (i != i1 && i != 5))))) {
                   continue ;
                }else {
                   this.playerType = i;
                }
                break;
              case 472:
                this.hideDuration = p0.readUInt64();
                break;
              case 480:
                this.hideCount = p0.readUInt64();
                break;
              case 488:
                this.backgroundCount = p0.readUInt64();
                break;
              case 496:
                this.floatingWindowBlockCnt = p0.readUInt64();
                break;
              case 504:
                this.floatingWindowBufferTime = p0.readUInt64();
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
       ClientStat$ResolutionSlicePackage tplayStartTi = this.playStartTime;
       int i = 0;
       if (tplayStartTi - i) {
          p0.writeUInt64(1, tplayStartTi);
       }
       tplayStartTi = this.fullscreenDuration;
       if (tplayStartTi - i) {
          p0.writeUInt64(2, tplayStartTi);
       }
       tplayStartTi = this.totalDuration;
       if (tplayStartTi - i) {
          p0.writeUInt64(3, tplayStartTi);
       }
       tplayStartTi = this.traffic;
       if (tplayStartTi - i) {
          p0.writeUInt64(4, tplayStartTi);
       }
       tplayStartTi = this.bufferTime;
       if (tplayStartTi - i) {
          p0.writeUInt64(5, tplayStartTi);
       }
       tplayStartTi = this.prepareTime;
       if (tplayStartTi - i) {
          p0.writeUInt64(6, tplayStartTi);
       }
       String str = "";
       if (!(this.liveStreamHost).equals(str)) {
          p0.writeString(7, this.liveStreamHost);
       }
       if (!(this.liveStreamIp).equals(str)) {
          p0.writeString(8, this.liveStreamIp);
       }
       ClientStat$ResolutionSlicePackage tretryCnt = this.retryCnt;
       if (tretryCnt - i) {
          p0.writeUInt64(9, tretryCnt);
       }
       if (!(this.pushUrl).equals(str)) {
          p0.writeString(10, this.pushUrl);
       }
       tretryCnt = this.firstScreenTotalDuration;
       if (tretryCnt - i) {
          p0.writeUInt64(11, tretryCnt);
       }
       tretryCnt = this.analyzeDnsDuration;
       if (tretryCnt - i) {
          p0.writeUInt64(12, tretryCnt);
       }
       tretryCnt = this.connectHttpDuration;
       if (tretryCnt - i) {
          p0.writeUInt64(13, tretryCnt);
       }
       tretryCnt = this.openStreamDuration;
       if (tretryCnt - i) {
          p0.writeUInt64(14, tretryCnt);
       }
       tretryCnt = this.analyzeStreamInfoDuration;
       if (tretryCnt - i) {
          p0.writeUInt64(15, tretryCnt);
       }
       tretryCnt = this.openCodecDuration;
       if (tretryCnt - i) {
          p0.writeUInt64(16, tretryCnt);
       }
       tretryCnt = this.receiveFirstPackageDuration;
       if (tretryCnt - i) {
          p0.writeUInt64(17, tretryCnt);
       }
       tretryCnt = this.preDecodeFirstPackageDuration;
       if (tretryCnt - i) {
          p0.writeUInt64(18, tretryCnt);
       }
       tretryCnt = this.decodeFirstPackageDuration;
       if (tretryCnt - i) {
          p0.writeUInt64(19, tretryCnt);
       }
       tretryCnt = this.renderFirstPackageDuration;
       if (tretryCnt - i) {
          p0.writeUInt64(20, tretryCnt);
       }
       tretryCnt = this.firstScreenDropPackageDuration;
       if (tretryCnt - i) {
          p0.writeUInt64(21, tretryCnt);
       }
       tretryCnt = this.dropPackageTotalDuration;
       if (tretryCnt - i) {
          p0.writeUInt64(22, tretryCnt);
       }
       tretryCnt = this.liveDecodeType;
       if (tretryCnt - i) {
          p0.writeUInt64(23, tretryCnt);
       }
       tretryCnt = this.bestFpsDuration;
       if (tretryCnt - i) {
          p0.writeUInt64(24, tretryCnt);
       }
       tretryCnt = this.betterFpsDuration;
       if (tretryCnt - i) {
          p0.writeUInt64(25, tretryCnt);
       }
       tretryCnt = this.normalFpsDuration;
       if (tretryCnt - i) {
          p0.writeUInt64(26, tretryCnt);
       }
       tretryCnt = this.badFpsDuration;
       if (tretryCnt - i) {
          p0.writeUInt64(27, tretryCnt);
       }
       tretryCnt = this.emptyFpsDuration;
       if (tretryCnt - i) {
          p0.writeUInt64(28, tretryCnt);
       }
       if (!(this.dnsResolveHost).equals(str)) {
          p0.writeString(29, this.dnsResolveHost);
       }
       if (!(this.dnsResolvedIp).equals(str)) {
          p0.writeString(30, this.dnsResolvedIp);
       }
       if (!(this.dnsResolverName).equals(str)) {
          p0.writeString(31, this.dnsResolverName);
       }
       if (!(this.liveVideoEncodeInfo).equals(str)) {
          p0.writeString(32, this.liveVideoEncodeInfo);
       }
       if (!(this.playerQosJson).equals(str)) {
          p0.writeString(33, this.playerQosJson);
       }
       tretryCnt = this.streamDuration;
       if (tretryCnt - i) {
          p0.writeUInt64(34, tretryCnt);
       }
       tretryCnt = this.blockCnt;
       if (tretryCnt - i) {
          p0.writeUInt64(35, tretryCnt);
       }
       tplayStartTi = this.resolutionType;
       if (tplayStartTi != null) {
          p0.writeInt32(36, tplayStartTi);
       }
       tretryCnt = this.landscapeDuration;
       if (tretryCnt - i) {
          p0.writeUInt64(37, tretryCnt);
       }
       tretryCnt = this.portraitDuration;
       if (tretryCnt - i) {
          p0.writeUInt64(38, tretryCnt);
       }
       tplayStartTi = this.screenOrientationSwitchCnt;
       if (tplayStartTi != null) {
          p0.writeUInt32(39, tplayStartTi);
       }
       tplayStartTi = this.screenOrientationLeaveType;
       if (tplayStartTi != null) {
          p0.writeInt32(40, tplayStartTi);
       }
       tretryCnt = this.backgroundDuration;
       if (tretryCnt - i) {
          p0.writeUInt64(41, tretryCnt);
       }
       tplayStartTi = this.rssi;
       if (tplayStartTi != null) {
          p0.writeUInt32(42, tplayStartTi);
       }
       tplayStartTi = this.mcc;
       if (tplayStartTi != null) {
          p0.writeUInt32(43, tplayStartTi);
       }
       tplayStartTi = this.mnc;
       if (tplayStartTi != null) {
          p0.writeUInt32(44, tplayStartTi);
       }
       tplayStartTi = this.lac;
       if (tplayStartTi != null) {
          p0.writeUInt32(45, tplayStartTi);
       }
       tplayStartTi = this.cid;
       if (tplayStartTi != null) {
          p0.writeUInt32(46, tplayStartTi);
       }
       if (!(this.pushCdn).equals(str)) {
          p0.writeString(47, this.pushCdn);
       }
       if (!(this.pullCdn).equals(str)) {
          p0.writeString(48, this.pullCdn);
       }
       tretryCnt = this.cdnTraffic;
       if (tretryCnt - i) {
          p0.writeUInt64(49, tretryCnt);
       }
       tretryCnt = this.p2SpTraffic;
       if (tretryCnt - i) {
          p0.writeUInt64(50, tretryCnt);
       }
       if (!(this.livePolicy).equals(str)) {
          p0.writeString(51, this.livePolicy);
       }
       tplayStartTi = this.firstScreenWaitForPlayDuration;
       if (tplayStartTi - i) {
          p0.writeUInt64(52, tplayStartTi);
       }
       tplayStartTi = this.firstScreenAllPreparedDuration;
       if (tplayStartTi - i) {
          p0.writeUInt64(53, tplayStartTi);
       }
       tplayStartTi = this.firstScreenPlayerTotalDuration;
       if (tplayStartTi - i) {
          p0.writeUInt64(54, tplayStartTi);
       }
       tplayStartTi = this.bufferTimeOld;
       if (tplayStartTi - i) {
          p0.writeUInt64(55, tplayStartTi);
       }
       tplayStartTi = this.blockCntOld;
       if (tplayStartTi - i) {
          p0.writeUInt64(56, tplayStartTi);
       }
       tplayStartTi = this.suspendDuration;
       if (tplayStartTi - i) {
          p0.writeUInt64(57, tplayStartTi);
       }
       tplayStartTi = this.playerType;
       if (tplayStartTi != null) {
          p0.writeInt32(58, tplayStartTi);
       }
       tplayStartTi = this.hideDuration;
       if (tplayStartTi - i) {
          p0.writeUInt64(59, tplayStartTi);
       }
       tplayStartTi = this.hideCount;
       if (tplayStartTi - i) {
          p0.writeUInt64(60, tplayStartTi);
       }
       tplayStartTi = this.backgroundCount;
       if (tplayStartTi - i) {
          p0.writeUInt64(61, tplayStartTi);
       }
       tplayStartTi = this.floatingWindowBlockCnt;
       if (tplayStartTi - i) {
          p0.writeUInt64(62, tplayStartTi);
       }
       tplayStartTi = this.floatingWindowBufferTime;
       if (tplayStartTi - i) {
          p0.writeUInt64(63, tplayStartTi);
       }
       super.writeTo(p0);
       return;
    }
}
