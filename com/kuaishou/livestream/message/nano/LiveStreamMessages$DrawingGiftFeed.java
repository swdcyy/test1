package com.kuaishou.livestream.message.nano.LiveStreamMessages$DrawingGiftFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$DrawingGiftPoint;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import java.lang.System;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamMessages$DrawingGiftFeed extends MessageNano	// class@0012ce
{
    public long clientTimestamp;
    public String deviceHash;
    public long displayExtendMillis;
    public long expireDuration;
    public String extraInfo;
    public boolean giftNaming;
    public int height;
    public String id;
    public boolean isKoi;
    public int liveAssistantType;
    public LiveStreamMessages$DrawingGiftPoint[] points;
    public int rank;
    public LiveAudienceState senderState;
    public long slotDisplayDuration;
    public int slotPos;
    public long time;
    public UserInfos$UserInfo user;
    public int width;
    public static LiveStreamMessages$DrawingGiftFeed[] _emptyArray;

    public void LiveStreamMessages$DrawingGiftFeed(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$DrawingGiftFeed[] emptyArray(){
       if (LiveStreamMessages$DrawingGiftFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$DrawingGiftFeed._emptyArray == null) {
             LiveStreamMessages$DrawingGiftFeed[] uDrawingGift = new LiveStreamMessages$DrawingGiftFeed[0];
             LiveStreamMessages$DrawingGiftFeed._emptyArray = uDrawingGift;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$DrawingGiftFeed._emptyArray;
    }
    public static LiveStreamMessages$DrawingGiftFeed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$DrawingGiftFeed().mergeFrom(p0);
    }
    public static LiveStreamMessages$DrawingGiftFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$DrawingGiftFeed(), p0);
    }
    public LiveStreamMessages$DrawingGiftFeed clear(){
       this.id = "";
       this.user = null;
       this.time = 0;
       this.height = 0;
       this.width = 0;
       this.points = LiveStreamMessages$DrawingGiftPoint.emptyArray();
       this.rank = 0;
       this.expireDuration = 0;
       this.clientTimestamp = 0;
       this.slotDisplayDuration = 0;
       this.liveAssistantType = 0;
       this.deviceHash = "";
       this.slotPos = 0;
       this.displayExtendMillis = 0;
       this.isKoi = false;
       this.senderState = null;
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
       LiveStreamMessages$DrawingGiftFeed tuser = this.user;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tuser);
       }
       LiveStreamMessages$DrawingGiftFeed ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ttime);
       }
       tuser = this.height;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tuser);
       }
       tuser = this.width;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tuser);
       }
       tuser = this.points;
       if (tuser != null && tuser.length > 0) {
          int i1 = 0;
          ttime = this.points;
          while (i1 < ttime.length) {
             object oobject = ttime[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(6, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tuser = this.rank;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, tuser);
       }
       ttime = this.expireDuration;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, ttime);
       }
       ttime = this.clientTimestamp;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, ttime);
       }
       ttime = this.slotDisplayDuration;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(10, ttime);
       }
       tuser = this.liveAssistantType;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(11, tuser);
       }
       if (!(this.deviceHash).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.deviceHash);
       }
       tuser = this.slotPos;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(13, tuser);
       }
       ttime = this.displayExtendMillis;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(14, ttime);
       }
       tuser = this.isKoi;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(15, tuser);
       }
       tuser = this.senderState;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(16, tuser);
       }
       tuser = this.giftNaming;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(17, tuser);
       }
       if (!(this.extraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(18, this.extraInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$DrawingGiftFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          LiveStreamMessages$DrawingGiftFeed uDrawingGift = 2;
          int i1 = 1;
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
                this.height = p0.readUInt32();
                break;
              case '(':
                this.width = p0.readUInt32();
                break;
              case '2':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 50);
                uDrawingGift = this.points;
                i1 = 0;
                int i2 = (uDrawingGift == null)? 0: uDrawingGift.length;
                i = i + i2;
                LiveStreamMessages$DrawingGiftPoint[] uDrawingGift1 = new LiveStreamMessages$DrawingGiftPoint[i];
                if (i2) {
                   System.arraycopy(uDrawingGift, i1, uDrawingGift1, i1, i2);
                }
                int i3 = i - 1;
                while (i2 < i3) {
                   uDrawingGift1[i2] = new LiveStreamMessages$DrawingGiftPoint();
                   p0.readMessage(uDrawingGift1[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uDrawingGift1[i2] = new LiveStreamMessages$DrawingGiftPoint();
                p0.readMessage(uDrawingGift1[i2]);
                this.points = uDrawingGift1;
                break;
              case '8':
                this.rank = p0.readUInt32();
                break;
              case '@':
                this.expireDuration = p0.readUInt64();
                break;
              case 'H':
                this.clientTimestamp = p0.readUInt64();
                break;
              case 'P':
                this.slotDisplayDuration = p0.readUInt64();
                break;
              case 'X':
                i = p0.readInt32();
                if (i && (i != i1 && i != uDrawingGift)) {
                   continue ;
                }else {
                   this.liveAssistantType = i;
                }
                break;
              case 'b':
                this.deviceHash = p0.readString();
                break;
              case 'h':
                i = p0.readInt32();
                if (i && (i != i1 && (i != uDrawingGift && i != 3))) {
                   continue ;
                }else {
                   this.slotPos = i;
                }
                break;
              case 'p':
                this.displayExtendMillis = p0.readUInt64();
                break;
              case 'x':
                this.isKoi = p0.readBool();
                break;
              case 130:
                if (this.senderState == null) {
                   this.senderState = new LiveAudienceState();
                }
                p0.readMessage(this.senderState);
                break;
              case 136:
                this.giftNaming = p0.readBool();
                break;
              case 146:
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
       LiveStreamMessages$DrawingGiftFeed tuser = this.user;
       if (tuser != null) {
          p0.writeMessage(2, tuser);
       }
       LiveStreamMessages$DrawingGiftFeed ttime = this.time;
       if (ttime) {
          p0.writeUInt64(3, ttime);
       }
       tuser = this.height;
       if (tuser != null) {
          p0.writeUInt32(4, tuser);
       }
       tuser = this.width;
       if (tuser != null) {
          p0.writeUInt32(5, tuser);
       }
       tuser = this.points;
       if (tuser != null && tuser.length > 0) {
          int i = 0;
          ttime = this.points;
          while (i < ttime.length) {
             object oobject = ttime[i];
             if (oobject != null) {
                p0.writeMessage(6, oobject);
             }
             i = i + 1;
          }
       }
       tuser = this.rank;
       if (tuser != null) {
          p0.writeUInt32(7, tuser);
       }
       ttime = this.expireDuration;
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
       tuser = this.liveAssistantType;
       if (tuser != null) {
          p0.writeInt32(11, tuser);
       }
       if (!(this.deviceHash).equals(str)) {
          p0.writeString(12, this.deviceHash);
       }
       tuser = this.slotPos;
       if (tuser != null) {
          p0.writeInt32(13, tuser);
       }
       ttime = this.displayExtendMillis;
       if (ttime) {
          p0.writeUInt64(14, ttime);
       }
       tuser = this.isKoi;
       if (tuser != null) {
          p0.writeBool(15, tuser);
       }
       tuser = this.senderState;
       if (tuser != null) {
          p0.writeMessage(16, tuser);
       }
       tuser = this.giftNaming;
       if (tuser != null) {
          p0.writeBool(17, tuser);
       }
       if (!(this.extraInfo).equals(str)) {
          p0.writeString(18, this.extraInfo);
       }
       super.writeTo(p0);
       return;
    }
}
