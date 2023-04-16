package com.kuaishou.client.log.stat.packages.nano.ClientStat$HttpdnsStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$HttpdnsStatEvent$IpEntity;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class ClientStat$HttpdnsStatEvent extends MessageNano	// class@0007cc
{
    public ClientStat$HttpdnsStatEvent$IpEntity bestResult;
    public String errMsg;
    public String extraInfo;
    public ClientStat$HttpdnsStatEvent$IpEntity[] finalIps;
    public String host;
    public ClientStat$HttpdnsStatEvent$IpEntity[] localResolvedIps;
    public long localResolvedTimeCostMs;
    public String networkResolvedClientIp;
    public ClientStat$HttpdnsStatEvent$IpEntity[] networkResolvedIps;
    public long networkResolvedTimeCostMs;
    public long pingTimeCostMs;
    public long retryCnt;
    public long totalCostMs;
    public static ClientStat$HttpdnsStatEvent[] _emptyArray;

    public void ClientStat$HttpdnsStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$HttpdnsStatEvent[] emptyArray(){
       if (ClientStat$HttpdnsStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$HttpdnsStatEvent._emptyArray == null) {
             ClientStat$HttpdnsStatEvent[] httpdnsStatE = new ClientStat$HttpdnsStatEvent[0];
             ClientStat$HttpdnsStatEvent._emptyArray = httpdnsStatE;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$HttpdnsStatEvent._emptyArray;
    }
    public static ClientStat$HttpdnsStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$HttpdnsStatEvent().mergeFrom(p0);
    }
    public static ClientStat$HttpdnsStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$HttpdnsStatEvent(), p0);
    }
    public ClientStat$HttpdnsStatEvent clear(){
       this.host = "";
       this.errMsg = "";
       this.totalCostMs = 0;
       this.networkResolvedTimeCostMs = 0;
       this.localResolvedTimeCostMs = 0;
       this.pingTimeCostMs = 0;
       this.networkResolvedIps = ClientStat$HttpdnsStatEvent$IpEntity.emptyArray();
       this.localResolvedIps = ClientStat$HttpdnsStatEvent$IpEntity.emptyArray();
       this.finalIps = ClientStat$HttpdnsStatEvent$IpEntity.emptyArray();
       this.bestResult = null;
       this.retryCnt = 0;
       this.networkResolvedClientIp = "";
       this.extraInfo = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       ClientStat$HttpdnsStatEvent tnetworkReso1;
       object oobject;
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.host).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.host);
       }
       if (!(this.errMsg).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.errMsg);
       }
       ClientStat$HttpdnsStatEvent ttotalCostMs = this.totalCostMs;
       if (ttotalCostMs) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ttotalCostMs);
       }
       ttotalCostMs = this.networkResolvedTimeCostMs;
       if (ttotalCostMs) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, ttotalCostMs);
       }
       ttotalCostMs = this.localResolvedTimeCostMs;
       if (ttotalCostMs) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, ttotalCostMs);
       }
       ttotalCostMs = this.pingTimeCostMs;
       if (ttotalCostMs) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(6, ttotalCostMs);
       }
       ClientStat$HttpdnsStatEvent tnetworkReso = this.networkResolvedIps;
       int i1 = 0;
       if (tnetworkReso != null && tnetworkReso.length > 0) {
          i2 = 0;
          tnetworkReso1 = this.networkResolvedIps;
          while (i2 < tnetworkReso1.length) {
             oobject = tnetworkReso1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(7, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tnetworkReso = this.localResolvedIps;
       if (tnetworkReso != null && tnetworkReso.length > 0) {
          i2 = 0;
          tnetworkReso1 = this.localResolvedIps;
          while (i2 < tnetworkReso1.length) {
             oobject = tnetworkReso1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(8, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tnetworkReso = this.finalIps;
       if (tnetworkReso != null && tnetworkReso.length > 0) {
          tnetworkReso = this.finalIps;
          while (i1 < tnetworkReso.length) {
             object oobject1 = tnetworkReso[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(9, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tnetworkReso = this.bestResult;
       if (tnetworkReso != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(10, tnetworkReso);
       }
       ttotalCostMs = this.retryCnt;
       if (ttotalCostMs) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(11, ttotalCostMs);
       }
       if (!(this.networkResolvedClientIp).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.networkResolvedClientIp);
       }
       if (!(this.extraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.extraInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$HttpdnsStatEvent mergeFrom(CodedInputByteBufferNano p0){
       ClientStat$HttpdnsStatEvent tnetworkReso;
       int i2;
       ClientStat$HttpdnsStatEvent$IpEntity[] httpdnsStatE;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 10:
                this.host = p0.readString();
                break;
              case 18:
                this.errMsg = p0.readString();
                break;
              case 24:
                this.totalCostMs = p0.readUInt64();
                break;
              case 32:
                this.networkResolvedTimeCostMs = p0.readUInt64();
                break;
              case '(':
                this.localResolvedTimeCostMs = p0.readUInt64();
                break;
              case '0':
                this.pingTimeCostMs = p0.readInt64();
                break;
              case ':':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 58);
                tnetworkReso = this.networkResolvedIps;
                i2 = (tnetworkReso == null)? 0: tnetworkReso.length;
                i = i + i2;
                httpdnsStatE = new ClientStat$HttpdnsStatEvent$IpEntity[i];
                if (i2) {
                   System.arraycopy(tnetworkReso, i1, httpdnsStatE, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   httpdnsStatE[i2] = new ClientStat$HttpdnsStatEvent$IpEntity();
                   p0.readMessage(httpdnsStatE[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                httpdnsStatE[i2] = new ClientStat$HttpdnsStatEvent$IpEntity();
                p0.readMessage(httpdnsStatE[i2]);
                this.networkResolvedIps = httpdnsStatE;
                break;
              case 'B':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 66);
                tnetworkReso = this.localResolvedIps;
                i2 = (tnetworkReso == null)? 0: tnetworkReso.length;
                i = i + i2;
                httpdnsStatE = new ClientStat$HttpdnsStatEvent$IpEntity[i];
                if (i2) {
                   System.arraycopy(tnetworkReso, i1, httpdnsStatE, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   httpdnsStatE[i2] = new ClientStat$HttpdnsStatEvent$IpEntity();
                   p0.readMessage(httpdnsStatE[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                httpdnsStatE[i2] = new ClientStat$HttpdnsStatEvent$IpEntity();
                p0.readMessage(httpdnsStatE[i2]);
                this.localResolvedIps = httpdnsStatE;
                break;
              case 'J':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 74);
                tnetworkReso = this.finalIps;
                i2 = (tnetworkReso == null)? 0: tnetworkReso.length;
                i = i + i2;
                httpdnsStatE = new ClientStat$HttpdnsStatEvent$IpEntity[i];
                if (i2) {
                   System.arraycopy(tnetworkReso, i1, httpdnsStatE, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   httpdnsStatE[i2] = new ClientStat$HttpdnsStatEvent$IpEntity();
                   p0.readMessage(httpdnsStatE[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                httpdnsStatE[i2] = new ClientStat$HttpdnsStatEvent$IpEntity();
                p0.readMessage(httpdnsStatE[i2]);
                this.finalIps = httpdnsStatE;
                break;
              case 'R':
                if (this.bestResult == null) {
                   this.bestResult = new ClientStat$HttpdnsStatEvent$IpEntity();
                }
                p0.readMessage(this.bestResult);
                break;
              case 'X':
                this.retryCnt = p0.readUInt64();
                break;
              case 'b':
                this.networkResolvedClientIp = p0.readString();
                break;
              case 'j':
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
       int i1;
       ClientStat$HttpdnsStatEvent tnetworkReso1;
       object oobject;
       String str = "";
       if (!(this.host).equals(str)) {
          p0.writeString(1, this.host);
       }
       if (!(this.errMsg).equals(str)) {
          p0.writeString(2, this.errMsg);
       }
       ClientStat$HttpdnsStatEvent ttotalCostMs = this.totalCostMs;
       if (ttotalCostMs) {
          p0.writeUInt64(3, ttotalCostMs);
       }
       ttotalCostMs = this.networkResolvedTimeCostMs;
       if (ttotalCostMs) {
          p0.writeUInt64(4, ttotalCostMs);
       }
       ttotalCostMs = this.localResolvedTimeCostMs;
       if (ttotalCostMs) {
          p0.writeUInt64(5, ttotalCostMs);
       }
       ttotalCostMs = this.pingTimeCostMs;
       if (ttotalCostMs) {
          p0.writeInt64(6, ttotalCostMs);
       }
       ClientStat$HttpdnsStatEvent tnetworkReso = this.networkResolvedIps;
       int i = 0;
       if (tnetworkReso != null && tnetworkReso.length > 0) {
          i1 = 0;
          tnetworkReso1 = this.networkResolvedIps;
          while (i1 < tnetworkReso1.length) {
             oobject = tnetworkReso1[i1];
             if (oobject != null) {
                p0.writeMessage(7, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tnetworkReso = this.localResolvedIps;
       if (tnetworkReso != null && tnetworkReso.length > 0) {
          i1 = 0;
          tnetworkReso1 = this.localResolvedIps;
          while (i1 < tnetworkReso1.length) {
             oobject = tnetworkReso1[i1];
             if (oobject != null) {
                p0.writeMessage(8, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tnetworkReso = this.finalIps;
       if (tnetworkReso != null && tnetworkReso.length > 0) {
          tnetworkReso = this.finalIps;
          while (i < tnetworkReso.length) {
             object oobject1 = tnetworkReso[i];
             if (oobject1 != null) {
                p0.writeMessage(9, oobject1);
             }
             i = i + 1;
          }
       }
       tnetworkReso = this.bestResult;
       if (tnetworkReso != null) {
          p0.writeMessage(10, tnetworkReso);
       }
       ttotalCostMs = this.retryCnt;
       if (ttotalCostMs) {
          p0.writeUInt64(11, ttotalCostMs);
       }
       if (!(this.networkResolvedClientIp).equals(str)) {
          p0.writeString(12, this.networkResolvedClientIp);
       }
       if (!(this.extraInfo).equals(str)) {
          p0.writeString(13, this.extraInfo);
       }
       super.writeTo(p0);
       return;
    }
}
