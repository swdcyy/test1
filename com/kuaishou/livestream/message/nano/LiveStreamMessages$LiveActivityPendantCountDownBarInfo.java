package com.kuaishou.livestream.message.nano.LiveStreamMessages$LiveActivityPendantCountDownBarInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.String;
import java.lang.Object;
import java.lang.System;

public final class LiveStreamMessages$LiveActivityPendantCountDownBarInfo extends MessageNano	// class@0012e6
{
    public String[] countDownBackgroundColor;
    public String[] countDownBarColor;
    public int countDownBarHeight;
    public long countDownEndTime;
    public long countDownStartTime;
    public String[] countDownTextColor;
    public String descriptionText;
    public String[] descriptionTextColor;
    public UserInfos$PicUrl[] iconUrl;
    public boolean showTimeTextOnBar;
    public static LiveStreamMessages$LiveActivityPendantCountDownBarInfo[] _emptyArray;

    public void LiveStreamMessages$LiveActivityPendantCountDownBarInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$LiveActivityPendantCountDownBarInfo[] emptyArray(){
       if (LiveStreamMessages$LiveActivityPendantCountDownBarInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$LiveActivityPendantCountDownBarInfo._emptyArray == null) {
             LiveStreamMessages$LiveActivityPendantCountDownBarInfo[] liveActivity = new LiveStreamMessages$LiveActivityPendantCountDownBarInfo[0];
             LiveStreamMessages$LiveActivityPendantCountDownBarInfo._emptyArray = liveActivity;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$LiveActivityPendantCountDownBarInfo._emptyArray;
    }
    public static LiveStreamMessages$LiveActivityPendantCountDownBarInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$LiveActivityPendantCountDownBarInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$LiveActivityPendantCountDownBarInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$LiveActivityPendantCountDownBarInfo(), p0);
    }
    public LiveStreamMessages$LiveActivityPendantCountDownBarInfo clear(){
       this.countDownStartTime = 0;
       this.countDownEndTime = 0;
       String[] eMPTY_STRING = WireFormatNano.EMPTY_STRING_ARRAY;
       this.countDownBarColor = eMPTY_STRING;
       this.countDownBackgroundColor = eMPTY_STRING;
       this.countDownBarHeight = 0;
       this.iconUrl = UserInfos$PicUrl.emptyArray();
       this.descriptionText = "";
       this.descriptionTextColor = eMPTY_STRING;
       this.countDownTextColor = eMPTY_STRING;
       this.showTimeTextOnBar = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       int i3;
       int i4;
       LiveStreamMessages$LiveActivityPendantCountDownBarInfo tcountDownBa;
       object oobject;
       int i = super.computeSerializedSize();
       LiveStreamMessages$LiveActivityPendantCountDownBarInfo tcountDownSt = this.countDownStartTime;
       LiveStreamMessages$LiveActivityPendantCountDownBarInfo liveActivity = null;
       if (tcountDownSt - liveActivity) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tcountDownSt);
       }
       tcountDownSt = this.countDownEndTime;
       if (tcountDownSt - liveActivity) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tcountDownSt);
       }
       tcountDownSt = this.countDownBarColor;
       int i1 = 0;
       if (tcountDownSt != null && tcountDownSt.length > 0) {
          i2 = 0;
          i3 = 0;
          i4 = 0;
          tcountDownBa = this.countDownBarColor;
          while (i2 < tcountDownBa.length) {
             oobject = tcountDownBa[i2];
             if (oobject != null) {
                i4 = i4 + 1;
                i3 = i3 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i2 = i2 + 1;
          }
          i = (i + i3) + (i4 * 1);
       }
       tcountDownSt = this.countDownBackgroundColor;
       if (tcountDownSt != null && tcountDownSt.length > 0) {
          i2 = 0;
          i3 = 0;
          i4 = 0;
          tcountDownBa = this.countDownBackgroundColor;
          while (i2 < tcountDownBa.length) {
             oobject = tcountDownBa[i2];
             if (oobject != null) {
                i4 = i4 + 1;
                i3 = i3 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i2 = i2 + 1;
          }
          i = (i + i3) + (i4 * 1);
       }
       tcountDownSt = this.countDownBarHeight;
       if (tcountDownSt != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tcountDownSt);
       }
       tcountDownSt = this.iconUrl;
       if (tcountDownSt != null && tcountDownSt.length > 0) {
          i2 = 0;
          liveActivity = this.iconUrl;
          while (i2 < liveActivity.length) {
             object oobject1 = liveActivity[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(6, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       if (!(this.descriptionText).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.descriptionText);
       }
       tcountDownSt = this.descriptionTextColor;
       if (tcountDownSt != null && tcountDownSt.length > 0) {
          i2 = 0;
          i3 = 0;
          i4 = 0;
          tcountDownBa = this.descriptionTextColor;
          while (i2 < tcountDownBa.length) {
             oobject = tcountDownBa[i2];
             if (oobject != null) {
                i4 = i4 + 1;
                i3 = i3 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i2 = i2 + 1;
          }
          i = (i + i3) + (i4 * 1);
       }
       tcountDownSt = this.countDownTextColor;
       if (tcountDownSt != null && tcountDownSt.length > 0) {
          i2 = 0;
          i3 = 0;
          LiveStreamMessages$LiveActivityPendantCountDownBarInfo tcountDownTe = this.countDownTextColor;
          while (i1 < tcountDownTe.length) {
             object oobject2 = tcountDownTe[i1];
             if (oobject2 != null) {
                i3 = i3 + 1;
                i2 = i2 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject2);
             }
             i1 = i1 + 1;
          }
          i = (i + i2) + (i3 * 1);
       }
       tcountDownSt = this.showTimeTextOnBar;
       if (tcountDownSt != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(10, tcountDownSt);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$LiveActivityPendantCountDownBarInfo mergeFrom(CodedInputByteBufferNano p0){
       LiveStreamMessages$LiveActivityPendantCountDownBarInfo tcountDownBa;
       int i2;
       String[] stringArray;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 8:
                this.countDownStartTime = p0.readUInt64();
                break;
              case 16:
                this.countDownEndTime = p0.readUInt64();
                break;
              case 26:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 26);
                tcountDownBa = this.countDownBarColor;
                i2 = (tcountDownBa == null)? 0: tcountDownBa.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tcountDownBa, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.countDownBarColor = stringArray;
                break;
              case '"':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 34);
                tcountDownBa = this.countDownBackgroundColor;
                i2 = (tcountDownBa == null)? 0: tcountDownBa.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tcountDownBa, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.countDownBackgroundColor = stringArray;
                break;
              case '(':
                this.countDownBarHeight = p0.readUInt32();
                break;
              case '2':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 50);
                tcountDownBa = this.iconUrl;
                i2 = (tcountDownBa == null)? 0: tcountDownBa.length;
                i = i + i2;
                UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tcountDownBa, i1, picUrlArray, i1, i2);
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
                this.iconUrl = picUrlArray;
                break;
              case ':':
                this.descriptionText = p0.readString();
                break;
              case 'B':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 66);
                tcountDownBa = this.descriptionTextColor;
                i2 = (tcountDownBa == null)? 0: tcountDownBa.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tcountDownBa, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.descriptionTextColor = stringArray;
                break;
              case 'J':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 74);
                tcountDownBa = this.countDownTextColor;
                i2 = (tcountDownBa == null)? 0: tcountDownBa.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tcountDownBa, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.countDownTextColor = stringArray;
                break;
              case 'P':
                this.showTimeTextOnBar = p0.readBool();
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
       LiveStreamMessages$LiveActivityPendantCountDownBarInfo tcountDownSt = this.countDownStartTime;
       LiveStreamMessages$LiveActivityPendantCountDownBarInfo liveActivity = null;
       if (tcountDownSt - liveActivity) {
          p0.writeUInt64(1, tcountDownSt);
       }
       tcountDownSt = this.countDownEndTime;
       if (tcountDownSt - liveActivity) {
          p0.writeUInt64(2, tcountDownSt);
       }
       tcountDownSt = this.countDownBarColor;
       int i = 0;
       if (tcountDownSt != null && tcountDownSt.length > 0) {
          i1 = 0;
          liveActivity = this.countDownBarColor;
          while (i1 < liveActivity.length) {
             oobject = liveActivity[i1];
             if (oobject != null) {
                p0.writeString(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tcountDownSt = this.countDownBackgroundColor;
       if (tcountDownSt != null && tcountDownSt.length > 0) {
          i1 = 0;
          liveActivity = this.countDownBackgroundColor;
          while (i1 < liveActivity.length) {
             oobject = liveActivity[i1];
             if (oobject != null) {
                p0.writeString(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tcountDownSt = this.countDownBarHeight;
       if (tcountDownSt != null) {
          p0.writeUInt32(5, tcountDownSt);
       }
       tcountDownSt = this.iconUrl;
       if (tcountDownSt != null && tcountDownSt.length > 0) {
          i1 = 0;
          liveActivity = this.iconUrl;
          while (i1 < liveActivity.length) {
             oobject = liveActivity[i1];
             if (oobject != null) {
                p0.writeMessage(6, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.descriptionText).equals("")) {
          p0.writeString(7, this.descriptionText);
       }
       tcountDownSt = this.descriptionTextColor;
       if (tcountDownSt != null && tcountDownSt.length > 0) {
          i1 = 0;
          liveActivity = this.descriptionTextColor;
          while (i1 < liveActivity.length) {
             oobject = liveActivity[i1];
             if (oobject != null) {
                p0.writeString(8, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tcountDownSt = this.countDownTextColor;
       if (tcountDownSt != null && tcountDownSt.length > 0) {
          tcountDownSt = this.countDownTextColor;
          while (i < tcountDownSt.length) {
             object oobject1 = tcountDownSt[i];
             if (oobject1 != null) {
                p0.writeString(9, oobject1);
             }
             i = i + 1;
          }
       }
       tcountDownSt = this.showTimeTextOnBar;
       if (tcountDownSt != null) {
          p0.writeBool(10, tcountDownSt);
       }
       super.writeTo(p0);
       return;
    }
}
