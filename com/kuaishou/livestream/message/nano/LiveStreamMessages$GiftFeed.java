package com.kuaishou.livestream.message.nano.LiveStreamMessages$GiftFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$GiftFeedEffectiveInfo;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;

public final class LiveStreamMessages$GiftFeed extends MessageNano	// class@0012d8
{
    public UserInfos$UserInfo author;
    public int batchSize;
    public long changeVoiceTypeId;
    public long clientTimestamp;
    public boolean combineStream;
    public int comboCount;
    public String comboEffectiveKey;
    public String deviceHash;
    public long displayExtendMillis;
    public LiveStreamMessages$GiftFeedEffectiveInfo effectiveInfo;
    public String effectiveKey;
    public long expireDuration;
    public String extraInfo;
    public int giftId;
    public boolean giftNaming;
    public long giftType;
    public String id;
    public boolean isAnonymous;
    public boolean isDrawingGift;
    public boolean isFromWheelDecide;
    public boolean isKoi;
    public boolean isOpenArrowRedPack;
    public int liveAssistantType;
    public long magicFaceId;
    public String mergeKey;
    public boolean onlyDisplayInSlot;
    public int rank;
    public LiveAudienceState senderState;
    public long slotDisplayDuration;
    public int slotPos;
    public long sortRank;
    public int starLevel;
    public int styleType;
    public int subStarLevel;
    public long time;
    public UserInfos$UserInfo user;
    public static LiveStreamMessages$GiftFeed[] _emptyArray;

    public void LiveStreamMessages$GiftFeed(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$GiftFeed[] emptyArray(){
       if (LiveStreamMessages$GiftFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$GiftFeed._emptyArray == null) {
             LiveStreamMessages$GiftFeed[] giftFeedArra = new LiveStreamMessages$GiftFeed[0];
             LiveStreamMessages$GiftFeed._emptyArray = giftFeedArra;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$GiftFeed._emptyArray;
    }
    public static LiveStreamMessages$GiftFeed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$GiftFeed().mergeFrom(p0);
    }
    public static LiveStreamMessages$GiftFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$GiftFeed(), p0);
    }
    public LiveStreamMessages$GiftFeed clear(){
       this.id = "";
       this.user = null;
       this.time = 0;
       this.giftId = 0;
       this.sortRank = 0;
       this.mergeKey = "";
       this.batchSize = 0;
       this.comboCount = 0;
       this.rank = 0;
       this.expireDuration = 0;
       this.clientTimestamp = 0;
       this.isDrawingGift = false;
       this.magicFaceId = 0;
       this.slotDisplayDuration = 0;
       this.starLevel = 0;
       this.liveAssistantType = 0;
       this.subStarLevel = 0;
       this.styleType = 0;
       this.deviceHash = "";
       this.slotPos = 0;
       this.displayExtendMillis = 0;
       this.isOpenArrowRedPack = false;
       this.isKoi = false;
       this.senderState = null;
       this.isFromWheelDecide = false;
       this.giftType = 0;
       this.combineStream = false;
       this.onlyDisplayInSlot = false;
       this.isAnonymous = false;
       this.author = null;
       this.effectiveInfo = null;
       this.effectiveKey = "";
       this.comboEffectiveKey = "";
       this.changeVoiceTypeId = 0;
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
       LiveStreamMessages$GiftFeed tuser = this.user;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tuser);
       }
       LiveStreamMessages$GiftFeed ttime = this.time;
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
       tuser = this.batchSize;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, tuser);
       }
       tuser = this.comboCount;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, tuser);
       }
       tuser = this.rank;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(9, tuser);
       }
       ttime = this.expireDuration;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(10, ttime);
       }
       ttime = this.clientTimestamp;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(11, ttime);
       }
       tuser = this.isDrawingGift;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(12, tuser);
       }
       ttime = this.magicFaceId;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(13, ttime);
       }
       ttime = this.slotDisplayDuration;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(14, ttime);
       }
       tuser = this.starLevel;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(15, tuser);
       }
       tuser = this.liveAssistantType;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(16, tuser);
       }
       tuser = this.subStarLevel;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(17, tuser);
       }
       tuser = this.styleType;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(18, tuser);
       }
       if (!(this.deviceHash).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(19, this.deviceHash);
       }
       tuser = this.slotPos;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(20, tuser);
       }
       ttime = this.displayExtendMillis;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(21, ttime);
       }
       tuser = this.isOpenArrowRedPack;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(22, tuser);
       }
       tuser = this.isKoi;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(23, tuser);
       }
       tuser = this.senderState;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(24, tuser);
       }
       tuser = this.isFromWheelDecide;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(25, tuser);
       }
       ttime = this.giftType;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(26, ttime);
       }
       tuser = this.combineStream;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(27, tuser);
       }
       tuser = this.onlyDisplayInSlot;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(28, tuser);
       }
       tuser = this.isAnonymous;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(29, tuser);
       }
       tuser = this.author;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(30, tuser);
       }
       tuser = this.effectiveInfo;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(31, tuser);
       }
       if (!(this.effectiveKey).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(32, this.effectiveKey);
       }
       if (!(this.comboEffectiveKey).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(33, this.comboEffectiveKey);
       }
       ttime = this.changeVoiceTypeId;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(34, ttime);
       }
       tuser = this.giftNaming;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(35, tuser);
       }
       if (!(this.extraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(36, this.extraInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$GiftFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          int i1 = 2;
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
                this.batchSize = p0.readUInt32();
                break;
              case '@':
                this.comboCount = p0.readUInt32();
                break;
              case 'H':
                this.rank = p0.readUInt32();
                break;
              case 'P':
                this.expireDuration = p0.readUInt64();
                break;
              case 'X':
                this.clientTimestamp = p0.readUInt64();
                break;
              case '`':
                this.isDrawingGift = p0.readBool();
                break;
              case 'h':
                this.magicFaceId = p0.readUInt64();
                break;
              case 'p':
                this.slotDisplayDuration = p0.readUInt64();
                break;
              case 'x':
                this.starLevel = p0.readUInt32();
                break;
              case 128:
                i = p0.readInt32();
                if (i && (i != 1 && i != i1)) {
                   continue ;
                }else {
                   this.liveAssistantType = i;
                }
                break;
              case 136:
                this.subStarLevel = p0.readUInt32();
                break;
              case 144:
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
              case 154:
                this.deviceHash = p0.readString();
                break;
              case 160:
                i = p0.readInt32();
                if (i && (i != 1 && (i != i1 && i != 3))) {
                   continue ;
                }else {
                   this.slotPos = i;
                }
                break;
              case 168:
                this.displayExtendMillis = p0.readUInt64();
                break;
              case 176:
                this.isOpenArrowRedPack = p0.readBool();
                break;
              case 184:
                this.isKoi = p0.readBool();
                break;
              case 194:
                if (this.senderState == null) {
                   this.senderState = new LiveAudienceState();
                }
                p0.readMessage(this.senderState);
                break;
              case 200:
                this.isFromWheelDecide = p0.readBool();
                break;
              case 208:
                this.giftType = p0.readUInt64();
                break;
              case 216:
                this.combineStream = p0.readBool();
                break;
              case 224:
                this.onlyDisplayInSlot = p0.readBool();
                break;
              case 232:
                this.isAnonymous = p0.readBool();
                break;
              case 242:
                if (this.author == null) {
                   this.author = new UserInfos$UserInfo();
                }
                p0.readMessage(this.author);
                break;
              case 250:
                if (this.effectiveInfo == null) {
                   this.effectiveInfo = new LiveStreamMessages$GiftFeedEffectiveInfo();
                }
                p0.readMessage(this.effectiveInfo);
                break;
              case 258:
                this.effectiveKey = p0.readString();
                break;
              case 266:
                this.comboEffectiveKey = p0.readString();
                break;
              case 272:
                this.changeVoiceTypeId = p0.readUInt64();
                break;
              case 280:
                this.giftNaming = p0.readBool();
                break;
              case 290:
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
       LiveStreamMessages$GiftFeed tuser = this.user;
       if (tuser != null) {
          p0.writeMessage(2, tuser);
       }
       LiveStreamMessages$GiftFeed ttime = this.time;
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
       tuser = this.batchSize;
       if (tuser != null) {
          p0.writeUInt32(7, tuser);
       }
       tuser = this.comboCount;
       if (tuser != null) {
          p0.writeUInt32(8, tuser);
       }
       tuser = this.rank;
       if (tuser != null) {
          p0.writeUInt32(9, tuser);
       }
       ttime = this.expireDuration;
       if (ttime) {
          p0.writeUInt64(10, ttime);
       }
       ttime = this.clientTimestamp;
       if (ttime) {
          p0.writeUInt64(11, ttime);
       }
       tuser = this.isDrawingGift;
       if (tuser != null) {
          p0.writeBool(12, tuser);
       }
       ttime = this.magicFaceId;
       if (ttime) {
          p0.writeUInt64(13, ttime);
       }
       ttime = this.slotDisplayDuration;
       if (ttime) {
          p0.writeUInt64(14, ttime);
       }
       tuser = this.starLevel;
       if (tuser != null) {
          p0.writeUInt32(15, tuser);
       }
       tuser = this.liveAssistantType;
       if (tuser != null) {
          p0.writeInt32(16, tuser);
       }
       tuser = this.subStarLevel;
       if (tuser != null) {
          p0.writeUInt32(17, tuser);
       }
       tuser = this.styleType;
       if (tuser != null) {
          p0.writeInt32(18, tuser);
       }
       if (!(this.deviceHash).equals(str)) {
          p0.writeString(19, this.deviceHash);
       }
       tuser = this.slotPos;
       if (tuser != null) {
          p0.writeInt32(20, tuser);
       }
       ttime = this.displayExtendMillis;
       if (ttime) {
          p0.writeUInt64(21, ttime);
       }
       tuser = this.isOpenArrowRedPack;
       if (tuser != null) {
          p0.writeBool(22, tuser);
       }
       tuser = this.isKoi;
       if (tuser != null) {
          p0.writeBool(23, tuser);
       }
       tuser = this.senderState;
       if (tuser != null) {
          p0.writeMessage(24, tuser);
       }
       tuser = this.isFromWheelDecide;
       if (tuser != null) {
          p0.writeBool(25, tuser);
       }
       ttime = this.giftType;
       if (ttime) {
          p0.writeUInt64(26, ttime);
       }
       tuser = this.combineStream;
       if (tuser != null) {
          p0.writeBool(27, tuser);
       }
       tuser = this.onlyDisplayInSlot;
       if (tuser != null) {
          p0.writeBool(28, tuser);
       }
       tuser = this.isAnonymous;
       if (tuser != null) {
          p0.writeBool(29, tuser);
       }
       tuser = this.author;
       if (tuser != null) {
          p0.writeMessage(30, tuser);
       }
       tuser = this.effectiveInfo;
       if (tuser != null) {
          p0.writeMessage(31, tuser);
       }
       if (!(this.effectiveKey).equals(str)) {
          p0.writeString(32, this.effectiveKey);
       }
       if (!(this.comboEffectiveKey).equals(str)) {
          p0.writeString(33, this.comboEffectiveKey);
       }
       ttime = this.changeVoiceTypeId;
       if (ttime) {
          p0.writeUInt64(34, ttime);
       }
       tuser = this.giftNaming;
       if (tuser != null) {
          p0.writeBool(35, tuser);
       }
       if (!(this.extraInfo).equals(str)) {
          p0.writeString(36, this.extraInfo);
       }
       super.writeTo(p0);
       return;
    }
}
