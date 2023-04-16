package com.kuaishou.client.log.packages.nano.ClientBase$IdentityPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientBase$IdentityPackage extends MessageNano	// class@00077c
{
    public String cloudDeviceIdTag;
    public String deviceId;
    public String deviceIdTag;
    public String globalId;
    public int isLoginUser;
    public String iuId;
    public String oldDeviceId;
    public String pUserId;
    public String randomDeviceId;
    public String sUserId;
    public String userFlag;
    public long userId;
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
       this.userId = 0;
       this.iuId = "";
       this.sUserId = "";
       this.userFlag = "";
       this.globalId = "";
       this.randomDeviceId = "";
       this.deviceIdTag = "";
       this.oldDeviceId = "";
       this.pUserId = "";
       this.isLoginUser = 0;
       this.cloudDeviceIdTag = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.deviceId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.deviceId);
       }
       ClientBase$IdentityPackage tuserId = this.userId;
       if (tuserId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tuserId);
       }
       if (!(this.iuId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.iuId);
       }
       if (!(this.sUserId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.sUserId);
       }
       if (!(this.userFlag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.userFlag);
       }
       if (!(this.globalId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.globalId);
       }
       if (!(this.randomDeviceId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.randomDeviceId);
       }
       if (!(this.deviceIdTag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.deviceIdTag);
       }
       if (!(this.oldDeviceId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.oldDeviceId);
       }
       if (!(this.pUserId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.pUserId);
       }
       ClientBase$IdentityPackage tisLoginUser = this.isLoginUser;
       if (tisLoginUser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(11, tisLoginUser);
       }
       if (!(this.cloudDeviceIdTag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.cloudDeviceIdTag);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientBase$IdentityPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.deviceId = p0.readString();
                break;
              case 16:
                this.userId = p0.readUInt64();
                break;
              case 26:
                this.iuId = p0.readString();
                break;
              case '"':
                this.sUserId = p0.readString();
                break;
              case '*':
                this.userFlag = p0.readString();
                break;
              case '2':
                this.globalId = p0.readString();
                break;
              case ':':
                this.randomDeviceId = p0.readString();
                break;
              case 'B':
                this.deviceIdTag = p0.readString();
                break;
              case 'J':
                this.oldDeviceId = p0.readString();
                break;
              case 'R':
                this.pUserId = p0.readString();
                break;
              case 'X':
                this.isLoginUser = p0.readInt32();
                break;
              case 'b':
                this.cloudDeviceIdTag = p0.readString();
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
       if (!(this.deviceId).equals(str)) {
          p0.writeString(1, this.deviceId);
       }
       ClientBase$IdentityPackage tuserId = this.userId;
       if (tuserId) {
          p0.writeUInt64(2, tuserId);
       }
       if (!(this.iuId).equals(str)) {
          p0.writeString(3, this.iuId);
       }
       if (!(this.sUserId).equals(str)) {
          p0.writeString(4, this.sUserId);
       }
       if (!(this.userFlag).equals(str)) {
          p0.writeString(5, this.userFlag);
       }
       if (!(this.globalId).equals(str)) {
          p0.writeString(6, this.globalId);
       }
       if (!(this.randomDeviceId).equals(str)) {
          p0.writeString(7, this.randomDeviceId);
       }
       if (!(this.deviceIdTag).equals(str)) {
          p0.writeString(8, this.deviceIdTag);
       }
       if (!(this.oldDeviceId).equals(str)) {
          p0.writeString(9, this.oldDeviceId);
       }
       if (!(this.pUserId).equals(str)) {
          p0.writeString(10, this.pUserId);
       }
       ClientBase$IdentityPackage tisLoginUser = this.isLoginUser;
       if (tisLoginUser != null) {
          p0.writeInt32(11, tisLoginUser);
       }
       if (!(this.cloudDeviceIdTag).equals(str)) {
          p0.writeString(12, this.cloudDeviceIdTag);
       }
       super.writeTo(p0);
       return;
    }
}
