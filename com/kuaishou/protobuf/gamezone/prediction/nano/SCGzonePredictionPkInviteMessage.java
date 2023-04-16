package com.kuaishou.protobuf.gamezone.prediction.nano.SCGzonePredictionPkInviteMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCGzonePredictionPkInviteMessage extends MessageNano	// class@000be6
{
    public UserInfos$PicUrl[] headUrl;
    public long initiatorUid;
    public String questionTitle;
    public String username;
    public static SCGzonePredictionPkInviteMessage[] _emptyArray;

    public void SCGzonePredictionPkInviteMessage(){
       super();
       this.clear();
    }
    public static SCGzonePredictionPkInviteMessage[] emptyArray(){
       if (SCGzonePredictionPkInviteMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGzonePredictionPkInviteMessage._emptyArray == null) {
             SCGzonePredictionPkInviteMessage[] sCGzonePredi = new SCGzonePredictionPkInviteMessage[0];
             SCGzonePredictionPkInviteMessage._emptyArray = sCGzonePredi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGzonePredictionPkInviteMessage._emptyArray;
    }
    public static SCGzonePredictionPkInviteMessage parseFrom(CodedInputByteBufferNano p0){
       return new SCGzonePredictionPkInviteMessage().mergeFrom(p0);
    }
    public static SCGzonePredictionPkInviteMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGzonePredictionPkInviteMessage(), p0);
    }
    public SCGzonePredictionPkInviteMessage clear(){
       this.initiatorUid = 0;
       this.username = "";
       this.headUrl = UserInfos$PicUrl.emptyArray();
       this.questionTitle = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCGzonePredictionPkInviteMessage tinitiatorUi = this.initiatorUid;
       if (tinitiatorUi - null) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tinitiatorUi);
       }
       String str = "";
       if (!(this.username).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.username);
       }
       tinitiatorUi = this.headUrl;
       if (tinitiatorUi != null && tinitiatorUi.length > 0) {
          int i1 = 0;
          SCGzonePredictionPkInviteMessage theadUrl = this.headUrl;
          while (i1 < theadUrl.length) {
             object oobject = theadUrl[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.questionTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.questionTitle);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGzonePredictionPkInviteMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                int i1 = 26;
                if (i != i1) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.questionTitle = p0.readString();
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   SCGzonePredictionPkInviteMessage theadUrl = this.headUrl;
                   int i2 = (theadUrl == null)? 0: theadUrl.length;
                   i = i + i2;
                   UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                   if (i2) {
                      System.arraycopy(theadUrl, 0, picUrlArray, 0, i2);
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
                   this.headUrl = picUrlArray;
                }
             }else {
                this.username = p0.readString();
             }
          }else {
             this.initiatorUid = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCGzonePredictionPkInviteMessage tinitiatorUi = this.initiatorUid;
       if (tinitiatorUi - null) {
          p0.writeUInt64(1, tinitiatorUi);
       }
       String str = "";
       if (!(this.username).equals(str)) {
          p0.writeString(2, this.username);
       }
       tinitiatorUi = this.headUrl;
       if (tinitiatorUi != null && tinitiatorUi.length > 0) {
          int i = 0;
          SCGzonePredictionPkInviteMessage theadUrl = this.headUrl;
          while (i < theadUrl.length) {
             object oobject = theadUrl[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.questionTitle).equals(str)) {
          p0.writeString(4, this.questionTitle);
       }
       super.writeTo(p0);
       return;
    }
}
