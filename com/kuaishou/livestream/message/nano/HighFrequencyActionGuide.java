package com.kuaishou.livestream.message.nano.HighFrequencyActionGuide;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;
import com.kuaishou.livestream.message.nano.HighFrequencyActionGuide$TextDescription;

public final class HighFrequencyActionGuide extends MessageNano	// class@0010b6
{
    public String actionText;
    public String actionUrl;
    public String businessParams;
    public String configBizId;
    public String configBizIdV2;
    public int count;
    public int giftId;
    public String giftToken;
    public UserInfos$PicUrl[] leftIcon;
    public int liteBizType;
    public long maxShowDurationMs;
    public int style;
    public String subBizId;
    public String subBizType;
    public HighFrequencyActionGuide$TextDescription subTitle;
    public String text;
    public HighFrequencyActionGuide$TextDescription titleLarge;
    public HighFrequencyActionGuide$TextDescription titleSmall;
    public static HighFrequencyActionGuide[] _emptyArray;

    public void HighFrequencyActionGuide(){
       super();
       this.clear();
    }
    public static HighFrequencyActionGuide[] emptyArray(){
       if (HighFrequencyActionGuide._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (HighFrequencyActionGuide._emptyArray == null) {
             HighFrequencyActionGuide[] highFrequenc = new HighFrequencyActionGuide[0];
             HighFrequencyActionGuide._emptyArray = highFrequenc;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return HighFrequencyActionGuide._emptyArray;
    }
    public static HighFrequencyActionGuide parseFrom(CodedInputByteBufferNano p0){
       return new HighFrequencyActionGuide().mergeFrom(p0);
    }
    public static HighFrequencyActionGuide parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new HighFrequencyActionGuide(), p0);
    }
    public HighFrequencyActionGuide clear(){
       this.configBizId = "";
       this.text = "";
       this.count = 0;
       this.actionUrl = "";
       this.actionText = "";
       this.giftId = 0;
       this.configBizIdV2 = "";
       this.style = 0;
       this.titleLarge = null;
       this.titleSmall = null;
       this.subTitle = null;
       this.leftIcon = UserInfos$PicUrl.emptyArray();
       this.businessParams = "";
       this.subBizType = "";
       this.subBizId = "";
       this.maxShowDurationMs = 0;
       this.liteBizType = 0;
       this.giftToken = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       HighFrequencyActionGuide tleftIcon;
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.configBizId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.configBizId);
       }
       if (!(this.text).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.text);
       }
       HighFrequencyActionGuide tcount = this.count;
       if (tcount != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tcount);
       }
       if (!(this.actionUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.actionUrl);
       }
       if (!(this.actionText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.actionText);
       }
       tcount = this.giftId;
       if (tcount != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tcount);
       }
       if (!(this.configBizIdV2).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.configBizIdV2);
       }
       tcount = this.style;
       if (tcount != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, tcount);
       }
       tcount = this.titleLarge;
       if (tcount != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, tcount);
       }
       tcount = this.titleSmall;
       if (tcount != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(10, tcount);
       }
       tcount = this.subTitle;
       if (tcount != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(11, tcount);
       }
       tcount = this.leftIcon;
       if (tcount != null && tcount.length > 0) {
          int i1 = 0;
          tleftIcon = this.leftIcon;
          while (i1 < tleftIcon.length) {
             object oobject = tleftIcon[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(12, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.businessParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.businessParams);
       }
       if (!(this.subBizType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.subBizType);
       }
       if (!(this.subBizId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(15, this.subBizId);
       }
       tleftIcon = this.maxShowDurationMs;
       if (tleftIcon) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(16, tleftIcon);
       }
       tcount = this.liteBizType;
       if (tcount != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(17, tcount);
       }
       if (!(this.giftToken).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(18, this.giftToken);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public HighFrequencyActionGuide mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.configBizId = p0.readString();
                break;
              case 18:
                this.text = p0.readString();
                break;
              case 24:
                this.count = p0.readUInt32();
                break;
              case '"':
                this.actionUrl = p0.readString();
                break;
              case '*':
                this.actionText = p0.readString();
                break;
              case '0':
                this.giftId = p0.readUInt32();
                break;
              case ':':
                this.configBizIdV2 = p0.readString();
                break;
              case '@':
                this.style = p0.readUInt32();
                break;
              case 'J':
                if (this.titleLarge == null) {
                   this.titleLarge = new HighFrequencyActionGuide$TextDescription();
                }
                p0.readMessage(this.titleLarge);
                break;
              case 'R':
                if (this.titleSmall == null) {
                   this.titleSmall = new HighFrequencyActionGuide$TextDescription();
                }
                p0.readMessage(this.titleSmall);
                break;
              case 'Z':
                if (this.subTitle == null) {
                   this.subTitle = new HighFrequencyActionGuide$TextDescription();
                }
                p0.readMessage(this.subTitle);
                break;
              case 'b':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 98);
                HighFrequencyActionGuide tleftIcon = this.leftIcon;
                int i1 = (tleftIcon == null)? 0: tleftIcon.length;
                i = i + i1;
                UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                if (i1) {
                   System.arraycopy(tleftIcon, 0, picUrlArray, 0, i1);
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
                this.leftIcon = picUrlArray;
                break;
              case 'j':
                this.businessParams = p0.readString();
                break;
              case 'r':
                this.subBizType = p0.readString();
                break;
              case 'z':
                this.subBizId = p0.readString();
                break;
              case 128:
                this.maxShowDurationMs = p0.readUInt64();
                break;
              case 136:
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.liteBizType = i;
                }
                break;
              case 146:
                this.giftToken = p0.readString();
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
       HighFrequencyActionGuide tleftIcon;
       String str = "";
       if (!(this.configBizId).equals(str)) {
          p0.writeString(1, this.configBizId);
       }
       if (!(this.text).equals(str)) {
          p0.writeString(2, this.text);
       }
       HighFrequencyActionGuide tcount = this.count;
       if (tcount != null) {
          p0.writeUInt32(3, tcount);
       }
       if (!(this.actionUrl).equals(str)) {
          p0.writeString(4, this.actionUrl);
       }
       if (!(this.actionText).equals(str)) {
          p0.writeString(5, this.actionText);
       }
       tcount = this.giftId;
       if (tcount != null) {
          p0.writeUInt32(6, tcount);
       }
       if (!(this.configBizIdV2).equals(str)) {
          p0.writeString(7, this.configBizIdV2);
       }
       tcount = this.style;
       if (tcount != null) {
          p0.writeUInt32(8, tcount);
       }
       tcount = this.titleLarge;
       if (tcount != null) {
          p0.writeMessage(9, tcount);
       }
       tcount = this.titleSmall;
       if (tcount != null) {
          p0.writeMessage(10, tcount);
       }
       tcount = this.subTitle;
       if (tcount != null) {
          p0.writeMessage(11, tcount);
       }
       tcount = this.leftIcon;
       if (tcount != null && tcount.length > 0) {
          int i = 0;
          tleftIcon = this.leftIcon;
          while (i < tleftIcon.length) {
             object oobject = tleftIcon[i];
             if (oobject != null) {
                p0.writeMessage(12, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.businessParams).equals(str)) {
          p0.writeString(13, this.businessParams);
       }
       if (!(this.subBizType).equals(str)) {
          p0.writeString(14, this.subBizType);
       }
       if (!(this.subBizId).equals(str)) {
          p0.writeString(15, this.subBizId);
       }
       tleftIcon = this.maxShowDurationMs;
       if (tleftIcon) {
          p0.writeUInt64(16, tleftIcon);
       }
       tcount = this.liteBizType;
       if (tcount != null) {
          p0.writeInt32(17, tcount);
       }
       if (!(this.giftToken).equals(str)) {
          p0.writeString(18, this.giftToken);
       }
       super.writeTo(p0);
       return;
    }
}
