package com.kuaishou.livestream.message.nano.SCLiveCny23CreatorWishInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;
import com.kuaishou.livestream.message.nano.LiveCny23CreatorWishReeeInfo;

public final class SCLiveCny23CreatorWishInfo extends MessageNano	// class@001414
{
    public String audienceJumpKwailink;
    public String audienceWidgetTitle;
    public String authorJumpKwailink;
    public String authorWidgetTitle;
    public UserInfos$PicUrl[] backgroundImg;
    public UserInfos$PicUrl[] buttonImg;
    public String countDownAudienceJumpKwailink;
    public String countDownAuthorJumpKwailink;
    public UserInfos$PicUrl[] countDownIconImg;
    public boolean disableAuthorDisplay;
    public long endShowTimestamp;
    public String endSummaryButtonMsg;
    public String endSummaryKwailink;
    public String endSummaryPopupMsg;
    public boolean hasOpened;
    public boolean hasWish;
    public UserInfos$PicUrl[] iconImg;
    public String logMessage;
    public UserInfos$UserInfo[] luckyUser;
    public long maxRequestTimestamp;
    public long openTimestamp;
    public long participateEntryBreakDurationMs;
    public LiveCny23CreatorWishReeeInfo reeeItemInfo;
    public LiveCny23CreatorWishReeeInfo reeeTotalInfo;
    public String wishId;
    public long wishLiveTimestamp;
    public static SCLiveCny23CreatorWishInfo[] _emptyArray;

    public void SCLiveCny23CreatorWishInfo(){
       super();
       this.clear();
    }
    public static SCLiveCny23CreatorWishInfo[] emptyArray(){
       if (SCLiveCny23CreatorWishInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveCny23CreatorWishInfo._emptyArray == null) {
             SCLiveCny23CreatorWishInfo[] sCLiveCny23C = new SCLiveCny23CreatorWishInfo[0];
             SCLiveCny23CreatorWishInfo._emptyArray = sCLiveCny23C;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveCny23CreatorWishInfo._emptyArray;
    }
    public static SCLiveCny23CreatorWishInfo parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveCny23CreatorWishInfo().mergeFrom(p0);
    }
    public static SCLiveCny23CreatorWishInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveCny23CreatorWishInfo(), p0);
    }
    public SCLiveCny23CreatorWishInfo clear(){
       this.endShowTimestamp = 0;
       this.logMessage = "";
       this.audienceJumpKwailink = "";
       this.authorJumpKwailink = "";
       this.backgroundImg = UserInfos$PicUrl.emptyArray();
       this.iconImg = UserInfos$PicUrl.emptyArray();
       this.buttonImg = UserInfos$PicUrl.emptyArray();
       this.audienceWidgetTitle = "";
       this.authorWidgetTitle = "";
       this.hasWish = false;
       this.wishId = "";
       this.wishLiveTimestamp = 0;
       this.participateEntryBreakDurationMs = 0;
       this.reeeTotalInfo = null;
       this.reeeItemInfo = null;
       this.hasOpened = false;
       this.openTimestamp = 0;
       this.maxRequestTimestamp = 0;
       this.luckyUser = UserInfos$UserInfo.emptyArray();
       this.disableAuthorDisplay = false;
       this.endSummaryKwailink = "";
       this.endSummaryPopupMsg = "";
       this.countDownAudienceJumpKwailink = "";
       this.countDownAuthorJumpKwailink = "";
       this.countDownIconImg = UserInfos$PicUrl.emptyArray();
       this.endSummaryButtonMsg = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       SCLiveCny23CreatorWishInfo tbackgroundI;
       object oobject;
       int i = super.computeSerializedSize();
       SCLiveCny23CreatorWishInfo tendShowTime = this.endShowTimestamp;
       SCLiveCny23CreatorWishInfo sCLiveCny23C = null;
       if (tendShowTime - sCLiveCny23C) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tendShowTime);
       }
       String str = "";
       if (!(this.logMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.logMessage);
       }
       if (!(this.audienceJumpKwailink).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.audienceJumpKwailink);
       }
       if (!(this.authorJumpKwailink).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.authorJumpKwailink);
       }
       tendShowTime = this.backgroundImg;
       int i1 = 0;
       if (tendShowTime != null && tendShowTime.length > 0) {
          i2 = 0;
          tbackgroundI = this.backgroundImg;
          while (i2 < tbackgroundI.length) {
             oobject = tbackgroundI[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tendShowTime = this.iconImg;
       if (tendShowTime != null && tendShowTime.length > 0) {
          i2 = 0;
          tbackgroundI = this.iconImg;
          while (i2 < tbackgroundI.length) {
             oobject = tbackgroundI[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(6, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tendShowTime = this.buttonImg;
       if (tendShowTime != null && tendShowTime.length > 0) {
          i2 = 0;
          tbackgroundI = this.buttonImg;
          while (i2 < tbackgroundI.length) {
             oobject = tbackgroundI[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(7, oobject);
             }
             i2 = i2 + 1;
          }
       }
       if (!(this.audienceWidgetTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.audienceWidgetTitle);
       }
       if (!(this.authorWidgetTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.authorWidgetTitle);
       }
       tendShowTime = this.hasWish;
       if (tendShowTime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(10, tendShowTime);
       }
       if (!(this.wishId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.wishId);
       }
       tbackgroundI = this.wishLiveTimestamp;
       if (tbackgroundI - sCLiveCny23C) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(12, tbackgroundI);
       }
       tbackgroundI = this.participateEntryBreakDurationMs;
       if (tbackgroundI - sCLiveCny23C) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(13, tbackgroundI);
       }
       tendShowTime = this.reeeTotalInfo;
       if (tendShowTime != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(14, tendShowTime);
       }
       tendShowTime = this.reeeItemInfo;
       if (tendShowTime != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(15, tendShowTime);
       }
       tendShowTime = this.hasOpened;
       if (tendShowTime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(16, tendShowTime);
       }
       tbackgroundI = this.openTimestamp;
       if (tbackgroundI - sCLiveCny23C) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(17, tbackgroundI);
       }
       tbackgroundI = this.maxRequestTimestamp;
       if (tbackgroundI - sCLiveCny23C) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(18, tbackgroundI);
       }
       tendShowTime = this.luckyUser;
       if (tendShowTime != null && tendShowTime.length > 0) {
          i2 = 0;
          sCLiveCny23C = this.luckyUser;
          while (i2 < sCLiveCny23C.length) {
             object oobject1 = sCLiveCny23C[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(19, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       tendShowTime = this.disableAuthorDisplay;
       if (tendShowTime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(20, tendShowTime);
       }
       if (!(this.endSummaryKwailink).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(21, this.endSummaryKwailink);
       }
       if (!(this.endSummaryPopupMsg).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(22, this.endSummaryPopupMsg);
       }
       if (!(this.countDownAudienceJumpKwailink).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(23, this.countDownAudienceJumpKwailink);
       }
       if (!(this.countDownAuthorJumpKwailink).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(24, this.countDownAuthorJumpKwailink);
       }
       tendShowTime = this.countDownIconImg;
       if (tendShowTime != null && tendShowTime.length > 0) {
          tendShowTime = this.countDownIconImg;
          while (i1 < tendShowTime.length) {
             object oobject2 = tendShowTime[i1];
             if (oobject2 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(25, oobject2);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.endSummaryButtonMsg).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(26, this.endSummaryButtonMsg);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveCny23CreatorWishInfo mergeFrom(CodedInputByteBufferNano p0){
       SCLiveCny23CreatorWishInfo tbackgroundI;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 8:
                this.endShowTimestamp = p0.readUInt64();
                break;
              case 18:
                this.logMessage = p0.readString();
                break;
              case 26:
                this.audienceJumpKwailink = p0.readString();
                break;
              case '"':
                this.authorJumpKwailink = p0.readString();
                break;
              case '*':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 42);
                tbackgroundI = this.backgroundImg;
                i2 = (tbackgroundI == null)? 0: tbackgroundI.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tbackgroundI, i1, picUrlArray, i1, i2);
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
                this.backgroundImg = picUrlArray;
                break;
              case '2':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 50);
                tbackgroundI = this.iconImg;
                i2 = (tbackgroundI == null)? 0: tbackgroundI.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tbackgroundI, i1, picUrlArray, i1, i2);
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
                this.iconImg = picUrlArray;
                break;
              case ':':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 58);
                tbackgroundI = this.buttonImg;
                i2 = (tbackgroundI == null)? 0: tbackgroundI.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tbackgroundI, i1, picUrlArray, i1, i2);
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
                this.buttonImg = picUrlArray;
                break;
              case 'B':
                this.audienceWidgetTitle = p0.readString();
                break;
              case 'J':
                this.authorWidgetTitle = p0.readString();
                break;
              case 'P':
                this.hasWish = p0.readBool();
                break;
              case 'Z':
                this.wishId = p0.readString();
                break;
              case '`':
                this.wishLiveTimestamp = p0.readUInt64();
                break;
              case 'h':
                this.participateEntryBreakDurationMs = p0.readUInt64();
                break;
              case 'r':
                if (this.reeeTotalInfo == null) {
                   this.reeeTotalInfo = new LiveCny23CreatorWishReeeInfo();
                }
                p0.readMessage(this.reeeTotalInfo);
                break;
              case 'z':
                if (this.reeeItemInfo == null) {
                   this.reeeItemInfo = new LiveCny23CreatorWishReeeInfo();
                }
                p0.readMessage(this.reeeItemInfo);
                break;
              case 128:
                this.hasOpened = p0.readBool();
                break;
              case 136:
                this.openTimestamp = p0.readUInt64();
                break;
              case 144:
                this.maxRequestTimestamp = p0.readUInt64();
                break;
              case 154:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 154);
                tbackgroundI = this.luckyUser;
                i2 = (tbackgroundI == null)? 0: tbackgroundI.length;
                i = i + i2;
                UserInfos$UserInfo[] userInfoArra = new UserInfos$UserInfo[i];
                if (i2) {
                   System.arraycopy(tbackgroundI, i1, userInfoArra, i1, i2);
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
                this.luckyUser = userInfoArra;
                break;
              case 160:
                this.disableAuthorDisplay = p0.readBool();
                break;
              case 170:
                this.endSummaryKwailink = p0.readString();
                break;
              case 178:
                this.endSummaryPopupMsg = p0.readString();
                break;
              case 186:
                this.countDownAudienceJumpKwailink = p0.readString();
                break;
              case 194:
                this.countDownAuthorJumpKwailink = p0.readString();
                break;
              case 202:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 202);
                tbackgroundI = this.countDownIconImg;
                i2 = (tbackgroundI == null)? 0: tbackgroundI.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tbackgroundI, i1, picUrlArray, i1, i2);
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
                this.countDownIconImg = picUrlArray;
                break;
              case 210:
                this.endSummaryButtonMsg = p0.readString();
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
       SCLiveCny23CreatorWishInfo tbackgroundI;
       object oobject;
       SCLiveCny23CreatorWishInfo tendShowTime = this.endShowTimestamp;
       SCLiveCny23CreatorWishInfo sCLiveCny23C = null;
       if (tendShowTime - sCLiveCny23C) {
          p0.writeUInt64(1, tendShowTime);
       }
       String str = "";
       if (!(this.logMessage).equals(str)) {
          p0.writeString(2, this.logMessage);
       }
       if (!(this.audienceJumpKwailink).equals(str)) {
          p0.writeString(3, this.audienceJumpKwailink);
       }
       if (!(this.authorJumpKwailink).equals(str)) {
          p0.writeString(4, this.authorJumpKwailink);
       }
       tendShowTime = this.backgroundImg;
       int i = 0;
       if (tendShowTime != null && tendShowTime.length > 0) {
          i1 = 0;
          tbackgroundI = this.backgroundImg;
          while (i1 < tbackgroundI.length) {
             oobject = tbackgroundI[i1];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tendShowTime = this.iconImg;
       if (tendShowTime != null && tendShowTime.length > 0) {
          i1 = 0;
          tbackgroundI = this.iconImg;
          while (i1 < tbackgroundI.length) {
             oobject = tbackgroundI[i1];
             if (oobject != null) {
                p0.writeMessage(6, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tendShowTime = this.buttonImg;
       if (tendShowTime != null && tendShowTime.length > 0) {
          i1 = 0;
          tbackgroundI = this.buttonImg;
          while (i1 < tbackgroundI.length) {
             oobject = tbackgroundI[i1];
             if (oobject != null) {
                p0.writeMessage(7, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.audienceWidgetTitle).equals(str)) {
          p0.writeString(8, this.audienceWidgetTitle);
       }
       if (!(this.authorWidgetTitle).equals(str)) {
          p0.writeString(9, this.authorWidgetTitle);
       }
       tendShowTime = this.hasWish;
       if (tendShowTime != null) {
          p0.writeBool(10, tendShowTime);
       }
       if (!(this.wishId).equals(str)) {
          p0.writeString(11, this.wishId);
       }
       tbackgroundI = this.wishLiveTimestamp;
       if (tbackgroundI - sCLiveCny23C) {
          p0.writeUInt64(12, tbackgroundI);
       }
       tbackgroundI = this.participateEntryBreakDurationMs;
       if (tbackgroundI - sCLiveCny23C) {
          p0.writeUInt64(13, tbackgroundI);
       }
       tendShowTime = this.reeeTotalInfo;
       if (tendShowTime != null) {
          p0.writeMessage(14, tendShowTime);
       }
       tendShowTime = this.reeeItemInfo;
       if (tendShowTime != null) {
          p0.writeMessage(15, tendShowTime);
       }
       tendShowTime = this.hasOpened;
       if (tendShowTime != null) {
          p0.writeBool(16, tendShowTime);
       }
       tbackgroundI = this.openTimestamp;
       if (tbackgroundI - sCLiveCny23C) {
          p0.writeUInt64(17, tbackgroundI);
       }
       tbackgroundI = this.maxRequestTimestamp;
       if (tbackgroundI - sCLiveCny23C) {
          p0.writeUInt64(18, tbackgroundI);
       }
       tendShowTime = this.luckyUser;
       if (tendShowTime != null && tendShowTime.length > 0) {
          i1 = 0;
          sCLiveCny23C = this.luckyUser;
          while (i1 < sCLiveCny23C.length) {
             object oobject1 = sCLiveCny23C[i1];
             if (oobject1 != null) {
                p0.writeMessage(19, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tendShowTime = this.disableAuthorDisplay;
       if (tendShowTime != null) {
          p0.writeBool(20, tendShowTime);
       }
       if (!(this.endSummaryKwailink).equals(str)) {
          p0.writeString(21, this.endSummaryKwailink);
       }
       if (!(this.endSummaryPopupMsg).equals(str)) {
          p0.writeString(22, this.endSummaryPopupMsg);
       }
       if (!(this.countDownAudienceJumpKwailink).equals(str)) {
          p0.writeString(23, this.countDownAudienceJumpKwailink);
       }
       if (!(this.countDownAuthorJumpKwailink).equals(str)) {
          p0.writeString(24, this.countDownAuthorJumpKwailink);
       }
       tendShowTime = this.countDownIconImg;
       if (tendShowTime != null && tendShowTime.length > 0) {
          tendShowTime = this.countDownIconImg;
          while (i < tendShowTime.length) {
             object oobject2 = tendShowTime[i];
             if (oobject2 != null) {
                p0.writeMessage(25, oobject2);
             }
             i = i + 1;
          }
       }
       if (!(this.endSummaryButtonMsg).equals(str)) {
          p0.writeString(26, this.endSummaryButtonMsg);
       }
       super.writeTo(p0);
       return;
    }
}
