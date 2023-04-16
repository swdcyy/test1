package com.kuaishou.client.log.stat.packages.nano.ClientStat$AegonConnectionStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$AegonConnectionStatEvent extends MessageNano	// class@000794
{
    public long bytesReceived;
    public long bytesRetransmitted;
    public long bytesSent;
    public int cipherSuite;
    public int clientHellos;
    public boolean closedByServer;
    public long connectedDurationMs;
    public String connectionId;
    public int consecutiveRtoCnt;
    public int consecutiveTlpCnt;
    public long dnsCostMs;
    public long estimatedBandwidthKbps;
    public String extraInfo;
    public boolean handshakeConfirmed;
    public boolean hasInFlightPackets;
    public String host;
    public int nettype;
    public int numActiveStreams;
    public int numMigrations;
    public int numTotalStreams;
    public long packetsDropped;
    public long packetsLost;
    public long packetsReceived;
    public long packetsReordered;
    public long packetsRetransmitted;
    public long packetsSent;
    public boolean pathDegradingDetected;
    public String protocol;
    public String quicErrorCode;
    public String remoteEndpoint;
    public long rxPacketsLost;
    public long srttUs;
    public long sslCostMs;
    public static ClientStat$AegonConnectionStatEvent[] _emptyArray;

    public void ClientStat$AegonConnectionStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$AegonConnectionStatEvent[] emptyArray(){
       if (ClientStat$AegonConnectionStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$AegonConnectionStatEvent._emptyArray == null) {
             ClientStat$AegonConnectionStatEvent[] uAegonConnec = new ClientStat$AegonConnectionStatEvent[0];
             ClientStat$AegonConnectionStatEvent._emptyArray = uAegonConnec;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$AegonConnectionStatEvent._emptyArray;
    }
    public static ClientStat$AegonConnectionStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$AegonConnectionStatEvent().mergeFrom(p0);
    }
    public static ClientStat$AegonConnectionStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$AegonConnectionStatEvent(), p0);
    }
    public ClientStat$AegonConnectionStatEvent clear(){
       this.host = "";
       this.nettype = 0;
       this.remoteEndpoint = "";
       this.clientHellos = 0;
       this.connectionId = "";
       this.consecutiveRtoCnt = 0;
       this.consecutiveTlpCnt = 0;
       this.hasInFlightPackets = false;
       this.protocol = "";
       this.closedByServer = false;
       this.handshakeConfirmed = false;
       this.numActiveStreams = 0;
       this.numTotalStreams = 0;
       this.pathDegradingDetected = false;
       this.quicErrorCode = "";
       this.numMigrations = 0;
       this.cipherSuite = 0;
       this.dnsCostMs = 0;
       this.sslCostMs = 0;
       this.connectedDurationMs = 0;
       this.bytesReceived = 0;
       this.bytesRetransmitted = 0;
       this.bytesSent = 0;
       this.estimatedBandwidthKbps = 0;
       this.srttUs = 0;
       this.rxPacketsLost = 0;
       this.packetsDropped = 0;
       this.packetsLost = 0;
       this.packetsReceived = 0;
       this.packetsReordered = 0;
       this.packetsRetransmitted = 0;
       this.packetsSent = 0;
       this.extraInfo = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.host).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.host);
       }
       ClientStat$AegonConnectionStatEvent tnettype = this.nettype;
       if (tnettype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tnettype);
       }
       if (!(this.remoteEndpoint).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.remoteEndpoint);
       }
       tnettype = this.clientHellos;
       if (tnettype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tnettype);
       }
       if (!(this.connectionId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.connectionId);
       }
       tnettype = this.consecutiveRtoCnt;
       if (tnettype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tnettype);
       }
       tnettype = this.consecutiveTlpCnt;
       if (tnettype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(7, tnettype);
       }
       tnettype = this.hasInFlightPackets;
       if (tnettype != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(8, tnettype);
       }
       if (!(this.protocol).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.protocol);
       }
       tnettype = this.closedByServer;
       if (tnettype != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(10, tnettype);
       }
       tnettype = this.handshakeConfirmed;
       if (tnettype != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(11, tnettype);
       }
       tnettype = this.numActiveStreams;
       if (tnettype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(12, tnettype);
       }
       tnettype = this.numTotalStreams;
       if (tnettype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(13, tnettype);
       }
       tnettype = this.pathDegradingDetected;
       if (tnettype != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(14, tnettype);
       }
       if (!(this.quicErrorCode).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(15, this.quicErrorCode);
       }
       tnettype = this.numMigrations;
       if (tnettype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(16, tnettype);
       }
       tnettype = this.cipherSuite;
       if (tnettype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(17, tnettype);
       }
       ClientStat$AegonConnectionStatEvent tdnsCostMs = this.dnsCostMs;
       if (tdnsCostMs) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(18, tdnsCostMs);
       }
       tdnsCostMs = this.sslCostMs;
       if (tdnsCostMs) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(19, tdnsCostMs);
       }
       tdnsCostMs = this.connectedDurationMs;
       if (tdnsCostMs) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(20, tdnsCostMs);
       }
       tdnsCostMs = this.bytesReceived;
       if (tdnsCostMs) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(21, tdnsCostMs);
       }
       tdnsCostMs = this.bytesRetransmitted;
       if (tdnsCostMs) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(22, tdnsCostMs);
       }
       tdnsCostMs = this.bytesSent;
       if (tdnsCostMs) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(23, tdnsCostMs);
       }
       tdnsCostMs = this.estimatedBandwidthKbps;
       if (tdnsCostMs) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(24, tdnsCostMs);
       }
       tdnsCostMs = this.srttUs;
       if (tdnsCostMs) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(25, tdnsCostMs);
       }
       tdnsCostMs = this.rxPacketsLost;
       if (tdnsCostMs) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(26, tdnsCostMs);
       }
       tdnsCostMs = this.packetsDropped;
       if (tdnsCostMs) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(27, tdnsCostMs);
       }
       tdnsCostMs = this.packetsLost;
       if (tdnsCostMs) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(28, tdnsCostMs);
       }
       tdnsCostMs = this.packetsReceived;
       if (tdnsCostMs) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(29, tdnsCostMs);
       }
       tdnsCostMs = this.packetsReordered;
       if (tdnsCostMs) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(30, tdnsCostMs);
       }
       tdnsCostMs = this.packetsRetransmitted;
       if (tdnsCostMs) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(31, tdnsCostMs);
       }
       tdnsCostMs = this.packetsSent;
       if (tdnsCostMs) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(32, tdnsCostMs);
       }
       if (!(this.extraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(33, this.extraInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$AegonConnectionStatEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.host = p0.readString();
                break;
              case 16:
                this.nettype = p0.readInt32();
                break;
              case 26:
                this.remoteEndpoint = p0.readString();
                break;
              case 32:
                this.clientHellos = p0.readInt32();
                break;
              case '*':
                this.connectionId = p0.readString();
                break;
              case '0':
                this.consecutiveRtoCnt = p0.readInt32();
                break;
              case '8':
                this.consecutiveTlpCnt = p0.readInt32();
                break;
              case '@':
                this.hasInFlightPackets = p0.readBool();
                break;
              case 'J':
                this.protocol = p0.readString();
                break;
              case 'P':
                this.closedByServer = p0.readBool();
                break;
              case 'X':
                this.handshakeConfirmed = p0.readBool();
                break;
              case '`':
                this.numActiveStreams = p0.readInt32();
                break;
              case 'h':
                this.numTotalStreams = p0.readInt32();
                break;
              case 'p':
                this.pathDegradingDetected = p0.readBool();
                break;
              case 'z':
                this.quicErrorCode = p0.readString();
                break;
              case 128:
                this.numMigrations = p0.readInt32();
                break;
              case 136:
                this.cipherSuite = p0.readInt32();
                break;
              case 144:
                this.dnsCostMs = p0.readInt64();
                break;
              case 152:
                this.sslCostMs = p0.readInt64();
                break;
              case 160:
                this.connectedDurationMs = p0.readInt64();
                break;
              case 168:
                this.bytesReceived = p0.readInt64();
                break;
              case 176:
                this.bytesRetransmitted = p0.readInt64();
                break;
              case 184:
                this.bytesSent = p0.readInt64();
                break;
              case 192:
                this.estimatedBandwidthKbps = p0.readInt64();
                break;
              case 200:
                this.srttUs = p0.readInt64();
                break;
              case 208:
                this.rxPacketsLost = p0.readInt64();
                break;
              case 216:
                this.packetsDropped = p0.readInt64();
                break;
              case 224:
                this.packetsLost = p0.readInt64();
                break;
              case 232:
                this.packetsReceived = p0.readInt64();
                break;
              case 240:
                this.packetsReordered = p0.readInt64();
                break;
              case 248:
                this.packetsRetransmitted = p0.readInt64();
                break;
              case 256:
                this.packetsSent = p0.readInt64();
                break;
              case 266:
                this.extraInfo = p0.readString();
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
       if (!(this.host).equals(str)) {
          p0.writeString(1, this.host);
       }
       ClientStat$AegonConnectionStatEvent tnettype = this.nettype;
       if (tnettype != null) {
          p0.writeInt32(2, tnettype);
       }
       if (!(this.remoteEndpoint).equals(str)) {
          p0.writeString(3, this.remoteEndpoint);
       }
       tnettype = this.clientHellos;
       if (tnettype != null) {
          p0.writeInt32(4, tnettype);
       }
       if (!(this.connectionId).equals(str)) {
          p0.writeString(5, this.connectionId);
       }
       tnettype = this.consecutiveRtoCnt;
       if (tnettype != null) {
          p0.writeInt32(6, tnettype);
       }
       tnettype = this.consecutiveTlpCnt;
       if (tnettype != null) {
          p0.writeInt32(7, tnettype);
       }
       tnettype = this.hasInFlightPackets;
       if (tnettype != null) {
          p0.writeBool(8, tnettype);
       }
       if (!(this.protocol).equals(str)) {
          p0.writeString(9, this.protocol);
       }
       tnettype = this.closedByServer;
       if (tnettype != null) {
          p0.writeBool(10, tnettype);
       }
       tnettype = this.handshakeConfirmed;
       if (tnettype != null) {
          p0.writeBool(11, tnettype);
       }
       tnettype = this.numActiveStreams;
       if (tnettype != null) {
          p0.writeInt32(12, tnettype);
       }
       tnettype = this.numTotalStreams;
       if (tnettype != null) {
          p0.writeInt32(13, tnettype);
       }
       tnettype = this.pathDegradingDetected;
       if (tnettype != null) {
          p0.writeBool(14, tnettype);
       }
       if (!(this.quicErrorCode).equals(str)) {
          p0.writeString(15, this.quicErrorCode);
       }
       tnettype = this.numMigrations;
       if (tnettype != null) {
          p0.writeInt32(16, tnettype);
       }
       tnettype = this.cipherSuite;
       if (tnettype != null) {
          p0.writeInt32(17, tnettype);
       }
       ClientStat$AegonConnectionStatEvent tdnsCostMs = this.dnsCostMs;
       if (tdnsCostMs) {
          p0.writeInt64(18, tdnsCostMs);
       }
       tdnsCostMs = this.sslCostMs;
       if (tdnsCostMs) {
          p0.writeInt64(19, tdnsCostMs);
       }
       tdnsCostMs = this.connectedDurationMs;
       if (tdnsCostMs) {
          p0.writeInt64(20, tdnsCostMs);
       }
       tdnsCostMs = this.bytesReceived;
       if (tdnsCostMs) {
          p0.writeInt64(21, tdnsCostMs);
       }
       tdnsCostMs = this.bytesRetransmitted;
       if (tdnsCostMs) {
          p0.writeInt64(22, tdnsCostMs);
       }
       tdnsCostMs = this.bytesSent;
       if (tdnsCostMs) {
          p0.writeInt64(23, tdnsCostMs);
       }
       tdnsCostMs = this.estimatedBandwidthKbps;
       if (tdnsCostMs) {
          p0.writeInt64(24, tdnsCostMs);
       }
       tdnsCostMs = this.srttUs;
       if (tdnsCostMs) {
          p0.writeInt64(25, tdnsCostMs);
       }
       tdnsCostMs = this.rxPacketsLost;
       if (tdnsCostMs) {
          p0.writeInt64(26, tdnsCostMs);
       }
       tdnsCostMs = this.packetsDropped;
       if (tdnsCostMs) {
          p0.writeInt64(27, tdnsCostMs);
       }
       tdnsCostMs = this.packetsLost;
       if (tdnsCostMs) {
          p0.writeInt64(28, tdnsCostMs);
       }
       tdnsCostMs = this.packetsReceived;
       if (tdnsCostMs) {
          p0.writeInt64(29, tdnsCostMs);
       }
       tdnsCostMs = this.packetsReordered;
       if (tdnsCostMs) {
          p0.writeInt64(30, tdnsCostMs);
       }
       tdnsCostMs = this.packetsRetransmitted;
       if (tdnsCostMs) {
          p0.writeInt64(31, tdnsCostMs);
       }
       tdnsCostMs = this.packetsSent;
       if (tdnsCostMs) {
          p0.writeInt64(32, tdnsCostMs);
       }
       if (!(this.extraInfo).equals(str)) {
          p0.writeString(33, this.extraInfo);
       }
       super.writeTo(p0);
       return;
    }
}
