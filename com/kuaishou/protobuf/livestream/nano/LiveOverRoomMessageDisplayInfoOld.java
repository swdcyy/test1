package com.kuaishou.protobuf.livestream.nano.LiveOverRoomMessageDisplayInfoOld;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.lang.System;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveOverRoomMessageDisplayInfoOld extends MessageNano	// class@000cd1
{
    public int batchSize;
    public String broadcastInfo;
    public boolean containsRedPack;
    public boolean displayBanner;
    public boolean displayGif;
    public String exptag;
    public String fromLiveStreamId;
    public UserInfos$UserInfo fromUser;
    public int gifFramePerSencond;
    public String[] gifUrlNew;
    public int giftId;
    public String serverExpTag;
    public long slotDisplayDuration;
    public String titleV2;
    public UserInfos$UserInfo toUser;
    public String token;
    public boolean useStyleV2;
    public static LiveOverRoomMessageDisplayInfoOld[] _emptyArray;

    public void LiveOverRoomMessageDisplayInfoOld(){
       super();
       this.clear();
    }
    public static LiveOverRoomMessageDisplayInfoOld[] emptyArray(){
       if (LiveOverRoomMessageDisplayInfoOld._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveOverRoomMessageDisplayInfoOld._emptyArray == null) {
             LiveOverRoomMessageDisplayInfoOld[] liveOverRoom = new LiveOverRoomMessageDisplayInfoOld[0];
             LiveOverRoomMessageDisplayInfoOld._emptyArray = liveOverRoom;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveOverRoomMessageDisplayInfoOld._emptyArray;
    }
    public static LiveOverRoomMessageDisplayInfoOld parseFrom(CodedInputByteBufferNano p0){
       return new LiveOverRoomMessageDisplayInfoOld().mergeFrom(p0);
    }
    public static LiveOverRoomMessageDisplayInfoOld parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveOverRoomMessageDisplayInfoOld(), p0);
    }
    public LiveOverRoomMessageDisplayInfoOld clear(){
       this.fromUser = null;
       this.toUser = null;
       this.giftId = 0;
       this.batchSize = 0;
       this.fromLiveStreamId = "";
       this.slotDisplayDuration = 0;
       this.exptag = "";
       this.broadcastInfo = "";
       this.displayBanner = false;
       this.displayGif = false;
       this.gifUrlNew = WireFormatNano.EMPTY_STRING_ARRAY;
       this.useStyleV2 = false;
       this.titleV2 = "";
       this.token = "";
       this.containsRedPack = false;
       this.gifFramePerSencond = 0;
       this.serverExpTag = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveOverRoomMessageDisplayInfoOld tfromUser = this.fromUser;
       int i1 = 1;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, tfromUser);
       }
       tfromUser = this.toUser;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tfromUser);
       }
       tfromUser = this.giftId;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tfromUser);
       }
       tfromUser = this.batchSize;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tfromUser);
       }
       if (!(this.fromLiveStreamId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.fromLiveStreamId);
       }
       LiveOverRoomMessageDisplayInfoOld tslotDisplay = this.slotDisplayDuration;
       if (tslotDisplay - null) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tslotDisplay);
       }
       if (!(this.exptag).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.exptag);
       }
       if (!(this.broadcastInfo).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.broadcastInfo);
       }
       tfromUser = this.displayBanner;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(9, tfromUser);
       }
       tfromUser = this.displayGif;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(10, tfromUser);
       }
       tfromUser = this.gifUrlNew;
       if (tfromUser != null && tfromUser.length > 0) {
          int i2 = 0;
          int i3 = 0;
          int i4 = 0;
          LiveOverRoomMessageDisplayInfoOld tgifUrlNew = this.gifUrlNew;
          while (i2 < tgifUrlNew.length) {
             object oobject = tgifUrlNew[i2];
             if (oobject != null) {
                i4 = i4 + 1;
                i3 = i3 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i2 = i2 + 1;
          }
          i = (i + i3) + (i4 * 1);
       }
       tfromUser = this.useStyleV2;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(12, tfromUser);
       }
       if (!(this.titleV2).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.titleV2);
       }
       if (!(this.token).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.token);
       }
       tfromUser = this.containsRedPack;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(15, tfromUser);
       }
       tfromUser = this.gifFramePerSencond;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(16, tfromUser);
       }
       if (!(this.serverExpTag).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(17, this.serverExpTag);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveOverRoomMessageDisplayInfoOld mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                if (this.fromUser == null) {
                   this.fromUser = new UserInfos$UserInfo();
                }
                p0.readMessage(this.fromUser);
                break;
              case 18:
                if (this.toUser == null) {
                   this.toUser = new UserInfos$UserInfo();
                }
                p0.readMessage(this.toUser);
                break;
              case 24:
                this.giftId = p0.readUInt32();
                break;
              case 32:
                this.batchSize = p0.readUInt32();
                break;
              case '*':
                this.fromLiveStreamId = p0.readString();
                break;
              case '0':
                this.slotDisplayDuration = p0.readUInt64();
                break;
              case ':':
                this.exptag = p0.readString();
                break;
              case 'B':
                this.broadcastInfo = p0.readString();
                break;
              case 'H':
                this.displayBanner = p0.readBool();
                break;
              case 'P':
                this.displayGif = p0.readBool();
                break;
              case 'Z':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 90);
                LiveOverRoomMessageDisplayInfoOld tgifUrlNew = this.gifUrlNew;
                int i1 = (tgifUrlNew == null)? 0: tgifUrlNew.length;
                i = i + i1;
                String[] stringArray = new String[i];
                if (i1) {
                   System.arraycopy(tgifUrlNew, 0, stringArray, 0, i1);
                }
                int i2 = i - 1;
                while (i1 < i2) {
                   stringArray[i1] = p0.readString();
                   p0.readTag();
                   i1 = i1 + 1;
                }
                stringArray[i1] = p0.readString();
                this.gifUrlNew = stringArray;
                break;
              case '`':
                this.useStyleV2 = p0.readBool();
                break;
              case 'j':
                this.titleV2 = p0.readString();
                break;
              case 'r':
                this.token = p0.readString();
                break;
              case 'x':
                this.containsRedPack = p0.readBool();
                break;
              case 128:
                this.gifFramePerSencond = p0.readUInt32();
                break;
              case 138:
                this.serverExpTag = p0.readString();
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
       LiveOverRoomMessageDisplayInfoOld tfromUser = this.fromUser;
       if (tfromUser != null) {
          p0.writeMessage(1, tfromUser);
       }
       tfromUser = this.toUser;
       if (tfromUser != null) {
          p0.writeMessage(2, tfromUser);
       }
       tfromUser = this.giftId;
       if (tfromUser != null) {
          p0.writeUInt32(3, tfromUser);
       }
       tfromUser = this.batchSize;
       if (tfromUser != null) {
          p0.writeUInt32(4, tfromUser);
       }
       String str = "";
       if (!(this.fromLiveStreamId).equals(str)) {
          p0.writeString(5, this.fromLiveStreamId);
       }
       LiveOverRoomMessageDisplayInfoOld tslotDisplay = this.slotDisplayDuration;
       if (tslotDisplay) {
          p0.writeUInt64(6, tslotDisplay);
       }
       if (!(this.exptag).equals(str)) {
          p0.writeString(7, this.exptag);
       }
       if (!(this.broadcastInfo).equals(str)) {
          p0.writeString(8, this.broadcastInfo);
       }
       tfromUser = this.displayBanner;
       if (tfromUser != null) {
          p0.writeBool(9, tfromUser);
       }
       tfromUser = this.displayGif;
       if (tfromUser != null) {
          p0.writeBool(10, tfromUser);
       }
       tfromUser = this.gifUrlNew;
       if (tfromUser != null && tfromUser.length > 0) {
          int i = 0;
          tslotDisplay = this.gifUrlNew;
          while (i < tslotDisplay.length) {
             object oobject = tslotDisplay[i];
             if (oobject != null) {
                p0.writeString(11, oobject);
             }
             i = i + 1;
          }
       }
       tfromUser = this.useStyleV2;
       if (tfromUser != null) {
          p0.writeBool(12, tfromUser);
       }
       if (!(this.titleV2).equals(str)) {
          p0.writeString(13, this.titleV2);
       }
       if (!(this.token).equals(str)) {
          p0.writeString(14, this.token);
       }
       tfromUser = this.containsRedPack;
       if (tfromUser != null) {
          p0.writeBool(15, tfromUser);
       }
       tfromUser = this.gifFramePerSencond;
       if (tfromUser != null) {
          p0.writeUInt32(16, tfromUser);
       }
       if (!(this.serverExpTag).equals(str)) {
          p0.writeString(17, this.serverExpTag);
       }
       super.writeTo(p0);
       return;
    }
}
