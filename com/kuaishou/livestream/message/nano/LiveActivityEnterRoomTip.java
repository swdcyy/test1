package com.kuaishou.livestream.message.nano.LiveActivityEnterRoomTip;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;
import java.lang.System;
import com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$StretchablePicture;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveActivityEnterRoomTip extends MessageNano	// class@0010c4
{
    public String activityBiz;
    public long animationIntervalMillis;
    public String animationKey;
    public String animationKeyV2;
    public String[] backgroudBorderColor;
    public int backgroundBorderWidth;
    public String[] backgroundColor;
    public UserInfos$PicUrl[] backgroundPicUrl;
    public LiveCommonNoticeMessages$StretchablePicture backgroundStretchablePicUrl;
    public LiveCommonEffectInfo commonEffectInfo;
    public String displayText;
    public int displayType;
    public UserInfos$PicUrl[] headPic;
    public int headPicHeight;
    public int headPicWidth;
    public int picHeight;
    public UserInfos$PicUrl[] picUrl;
    public int picWidth;
    public int sizeOfAvatar;
    public int sizeOfCar;
    public int sizeOfHead;
    public int specialShapedPicHeight;
    public UserInfos$PicUrl[] specialShapedPicUrl;
    public int specialShapedPicWidth;
    public String textColor;
    public int textLeftDistance;
    public boolean useCommonEffectInfo;
    public UserInfos$UserInfo user;
    public LiveAudienceState userState;
    public String welcomeAnimationKey;
    public static LiveActivityEnterRoomTip[] _emptyArray;

    public void LiveActivityEnterRoomTip(){
       super();
       this.clear();
    }
    public static LiveActivityEnterRoomTip[] emptyArray(){
       if (LiveActivityEnterRoomTip._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveActivityEnterRoomTip._emptyArray == null) {
             LiveActivityEnterRoomTip[] liveActivity = new LiveActivityEnterRoomTip[0];
             LiveActivityEnterRoomTip._emptyArray = liveActivity;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveActivityEnterRoomTip._emptyArray;
    }
    public static LiveActivityEnterRoomTip parseFrom(CodedInputByteBufferNano p0){
       return new LiveActivityEnterRoomTip().mergeFrom(p0);
    }
    public static LiveActivityEnterRoomTip parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveActivityEnterRoomTip(), p0);
    }
    public LiveActivityEnterRoomTip clear(){
       this.user = null;
       this.userState = null;
       this.displayType = 0;
       this.picUrl = UserInfos$PicUrl.emptyArray();
       this.picWidth = 0;
       this.picHeight = 0;
       this.displayText = "";
       this.textColor = "";
       this.textLeftDistance = 0;
       this.backgroundBorderWidth = 0;
       String[] eMPTY_STRING = WireFormatNano.EMPTY_STRING_ARRAY;
       this.backgroundColor = eMPTY_STRING;
       this.backgroudBorderColor = eMPTY_STRING;
       this.activityBiz = "";
       this.specialShapedPicUrl = UserInfos$PicUrl.emptyArray();
       this.specialShapedPicWidth = 0;
       this.specialShapedPicHeight = 0;
       this.backgroundPicUrl = UserInfos$PicUrl.emptyArray();
       this.animationKey = "";
       this.animationIntervalMillis = 0;
       this.backgroundStretchablePicUrl = null;
       this.animationKeyV2 = "";
       this.welcomeAnimationKey = "";
       this.sizeOfAvatar = 0;
       this.sizeOfHead = 0;
       this.sizeOfCar = 0;
       this.headPic = UserInfos$PicUrl.emptyArray();
       this.headPicWidth = 0;
       this.headPicHeight = 0;
       this.useCommonEffectInfo = false;
       this.commonEffectInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i3;
       int i4;
       int i5;
       LiveActivityEnterRoomTip tbackgroundC;
       object oobject1;
       LiveActivityEnterRoomTip tspecialShap;
       object oobject2;
       int i = super.computeSerializedSize();
       LiveActivityEnterRoomTip tuser = this.user;
       int i1 = 1;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, tuser);
       }
       tuser = this.userState;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tuser);
       }
       tuser = this.displayType;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tuser);
       }
       tuser = this.picUrl;
       int i2 = 0;
       if (tuser != null && tuser.length > 0) {
          i3 = 0;
          LiveActivityEnterRoomTip tpicUrl = this.picUrl;
          while (i3 < tpicUrl.length) {
             object oobject = tpicUrl[i3];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject);
             }
             i3 = i3 + 1;
          }
       }
       tuser = this.picWidth;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tuser);
       }
       tuser = this.picHeight;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tuser);
       }
       if (!(this.displayText).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.displayText);
       }
       if (!(this.textColor).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.textColor);
       }
       tuser = this.textLeftDistance;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(9, tuser);
       }
       tuser = this.backgroundBorderWidth;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(10, tuser);
       }
       tuser = this.backgroundColor;
       if (tuser != null && tuser.length > 0) {
          i3 = 0;
          i4 = 0;
          i5 = 0;
          tbackgroundC = this.backgroundColor;
          while (i3 < tbackgroundC.length) {
             oobject1 = tbackgroundC[i3];
             if (oobject1 != null) {
                i5 = i5 + 1;
                i4 = i4 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject1);
             }
             i3 = i3 + 1;
          }
          i = (i + i4) + (i5 * 1);
       }
       tuser = this.backgroudBorderColor;
       if (tuser != null && tuser.length > 0) {
          i3 = 0;
          i4 = 0;
          i5 = 0;
          tbackgroundC = this.backgroudBorderColor;
          while (i3 < tbackgroundC.length) {
             oobject1 = tbackgroundC[i3];
             if (oobject1 != null) {
                i5 = i5 + 1;
                i4 = i4 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject1);
             }
             i3 = i3 + 1;
          }
          i = (i + i4) + (i5 * 1);
       }
       if (!(this.activityBiz).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.activityBiz);
       }
       tuser = this.specialShapedPicUrl;
       if (tuser != null && tuser.length > 0) {
          i3 = 0;
          tspecialShap = this.specialShapedPicUrl;
          while (i3 < tspecialShap.length) {
             oobject2 = tspecialShap[i3];
             if (oobject2 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(14, oobject2);
             }
             i3 = i3 + 1;
          }
       }
       tuser = this.specialShapedPicWidth;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(15, tuser);
       }
       tuser = this.specialShapedPicHeight;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(16, tuser);
       }
       tuser = this.backgroundPicUrl;
       if (tuser != null && tuser.length > 0) {
          i3 = 0;
          tspecialShap = this.backgroundPicUrl;
          while (i3 < tspecialShap.length) {
             oobject2 = tspecialShap[i3];
             if (oobject2 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(17, oobject2);
             }
             i3 = i3 + 1;
          }
       }
       if (!(this.animationKey).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(18, this.animationKey);
       }
       tuser = this.animationIntervalMillis;
       if (tuser) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(19, tuser);
       }
       tuser = this.backgroundStretchablePicUrl;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(20, tuser);
       }
       if (!(this.animationKeyV2).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(21, this.animationKeyV2);
       }
       if (!(this.welcomeAnimationKey).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(22, this.welcomeAnimationKey);
       }
       tuser = this.sizeOfAvatar;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(23, tuser);
       }
       tuser = this.sizeOfHead;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(24, tuser);
       }
       tuser = this.sizeOfCar;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(25, tuser);
       }
       tuser = this.headPic;
       if (tuser != null && tuser.length > 0) {
          tuser = this.headPic;
          while (i2 < tuser.length) {
             object oobject3 = tuser[i2];
             if (oobject3 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(26, oobject3);
             }
             i2 = i2 + 1;
          }
       }
       tuser = this.headPicWidth;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(27, tuser);
       }
       tuser = this.headPicHeight;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(28, tuser);
       }
       tuser = this.useCommonEffectInfo;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(29, tuser);
       }
       tuser = this.commonEffectInfo;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(30, tuser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveActivityEnterRoomTip mergeFrom(CodedInputByteBufferNano p0){
       LiveActivityEnterRoomTip tpicUrl;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       String[] stringArray;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 10:
                if (this.user == null) {
                   this.user = new UserInfos$UserInfo();
                }
                p0.readMessage(this.user);
                break;
              case 18:
                if (this.userState == null) {
                   this.userState = new LiveAudienceState();
                }
                p0.readMessage(this.userState);
                break;
              case 24:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && (i != 4 && i != 5))))) {
                   continue ;
                }else {
                   this.displayType = i;
                }
                break;
              case '"':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 34);
                tpicUrl = this.picUrl;
                i2 = (tpicUrl == null)? 0: tpicUrl.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tpicUrl, i1, picUrlArray, i1, i2);
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
                this.picUrl = picUrlArray;
                break;
              case '(':
                this.picWidth = p0.readUInt32();
                break;
              case '0':
                this.picHeight = p0.readUInt32();
                break;
              case ':':
                this.displayText = p0.readString();
                break;
              case 'B':
                this.textColor = p0.readString();
                break;
              case 'H':
                this.textLeftDistance = p0.readUInt32();
                break;
              case 'P':
                this.backgroundBorderWidth = p0.readUInt32();
                break;
              case 'Z':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 90);
                tpicUrl = this.backgroundColor;
                i2 = (tpicUrl == null)? 0: tpicUrl.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tpicUrl, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.backgroundColor = stringArray;
                break;
              case 'b':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 98);
                tpicUrl = this.backgroudBorderColor;
                i2 = (tpicUrl == null)? 0: tpicUrl.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tpicUrl, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.backgroudBorderColor = stringArray;
                break;
              case 'j':
                this.activityBiz = p0.readString();
                break;
              case 'r':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 114);
                tpicUrl = this.specialShapedPicUrl;
                i2 = (tpicUrl == null)? 0: tpicUrl.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tpicUrl, i1, picUrlArray, i1, i2);
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
                this.specialShapedPicUrl = picUrlArray;
                break;
              case 'x':
                this.specialShapedPicWidth = p0.readUInt32();
                break;
              case 128:
                this.specialShapedPicHeight = p0.readUInt32();
                break;
              case 138:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 138);
                tpicUrl = this.backgroundPicUrl;
                i2 = (tpicUrl == null)? 0: tpicUrl.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tpicUrl, i1, picUrlArray, i1, i2);
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
                this.backgroundPicUrl = picUrlArray;
                break;
              case 146:
                this.animationKey = p0.readString();
                break;
              case 152:
                this.animationIntervalMillis = p0.readUInt64();
                break;
              case 162:
                if (this.backgroundStretchablePicUrl == null) {
                   this.backgroundStretchablePicUrl = new LiveCommonNoticeMessages$StretchablePicture();
                }
                p0.readMessage(this.backgroundStretchablePicUrl);
                break;
              case 170:
                this.animationKeyV2 = p0.readString();
                break;
              case 178:
                this.welcomeAnimationKey = p0.readString();
                break;
              case 184:
                this.sizeOfAvatar = p0.readUInt32();
                break;
              case 192:
                this.sizeOfHead = p0.readUInt32();
                break;
              case 200:
                this.sizeOfCar = p0.readUInt32();
                break;
              case 210:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 210);
                tpicUrl = this.headPic;
                i2 = (tpicUrl == null)? 0: tpicUrl.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tpicUrl, i1, picUrlArray, i1, i2);
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
                this.headPic = picUrlArray;
                break;
              case 216:
                this.headPicWidth = p0.readUInt32();
                break;
              case 224:
                this.headPicHeight = p0.readUInt32();
                break;
              case 232:
                this.useCommonEffectInfo = p0.readBool();
                break;
              case 242:
                if (this.commonEffectInfo == null) {
                   this.commonEffectInfo = new LiveCommonEffectInfo();
                }
                p0.readMessage(this.commonEffectInfo);
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
       LiveActivityEnterRoomTip tbackgroundC;
       object oobject1;
       LiveActivityEnterRoomTip tuser = this.user;
       if (tuser != null) {
          p0.writeMessage(1, tuser);
       }
       tuser = this.userState;
       if (tuser != null) {
          p0.writeMessage(2, tuser);
       }
       tuser = this.displayType;
       if (tuser != null) {
          p0.writeInt32(3, tuser);
       }
       tuser = this.picUrl;
       int i = 0;
       if (tuser != null && tuser.length > 0) {
          i1 = 0;
          LiveActivityEnterRoomTip tpicUrl = this.picUrl;
          while (i1 < tpicUrl.length) {
             object oobject = tpicUrl[i1];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tuser = this.picWidth;
       if (tuser != null) {
          p0.writeUInt32(5, tuser);
       }
       tuser = this.picHeight;
       if (tuser != null) {
          p0.writeUInt32(6, tuser);
       }
       String str = "";
       if (!(this.displayText).equals(str)) {
          p0.writeString(7, this.displayText);
       }
       if (!(this.textColor).equals(str)) {
          p0.writeString(8, this.textColor);
       }
       tuser = this.textLeftDistance;
       if (tuser != null) {
          p0.writeUInt32(9, tuser);
       }
       tuser = this.backgroundBorderWidth;
       if (tuser != null) {
          p0.writeUInt32(10, tuser);
       }
       tuser = this.backgroundColor;
       if (tuser != null && tuser.length > 0) {
          i1 = 0;
          tbackgroundC = this.backgroundColor;
          while (i1 < tbackgroundC.length) {
             oobject1 = tbackgroundC[i1];
             if (oobject1 != null) {
                p0.writeString(11, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tuser = this.backgroudBorderColor;
       if (tuser != null && tuser.length > 0) {
          i1 = 0;
          tbackgroundC = this.backgroudBorderColor;
          while (i1 < tbackgroundC.length) {
             oobject1 = tbackgroundC[i1];
             if (oobject1 != null) {
                p0.writeString(12, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.activityBiz).equals(str)) {
          p0.writeString(13, this.activityBiz);
       }
       tuser = this.specialShapedPicUrl;
       if (tuser != null && tuser.length > 0) {
          i1 = 0;
          tbackgroundC = this.specialShapedPicUrl;
          while (i1 < tbackgroundC.length) {
             oobject1 = tbackgroundC[i1];
             if (oobject1 != null) {
                p0.writeMessage(14, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tuser = this.specialShapedPicWidth;
       if (tuser != null) {
          p0.writeUInt32(15, tuser);
       }
       tuser = this.specialShapedPicHeight;
       if (tuser != null) {
          p0.writeUInt32(16, tuser);
       }
       tuser = this.backgroundPicUrl;
       if (tuser != null && tuser.length > 0) {
          i1 = 0;
          tbackgroundC = this.backgroundPicUrl;
          while (i1 < tbackgroundC.length) {
             oobject1 = tbackgroundC[i1];
             if (oobject1 != null) {
                p0.writeMessage(17, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.animationKey).equals(str)) {
          p0.writeString(18, this.animationKey);
       }
       tbackgroundC = this.animationIntervalMillis;
       if (tbackgroundC) {
          p0.writeUInt64(19, tbackgroundC);
       }
       tuser = this.backgroundStretchablePicUrl;
       if (tuser != null) {
          p0.writeMessage(20, tuser);
       }
       if (!(this.animationKeyV2).equals(str)) {
          p0.writeString(21, this.animationKeyV2);
       }
       if (!(this.welcomeAnimationKey).equals(str)) {
          p0.writeString(22, this.welcomeAnimationKey);
       }
       tuser = this.sizeOfAvatar;
       if (tuser != null) {
          p0.writeUInt32(23, tuser);
       }
       tuser = this.sizeOfHead;
       if (tuser != null) {
          p0.writeUInt32(24, tuser);
       }
       tuser = this.sizeOfCar;
       if (tuser != null) {
          p0.writeUInt32(25, tuser);
       }
       tuser = this.headPic;
       if (tuser != null && tuser.length > 0) {
          tuser = this.headPic;
          while (i < tuser.length) {
             object oobject2 = tuser[i];
             if (oobject2 != null) {
                p0.writeMessage(26, oobject2);
             }
             i = i + 1;
          }
       }
       tuser = this.headPicWidth;
       if (tuser != null) {
          p0.writeUInt32(27, tuser);
       }
       tuser = this.headPicHeight;
       if (tuser != null) {
          p0.writeUInt32(28, tuser);
       }
       tuser = this.useCommonEffectInfo;
       if (tuser != null) {
          p0.writeBool(29, tuser);
       }
       tuser = this.commonEffectInfo;
       if (tuser != null) {
          p0.writeMessage(30, tuser);
       }
       super.writeTo(p0);
       return;
    }
}
