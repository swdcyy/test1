package com.kuaishou.livestream.message.nano.LiveStreamMessages$WishListEntry;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamMessages$WishListEntry extends MessageNano	// class@00138e
{
    public long currentCount;
    public String displayCurrentCount;
    public String displayExpectCount;
    public long expectCount;
    public int giftId;
    public boolean showTopSponsor;
    public UserInfos$UserInfo topSponsorInfo;
    public String wishId;
    public static LiveStreamMessages$WishListEntry[] _emptyArray;

    public void LiveStreamMessages$WishListEntry(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$WishListEntry[] emptyArray(){
       if (LiveStreamMessages$WishListEntry._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$WishListEntry._emptyArray == null) {
             LiveStreamMessages$WishListEntry[] wishListEntr = new LiveStreamMessages$WishListEntry[0];
             LiveStreamMessages$WishListEntry._emptyArray = wishListEntr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$WishListEntry._emptyArray;
    }
    public static LiveStreamMessages$WishListEntry parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$WishListEntry().mergeFrom(p0);
    }
    public static LiveStreamMessages$WishListEntry parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$WishListEntry(), p0);
    }
    public LiveStreamMessages$WishListEntry clear(){
       this.wishId = "";
       this.giftId = 0;
       this.expectCount = 0;
       this.currentCount = 0;
       this.displayExpectCount = "";
       this.displayCurrentCount = "";
       this.showTopSponsor = false;
       this.topSponsorInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.wishId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.wishId);
       }
       LiveStreamMessages$WishListEntry tgiftId = this.giftId;
       if (tgiftId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tgiftId);
       }
       LiveStreamMessages$WishListEntry texpectCount = this.expectCount;
       if (texpectCount) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, texpectCount);
       }
       texpectCount = this.currentCount;
       if (texpectCount) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, texpectCount);
       }
       if (!(this.displayExpectCount).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.displayExpectCount);
       }
       if (!(this.displayCurrentCount).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.displayCurrentCount);
       }
       tgiftId = this.showTopSponsor;
       if (tgiftId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, tgiftId);
       }
       tgiftId = this.topSponsorInfo;
       if (tgiftId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, tgiftId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$WishListEntry mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 42) {
                         if (i != 50) {
                            if (i != 56) {
                               if (i != 66) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else if(this.topSponsorInfo == null){
                                  this.topSponsorInfo = new UserInfos$UserInfo();
                               }
                               p0.readMessage(this.topSponsorInfo);
                            }else {
                               this.showTopSponsor = p0.readBool();
                            }
                         }else {
                            this.displayCurrentCount = p0.readString();
                         }
                      }else {
                         this.displayExpectCount = p0.readString();
                      }
                   }else {
                      this.currentCount = p0.readUInt64();
                   }
                }else {
                   this.expectCount = p0.readUInt64();
                }
             }else {
                this.giftId = p0.readUInt32();
             }
          }else {
             this.wishId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.wishId).equals(str)) {
          p0.writeString(1, this.wishId);
       }
       LiveStreamMessages$WishListEntry tgiftId = this.giftId;
       if (tgiftId != null) {
          p0.writeUInt32(2, tgiftId);
       }
       LiveStreamMessages$WishListEntry texpectCount = this.expectCount;
       if (texpectCount) {
          p0.writeUInt64(3, texpectCount);
       }
       texpectCount = this.currentCount;
       if (texpectCount) {
          p0.writeUInt64(4, texpectCount);
       }
       if (!(this.displayExpectCount).equals(str)) {
          p0.writeString(5, this.displayExpectCount);
       }
       if (!(this.displayCurrentCount).equals(str)) {
          p0.writeString(6, this.displayCurrentCount);
       }
       tgiftId = this.showTopSponsor;
       if (tgiftId != null) {
          p0.writeBool(7, tgiftId);
       }
       tgiftId = this.topSponsorInfo;
       if (tgiftId != null) {
          p0.writeMessage(8, tgiftId);
       }
       super.writeTo(p0);
       return;
    }
}
