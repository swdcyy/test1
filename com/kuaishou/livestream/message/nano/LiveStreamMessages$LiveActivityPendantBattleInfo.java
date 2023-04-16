package com.kuaishou.livestream.message.nano.LiveStreamMessages$LiveActivityPendantBattleInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$LiveActivityPendantCritBattleDisplayInfo;
import java.lang.System;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamMessages$LiveActivityPendantBattleInfo extends MessageNano	// class@0012e3
{
    public String barScoreColor;
    public String contentCountDownColor;
    public String contentTextColor;
    public long countDownTime;
    public LiveStreamMessages$LiveActivityPendantCritBattleDisplayInfo critBattleDisplay;
    public String displayLeftPoints;
    public String displayLeftScore;
    public String displayResult;
    public String displayResultScore;
    public String displayRightPoints;
    public String displayRightScore;
    public UserInfos$PicUrl[] leftResultPic;
    public long leftScore;
    public String leftScoreBarColor;
    public String leftScoreBarRightColor;
    public UserInfos$UserInfo leftUser;
    public String[] leftUserBorderColor;
    public int processType;
    public UserInfos$PicUrl[] rightResultPic;
    public long rightScore;
    public String rightScoreBarColor;
    public String rightScoreBarRightColor;
    public UserInfos$UserInfo rightUser;
    public String[] rightUserBorderColor;
    public boolean scoreBarDynamic;
    public boolean showBattlePoints;
    public static LiveStreamMessages$LiveActivityPendantBattleInfo[] _emptyArray;

    public void LiveStreamMessages$LiveActivityPendantBattleInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$LiveActivityPendantBattleInfo[] emptyArray(){
       if (LiveStreamMessages$LiveActivityPendantBattleInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$LiveActivityPendantBattleInfo._emptyArray == null) {
             LiveStreamMessages$LiveActivityPendantBattleInfo[] liveActivity = new LiveStreamMessages$LiveActivityPendantBattleInfo[0];
             LiveStreamMessages$LiveActivityPendantBattleInfo._emptyArray = liveActivity;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$LiveActivityPendantBattleInfo._emptyArray;
    }
    public static LiveStreamMessages$LiveActivityPendantBattleInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$LiveActivityPendantBattleInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$LiveActivityPendantBattleInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$LiveActivityPendantBattleInfo(), p0);
    }
    public LiveStreamMessages$LiveActivityPendantBattleInfo clear(){
       this.leftUser = null;
       this.rightUser = null;
       this.leftResultPic = UserInfos$PicUrl.emptyArray();
       this.rightResultPic = UserInfos$PicUrl.emptyArray();
       this.contentTextColor = "";
       this.leftScoreBarColor = "";
       this.rightScoreBarColor = "";
       this.barScoreColor = "";
       this.leftScore = 0;
       this.displayLeftScore = "";
       this.rightScore = 0;
       this.displayRightScore = "";
       this.processType = 0;
       this.countDownTime = 0;
       this.displayResult = "";
       this.displayResultScore = "";
       this.leftScoreBarRightColor = "";
       this.rightScoreBarRightColor = "";
       this.scoreBarDynamic = false;
       String[] eMPTY_STRING = WireFormatNano.EMPTY_STRING_ARRAY;
       this.leftUserBorderColor = eMPTY_STRING;
       this.rightUserBorderColor = eMPTY_STRING;
       this.showBattlePoints = false;
       this.displayLeftPoints = "";
       this.displayRightPoints = "";
       this.critBattleDisplay = null;
       this.contentCountDownColor = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i3;
       LiveStreamMessages$LiveActivityPendantBattleInfo tleftResultP;
       object oobject;
       int i4;
       int i = super.computeSerializedSize();
       LiveStreamMessages$LiveActivityPendantBattleInfo tleftUser = this.leftUser;
       if (tleftUser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tleftUser);
       }
       tleftUser = this.rightUser;
       int i1 = 2;
       if (tleftUser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, tleftUser);
       }
       tleftUser = this.leftResultPic;
       int i2 = 0;
       if (tleftUser != null && tleftUser.length > 0) {
          i3 = 0;
          tleftResultP = this.leftResultPic;
          while (i3 < tleftResultP.length) {
             oobject = tleftResultP[i3];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i3 = i3 + 1;
          }
       }
       tleftUser = this.rightResultPic;
       if (tleftUser != null && tleftUser.length > 0) {
          i3 = 0;
          tleftResultP = this.rightResultPic;
          while (i3 < tleftResultP.length) {
             oobject = tleftResultP[i3];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject);
             }
             i3 = i3 + 1;
          }
       }
       if (!(this.contentTextColor).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.contentTextColor);
       }
       if (!(this.leftScoreBarColor).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.leftScoreBarColor);
       }
       if (!(this.rightScoreBarColor).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.rightScoreBarColor);
       }
       if (!(this.barScoreColor).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.barScoreColor);
       }
       LiveStreamMessages$LiveActivityPendantBattleInfo tleftScore = this.leftScore;
       LiveStreamMessages$LiveActivityPendantBattleInfo liveActivity = null;
       if (tleftScore - liveActivity) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, tleftScore);
       }
       if (!(this.displayLeftScore).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.displayLeftScore);
       }
       tleftScore = this.rightScore;
       if (tleftScore - liveActivity) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(11, tleftScore);
       }
       if (!(this.displayRightScore).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.displayRightScore);
       }
       tleftUser = this.processType;
       if (tleftUser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(13, tleftUser);
       }
       tleftScore = this.countDownTime;
       if (tleftScore - liveActivity) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(14, tleftScore);
       }
       if (!(this.displayResult).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(15, this.displayResult);
       }
       if (!(this.displayResultScore).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(16, this.displayResultScore);
       }
       if (!(this.leftScoreBarRightColor).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(17, this.leftScoreBarRightColor);
       }
       if (!(this.rightScoreBarRightColor).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(18, this.rightScoreBarRightColor);
       }
       tleftUser = this.scoreBarDynamic;
       if (tleftUser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(19, tleftUser);
       }
       tleftUser = this.leftUserBorderColor;
       if (tleftUser != null && tleftUser.length > 0) {
          i3 = 0;
          i4 = 0;
          int i5 = 0;
          liveActivity = this.leftUserBorderColor;
          while (i3 < liveActivity.length) {
             object oobject1 = liveActivity[i3];
             if (oobject1 != null) {
                i5 = i5 + 1;
                i4 = i4 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject1);
             }
             i3 = i3 + 1;
          }
          i = (i + i4) + (i5 * 2);
       }
       tleftUser = this.rightUserBorderColor;
       if (tleftUser != null && tleftUser.length > 0) {
          i3 = 0;
          i4 = 0;
          LiveStreamMessages$LiveActivityPendantBattleInfo trightUserBo = this.rightUserBorderColor;
          while (i2 < trightUserBo.length) {
             object oobject2 = trightUserBo[i2];
             if (oobject2 != null) {
                i4 = i4 + 1;
                i3 = i3 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject2);
             }
             i2 = i2 + 1;
          }
          i = (i + i3) + (i4 * 2);
       }
       tleftUser = this.showBattlePoints;
       if (tleftUser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(22, tleftUser);
       }
       if (!(this.displayLeftPoints).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(23, this.displayLeftPoints);
       }
       if (!(this.displayRightPoints).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(24, this.displayRightPoints);
       }
       tleftUser = this.critBattleDisplay;
       if (tleftUser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(25, tleftUser);
       }
       if (!(this.contentCountDownColor).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(26, this.contentCountDownColor);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$LiveActivityPendantBattleInfo mergeFrom(CodedInputByteBufferNano p0){
       LiveStreamMessages$LiveActivityPendantBattleInfo tleftResultP;
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
                if (this.leftUser == null) {
                   this.leftUser = new UserInfos$UserInfo();
                }
                p0.readMessage(this.leftUser);
                break;
              case 18:
                if (this.rightUser == null) {
                   this.rightUser = new UserInfos$UserInfo();
                }
                p0.readMessage(this.rightUser);
                break;
              case 26:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 26);
                tleftResultP = this.leftResultPic;
                i2 = (tleftResultP == null)? 0: tleftResultP.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tleftResultP, i1, picUrlArray, i1, i2);
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
                this.leftResultPic = picUrlArray;
                break;
              case '"':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 34);
                tleftResultP = this.rightResultPic;
                i2 = (tleftResultP == null)? 0: tleftResultP.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tleftResultP, i1, picUrlArray, i1, i2);
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
                this.rightResultPic = picUrlArray;
                break;
              case '*':
                this.contentTextColor = p0.readString();
                break;
              case '2':
                this.leftScoreBarColor = p0.readString();
                break;
              case ':':
                this.rightScoreBarColor = p0.readString();
                break;
              case 'B':
                this.barScoreColor = p0.readString();
                break;
              case 'H':
                this.leftScore = p0.readUInt64();
                break;
              case 'R':
                this.displayLeftScore = p0.readString();
                break;
              case 'X':
                this.rightScore = p0.readUInt64();
                break;
              case 'b':
                this.displayRightScore = p0.readString();
                break;
              case 'h':
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.processType = i;
                }
                break;
              case 'p':
                this.countDownTime = p0.readUInt64();
                break;
              case 'z':
                this.displayResult = p0.readString();
                break;
              case 130:
                this.displayResultScore = p0.readString();
                break;
              case 138:
                this.leftScoreBarRightColor = p0.readString();
                break;
              case 146:
                this.rightScoreBarRightColor = p0.readString();
                break;
              case 152:
                this.scoreBarDynamic = p0.readBool();
                break;
              case 162:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 162);
                tleftResultP = this.leftUserBorderColor;
                i2 = (tleftResultP == null)? 0: tleftResultP.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tleftResultP, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.leftUserBorderColor = stringArray;
                break;
              case 170:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 170);
                tleftResultP = this.rightUserBorderColor;
                i2 = (tleftResultP == null)? 0: tleftResultP.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tleftResultP, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.rightUserBorderColor = stringArray;
                break;
              case 176:
                this.showBattlePoints = p0.readBool();
                break;
              case 186:
                this.displayLeftPoints = p0.readString();
                break;
              case 194:
                this.displayRightPoints = p0.readString();
                break;
              case 202:
                if (this.critBattleDisplay == null) {
                   this.critBattleDisplay = new LiveStreamMessages$LiveActivityPendantCritBattleDisplayInfo();
                }
                p0.readMessage(this.critBattleDisplay);
                break;
              case 210:
                this.contentCountDownColor = p0.readString();
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
       LiveStreamMessages$LiveActivityPendantBattleInfo tleftResultP;
       object oobject;
       LiveStreamMessages$LiveActivityPendantBattleInfo tleftUser = this.leftUser;
       if (tleftUser != null) {
          p0.writeMessage(1, tleftUser);
       }
       tleftUser = this.rightUser;
       if (tleftUser != null) {
          p0.writeMessage(2, tleftUser);
       }
       tleftUser = this.leftResultPic;
       int i = 0;
       if (tleftUser != null && tleftUser.length > 0) {
          i1 = 0;
          tleftResultP = this.leftResultPic;
          while (i1 < tleftResultP.length) {
             oobject = tleftResultP[i1];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tleftUser = this.rightResultPic;
       if (tleftUser != null && tleftUser.length > 0) {
          i1 = 0;
          tleftResultP = this.rightResultPic;
          while (i1 < tleftResultP.length) {
             oobject = tleftResultP[i1];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.contentTextColor).equals("")) {
          p0.writeString(5, this.contentTextColor);
       }
       if (!(this.leftScoreBarColor).equals("")) {
          p0.writeString(6, this.leftScoreBarColor);
       }
       if (!(this.rightScoreBarColor).equals("")) {
          p0.writeString(7, this.rightScoreBarColor);
       }
       if (!(this.barScoreColor).equals("")) {
          p0.writeString(8, this.barScoreColor);
       }
       LiveStreamMessages$LiveActivityPendantBattleInfo tleftScore = this.leftScore;
       if (tleftScore) {
          p0.writeUInt64(9, tleftScore);
       }
       if (!(this.displayLeftScore).equals("")) {
          p0.writeString(10, this.displayLeftScore);
       }
       tleftScore = this.rightScore;
       if (tleftScore) {
          p0.writeUInt64(11, tleftScore);
       }
       if (!(this.displayRightScore).equals("")) {
          p0.writeString(12, this.displayRightScore);
       }
       tleftUser = this.processType;
       if (tleftUser != null) {
          p0.writeInt32(13, tleftUser);
       }
       tleftScore = this.countDownTime;
       if (tleftScore) {
          p0.writeUInt64(14, tleftScore);
       }
       if (!(this.displayResult).equals("")) {
          p0.writeString(15, this.displayResult);
       }
       if (!(this.displayResultScore).equals("")) {
          p0.writeString(16, this.displayResultScore);
       }
       if (!(this.leftScoreBarRightColor).equals("")) {
          p0.writeString(17, this.leftScoreBarRightColor);
       }
       if (!(this.rightScoreBarRightColor).equals("")) {
          p0.writeString(18, this.rightScoreBarRightColor);
       }
       tleftUser = this.scoreBarDynamic;
       if (tleftUser != null) {
          p0.writeBool(19, tleftUser);
       }
       tleftUser = this.leftUserBorderColor;
       if (tleftUser != null && tleftUser.length > 0) {
          i1 = 0;
          tleftScore = this.leftUserBorderColor;
          while (i1 < tleftScore.length) {
             object oobject1 = tleftScore[i1];
             if (oobject1 != null) {
                p0.writeString(20, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tleftUser = this.rightUserBorderColor;
       if (tleftUser != null && tleftUser.length > 0) {
          tleftUser = this.rightUserBorderColor;
          while (i < tleftUser.length) {
             object oobject2 = tleftUser[i];
             if (oobject2 != null) {
                p0.writeString(21, oobject2);
             }
             i = i + 1;
          }
       }
       tleftUser = this.showBattlePoints;
       if (tleftUser != null) {
          p0.writeBool(22, tleftUser);
       }
       if (!(this.displayLeftPoints).equals("")) {
          p0.writeString(23, this.displayLeftPoints);
       }
       if (!(this.displayRightPoints).equals("")) {
          p0.writeString(24, this.displayRightPoints);
       }
       tleftUser = this.critBattleDisplay;
       if (tleftUser != null) {
          p0.writeMessage(25, tleftUser);
       }
       if (!(this.contentCountDownColor).equals("")) {
          p0.writeString(26, this.contentCountDownColor);
       }
       super.writeTo(p0);
       return;
    }
}
