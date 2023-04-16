package com.kuaishou.protobuf.log.nano.ClientBase$IdentityPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientBase$IdentityPackage extends MessageNano	// class@000dd8
{
    public String deviceId;
    public String globalId;
    public String iuId;
    public String userId;
    public static ClientBase$IdentityPackage[] _emptyArray;

    public void ClientBase$IdentityPackage(){
       super();
       this.clear();
    }
    public static ClientBase$IdentityPackage[] emptyArray(){
       if (ClientBase$IdentityPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientBase$IdentityPackage._emptyArray == null) {
             ClientBase$IdentityPackage[] identityPack = new ClientBase$IdentityPackage[0];
             ClientBase$IdentityPackage._emptyArray = identityPack;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientBase$IdentityPackage._emptyArray;
    }
    public static ClientBase$IdentityPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientBase$IdentityPackage().mergeFrom(p0);
    }
    public static ClientBase$IdentityPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientBase$IdentityPackage(), p0);
    }
    public ClientBase$IdentityPackage clear(){
       this.deviceId = "";
       this.userId = "";
       this.iuId = "";
       this.globalId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.deviceId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.deviceId);
       }
       if (!(this.userId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.userId);
       }
       if (!(this.iuId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.iuId);
       }
       if (!(this.globalId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.globalId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientBase$IdentityPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.globalId = p0.readString();
                   }
                }else {
                   this.iuId = p0.readString();
                }
             }else {
                this.userId = p0.readString();
             }
          }else {
             this.deviceId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.deviceId).equals(str)) {
          p0.writeString(1, this.deviceId);
       }
       if (!(this.userId).equals(str)) {
          p0.writeString(2, this.userId);
       }
       if (!(this.iuId).equals(str)) {
          p0.writeString(3, this.iuId);
       }
       if (!(this.globalId).equals(str)) {
          p0.writeString(4, this.globalId);
       }
       super.writeTo(p0);
       return;
    }
}
