package com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientEvent$ResultPackage extends MessageNano	// class@001367
{
    public int code;
    public int domain;
    public String message;
    public String subdomain;
    public long timeCost;
    public static ClientEvent$ResultPackage[] _emptyArray;

    public void ClientEvent$ResultPackage(){
       super();
       this.clear();
    }
    public static ClientEvent$ResultPackage[] emptyArray(){
       if (ClientEvent$ResultPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientEvent$ResultPackage._emptyArray == null) {
             ClientEvent$ResultPackage[] resultPackag = new ClientEvent$ResultPackage[0];
             ClientEvent$ResultPackage._emptyArray = resultPackag;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientEvent$ResultPackage._emptyArray;
    }
    public static ClientEvent$ResultPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientEvent$ResultPackage().mergeFrom(p0);
    }
    public static ClientEvent$ResultPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientEvent$ResultPackage(), p0);
    }
    public ClientEvent$ResultPackage clear(){
       this.domain = 0;
       this.code = 0;
       this.message = "";
       this.timeCost = 0;
       this.subdomain = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientEvent$ResultPackage tdomain = this.domain;
       if (tdomain != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tdomain);
       }
       tdomain = this.code;
       if (tdomain != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tdomain);
       }
       String str = "";
       if (!(this.message).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.message);
       }
       ClientEvent$ResultPackage ttimeCost = this.timeCost;
       if (ttimeCost) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, ttimeCost);
       }
       if (!(this.subdomain).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.subdomain);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientEvent$ResultPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.subdomain = p0.readString();
                      }
                   }else {
                      this.timeCost = p0.readUInt64();
                   }
                }else {
                   this.message = p0.readString();
                }
             }else {
                this.code = p0.readInt32();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && (i != 2 && (i != 3 && (i != 4 && i != 5))))) {
                continue ;
             }else {
                this.domain = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientEvent$ResultPackage tdomain = this.domain;
       if (tdomain != null) {
          p0.writeInt32(1, tdomain);
       }
       tdomain = this.code;
       if (tdomain != null) {
          p0.writeInt32(2, tdomain);
       }
       String str = "";
       if (!(this.message).equals(str)) {
          p0.writeString(3, this.message);
       }
       ClientEvent$ResultPackage ttimeCost = this.timeCost;
       if (ttimeCost) {
          p0.writeUInt64(4, ttimeCost);
       }
       if (!(this.subdomain).equals(str)) {
          p0.writeString(5, this.subdomain);
       }
       super.writeTo(p0);
       return;
    }
}
