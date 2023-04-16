package com.kuaishou.livestream.message.nano.LiveStreamMessages$ToAudienceDisplayGiftFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamMessages$ToAudienceDisplayGiftFeed extends MessageNano	// class@001381
{
    public int batchSize;
    public long clientTimestamp;
    public String deviceHash;
    public UserInfos$UserInfo fromUser;
    public int giftId;
    public String id;
    public int mergeCount;
    public String mergeKey;
    public LiveAudienceState senderState;
    public long sortRank;
    public long time;
    public UserInfos$UserInfo toUser;
    public static LiveStreamMessages$ToAudienceDisplayGiftFeed[] _emptyArray;

    public void LiveStreamMessages$ToAudienceDisplayGiftFeed(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$ToAudienceDisplayGiftFeed[] emptyArray(){
       if (LiveStreamMessages$ToAudienceDisplayGiftFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$ToAudienceDisplayGiftFeed._emptyArray == null) {
             LiveStreamMessages$ToAudienceDisplayGiftFeed[] toAudienceDi = new LiveStreamMessages$ToAudienceDisplayGiftFeed[0];
             LiveStreamMessages$ToAudienceDisplayGiftFeed._emptyArray = toAudienceDi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$ToAudienceDisplayGiftFeed._emptyArray;
    }
    public static LiveStreamMessages$ToAudienceDisplayGiftFeed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$ToAudienceDisplayGiftFeed().mergeFrom(p0);
    }
    public static LiveStreamMessages$ToAudienceDisplayGiftFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$ToAudienceDisplayGiftFeed(), p0);
    }
    public LiveStreamMessages$ToAudienceDisplayGiftFeed clear(){
       this.id = "";
       this.fromUser = null;
       this.toUser = null;
       this.time = 0;
       this.giftId = 0;
       this.batchSize = 0;
       this.sortRank = 0;
       this.deviceHash = "";
       this.senderState = null;
       this.mergeKey = "";
       this.mergeCount = 0;
       this.clientTimestamp = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       LiveStreamMessages$ToAudienceDisplayGiftFeed tfromUser = this.fromUser;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tfromUser);
       }
       tfromUser = this.toUser;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tfromUser);
       }
       LiveStreamMessages$ToAudienceDisplayGiftFeed ttime = this.time;
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
       if (!(this.mergeKey).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.mergeKey);
       }
       tfromUser = this.mergeCount;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(11, tfromUser);
       }
       tfromUser = this.clientTimestamp;
       if (tfromUser) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(12, tfromUser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$ToAudienceDisplayGiftFeed mergeFrom(CodedInputByteBufferNano p0){
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
              case 'R':
                this.mergeKey = p0.readString();
                break;
              case 'X':
                this.mergeCount = p0.readUInt32();
                break;
              case '`':
                this.clientTimestamp = p0.readUInt64();
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
       LiveStreamMessages$ToAudienceDisplayGiftFeed tfromUser = this.fromUser;
       if (tfromUser != null) {
          p0.writeMessage(2, tfromUser);
       }
       tfromUser = this.toUser;
       if (tfromUser != null) {
          p0.writeMessage(3, tfromUser);
       }
       LiveStreamMessages$ToAudienceDisplayGiftFeed ttime = this.time;
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
       if (!(this.mergeKey).equals(str)) {
          p0.writeString(10, this.mergeKey);
       }
       tfromUser = this.mergeCount;
       if (tfromUser != null) {
          p0.writeUInt32(11, tfromUser);
       }
       tfromUser = this.clientTimestamp;
       if (tfromUser) {
          p0.writeUInt64(12, tfromUser);
       }
       super.writeTo(p0);
       return;
    }
}
