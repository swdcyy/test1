package com.kuaishou.client.log.stat.packages.nano.ClientStat$CdnResourceLoadStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidContainer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MusicDetailPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;

public final class ClientStat$CdnResourceLoadStatEvent extends MessageNano	// class@0007b1
{
    public String bizType;
    public int cdnFailCount;
    public String cdnQosJson;
    public int cdnSuccessCount;
    public int cid;
    public long connectCost;
    public long dnsCost;
    public int downloadType;
    public long downloadedSize;
    public long expectedSize;
    public String extraMessage;
    public String host;
    public int imageType;
    public String interStExParams;
    public StidContainerProto$StidContainer interStidContainer;
    public String ip;
    public String kwaiSignature;
    public int lac;
    public boolean lastUrl;
    public int loadSource;
    public int loadStatus;
    public int mcc;
    public int mnc;
    public ClientContent$MusicDetailPackage musicDetailPackage;
    public long networkCost;
    public String photoId;
    public long queueCost;
    public int rank;
    public float ratio;
    public long requestCost;
    public String requestId;
    public int resourceType;
    public long responseCost;
    public ClientEvent$ResultPackage resultPackage;
    public long retryTimes;
    public int rssi;
    public String summary;
    public long totalCost;
    public long totalFileSize;
    public String url;
    public ClientEvent$UrlPackage urlPackage;
    public long videoDuration;
    public long waitingResponseCost;
    public String xKsCache;
    public String xKslogid;
    public static ClientStat$CdnResourceLoadStatEvent[] _emptyArray;

    public void ClientStat$CdnResourceLoadStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$CdnResourceLoadStatEvent[] emptyArray(){
       if (ClientStat$CdnResourceLoadStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$CdnResourceLoadStatEvent._emptyArray == null) {
             ClientStat$CdnResourceLoadStatEvent[] uCdnResource = new ClientStat$CdnResourceLoadStatEvent[0];
             ClientStat$CdnResourceLoadStatEvent._emptyArray = uCdnResource;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$CdnResourceLoadStatEvent._emptyArray;
    }
    public static ClientStat$CdnResourceLoadStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$CdnResourceLoadStatEvent().mergeFrom(p0);
    }
    public static ClientStat$CdnResourceLoadStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$CdnResourceLoadStatEvent(), p0);
    }
    public ClientStat$CdnResourceLoadStatEvent clear(){
       this.resourceType = 0;
       this.imageType = 0;
       this.loadSource = 0;
       this.ratio = 0;
       this.resultPackage = null;
       this.queueCost = 0;
       this.downloadedSize = 0;
       this.expectedSize = 0;
       this.url = "";
       this.host = "";
       this.ip = "";
       this.lastUrl = false;
       this.cdnFailCount = 0;
       this.cdnSuccessCount = 0;
       this.xKslogid = "";
       this.loadStatus = 0;
       this.networkCost = 0;
       this.totalCost = 0;
       this.extraMessage = "";
       this.videoDuration = 0;
       this.rank = 0;
       this.dnsCost = 0;
       this.connectCost = 0;
       this.requestCost = 0;
       this.photoId = "";
       this.totalFileSize = 0;
       this.rssi = 0;
       this.mcc = 0;
       this.mnc = 0;
       this.lac = 0;
       this.cid = 0;
       this.kwaiSignature = "";
       this.downloadType = 0;
       this.xKsCache = "";
       this.requestId = "";
       this.retryTimes = 0;
       this.cdnQosJson = "";
       this.summary = "";
       this.musicDetailPackage = null;
       this.urlPackage = null;
       this.waitingResponseCost = 0;
       this.responseCost = 0;
       this.bizType = "";
       this.interStidContainer = null;
       this.interStExParams = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$CdnResourceLoadStatEvent tresourceTyp = this.resourceType;
       if (tresourceTyp != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tresourceTyp);
       }
       tresourceTyp = this.imageType;
       if (tresourceTyp != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tresourceTyp);
       }
       tresourceTyp = this.loadSource;
       if (tresourceTyp != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tresourceTyp);
       }
       if (Float.floatToIntBits(this.ratio) != Float.floatToIntBits(0)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(4, this.ratio);
       }
       tresourceTyp = this.resultPackage;
       if (tresourceTyp != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, tresourceTyp);
       }
       tresourceTyp = this.queueCost;
       ClientStat$CdnResourceLoadStatEvent uCdnResource = null;
       if (tresourceTyp - uCdnResource) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tresourceTyp);
       }
       tresourceTyp = this.downloadedSize;
       if (tresourceTyp - uCdnResource) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tresourceTyp);
       }
       tresourceTyp = this.expectedSize;
       if (tresourceTyp - uCdnResource) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tresourceTyp);
       }
       String str = "";
       if (!(this.url).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.url);
       }
       if (!(this.host).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.host);
       }
       if (!(this.ip).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.ip);
       }
       tresourceTyp = this.lastUrl;
       if (tresourceTyp != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(12, tresourceTyp);
       }
       tresourceTyp = this.cdnFailCount;
       if (tresourceTyp != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(13, tresourceTyp);
       }
       tresourceTyp = this.cdnSuccessCount;
       if (tresourceTyp != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(14, tresourceTyp);
       }
       if (!(this.xKslogid).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(15, this.xKslogid);
       }
       tresourceTyp = this.loadStatus;
       if (tresourceTyp != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(16, tresourceTyp);
       }
       ClientStat$CdnResourceLoadStatEvent tnetworkCost = this.networkCost;
       if (tnetworkCost - uCdnResource) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(17, tnetworkCost);
       }
       tnetworkCost = this.totalCost;
       if (tnetworkCost - uCdnResource) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(18, tnetworkCost);
       }
       if (!(this.extraMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(19, this.extraMessage);
       }
       tnetworkCost = this.videoDuration;
       if (tnetworkCost - uCdnResource) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(20, tnetworkCost);
       }
       tresourceTyp = this.rank;
       if (tresourceTyp != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(21, tresourceTyp);
       }
       tnetworkCost = this.dnsCost;
       if (tnetworkCost - uCdnResource) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(22, tnetworkCost);
       }
       tnetworkCost = this.connectCost;
       if (tnetworkCost - uCdnResource) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(23, tnetworkCost);
       }
       tnetworkCost = this.requestCost;
       if (tnetworkCost - uCdnResource) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(24, tnetworkCost);
       }
       if (!(this.photoId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(25, this.photoId);
       }
       tnetworkCost = this.totalFileSize;
       if (tnetworkCost - uCdnResource) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(26, tnetworkCost);
       }
       tresourceTyp = this.rssi;
       if (tresourceTyp != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(27, tresourceTyp);
       }
       tresourceTyp = this.mcc;
       if (tresourceTyp != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(28, tresourceTyp);
       }
       tresourceTyp = this.mnc;
       if (tresourceTyp != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(29, tresourceTyp);
       }
       tresourceTyp = this.lac;
       if (tresourceTyp != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(30, tresourceTyp);
       }
       tresourceTyp = this.cid;
       if (tresourceTyp != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(31, tresourceTyp);
       }
       if (!(this.kwaiSignature).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(32, this.kwaiSignature);
       }
       tresourceTyp = this.downloadType;
       if (tresourceTyp != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(33, tresourceTyp);
       }
       if (!(this.xKsCache).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(34, this.xKsCache);
       }
       if (!(this.requestId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(35, this.requestId);
       }
       tnetworkCost = this.retryTimes;
       if (tnetworkCost - uCdnResource) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(36, tnetworkCost);
       }
       if (!(this.cdnQosJson).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(37, this.cdnQosJson);
       }
       if (!(this.summary).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(38, this.summary);
       }
       tresourceTyp = this.musicDetailPackage;
       if (tresourceTyp != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(39, tresourceTyp);
       }
       tresourceTyp = this.urlPackage;
       if (tresourceTyp != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(40, tresourceTyp);
       }
       tnetworkCost = this.waitingResponseCost;
       if (tnetworkCost - uCdnResource) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(41, tnetworkCost);
       }
       tnetworkCost = this.responseCost;
       if (tnetworkCost - uCdnResource) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(42, tnetworkCost);
       }
       if (!(this.bizType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(43, this.bizType);
       }
       tresourceTyp = this.interStidContainer;
       if (tresourceTyp != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(44, tresourceTyp);
       }
       if (!(this.interStExParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(45, this.interStExParams);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$CdnResourceLoadStatEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          int i1 = 2;
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
                    case 1:
                      break;
                    default:
                }
                this.resourceType = i;
                break;
              case 16:
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
                    case 1:
                      break;
                    default:
                }
                this.imageType = i;
                break;
              case 24:
                i = p0.readInt32();
                if (i && (i != 1 && i != i1)) {
                   continue ;
                }else {
                   this.loadSource = i;
                }
                break;
              case '%':
                this.ratio = p0.readFloat();
                break;
              case '*':
                if (this.resultPackage == null) {
                   this.resultPackage = new ClientEvent$ResultPackage();
                }
                p0.readMessage(this.resultPackage);
                break;
              case '0':
                this.queueCost = p0.readUInt64();
                break;
              case '8':
                this.downloadedSize = p0.readUInt64();
                break;
              case '@':
                this.expectedSize = p0.readUInt64();
                break;
              case 'J':
                this.url = p0.readString();
                break;
              case 'R':
                this.host = p0.readString();
                break;
              case 'Z':
                this.ip = p0.readString();
                break;
              case '`':
                this.lastUrl = p0.readBool();
                break;
              case 'h':
                this.cdnFailCount = p0.readUInt32();
                break;
              case 'p':
                this.cdnSuccessCount = p0.readUInt32();
                break;
              case 'z':
                this.xKslogid = p0.readString();
                break;
              case 128:
                i = p0.readInt32();
                if (i && (i != 1 && (i != i1 && i != 3))) {
                   continue ;
                }else {
                   this.loadStatus = i;
                }
                break;
              case 136:
                this.networkCost = p0.readUInt64();
                break;
              case 144:
                this.totalCost = p0.readUInt64();
                break;
              case 154:
                this.extraMessage = p0.readString();
                break;
              case 160:
                this.videoDuration = p0.readUInt64();
                break;
              case 168:
                this.rank = p0.readUInt32();
                break;
              case 176:
                this.dnsCost = p0.readUInt64();
                break;
              case 184:
                this.connectCost = p0.readUInt64();
                break;
              case 192:
                this.requestCost = p0.readUInt64();
                break;
              case 202:
                this.photoId = p0.readString();
                break;
              case 208:
                this.totalFileSize = p0.readUInt64();
                break;
              case 216:
                this.rssi = p0.readUInt32();
                break;
              case 224:
                this.mcc = p0.readUInt32();
                break;
              case 232:
                this.mnc = p0.readUInt32();
                break;
              case 240:
                this.lac = p0.readUInt32();
                break;
              case 248:
                this.cid = p0.readUInt32();
                break;
              case 258:
                this.kwaiSignature = p0.readString();
                break;
              case 264:
                i = p0.readInt32();
                if (i && (i != 1 && i != i1)) {
                   continue ;
                }else {
                   this.downloadType = i;
                }
                break;
              case 274:
                this.xKsCache = p0.readString();
                break;
              case 282:
                this.requestId = p0.readString();
                break;
              case 288:
                this.retryTimes = p0.readUInt64();
                break;
              case 298:
                this.cdnQosJson = p0.readString();
                break;
              case 306:
                this.summary = p0.readString();
                break;
              case 314:
                if (this.musicDetailPackage == null) {
                   this.musicDetailPackage = new ClientContent$MusicDetailPackage();
                }
                p0.readMessage(this.musicDetailPackage);
                break;
              case 322:
                if (this.urlPackage == null) {
                   this.urlPackage = new ClientEvent$UrlPackage();
                }
                p0.readMessage(this.urlPackage);
                break;
              case 328:
                this.waitingResponseCost = p0.readUInt64();
                break;
              case 336:
                this.responseCost = p0.readUInt64();
                break;
              case 346:
                this.bizType = p0.readString();
                break;
              case 354:
                if (this.interStidContainer == null) {
                   this.interStidContainer = new StidContainerProto$StidContainer();
                }
                p0.readMessage(this.interStidContainer);
                break;
              case 362:
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
       ClientStat$CdnResourceLoadStatEvent tresourceTyp = this.resourceType;
       if (tresourceTyp != null) {
          p0.writeInt32(1, tresourceTyp);
       }
       tresourceTyp = this.imageType;
       if (tresourceTyp != null) {
          p0.writeInt32(2, tresourceTyp);
       }
       tresourceTyp = this.loadSource;
       if (tresourceTyp != null) {
          p0.writeInt32(3, tresourceTyp);
       }
       if (Float.floatToIntBits(this.ratio) != Float.floatToIntBits(0)) {
          p0.writeFloat(4, this.ratio);
       }
       tresourceTyp = this.resultPackage;
       if (tresourceTyp != null) {
          p0.writeMessage(5, tresourceTyp);
       }
       tresourceTyp = this.queueCost;
       ClientStat$CdnResourceLoadStatEvent uCdnResource = null;
       if (tresourceTyp - uCdnResource) {
          p0.writeUInt64(6, tresourceTyp);
       }
       tresourceTyp = this.downloadedSize;
       if (tresourceTyp - uCdnResource) {
          p0.writeUInt64(7, tresourceTyp);
       }
       tresourceTyp = this.expectedSize;
       if (tresourceTyp - uCdnResource) {
          p0.writeUInt64(8, tresourceTyp);
       }
       String str = "";
       if (!(this.url).equals(str)) {
          p0.writeString(9, this.url);
       }
       if (!(this.host).equals(str)) {
          p0.writeString(10, this.host);
       }
       if (!(this.ip).equals(str)) {
          p0.writeString(11, this.ip);
       }
       tresourceTyp = this.lastUrl;
       if (tresourceTyp != null) {
          p0.writeBool(12, tresourceTyp);
       }
       tresourceTyp = this.cdnFailCount;
       if (tresourceTyp != null) {
          p0.writeUInt32(13, tresourceTyp);
       }
       tresourceTyp = this.cdnSuccessCount;
       if (tresourceTyp != null) {
          p0.writeUInt32(14, tresourceTyp);
       }
       if (!(this.xKslogid).equals(str)) {
          p0.writeString(15, this.xKslogid);
       }
       tresourceTyp = this.loadStatus;
       if (tresourceTyp != null) {
          p0.writeInt32(16, tresourceTyp);
       }
       ClientStat$CdnResourceLoadStatEvent tnetworkCost = this.networkCost;
       if (tnetworkCost - uCdnResource) {
          p0.writeUInt64(17, tnetworkCost);
       }
       tnetworkCost = this.totalCost;
       if (tnetworkCost - uCdnResource) {
          p0.writeUInt64(18, tnetworkCost);
       }
       if (!(this.extraMessage).equals(str)) {
          p0.writeString(19, this.extraMessage);
       }
       tnetworkCost = this.videoDuration;
       if (tnetworkCost - uCdnResource) {
          p0.writeUInt64(20, tnetworkCost);
       }
       tresourceTyp = this.rank;
       if (tresourceTyp != null) {
          p0.writeUInt32(21, tresourceTyp);
       }
       tnetworkCost = this.dnsCost;
       if (tnetworkCost - uCdnResource) {
          p0.writeUInt64(22, tnetworkCost);
       }
       tnetworkCost = this.connectCost;
       if (tnetworkCost - uCdnResource) {
          p0.writeUInt64(23, tnetworkCost);
       }
       tnetworkCost = this.requestCost;
       if (tnetworkCost - uCdnResource) {
          p0.writeUInt64(24, tnetworkCost);
       }
       if (!(this.photoId).equals(str)) {
          p0.writeString(25, this.photoId);
       }
       tnetworkCost = this.totalFileSize;
       if (tnetworkCost - uCdnResource) {
          p0.writeUInt64(26, tnetworkCost);
       }
       tresourceTyp = this.rssi;
       if (tresourceTyp != null) {
          p0.writeUInt32(27, tresourceTyp);
       }
       tresourceTyp = this.mcc;
       if (tresourceTyp != null) {
          p0.writeUInt32(28, tresourceTyp);
       }
       tresourceTyp = this.mnc;
       if (tresourceTyp != null) {
          p0.writeUInt32(29, tresourceTyp);
       }
       tresourceTyp = this.lac;
       if (tresourceTyp != null) {
          p0.writeUInt32(30, tresourceTyp);
       }
       tresourceTyp = this.cid;
       if (tresourceTyp != null) {
          p0.writeUInt32(31, tresourceTyp);
       }
       if (!(this.kwaiSignature).equals(str)) {
          p0.writeString(32, this.kwaiSignature);
       }
       tresourceTyp = this.downloadType;
       if (tresourceTyp != null) {
          p0.writeInt32(33, tresourceTyp);
       }
       if (!(this.xKsCache).equals(str)) {
          p0.writeString(34, this.xKsCache);
       }
       if (!(this.requestId).equals(str)) {
          p0.writeString(35, this.requestId);
       }
       tnetworkCost = this.retryTimes;
       if (tnetworkCost - uCdnResource) {
          p0.writeUInt64(36, tnetworkCost);
       }
       if (!(this.cdnQosJson).equals(str)) {
          p0.writeString(37, this.cdnQosJson);
       }
       if (!(this.summary).equals(str)) {
          p0.writeString(38, this.summary);
       }
       tresourceTyp = this.musicDetailPackage;
       if (tresourceTyp != null) {
          p0.writeMessage(39, tresourceTyp);
       }
       tresourceTyp = this.urlPackage;
       if (tresourceTyp != null) {
          p0.writeMessage(40, tresourceTyp);
       }
       tnetworkCost = this.waitingResponseCost;
       if (tnetworkCost - uCdnResource) {
          p0.writeUInt64(41, tnetworkCost);
       }
       tnetworkCost = this.responseCost;
       if (tnetworkCost - uCdnResource) {
          p0.writeUInt64(42, tnetworkCost);
       }
       if (!(this.bizType).equals(str)) {
          p0.writeString(43, this.bizType);
       }
       tresourceTyp = this.interStidContainer;
       if (tresourceTyp != null) {
          p0.writeMessage(44, tresourceTyp);
       }
       if (!(this.interStExParams).equals(str)) {
          p0.writeString(45, this.interStExParams);
       }
       super.writeTo(p0);
       return;
    }
}
