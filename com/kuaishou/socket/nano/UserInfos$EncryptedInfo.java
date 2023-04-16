package com.kuaishou.socket.nano.UserInfos$EncryptedInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class UserInfos$EncryptedInfo extends MessageNano	// class@000f52
{
    public String encryptedUserId;
    public String encryptedUserName;
    public static UserInfos$EncryptedInfo[] _emptyArray;

    public void UserInfos$EncryptedInfo(){
       super();
       this.clear();
    }
    public static UserInfos$EncryptedInfo[] emptyArray(){
       if (UserInfos$EncryptedInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (UserInfos$EncryptedInfo._emptyArray == null) {
             UserInfos$EncryptedInfo[] uEncryptedIn = new UserInfos$EncryptedInfo[0];
             UserInfos$EncryptedInfo._emptyArray = uEncryptedIn;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return UserInfos$EncryptedInfo._emptyArray;
    }
    public static UserInfos$EncryptedInfo parseFrom(CodedInputByteBufferNano p0){
       return new UserInfos$EncryptedInfo().mergeFrom(p0);
    }
    public static UserInfos$EncryptedInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new UserInfos$EncryptedInfo(), p0);
    }
    public UserInfos$EncryptedInfo clear(){
       this.encryptedUserName = "";
       this.encryptedUserId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.encryptedUserName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.encryptedUserName);
       }
       if (!(this.encryptedUserId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.encryptedUserId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public UserInfos$EncryptedInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.encryptedUserId = p0.readString();
             }
          }else {
             this.encryptedUserName = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.encryptedUserName).equals(str)) {
          p0.writeString(1, this.encryptedUserName);
       }
       if (!(this.encryptedUserId).equals(str)) {
          p0.writeString(2, this.encryptedUserId);
       }
       super.writeTo(p0);
       return;
    }
}
