package com.kuaishou.protobuf.livestream.nano.SCLiveJobPendant;
import com.google.protobuf.nano.KwaiExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.lang.System;

public final class SCLiveJobPendant extends KwaiExtendableMessageNano	// class@000d54
{
    public long activityId;
    public long autoEndTime;
    public String[] barBackgroundColors;
    public long barCountdownTime;
    public String barText;
    public String barTextColor;
    public int barType;
    public String clickUrl;
    public UserInfos$PicUrl[] icon;
    public UserInfos$PicUrl[] iconV2;
    public boolean isClose;
    public int status;
    public static SCLiveJobPendant[] _emptyArray;

    public void SCLiveJobPendant(){
       super();
       this.clear();
    }
    public static SCLiveJobPendant[] emptyArray(){
       if (SCLiveJobPendant._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveJobPendant._emptyArray == null) {
             SCLiveJobPendant[] sCLiveJobPen = new SCLiveJobPendant[0];
             SCLiveJobPendant._emptyArray = sCLiveJobPen;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveJobPendant._emptyArray;
    }
    public static SCLiveJobPendant parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveJobPendant().mergeFrom(p0);
    }
    public static SCLiveJobPendant parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveJobPendant(), p0);
    }
    public SCLiveJobPendant clear(){
       this.unknownFieldData = null;
       this.icon = UserInfos$PicUrl.emptyArray();
       this.clickUrl = "";
       this.barBackgroundColors = WireFormatNano.EMPTY_STRING_ARRAY;
       this.barType = 0;
       this.barText = "";
       this.barCountdownTime = 0;
       this.barTextColor = "";
       this.autoEndTime = 0;
       this.isClose = false;
       this.status = 0;
       this.activityId = 0;
       this.iconV2 = UserInfos$PicUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i3;
       int i = super.computeSerializedSize();
       SCLiveJobPendant ticon = this.icon;
       int i1 = 0;
       int i2 = 1;
       if (ticon != null && ticon.length > 0) {
          i3 = 0;
          SCLiveJobPendant ticon1 = this.icon;
          while (i3 < ticon1.length) {
             object oobject = ticon1[i3];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(i2, oobject);
             }
             i3 = i3 + 1;
          }
       }
       if (!(this.clickUrl).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.clickUrl);
       }
       ticon = this.barBackgroundColors;
       if (ticon != null && ticon.length > 0) {
          i3 = 0;
          int i4 = 0;
          int i5 = 0;
          SCLiveJobPendant tbarBackgrou = this.barBackgroundColors;
          while (i3 < tbarBackgrou.length) {
             object oobject1 = tbarBackgrou[i3];
             if (oobject1 != null) {
                i5 = i5 + 1;
                i4 = i4 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject1);
             }
             i3 = i3 + 1;
          }
          i = (i + i4) + (i5 * 1);
       }
       ticon = this.barType;
       if (ticon != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, ticon);
       }
       if (!(this.barText).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.barText);
       }
       SCLiveJobPendant tbarCountdow = this.barCountdownTime;
       if (tbarCountdow) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tbarCountdow);
       }
       if (!(this.barTextColor).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.barTextColor);
       }
       SCLiveJobPendant tautoEndTime = this.autoEndTime;
       if (tautoEndTime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tautoEndTime);
       }
       ticon = this.isClose;
       if (ticon != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(9, ticon);
       }
       ticon = this.status;
       if (ticon != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(10, ticon);
       }
       tautoEndTime = this.activityId;
       if (tautoEndTime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(11, tautoEndTime);
       }
       ticon = this.iconV2;
       if (ticon != null && ticon.length > 0) {
          ticon = this.iconV2;
          while (i1 < ticon.length) {
             object oobject2 = ticon[i1];
             if (oobject2 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(12, oobject2);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveJobPendant mergeFrom(CodedInputByteBufferNano p0){
       SCLiveJobPendant ticon;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 10:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 10);
                ticon = this.icon;
                i2 = (ticon == null)? 0: ticon.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(ticon, i1, picUrlArray, i1, i2);
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
                this.icon = picUrlArray;
                break;
              case 18:
                this.clickUrl = p0.readString();
                break;
              case 26:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 26);
                ticon = this.barBackgroundColors;
                i2 = (ticon == null)? 0: ticon.length;
                i = i + i2;
                String[] stringArray = new String[i];
                if (i2) {
                   System.arraycopy(ticon, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.barBackgroundColors = stringArray;
                break;
              case 32:
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.barType = i;
                }
                break;
              case '*':
                this.barText = p0.readString();
                break;
              case '0':
                this.barCountdownTime = p0.readUInt64();
                break;
              case ':':
                this.barTextColor = p0.readString();
                break;
              case '@':
                this.autoEndTime = p0.readUInt64();
                break;
              case 'H':
                this.isClose = p0.readBool();
                break;
              case 'P':
                this.status = p0.readUInt32();
                break;
              case 'X':
                this.activityId = p0.readUInt64();
                break;
              case 'b':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 98);
                ticon = this.iconV2;
                i2 = (ticon == null)? 0: ticon.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(ticon, i1, picUrlArray, i1, i2);
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
                this.iconV2 = picUrlArray;
                break;
              default:
                if (!this.storeUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       int i1;
       SCLiveJobPendant ticon1;
       SCLiveJobPendant tbarBackgrou;
       SCLiveJobPendant ticon = this.icon;
       int i = 0;
       if (ticon != null && ticon.length > 0) {
          i1 = 0;
          ticon1 = this.icon;
          while (i1 < ticon1.length) {
             object oobject = ticon1[i1];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       String str = "";
       if (!(this.clickUrl).equals(str)) {
          p0.writeString(2, this.clickUrl);
       }
       ticon = this.barBackgroundColors;
       if (ticon != null && ticon.length > 0) {
          i1 = 0;
          tbarBackgrou = this.barBackgroundColors;
          while (i1 < tbarBackgrou.length) {
             object oobject1 = tbarBackgrou[i1];
             if (oobject1 != null) {
                p0.writeString(3, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       ticon = this.barType;
       if (ticon != null) {
          p0.writeInt32(4, ticon);
       }
       if (!(this.barText).equals(str)) {
          p0.writeString(5, this.barText);
       }
       tbarBackgrou = this.barCountdownTime;
       if (tbarBackgrou) {
          p0.writeUInt64(6, tbarBackgrou);
       }
       if (!(this.barTextColor).equals(str)) {
          p0.writeString(7, this.barTextColor);
       }
       ticon1 = this.autoEndTime;
       if (ticon1) {
          p0.writeUInt64(8, ticon1);
       }
       ticon = this.isClose;
       if (ticon != null) {
          p0.writeBool(9, ticon);
       }
       ticon = this.status;
       if (ticon != null) {
          p0.writeUInt32(10, ticon);
       }
       ticon1 = this.activityId;
       if (ticon1) {
          p0.writeUInt64(11, ticon1);
       }
       ticon = this.iconV2;
       if (ticon != null && ticon.length > 0) {
          ticon = this.iconV2;
          while (i < ticon.length) {
             object oobject2 = ticon[i];
             if (oobject2 != null) {
                p0.writeMessage(12, oobject2);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
