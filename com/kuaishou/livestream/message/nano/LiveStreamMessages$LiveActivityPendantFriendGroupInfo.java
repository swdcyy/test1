package com.kuaishou.livestream.message.nano.LiveStreamMessages$LiveActivityPendantFriendGroupInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.lang.System;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamMessages$LiveActivityPendantFriendGroupInfo extends MessageNano	// class@0012ec
{
    public int displayType;
    public String firstLiveStreamId;
    public String firstRowValue;
    public String[] firstRowValueColor;
    public UserInfos$UserInfo firstUser;
    public String[] firstUserHeadFrameColor;
    public String firstUserJumpProfileUrl;
    public String firstUserJumpUrl;
    public String secondLiveStreamId;
    public String secondRowValue;
    public String[] secondRowValueColor;
    public UserInfos$UserInfo secondUser;
    public String[] secondUserHeadFrameColor;
    public String secondUserJumpProfileUrl;
    public String secondUserJumpUrl;
    public static LiveStreamMessages$LiveActivityPendantFriendGroupInfo[] _emptyArray;

    public void LiveStreamMessages$LiveActivityPendantFriendGroupInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$LiveActivityPendantFriendGroupInfo[] emptyArray(){
       if (LiveStreamMessages$LiveActivityPendantFriendGroupInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$LiveActivityPendantFriendGroupInfo._emptyArray == null) {
             LiveStreamMessages$LiveActivityPendantFriendGroupInfo[] liveActivity = new LiveStreamMessages$LiveActivityPendantFriendGroupInfo[0];
             LiveStreamMessages$LiveActivityPendantFriendGroupInfo._emptyArray = liveActivity;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$LiveActivityPendantFriendGroupInfo._emptyArray;
    }
    public static LiveStreamMessages$LiveActivityPendantFriendGroupInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$LiveActivityPendantFriendGroupInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$LiveActivityPendantFriendGroupInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$LiveActivityPendantFriendGroupInfo(), p0);
    }
    public LiveStreamMessages$LiveActivityPendantFriendGroupInfo clear(){
       this.firstUser = null;
       this.secondUser = null;
       this.displayType = 0;
       this.firstRowValue = "";
       this.secondRowValue = "";
       String[] eMPTY_STRING = WireFormatNano.EMPTY_STRING_ARRAY;
       this.firstRowValueColor = eMPTY_STRING;
       this.secondRowValueColor = eMPTY_STRING;
       this.firstUserHeadFrameColor = eMPTY_STRING;
       this.secondUserHeadFrameColor = eMPTY_STRING;
       this.firstUserJumpUrl = "";
       this.secondUserJumpUrl = "";
       this.firstUserJumpProfileUrl = "";
       this.secondUserJumpProfileUrl = "";
       this.firstLiveStreamId = "";
       this.secondLiveStreamId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i3;
       int i4;
       int i5;
       LiveStreamMessages$LiveActivityPendantFriendGroupInfo tfirstRowVal;
       object oobject;
       int i = super.computeSerializedSize();
       LiveStreamMessages$LiveActivityPendantFriendGroupInfo tfirstUser = this.firstUser;
       int i1 = 1;
       if (tfirstUser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, tfirstUser);
       }
       tfirstUser = this.secondUser;
       if (tfirstUser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tfirstUser);
       }
       tfirstUser = this.displayType;
       if (tfirstUser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tfirstUser);
       }
       if (!(this.firstRowValue).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.firstRowValue);
       }
       if (!(this.secondRowValue).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.secondRowValue);
       }
       tfirstUser = this.firstRowValueColor;
       int i2 = 0;
       if (tfirstUser != null && tfirstUser.length > 0) {
          i3 = 0;
          i4 = 0;
          i5 = 0;
          tfirstRowVal = this.firstRowValueColor;
          while (i3 < tfirstRowVal.length) {
             oobject = tfirstRowVal[i3];
             if (oobject != null) {
                i5 = i5 + 1;
                i4 = i4 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i3 = i3 + 1;
          }
          i = (i + i4) + (i5 * 1);
       }
       tfirstUser = this.secondRowValueColor;
       if (tfirstUser != null && tfirstUser.length > 0) {
          i3 = 0;
          i4 = 0;
          i5 = 0;
          tfirstRowVal = this.secondRowValueColor;
          while (i3 < tfirstRowVal.length) {
             oobject = tfirstRowVal[i3];
             if (oobject != null) {
                i5 = i5 + 1;
                i4 = i4 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i3 = i3 + 1;
          }
          i = (i + i4) + (i5 * 1);
       }
       tfirstUser = this.firstUserHeadFrameColor;
       if (tfirstUser != null && tfirstUser.length > 0) {
          i3 = 0;
          i4 = 0;
          i5 = 0;
          tfirstRowVal = this.firstUserHeadFrameColor;
          while (i3 < tfirstRowVal.length) {
             oobject = tfirstRowVal[i3];
             if (oobject != null) {
                i5 = i5 + 1;
                i4 = i4 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i3 = i3 + 1;
          }
          i = (i + i4) + (i5 * 1);
       }
       tfirstUser = this.secondUserHeadFrameColor;
       if (tfirstUser != null && tfirstUser.length > 0) {
          i3 = 0;
          i4 = 0;
          LiveStreamMessages$LiveActivityPendantFriendGroupInfo tsecondUserH = this.secondUserHeadFrameColor;
          while (i2 < tsecondUserH.length) {
             object oobject1 = tsecondUserH[i2];
             if (oobject1 != null) {
                i4 = i4 + 1;
                i3 = i3 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject1);
             }
             i2 = i2 + 1;
          }
          i = (i + i3) + (i4 * 1);
       }
       if (!(this.firstUserJumpUrl).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.firstUserJumpUrl);
       }
       if (!(this.secondUserJumpUrl).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.secondUserJumpUrl);
       }
       if (!(this.firstUserJumpProfileUrl).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.firstUserJumpProfileUrl);
       }
       if (!(this.secondUserJumpProfileUrl).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.secondUserJumpProfileUrl);
       }
       if (!(this.firstLiveStreamId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.firstLiveStreamId);
       }
       if (!(this.secondLiveStreamId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(15, this.secondLiveStreamId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$LiveActivityPendantFriendGroupInfo mergeFrom(CodedInputByteBufferNano p0){
       LiveStreamMessages$LiveActivityPendantFriendGroupInfo tfirstRowVal;
       int i2;
       String[] stringArray;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 10:
                if (this.firstUser == null) {
                   this.firstUser = new UserInfos$UserInfo();
                }
                p0.readMessage(this.firstUser);
                break;
              case 18:
                if (this.secondUser == null) {
                   this.secondUser = new UserInfos$UserInfo();
                }
                p0.readMessage(this.secondUser);
                break;
              case 24:
                this.displayType = p0.readUInt32();
                break;
              case '"':
                this.firstRowValue = p0.readString();
                break;
              case '*':
                this.secondRowValue = p0.readString();
                break;
              case '2':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 50);
                tfirstRowVal = this.firstRowValueColor;
                i2 = (tfirstRowVal == null)? 0: tfirstRowVal.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tfirstRowVal, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.firstRowValueColor = stringArray;
                break;
              case ':':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 58);
                tfirstRowVal = this.secondRowValueColor;
                i2 = (tfirstRowVal == null)? 0: tfirstRowVal.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tfirstRowVal, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.secondRowValueColor = stringArray;
                break;
              case 'B':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 66);
                tfirstRowVal = this.firstUserHeadFrameColor;
                i2 = (tfirstRowVal == null)? 0: tfirstRowVal.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tfirstRowVal, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.firstUserHeadFrameColor = stringArray;
                break;
              case 'J':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 74);
                tfirstRowVal = this.secondUserHeadFrameColor;
                i2 = (tfirstRowVal == null)? 0: tfirstRowVal.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tfirstRowVal, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.secondUserHeadFrameColor = stringArray;
                break;
              case 'R':
                this.firstUserJumpUrl = p0.readString();
                break;
              case 'Z':
                this.secondUserJumpUrl = p0.readString();
                break;
              case 'b':
                this.firstUserJumpProfileUrl = p0.readString();
                break;
              case 'j':
                this.secondUserJumpProfileUrl = p0.readString();
                break;
              case 'r':
                this.firstLiveStreamId = p0.readString();
                break;
              case 'z':
                this.secondLiveStreamId = p0.readString();
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
       LiveStreamMessages$LiveActivityPendantFriendGroupInfo tfirstRowVal;
       object oobject;
       LiveStreamMessages$LiveActivityPendantFriendGroupInfo tfirstUser = this.firstUser;
       if (tfirstUser != null) {
          p0.writeMessage(1, tfirstUser);
       }
       tfirstUser = this.secondUser;
       if (tfirstUser != null) {
          p0.writeMessage(2, tfirstUser);
       }
       tfirstUser = this.displayType;
       if (tfirstUser != null) {
          p0.writeUInt32(3, tfirstUser);
       }
       String str = "";
       if (!(this.firstRowValue).equals(str)) {
          p0.writeString(4, this.firstRowValue);
       }
       if (!(this.secondRowValue).equals(str)) {
          p0.writeString(5, this.secondRowValue);
       }
       tfirstUser = this.firstRowValueColor;
       int i = 0;
       if (tfirstUser != null && tfirstUser.length > 0) {
          i1 = 0;
          tfirstRowVal = this.firstRowValueColor;
          while (i1 < tfirstRowVal.length) {
             oobject = tfirstRowVal[i1];
             if (oobject != null) {
                p0.writeString(6, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tfirstUser = this.secondRowValueColor;
       if (tfirstUser != null && tfirstUser.length > 0) {
          i1 = 0;
          tfirstRowVal = this.secondRowValueColor;
          while (i1 < tfirstRowVal.length) {
             oobject = tfirstRowVal[i1];
             if (oobject != null) {
                p0.writeString(7, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tfirstUser = this.firstUserHeadFrameColor;
       if (tfirstUser != null && tfirstUser.length > 0) {
          i1 = 0;
          tfirstRowVal = this.firstUserHeadFrameColor;
          while (i1 < tfirstRowVal.length) {
             oobject = tfirstRowVal[i1];
             if (oobject != null) {
                p0.writeString(8, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tfirstUser = this.secondUserHeadFrameColor;
       if (tfirstUser != null && tfirstUser.length > 0) {
          tfirstUser = this.secondUserHeadFrameColor;
          while (i < tfirstUser.length) {
             object oobject1 = tfirstUser[i];
             if (oobject1 != null) {
                p0.writeString(9, oobject1);
             }
             i = i + 1;
          }
       }
       if (!(this.firstUserJumpUrl).equals(str)) {
          p0.writeString(10, this.firstUserJumpUrl);
       }
       if (!(this.secondUserJumpUrl).equals(str)) {
          p0.writeString(11, this.secondUserJumpUrl);
       }
       if (!(this.firstUserJumpProfileUrl).equals(str)) {
          p0.writeString(12, this.firstUserJumpProfileUrl);
       }
       if (!(this.secondUserJumpProfileUrl).equals(str)) {
          p0.writeString(13, this.secondUserJumpProfileUrl);
       }
       if (!(this.firstLiveStreamId).equals(str)) {
          p0.writeString(14, this.firstLiveStreamId);
       }
       if (!(this.secondLiveStreamId).equals(str)) {
          p0.writeString(15, this.secondLiveStreamId);
       }
       super.writeTo(p0);
       return;
    }
}
