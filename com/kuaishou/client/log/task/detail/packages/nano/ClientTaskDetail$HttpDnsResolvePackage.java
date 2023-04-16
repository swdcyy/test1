package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$HttpDnsResolvePackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$HttpDnsResolvePackage$IpEntity;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class ClientTaskDetail$HttpDnsResolvePackage extends MessageNano	// class@001459
{
    public ClientTaskDetail$HttpDnsResolvePackage$IpEntity bestResult;
    public String domain;
    public boolean enableCrossPlatform;
    public long ipExpireDuration;
    public boolean isCronet;
    public ClientTaskDetail$HttpDnsResolvePackage$IpEntity[] localResolvedCdnIp;
    public long localResolvedTimeCost;
    public ClientTaskDetail$HttpDnsResolvePackage$IpEntity[] networkResolvedCdnIp;
    public String networkResolvedClientIp;
    public long networkResolvedTimeCost;
    public String pingDetails;
    public ClientTaskDetail$HttpDnsResolvePackage$IpEntity[] pingIp;
    public long pingTimeCost;
    public long pingTimeout;
    public long queryTimeout;
    public static ClientTaskDetail$HttpDnsResolvePackage[] _emptyArray;

    public void ClientTaskDetail$HttpDnsResolvePackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$HttpDnsResolvePackage[] emptyArray(){
       if (ClientTaskDetail$HttpDnsResolvePackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$HttpDnsResolvePackage._emptyArray == null) {
             ClientTaskDetail$HttpDnsResolvePackage[] httpDnsResol = new ClientTaskDetail$HttpDnsResolvePackage[0];
             ClientTaskDetail$HttpDnsResolvePackage._emptyArray = httpDnsResol;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$HttpDnsResolvePackage._emptyArray;
    }
    public static ClientTaskDetail$HttpDnsResolvePackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$HttpDnsResolvePackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$HttpDnsResolvePackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$HttpDnsResolvePackage(), p0);
    }
    public ClientTaskDetail$HttpDnsResolvePackage clear(){
       this.domain = "";
       this.queryTimeout = 0;
       this.pingTimeout = 0;
       this.ipExpireDuration = 0;
       this.networkResolvedTimeCost = 0;
       this.networkResolvedCdnIp = ClientTaskDetail$HttpDnsResolvePackage$IpEntity.emptyArray();
       this.localResolvedTimeCost = 0;
       this.localResolvedCdnIp = ClientTaskDetail$HttpDnsResolvePackage$IpEntity.emptyArray();
       this.pingTimeCost = 0;
       this.pingIp = ClientTaskDetail$HttpDnsResolvePackage$IpEntity.emptyArray();
       this.bestResult = null;
       this.enableCrossPlatform = false;
       this.pingDetails = "";
       this.networkResolvedClientIp = "";
       this.isCronet = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       ClientTaskDetail$HttpDnsResolvePackage tnetworkReso1;
       object oobject;
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.domain).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.domain);
       }
       ClientTaskDetail$HttpDnsResolvePackage tqueryTimeou = this.queryTimeout;
       if (tqueryTimeou) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tqueryTimeou);
       }
       tqueryTimeou = this.pingTimeout;
       if (tqueryTimeou) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tqueryTimeou);
       }
       tqueryTimeou = this.ipExpireDuration;
       if (tqueryTimeou) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tqueryTimeou);
       }
       tqueryTimeou = this.networkResolvedTimeCost;
       if (tqueryTimeou) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tqueryTimeou);
       }
       ClientTaskDetail$HttpDnsResolvePackage tnetworkReso = this.networkResolvedCdnIp;
       int i1 = 0;
       if (tnetworkReso != null && tnetworkReso.length > 0) {
          i2 = 0;
          tnetworkReso1 = this.networkResolvedCdnIp;
          while (i2 < tnetworkReso1.length) {
             oobject = tnetworkReso1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(6, oobject);
             }
             i2 = i2 + 1;
          }
       }
       ClientTaskDetail$HttpDnsResolvePackage tlocalResolv = this.localResolvedTimeCost;
       if (tlocalResolv) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tlocalResolv);
       }
       tnetworkReso = this.localResolvedCdnIp;
       if (tnetworkReso != null && tnetworkReso.length > 0) {
          i2 = 0;
          tnetworkReso1 = this.localResolvedCdnIp;
          while (i2 < tnetworkReso1.length) {
             oobject = tnetworkReso1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(8, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tlocalResolv = this.pingTimeCost;
       if (tlocalResolv) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, tlocalResolv);
       }
       tnetworkReso = this.pingIp;
       if (tnetworkReso != null && tnetworkReso.length > 0) {
          tnetworkReso = this.pingIp;
          while (i1 < tnetworkReso.length) {
             object oobject1 = tnetworkReso[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(10, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tnetworkReso = this.bestResult;
       if (tnetworkReso != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(11, tnetworkReso);
       }
       tnetworkReso = this.enableCrossPlatform;
       if (tnetworkReso != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(12, tnetworkReso);
       }
       if (!(this.pingDetails).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.pingDetails);
       }
       if (!(this.networkResolvedClientIp).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.networkResolvedClientIp);
       }
       tnetworkReso = this.isCronet;
       if (tnetworkReso != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(15, tnetworkReso);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$HttpDnsResolvePackage mergeFrom(CodedInputByteBufferNano p0){
       ClientTaskDetail$HttpDnsResolvePackage tnetworkReso;
       int i2;
       ClientTaskDetail$HttpDnsResolvePackage$IpEntity[] httpDnsResol;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 10:
                this.domain = p0.readString();
                break;
              case 16:
                this.queryTimeout = p0.readUInt64();
                break;
              case 24:
                this.pingTimeout = p0.readUInt64();
                break;
              case 32:
                this.ipExpireDuration = p0.readUInt64();
                break;
              case '(':
                this.networkResolvedTimeCost = p0.readUInt64();
                break;
              case '2':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 50);
                tnetworkReso = this.networkResolvedCdnIp;
                i2 = (tnetworkReso == null)? 0: tnetworkReso.length;
                i = i + i2;
                httpDnsResol = new ClientTaskDetail$HttpDnsResolvePackage$IpEntity[i];
                if (i2) {
                   System.arraycopy(tnetworkReso, i1, httpDnsResol, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   httpDnsResol[i2] = new ClientTaskDetail$HttpDnsResolvePackage$IpEntity();
                   p0.readMessage(httpDnsResol[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                httpDnsResol[i2] = new ClientTaskDetail$HttpDnsResolvePackage$IpEntity();
                p0.readMessage(httpDnsResol[i2]);
                this.networkResolvedCdnIp = httpDnsResol;
                break;
              case '8':
                this.localResolvedTimeCost = p0.readUInt64();
                break;
              case 'B':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 66);
                tnetworkReso = this.localResolvedCdnIp;
                i2 = (tnetworkReso == null)? 0: tnetworkReso.length;
                i = i + i2;
                httpDnsResol = new ClientTaskDetail$HttpDnsResolvePackage$IpEntity[i];
                if (i2) {
                   System.arraycopy(tnetworkReso, i1, httpDnsResol, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   httpDnsResol[i2] = new ClientTaskDetail$HttpDnsResolvePackage$IpEntity();
                   p0.readMessage(httpDnsResol[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                httpDnsResol[i2] = new ClientTaskDetail$HttpDnsResolvePackage$IpEntity();
                p0.readMessage(httpDnsResol[i2]);
                this.localResolvedCdnIp = httpDnsResol;
                break;
              case 'H':
                this.pingTimeCost = p0.readUInt64();
                break;
              case 'R':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 82);
                tnetworkReso = this.pingIp;
                i2 = (tnetworkReso == null)? 0: tnetworkReso.length;
                i = i + i2;
                httpDnsResol = new ClientTaskDetail$HttpDnsResolvePackage$IpEntity[i];
                if (i2) {
                   System.arraycopy(tnetworkReso, i1, httpDnsResol, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   httpDnsResol[i2] = new ClientTaskDetail$HttpDnsResolvePackage$IpEntity();
                   p0.readMessage(httpDnsResol[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                httpDnsResol[i2] = new ClientTaskDetail$HttpDnsResolvePackage$IpEntity();
                p0.readMessage(httpDnsResol[i2]);
                this.pingIp = httpDnsResol;
                break;
              case 'Z':
                if (this.bestResult == null) {
                   this.bestResult = new ClientTaskDetail$HttpDnsResolvePackage$IpEntity();
                }
                p0.readMessage(this.bestResult);
                break;
              case '`':
                this.enableCrossPlatform = p0.readBool();
                break;
              case 'j':
                this.pingDetails = p0.readString();
                break;
              case 'r':
                this.networkResolvedClientIp = p0.readString();
                break;
              case 'x':
                this.isCronet = p0.readBool();
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
       ClientTaskDetail$HttpDnsResolvePackage tnetworkReso1;
       object oobject;
       String str = "";
       if (!(this.domain).equals(str)) {
          p0.writeString(1, this.domain);
       }
       ClientTaskDetail$HttpDnsResolvePackage tqueryTimeou = this.queryTimeout;
       if (tqueryTimeou) {
          p0.writeUInt64(2, tqueryTimeou);
       }
       tqueryTimeou = this.pingTimeout;
       if (tqueryTimeou) {
          p0.writeUInt64(3, tqueryTimeou);
       }
       tqueryTimeou = this.ipExpireDuration;
       if (tqueryTimeou) {
          p0.writeUInt64(4, tqueryTimeou);
       }
       tqueryTimeou = this.networkResolvedTimeCost;
       if (tqueryTimeou) {
          p0.writeUInt64(5, tqueryTimeou);
       }
       ClientTaskDetail$HttpDnsResolvePackage tnetworkReso = this.networkResolvedCdnIp;
       int i = 0;
       if (tnetworkReso != null && tnetworkReso.length > 0) {
          i1 = 0;
          tnetworkReso1 = this.networkResolvedCdnIp;
          while (i1 < tnetworkReso1.length) {
             oobject = tnetworkReso1[i1];
             if (oobject != null) {
                p0.writeMessage(6, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ClientTaskDetail$HttpDnsResolvePackage tlocalResolv = this.localResolvedTimeCost;
       if (tlocalResolv) {
          p0.writeUInt64(7, tlocalResolv);
       }
       tnetworkReso = this.localResolvedCdnIp;
       if (tnetworkReso != null && tnetworkReso.length > 0) {
          i1 = 0;
          tnetworkReso1 = this.localResolvedCdnIp;
          while (i1 < tnetworkReso1.length) {
             oobject = tnetworkReso1[i1];
             if (oobject != null) {
                p0.writeMessage(8, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tlocalResolv = this.pingTimeCost;
       if (tlocalResolv) {
          p0.writeUInt64(9, tlocalResolv);
       }
       tnetworkReso = this.pingIp;
       if (tnetworkReso != null && tnetworkReso.length > 0) {
          tnetworkReso = this.pingIp;
          while (i < tnetworkReso.length) {
             object oobject1 = tnetworkReso[i];
             if (oobject1 != null) {
                p0.writeMessage(10, oobject1);
             }
             i = i + 1;
          }
       }
       tnetworkReso = this.bestResult;
       if (tnetworkReso != null) {
          p0.writeMessage(11, tnetworkReso);
       }
       tnetworkReso = this.enableCrossPlatform;
       if (tnetworkReso != null) {
          p0.writeBool(12, tnetworkReso);
       }
       if (!(this.pingDetails).equals(str)) {
          p0.writeString(13, this.pingDetails);
       }
       if (!(this.networkResolvedClientIp).equals(str)) {
          p0.writeString(14, this.networkResolvedClientIp);
       }
       tnetworkReso = this.isCronet;
       if (tnetworkReso != null) {
          p0.writeBool(15, tnetworkReso);
       }
       super.writeTo(p0);
       return;
    }
}
