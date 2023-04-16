package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$HttpDnsResolvePackage$IpEntity;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientTaskDetail$HttpDnsResolvePackage$IpEntity extends MessageNano	// class@001458
{
    public String cdnName;
    public long expireDate;
    public String host;
    public String ip;
    public String resolver;
    public long rtt;
    public static ClientTaskDetail$HttpDnsResolvePackage$IpEntity[] _emptyArray;

    public void ClientTaskDetail$HttpDnsResolvePackage$IpEntity(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$HttpDnsResolvePackage$IpEntity[] emptyArray(){
       if (ClientTaskDetail$HttpDnsResolvePackage$IpEntity._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$HttpDnsResolvePackage$IpEntity._emptyArray == null) {
             ClientTaskDetail$HttpDnsResolvePackage$IpEntity[] httpDnsResol = new ClientTaskDetail$HttpDnsResolvePackage$IpEntity[0];
             ClientTaskDetail$HttpDnsResolvePackage$IpEntity._emptyArray = httpDnsResol;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$HttpDnsResolvePackage$IpEntity._emptyArray;
    }
    public static ClientTaskDetail$HttpDnsResolvePackage$IpEntity parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$HttpDnsResolvePackage$IpEntity().mergeFrom(p0);
    }
    public static ClientTaskDetail$HttpDnsResolvePackage$IpEntity parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$HttpDnsResolvePackage$IpEntity(), p0);
    }
    public ClientTaskDetail$HttpDnsResolvePackage$IpEntity clear(){
       this.ip = "";
       this.expireDate = 0;
       this.rtt = 0;
       this.cdnName = "";
       this.host = "";
       this.resolver = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.ip).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.ip);
       }
       ClientTaskDetail$HttpDnsResolvePackage$IpEntity texpireDate = this.expireDate;
       if (texpireDate) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, texpireDate);
       }
       texpireDate = this.rtt;
       if (texpireDate) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, texpireDate);
       }
       if (!(this.cdnName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.cdnName);
       }
       if (!(this.host).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.host);
       }
       if (!(this.resolver).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.resolver);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$HttpDnsResolvePackage$IpEntity mergeFrom(CodedInputByteBufferNano p0){
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
                         if (i != 50) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.resolver = p0.readString();
                         }
                      }else {
                         this.host = p0.readString();
                      }
                   }else {
                      this.cdnName = p0.readString();
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
       ClientTaskDetail$HttpDnsResolvePackage$IpEntity texpireDate = this.expireDate;
       if (texpireDate) {
          p0.writeUInt64(2, texpireDate);
       }
       texpireDate = this.rtt;
       if (texpireDate) {
          p0.writeUInt64(3, texpireDate);
       }
       if (!(this.cdnName).equals(str)) {
          p0.writeString(4, this.cdnName);
       }
       if (!(this.host).equals(str)) {
          p0.writeString(5, this.host);
       }
       if (!(this.resolver).equals(str)) {
          p0.writeString(6, this.resolver);
       }
       super.writeTo(p0);
       return;
    }
}
