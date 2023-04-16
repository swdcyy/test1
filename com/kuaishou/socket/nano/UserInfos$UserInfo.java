package com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.kuaishou.socket.nano.UserInfos$RoleInfo;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$EncryptedInfo;
import java.lang.System;

public final class UserInfos$UserInfo extends MessageNano	// class@000f56
{
    public String eUid;
    public String encryptUid;
    public UserInfos$EncryptedInfo encryptedInfo;
    public UserInfos$PicUrl[] headUrls;
    public UserInfos$PicUrl[] httpsHeadUrls;
    public String kwaiId;
    public UserInfos$RoleInfo[] roleInfos;
    public String sUserId;
    public String userGender;
    public long userId;
    public String userName;
    public String userText;
    public boolean verified;
    public static UserInfos$UserInfo[] _emptyArray;

    public void UserInfos$UserInfo(){
       super();
       this.clear();
    }
    public static UserInfos$UserInfo[] emptyArray(){
       if (UserInfos$UserInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (UserInfos$UserInfo._emptyArray == null) {
             UserInfos$UserInfo[] userInfoArra = new UserInfos$UserInfo[0];
             UserInfos$UserInfo._emptyArray = userInfoArra;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return UserInfos$UserInfo._emptyArray;
    }
    public static UserInfos$UserInfo parseFrom(CodedInputByteBufferNano p0){
       return new UserInfos$UserInfo().mergeFrom(p0);
    }
    public static UserInfos$UserInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new UserInfos$UserInfo(), p0);
    }
    public UserInfos$UserInfo clear(){
       this.userId = 0;
       this.userName = "";
       this.userGender = "";
       this.userText = "";
       this.headUrls = UserInfos$PicUrl.emptyArray();
       this.verified = false;
       this.sUserId = "";
       this.httpsHeadUrls = UserInfos$PicUrl.emptyArray();
       this.kwaiId = "";
       this.eUid = "";
       this.roleInfos = UserInfos$RoleInfo.emptyArray();
       this.encryptUid = "";
       this.encryptedInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       UserInfos$UserInfo theadUrls;
       object oobject;
       int i = super.computeSerializedSize();
       UserInfos$UserInfo tuserId = this.userId;
       if (tuserId - null) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tuserId);
       }
       String str = "";
       if (!(this.userName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.userName);
       }
       if (!(this.userGender).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.userGender);
       }
       if (!(this.userText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.userText);
       }
       tuserId = this.headUrls;
       int i1 = 0;
       if (tuserId != null && tuserId.length > 0) {
          i2 = 0;
          theadUrls = this.headUrls;
          while (i2 < theadUrls.length) {
             oobject = theadUrls[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tuserId = this.verified;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, tuserId);
       }
       if (!(this.sUserId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.sUserId);
       }
       tuserId = this.httpsHeadUrls;
       if (tuserId != null && tuserId.length > 0) {
          i2 = 0;
          theadUrls = this.httpsHeadUrls;
          while (i2 < theadUrls.length) {
             oobject = theadUrls[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(8, oobject);
             }
             i2 = i2 + 1;
          }
       }
       if (!(this.kwaiId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.kwaiId);
       }
       if (!(this.eUid).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.eUid);
       }
       tuserId = this.roleInfos;
       if (tuserId != null && tuserId.length > 0) {
          tuserId = this.roleInfos;
          while (i1 < tuserId.length) {
             object oobject1 = tuserId[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(11, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.encryptUid).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.encryptUid);
       }
       tuserId = this.encryptedInfo;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(13, tuserId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public UserInfos$UserInfo mergeFrom(CodedInputByteBufferNano p0){
       UserInfos$UserInfo theadUrls;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 8:
                this.userId = p0.readUInt64();
                break;
              case 18:
                this.userName = p0.readString();
                break;
              case 26:
                this.userGender = p0.readString();
                break;
              case '"':
                this.userText = p0.readString();
                break;
              case '*':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 42);
                theadUrls = this.headUrls;
                i2 = (theadUrls == null)? 0: theadUrls.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(theadUrls, i1, picUrlArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   picUrlArray[i2] = new UserInfos$PicUrl();
                   p0.readMessage(picUrlArray[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                picUrlArray[i2] = new UserInfos$PicUrl();
                p0.readMessage(picUrlArray[i2]);
                this.headUrls = picUrlArray;
                break;
              case '0':
                this.verified = p0.readBool();
                break;
              case ':':
                this.sUserId = p0.readString();
                break;
              case 'B':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 66);
                theadUrls = this.httpsHeadUrls;
                i2 = (theadUrls == null)? 0: theadUrls.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(theadUrls, i1, picUrlArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   picUrlArray[i2] = new UserInfos$PicUrl();
                   p0.readMessage(picUrlArray[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                picUrlArray[i2] = new UserInfos$PicUrl();
                p0.readMessage(picUrlArray[i2]);
                this.httpsHeadUrls = picUrlArray;
                break;
              case 'J':
                this.kwaiId = p0.readString();
                break;
              case 'R':
                this.eUid = p0.readString();
                break;
              case 'Z':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 90);
                theadUrls = this.roleInfos;
                i2 = (theadUrls == null)? 0: theadUrls.length;
                i = i + i2;
                UserInfos$RoleInfo[] roleInfoArra = new UserInfos$RoleInfo[i];
                if (i2) {
                   System.arraycopy(theadUrls, i1, roleInfoArra, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   roleInfoArra[i2] = new UserInfos$RoleInfo();
                   p0.readMessage(roleInfoArra[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                roleInfoArra[i2] = new UserInfos$RoleInfo();
                p0.readMessage(roleInfoArra[i2]);
                this.roleInfos = roleInfoArra;
                break;
              case 'b':
                this.encryptUid = p0.readString();
                break;
              case 'j':
                if (this.encryptedInfo == null) {
                   this.encryptedInfo = new UserInfos$EncryptedInfo();
                }
                p0.readMessage(this.encryptedInfo);
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
       UserInfos$UserInfo theadUrls;
       object oobject;
       UserInfos$UserInfo tuserId = this.userId;
       if (tuserId - null) {
          p0.writeUInt64(1, tuserId);
       }
       String str = "";
       if (!(this.userName).equals(str)) {
          p0.writeString(2, this.userName);
       }
       if (!(this.userGender).equals(str)) {
          p0.writeString(3, this.userGender);
       }
       if (!(this.userText).equals(str)) {
          p0.writeString(4, this.userText);
       }
       tuserId = this.headUrls;
       int i = 0;
       if (tuserId != null && tuserId.length > 0) {
          i1 = 0;
          theadUrls = this.headUrls;
          while (i1 < theadUrls.length) {
             oobject = theadUrls[i1];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tuserId = this.verified;
       if (tuserId != null) {
          p0.writeBool(6, tuserId);
       }
       if (!(this.sUserId).equals(str)) {
          p0.writeString(7, this.sUserId);
       }
       tuserId = this.httpsHeadUrls;
       if (tuserId != null && tuserId.length > 0) {
          i1 = 0;
          theadUrls = this.httpsHeadUrls;
          while (i1 < theadUrls.length) {
             oobject = theadUrls[i1];
             if (oobject != null) {
                p0.writeMessage(8, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.kwaiId).equals(str)) {
          p0.writeString(9, this.kwaiId);
       }
       if (!(this.eUid).equals(str)) {
          p0.writeString(10, this.eUid);
       }
       tuserId = this.roleInfos;
       if (tuserId != null && tuserId.length > 0) {
          tuserId = this.roleInfos;
          while (i < tuserId.length) {
             object oobject1 = tuserId[i];
             if (oobject1 != null) {
                p0.writeMessage(11, oobject1);
             }
             i = i + 1;
          }
       }
       if (!(this.encryptUid).equals(str)) {
          p0.writeString(12, this.encryptUid);
       }
       tuserId = this.encryptedInfo;
       if (tuserId != null) {
          p0.writeMessage(13, tuserId);
       }
       super.writeTo(p0);
       return;
    }
}
