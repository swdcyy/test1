package com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$AuctionBidInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveRoomSignalMessage$AuctionBidInfo extends MessageNano	// class@001c3f
{
    public int bidCount;
    public String bidPrice;
    public UserInfos$PicUrl[] headUrls;
    public long userId;
    public String userName;
    public static LiveRoomSignalMessage$AuctionBidInfo[] _emptyArray;

    public void LiveRoomSignalMessage$AuctionBidInfo(){
       super();
       this.clear();
    }
    public static LiveRoomSignalMessage$AuctionBidInfo[] emptyArray(){
       if (LiveRoomSignalMessage$AuctionBidInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomSignalMessage$AuctionBidInfo._emptyArray == null) {
             LiveRoomSignalMessage$AuctionBidInfo[] uAuctionBidI = new LiveRoomSignalMessage$AuctionBidInfo[0];
             LiveRoomSignalMessage$AuctionBidInfo._emptyArray = uAuctionBidI;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomSignalMessage$AuctionBidInfo._emptyArray;
    }
    public static LiveRoomSignalMessage$AuctionBidInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomSignalMessage$AuctionBidInfo().mergeFrom(p0);
    }
    public static LiveRoomSignalMessage$AuctionBidInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomSignalMessage$AuctionBidInfo(), p0);
    }
    public LiveRoomSignalMessage$AuctionBidInfo clear(){
       this.userId = 0;
       this.userName = "";
       this.headUrls = UserInfos$PicUrl.emptyArray();
       this.bidPrice = "";
       this.bidCount = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveRoomSignalMessage$AuctionBidInfo tuserId = this.userId;
       if (tuserId - null) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tuserId);
       }
       String str = "";
       if (!(this.userName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.userName);
       }
       tuserId = this.headUrls;
       if (tuserId != null && tuserId.length > 0) {
          int i1 = 0;
          LiveRoomSignalMessage$AuctionBidInfo theadUrls = this.headUrls;
          while (i1 < theadUrls.length) {
             object oobject = theadUrls[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.bidPrice).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.bidPrice);
       }
       tuserId = this.bidCount;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tuserId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomSignalMessage$AuctionBidInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                int i1 = 26;
                if (i != i1) {
                   if (i != 34) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.bidCount = p0.readUInt32();
                      }
                   }else {
                      this.bidPrice = p0.readString();
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   LiveRoomSignalMessage$AuctionBidInfo theadUrls = this.headUrls;
                   int i2 = (theadUrls == null)? 0: theadUrls.length;
                   i = i + i2;
                   UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                   if (i2) {
                      System.arraycopy(theadUrls, 0, picUrlArray, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      picUrlArray[i2] = new UserInfos$PicUrl();
                      p0.readMessage(picUrlArray[i2]);
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   picUrlArray[i2] = new UserInfos$PicUrl();
                   p0.readMessage(picUrlArray[i2]);
                   this.headUrls = picUrlArray;
                }
             }else {
                this.userName = p0.readString();
             }
          }else {
             this.userId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveRoomSignalMessage$AuctionBidInfo tuserId = this.userId;
       if (tuserId - null) {
          p0.writeUInt64(1, tuserId);
       }
       String str = "";
       if (!(this.userName).equals(str)) {
          p0.writeString(2, this.userName);
       }
       tuserId = this.headUrls;
       if (tuserId != null && tuserId.length > 0) {
          int i = 0;
          LiveRoomSignalMessage$AuctionBidInfo theadUrls = this.headUrls;
          while (i < theadUrls.length) {
             object oobject = theadUrls[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.bidPrice).equals(str)) {
          p0.writeString(4, this.bidPrice);
       }
       tuserId = this.bidCount;
       if (tuserId != null) {
          p0.writeUInt32(5, tuserId);
       }
       super.writeTo(p0);
       return;
    }
}
