package com.kuaishou.livestream.message.nano.LiveStreamMessages$LiveActivityPendantDisplayKv;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.lang.System;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$LiveActivityPendantFriendGroupInfo;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$LiveActivityPendantCountDownBarInfo;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$LiveActivityPendantBattleInfo;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamMessages$LiveActivityPendantDisplayKv extends MessageNano	// class@0012ea
{
    public LiveStreamMessages$LiveActivityPendantBattleInfo battleInfo;
    public LiveStreamMessages$LiveActivityPendantCountDownBarInfo countDownBarInfo;
    public boolean dinFont;
    public UserInfos$PicUrl[] displayPict;
    public int displayStyle;
    public LiveStreamMessages$LiveActivityPendantFriendGroupInfo friendGroupInfo;
    public String frontStyle;
    public String[] gradientColor;
    public long time;
    public UserInfos$UserInfo user;
    public String value;
    public static LiveStreamMessages$LiveActivityPendantDisplayKv[] _emptyArray;

    public void LiveStreamMessages$LiveActivityPendantDisplayKv(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$LiveActivityPendantDisplayKv[] emptyArray(){
       if (LiveStreamMessages$LiveActivityPendantDisplayKv._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$LiveActivityPendantDisplayKv._emptyArray == null) {
             LiveStreamMessages$LiveActivityPendantDisplayKv[] liveActivity = new LiveStreamMessages$LiveActivityPendantDisplayKv[0];
             LiveStreamMessages$LiveActivityPendantDisplayKv._emptyArray = liveActivity;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$LiveActivityPendantDisplayKv._emptyArray;
    }
    public static LiveStreamMessages$LiveActivityPendantDisplayKv parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$LiveActivityPendantDisplayKv().mergeFrom(p0);
    }
    public static LiveStreamMessages$LiveActivityPendantDisplayKv parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$LiveActivityPendantDisplayKv(), p0);
    }
    public LiveStreamMessages$LiveActivityPendantDisplayKv clear(){
       this.displayStyle = 0;
       this.frontStyle = "";
       this.value = "";
       this.user = null;
       this.displayPict = UserInfos$PicUrl.emptyArray();
       this.time = 0;
       this.battleInfo = null;
       this.countDownBarInfo = null;
       this.friendGroupInfo = null;
       this.dinFont = false;
       this.gradientColor = WireFormatNano.EMPTY_STRING_ARRAY;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       LiveStreamMessages$LiveActivityPendantDisplayKv tdisplayPict;
       int i = super.computeSerializedSize();
       LiveStreamMessages$LiveActivityPendantDisplayKv tdisplayStyl = this.displayStyle;
       if (tdisplayStyl != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tdisplayStyl);
       }
       String str = "";
       if (!(this.frontStyle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.frontStyle);
       }
       if (!(this.value).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.value);
       }
       tdisplayStyl = this.user;
       if (tdisplayStyl != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tdisplayStyl);
       }
       tdisplayStyl = this.displayPict;
       int i1 = 0;
       if (tdisplayStyl != null && tdisplayStyl.length > 0) {
          i2 = 0;
          tdisplayPict = this.displayPict;
          while (i2 < tdisplayPict.length) {
             object oobject = tdisplayPict[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tdisplayPict = this.time;
       if (tdisplayPict) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tdisplayPict);
       }
       tdisplayStyl = this.battleInfo;
       if (tdisplayStyl != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, tdisplayStyl);
       }
       tdisplayStyl = this.countDownBarInfo;
       if (tdisplayStyl != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, tdisplayStyl);
       }
       tdisplayStyl = this.friendGroupInfo;
       if (tdisplayStyl != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, tdisplayStyl);
       }
       tdisplayStyl = this.dinFont;
       if (tdisplayStyl != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(10, tdisplayStyl);
       }
       tdisplayStyl = this.gradientColor;
       if (tdisplayStyl != null && tdisplayStyl.length > 0) {
          i2 = 0;
          int i3 = 0;
          LiveStreamMessages$LiveActivityPendantDisplayKv tgradientCol = this.gradientColor;
          while (i1 < tgradientCol.length) {
             object oobject1 = tgradientCol[i1];
             if (oobject1 != null) {
                i3 = i3 + 1;
                i2 = i2 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject1);
             }
             i1 = i1 + 1;
          }
          i = (i + i2) + (i3 * 1);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$LiveActivityPendantDisplayKv mergeFrom(CodedInputByteBufferNano p0){
       LiveStreamMessages$LiveActivityPendantDisplayKv tdisplayPict;
       int i2;
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
                    case 1:
                      break;
                    default:
                }
                this.displayStyle = i;
                break;
              case 18:
                this.frontStyle = p0.readString();
                break;
              case 26:
                this.value = p0.readString();
                break;
              case '"':
                if (this.user == null) {
                   this.user = new UserInfos$UserInfo();
                }
                p0.readMessage(this.user);
                break;
              case '*':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 42);
                tdisplayPict = this.displayPict;
                i2 = (tdisplayPict == null)? 0: tdisplayPict.length;
                i = i + i2;
                UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
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
              case '0':
                this.time = p0.readUInt64();
                break;
              case ':':
                if (this.battleInfo == null) {
                   this.battleInfo = new LiveStreamMessages$LiveActivityPendantBattleInfo();
                }
                p0.readMessage(this.battleInfo);
                break;
              case 'B':
                if (this.countDownBarInfo == null) {
                   this.countDownBarInfo = new LiveStreamMessages$LiveActivityPendantCountDownBarInfo();
                }
                p0.readMessage(this.countDownBarInfo);
                break;
              case 'J':
                if (this.friendGroupInfo == null) {
                   this.friendGroupInfo = new LiveStreamMessages$LiveActivityPendantFriendGroupInfo();
                }
                p0.readMessage(this.friendGroupInfo);
                break;
              case 'P':
                this.dinFont = p0.readBool();
                break;
              case 'Z':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 90);
                tdisplayPict = this.gradientColor;
                i2 = (tdisplayPict == null)? 0: tdisplayPict.length;
                i = i + i2;
                String[] stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tdisplayPict, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.gradientColor = stringArray;
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
       LiveStreamMessages$LiveActivityPendantDisplayKv tdisplayPict;
       LiveStreamMessages$LiveActivityPendantDisplayKv tdisplayStyl = this.displayStyle;
       if (tdisplayStyl != null) {
          p0.writeInt32(1, tdisplayStyl);
       }
       String str = "";
       if (!(this.frontStyle).equals(str)) {
          p0.writeString(2, this.frontStyle);
       }
       if (!(this.value).equals(str)) {
          p0.writeString(3, this.value);
       }
       tdisplayStyl = this.user;
       if (tdisplayStyl != null) {
          p0.writeMessage(4, tdisplayStyl);
       }
       tdisplayStyl = this.displayPict;
       int i = 0;
       if (tdisplayStyl != null && tdisplayStyl.length > 0) {
          int i1 = 0;
          tdisplayPict = this.displayPict;
          while (i1 < tdisplayPict.length) {
             object oobject = tdisplayPict[i1];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tdisplayPict = this.time;
       if (tdisplayPict) {
          p0.writeUInt64(6, tdisplayPict);
       }
       tdisplayStyl = this.battleInfo;
       if (tdisplayStyl != null) {
          p0.writeMessage(7, tdisplayStyl);
       }
       tdisplayStyl = this.countDownBarInfo;
       if (tdisplayStyl != null) {
          p0.writeMessage(8, tdisplayStyl);
       }
       tdisplayStyl = this.friendGroupInfo;
       if (tdisplayStyl != null) {
          p0.writeMessage(9, tdisplayStyl);
       }
       tdisplayStyl = this.dinFont;
       if (tdisplayStyl != null) {
          p0.writeBool(10, tdisplayStyl);
       }
       tdisplayStyl = this.gradientColor;
       if (tdisplayStyl != null && tdisplayStyl.length > 0) {
          tdisplayStyl = this.gradientColor;
          while (i < tdisplayStyl.length) {
             object oobject1 = tdisplayStyl[i];
             if (oobject1 != null) {
                p0.writeString(11, oobject1);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
