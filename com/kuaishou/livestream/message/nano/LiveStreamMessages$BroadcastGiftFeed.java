package com.kuaishou.livestream.message.nano.LiveStreamMessages$BroadcastGiftFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.System;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamMessages$BroadcastGiftFeed extends MessageNano	// class@0012be
{
    public long animationDisplayTime;
    public int batchSize;
    public String broadcastInfo;
    public long clientTimestamp;
    public boolean containsRedPack;
    public boolean displayAnimation;
    public boolean displayBanner;
    public boolean displayGif;
    public String effectiveKey;
    public String exptag;
    public String extraInfo;
    public String fromLiveStreamId;
    public UserInfos$UserInfo fromUser;
    public int gifFramePerSencond;
    public String gifUrl;
    public String[] gifUrlNew;
    public int giftId;
    public boolean giftNaming;
    public String id;
    public int liveAssistantType;
    public long magicFaceId;
    public String mergeKey;
    public int rank;
    public String serverExpTag;
    public long slotDisplayDuration;
    public long sortRank;
    public int style;
    public long time;
    public String titleV2;
    public UserInfos$UserInfo toUser;
    public String token;
    public boolean useStyleV2;
    public static LiveStreamMessages$BroadcastGiftFeed[] _emptyArray;

    public void LiveStreamMessages$BroadcastGiftFeed(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$BroadcastGiftFeed[] emptyArray(){
       if (LiveStreamMessages$BroadcastGiftFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$BroadcastGiftFeed._emptyArray == null) {
             LiveStreamMessages$BroadcastGiftFeed[] uBroadcastGi = new LiveStreamMessages$BroadcastGiftFeed[0];
             LiveStreamMessages$BroadcastGiftFeed._emptyArray = uBroadcastGi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$BroadcastGiftFeed._emptyArray;
    }
    public static LiveStreamMessages$BroadcastGiftFeed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$BroadcastGiftFeed().mergeFrom(p0);
    }
    public static LiveStreamMessages$BroadcastGiftFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$BroadcastGiftFeed(), p0);
    }
    public LiveStreamMessages$BroadcastGiftFeed clear(){
       this.id = "";
       this.fromUser = null;
       this.toUser = null;
       this.time = 0;
       this.giftId = 0;
       this.batchSize = 0;
       this.fromLiveStreamId = "";
       this.sortRank = 0;
       this.clientTimestamp = 0;
       this.slotDisplayDuration = 0;
       this.style = 0;
       this.liveAssistantType = 0;
       this.magicFaceId = 0;
       this.animationDisplayTime = 0;
       this.exptag = "";
       this.broadcastInfo = "";
       this.displayAnimation = false;
       this.displayBanner = false;
       this.displayGif = false;
       this.gifUrl = "";
       this.gifUrlNew = WireFormatNano.EMPTY_STRING_ARRAY;
       this.useStyleV2 = false;
       this.titleV2 = "";
       this.token = "";
       this.containsRedPack = false;
       this.gifFramePerSencond = 0;
       this.serverExpTag = "";
       this.rank = 0;
       this.effectiveKey = "";
       this.mergeKey = "";
       this.giftNaming = false;
       this.extraInfo = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       LiveStreamMessages$BroadcastGiftFeed tfromUser = this.fromUser;
       int i1 = 2;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, tfromUser);
       }
       tfromUser = this.toUser;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tfromUser);
       }
       LiveStreamMessages$BroadcastGiftFeed ttime = this.time;
       LiveStreamMessages$BroadcastGiftFeed uBroadcastGi = null;
       if (ttime - uBroadcastGi) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, ttime);
       }
       tfromUser = this.giftId;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tfromUser);
       }
       tfromUser = this.batchSize;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tfromUser);
       }
       if (!(this.fromLiveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.fromLiveStreamId);
       }
       ttime = this.sortRank;
       if (ttime - uBroadcastGi) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, ttime);
       }
       ttime = this.clientTimestamp;
       if (ttime - uBroadcastGi) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, ttime);
       }
       ttime = this.slotDisplayDuration;
       if (ttime - uBroadcastGi) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(10, ttime);
       }
       tfromUser = this.style;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(11, tfromUser);
       }
       tfromUser = this.liveAssistantType;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(12, tfromUser);
       }
       ttime = this.magicFaceId;
       if (ttime - uBroadcastGi) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(13, ttime);
       }
       ttime = this.animationDisplayTime;
       if (ttime - uBroadcastGi) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(14, ttime);
       }
       if (!(this.exptag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(15, this.exptag);
       }
       if (!(this.broadcastInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(16, this.broadcastInfo);
       }
       tfromUser = this.displayAnimation;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(17, tfromUser);
       }
       tfromUser = this.displayBanner;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(18, tfromUser);
       }
       tfromUser = this.displayGif;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(19, tfromUser);
       }
       if (!(this.gifUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(20, this.gifUrl);
       }
       tfromUser = this.gifUrlNew;
       if (tfromUser != null && tfromUser.length > 0) {
          int i2 = 0;
          int i3 = 0;
          int i4 = 0;
          uBroadcastGi = this.gifUrlNew;
          while (i2 < uBroadcastGi.length) {
             object oobject = uBroadcastGi[i2];
             if (oobject != null) {
                i4 = i4 + 1;
                i3 = i3 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i2 = i2 + 1;
          }
          i = (i + i3) + (i4 * 2);
       }
       tfromUser = this.useStyleV2;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(22, tfromUser);
       }
       if (!(this.titleV2).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(23, this.titleV2);
       }
       if (!(this.token).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(24, this.token);
       }
       tfromUser = this.containsRedPack;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(25, tfromUser);
       }
       tfromUser = this.gifFramePerSencond;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(26, tfromUser);
       }
       if (!(this.serverExpTag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(27, this.serverExpTag);
       }
       tfromUser = this.rank;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(28, tfromUser);
       }
       if (!(this.effectiveKey).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(29, this.effectiveKey);
       }
       if (!(this.mergeKey).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(30, this.mergeKey);
       }
       tfromUser = this.giftNaming;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(31, tfromUser);
       }
       if (!(this.extraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(32, this.extraInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$BroadcastGiftFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          LiveStreamMessages$BroadcastGiftFeed uBroadcastGi = 2;
          int i1 = 1;
          switch (i){
              case 0:
                return this;
              case 10:
                this.id = p0.readString();
                break;
              case 18:
                if (this.fromUser == null) {
                   this.fromUser = new UserInfos$UserInfo();
                }
                p0.readMessage(this.fromUser);
                break;
              case 26:
                if (this.toUser == null) {
                   this.toUser = new UserInfos$UserInfo();
                }
                p0.readMessage(this.toUser);
                break;
              case 32:
                this.time = p0.readUInt64();
                break;
              case '(':
                this.giftId = p0.readUInt32();
                break;
              case '0':
                this.batchSize = p0.readUInt32();
                break;
              case ':':
                this.fromLiveStreamId = p0.readString();
                break;
              case '@':
                this.sortRank = p0.readUInt64();
                break;
              case 'H':
                this.clientTimestamp = p0.readUInt64();
                break;
              case 'P':
                this.slotDisplayDuration = p0.readUInt64();
                break;
              case 'X':
                i = p0.readInt32();
                if (i && (i != i1 && i != uBroadcastGi)) {
                   continue ;
                }else {
                   this.style = i;
                }
                break;
              case '`':
                i = p0.readInt32();
                if (i && (i != i1 && i != uBroadcastGi)) {
                   continue ;
                }else {
                   this.liveAssistantType = i;
                }
                break;
              case 'h':
                this.magicFaceId = p0.readUInt64();
                break;
              case 'p':
                this.animationDisplayTime = p0.readUInt64();
                break;
              case 'z':
                this.exptag = p0.readString();
                break;
              case 130:
                this.broadcastInfo = p0.readString();
                break;
              case 136:
                this.displayAnimation = p0.readBool();
                break;
              case 144:
                this.displayBanner = p0.readBool();
                break;
              case 152:
                this.displayGif = p0.readBool();
                break;
              case 162:
                this.gifUrl = p0.readString();
                break;
              case 170:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 170);
                uBroadcastGi = this.gifUrlNew;
                i1 = 0;
                int i2 = (uBroadcastGi == null)? 0: uBroadcastGi.length;
                i = i + i2;
                String[] stringArray = new String[i];
                if (i2) {
                   System.arraycopy(uBroadcastGi, i1, stringArray, i1, i2);
                }
                int i3 = i - 1;
                while (i2 < i3) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.gifUrlNew = stringArray;
                break;
              case 176:
                this.useStyleV2 = p0.readBool();
                break;
              case 186:
                this.titleV2 = p0.readString();
                break;
              case 194:
                this.token = p0.readString();
                break;
              case 200:
                this.containsRedPack = p0.readBool();
                break;
              case 208:
                this.gifFramePerSencond = p0.readUInt32();
                break;
              case 218:
                this.serverExpTag = p0.readString();
                break;
              case 224:
                this.rank = p0.readUInt32();
                break;
              case 234:
                this.effectiveKey = p0.readString();
                break;
              case 242:
                this.mergeKey = p0.readString();
                break;
              case 248:
                this.giftNaming = p0.readBool();
                break;
              case 258:
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
       String str = "";
       if (!(this.id).equals(str)) {
          p0.writeString(1, this.id);
       }
       LiveStreamMessages$BroadcastGiftFeed tfromUser = this.fromUser;
       if (tfromUser != null) {
          p0.writeMessage(2, tfromUser);
       }
       tfromUser = this.toUser;
       if (tfromUser != null) {
          p0.writeMessage(3, tfromUser);
       }
       LiveStreamMessages$BroadcastGiftFeed ttime = this.time;
       if (ttime) {
          p0.writeUInt64(4, ttime);
       }
       tfromUser = this.giftId;
       if (tfromUser != null) {
          p0.writeUInt32(5, tfromUser);
       }
       tfromUser = this.batchSize;
       if (tfromUser != null) {
          p0.writeUInt32(6, tfromUser);
       }
       if (!(this.fromLiveStreamId).equals(str)) {
          p0.writeString(7, this.fromLiveStreamId);
       }
       ttime = this.sortRank;
       if (ttime) {
          p0.writeUInt64(8, ttime);
       }
       ttime = this.clientTimestamp;
       if (ttime) {
          p0.writeUInt64(9, ttime);
       }
       ttime = this.slotDisplayDuration;
       if (ttime) {
          p0.writeUInt64(10, ttime);
       }
       tfromUser = this.style;
       if (tfromUser != null) {
          p0.writeInt32(11, tfromUser);
       }
       tfromUser = this.liveAssistantType;
       if (tfromUser != null) {
          p0.writeInt32(12, tfromUser);
       }
       ttime = this.magicFaceId;
       if (ttime) {
          p0.writeUInt64(13, ttime);
       }
       ttime = this.animationDisplayTime;
       if (ttime) {
          p0.writeUInt64(14, ttime);
       }
       if (!(this.exptag).equals(str)) {
          p0.writeString(15, this.exptag);
       }
       if (!(this.broadcastInfo).equals(str)) {
          p0.writeString(16, this.broadcastInfo);
       }
       tfromUser = this.displayAnimation;
       if (tfromUser != null) {
          p0.writeBool(17, tfromUser);
       }
       tfromUser = this.displayBanner;
       if (tfromUser != null) {
          p0.writeBool(18, tfromUser);
       }
       tfromUser = this.displayGif;
       if (tfromUser != null) {
          p0.writeBool(19, tfromUser);
       }
       if (!(this.gifUrl).equals(str)) {
          p0.writeString(20, this.gifUrl);
       }
       tfromUser = this.gifUrlNew;
       if (tfromUser != null && tfromUser.length > 0) {
          int i = 0;
          ttime = this.gifUrlNew;
          while (i < ttime.length) {
             object oobject = ttime[i];
             if (oobject != null) {
                p0.writeString(21, oobject);
             }
             i = i + 1;
          }
       }
       tfromUser = this.useStyleV2;
       if (tfromUser != null) {
          p0.writeBool(22, tfromUser);
       }
       if (!(this.titleV2).equals(str)) {
          p0.writeString(23, this.titleV2);
       }
       if (!(this.token).equals(str)) {
          p0.writeString(24, this.token);
       }
       tfromUser = this.containsRedPack;
       if (tfromUser != null) {
          p0.writeBool(25, tfromUser);
       }
       tfromUser = this.gifFramePerSencond;
       if (tfromUser != null) {
          p0.writeUInt32(26, tfromUser);
       }
       if (!(this.serverExpTag).equals(str)) {
          p0.writeString(27, this.serverExpTag);
       }
       tfromUser = this.rank;
       if (tfromUser != null) {
          p0.writeUInt32(28, tfromUser);
       }
       if (!(this.effectiveKey).equals(str)) {
          p0.writeString(29, this.effectiveKey);
       }
       if (!(this.mergeKey).equals(str)) {
          p0.writeString(30, this.mergeKey);
       }
       tfromUser = this.giftNaming;
       if (tfromUser != null) {
          p0.writeBool(31, tfromUser);
       }
       if (!(this.extraInfo).equals(str)) {
          p0.writeString(32, this.extraInfo);
       }
       super.writeTo(p0);
       return;
    }
}
