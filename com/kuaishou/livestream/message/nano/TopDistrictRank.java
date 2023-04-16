package com.kuaishou.livestream.message.nano.TopDistrictRank;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.lang.System;

public final class TopDistrictRank extends MessageNano	// class@001480
{
    public int actionType;
    public String[] backgroundColor;
    public String benefitTextFirst;
    public String benefitTextSecond;
    public String benefitTextThird;
    public UserInfos$UserInfo[] contributorInfo;
    public String description;
    public String descriptionV2;
    public String displayRank;
    public boolean enableBenefit;
    public String extraInfo;
    public UserInfos$PicUrl[] globalTopBackgroundPicUrls;
    public int jumpToTab;
    public UserInfos$PicUrl[] noBenefitPicUrls;
    public int noticeType;
    public int rank;
    public String strikingDescription;
    public String strikingDisplayRank;
    public UserInfos$UserInfo[] strikingGuardInfo;
    public String strikingRankPeriod;
    public UserInfos$PicUrl[] tailIcon;
    public boolean useStrikingStyle;
    public static TopDistrictRank[] _emptyArray;

    public void TopDistrictRank(){
       super();
       this.clear();
    }
    public static TopDistrictRank[] emptyArray(){
       if (TopDistrictRank._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (TopDistrictRank._emptyArray == null) {
             TopDistrictRank[] topDistrictR = new TopDistrictRank[0];
             TopDistrictRank._emptyArray = topDistrictR;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return TopDistrictRank._emptyArray;
    }
    public static TopDistrictRank parseFrom(CodedInputByteBufferNano p0){
       return new TopDistrictRank().mergeFrom(p0);
    }
    public static TopDistrictRank parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new TopDistrictRank(), p0);
    }
    public TopDistrictRank clear(){
       this.rank = 0;
       this.description = "";
       this.contributorInfo = UserInfos$UserInfo.emptyArray();
       this.displayRank = "";
       this.descriptionV2 = "";
       this.useStrikingStyle = false;
       this.strikingDisplayRank = "";
       this.strikingRankPeriod = "";
       this.strikingDescription = "";
       this.strikingGuardInfo = UserInfos$UserInfo.emptyArray();
       this.noticeType = 0;
       this.actionType = 0;
       this.jumpToTab = 0;
       this.tailIcon = UserInfos$PicUrl.emptyArray();
       this.backgroundColor = WireFormatNano.EMPTY_STRING_ARRAY;
       this.globalTopBackgroundPicUrls = UserInfos$PicUrl.emptyArray();
       this.enableBenefit = false;
       this.benefitTextFirst = "";
       this.benefitTextSecond = "";
       this.benefitTextThird = "";
       this.noBenefitPicUrls = UserInfos$PicUrl.emptyArray();
       this.extraInfo = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i3;
       TopDistrictRank tcontributor;
       object oobject;
       int i = super.computeSerializedSize();
       TopDistrictRank trank = this.rank;
       int i1 = 1;
       if (trank != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(i1, trank);
       }
       if (!(this.description).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.description);
       }
       trank = this.contributorInfo;
       int i2 = 0;
       if (trank != null && trank.length > 0) {
          i3 = 0;
          tcontributor = this.contributorInfo;
          while (i3 < tcontributor.length) {
             oobject = tcontributor[i3];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i3 = i3 + 1;
          }
       }
       if (!(this.displayRank).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.displayRank);
       }
       if (!(this.descriptionV2).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.descriptionV2);
       }
       trank = this.useStrikingStyle;
       if (trank != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, trank);
       }
       if (!(this.strikingDisplayRank).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.strikingDisplayRank);
       }
       if (!(this.strikingRankPeriod).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.strikingRankPeriod);
       }
       if (!(this.strikingDescription).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.strikingDescription);
       }
       trank = this.strikingGuardInfo;
       if (trank != null && trank.length > 0) {
          i3 = 0;
          tcontributor = this.strikingGuardInfo;
          while (i3 < tcontributor.length) {
             oobject = tcontributor[i3];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(10, oobject);
             }
             i3 = i3 + 1;
          }
       }
       trank = this.noticeType;
       if (trank != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(11, trank);
       }
       trank = this.actionType;
       if (trank != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(12, trank);
       }
       trank = this.jumpToTab;
       if (trank != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(13, trank);
       }
       trank = this.tailIcon;
       if (trank != null && trank.length > 0) {
          i3 = 0;
          tcontributor = this.tailIcon;
          while (i3 < tcontributor.length) {
             oobject = tcontributor[i3];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(14, oobject);
             }
             i3 = i3 + 1;
          }
       }
       trank = this.backgroundColor;
       if (trank != null && trank.length > 0) {
          i3 = 0;
          int i4 = 0;
          int i5 = 0;
          TopDistrictRank tbackgroundC = this.backgroundColor;
          while (i3 < tbackgroundC.length) {
             object oobject1 = tbackgroundC[i3];
             if (oobject1 != null) {
                i5 = i5 + 1;
                i4 = i4 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject1);
             }
             i3 = i3 + 1;
          }
          i = (i + i4) + (i5 * 1);
       }
       trank = this.globalTopBackgroundPicUrls;
       if (trank != null && trank.length > 0) {
          i3 = 0;
          TopDistrictRank tglobalTopBa = this.globalTopBackgroundPicUrls;
          while (i3 < tglobalTopBa.length) {
             object oobject2 = tglobalTopBa[i3];
             if (oobject2 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(16, oobject2);
             }
             i3 = i3 + 1;
          }
       }
       trank = this.enableBenefit;
       if (trank != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(17, trank);
       }
       if (!(this.benefitTextFirst).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(18, this.benefitTextFirst);
       }
       if (!(this.benefitTextSecond).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(19, this.benefitTextSecond);
       }
       if (!(this.benefitTextThird).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(20, this.benefitTextThird);
       }
       trank = this.noBenefitPicUrls;
       if (trank != null && trank.length > 0) {
          trank = this.noBenefitPicUrls;
          while (i2 < trank.length) {
             object oobject3 = trank[i2];
             if (oobject3 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(21, oobject3);
             }
             i2 = i2 + 1;
          }
       }
       if (!(this.extraInfo).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(22, this.extraInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public TopDistrictRank mergeFrom(CodedInputByteBufferNano p0){
       int i1;
       UserInfos$UserInfo[] userInfoArra;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       while (true) {
          int i = p0.readTag();
          TopDistrictRank topDistrictR = 1;
          switch (i){
              case 0:
                return this;
              case 8:
                this.rank = p0.readUInt32();
                break;
              case 18:
                this.description = p0.readString();
                break;
              case 26:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 26);
                topDistrictR = this.contributorInfo;
                i1 = (topDistrictR == null)? 0: topDistrictR.length;
                i = i + i1;
                userInfoArra = new UserInfos$UserInfo[i];
                if (i1) {
                   System.arraycopy(topDistrictR, 0, userInfoArra, 0, i1);
                }
                i2 = i - 1;
                while (i1 < i2) {
                   userInfoArra[i1] = new UserInfos$UserInfo();
                   p0.readMessage(userInfoArra[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                userInfoArra[i1] = new UserInfos$UserInfo();
                p0.readMessage(userInfoArra[i1]);
                this.contributorInfo = userInfoArra;
                break;
              case '"':
                this.displayRank = p0.readString();
                break;
              case '*':
                this.descriptionV2 = p0.readString();
                break;
              case '0':
                this.useStrikingStyle = p0.readBool();
                break;
              case ':':
                this.strikingDisplayRank = p0.readString();
                break;
              case 'B':
                this.strikingRankPeriod = p0.readString();
                break;
              case 'J':
                this.strikingDescription = p0.readString();
                break;
              case 'R':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 82);
                topDistrictR = this.strikingGuardInfo;
                i1 = (topDistrictR == null)? 0: topDistrictR.length;
                i = i + i1;
                userInfoArra = new UserInfos$UserInfo[i];
                if (i1) {
                   System.arraycopy(topDistrictR, 0, userInfoArra, 0, i1);
                }
                i2 = i - 1;
                while (i1 < i2) {
                   userInfoArra[i1] = new UserInfos$UserInfo();
                   p0.readMessage(userInfoArra[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                userInfoArra[i1] = new UserInfos$UserInfo();
                p0.readMessage(userInfoArra[i1]);
                this.strikingGuardInfo = userInfoArra;
                break;
              case 'X':
                i = p0.readInt32();
                switch (i){
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 1:
                      break;
                    default:
                }
                this.noticeType = i;
                break;
              case '`':
                i = p0.readInt32();
                if (i && i != topDistrictR) {
                   continue ;
                }else {
                   this.actionType = i;
                }
                break;
              case 'h':
                i = p0.readInt32();
                if (i && (i != topDistrictR && (i != 2 && (i != 3 && i != 4)))) {
                   continue ;
                }else {
                   this.jumpToTab = i;
                }
                break;
              case 'r':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 114);
                topDistrictR = this.tailIcon;
                i1 = (topDistrictR == null)? 0: topDistrictR.length;
                i = i + i1;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i1) {
                   System.arraycopy(topDistrictR, 0, picUrlArray, 0, i1);
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
                this.tailIcon = picUrlArray;
                break;
              case 'z':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 122);
                topDistrictR = this.backgroundColor;
                i1 = (topDistrictR == null)? 0: topDistrictR.length;
                i = i + i1;
                String[] stringArray = new String[i];
                if (i1) {
                   System.arraycopy(topDistrictR, 0, stringArray, 0, i1);
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
              case 130:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 130);
                topDistrictR = this.globalTopBackgroundPicUrls;
                i1 = (topDistrictR == null)? 0: topDistrictR.length;
                i = i + i1;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i1) {
                   System.arraycopy(topDistrictR, 0, picUrlArray, 0, i1);
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
                this.globalTopBackgroundPicUrls = picUrlArray;
                break;
              case 136:
                this.enableBenefit = p0.readBool();
                break;
              case 146:
                this.benefitTextFirst = p0.readString();
                break;
              case 154:
                this.benefitTextSecond = p0.readString();
                break;
              case 162:
                this.benefitTextThird = p0.readString();
                break;
              case 170:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 170);
                topDistrictR = this.noBenefitPicUrls;
                i1 = (topDistrictR == null)? 0: topDistrictR.length;
                i = i + i1;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i1) {
                   System.arraycopy(topDistrictR, 0, picUrlArray, 0, i1);
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
                this.noBenefitPicUrls = picUrlArray;
                break;
              case 178:
                this.extraInfo = p0.readString();
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
       TopDistrictRank tcontributor;
       object oobject;
       TopDistrictRank trank = this.rank;
       if (trank != null) {
          p0.writeUInt32(1, trank);
       }
       String str = "";
       if (!(this.description).equals(str)) {
          p0.writeString(2, this.description);
       }
       trank = this.contributorInfo;
       int i = 0;
       if (trank != null && trank.length > 0) {
          i1 = 0;
          tcontributor = this.contributorInfo;
          while (i1 < tcontributor.length) {
             oobject = tcontributor[i1];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.displayRank).equals(str)) {
          p0.writeString(4, this.displayRank);
       }
       if (!(this.descriptionV2).equals(str)) {
          p0.writeString(5, this.descriptionV2);
       }
       trank = this.useStrikingStyle;
       if (trank != null) {
          p0.writeBool(6, trank);
       }
       if (!(this.strikingDisplayRank).equals(str)) {
          p0.writeString(7, this.strikingDisplayRank);
       }
       if (!(this.strikingRankPeriod).equals(str)) {
          p0.writeString(8, this.strikingRankPeriod);
       }
       if (!(this.strikingDescription).equals(str)) {
          p0.writeString(9, this.strikingDescription);
       }
       trank = this.strikingGuardInfo;
       if (trank != null && trank.length > 0) {
          i1 = 0;
          tcontributor = this.strikingGuardInfo;
          while (i1 < tcontributor.length) {
             oobject = tcontributor[i1];
             if (oobject != null) {
                p0.writeMessage(10, oobject);
             }
             i1 = i1 + 1;
          }
       }
       trank = this.noticeType;
       if (trank != null) {
          p0.writeInt32(11, trank);
       }
       trank = this.actionType;
       if (trank != null) {
          p0.writeInt32(12, trank);
       }
       trank = this.jumpToTab;
       if (trank != null) {
          p0.writeInt32(13, trank);
       }
       trank = this.tailIcon;
       if (trank != null && trank.length > 0) {
          i1 = 0;
          tcontributor = this.tailIcon;
          while (i1 < tcontributor.length) {
             oobject = tcontributor[i1];
             if (oobject != null) {
                p0.writeMessage(14, oobject);
             }
             i1 = i1 + 1;
          }
       }
       trank = this.backgroundColor;
       if (trank != null && trank.length > 0) {
          i1 = 0;
          tcontributor = this.backgroundColor;
          while (i1 < tcontributor.length) {
             oobject = tcontributor[i1];
             if (oobject != null) {
                p0.writeString(15, oobject);
             }
             i1 = i1 + 1;
          }
       }
       trank = this.globalTopBackgroundPicUrls;
       if (trank != null && trank.length > 0) {
          i1 = 0;
          tcontributor = this.globalTopBackgroundPicUrls;
          while (i1 < tcontributor.length) {
             oobject = tcontributor[i1];
             if (oobject != null) {
                p0.writeMessage(16, oobject);
             }
             i1 = i1 + 1;
          }
       }
       trank = this.enableBenefit;
       if (trank != null) {
          p0.writeBool(17, trank);
       }
       if (!(this.benefitTextFirst).equals(str)) {
          p0.writeString(18, this.benefitTextFirst);
       }
       if (!(this.benefitTextSecond).equals(str)) {
          p0.writeString(19, this.benefitTextSecond);
       }
       if (!(this.benefitTextThird).equals(str)) {
          p0.writeString(20, this.benefitTextThird);
       }
       trank = this.noBenefitPicUrls;
       if (trank != null && trank.length > 0) {
          trank = this.noBenefitPicUrls;
          while (i < trank.length) {
             object oobject1 = trank[i];
             if (oobject1 != null) {
                p0.writeMessage(21, oobject1);
             }
             i = i + 1;
          }
       }
       if (!(this.extraInfo).equals(str)) {
          p0.writeString(22, this.extraInfo);
       }
       super.writeTo(p0);
       return;
    }
}
