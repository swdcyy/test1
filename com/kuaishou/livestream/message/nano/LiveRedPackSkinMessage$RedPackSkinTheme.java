package com.kuaishou.livestream.message.nano.LiveRedPackSkinMessage$RedPackSkinTheme;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveRedPackSkinMessage$RedPackSkinButtonInfo;
import com.kuaishou.livestream.message.nano.LiveRedPackSkinMessage$ImageTextInfo;
import java.lang.System;
import com.kuaishou.livestream.message.nano.LiveRedPackSkinMessage$RedPackSkinInnerInfo;

public final class LiveRedPackSkinMessage$RedPackSkinTheme extends MessageNano	// class@00127d
{
    public String authorContent;
    public UserInfos$PicUrl[] bgHolidayBottomPict;
    public UserInfos$PicUrl[] bgHolidayPict;
    public UserInfos$PicUrl[] bgResultPict;
    public String bgThemeColor;
    public String bottomContent;
    public String bottomContentLink;
    public int bottomContentLinkType;
    public UserInfos$PicUrl[] bottomIcon;
    public LiveRedPackSkinMessage$ImageTextInfo bottomTip;
    public LiveRedPackSkinMessage$ImageTextInfo bottomTipReplace;
    public UserInfos$PicUrl[] coverBottomPict;
    public UserInfos$PicUrl[] coverTopPict;
    public LiveRedPackSkinMessage$RedPackSkinButtonInfo defaultButton;
    public UserInfos$PicUrl[] disableDirectFollowPict;
    public LiveRedPackSkinMessage$RedPackSkinButtonInfo followButton;
    public UserInfos$PicUrl[] followPict;
    public LiveRedPackSkinMessage$RedPackSkinInnerInfo innerInfo;
    public boolean needBookReservation;
    public boolean needFollow;
    public boolean needReserve;
    public LiveRedPackSkinMessage$RedPackSkinButtonInfo openButton;
    public UserInfos$PicUrl[] openDynamicPic;
    public LiveRedPackSkinMessage$RedPackSkinButtonInfo outsideBottomTip;
    public LiveRedPackSkinMessage$RedPackSkinButtonInfo receiveButton;
    public String redPacketPopAnimationKey;
    public String reservationId;
    public LiveRedPackSkinMessage$RedPackSkinButtonInfo reserveButton;
    public LiveRedPackSkinMessage$RedPackSkinButtonInfo reserveFollowButton;
    public int skinType;
    public UserInfos$PicUrl[] unFollowPict;
    public static LiveRedPackSkinMessage$RedPackSkinTheme[] _emptyArray;

    public void LiveRedPackSkinMessage$RedPackSkinTheme(){
       super();
       this.clear();
    }
    public static LiveRedPackSkinMessage$RedPackSkinTheme[] emptyArray(){
       if (LiveRedPackSkinMessage$RedPackSkinTheme._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRedPackSkinMessage$RedPackSkinTheme._emptyArray == null) {
             LiveRedPackSkinMessage$RedPackSkinTheme[] redPackSkinT = new LiveRedPackSkinMessage$RedPackSkinTheme[0];
             LiveRedPackSkinMessage$RedPackSkinTheme._emptyArray = redPackSkinT;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRedPackSkinMessage$RedPackSkinTheme._emptyArray;
    }
    public static LiveRedPackSkinMessage$RedPackSkinTheme parseFrom(CodedInputByteBufferNano p0){
       return new LiveRedPackSkinMessage$RedPackSkinTheme().mergeFrom(p0);
    }
    public static LiveRedPackSkinMessage$RedPackSkinTheme parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRedPackSkinMessage$RedPackSkinTheme(), p0);
    }
    public LiveRedPackSkinMessage$RedPackSkinTheme clear(){
       this.skinType = 0;
       this.coverTopPict = UserInfos$PicUrl.emptyArray();
       this.coverBottomPict = UserInfos$PicUrl.emptyArray();
       this.bgHolidayPict = UserInfos$PicUrl.emptyArray();
       this.followPict = UserInfos$PicUrl.emptyArray();
       this.unFollowPict = UserInfos$PicUrl.emptyArray();
       this.bgThemeColor = "";
       this.openButton = null;
       this.followButton = null;
       this.innerInfo = null;
       this.receiveButton = null;
       this.openDynamicPic = UserInfos$PicUrl.emptyArray();
       this.authorContent = "";
       this.bottomContent = "";
       this.bgResultPict = UserInfos$PicUrl.emptyArray();
       this.bgHolidayBottomPict = UserInfos$PicUrl.emptyArray();
       this.needFollow = false;
       this.bottomIcon = UserInfos$PicUrl.emptyArray();
       this.bottomContentLink = "";
       this.bottomContentLinkType = 0;
       this.disableDirectFollowPict = UserInfos$PicUrl.emptyArray();
       this.bottomTip = null;
       this.bottomTipReplace = null;
       this.outsideBottomTip = null;
       this.redPacketPopAnimationKey = "";
       this.needReserve = false;
       this.reservationId = "";
       this.reserveButton = null;
       this.reserveFollowButton = null;
       this.defaultButton = null;
       this.needBookReservation = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       LiveRedPackSkinMessage$RedPackSkinTheme tcoverTopPic;
       object oobject;
       LiveRedPackSkinMessage$RedPackSkinTheme topenDynamic;
       object oobject1;
       int i = super.computeSerializedSize();
       LiveRedPackSkinMessage$RedPackSkinTheme tskinType = this.skinType;
       if (tskinType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tskinType);
       }
       tskinType = this.coverTopPict;
       int i1 = 0;
       if (tskinType != null && tskinType.length > 0) {
          i2 = 0;
          tcoverTopPic = this.coverTopPict;
          while (i2 < tcoverTopPic.length) {
             oobject = tcoverTopPic[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tskinType = this.coverBottomPict;
       if (tskinType != null && tskinType.length > 0) {
          i2 = 0;
          tcoverTopPic = this.coverBottomPict;
          while (i2 < tcoverTopPic.length) {
             oobject = tcoverTopPic[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tskinType = this.bgHolidayPict;
       if (tskinType != null && tskinType.length > 0) {
          i2 = 0;
          tcoverTopPic = this.bgHolidayPict;
          while (i2 < tcoverTopPic.length) {
             oobject = tcoverTopPic[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tskinType = this.followPict;
       if (tskinType != null && tskinType.length > 0) {
          i2 = 0;
          tcoverTopPic = this.followPict;
          while (i2 < tcoverTopPic.length) {
             oobject = tcoverTopPic[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tskinType = this.unFollowPict;
       if (tskinType != null && tskinType.length > 0) {
          i2 = 0;
          tcoverTopPic = this.unFollowPict;
          while (i2 < tcoverTopPic.length) {
             oobject = tcoverTopPic[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(6, oobject);
             }
             i2 = i2 + 1;
          }
       }
       if (!(this.bgThemeColor).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.bgThemeColor);
       }
       tskinType = this.openButton;
       if (tskinType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, tskinType);
       }
       tskinType = this.followButton;
       if (tskinType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, tskinType);
       }
       tskinType = this.innerInfo;
       if (tskinType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(10, tskinType);
       }
       tskinType = this.receiveButton;
       if (tskinType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(11, tskinType);
       }
       tskinType = this.openDynamicPic;
       if (tskinType != null && tskinType.length > 0) {
          i2 = 0;
          topenDynamic = this.openDynamicPic;
          while (i2 < topenDynamic.length) {
             oobject1 = topenDynamic[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(12, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       if (!(this.authorContent).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.authorContent);
       }
       if (!(this.bottomContent).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.bottomContent);
       }
       tskinType = this.bgResultPict;
       if (tskinType != null && tskinType.length > 0) {
          i2 = 0;
          topenDynamic = this.bgResultPict;
          while (i2 < topenDynamic.length) {
             oobject1 = topenDynamic[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(15, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       tskinType = this.bgHolidayBottomPict;
       if (tskinType != null && tskinType.length > 0) {
          i2 = 0;
          topenDynamic = this.bgHolidayBottomPict;
          while (i2 < topenDynamic.length) {
             oobject1 = topenDynamic[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(16, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       tskinType = this.needFollow;
       if (tskinType != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(17, tskinType);
       }
       tskinType = this.bottomIcon;
       if (tskinType != null && tskinType.length > 0) {
          i2 = 0;
          topenDynamic = this.bottomIcon;
          while (i2 < topenDynamic.length) {
             oobject1 = topenDynamic[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(18, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       if (!(this.bottomContentLink).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(19, this.bottomContentLink);
       }
       tskinType = this.bottomContentLinkType;
       if (tskinType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(20, tskinType);
       }
       tskinType = this.disableDirectFollowPict;
       if (tskinType != null && tskinType.length > 0) {
          tskinType = this.disableDirectFollowPict;
          while (i1 < tskinType.length) {
             object oobject2 = tskinType[i1];
             if (oobject2 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(21, oobject2);
             }
             i1 = i1 + 1;
          }
       }
       tskinType = this.bottomTip;
       if (tskinType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(22, tskinType);
       }
       tskinType = this.bottomTipReplace;
       if (tskinType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(23, tskinType);
       }
       tskinType = this.outsideBottomTip;
       if (tskinType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(24, tskinType);
       }
       if (!(this.redPacketPopAnimationKey).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(25, this.redPacketPopAnimationKey);
       }
       tskinType = this.needReserve;
       if (tskinType != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(26, tskinType);
       }
       if (!(this.reservationId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(27, this.reservationId);
       }
       tskinType = this.reserveButton;
       if (tskinType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(28, tskinType);
       }
       tskinType = this.reserveFollowButton;
       if (tskinType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(29, tskinType);
       }
       tskinType = this.defaultButton;
       if (tskinType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(30, tskinType);
       }
       tskinType = this.needBookReservation;
       if (tskinType != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(31, tskinType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRedPackSkinMessage$RedPackSkinTheme mergeFrom(CodedInputByteBufferNano p0){
       int i1;
       UserInfos$PicUrl[] picUrlArray;
       int i2;
       while (true) {
          int i = p0.readTag();
          LiveRedPackSkinMessage$RedPackSkinTheme redPackSkinT = 1;
          switch (i){
              case 0:
                return this;
              case 8:
                i = p0.readInt32();
                if (i && (i != redPackSkinT && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.skinType = i;
                }
                break;
              case 18:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 18);
                redPackSkinT = this.coverTopPict;
                i1 = (redPackSkinT == null)? 0: redPackSkinT.length;
                i = i + i1;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i1) {
                   System.arraycopy(redPackSkinT, 0, picUrlArray, 0, i1);
                }
                i2 = i - 1;
                while (i1 < i2) {
                   picUrlArray[i1] = new UserInfos$PicUrl();
                   p0.readMessage(picUrlArray[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                picUrlArray[i1] = new UserInfos$PicUrl();
                p0.readMessage(picUrlArray[i1]);
                this.coverTopPict = picUrlArray;
                break;
              case 26:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 26);
                redPackSkinT = this.coverBottomPict;
                i1 = (redPackSkinT == null)? 0: redPackSkinT.length;
                i = i + i1;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i1) {
                   System.arraycopy(redPackSkinT, 0, picUrlArray, 0, i1);
                }
                i2 = i - 1;
                while (i1 < i2) {
                   picUrlArray[i1] = new UserInfos$PicUrl();
                   p0.readMessage(picUrlArray[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                picUrlArray[i1] = new UserInfos$PicUrl();
                p0.readMessage(picUrlArray[i1]);
                this.coverBottomPict = picUrlArray;
                break;
              case '"':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 34);
                redPackSkinT = this.bgHolidayPict;
                i1 = (redPackSkinT == null)? 0: redPackSkinT.length;
                i = i + i1;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i1) {
                   System.arraycopy(redPackSkinT, 0, picUrlArray, 0, i1);
                }
                i2 = i - 1;
                while (i1 < i2) {
                   picUrlArray[i1] = new UserInfos$PicUrl();
                   p0.readMessage(picUrlArray[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                picUrlArray[i1] = new UserInfos$PicUrl();
                p0.readMessage(picUrlArray[i1]);
                this.bgHolidayPict = picUrlArray;
                break;
              case '*':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 42);
                redPackSkinT = this.followPict;
                i1 = (redPackSkinT == null)? 0: redPackSkinT.length;
                i = i + i1;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i1) {
                   System.arraycopy(redPackSkinT, 0, picUrlArray, 0, i1);
                }
                i2 = i - 1;
                while (i1 < i2) {
                   picUrlArray[i1] = new UserInfos$PicUrl();
                   p0.readMessage(picUrlArray[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                picUrlArray[i1] = new UserInfos$PicUrl();
                p0.readMessage(picUrlArray[i1]);
                this.followPict = picUrlArray;
                break;
              case '2':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 50);
                redPackSkinT = this.unFollowPict;
                i1 = (redPackSkinT == null)? 0: redPackSkinT.length;
                i = i + i1;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i1) {
                   System.arraycopy(redPackSkinT, 0, picUrlArray, 0, i1);
                }
                i2 = i - 1;
                while (i1 < i2) {
                   picUrlArray[i1] = new UserInfos$PicUrl();
                   p0.readMessage(picUrlArray[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                picUrlArray[i1] = new UserInfos$PicUrl();
                p0.readMessage(picUrlArray[i1]);
                this.unFollowPict = picUrlArray;
                break;
              case ':':
                this.bgThemeColor = p0.readString();
                break;
              case 'B':
                if (this.openButton == null) {
                   this.openButton = new LiveRedPackSkinMessage$RedPackSkinButtonInfo();
                }
                p0.readMessage(this.openButton);
                break;
              case 'J':
                if (this.followButton == null) {
                   this.followButton = new LiveRedPackSkinMessage$RedPackSkinButtonInfo();
                }
                p0.readMessage(this.followButton);
                break;
              case 'R':
                if (this.innerInfo == null) {
                   this.innerInfo = new LiveRedPackSkinMessage$RedPackSkinInnerInfo();
                }
                p0.readMessage(this.innerInfo);
                break;
              case 'Z':
                if (this.receiveButton == null) {
                   this.receiveButton = new LiveRedPackSkinMessage$RedPackSkinButtonInfo();
                }
                p0.readMessage(this.receiveButton);
                break;
              case 'b':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 98);
                redPackSkinT = this.openDynamicPic;
                i1 = (redPackSkinT == null)? 0: redPackSkinT.length;
                i = i + i1;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i1) {
                   System.arraycopy(redPackSkinT, 0, picUrlArray, 0, i1);
                }
                i2 = i - 1;
                while (i1 < i2) {
                   picUrlArray[i1] = new UserInfos$PicUrl();
                   p0.readMessage(picUrlArray[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                picUrlArray[i1] = new UserInfos$PicUrl();
                p0.readMessage(picUrlArray[i1]);
                this.openDynamicPic = picUrlArray;
                break;
              case 'j':
                this.authorContent = p0.readString();
                break;
              case 'r':
                this.bottomContent = p0.readString();
                break;
              case 'z':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 122);
                redPackSkinT = this.bgResultPict;
                i1 = (redPackSkinT == null)? 0: redPackSkinT.length;
                i = i + i1;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i1) {
                   System.arraycopy(redPackSkinT, 0, picUrlArray, 0, i1);
                }
                i2 = i - 1;
                while (i1 < i2) {
                   picUrlArray[i1] = new UserInfos$PicUrl();
                   p0.readMessage(picUrlArray[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                picUrlArray[i1] = new UserInfos$PicUrl();
                p0.readMessage(picUrlArray[i1]);
                this.bgResultPict = picUrlArray;
                break;
              case 130:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 130);
                redPackSkinT = this.bgHolidayBottomPict;
                i1 = (redPackSkinT == null)? 0: redPackSkinT.length;
                i = i + i1;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i1) {
                   System.arraycopy(redPackSkinT, 0, picUrlArray, 0, i1);
                }
                i2 = i - 1;
                while (i1 < i2) {
                   picUrlArray[i1] = new UserInfos$PicUrl();
                   p0.readMessage(picUrlArray[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                picUrlArray[i1] = new UserInfos$PicUrl();
                p0.readMessage(picUrlArray[i1]);
                this.bgHolidayBottomPict = picUrlArray;
                break;
              case 136:
                this.needFollow = p0.readBool();
                break;
              case 146:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 146);
                redPackSkinT = this.bottomIcon;
                i1 = (redPackSkinT == null)? 0: redPackSkinT.length;
                i = i + i1;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i1) {
                   System.arraycopy(redPackSkinT, 0, picUrlArray, 0, i1);
                }
                i2 = i - 1;
                while (i1 < i2) {
                   picUrlArray[i1] = new UserInfos$PicUrl();
                   p0.readMessage(picUrlArray[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                picUrlArray[i1] = new UserInfos$PicUrl();
                p0.readMessage(picUrlArray[i1]);
                this.bottomIcon = picUrlArray;
                break;
              case 154:
                this.bottomContentLink = p0.readString();
                break;
              case 160:
                i = p0.readInt32();
                if (i && i != redPackSkinT) {
                   continue ;
                }else {
                   this.bottomContentLinkType = i;
                }
                break;
              case 170:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 170);
                redPackSkinT = this.disableDirectFollowPict;
                i1 = (redPackSkinT == null)? 0: redPackSkinT.length;
                i = i + i1;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i1) {
                   System.arraycopy(redPackSkinT, 0, picUrlArray, 0, i1);
                }
                i2 = i - 1;
                while (i1 < i2) {
                   picUrlArray[i1] = new UserInfos$PicUrl();
                   p0.readMessage(picUrlArray[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                picUrlArray[i1] = new UserInfos$PicUrl();
                p0.readMessage(picUrlArray[i1]);
                this.disableDirectFollowPict = picUrlArray;
                break;
              case 178:
                if (this.bottomTip == null) {
                   this.bottomTip = new LiveRedPackSkinMessage$ImageTextInfo();
                }
                p0.readMessage(this.bottomTip);
                break;
              case 186:
                if (this.bottomTipReplace == null) {
                   this.bottomTipReplace = new LiveRedPackSkinMessage$ImageTextInfo();
                }
                p0.readMessage(this.bottomTipReplace);
                break;
              case 194:
                if (this.outsideBottomTip == null) {
                   this.outsideBottomTip = new LiveRedPackSkinMessage$RedPackSkinButtonInfo();
                }
                p0.readMessage(this.outsideBottomTip);
                break;
              case 202:
                this.redPacketPopAnimationKey = p0.readString();
                break;
              case 208:
                this.needReserve = p0.readBool();
                break;
              case 218:
                this.reservationId = p0.readString();
                break;
              case 226:
                if (this.reserveButton == null) {
                   this.reserveButton = new LiveRedPackSkinMessage$RedPackSkinButtonInfo();
                }
                p0.readMessage(this.reserveButton);
                break;
              case 234:
                if (this.reserveFollowButton == null) {
                   this.reserveFollowButton = new LiveRedPackSkinMessage$RedPackSkinButtonInfo();
                }
                p0.readMessage(this.reserveFollowButton);
                break;
              case 242:
                if (this.defaultButton == null) {
                   this.defaultButton = new LiveRedPackSkinMessage$RedPackSkinButtonInfo();
                }
                p0.readMessage(this.defaultButton);
                break;
              case 248:
                this.needBookReservation = p0.readBool();
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
       LiveRedPackSkinMessage$RedPackSkinTheme tcoverTopPic;
       object oobject;
       LiveRedPackSkinMessage$RedPackSkinTheme topenDynamic;
       object oobject1;
       LiveRedPackSkinMessage$RedPackSkinTheme tskinType = this.skinType;
       if (tskinType != null) {
          p0.writeInt32(1, tskinType);
       }
       tskinType = this.coverTopPict;
       int i = 0;
       if (tskinType != null && tskinType.length > 0) {
          i1 = 0;
          tcoverTopPic = this.coverTopPict;
          while (i1 < tcoverTopPic.length) {
             oobject = tcoverTopPic[i1];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tskinType = this.coverBottomPict;
       if (tskinType != null && tskinType.length > 0) {
          i1 = 0;
          tcoverTopPic = this.coverBottomPict;
          while (i1 < tcoverTopPic.length) {
             oobject = tcoverTopPic[i1];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tskinType = this.bgHolidayPict;
       if (tskinType != null && tskinType.length > 0) {
          i1 = 0;
          tcoverTopPic = this.bgHolidayPict;
          while (i1 < tcoverTopPic.length) {
             oobject = tcoverTopPic[i1];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tskinType = this.followPict;
       if (tskinType != null && tskinType.length > 0) {
          i1 = 0;
          tcoverTopPic = this.followPict;
          while (i1 < tcoverTopPic.length) {
             oobject = tcoverTopPic[i1];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tskinType = this.unFollowPict;
       if (tskinType != null && tskinType.length > 0) {
          i1 = 0;
          tcoverTopPic = this.unFollowPict;
          while (i1 < tcoverTopPic.length) {
             oobject = tcoverTopPic[i1];
             if (oobject != null) {
                p0.writeMessage(6, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.bgThemeColor).equals("")) {
          p0.writeString(7, this.bgThemeColor);
       }
       tskinType = this.openButton;
       if (tskinType != null) {
          p0.writeMessage(8, tskinType);
       }
       tskinType = this.followButton;
       if (tskinType != null) {
          p0.writeMessage(9, tskinType);
       }
       tskinType = this.innerInfo;
       if (tskinType != null) {
          p0.writeMessage(10, tskinType);
       }
       tskinType = this.receiveButton;
       if (tskinType != null) {
          p0.writeMessage(11, tskinType);
       }
       tskinType = this.openDynamicPic;
       if (tskinType != null && tskinType.length > 0) {
          i1 = 0;
          topenDynamic = this.openDynamicPic;
          while (i1 < topenDynamic.length) {
             oobject1 = topenDynamic[i1];
             if (oobject1 != null) {
                p0.writeMessage(12, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.authorContent).equals("")) {
          p0.writeString(13, this.authorContent);
       }
       if (!(this.bottomContent).equals("")) {
          p0.writeString(14, this.bottomContent);
       }
       tskinType = this.bgResultPict;
       if (tskinType != null && tskinType.length > 0) {
          i1 = 0;
          topenDynamic = this.bgResultPict;
          while (i1 < topenDynamic.length) {
             oobject1 = topenDynamic[i1];
             if (oobject1 != null) {
                p0.writeMessage(15, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tskinType = this.bgHolidayBottomPict;
       if (tskinType != null && tskinType.length > 0) {
          i1 = 0;
          topenDynamic = this.bgHolidayBottomPict;
          while (i1 < topenDynamic.length) {
             oobject1 = topenDynamic[i1];
             if (oobject1 != null) {
                p0.writeMessage(16, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tskinType = this.needFollow;
       if (tskinType != null) {
          p0.writeBool(17, tskinType);
       }
       tskinType = this.bottomIcon;
       if (tskinType != null && tskinType.length > 0) {
          i1 = 0;
          topenDynamic = this.bottomIcon;
          while (i1 < topenDynamic.length) {
             oobject1 = topenDynamic[i1];
             if (oobject1 != null) {
                p0.writeMessage(18, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.bottomContentLink).equals("")) {
          p0.writeString(19, this.bottomContentLink);
       }
       tskinType = this.bottomContentLinkType;
       if (tskinType != null) {
          p0.writeInt32(20, tskinType);
       }
       tskinType = this.disableDirectFollowPict;
       if (tskinType != null && tskinType.length > 0) {
          tskinType = this.disableDirectFollowPict;
          while (i < tskinType.length) {
             object oobject2 = tskinType[i];
             if (oobject2 != null) {
                p0.writeMessage(21, oobject2);
             }
             i = i + 1;
          }
       }
       tskinType = this.bottomTip;
       if (tskinType != null) {
          p0.writeMessage(22, tskinType);
       }
       tskinType = this.bottomTipReplace;
       if (tskinType != null) {
          p0.writeMessage(23, tskinType);
       }
       tskinType = this.outsideBottomTip;
       if (tskinType != null) {
          p0.writeMessage(24, tskinType);
       }
       if (!(this.redPacketPopAnimationKey).equals("")) {
          p0.writeString(25, this.redPacketPopAnimationKey);
       }
       tskinType = this.needReserve;
       if (tskinType != null) {
          p0.writeBool(26, tskinType);
       }
       if (!(this.reservationId).equals("")) {
          p0.writeString(27, this.reservationId);
       }
       tskinType = this.reserveButton;
       if (tskinType != null) {
          p0.writeMessage(28, tskinType);
       }
       tskinType = this.reserveFollowButton;
       if (tskinType != null) {
          p0.writeMessage(29, tskinType);
       }
       tskinType = this.defaultButton;
       if (tskinType != null) {
          p0.writeMessage(30, tskinType);
       }
       tskinType = this.needBookReservation;
       if (tskinType != null) {
          p0.writeBool(31, tskinType);
       }
       super.writeTo(p0);
       return;
    }
}
