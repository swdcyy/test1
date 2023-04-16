package com.kuaishou.livestream.message.nano.LiveStreamWebMessages$WebGiftFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.livestream.message.nano.LiveStreamWebMessages$SimpleUserInfo;

public final class LiveStreamWebMessages$WebGiftFeed extends MessageNano	// class@00139c
{
    public int batchSize;
    public long clientTimestamp;
    public int comboCount;
    public boolean danmakuDisplay;
    public String deviceHash;
    public long expireDuration;
    public int giftId;
    public String id;
    public int liveAssistantType;
    public String mergeKey;
    public int rank;
    public LiveAudienceState senderState;
    public long slotDisplayDuration;
    public long sortRank;
    public int starLevel;
    public int styleType;
    public long time;
    public LiveStreamWebMessages$SimpleUserInfo user;
    public static LiveStreamWebMessages$WebGiftFeed[] _emptyArray;

    public void LiveStreamWebMessages$WebGiftFeed(){
       super();
       this.clear();
    }
    public static LiveStreamWebMessages$WebGiftFeed[] emptyArray(){
       if (LiveStreamWebMessages$WebGiftFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamWebMessages$WebGiftFeed._emptyArray == null) {
             LiveStreamWebMessages$WebGiftFeed[] webGiftFeedA = new LiveStreamWebMessages$WebGiftFeed[0];
             LiveStreamWebMessages$WebGiftFeed._emptyArray = webGiftFeedA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamWebMessages$WebGiftFeed._emptyArray;
    }
    public static LiveStreamWebMessages$WebGiftFeed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamWebMessages$WebGiftFeed().mergeFrom(p0);
    }
    public static LiveStreamWebMessages$WebGiftFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamWebMessages$WebGiftFeed(), p0);
    }
    public LiveStreamWebMessages$WebGiftFeed clear(){
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
       this.slotDisplayDuration = 0;
       this.starLevel = 0;
       this.styleType = 0;
       this.liveAssistantType = 0;
       this.deviceHash = "";
       this.danmakuDisplay = false;
       this.senderState = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       LiveStreamWebMessages$WebGiftFeed tuser = this.user;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tuser);
       }
       LiveStreamWebMessages$WebGiftFeed ttime = this.time;
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
       ttime = this.slotDisplayDuration;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(12, ttime);
       }
       tuser = this.starLevel;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(13, tuser);
       }
       tuser = this.styleType;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(14, tuser);
       }
       tuser = this.liveAssistantType;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(15, tuser);
       }
       if (!(this.deviceHash).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(16, this.deviceHash);
       }
       tuser = this.danmakuDisplay;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(17, tuser);
       }
       tuser = this.senderState;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(18, tuser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamWebMessages$WebGiftFeed mergeFrom(CodedInputByteBufferNano p0){
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
                   this.user = new LiveStreamWebMessages$SimpleUserInfo();
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
                this.slotDisplayDuration = p0.readUInt64();
                break;
              case 'h':
                this.starLevel = p0.readUInt32();
                break;
              case 'p':
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
              case 'x':
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.liveAssistantType = i;
                }
                break;
              case 130:
                this.deviceHash = p0.readString();
                break;
              case 136:
                this.danmakuDisplay = p0.readBool();
                break;
              case 146:
                if (this.senderState == null) {
                   this.senderState = new LiveAudienceState();
                }
                p0.readMessage(this.senderState);
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
       LiveStreamWebMessages$WebGiftFeed tuser = this.user;
       if (tuser != null) {
          p0.writeMessage(2, tuser);
       }
       LiveStreamWebMessages$WebGiftFeed ttime = this.time;
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
       ttime = this.slotDisplayDuration;
       if (ttime) {
          p0.writeUInt64(12, ttime);
       }
       tuser = this.starLevel;
       if (tuser != null) {
          p0.writeUInt32(13, tuser);
       }
       tuser = this.styleType;
       if (tuser != null) {
          p0.writeInt32(14, tuser);
       }
       tuser = this.liveAssistantType;
       if (tuser != null) {
          p0.writeInt32(15, tuser);
       }
       if (!(this.deviceHash).equals(str)) {
          p0.writeString(16, this.deviceHash);
       }
       tuser = this.danmakuDisplay;
       if (tuser != null) {
          p0.writeBool(17, tuser);
       }
       tuser = this.senderState;
       if (tuser != null) {
          p0.writeMessage(18, tuser);
       }
       super.writeTo(p0);
       return;
    }
}
