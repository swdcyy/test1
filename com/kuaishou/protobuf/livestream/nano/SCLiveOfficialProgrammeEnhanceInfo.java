package com.kuaishou.protobuf.livestream.nano.SCLiveOfficialProgrammeEnhanceInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class SCLiveOfficialProgrammeEnhanceInfo extends MessageNano	// class@000d6a
{
    public UserInfos$PicUrl[] backgroundImageUrls;
    public int countDownDurationMs;
    public long countDownEndTimeMs;
    public String kwaiUrl;
    public UserInfos$PicUrl[] programmeIconUrls;
    public String programmeId;
    public UserInfos$PicUrl[] programmeUnfoldUrls;
    public UserInfos$UserInfo showingAuthor;
    public UserInfos$PicUrl[] showingLottieUrls;
    public int statusType;
    public String text;
    public static SCLiveOfficialProgrammeEnhanceInfo[] _emptyArray;

    public void SCLiveOfficialProgrammeEnhanceInfo(){
       super();
       this.clear();
    }
    public static SCLiveOfficialProgrammeEnhanceInfo[] emptyArray(){
       if (SCLiveOfficialProgrammeEnhanceInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveOfficialProgrammeEnhanceInfo._emptyArray == null) {
             SCLiveOfficialProgrammeEnhanceInfo[] sCLiveOffici = new SCLiveOfficialProgrammeEnhanceInfo[0];
             SCLiveOfficialProgrammeEnhanceInfo._emptyArray = sCLiveOffici;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveOfficialProgrammeEnhanceInfo._emptyArray;
    }
    public static SCLiveOfficialProgrammeEnhanceInfo parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveOfficialProgrammeEnhanceInfo().mergeFrom(p0);
    }
    public static SCLiveOfficialProgrammeEnhanceInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveOfficialProgrammeEnhanceInfo(), p0);
    }
    public SCLiveOfficialProgrammeEnhanceInfo clear(){
       this.statusType = 0;
       this.programmeId = "";
       this.text = "";
       this.countDownEndTimeMs = 0;
       this.countDownDurationMs = 0;
       this.showingAuthor = null;
       this.kwaiUrl = "";
       this.programmeIconUrls = UserInfos$PicUrl.emptyArray();
       this.showingLottieUrls = UserInfos$PicUrl.emptyArray();
       this.backgroundImageUrls = UserInfos$PicUrl.emptyArray();
       this.programmeUnfoldUrls = UserInfos$PicUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       object oobject;
       int i = super.computeSerializedSize();
       SCLiveOfficialProgrammeEnhanceInfo tstatusType = this.statusType;
       if (tstatusType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tstatusType);
       }
       String str = "";
       if (!(this.programmeId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.programmeId);
       }
       if (!(this.text).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.text);
       }
       SCLiveOfficialProgrammeEnhanceInfo tcountDownEn = this.countDownEndTimeMs;
       if (tcountDownEn) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tcountDownEn);
       }
       tstatusType = this.countDownDurationMs;
       if (tstatusType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tstatusType);
       }
       tstatusType = this.showingAuthor;
       if (tstatusType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, tstatusType);
       }
       if (!(this.kwaiUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.kwaiUrl);
       }
       tstatusType = this.programmeIconUrls;
       int i1 = 0;
       if (tstatusType != null && tstatusType.length > 0) {
          i2 = 0;
          tcountDownEn = this.programmeIconUrls;
          while (i2 < tcountDownEn.length) {
             oobject = tcountDownEn[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(8, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tstatusType = this.showingLottieUrls;
       if (tstatusType != null && tstatusType.length > 0) {
          i2 = 0;
          tcountDownEn = this.showingLottieUrls;
          while (i2 < tcountDownEn.length) {
             oobject = tcountDownEn[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(9, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tstatusType = this.backgroundImageUrls;
       if (tstatusType != null && tstatusType.length > 0) {
          i2 = 0;
          tcountDownEn = this.backgroundImageUrls;
          while (i2 < tcountDownEn.length) {
             oobject = tcountDownEn[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(10, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tstatusType = this.programmeUnfoldUrls;
       if (tstatusType != null && tstatusType.length > 0) {
          tstatusType = this.programmeUnfoldUrls;
          while (i1 < tstatusType.length) {
             object oobject1 = tstatusType[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(11, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveOfficialProgrammeEnhanceInfo mergeFrom(CodedInputByteBufferNano p0){
       SCLiveOfficialProgrammeEnhanceInfo tprogrammeIc;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 8:
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
                    case 1:
                      break;
                    default:
                }
                this.statusType = i;
                break;
              case 18:
                this.programmeId = p0.readString();
                break;
              case 26:
                this.text = p0.readString();
                break;
              case 32:
                this.countDownEndTimeMs = p0.readUInt64();
                break;
              case '(':
                this.countDownDurationMs = p0.readUInt32();
                break;
              case '2':
                if (this.showingAuthor == null) {
                   this.showingAuthor = new UserInfos$UserInfo();
                }
                p0.readMessage(this.showingAuthor);
                break;
              case ':':
                this.kwaiUrl = p0.readString();
                break;
              case 'B':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 66);
                tprogrammeIc = this.programmeIconUrls;
                i2 = (tprogrammeIc == null)? 0: tprogrammeIc.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tprogrammeIc, i1, picUrlArray, i1, i2);
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
                this.programmeIconUrls = picUrlArray;
                break;
              case 'J':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 74);
                tprogrammeIc = this.showingLottieUrls;
                i2 = (tprogrammeIc == null)? 0: tprogrammeIc.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tprogrammeIc, i1, picUrlArray, i1, i2);
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
                this.showingLottieUrls = picUrlArray;
                break;
              case 'R':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 82);
                tprogrammeIc = this.backgroundImageUrls;
                i2 = (tprogrammeIc == null)? 0: tprogrammeIc.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tprogrammeIc, i1, picUrlArray, i1, i2);
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
                this.backgroundImageUrls = picUrlArray;
                break;
              case 'Z':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 90);
                tprogrammeIc = this.programmeUnfoldUrls;
                i2 = (tprogrammeIc == null)? 0: tprogrammeIc.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tprogrammeIc, i1, picUrlArray, i1, i2);
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
                this.programmeUnfoldUrls = picUrlArray;
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
       object oobject;
       SCLiveOfficialProgrammeEnhanceInfo tstatusType = this.statusType;
       if (tstatusType != null) {
          p0.writeInt32(1, tstatusType);
       }
       String str = "";
       if (!(this.programmeId).equals(str)) {
          p0.writeString(2, this.programmeId);
       }
       if (!(this.text).equals(str)) {
          p0.writeString(3, this.text);
       }
       SCLiveOfficialProgrammeEnhanceInfo tcountDownEn = this.countDownEndTimeMs;
       if (tcountDownEn) {
          p0.writeUInt64(4, tcountDownEn);
       }
       tstatusType = this.countDownDurationMs;
       if (tstatusType != null) {
          p0.writeUInt32(5, tstatusType);
       }
       tstatusType = this.showingAuthor;
       if (tstatusType != null) {
          p0.writeMessage(6, tstatusType);
       }
       if (!(this.kwaiUrl).equals(str)) {
          p0.writeString(7, this.kwaiUrl);
       }
       tstatusType = this.programmeIconUrls;
       int i = 0;
       if (tstatusType != null && tstatusType.length > 0) {
          i1 = 0;
          tcountDownEn = this.programmeIconUrls;
          while (i1 < tcountDownEn.length) {
             oobject = tcountDownEn[i1];
             if (oobject != null) {
                p0.writeMessage(8, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tstatusType = this.showingLottieUrls;
       if (tstatusType != null && tstatusType.length > 0) {
          i1 = 0;
          tcountDownEn = this.showingLottieUrls;
          while (i1 < tcountDownEn.length) {
             oobject = tcountDownEn[i1];
             if (oobject != null) {
                p0.writeMessage(9, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tstatusType = this.backgroundImageUrls;
       if (tstatusType != null && tstatusType.length > 0) {
          i1 = 0;
          tcountDownEn = this.backgroundImageUrls;
          while (i1 < tcountDownEn.length) {
             oobject = tcountDownEn[i1];
             if (oobject != null) {
                p0.writeMessage(10, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tstatusType = this.programmeUnfoldUrls;
       if (tstatusType != null && tstatusType.length > 0) {
          tstatusType = this.programmeUnfoldUrls;
          while (i < tstatusType.length) {
             object oobject1 = tstatusType[i];
             if (oobject1 != null) {
                p0.writeMessage(11, oobject1);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
