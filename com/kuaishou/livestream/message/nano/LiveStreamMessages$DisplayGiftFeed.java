package com.kuaishou.livestream.message.nano.LiveStreamMessages$DisplayGiftFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamMessages$DisplayGiftFeed extends MessageNano	// class@0012cd
{
    public int batchSize;
    public long clientTimestamp;
    public String deviceHash;
    public int giftId;
    public long giftType;
    public String id;
    public boolean isDrawingGift;
    public boolean isOpenArrowRedPack;
    public int mergeCount;
    public String mergeKey;
    public LiveAudienceState senderState;
    public long sortRank;
    public long time;
    public UserInfos$UserInfo user;
    public static LiveStreamMessages$DisplayGiftFeed[] _emptyArray;

    public void LiveStreamMessages$DisplayGiftFeed(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$DisplayGiftFeed[] emptyArray(){
       if (LiveStreamMessages$DisplayGiftFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$DisplayGiftFeed._emptyArray == null) {
             LiveStreamMessages$DisplayGiftFeed[] uDisplayGift = new LiveStreamMessages$DisplayGiftFeed[0];
             LiveStreamMessages$DisplayGiftFeed._emptyArray = uDisplayGift;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$DisplayGiftFeed._emptyArray;
    }
    public static LiveStreamMessages$DisplayGiftFeed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$DisplayGiftFeed().mergeFrom(p0);
    }
    public static LiveStreamMessages$DisplayGiftFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$DisplayGiftFeed(), p0);
    }
    public LiveStreamMessages$DisplayGiftFeed clear(){
       this.id = "";
       this.user = null;
       this.time = 0;
       this.giftId = 0;
       this.sortRank = 0;
       this.mergeKey = "";
       this.mergeCount = 0;
       this.batchSize = 0;
       this.clientTimestamp = 0;
       this.isDrawingGift = false;
       this.deviceHash = "";
       this.isOpenArrowRedPack = false;
       this.senderState = null;
       this.giftType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       LiveStreamMessages$DisplayGiftFeed tuser = this.user;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tuser);
       }
       LiveStreamMessages$DisplayGiftFeed ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ttime);
       }
       tuser = this.giftId;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tuser);
       }
       ttime = this.sortRank;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, ttime);
       }
       if (!(this.mergeKey).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.mergeKey);
       }
       tuser = this.mergeCount;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, tuser);
       }
       tuser = this.batchSize;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, tuser);
       }
       ttime = this.clientTimestamp;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, ttime);
       }
       tuser = this.isDrawingGift;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(10, tuser);
       }
       if (!(this.deviceHash).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.deviceHash);
       }
       tuser = this.isOpenArrowRedPack;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(12, tuser);
       }
       tuser = this.senderState;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(13, tuser);
       }
       tuser = this.giftType;
       if (tuser) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(14, tuser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$DisplayGiftFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.id = p0.readString();
                break;
              case 18:
                if (this.user == null) {
                   this.user = new UserInfos$UserInfo();
                }
                p0.readMessage(this.user);
                break;
              case 24:
                this.time = p0.readUInt64();
                break;
              case 32:
                this.giftId = p0.readUInt32();
                break;
              case '(':
                this.sortRank = p0.readUInt64();
                break;
              case '2':
                this.mergeKey = p0.readString();
                break;
              case '8':
                this.mergeCount = p0.readUInt32();
                break;
              case '@':
                this.batchSize = p0.readUInt32();
                break;
              case 'H':
                this.clientTimestamp = p0.readUInt64();
                break;
              case 'P':
                this.isDrawingGift = p0.readBool();
                break;
              case 'Z':
                this.deviceHash = p0.readString();
                break;
              case '`':
                this.isOpenArrowRedPack = p0.readBool();
                break;
              case 'j':
                if (this.senderState == null) {
                   this.senderState = new LiveAudienceState();
                }
                p0.readMessage(this.senderState);
                break;
              case 'p':
                this.giftType = p0.readUInt64();
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
       LiveStreamMessages$DisplayGiftFeed tuser = this.user;
       if (tuser != null) {
          p0.writeMessage(2, tuser);
       }
       LiveStreamMessages$DisplayGiftFeed ttime = this.time;
       if (ttime) {
          p0.writeUInt64(3, ttime);
       }
       tuser = this.giftId;
       if (tuser != null) {
          p0.writeUInt32(4, tuser);
       }
       ttime = this.sortRank;
       if (ttime) {
          p0.writeUInt64(5, ttime);
       }
       if (!(this.mergeKey).equals(str)) {
          p0.writeString(6, this.mergeKey);
       }
       tuser = this.mergeCount;
       if (tuser != null) {
          p0.writeUInt32(7, tuser);
       }
       tuser = this.batchSize;
       if (tuser != null) {
          p0.writeUInt32(8, tuser);
       }
       ttime = this.clientTimestamp;
       if (ttime) {
          p0.writeUInt64(9, ttime);
       }
       tuser = this.isDrawingGift;
       if (tuser != null) {
          p0.writeBool(10, tuser);
       }
       if (!(this.deviceHash).equals(str)) {
          p0.writeString(11, this.deviceHash);
       }
       tuser = this.isOpenArrowRedPack;
       if (tuser != null) {
          p0.writeBool(12, tuser);
       }
       tuser = this.senderState;
       if (tuser != null) {
          p0.writeMessage(13, tuser);
       }
       tuser = this.giftType;
       if (tuser) {
          p0.writeUInt64(14, tuser);
       }
       super.writeTo(p0);
       return;
    }
}
