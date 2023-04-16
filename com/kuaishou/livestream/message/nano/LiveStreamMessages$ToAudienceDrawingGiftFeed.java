package com.kuaishou.livestream.message.nano.LiveStreamMessages$ToAudienceDrawingGiftFeed;
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

public final class LiveStreamMessages$ToAudienceDrawingGiftFeed extends MessageNano	// class@001382
{
    public long clientTimestamp;
    public String deviceHash;
    public long displayExtendMillis;
    public long expireDuration;
    public UserInfos$UserInfo fromUser;
    public int height;
    public String id;
    public LiveStreamMessages$DrawingGiftPoint[] point;
    public int rank;
    public LiveAudienceState senderState;
    public int showStrategy;
    public long slotDisplayDuration;
    public int slotPos;
    public long time;
    public UserInfos$UserInfo toUser;
    public int width;
    public static LiveStreamMessages$ToAudienceDrawingGiftFeed[] _emptyArray;

    public void LiveStreamMessages$ToAudienceDrawingGiftFeed(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$ToAudienceDrawingGiftFeed[] emptyArray(){
       if (LiveStreamMessages$ToAudienceDrawingGiftFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$ToAudienceDrawingGiftFeed._emptyArray == null) {
             LiveStreamMessages$ToAudienceDrawingGiftFeed[] toAudienceDr = new LiveStreamMessages$ToAudienceDrawingGiftFeed[0];
             LiveStreamMessages$ToAudienceDrawingGiftFeed._emptyArray = toAudienceDr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$ToAudienceDrawingGiftFeed._emptyArray;
    }
    public static LiveStreamMessages$ToAudienceDrawingGiftFeed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$ToAudienceDrawingGiftFeed().mergeFrom(p0);
    }
    public static LiveStreamMessages$ToAudienceDrawingGiftFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$ToAudienceDrawingGiftFeed(), p0);
    }
    public LiveStreamMessages$ToAudienceDrawingGiftFeed clear(){
       this.id = "";
       this.fromUser = null;
       this.toUser = null;
       this.time = 0;
       this.height = 0;
       this.width = 0;
       this.point = LiveStreamMessages$DrawingGiftPoint.emptyArray();
       this.rank = 0;
       this.expireDuration = 0;
       this.clientTimestamp = 0;
       this.slotDisplayDuration = 0;
       this.deviceHash = "";
       this.slotPos = 0;
       this.displayExtendMillis = 0;
       this.senderState = null;
       this.showStrategy = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       LiveStreamMessages$ToAudienceDrawingGiftFeed tfromUser = this.fromUser;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tfromUser);
       }
       tfromUser = this.toUser;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tfromUser);
       }
       LiveStreamMessages$ToAudienceDrawingGiftFeed ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, ttime);
       }
       tfromUser = this.height;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tfromUser);
       }
       tfromUser = this.width;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tfromUser);
       }
       tfromUser = this.point;
       if (tfromUser != null && tfromUser.length > 0) {
          int i1 = 0;
          ttime = this.point;
          while (i1 < ttime.length) {
             object oobject = ttime[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(7, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tfromUser = this.rank;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, tfromUser);
       }
       ttime = this.expireDuration;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, ttime);
       }
       ttime = this.clientTimestamp;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(10, ttime);
       }
       ttime = this.slotDisplayDuration;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(11, ttime);
       }
       if (!(this.deviceHash).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.deviceHash);
       }
       tfromUser = this.slotPos;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(13, tfromUser);
       }
       tfromUser = this.displayExtendMillis;
       if (tfromUser) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(14, tfromUser);
       }
       tfromUser = this.senderState;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(15, tfromUser);
       }
       tfromUser = this.showStrategy;
       if (tfromUser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(16, tfromUser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$ToAudienceDrawingGiftFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          LiveStreamMessages$ToAudienceDrawingGiftFeed toAudienceDr = 2;
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
                this.height = p0.readUInt32();
                break;
              case '0':
                this.width = p0.readUInt32();
                break;
              case ':':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 58);
                toAudienceDr = this.point;
                i1 = 0;
                int i2 = (toAudienceDr == null)? 0: toAudienceDr.length;
                i = i + i2;
                LiveStreamMessages$DrawingGiftPoint[] uDrawingGift = new LiveStreamMessages$DrawingGiftPoint[i];
                if (i2) {
                   System.arraycopy(toAudienceDr, i1, uDrawingGift, i1, i2);
                }
                int i3 = i - 1;
                while (i2 < i3) {
                   uDrawingGift[i2] = new LiveStreamMessages$DrawingGiftPoint();
                   p0.readMessage(uDrawingGift[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uDrawingGift[i2] = new LiveStreamMessages$DrawingGiftPoint();
                p0.readMessage(uDrawingGift[i2]);
                this.point = uDrawingGift;
                break;
              case '@':
                this.rank = p0.readUInt32();
                break;
              case 'H':
                this.expireDuration = p0.readUInt64();
                break;
              case 'P':
                this.clientTimestamp = p0.readUInt64();
                break;
              case 'X':
                this.slotDisplayDuration = p0.readUInt64();
                break;
              case 'b':
                this.deviceHash = p0.readString();
                break;
              case 'h':
                i = p0.readInt32();
                if (i && (i != i1 && (i != toAudienceDr && i != 3))) {
                   continue ;
                }else {
                   this.slotPos = i;
                }
                break;
              case 'p':
                this.displayExtendMillis = p0.readUInt64();
                break;
              case 'z':
                if (this.senderState == null) {
                   this.senderState = new LiveAudienceState();
                }
                p0.readMessage(this.senderState);
                break;
              case 128:
                i = p0.readInt32();
                if (i && (i != i1 && i != toAudienceDr)) {
                   continue ;
                }else {
                   this.showStrategy = i;
                }
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
       LiveStreamMessages$ToAudienceDrawingGiftFeed tfromUser = this.fromUser;
       if (tfromUser != null) {
          p0.writeMessage(2, tfromUser);
       }
       tfromUser = this.toUser;
       if (tfromUser != null) {
          p0.writeMessage(3, tfromUser);
       }
       LiveStreamMessages$ToAudienceDrawingGiftFeed ttime = this.time;
       if (ttime) {
          p0.writeUInt64(4, ttime);
       }
       tfromUser = this.height;
       if (tfromUser != null) {
          p0.writeUInt32(5, tfromUser);
       }
       tfromUser = this.width;
       if (tfromUser != null) {
          p0.writeUInt32(6, tfromUser);
       }
       tfromUser = this.point;
       if (tfromUser != null && tfromUser.length > 0) {
          int i = 0;
          ttime = this.point;
          while (i < ttime.length) {
             object oobject = ttime[i];
             if (oobject != null) {
                p0.writeMessage(7, oobject);
             }
             i = i + 1;
          }
       }
       tfromUser = this.rank;
       if (tfromUser != null) {
          p0.writeUInt32(8, tfromUser);
       }
       ttime = this.expireDuration;
       if (ttime) {
          p0.writeUInt64(9, ttime);
       }
       ttime = this.clientTimestamp;
       if (ttime) {
          p0.writeUInt64(10, ttime);
       }
       ttime = this.slotDisplayDuration;
       if (ttime) {
          p0.writeUInt64(11, ttime);
       }
       if (!(this.deviceHash).equals(str)) {
          p0.writeString(12, this.deviceHash);
       }
       tfromUser = this.slotPos;
       if (tfromUser != null) {
          p0.writeInt32(13, tfromUser);
       }
       tfromUser = this.displayExtendMillis;
       if (tfromUser) {
          p0.writeUInt64(14, tfromUser);
       }
       tfromUser = this.senderState;
       if (tfromUser != null) {
          p0.writeMessage(15, tfromUser);
       }
       tfromUser = this.showStrategy;
       if (tfromUser != null) {
          p0.writeInt32(16, tfromUser);
       }
       super.writeTo(p0);
       return;
    }
}
