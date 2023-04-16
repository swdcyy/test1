package com.kuaishou.client.log.stat.packages.nano.ClientStat$HttpdnsStatEvent$IpEntity;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$HttpdnsStatEvent$IpEntity extends MessageNano	// class@0013e4
{
    public long expireDate;
    public String host;
    public String ip;
    public String resolver;
    public long rtt;
    public long rttMs;
    public static ClientStat$HttpdnsStatEvent$IpEntity[] _emptyArray;

    public void ClientStat$HttpdnsStatEvent$IpEntity(){
       super();
       this.clear();
    }
    public static ClientStat$HttpdnsStatEvent$IpEntity[] emptyArray(){
       if (ClientStat$HttpdnsStatEvent$IpEntity._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$HttpdnsStatEvent$IpEntity._emptyArray == null) {
             ClientStat$HttpdnsStatEvent$IpEntity[] httpdnsStatE = new ClientStat$HttpdnsStatEvent$IpEntity[0];
             ClientStat$HttpdnsStatEvent$IpEntity._emptyArray = httpdnsStatE;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$HttpdnsStatEvent$IpEntity._emptyArray;
    }
    public static ClientStat$HttpdnsStatEvent$IpEntity parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$HttpdnsStatEvent$IpEntity().mergeFrom(p0);
    }
    public static ClientStat$HttpdnsStatEvent$IpEntity parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$HttpdnsStatEvent$IpEntity(), p0);
    }
    public ClientStat$HttpdnsStatEvent$IpEntity clear(){
       this.ip = "";
       this.expireDate = 0;
       this.rtt = 0;
       this.host = "";
       this.resolver = "";
       this.rttMs = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.ip).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.ip);
       }
       ClientStat$HttpdnsStatEvent$IpEntity texpireDate = this.expireDate;
       if (texpireDate) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, texpireDate);
       }
       texpireDate = this.rtt;
       if (texpireDate) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, texpireDate);
       }
       if (!(this.host).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.host);
       }
       if (!(this.resolver).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.resolver);
       }
       ClientStat$HttpdnsStatEvent$IpEntity trttMs = this.rttMs;
       if (trttMs) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(6, trttMs);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$HttpdnsStatEvent$IpEntity mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.rttMs = p0.readInt64();
                         }
                      }else {
                         this.resolver = p0.readString();
                      }
                   }else {
                      this.host = p0.readString();
                   }
                }else {
                   this.rtt = p0.readUInt64();
                }
             }else {
                this.expireDate = p0.readUInt64();
             }
          }else {
             this.ip = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.ip).equals(str)) {
          p0.writeString(1, this.ip);
       }
       ClientStat$HttpdnsStatEvent$IpEntity texpireDate = this.expireDate;
       if (texpireDate) {
          p0.writeUInt64(2, texpireDate);
       }
       texpireDate = this.rtt;
       if (texpireDate) {
          p0.writeUInt64(3, texpireDate);
       }
       if (!(this.host).equals(str)) {
          p0.writeString(4, this.host);
       }
       if (!(this.resolver).equals(str)) {
          p0.writeString(5, this.resolver);
       }
       ClientStat$HttpdnsStatEvent$IpEntity trttMs = this.rttMs;
       if (trttMs) {
          p0.writeInt64(6, trttMs);
       }
       super.writeTo(p0);
       return;
    }
}
