package com.kuaishou.protobuf.livestream.nano.SCLiveConditionRedPackRollUserInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCLiveConditionRedPackRollUserInfo extends MessageNano	// class@000d4b
{
    public String liveStreamId;
    public long minRollTime;
    public String redPackId;
    public int redPackType;
    public UserInfos$UserInfo[] rollUser;
    public static SCLiveConditionRedPackRollUserInfo[] _emptyArray;

    public void SCLiveConditionRedPackRollUserInfo(){
       super();
       this.clear();
    }
    public static SCLiveConditionRedPackRollUserInfo[] emptyArray(){
       if (SCLiveConditionRedPackRollUserInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveConditionRedPackRollUserInfo._emptyArray == null) {
             SCLiveConditionRedPackRollUserInfo[] sCLiveCondit = new SCLiveConditionRedPackRollUserInfo[0];
             SCLiveConditionRedPackRollUserInfo._emptyArray = sCLiveCondit;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveConditionRedPackRollUserInfo._emptyArray;
    }
    public static SCLiveConditionRedPackRollUserInfo parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveConditionRedPackRollUserInfo().mergeFrom(p0);
    }
    public static SCLiveConditionRedPackRollUserInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveConditionRedPackRollUserInfo(), p0);
    }
    public SCLiveConditionRedPackRollUserInfo clear(){
       this.liveStreamId = "";
       this.redPackType = 0;
       this.redPackId = "";
       this.rollUser = UserInfos$UserInfo.emptyArray();
       this.minRollTime = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       SCLiveConditionRedPackRollUserInfo tredPackType = this.redPackType;
       if (tredPackType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tredPackType);
       }
       if (!(this.redPackId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.redPackId);
       }
       tredPackType = this.rollUser;
       if (tredPackType != null && tredPackType.length > 0) {
          int i1 = 0;
          SCLiveConditionRedPackRollUserInfo trollUser = this.rollUser;
          while (i1 < trollUser.length) {
             object oobject = trollUser[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tredPackType = this.minRollTime;
       if (tredPackType) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tredPackType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveConditionRedPackRollUserInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   int i1 = 34;
                   if (i != i1) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.minRollTime = p0.readUInt64();
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      SCLiveConditionRedPackRollUserInfo trollUser = this.rollUser;
                      int i2 = (trollUser == null)? 0: trollUser.length;
                      i = i + i2;
                      UserInfos$UserInfo[] userInfoArra = new UserInfos$UserInfo[i];
                      if (i2) {
                         System.arraycopy(trollUser, 0, userInfoArra, 0, i2);
                      }
                      i1 = i - 1;
                      while (i2 < i1) {
                         userInfoArra[i2] = new UserInfos$UserInfo();
                         p0.readMessage(userInfoArra[i2]);
                         p0.readTag();
                         i2 = i2 + 1;
                      }
                      userInfoArra[i2] = new UserInfos$UserInfo();
                      p0.readMessage(userInfoArra[i2]);
                      this.rollUser = userInfoArra;
                   }
                }else {
                   this.redPackId = p0.readString();
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   switch (i){
                       case 11:
                       case 13:
                       case 14:
                       case 15:
                       case 16:
                       case 17:
                       case 18:
                       case 19:
                       case 20:
                       case 21:
                       case 22:
                       case 23:
                       case 24:
                       case 25:
                       case 26:
                       case 27:
                       case 28:
                       case 29:
                       case 30:
                       case 31:
                       case 32:
                       case '!':
                       case '"':
                       case '#':
                       case '$':
                       case '%':
                       case '&':
                       case 39:
                       case '(':
                       case ')':
                       case '*':
                       case '+':
                       case ',':
                       case '-':
                       case '.':
                       case '/':
                       case '0':
                       case 12:
                         break;
                       default:
                   }
                }
                this.redPackType = i;
             }
          }else {
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(1, this.liveStreamId);
       }
       SCLiveConditionRedPackRollUserInfo tredPackType = this.redPackType;
       if (tredPackType != null) {
          p0.writeInt32(2, tredPackType);
       }
       if (!(this.redPackId).equals(str)) {
          p0.writeString(3, this.redPackId);
       }
       tredPackType = this.rollUser;
       if (tredPackType != null && tredPackType.length > 0) {
          int i = 0;
          SCLiveConditionRedPackRollUserInfo trollUser = this.rollUser;
          while (i < trollUser.length) {
             object oobject = trollUser[i];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i = i + 1;
          }
       }
       tredPackType = this.minRollTime;
       if (tredPackType) {
          p0.writeUInt64(5, tredPackType);
       }
       super.writeTo(p0);
       return;
    }
}
