package com.kuaishou.protobuf.livestream.nano.SCLiveMultiPkApplyEndPopup;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCLiveMultiPkApplyEndPopup extends MessageNano	// class@000d60
{
    public String pkId;
    public long timestamp;
    public UserInfos$UserInfo[] userInfo;
    public static SCLiveMultiPkApplyEndPopup[] _emptyArray;

    public void SCLiveMultiPkApplyEndPopup(){
       super();
       this.clear();
    }
    public static SCLiveMultiPkApplyEndPopup[] emptyArray(){
       if (SCLiveMultiPkApplyEndPopup._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveMultiPkApplyEndPopup._emptyArray == null) {
             SCLiveMultiPkApplyEndPopup[] sCLiveMultiP = new SCLiveMultiPkApplyEndPopup[0];
             SCLiveMultiPkApplyEndPopup._emptyArray = sCLiveMultiP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveMultiPkApplyEndPopup._emptyArray;
    }
    public static SCLiveMultiPkApplyEndPopup parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveMultiPkApplyEndPopup().mergeFrom(p0);
    }
    public static SCLiveMultiPkApplyEndPopup parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveMultiPkApplyEndPopup(), p0);
    }
    public SCLiveMultiPkApplyEndPopup clear(){
       this.pkId = "";
       this.userInfo = UserInfos$UserInfo.emptyArray();
       this.timestamp = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.pkId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.pkId);
       }
       SCLiveMultiPkApplyEndPopup tuserInfo = this.userInfo;
       if (tuserInfo != null && tuserInfo.length > 0) {
          int i1 = 0;
          SCLiveMultiPkApplyEndPopup tuserInfo1 = this.userInfo;
          while (i1 < tuserInfo1.length) {
             object oobject = tuserInfo1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tuserInfo = this.timestamp;
       if (tuserInfo) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tuserInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveMultiPkApplyEndPopup mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             int i1 = 18;
             if (i != i1) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.timestamp = p0.readUInt64();
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                SCLiveMultiPkApplyEndPopup tuserInfo = this.userInfo;
                int i2 = (tuserInfo == null)? 0: tuserInfo.length;
                i = i + i2;
                UserInfos$UserInfo[] userInfoArra = new UserInfos$UserInfo[i];
                if (i2) {
                   System.arraycopy(tuserInfo, 0, userInfoArra, 0, i2);
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
                this.userInfo = userInfoArra;
             }
          }else {
             this.pkId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.pkId).equals("")) {
          p0.writeString(1, this.pkId);
       }
       SCLiveMultiPkApplyEndPopup tuserInfo = this.userInfo;
       if (tuserInfo != null && tuserInfo.length > 0) {
          int i = 0;
          SCLiveMultiPkApplyEndPopup tuserInfo1 = this.userInfo;
          while (i < tuserInfo1.length) {
             object oobject = tuserInfo1[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       tuserInfo = this.timestamp;
       if (tuserInfo) {
          p0.writeUInt64(3, tuserInfo);
       }
       super.writeTo(p0);
       return;
    }
}
