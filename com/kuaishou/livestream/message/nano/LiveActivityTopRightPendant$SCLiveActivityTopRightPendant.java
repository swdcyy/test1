package com.kuaishou.livestream.message.nano.LiveActivityTopRightPendant$SCLiveActivityTopRightPendant;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveActivityTopRightPendant$SCLiveActivityTopRightPendant extends MessageNano	// class@0010d0
{
    public String buttonText;
    public String clickUrl;
    public long endShowTime;
    public String logMessage;
    public int maxDailyEffectShowTimes;
    public String pendantId;
    public int pendantType;
    public UserInfos$PicUrl[] picUrlV2;
    public UserInfos$PicUrl[] picUrlWithoutText;
    public UserInfos$PicUrl[] picUrls;
    public boolean redDotRemind;
    public static LiveActivityTopRightPendant$SCLiveActivityTopRightPendant[] _emptyArray;

    public void LiveActivityTopRightPendant$SCLiveActivityTopRightPendant(){
       super();
       this.clear();
    }
    public static LiveActivityTopRightPendant$SCLiveActivityTopRightPendant[] emptyArray(){
       if (LiveActivityTopRightPendant$SCLiveActivityTopRightPendant._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveActivityTopRightPendant$SCLiveActivityTopRightPendant._emptyArray == null) {
             LiveActivityTopRightPendant$SCLiveActivityTopRightPendant[] sCLiveActivi = new LiveActivityTopRightPendant$SCLiveActivityTopRightPendant[0];
             LiveActivityTopRightPendant$SCLiveActivityTopRightPendant._emptyArray = sCLiveActivi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveActivityTopRightPendant$SCLiveActivityTopRightPendant._emptyArray;
    }
    public static LiveActivityTopRightPendant$SCLiveActivityTopRightPendant parseFrom(CodedInputByteBufferNano p0){
       return new LiveActivityTopRightPendant$SCLiveActivityTopRightPendant().mergeFrom(p0);
    }
    public static LiveActivityTopRightPendant$SCLiveActivityTopRightPendant parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveActivityTopRightPendant$SCLiveActivityTopRightPendant(), p0);
    }
    public LiveActivityTopRightPendant$SCLiveActivityTopRightPendant clear(){
       this.pendantId = "";
       this.pendantType = 0;
       this.endShowTime = 0;
       this.maxDailyEffectShowTimes = 0;
       this.clickUrl = "";
       this.logMessage = "";
       this.picUrls = UserInfos$PicUrl.emptyArray();
       this.picUrlV2 = UserInfos$PicUrl.emptyArray();
       this.redDotRemind = false;
       this.picUrlWithoutText = UserInfos$PicUrl.emptyArray();
       this.buttonText = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       LiveActivityTopRightPendant$SCLiveActivityTopRightPendant tpicUrls;
       object oobject;
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.pendantId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.pendantId);
       }
       LiveActivityTopRightPendant$SCLiveActivityTopRightPendant tpendantType = this.pendantType;
       if (tpendantType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tpendantType);
       }
       LiveActivityTopRightPendant$SCLiveActivityTopRightPendant tendShowTime = this.endShowTime;
       if (tendShowTime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tendShowTime);
       }
       tpendantType = this.maxDailyEffectShowTimes;
       if (tpendantType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tpendantType);
       }
       if (!(this.clickUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.clickUrl);
       }
       if (!(this.logMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.logMessage);
       }
       tpendantType = this.picUrls;
       int i1 = 0;
       if (tpendantType != null && tpendantType.length > 0) {
          i2 = 0;
          tpicUrls = this.picUrls;
          while (i2 < tpicUrls.length) {
             oobject = tpicUrls[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(8, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tpendantType = this.picUrlV2;
       if (tpendantType != null && tpendantType.length > 0) {
          i2 = 0;
          tpicUrls = this.picUrlV2;
          while (i2 < tpicUrls.length) {
             oobject = tpicUrls[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(9, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tpendantType = this.redDotRemind;
       if (tpendantType != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(10, tpendantType);
       }
       tpendantType = this.picUrlWithoutText;
       if (tpendantType != null && tpendantType.length > 0) {
          tpendantType = this.picUrlWithoutText;
          while (i1 < tpendantType.length) {
             object oobject1 = tpendantType[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(11, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.buttonText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.buttonText);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveActivityTopRightPendant$SCLiveActivityTopRightPendant mergeFrom(CodedInputByteBufferNano p0){
       LiveActivityTopRightPendant$SCLiveActivityTopRightPendant tpicUrls;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 10:
                this.pendantId = p0.readString();
                break;
              case 16:
                this.pendantType = p0.readUInt32();
                break;
              case 24:
                this.endShowTime = p0.readUInt64();
                break;
              case 32:
                this.maxDailyEffectShowTimes = p0.readUInt32();
                break;
              case '2':
                this.clickUrl = p0.readString();
                break;
              case ':':
                this.logMessage = p0.readString();
                break;
              case 'B':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 66);
                tpicUrls = this.picUrls;
                i2 = (tpicUrls == null)? 0: tpicUrls.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tpicUrls, i1, picUrlArray, i1, i2);
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
                this.picUrls = picUrlArray;
                break;
              case 'J':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 74);
                tpicUrls = this.picUrlV2;
                i2 = (tpicUrls == null)? 0: tpicUrls.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tpicUrls, i1, picUrlArray, i1, i2);
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
                this.picUrlV2 = picUrlArray;
                break;
              case 'P':
                this.redDotRemind = p0.readBool();
                break;
              case 'Z':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 90);
                tpicUrls = this.picUrlWithoutText;
                i2 = (tpicUrls == null)? 0: tpicUrls.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tpicUrls, i1, picUrlArray, i1, i2);
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
                this.picUrlWithoutText = picUrlArray;
                break;
              case 'b':
                this.buttonText = p0.readString();
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
       LiveActivityTopRightPendant$SCLiveActivityTopRightPendant tpicUrls;
       object oobject;
       String str = "";
       if (!(this.pendantId).equals(str)) {
          p0.writeString(1, this.pendantId);
       }
       LiveActivityTopRightPendant$SCLiveActivityTopRightPendant tpendantType = this.pendantType;
       if (tpendantType != null) {
          p0.writeUInt32(2, tpendantType);
       }
       LiveActivityTopRightPendant$SCLiveActivityTopRightPendant tendShowTime = this.endShowTime;
       if (tendShowTime) {
          p0.writeUInt64(3, tendShowTime);
       }
       tpendantType = this.maxDailyEffectShowTimes;
       if (tpendantType != null) {
          p0.writeUInt32(4, tpendantType);
       }
       if (!(this.clickUrl).equals(str)) {
          p0.writeString(6, this.clickUrl);
       }
       if (!(this.logMessage).equals(str)) {
          p0.writeString(7, this.logMessage);
       }
       tpendantType = this.picUrls;
       int i = 0;
       if (tpendantType != null && tpendantType.length > 0) {
          i1 = 0;
          tpicUrls = this.picUrls;
          while (i1 < tpicUrls.length) {
             oobject = tpicUrls[i1];
             if (oobject != null) {
                p0.writeMessage(8, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tpendantType = this.picUrlV2;
       if (tpendantType != null && tpendantType.length > 0) {
          i1 = 0;
          tpicUrls = this.picUrlV2;
          while (i1 < tpicUrls.length) {
             oobject = tpicUrls[i1];
             if (oobject != null) {
                p0.writeMessage(9, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tpendantType = this.redDotRemind;
       if (tpendantType != null) {
          p0.writeBool(10, tpendantType);
       }
       tpendantType = this.picUrlWithoutText;
       if (tpendantType != null && tpendantType.length > 0) {
          tpendantType = this.picUrlWithoutText;
          while (i < tpendantType.length) {
             object oobject1 = tpendantType[i];
             if (oobject1 != null) {
                p0.writeMessage(11, oobject1);
             }
             i = i + 1;
          }
       }
       if (!(this.buttonText).equals(str)) {
          p0.writeString(12, this.buttonText);
       }
       super.writeTo(p0);
       return;
    }
}
