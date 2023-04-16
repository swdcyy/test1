package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveActivityPendant;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$LiveActivityPendantDisplayInfo;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;
import com.kuaishou.livestream.message.nano.LiveActiveInfo$KwaiActiveInfo;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$LiveActivityPendantDisplayStyle;

public final class LiveStreamMessages$SCLiveActivityPendant extends MessageNano	// class@001338
{
    public String clickUrl;
    public LiveStreamMessages$LiveActivityPendantDisplayInfo[] displayInfo;
    public UserInfos$PicUrl[] displayPict;
    public LiveStreamMessages$LiveActivityPendantDisplayStyle displayStyle;
    public String frontStyle;
    public boolean ignoreAbTest;
    public boolean ignorePendant;
    public boolean largePendant;
    public LiveActiveInfo$KwaiActiveInfo logInfo;
    public String logMessage;
    public String pendantId;
    public int pendantPriority;
    public int rank;
    public String shrinkBarBackgroundColor;
    public UserInfos$PicUrl[] shrinkBarImg;
    public String shrinkBarImgTitle;
    public UserInfos$PicUrl[] shrinkBarPic;
    public String shrinkBarTitle;
    public String styleType;
    public int type;
    public static LiveStreamMessages$SCLiveActivityPendant[] _emptyArray;

    public void LiveStreamMessages$SCLiveActivityPendant(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCLiveActivityPendant[] emptyArray(){
       if (LiveStreamMessages$SCLiveActivityPendant._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCLiveActivityPendant._emptyArray == null) {
             LiveStreamMessages$SCLiveActivityPendant[] sCLiveActivi = new LiveStreamMessages$SCLiveActivityPendant[0];
             LiveStreamMessages$SCLiveActivityPendant._emptyArray = sCLiveActivi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCLiveActivityPendant._emptyArray;
    }
    public static LiveStreamMessages$SCLiveActivityPendant parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCLiveActivityPendant().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCLiveActivityPendant parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCLiveActivityPendant(), p0);
    }
    public LiveStreamMessages$SCLiveActivityPendant clear(){
       this.type = 0;
       this.rank = 0;
       this.displayStyle = null;
       this.frontStyle = "";
       this.clickUrl = "";
       this.displayPict = UserInfos$PicUrl.emptyArray();
       this.shrinkBarPic = UserInfos$PicUrl.emptyArray();
       this.displayInfo = LiveStreamMessages$LiveActivityPendantDisplayInfo.emptyArray();
       this.logInfo = null;
       this.styleType = "";
       this.shrinkBarBackgroundColor = "";
       this.shrinkBarTitle = "";
       this.logMessage = "";
       this.pendantId = "";
       this.pendantPriority = 0;
       this.ignoreAbTest = false;
       this.ignorePendant = false;
       this.largePendant = false;
       this.shrinkBarImg = UserInfos$PicUrl.emptyArray();
       this.shrinkBarImgTitle = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       LiveStreamMessages$SCLiveActivityPendant tdisplayPict;
       object oobject;
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCLiveActivityPendant ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, ttype);
       }
       ttype = this.rank;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, ttype);
       }
       ttype = this.displayStyle;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, ttype);
       }
       String str = "";
       if (!(this.frontStyle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.frontStyle);
       }
       if (!(this.clickUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.clickUrl);
       }
       ttype = this.displayPict;
       int i1 = 0;
       if (ttype != null && ttype.length > 0) {
          i2 = 0;
          tdisplayPict = this.displayPict;
          while (i2 < tdisplayPict.length) {
             oobject = tdisplayPict[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(6, oobject);
             }
             i2 = i2 + 1;
          }
       }
       ttype = this.shrinkBarPic;
       if (ttype != null && ttype.length > 0) {
          i2 = 0;
          tdisplayPict = this.shrinkBarPic;
          while (i2 < tdisplayPict.length) {
             oobject = tdisplayPict[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(7, oobject);
             }
             i2 = i2 + 1;
          }
       }
       ttype = this.displayInfo;
       if (ttype != null && ttype.length > 0) {
          i2 = 0;
          tdisplayPict = this.displayInfo;
          while (i2 < tdisplayPict.length) {
             oobject = tdisplayPict[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(8, oobject);
             }
             i2 = i2 + 1;
          }
       }
       ttype = this.logInfo;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, ttype);
       }
       if (!(this.styleType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.styleType);
       }
       if (!(this.shrinkBarBackgroundColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.shrinkBarBackgroundColor);
       }
       if (!(this.shrinkBarTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.shrinkBarTitle);
       }
       if (!(this.logMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.logMessage);
       }
       if (!(this.pendantId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.pendantId);
       }
       ttype = this.pendantPriority;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(15, ttype);
       }
       ttype = this.ignoreAbTest;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(16, ttype);
       }
       ttype = this.ignorePendant;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(17, ttype);
       }
       ttype = this.largePendant;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(18, ttype);
       }
       ttype = this.shrinkBarImg;
       if (ttype != null && ttype.length > 0) {
          ttype = this.shrinkBarImg;
          while (i1 < ttype.length) {
             object oobject1 = ttype[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(19, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.shrinkBarImgTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(20, this.shrinkBarImgTitle);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCLiveActivityPendant mergeFrom(CodedInputByteBufferNano p0){
       LiveStreamMessages$SCLiveActivityPendant tdisplayPict;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 8:
                this.type = p0.readUInt32();
                break;
              case 16:
                this.rank = p0.readUInt32();
                break;
              case 26:
                if (this.displayStyle == null) {
                   this.displayStyle = new LiveStreamMessages$LiveActivityPendantDisplayStyle();
                }
                p0.readMessage(this.displayStyle);
                break;
              case '"':
                this.frontStyle = p0.readString();
                break;
              case '*':
                this.clickUrl = p0.readString();
                break;
              case '2':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 50);
                tdisplayPict = this.displayPict;
                i2 = (tdisplayPict == null)? 0: tdisplayPict.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tdisplayPict, i1, picUrlArray, i1, i2);
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
                this.displayPict = picUrlArray;
                break;
              case ':':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 58);
                tdisplayPict = this.shrinkBarPic;
                i2 = (tdisplayPict == null)? 0: tdisplayPict.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tdisplayPict, i1, picUrlArray, i1, i2);
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
                this.shrinkBarPic = picUrlArray;
                break;
              case 'B':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 66);
                tdisplayPict = this.displayInfo;
                i2 = (tdisplayPict == null)? 0: tdisplayPict.length;
                i = i + i2;
                LiveStreamMessages$LiveActivityPendantDisplayInfo[] liveActivity = new LiveStreamMessages$LiveActivityPendantDisplayInfo[i];
                if (i2) {
                   System.arraycopy(tdisplayPict, i1, liveActivity, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveActivity[i2] = new LiveStreamMessages$LiveActivityPendantDisplayInfo();
                   p0.readMessage(liveActivity[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveActivity[i2] = new LiveStreamMessages$LiveActivityPendantDisplayInfo();
                p0.readMessage(liveActivity[i2]);
                this.displayInfo = liveActivity;
                break;
              case 'J':
                if (this.logInfo == null) {
                   this.logInfo = new LiveActiveInfo$KwaiActiveInfo();
                }
                p0.readMessage(this.logInfo);
                break;
              case 'R':
                this.styleType = p0.readString();
                break;
              case 'Z':
                this.shrinkBarBackgroundColor = p0.readString();
                break;
              case 'b':
                this.shrinkBarTitle = p0.readString();
                break;
              case 'j':
                this.logMessage = p0.readString();
                break;
              case 'r':
                this.pendantId = p0.readString();
                break;
              case 'x':
                this.pendantPriority = p0.readUInt32();
                break;
              case 128:
                this.ignoreAbTest = p0.readBool();
                break;
              case 136:
                this.ignorePendant = p0.readBool();
                break;
              case 144:
                this.largePendant = p0.readBool();
                break;
              case 154:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 154);
                tdisplayPict = this.shrinkBarImg;
                i2 = (tdisplayPict == null)? 0: tdisplayPict.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tdisplayPict, i1, picUrlArray, i1, i2);
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
                this.shrinkBarImg = picUrlArray;
                break;
              case 162:
                this.shrinkBarImgTitle = p0.readString();
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
       LiveStreamMessages$SCLiveActivityPendant tdisplayPict;
       object oobject;
       LiveStreamMessages$SCLiveActivityPendant ttype = this.type;
       if (ttype != null) {
          p0.writeUInt32(1, ttype);
       }
       ttype = this.rank;
       if (ttype != null) {
          p0.writeUInt32(2, ttype);
       }
       ttype = this.displayStyle;
       if (ttype != null) {
          p0.writeMessage(3, ttype);
       }
       String str = "";
       if (!(this.frontStyle).equals(str)) {
          p0.writeString(4, this.frontStyle);
       }
       if (!(this.clickUrl).equals(str)) {
          p0.writeString(5, this.clickUrl);
       }
       ttype = this.displayPict;
       int i = 0;
       if (ttype != null && ttype.length > 0) {
          i1 = 0;
          tdisplayPict = this.displayPict;
          while (i1 < tdisplayPict.length) {
             oobject = tdisplayPict[i1];
             if (oobject != null) {
                p0.writeMessage(6, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ttype = this.shrinkBarPic;
       if (ttype != null && ttype.length > 0) {
          i1 = 0;
          tdisplayPict = this.shrinkBarPic;
          while (i1 < tdisplayPict.length) {
             oobject = tdisplayPict[i1];
             if (oobject != null) {
                p0.writeMessage(7, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ttype = this.displayInfo;
       if (ttype != null && ttype.length > 0) {
          i1 = 0;
          tdisplayPict = this.displayInfo;
          while (i1 < tdisplayPict.length) {
             oobject = tdisplayPict[i1];
             if (oobject != null) {
                p0.writeMessage(8, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ttype = this.logInfo;
       if (ttype != null) {
          p0.writeMessage(9, ttype);
       }
       if (!(this.styleType).equals(str)) {
          p0.writeString(10, this.styleType);
       }
       if (!(this.shrinkBarBackgroundColor).equals(str)) {
          p0.writeString(11, this.shrinkBarBackgroundColor);
       }
       if (!(this.shrinkBarTitle).equals(str)) {
          p0.writeString(12, this.shrinkBarTitle);
       }
       if (!(this.logMessage).equals(str)) {
          p0.writeString(13, this.logMessage);
       }
       if (!(this.pendantId).equals(str)) {
          p0.writeString(14, this.pendantId);
       }
       ttype = this.pendantPriority;
       if (ttype != null) {
          p0.writeUInt32(15, ttype);
       }
       ttype = this.ignoreAbTest;
       if (ttype != null) {
          p0.writeBool(16, ttype);
       }
       ttype = this.ignorePendant;
       if (ttype != null) {
          p0.writeBool(17, ttype);
       }
       ttype = this.largePendant;
       if (ttype != null) {
          p0.writeBool(18, ttype);
       }
       ttype = this.shrinkBarImg;
       if (ttype != null && ttype.length > 0) {
          ttype = this.shrinkBarImg;
          while (i < ttype.length) {
             object oobject1 = ttype[i];
             if (oobject1 != null) {
                p0.writeMessage(19, oobject1);
             }
             i = i + 1;
          }
       }
       if (!(this.shrinkBarImgTitle).equals(str)) {
          p0.writeString(20, this.shrinkBarImgTitle);
       }
       super.writeTo(p0);
       return;
    }
}
