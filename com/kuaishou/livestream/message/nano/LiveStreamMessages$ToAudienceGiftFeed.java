package com.kuaishou.livestream.message.nano.LiveStreamMessages$ToAudienceGiftFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$GiftFeedEffectiveInfo;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamMessages$ToAudienceGiftFeed extends MessageNano	// class@001384
{
    public int batchSize;
    public long clientTimestamp;
    public int comboCount;
    public String comboEffectiveKey;
    public String deviceHash;
    public long displayExtendMillis;
    public LiveStreamMessages$GiftFeedEffectiveInfo effectiveInfo;
    public String effectiveKey;
    public long expireDuration;
    public UserInfos$UserInfo fromUser;
    public int giftId;
    public String id;
    public long magicFaceId;
    public String mergeKey;
    public int rank;
    public LiveAudienceState senderState;
    public long slotDisplayDuration;
    public int slotPos;
    public long sortRank;
    public int starLevel;
    public int styleType;
    public long time;
    public UserInfos$UserInfo toUser;
    public static LiveStreamMessages$ToAudienceGiftFeed[] _emptyArray;

    public void LiveStreamMessages$ToAudienceGiftFeed(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$ToAudienceGiftFeed[] emptyArray(){
       if (LiveStreamMessages$ToAudienceGiftFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$ToAudienceGiftFeed._emptyArray == null) {
             LiveStreamMessages$ToAudienceGiftFeed[] toAudienceGi = new LiveStreamMessages$ToAudienceGiftFeed[0];
             LiveStreamMessages$ToAudienceGiftFeed._emptyArray = toAudienceGi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$ToAudienceGiftFeed._emptyArray;
    }
    public static LiveStreamMessages$ToAudienceGiftFeed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$ToAudienceGiftFeed().mergeFrom(p0);
    }
    public static LiveStreamMessages$ToAudienceGiftFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$ToAudienceGiftFeed(), p0);
    }
    public LiveStreamMessages$ToAudienceGiftFeed clear(){
       this.id = "";
       this.fromUser = null;
       this.toUser = null;
       this.time = 0;
       this.giftId = 0;
       this.batchSize = 0;
       this.sortRank = 0;
       this.deviceHash = "";
       this.senderState = null;
       this.rank = 0;
       this.mergeKey = "";
       this.comboCount = 0;
       this.expireDuration = 0;
       this.clientTimestamp = 0;
       this.magicFaceId = 0;
       this.slotDisplayDuration = 0;
       this.styleType = 0;
       this.displayExtendMillis = 0;
       this.starLevel = 0;
       this.slotPos = 0;
       this.effectiveKey = "";
       this.comboEffectiveKey = "";
       this.effectiveInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       LiveStreamMessages$ToAudienceGiftFeed tfromUser = this.fromUser;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tfromUser);
       }
       tfromUser = this.toUser;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tfromUser);
       }
       LiveStreamMessages$ToAudienceGiftFeed ttime = this.time;
       if (ttime) {
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
       ttime = this.sortRank;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, ttime);
       }
       if (!(this.deviceHash).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.deviceHash);
       }
       tfromUser = this.senderState;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, tfromUser);
       }
       tfromUser = this.rank;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(10, tfromUser);
       }
       if (!(this.mergeKey).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.mergeKey);
       }
       tfromUser = this.comboCount;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(12, tfromUser);
       }
       ttime = this.expireDuration;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(13, ttime);
       }
       ttime = this.clientTimestamp;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(14, ttime);
       }
       ttime = this.magicFaceId;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(15, ttime);
       }
       ttime = this.slotDisplayDuration;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(16, ttime);
       }
       tfromUser = this.styleType;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(17, tfromUser);
       }
       ttime = this.displayExtendMillis;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(18, ttime);
       }
       tfromUser = this.starLevel;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(19, tfromUser);
       }
       tfromUser = this.slotPos;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(20, tfromUser);
       }
       if (!(this.effectiveKey).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(21, this.effectiveKey);
       }
       if (!(this.comboEffectiveKey).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(22, this.comboEffectiveKey);
       }
       tfromUser = this.effectiveInfo;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(23, tfromUser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$ToAudienceGiftFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
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
              case '8':
                this.sortRank = p0.readUInt64();
                break;
              case 'B':
                this.deviceHash = p0.readString();
                break;
              case 'J':
                if (this.senderState == null) {
                   this.senderState = new LiveAudienceState();
                }
                p0.readMessage(this.senderState);
                break;
              case 'P':
                this.rank = p0.readUInt32();
                break;
              case 'Z':
                this.mergeKey = p0.readString();
                break;
              case '`':
                this.comboCount = p0.readUInt32();
                break;
              case 'h':
                this.expireDuration = p0.readUInt64();
                break;
              case 'p':
                this.clientTimestamp = p0.readUInt64();
                break;
              case 'x':
                this.magicFaceId = p0.readUInt64();
                break;
              case 128:
                this.slotDisplayDuration = p0.readUInt64();
                break;
              case 136:
                i = p0.readInt32();
                switch (i){
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 1:
                      break;
                    default:
                }
                this.styleType = i;
                break;
              case 144:
                this.displayExtendMillis = p0.readUInt64();
                break;
              case 152:
                this.starLevel = p0.readUInt32();
                break;
              case 160:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.slotPos = i;
                }
                break;
              case 170:
                this.effectiveKey = p0.readString();
                break;
              case 178:
                this.comboEffectiveKey = p0.readString();
                break;
              case 186:
                if (this.effectiveInfo == null) {
                   this.effectiveInfo = new LiveStreamMessages$GiftFeedEffectiveInfo();
                }
                p0.readMessage(this.effectiveInfo);
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
       LiveStreamMessages$ToAudienceGiftFeed tfromUser = this.fromUser;
       if (tfromUser != null) {
          p0.writeMessage(2, tfromUser);
       }
       tfromUser = this.toUser;
       if (tfromUser != null) {
          p0.writeMessage(3, tfromUser);
       }
       LiveStreamMessages$ToAudienceGiftFeed ttime = this.time;
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
       ttime = this.sortRank;
       if (ttime) {
          p0.writeUInt64(7, ttime);
       }
       if (!(this.deviceHash).equals(str)) {
          p0.writeString(8, this.deviceHash);
       }
       tfromUser = this.senderState;
       if (tfromUser != null) {
          p0.writeMessage(9, tfromUser);
       }
       tfromUser = this.rank;
       if (tfromUser != null) {
          p0.writeUInt32(10, tfromUser);
       }
       if (!(this.mergeKey).equals(str)) {
          p0.writeString(11, this.mergeKey);
       }
       tfromUser = this.comboCount;
       if (tfromUser != null) {
          p0.writeUInt32(12, tfromUser);
       }
       ttime = this.expireDuration;
       if (ttime) {
          p0.writeUInt64(13, ttime);
       }
       ttime = this.clientTimestamp;
       if (ttime) {
          p0.writeUInt64(14, ttime);
       }
       ttime = this.magicFaceId;
       if (ttime) {
          p0.writeUInt64(15, ttime);
       }
       ttime = this.slotDisplayDuration;
       if (ttime) {
          p0.writeUInt64(16, ttime);
       }
       tfromUser = this.styleType;
       if (tfromUser != null) {
          p0.writeInt32(17, tfromUser);
       }
       ttime = this.displayExtendMillis;
       if (ttime) {
          p0.writeUInt64(18, ttime);
       }
       tfromUser = this.starLevel;
       if (tfromUser != null) {
          p0.writeUInt32(19, tfromUser);
       }
       tfromUser = this.slotPos;
       if (tfromUser != null) {
          p0.writeInt32(20, tfromUser);
       }
       if (!(this.effectiveKey).equals(str)) {
          p0.writeString(21, this.effectiveKey);
       }
       if (!(this.comboEffectiveKey).equals(str)) {
          p0.writeString(22, this.comboEffectiveKey);
       }
       tfromUser = this.effectiveInfo;
       if (tfromUser != null) {
          p0.writeMessage(23, tfromUser);
       }
       super.writeTo(p0);
       return;
    }
}
