package com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$SCTopBroadcastNotice;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$TextDesc;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.System;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$StretchablePicture;

public final class LiveCommonNoticeMessages$SCTopBroadcastNotice extends MessageNano	// class@001160
{
    public int actionType;
    public String[] backgroundColor;
    public LiveCommonNoticeMessages$StretchablePicture backgroundPicture;
    public int bizType;
    public int disableDisplaySignal;
    public long displayDurationMillis;
    public String extraInfo;
    public UserInfos$PicUrl[] leftIcon;
    public int leftIconHeightDp;
    public int leftIconMarginLeftDp;
    public int leftIconType;
    public int leftIconWidthDp;
    public long limitExpireTime;
    public String limitTarget;
    public long limitTimeWindow;
    public int limitTimes;
    public String link;
    public int priority;
    public UserInfos$PicUrl[] rightButtonPic;
    public int rightButtonPicHeightDp;
    public int rightButtonPicMarginRightDp;
    public int rightButtonPicWidthDp;
    public UserInfos$PicUrl[] shimmerPic;
    public String targetLiveStreamId;
    public UserInfos$UserInfo targetUserInfo;
    public String textColor;
    public String textContent;
    public LiveCommonNoticeMessages$TextDesc[] textDesc;
    public int textMarginLeftDp;
    public int textMarginRightDp;
    public static LiveCommonNoticeMessages$SCTopBroadcastNotice[] _emptyArray;

    public void LiveCommonNoticeMessages$SCTopBroadcastNotice(){
       super();
       this.clear();
    }
    public static LiveCommonNoticeMessages$SCTopBroadcastNotice[] emptyArray(){
       if (LiveCommonNoticeMessages$SCTopBroadcastNotice._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommonNoticeMessages$SCTopBroadcastNotice._emptyArray == null) {
             LiveCommonNoticeMessages$SCTopBroadcastNotice[] sCTopBroadca = new LiveCommonNoticeMessages$SCTopBroadcastNotice[0];
             LiveCommonNoticeMessages$SCTopBroadcastNotice._emptyArray = sCTopBroadca;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommonNoticeMessages$SCTopBroadcastNotice._emptyArray;
    }
    public static LiveCommonNoticeMessages$SCTopBroadcastNotice parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommonNoticeMessages$SCTopBroadcastNotice().mergeFrom(p0);
    }
    public static LiveCommonNoticeMessages$SCTopBroadcastNotice parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommonNoticeMessages$SCTopBroadcastNotice(), p0);
    }
    public LiveCommonNoticeMessages$SCTopBroadcastNotice clear(){
       this.textContent = "";
       this.textColor = "";
       this.textMarginLeftDp = 0;
       this.textMarginRightDp = 0;
       this.leftIcon = UserInfos$PicUrl.emptyArray();
       this.leftIconMarginLeftDp = 0;
       this.backgroundPicture = null;
       this.rightButtonPic = UserInfos$PicUrl.emptyArray();
       this.rightButtonPicMarginRightDp = 0;
       this.targetUserInfo = null;
       this.link = "";
       this.priority = 0;
       this.displayDurationMillis = 0;
       this.bizType = 0;
       this.actionType = 0;
       this.targetLiveStreamId = "";
       this.leftIconWidthDp = 0;
       this.leftIconHeightDp = 0;
       this.rightButtonPicWidthDp = 0;
       this.rightButtonPicHeightDp = 0;
       this.extraInfo = "";
       this.textDesc = LiveCommonNoticeMessages$TextDesc.emptyArray();
       this.shimmerPic = UserInfos$PicUrl.emptyArray();
       this.leftIconType = 0;
       this.backgroundColor = WireFormatNano.EMPTY_STRING_ARRAY;
       this.limitTimeWindow = 0;
       this.limitTimes = 0;
       this.limitExpireTime = 0;
       this.limitTarget = "";
       this.disableDisplaySignal = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i3;
       LiveCommonNoticeMessages$SCTopBroadcastNotice tleftIcon;
       object oobject;
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.textContent).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.textContent);
       }
       int i1 = 2;
       if (!(this.textColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(i1, this.textColor);
       }
       LiveCommonNoticeMessages$SCTopBroadcastNotice ttextMarginL = this.textMarginLeftDp;
       if (ttextMarginL != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, ttextMarginL);
       }
       ttextMarginL = this.textMarginRightDp;
       if (ttextMarginL != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, ttextMarginL);
       }
       ttextMarginL = this.leftIcon;
       int i2 = 0;
       if (ttextMarginL != null && ttextMarginL.length > 0) {
          i3 = 0;
          tleftIcon = this.leftIcon;
          while (i3 < tleftIcon.length) {
             oobject = tleftIcon[i3];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i3 = i3 + 1;
          }
       }
       ttextMarginL = this.leftIconMarginLeftDp;
       if (ttextMarginL != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, ttextMarginL);
       }
       ttextMarginL = this.backgroundPicture;
       if (ttextMarginL != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, ttextMarginL);
       }
       ttextMarginL = this.rightButtonPic;
       if (ttextMarginL != null && ttextMarginL.length > 0) {
          i3 = 0;
          tleftIcon = this.rightButtonPic;
          while (i3 < tleftIcon.length) {
             oobject = tleftIcon[i3];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(8, oobject);
             }
             i3 = i3 + 1;
          }
       }
       ttextMarginL = this.rightButtonPicMarginRightDp;
       if (ttextMarginL != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(9, ttextMarginL);
       }
       ttextMarginL = this.targetUserInfo;
       if (ttextMarginL != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(10, ttextMarginL);
       }
       if (!(this.link).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.link);
       }
       ttextMarginL = this.priority;
       if (ttextMarginL != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(12, ttextMarginL);
       }
       tleftIcon = this.displayDurationMillis;
       if (tleftIcon) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(13, tleftIcon);
       }
       ttextMarginL = this.bizType;
       if (ttextMarginL != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(14, ttextMarginL);
       }
       ttextMarginL = this.actionType;
       if (ttextMarginL != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(15, ttextMarginL);
       }
       if (!(this.targetLiveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(16, this.targetLiveStreamId);
       }
       ttextMarginL = this.leftIconWidthDp;
       if (ttextMarginL != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(17, ttextMarginL);
       }
       ttextMarginL = this.leftIconHeightDp;
       if (ttextMarginL != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(18, ttextMarginL);
       }
       ttextMarginL = this.rightButtonPicWidthDp;
       if (ttextMarginL != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(19, ttextMarginL);
       }
       ttextMarginL = this.rightButtonPicHeightDp;
       if (ttextMarginL != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(20, ttextMarginL);
       }
       if (!(this.extraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(21, this.extraInfo);
       }
       ttextMarginL = this.textDesc;
       if (ttextMarginL != null && ttextMarginL.length > 0) {
          i3 = 0;
          tleftIcon = this.textDesc;
          while (i3 < tleftIcon.length) {
             oobject = tleftIcon[i3];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(22, oobject);
             }
             i3 = i3 + 1;
          }
       }
       ttextMarginL = this.shimmerPic;
       if (ttextMarginL != null && ttextMarginL.length > 0) {
          i3 = 0;
          tleftIcon = this.shimmerPic;
          while (i3 < tleftIcon.length) {
             oobject = tleftIcon[i3];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(23, oobject);
             }
             i3 = i3 + 1;
          }
       }
       ttextMarginL = this.leftIconType;
       if (ttextMarginL != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(24, ttextMarginL);
       }
       ttextMarginL = this.backgroundColor;
       if (ttextMarginL != null && ttextMarginL.length > 0) {
          i3 = 0;
          int i4 = 0;
          LiveCommonNoticeMessages$SCTopBroadcastNotice tbackgroundC = this.backgroundColor;
          while (i2 < tbackgroundC.length) {
             object oobject1 = tbackgroundC[i2];
             if (oobject1 != null) {
                i4 = i4 + 1;
                i3 = i3 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject1);
             }
             i2 = i2 + 1;
          }
          i = (i + i3) + (i4 * 2);
       }
       LiveCommonNoticeMessages$SCTopBroadcastNotice tlimitTimeWi = this.limitTimeWindow;
       if (tlimitTimeWi) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(26, tlimitTimeWi);
       }
       ttextMarginL = this.limitTimes;
       if (ttextMarginL != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(27, ttextMarginL);
       }
       tlimitTimeWi = this.limitExpireTime;
       if (tlimitTimeWi) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(28, tlimitTimeWi);
       }
       if (!(this.limitTarget).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(29, this.limitTarget);
       }
       ttextMarginL = this.disableDisplaySignal;
       if (ttextMarginL != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(30, ttextMarginL);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommonNoticeMessages$SCTopBroadcastNotice mergeFrom(CodedInputByteBufferNano p0){
       UserInfos$PicUrl[] picUrlArray;
       int i2;
       while (true) {
          int i = p0.readTag();
          LiveCommonNoticeMessages$SCTopBroadcastNotice sCTopBroadca = 2;
          int i1 = 1;
          switch (i){
              case 0:
                return this;
              case 10:
                this.textContent = p0.readString();
                break;
              case 18:
                this.textColor = p0.readString();
                break;
              case 24:
                this.textMarginLeftDp = p0.readUInt32();
                break;
              case 32:
                this.textMarginRightDp = p0.readUInt32();
                break;
              case '*':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 42);
                sCTopBroadca = this.leftIcon;
                i1 = (sCTopBroadca == null)? 0: sCTopBroadca.length;
                i = i + i1;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i1) {
                   System.arraycopy(sCTopBroadca, 0, picUrlArray, 0, i1);
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
                this.leftIcon = picUrlArray;
                break;
              case '0':
                this.leftIconMarginLeftDp = p0.readUInt32();
                break;
              case ':':
                if (this.backgroundPicture == null) {
                   this.backgroundPicture = new LiveCommonNoticeMessages$StretchablePicture();
                }
                p0.readMessage(this.backgroundPicture);
                break;
              case 'B':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 66);
                sCTopBroadca = this.rightButtonPic;
                i1 = (sCTopBroadca == null)? 0: sCTopBroadca.length;
                i = i + i1;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i1) {
                   System.arraycopy(sCTopBroadca, 0, picUrlArray, 0, i1);
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
                this.rightButtonPic = picUrlArray;
                break;
              case 'H':
                this.rightButtonPicMarginRightDp = p0.readUInt32();
                break;
              case 'R':
                if (this.targetUserInfo == null) {
                   this.targetUserInfo = new UserInfos$UserInfo();
                }
                p0.readMessage(this.targetUserInfo);
                break;
              case 'Z':
                this.link = p0.readString();
                break;
              case '`':
                this.priority = p0.readUInt32();
                break;
              case 'h':
                this.displayDurationMillis = p0.readUInt64();
                break;
              case 'p':
                i = p0.readInt32();
                switch (i){
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
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
                    case 1:
                      break;
                    default:
                }
                this.bizType = i;
                break;
              case 'x':
                i = p0.readInt32();
                if (i && (i != i1 && (i != sCTopBroadca && (i != 3 && (i != 4 && i != 5))))) {
                   continue ;
                }else {
                   this.actionType = i;
                }
                break;
              case 130:
                this.targetLiveStreamId = p0.readString();
                break;
              case 136:
                this.leftIconWidthDp = p0.readUInt32();
                break;
              case 144:
                this.leftIconHeightDp = p0.readUInt32();
                break;
              case 152:
                this.rightButtonPicWidthDp = p0.readUInt32();
                break;
              case 160:
                this.rightButtonPicHeightDp = p0.readUInt32();
                break;
              case 170:
                this.extraInfo = p0.readString();
                break;
              case 178:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 178);
                sCTopBroadca = this.textDesc;
                i1 = (sCTopBroadca == null)? 0: sCTopBroadca.length;
                i = i + i1;
                LiveCommonNoticeMessages$TextDesc[] textDescArra = new LiveCommonNoticeMessages$TextDesc[i];
                if (i1) {
                   System.arraycopy(sCTopBroadca, 0, textDescArra, 0, i1);
                }
                i2 = i - 1;
                while (i1 < i2) {
                   textDescArra[i1] = new LiveCommonNoticeMessages$TextDesc();
                   p0.readMessage(textDescArra[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                textDescArra[i1] = new LiveCommonNoticeMessages$TextDesc();
                p0.readMessage(textDescArra[i1]);
                this.textDesc = textDescArra;
                break;
              case 186:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 186);
                sCTopBroadca = this.shimmerPic;
                i1 = (sCTopBroadca == null)? 0: sCTopBroadca.length;
                i = i + i1;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i1) {
                   System.arraycopy(sCTopBroadca, 0, picUrlArray, 0, i1);
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
                this.shimmerPic = picUrlArray;
                break;
              case 192:
                i = p0.readInt32();
                if (i && (i != i1 && i != sCTopBroadca)) {
                   continue ;
                }else {
                   this.leftIconType = i;
                }
                break;
              case 202:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 202);
                sCTopBroadca = this.backgroundColor;
                i1 = (sCTopBroadca == null)? 0: sCTopBroadca.length;
                i = i + i1;
                String[] stringArray = new String[i];
                if (i1) {
                   System.arraycopy(sCTopBroadca, 0, stringArray, 0, i1);
                }
                i2 = i - 1;
                while (i1 < i2) {
                   stringArray[i1] = p0.readString();
                   p0.readTag();
                   i1 = i1 + 1;
                }
                stringArray[i1] = p0.readString();
                this.backgroundColor = stringArray;
                break;
              case 208:
                this.limitTimeWindow = p0.readUInt64();
                break;
              case 216:
                this.limitTimes = p0.readUInt32();
                break;
              case 224:
                this.limitExpireTime = p0.readUInt64();
                break;
              case 234:
                this.limitTarget = p0.readString();
                break;
              case 240:
                this.disableDisplaySignal = p0.readUInt32();
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
       LiveCommonNoticeMessages$SCTopBroadcastNotice tleftIcon;
       object oobject;
       String str = "";
       if (!(this.textContent).equals(str)) {
          p0.writeString(1, this.textContent);
       }
       if (!(this.textColor).equals(str)) {
          p0.writeString(2, this.textColor);
       }
       LiveCommonNoticeMessages$SCTopBroadcastNotice ttextMarginL = this.textMarginLeftDp;
       if (ttextMarginL != null) {
          p0.writeUInt32(3, ttextMarginL);
       }
       ttextMarginL = this.textMarginRightDp;
       if (ttextMarginL != null) {
          p0.writeUInt32(4, ttextMarginL);
       }
       ttextMarginL = this.leftIcon;
       int i = 0;
       if (ttextMarginL != null && ttextMarginL.length > 0) {
          i1 = 0;
          tleftIcon = this.leftIcon;
          while (i1 < tleftIcon.length) {
             oobject = tleftIcon[i1];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ttextMarginL = this.leftIconMarginLeftDp;
       if (ttextMarginL != null) {
          p0.writeUInt32(6, ttextMarginL);
       }
       ttextMarginL = this.backgroundPicture;
       if (ttextMarginL != null) {
          p0.writeMessage(7, ttextMarginL);
       }
       ttextMarginL = this.rightButtonPic;
       if (ttextMarginL != null && ttextMarginL.length > 0) {
          i1 = 0;
          tleftIcon = this.rightButtonPic;
          while (i1 < tleftIcon.length) {
             oobject = tleftIcon[i1];
             if (oobject != null) {
                p0.writeMessage(8, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ttextMarginL = this.rightButtonPicMarginRightDp;
       if (ttextMarginL != null) {
          p0.writeUInt32(9, ttextMarginL);
       }
       ttextMarginL = this.targetUserInfo;
       if (ttextMarginL != null) {
          p0.writeMessage(10, ttextMarginL);
       }
       if (!(this.link).equals(str)) {
          p0.writeString(11, this.link);
       }
       ttextMarginL = this.priority;
       if (ttextMarginL != null) {
          p0.writeUInt32(12, ttextMarginL);
       }
       tleftIcon = this.displayDurationMillis;
       if (tleftIcon) {
          p0.writeUInt64(13, tleftIcon);
       }
       ttextMarginL = this.bizType;
       if (ttextMarginL != null) {
          p0.writeInt32(14, ttextMarginL);
       }
       ttextMarginL = this.actionType;
       if (ttextMarginL != null) {
          p0.writeInt32(15, ttextMarginL);
       }
       if (!(this.targetLiveStreamId).equals(str)) {
          p0.writeString(16, this.targetLiveStreamId);
       }
       ttextMarginL = this.leftIconWidthDp;
       if (ttextMarginL != null) {
          p0.writeUInt32(17, ttextMarginL);
       }
       ttextMarginL = this.leftIconHeightDp;
       if (ttextMarginL != null) {
          p0.writeUInt32(18, ttextMarginL);
       }
       ttextMarginL = this.rightButtonPicWidthDp;
       if (ttextMarginL != null) {
          p0.writeUInt32(19, ttextMarginL);
       }
       ttextMarginL = this.rightButtonPicHeightDp;
       if (ttextMarginL != null) {
          p0.writeUInt32(20, ttextMarginL);
       }
       if (!(this.extraInfo).equals(str)) {
          p0.writeString(21, this.extraInfo);
       }
       ttextMarginL = this.textDesc;
       if (ttextMarginL != null && ttextMarginL.length > 0) {
          i1 = 0;
          tleftIcon = this.textDesc;
          while (i1 < tleftIcon.length) {
             oobject = tleftIcon[i1];
             if (oobject != null) {
                p0.writeMessage(22, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ttextMarginL = this.shimmerPic;
       if (ttextMarginL != null && ttextMarginL.length > 0) {
          i1 = 0;
          tleftIcon = this.shimmerPic;
          while (i1 < tleftIcon.length) {
             oobject = tleftIcon[i1];
             if (oobject != null) {
                p0.writeMessage(23, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ttextMarginL = this.leftIconType;
       if (ttextMarginL != null) {
          p0.writeInt32(24, ttextMarginL);
       }
       ttextMarginL = this.backgroundColor;
       if (ttextMarginL != null && ttextMarginL.length > 0) {
          ttextMarginL = this.backgroundColor;
          while (i < ttextMarginL.length) {
             object oobject1 = ttextMarginL[i];
             if (oobject1 != null) {
                p0.writeString(25, oobject1);
             }
             i = i + 1;
          }
       }
       LiveCommonNoticeMessages$SCTopBroadcastNotice tlimitTimeWi = this.limitTimeWindow;
       if (tlimitTimeWi) {
          p0.writeUInt64(26, tlimitTimeWi);
       }
       ttextMarginL = this.limitTimes;
       if (ttextMarginL != null) {
          p0.writeUInt32(27, ttextMarginL);
       }
       tlimitTimeWi = this.limitExpireTime;
       if (tlimitTimeWi) {
          p0.writeUInt64(28, tlimitTimeWi);
       }
       if (!(this.limitTarget).equals(str)) {
          p0.writeString(29, this.limitTarget);
       }
       ttextMarginL = this.disableDisplaySignal;
       if (ttextMarginL != null) {
          p0.writeUInt32(30, ttextMarginL);
       }
       super.writeTo(p0);
       return;
    }
}
