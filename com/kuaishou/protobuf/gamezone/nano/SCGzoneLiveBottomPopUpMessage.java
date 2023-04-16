package com.kuaishou.protobuf.gamezone.nano.SCGzoneLiveBottomPopUpMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCGzoneLiveBottomPopUpMessage extends MessageNano	// class@000bd7
{
    public UserInfos$PicUrl[] backgroundUrl;
    public int bizType;
    public String buttonColor;
    public String buttonMsgColor;
    public String buttonMsgText;
    public boolean cyclicPlay;
    public boolean forcePortrait;
    public UserInfos$PicUrl[] icon;
    public String jumpUrl;
    public UserInfos$PicUrl[] landscapeBackgroundUrl;
    public String messageColor;
    public String messageText;
    public int showDelayMillis;
    public int showDurationMillis;
    public long showEndTime;
    public static SCGzoneLiveBottomPopUpMessage[] _emptyArray;

    public void SCGzoneLiveBottomPopUpMessage(){
       super();
       this.clear();
    }
    public static SCGzoneLiveBottomPopUpMessage[] emptyArray(){
       if (SCGzoneLiveBottomPopUpMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGzoneLiveBottomPopUpMessage._emptyArray == null) {
             SCGzoneLiveBottomPopUpMessage[] sCGzoneLiveB = new SCGzoneLiveBottomPopUpMessage[0];
             SCGzoneLiveBottomPopUpMessage._emptyArray = sCGzoneLiveB;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGzoneLiveBottomPopUpMessage._emptyArray;
    }
    public static SCGzoneLiveBottomPopUpMessage parseFrom(CodedInputByteBufferNano p0){
       return new SCGzoneLiveBottomPopUpMessage().mergeFrom(p0);
    }
    public static SCGzoneLiveBottomPopUpMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGzoneLiveBottomPopUpMessage(), p0);
    }
    public SCGzoneLiveBottomPopUpMessage clear(){
       this.backgroundUrl = UserInfos$PicUrl.emptyArray();
       this.messageColor = "";
       this.messageText = "";
       this.icon = UserInfos$PicUrl.emptyArray();
       this.buttonColor = "";
       this.buttonMsgText = "";
       this.buttonMsgColor = "";
       this.jumpUrl = "";
       this.showDelayMillis = 0;
       this.showDurationMillis = 0;
       this.showEndTime = 0;
       this.forcePortrait = false;
       this.bizType = 0;
       this.landscapeBackgroundUrl = UserInfos$PicUrl.emptyArray();
       this.cyclicPlay = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       SCGzoneLiveBottomPopUpMessage tbackgroundU1;
       int i = super.computeSerializedSize();
       SCGzoneLiveBottomPopUpMessage tbackgroundU = this.backgroundUrl;
       int i1 = 0;
       if (tbackgroundU != null && tbackgroundU.length > 0) {
          i2 = 0;
          tbackgroundU1 = this.backgroundUrl;
          while (i2 < tbackgroundU1.length) {
             object oobject = tbackgroundU1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i2 = i2 + 1;
          }
       }
       String str = "";
       if (!(this.messageColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.messageColor);
       }
       if (!(this.messageText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.messageText);
       }
       tbackgroundU = this.icon;
       if (tbackgroundU != null && tbackgroundU.length > 0) {
          i2 = 0;
          SCGzoneLiveBottomPopUpMessage ticon = this.icon;
          while (i2 < ticon.length) {
             object oobject1 = ticon[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       if (!(this.buttonColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.buttonColor);
       }
       if (!(this.buttonMsgText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.buttonMsgText);
       }
       if (!(this.buttonMsgColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.buttonMsgColor);
       }
       if (!(this.jumpUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.jumpUrl);
       }
       tbackgroundU = this.showDelayMillis;
       if (tbackgroundU != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(9, tbackgroundU);
       }
       tbackgroundU = this.showDurationMillis;
       if (tbackgroundU != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(10, tbackgroundU);
       }
       tbackgroundU1 = this.showEndTime;
       if (tbackgroundU1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(11, tbackgroundU1);
       }
       tbackgroundU = this.forcePortrait;
       if (tbackgroundU != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(12, tbackgroundU);
       }
       tbackgroundU = this.bizType;
       if (tbackgroundU != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(13, tbackgroundU);
       }
       tbackgroundU = this.landscapeBackgroundUrl;
       if (tbackgroundU != null && tbackgroundU.length > 0) {
          tbackgroundU = this.landscapeBackgroundUrl;
          while (i1 < tbackgroundU.length) {
             object oobject2 = tbackgroundU[i1];
             if (oobject2 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(14, oobject2);
             }
             i1 = i1 + 1;
          }
       }
       tbackgroundU = this.cyclicPlay;
       if (tbackgroundU != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(15, tbackgroundU);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGzoneLiveBottomPopUpMessage mergeFrom(CodedInputByteBufferNano p0){
       SCGzoneLiveBottomPopUpMessage tbackgroundU;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 10:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 10);
                tbackgroundU = this.backgroundUrl;
                i2 = (tbackgroundU == null)? 0: tbackgroundU.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tbackgroundU, i1, picUrlArray, i1, i2);
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
                this.backgroundUrl = picUrlArray;
                break;
              case 18:
                this.messageColor = p0.readString();
                break;
              case 26:
                this.messageText = p0.readString();
                break;
              case '"':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 34);
                tbackgroundU = this.icon;
                i2 = (tbackgroundU == null)? 0: tbackgroundU.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tbackgroundU, i1, picUrlArray, i1, i2);
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
                this.icon = picUrlArray;
                break;
              case '*':
                this.buttonColor = p0.readString();
                break;
              case '2':
                this.buttonMsgText = p0.readString();
                break;
              case ':':
                this.buttonMsgColor = p0.readString();
                break;
              case 'B':
                this.jumpUrl = p0.readString();
                break;
              case 'H':
                this.showDelayMillis = p0.readUInt32();
                break;
              case 'P':
                this.showDurationMillis = p0.readUInt32();
                break;
              case 'X':
                this.showEndTime = p0.readUInt64();
                break;
              case '`':
                this.forcePortrait = p0.readBool();
                break;
              case 'h':
                this.bizType = p0.readUInt32();
                break;
              case 'r':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 114);
                tbackgroundU = this.landscapeBackgroundUrl;
                i2 = (tbackgroundU == null)? 0: tbackgroundU.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tbackgroundU, i1, picUrlArray, i1, i2);
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
                this.landscapeBackgroundUrl = picUrlArray;
                break;
              case 'x':
                this.cyclicPlay = p0.readBool();
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
       SCGzoneLiveBottomPopUpMessage tbackgroundU1;
       SCGzoneLiveBottomPopUpMessage tbackgroundU = this.backgroundUrl;
       int i = 0;
       if (tbackgroundU != null && tbackgroundU.length > 0) {
          i1 = 0;
          tbackgroundU1 = this.backgroundUrl;
          while (i1 < tbackgroundU1.length) {
             object oobject = tbackgroundU1[i1];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       String str = "";
       if (!(this.messageColor).equals(str)) {
          p0.writeString(2, this.messageColor);
       }
       if (!(this.messageText).equals(str)) {
          p0.writeString(3, this.messageText);
       }
       tbackgroundU = this.icon;
       if (tbackgroundU != null && tbackgroundU.length > 0) {
          i1 = 0;
          SCGzoneLiveBottomPopUpMessage ticon = this.icon;
          while (i1 < ticon.length) {
             object oobject1 = ticon[i1];
             if (oobject1 != null) {
                p0.writeMessage(4, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.buttonColor).equals(str)) {
          p0.writeString(5, this.buttonColor);
       }
       if (!(this.buttonMsgText).equals(str)) {
          p0.writeString(6, this.buttonMsgText);
       }
       if (!(this.buttonMsgColor).equals(str)) {
          p0.writeString(7, this.buttonMsgColor);
       }
       if (!(this.jumpUrl).equals(str)) {
          p0.writeString(8, this.jumpUrl);
       }
       tbackgroundU = this.showDelayMillis;
       if (tbackgroundU != null) {
          p0.writeUInt32(9, tbackgroundU);
       }
       tbackgroundU = this.showDurationMillis;
       if (tbackgroundU != null) {
          p0.writeUInt32(10, tbackgroundU);
       }
       tbackgroundU1 = this.showEndTime;
       if (tbackgroundU1) {
          p0.writeUInt64(11, tbackgroundU1);
       }
       tbackgroundU = this.forcePortrait;
       if (tbackgroundU != null) {
          p0.writeBool(12, tbackgroundU);
       }
       tbackgroundU = this.bizType;
       if (tbackgroundU != null) {
          p0.writeUInt32(13, tbackgroundU);
       }
       tbackgroundU = this.landscapeBackgroundUrl;
       if (tbackgroundU != null && tbackgroundU.length > 0) {
          tbackgroundU = this.landscapeBackgroundUrl;
          while (i < tbackgroundU.length) {
             object oobject2 = tbackgroundU[i];
             if (oobject2 != null) {
                p0.writeMessage(14, oobject2);
             }
             i = i + 1;
          }
       }
       tbackgroundU = this.cyclicPlay;
       if (tbackgroundU != null) {
          p0.writeBool(15, tbackgroundU);
       }
       super.writeTo(p0);
       return;
    }
}
