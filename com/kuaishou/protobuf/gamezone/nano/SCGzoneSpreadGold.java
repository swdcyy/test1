package com.kuaishou.protobuf.gamezone.nano.SCGzoneSpreadGold;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCGzoneSpreadGold extends MessageNano	// class@000bde
{
    public String activityId;
    public String backgroundColor;
    public String backgroundFrameColor;
    public String buttonColor;
    public String buttonText;
    public String countDownColor;
    public String goldId;
    public String leftIconAnimationUrl;
    public UserInfos$PicUrl[] leftIconUrl;
    public long showTimeMills;
    public String spreadGoldId;
    public String tip;
    public String token;
    public long tsMills;
    public static SCGzoneSpreadGold[] _emptyArray;

    public void SCGzoneSpreadGold(){
       super();
       this.clear();
    }
    public static SCGzoneSpreadGold[] emptyArray(){
       if (SCGzoneSpreadGold._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGzoneSpreadGold._emptyArray == null) {
             SCGzoneSpreadGold[] sCGzoneSprea = new SCGzoneSpreadGold[0];
             SCGzoneSpreadGold._emptyArray = sCGzoneSprea;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGzoneSpreadGold._emptyArray;
    }
    public static SCGzoneSpreadGold parseFrom(CodedInputByteBufferNano p0){
       return new SCGzoneSpreadGold().mergeFrom(p0);
    }
    public static SCGzoneSpreadGold parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGzoneSpreadGold(), p0);
    }
    public SCGzoneSpreadGold clear(){
       this.activityId = "";
       this.goldId = "";
       this.token = "";
       this.spreadGoldId = "";
       this.showTimeMills = 0;
       this.leftIconUrl = UserInfos$PicUrl.emptyArray();
       this.tip = "";
       this.leftIconAnimationUrl = "";
       this.backgroundColor = "";
       this.backgroundFrameColor = "";
       this.buttonColor = "";
       this.buttonText = "";
       this.countDownColor = "";
       this.tsMills = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.activityId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.activityId);
       }
       if (!(this.goldId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.goldId);
       }
       if (!(this.token).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.token);
       }
       if (!(this.spreadGoldId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.spreadGoldId);
       }
       SCGzoneSpreadGold tshowTimeMil = this.showTimeMills;
       if (tshowTimeMil) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tshowTimeMil);
       }
       SCGzoneSpreadGold tleftIconUrl = this.leftIconUrl;
       if (tleftIconUrl != null && tleftIconUrl.length > 0) {
          int i1 = 0;
          tshowTimeMil = this.leftIconUrl;
          while (i1 < tshowTimeMil.length) {
             object oobject = tshowTimeMil[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(6, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.tip).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.tip);
       }
       if (!(this.leftIconAnimationUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.leftIconAnimationUrl);
       }
       if (!(this.backgroundColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.backgroundColor);
       }
       if (!(this.backgroundFrameColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.backgroundFrameColor);
       }
       if (!(this.buttonColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.buttonColor);
       }
       if (!(this.buttonText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.buttonText);
       }
       if (!(this.countDownColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.countDownColor);
       }
       tleftIconUrl = this.tsMills;
       if (tleftIconUrl) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(14, tleftIconUrl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGzoneSpreadGold mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.activityId = p0.readString();
                break;
              case 18:
                this.goldId = p0.readString();
                break;
              case 26:
                this.token = p0.readString();
                break;
              case '"':
                this.spreadGoldId = p0.readString();
                break;
              case '(':
                this.showTimeMills = p0.readUInt64();
                break;
              case '2':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 50);
                SCGzoneSpreadGold tleftIconUrl = this.leftIconUrl;
                int i1 = (tleftIconUrl == null)? 0: tleftIconUrl.length;
                i = i + i1;
                UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                if (i1) {
                   System.arraycopy(tleftIconUrl, 0, picUrlArray, 0, i1);
                }
                int i2 = i - 1;
                while (i1 < i2) {
                   picUrlArray[i1] = new UserInfos$PicUrl();
                   p0.readMessage(picUrlArray[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                picUrlArray[i1] = new UserInfos$PicUrl();
                p0.readMessage(picUrlArray[i1]);
                this.leftIconUrl = picUrlArray;
                break;
              case ':':
                this.tip = p0.readString();
                break;
              case 'B':
                this.leftIconAnimationUrl = p0.readString();
                break;
              case 'J':
                this.backgroundColor = p0.readString();
                break;
              case 'R':
                this.backgroundFrameColor = p0.readString();
                break;
              case 'Z':
                this.buttonColor = p0.readString();
                break;
              case 'b':
                this.buttonText = p0.readString();
                break;
              case 'j':
                this.countDownColor = p0.readString();
                break;
              case 'p':
                this.tsMills = p0.readUInt64();
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
       if (!(this.activityId).equals(str)) {
          p0.writeString(1, this.activityId);
       }
       if (!(this.goldId).equals(str)) {
          p0.writeString(2, this.goldId);
       }
       if (!(this.token).equals(str)) {
          p0.writeString(3, this.token);
       }
       if (!(this.spreadGoldId).equals(str)) {
          p0.writeString(4, this.spreadGoldId);
       }
       SCGzoneSpreadGold tshowTimeMil = this.showTimeMills;
       if (tshowTimeMil) {
          p0.writeUInt64(5, tshowTimeMil);
       }
       SCGzoneSpreadGold tleftIconUrl = this.leftIconUrl;
       if (tleftIconUrl != null && tleftIconUrl.length > 0) {
          int i = 0;
          tshowTimeMil = this.leftIconUrl;
          while (i < tshowTimeMil.length) {
             object oobject = tshowTimeMil[i];
             if (oobject != null) {
                p0.writeMessage(6, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.tip).equals(str)) {
          p0.writeString(7, this.tip);
       }
       if (!(this.leftIconAnimationUrl).equals(str)) {
          p0.writeString(8, this.leftIconAnimationUrl);
       }
       if (!(this.backgroundColor).equals(str)) {
          p0.writeString(9, this.backgroundColor);
       }
       if (!(this.backgroundFrameColor).equals(str)) {
          p0.writeString(10, this.backgroundFrameColor);
       }
       if (!(this.buttonColor).equals(str)) {
          p0.writeString(11, this.buttonColor);
       }
       if (!(this.buttonText).equals(str)) {
          p0.writeString(12, this.buttonText);
       }
       if (!(this.countDownColor).equals(str)) {
          p0.writeString(13, this.countDownColor);
       }
       tleftIconUrl = this.tsMills;
       if (tleftIconUrl) {
          p0.writeUInt64(14, tleftIconUrl);
       }
       super.writeTo(p0);
       return;
    }
}
