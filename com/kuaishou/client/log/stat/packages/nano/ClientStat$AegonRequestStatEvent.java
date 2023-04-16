package com.kuaishou.client.log.stat.packages.nano.ClientStat$AegonRequestStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$AegonRequestStatEvent extends MessageNano	// class@000795
{
    public String aegonVersion;
    public long bodyRecvCostMs;
    public boolean cached;
    public int clientHellos;
    public long connectionCostMs;
    public String consumer;
    public String contentEncoding;
    public long dnsCostMs;
    public int errorCode;
    public String extraInfo;
    public long headerRecvCostMs;
    public int httpCode;
    public boolean ipv6Reachable;
    public String method;
    public int nettype;
    public String protocol;
    public int quicBroken;
    public int quicBrokenError;
    public long receivedBytes;
    public long redirectCostMs;
    public long requestSendCostMs;
    public long sentBytes;
    public boolean socketReused;
    public long sslCostMs;
    public int sslHandshakeType;
    public long tcpCostMs;
    public long totalCostMs;
    public String url;
    public boolean viaIpv6;
    public boolean viaProxy;
    public long waitingCostMs;
    public static ClientStat$AegonRequestStatEvent[] _emptyArray;

    public void ClientStat$AegonRequestStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$AegonRequestStatEvent[] emptyArray(){
       if (ClientStat$AegonRequestStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$AegonRequestStatEvent._emptyArray == null) {
             ClientStat$AegonRequestStatEvent[] uAegonReques = new ClientStat$AegonRequestStatEvent[0];
             ClientStat$AegonRequestStatEvent._emptyArray = uAegonReques;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$AegonRequestStatEvent._emptyArray;
    }
    public static ClientStat$AegonRequestStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$AegonRequestStatEvent().mergeFrom(p0);
    }
    public static ClientStat$AegonRequestStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$AegonRequestStatEvent(), p0);
    }
    public ClientStat$AegonRequestStatEvent clear(){
       this.errorCode = 0;
       this.url = "";
       this.method = "";
       this.nettype = 0;
       this.ipv6Reachable = false;
       this.consumer = "";
       this.aegonVersion = "";
       this.cached = false;
       this.httpCode = 0;
       this.protocol = "";
       this.receivedBytes = 0;
       this.sentBytes = 0;
       this.viaProxy = false;
       this.contentEncoding = "";
       this.viaIpv6 = false;
       this.socketReused = false;
       this.sslHandshakeType = 0;
       this.quicBroken = 0;
       this.quicBrokenError = 0;
       this.clientHellos = 0;
       this.dnsCostMs = 0;
       this.tcpCostMs = 0;
       this.sslCostMs = 0;
       this.connectionCostMs = 0;
       this.requestSendCostMs = 0;
       this.waitingCostMs = 0;
       this.headerRecvCostMs = 0;
       this.redirectCostMs = 0;
       this.bodyRecvCostMs = 0;
       this.totalCostMs = 0;
       this.extraInfo = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$AegonRequestStatEvent terrorCode = this.errorCode;
       if (terrorCode != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, terrorCode);
       }
       String str = "";
       if (!(this.url).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.url);
       }
       if (!(this.method).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.method);
       }
       terrorCode = this.nettype;
       if (terrorCode != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, terrorCode);
       }
       terrorCode = this.ipv6Reachable;
       if (terrorCode != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, terrorCode);
       }
       if (!(this.consumer).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.consumer);
       }
       if (!(this.aegonVersion).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.aegonVersion);
       }
       terrorCode = this.cached;
       if (terrorCode != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(8, terrorCode);
       }
       terrorCode = this.httpCode;
       if (terrorCode != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(9, terrorCode);
       }
       if (!(this.protocol).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.protocol);
       }
       ClientStat$AegonRequestStatEvent treceivedByt = this.receivedBytes;
       if (treceivedByt) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(11, treceivedByt);
       }
       treceivedByt = this.sentBytes;
       if (treceivedByt) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(12, treceivedByt);
       }
       terrorCode = this.viaProxy;
       if (terrorCode != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(13, terrorCode);
       }
       if (!(this.contentEncoding).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.contentEncoding);
       }
       terrorCode = this.viaIpv6;
       if (terrorCode != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(15, terrorCode);
       }
       terrorCode = this.socketReused;
       if (terrorCode != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(16, terrorCode);
       }
       terrorCode = this.sslHandshakeType;
       if (terrorCode != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(17, terrorCode);
       }
       terrorCode = this.quicBroken;
       if (terrorCode != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(18, terrorCode);
       }
       terrorCode = this.quicBrokenError;
       if (terrorCode != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(19, terrorCode);
       }
       terrorCode = this.clientHellos;
       if (terrorCode != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(20, terrorCode);
       }
       treceivedByt = this.dnsCostMs;
       if (treceivedByt) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(21, treceivedByt);
       }
       treceivedByt = this.tcpCostMs;
       if (treceivedByt) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(22, treceivedByt);
       }
       treceivedByt = this.sslCostMs;
       if (treceivedByt) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(23, treceivedByt);
       }
       treceivedByt = this.connectionCostMs;
       if (treceivedByt) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(24, treceivedByt);
       }
       treceivedByt = this.requestSendCostMs;
       if (treceivedByt) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(25, treceivedByt);
       }
       treceivedByt = this.waitingCostMs;
       if (treceivedByt) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(26, treceivedByt);
       }
       treceivedByt = this.headerRecvCostMs;
       if (treceivedByt) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(27, treceivedByt);
       }
       treceivedByt = this.redirectCostMs;
       if (treceivedByt) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(28, treceivedByt);
       }
       treceivedByt = this.bodyRecvCostMs;
       if (treceivedByt) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(29, treceivedByt);
       }
       treceivedByt = this.totalCostMs;
       if (treceivedByt) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(30, treceivedByt);
       }
       if (!(this.extraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(31, this.extraInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$AegonRequestStatEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
                this.errorCode = p0.readInt32();
                break;
              case 18:
                this.url = p0.readString();
                break;
              case 26:
                this.method = p0.readString();
                break;
              case 32:
                this.nettype = p0.readInt32();
                break;
              case '(':
                this.ipv6Reachable = p0.readBool();
                break;
              case '2':
                this.consumer = p0.readString();
                break;
              case ':':
                this.aegonVersion = p0.readString();
                break;
              case '@':
                this.cached = p0.readBool();
                break;
              case 'H':
                this.httpCode = p0.readInt32();
                break;
              case 'R':
                this.protocol = p0.readString();
                break;
              case 'X':
                this.receivedBytes = p0.readUInt64();
                break;
              case '`':
                this.sentBytes = p0.readUInt64();
                break;
              case 'h':
                this.viaProxy = p0.readBool();
                break;
              case 'r':
                this.contentEncoding = p0.readString();
                break;
              case 'x':
                this.viaIpv6 = p0.readBool();
                break;
              case 128:
                this.socketReused = p0.readBool();
                break;
              case 136:
                this.sslHandshakeType = p0.readInt32();
                break;
              case 144:
                this.quicBroken = p0.readInt32();
                break;
              case 152:
                this.quicBrokenError = p0.readInt32();
                break;
              case 160:
                this.clientHellos = p0.readInt32();
                break;
              case 168:
                this.dnsCostMs = p0.readUInt64();
                break;
              case 176:
                this.tcpCostMs = p0.readUInt64();
                break;
              case 184:
                this.sslCostMs = p0.readUInt64();
                break;
              case 192:
                this.connectionCostMs = p0.readUInt64();
                break;
              case 200:
                this.requestSendCostMs = p0.readUInt64();
                break;
              case 208:
                this.waitingCostMs = p0.readUInt64();
                break;
              case 216:
                this.headerRecvCostMs = p0.readUInt64();
                break;
              case 224:
                this.redirectCostMs = p0.readUInt64();
                break;
              case 232:
                this.bodyRecvCostMs = p0.readUInt64();
                break;
              case 240:
                this.totalCostMs = p0.readUInt64();
                break;
              case 250:
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
       ClientStat$AegonRequestStatEvent terrorCode = this.errorCode;
       if (terrorCode != null) {
          p0.writeInt32(1, terrorCode);
       }
       String str = "";
       if (!(this.url).equals(str)) {
          p0.writeString(2, this.url);
       }
       if (!(this.method).equals(str)) {
          p0.writeString(3, this.method);
       }
       terrorCode = this.nettype;
       if (terrorCode != null) {
          p0.writeInt32(4, terrorCode);
       }
       terrorCode = this.ipv6Reachable;
       if (terrorCode != null) {
          p0.writeBool(5, terrorCode);
       }
       if (!(this.consumer).equals(str)) {
          p0.writeString(6, this.consumer);
       }
       if (!(this.aegonVersion).equals(str)) {
          p0.writeString(7, this.aegonVersion);
       }
       terrorCode = this.cached;
       if (terrorCode != null) {
          p0.writeBool(8, terrorCode);
       }
       terrorCode = this.httpCode;
       if (terrorCode != null) {
          p0.writeInt32(9, terrorCode);
       }
       if (!(this.protocol).equals(str)) {
          p0.writeString(10, this.protocol);
       }
       ClientStat$AegonRequestStatEvent treceivedByt = this.receivedBytes;
       if (treceivedByt) {
          p0.writeUInt64(11, treceivedByt);
       }
       treceivedByt = this.sentBytes;
       if (treceivedByt) {
          p0.writeUInt64(12, treceivedByt);
       }
       terrorCode = this.viaProxy;
       if (terrorCode != null) {
          p0.writeBool(13, terrorCode);
       }
       if (!(this.contentEncoding).equals(str)) {
          p0.writeString(14, this.contentEncoding);
       }
       terrorCode = this.viaIpv6;
       if (terrorCode != null) {
          p0.writeBool(15, terrorCode);
       }
       terrorCode = this.socketReused;
       if (terrorCode != null) {
          p0.writeBool(16, terrorCode);
       }
       terrorCode = this.sslHandshakeType;
       if (terrorCode != null) {
          p0.writeInt32(17, terrorCode);
       }
       terrorCode = this.quicBroken;
       if (terrorCode != null) {
          p0.writeInt32(18, terrorCode);
       }
       terrorCode = this.quicBrokenError;
       if (terrorCode != null) {
          p0.writeInt32(19, terrorCode);
       }
       terrorCode = this.clientHellos;
       if (terrorCode != null) {
          p0.writeInt32(20, terrorCode);
       }
       treceivedByt = this.dnsCostMs;
       if (treceivedByt) {
          p0.writeUInt64(21, treceivedByt);
       }
       treceivedByt = this.tcpCostMs;
       if (treceivedByt) {
          p0.writeUInt64(22, treceivedByt);
       }
       treceivedByt = this.sslCostMs;
       if (treceivedByt) {
          p0.writeUInt64(23, treceivedByt);
       }
       treceivedByt = this.connectionCostMs;
       if (treceivedByt) {
          p0.writeUInt64(24, treceivedByt);
       }
       treceivedByt = this.requestSendCostMs;
       if (treceivedByt) {
          p0.writeUInt64(25, treceivedByt);
       }
       treceivedByt = this.waitingCostMs;
       if (treceivedByt) {
          p0.writeUInt64(26, treceivedByt);
       }
       treceivedByt = this.headerRecvCostMs;
       if (treceivedByt) {
          p0.writeUInt64(27, treceivedByt);
       }
       treceivedByt = this.redirectCostMs;
       if (treceivedByt) {
          p0.writeUInt64(28, treceivedByt);
       }
       treceivedByt = this.bodyRecvCostMs;
       if (treceivedByt) {
          p0.writeUInt64(29, treceivedByt);
       }
       treceivedByt = this.totalCostMs;
       if (treceivedByt) {
          p0.writeUInt64(30, treceivedByt);
       }
       if (!(this.extraInfo).equals(str)) {
          p0.writeString(31, this.extraInfo);
       }
       super.writeTo(p0);
       return;
    }
}
