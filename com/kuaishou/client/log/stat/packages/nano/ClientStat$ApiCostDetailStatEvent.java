package com.kuaishou.client.log.stat.packages.nano.ClientStat$ApiCostDetailStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Float;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$ApiCostDetailStatEvent extends MessageNano	// class@00079d
{
    public long apiRequestId;
    public long buildRequestCost;
    public int bytesReceived;
    public int bytesSent;
    public int bytesToReceive;
    public int bytesToSend;
    public long connectEstablishCost;
    public long connectEstablishStart;
    public String connectionDetails;
    public long dnsCost;
    public long dnsStart;
    public int errorCode;
    public String errorDomain;
    public String errorMessage;
    public String extraCostInfo;
    public String extraMessage;
    public String host;
    public int httpCode;
    public boolean isIpv6;
    public boolean keepAlive;
    public boolean proxyUsed;
    public float ratio;
    public String region;
    public long requestCost;
    public String requestId;
    public long requestSize;
    public long requestStart;
    public long responseCost;
    public long responseSerializeCost;
    public long responseSize;
    public long responseStart;
    public String responseSummary;
    public int resultCode;
    public int serverApiCost;
    public int serverApiRecoCost;
    public int serverCost;
    public int serverTotalTiming;
    public long taskStart;
    public long totalCost;
    public String url;
    public long waitingResponseCost;
    public String xKslogid;
    public static ClientStat$ApiCostDetailStatEvent[] _emptyArray;

    public void ClientStat$ApiCostDetailStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$ApiCostDetailStatEvent[] emptyArray(){
       if (ClientStat$ApiCostDetailStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$ApiCostDetailStatEvent._emptyArray == null) {
             ClientStat$ApiCostDetailStatEvent[] uApiCostDeta = new ClientStat$ApiCostDetailStatEvent[0];
             ClientStat$ApiCostDetailStatEvent._emptyArray = uApiCostDeta;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$ApiCostDetailStatEvent._emptyArray;
    }
    public static ClientStat$ApiCostDetailStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$ApiCostDetailStatEvent().mergeFrom(p0);
    }
    public static ClientStat$ApiCostDetailStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$ApiCostDetailStatEvent(), p0);
    }
    public ClientStat$ApiCostDetailStatEvent clear(){
       this.url = "";
       this.host = "";
       this.httpCode = 0;
       this.errorDomain = "";
       this.errorCode = 0;
       this.keepAlive = false;
       this.dnsStart = 0;
       this.dnsCost = 0;
       this.connectEstablishStart = 0;
       this.connectEstablishCost = 0;
       this.requestStart = 0;
       this.requestCost = 0;
       this.requestSize = 0;
       this.responseStart = 0;
       this.responseCost = 0;
       this.responseSize = 0;
       this.waitingResponseCost = 0;
       this.totalCost = 0;
       this.proxyUsed = false;
       this.ratio = 0;
       this.requestId = "";
       this.xKslogid = "";
       this.bytesToSend = 0;
       this.bytesSent = 0;
       this.bytesToReceive = 0;
       this.bytesReceived = 0;
       this.taskStart = 0;
       this.responseSummary = "";
       this.errorMessage = "";
       this.apiRequestId = 0;
       this.connectionDetails = "";
       this.isIpv6 = false;
       this.region = "";
       this.responseSerializeCost = 0;
       this.resultCode = 0;
       this.buildRequestCost = 0;
       this.extraCostInfo = "";
       this.extraMessage = "";
       this.serverTotalTiming = 0;
       this.serverCost = 0;
       this.serverApiCost = 0;
       this.serverApiRecoCost = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.url).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.url);
       }
       if (!(this.host).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.host);
       }
       ClientStat$ApiCostDetailStatEvent thttpCode = this.httpCode;
       if (thttpCode != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, thttpCode);
       }
       if (!(this.errorDomain).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.errorDomain);
       }
       thttpCode = this.errorCode;
       if (thttpCode != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, thttpCode);
       }
       thttpCode = this.keepAlive;
       if (thttpCode != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, thttpCode);
       }
       ClientStat$ApiCostDetailStatEvent tdnsStart = this.dnsStart;
       if (tdnsStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tdnsStart);
       }
       tdnsStart = this.dnsCost;
       if (tdnsStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tdnsStart);
       }
       tdnsStart = this.connectEstablishStart;
       if (tdnsStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, tdnsStart);
       }
       tdnsStart = this.connectEstablishCost;
       if (tdnsStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(10, tdnsStart);
       }
       tdnsStart = this.requestStart;
       if (tdnsStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(11, tdnsStart);
       }
       tdnsStart = this.requestCost;
       if (tdnsStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(12, tdnsStart);
       }
       tdnsStart = this.requestSize;
       if (tdnsStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(13, tdnsStart);
       }
       tdnsStart = this.responseStart;
       if (tdnsStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(14, tdnsStart);
       }
       tdnsStart = this.responseCost;
       if (tdnsStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(15, tdnsStart);
       }
       tdnsStart = this.responseSize;
       if (tdnsStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(16, tdnsStart);
       }
       tdnsStart = this.waitingResponseCost;
       if (tdnsStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(17, tdnsStart);
       }
       tdnsStart = this.totalCost;
       if (tdnsStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(18, tdnsStart);
       }
       thttpCode = this.proxyUsed;
       if (thttpCode != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(19, thttpCode);
       }
       if (Float.floatToIntBits(this.ratio) != Float.floatToIntBits(0)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(20, this.ratio);
       }
       if (!(this.requestId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(21, this.requestId);
       }
       if (!(this.xKslogid).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(22, this.xKslogid);
       }
       thttpCode = this.bytesToSend;
       if (thttpCode != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(23, thttpCode);
       }
       thttpCode = this.bytesSent;
       if (thttpCode != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(24, thttpCode);
       }
       thttpCode = this.bytesToReceive;
       if (thttpCode != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(25, thttpCode);
       }
       thttpCode = this.bytesReceived;
       if (thttpCode != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(26, thttpCode);
       }
       tdnsStart = this.taskStart;
       if (tdnsStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(27, tdnsStart);
       }
       if (!(this.responseSummary).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(28, this.responseSummary);
       }
       if (!(this.errorMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(29, this.errorMessage);
       }
       tdnsStart = this.apiRequestId;
       if (tdnsStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(30, tdnsStart);
       }
       if (!(this.connectionDetails).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(31, this.connectionDetails);
       }
       thttpCode = this.isIpv6;
       if (thttpCode != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(32, thttpCode);
       }
       if (!(this.region).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(33, this.region);
       }
       tdnsStart = this.responseSerializeCost;
       if (tdnsStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(34, tdnsStart);
       }
       thttpCode = this.resultCode;
       if (thttpCode != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(35, thttpCode);
       }
       tdnsStart = this.buildRequestCost;
       if (tdnsStart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(36, tdnsStart);
       }
       if (!(this.extraCostInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(37, this.extraCostInfo);
       }
       if (!(this.extraMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(38, this.extraMessage);
       }
       thttpCode = this.serverTotalTiming;
       if (thttpCode != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(39, thttpCode);
       }
       thttpCode = this.serverCost;
       if (thttpCode != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(40, thttpCode);
       }
       thttpCode = this.serverApiCost;
       if (thttpCode != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(41, thttpCode);
       }
       thttpCode = this.serverApiRecoCost;
       if (thttpCode != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(42, thttpCode);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$ApiCostDetailStatEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.url = p0.readString();
                break;
              case 18:
                this.host = p0.readString();
                break;
              case 24:
                this.httpCode = p0.readInt32();
                break;
              case '"':
                this.errorDomain = p0.readString();
                break;
              case '(':
                this.errorCode = p0.readInt32();
                break;
              case '0':
                this.keepAlive = p0.readBool();
                break;
              case '8':
                this.dnsStart = p0.readUInt64();
                break;
              case '@':
                this.dnsCost = p0.readUInt64();
                break;
              case 'H':
                this.connectEstablishStart = p0.readUInt64();
                break;
              case 'P':
                this.connectEstablishCost = p0.readUInt64();
                break;
              case 'X':
                this.requestStart = p0.readUInt64();
                break;
              case '`':
                this.requestCost = p0.readUInt64();
                break;
              case 'h':
                this.requestSize = p0.readUInt64();
                break;
              case 'p':
                this.responseStart = p0.readUInt64();
                break;
              case 'x':
                this.responseCost = p0.readUInt64();
                break;
              case 128:
                this.responseSize = p0.readUInt64();
                break;
              case 136:
                this.waitingResponseCost = p0.readUInt64();
                break;
              case 144:
                this.totalCost = p0.readUInt64();
                break;
              case 152:
                this.proxyUsed = p0.readBool();
                break;
              case 165:
                this.ratio = p0.readFloat();
                break;
              case 170:
                this.requestId = p0.readString();
                break;
              case 178:
                this.xKslogid = p0.readString();
                break;
              case 184:
                this.bytesToSend = p0.readInt32();
                break;
              case 192:
                this.bytesSent = p0.readInt32();
                break;
              case 200:
                this.bytesToReceive = p0.readInt32();
                break;
              case 208:
                this.bytesReceived = p0.readInt32();
                break;
              case 216:
                this.taskStart = p0.readUInt64();
                break;
              case 226:
                this.responseSummary = p0.readString();
                break;
              case 234:
                this.errorMessage = p0.readString();
                break;
              case 240:
                this.apiRequestId = p0.readUInt64();
                break;
              case 250:
                this.connectionDetails = p0.readString();
                break;
              case 256:
                this.isIpv6 = p0.readBool();
                break;
              case 266:
                this.region = p0.readString();
                break;
              case 272:
                this.responseSerializeCost = p0.readUInt64();
                break;
              case 280:
                this.resultCode = p0.readInt32();
                break;
              case 288:
                this.buildRequestCost = p0.readUInt64();
                break;
              case 298:
                this.extraCostInfo = p0.readString();
                break;
              case 306:
                this.extraMessage = p0.readString();
                break;
              case 312:
                this.serverTotalTiming = p0.readInt32();
                break;
              case 320:
                this.serverCost = p0.readInt32();
                break;
              case 328:
                this.serverApiCost = p0.readInt32();
                break;
              case 336:
                this.serverApiRecoCost = p0.readInt32();
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
       if (!(this.url).equals(str)) {
          p0.writeString(1, this.url);
       }
       if (!(this.host).equals(str)) {
          p0.writeString(2, this.host);
       }
       ClientStat$ApiCostDetailStatEvent thttpCode = this.httpCode;
       if (thttpCode != null) {
          p0.writeInt32(3, thttpCode);
       }
       if (!(this.errorDomain).equals(str)) {
          p0.writeString(4, this.errorDomain);
       }
       thttpCode = this.errorCode;
       if (thttpCode != null) {
          p0.writeInt32(5, thttpCode);
       }
       thttpCode = this.keepAlive;
       if (thttpCode != null) {
          p0.writeBool(6, thttpCode);
       }
       ClientStat$ApiCostDetailStatEvent tdnsStart = this.dnsStart;
       if (tdnsStart) {
          p0.writeUInt64(7, tdnsStart);
       }
       tdnsStart = this.dnsCost;
       if (tdnsStart) {
          p0.writeUInt64(8, tdnsStart);
       }
       tdnsStart = this.connectEstablishStart;
       if (tdnsStart) {
          p0.writeUInt64(9, tdnsStart);
       }
       tdnsStart = this.connectEstablishCost;
       if (tdnsStart) {
          p0.writeUInt64(10, tdnsStart);
       }
       tdnsStart = this.requestStart;
       if (tdnsStart) {
          p0.writeUInt64(11, tdnsStart);
       }
       tdnsStart = this.requestCost;
       if (tdnsStart) {
          p0.writeUInt64(12, tdnsStart);
       }
       tdnsStart = this.requestSize;
       if (tdnsStart) {
          p0.writeUInt64(13, tdnsStart);
       }
       tdnsStart = this.responseStart;
       if (tdnsStart) {
          p0.writeUInt64(14, tdnsStart);
       }
       tdnsStart = this.responseCost;
       if (tdnsStart) {
          p0.writeUInt64(15, tdnsStart);
       }
       tdnsStart = this.responseSize;
       if (tdnsStart) {
          p0.writeUInt64(16, tdnsStart);
       }
       tdnsStart = this.waitingResponseCost;
       if (tdnsStart) {
          p0.writeUInt64(17, tdnsStart);
       }
       tdnsStart = this.totalCost;
       if (tdnsStart) {
          p0.writeUInt64(18, tdnsStart);
       }
       thttpCode = this.proxyUsed;
       if (thttpCode != null) {
          p0.writeBool(19, thttpCode);
       }
       if (Float.floatToIntBits(this.ratio) != Float.floatToIntBits(0)) {
          p0.writeFloat(20, this.ratio);
       }
       if (!(this.requestId).equals(str)) {
          p0.writeString(21, this.requestId);
       }
       if (!(this.xKslogid).equals(str)) {
          p0.writeString(22, this.xKslogid);
       }
       thttpCode = this.bytesToSend;
       if (thttpCode != null) {
          p0.writeInt32(23, thttpCode);
       }
       thttpCode = this.bytesSent;
       if (thttpCode != null) {
          p0.writeInt32(24, thttpCode);
       }
       thttpCode = this.bytesToReceive;
       if (thttpCode != null) {
          p0.writeInt32(25, thttpCode);
       }
       thttpCode = this.bytesReceived;
       if (thttpCode != null) {
          p0.writeInt32(26, thttpCode);
       }
       tdnsStart = this.taskStart;
       if (tdnsStart) {
          p0.writeUInt64(27, tdnsStart);
       }
       if (!(this.responseSummary).equals(str)) {
          p0.writeString(28, this.responseSummary);
       }
       if (!(this.errorMessage).equals(str)) {
          p0.writeString(29, this.errorMessage);
       }
       tdnsStart = this.apiRequestId;
       if (tdnsStart) {
          p0.writeUInt64(30, tdnsStart);
       }
       if (!(this.connectionDetails).equals(str)) {
          p0.writeString(31, this.connectionDetails);
       }
       thttpCode = this.isIpv6;
       if (thttpCode != null) {
          p0.writeBool(32, thttpCode);
       }
       if (!(this.region).equals(str)) {
          p0.writeString(33, this.region);
       }
       tdnsStart = this.responseSerializeCost;
       if (tdnsStart) {
          p0.writeUInt64(34, tdnsStart);
       }
       thttpCode = this.resultCode;
       if (thttpCode != null) {
          p0.writeInt32(35, thttpCode);
       }
       tdnsStart = this.buildRequestCost;
       if (tdnsStart) {
          p0.writeUInt64(36, tdnsStart);
       }
       if (!(this.extraCostInfo).equals(str)) {
          p0.writeString(37, this.extraCostInfo);
       }
       if (!(this.extraMessage).equals(str)) {
          p0.writeString(38, this.extraMessage);
       }
       thttpCode = this.serverTotalTiming;
       if (thttpCode != null) {
          p0.writeInt32(39, thttpCode);
       }
       thttpCode = this.serverCost;
       if (thttpCode != null) {
          p0.writeInt32(40, thttpCode);
       }
       thttpCode = this.serverApiCost;
       if (thttpCode != null) {
          p0.writeInt32(41, thttpCode);
       }
       thttpCode = this.serverApiRecoCost;
       if (thttpCode != null) {
          p0.writeInt32(42, thttpCode);
       }
       super.writeTo(p0);
       return;
    }
}
