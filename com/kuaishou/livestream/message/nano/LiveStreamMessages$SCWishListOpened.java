package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCWishListOpened;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$WishListEntry;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveStreamMessages$SCWishListOpened extends MessageNano	// class@00137a
{
    public long time;
    public LiveStreamMessages$WishListEntry[] wishEntry;
    public String wishListId;
    public static LiveStreamMessages$SCWishListOpened[] _emptyArray;

    public void LiveStreamMessages$SCWishListOpened(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCWishListOpened[] emptyArray(){
       if (LiveStreamMessages$SCWishListOpened._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCWishListOpened._emptyArray == null) {
             LiveStreamMessages$SCWishListOpened[] sCWishListOp = new LiveStreamMessages$SCWishListOpened[0];
             LiveStreamMessages$SCWishListOpened._emptyArray = sCWishListOp;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCWishListOpened._emptyArray;
    }
    public static LiveStreamMessages$SCWishListOpened parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCWishListOpened().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCWishListOpened parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCWishListOpened(), p0);
    }
    public LiveStreamMessages$SCWishListOpened clear(){
       this.time = 0;
       this.wishListId = "";
       this.wishEntry = LiveStreamMessages$WishListEntry.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCWishListOpened ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       if (!(this.wishListId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.wishListId);
       }
       ttime = this.wishEntry;
       if (ttime != null && ttime.length > 0) {
          int i1 = 0;
          LiveStreamMessages$SCWishListOpened twishEntry = this.wishEntry;
          while (i1 < twishEntry.length) {
             object oobject = twishEntry[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCWishListOpened mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                int i1 = 26;
                if (i != i1) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   LiveStreamMessages$SCWishListOpened twishEntry = this.wishEntry;
                   int i2 = (twishEntry == null)? 0: twishEntry.length;
                   i = i + i2;
                   LiveStreamMessages$WishListEntry[] wishListEntr = new LiveStreamMessages$WishListEntry[i];
                   if (i2) {
                      System.arraycopy(twishEntry, 0, wishListEntr, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      wishListEntr[i2] = new LiveStreamMessages$WishListEntry();
                      p0.readMessage(wishListEntr[i2]);
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   wishListEntr[i2] = new LiveStreamMessages$WishListEntry();
                   p0.readMessage(wishListEntr[i2]);
                   this.wishEntry = wishListEntr;
                }
             }else {
                this.wishListId = p0.readString();
             }
          }else {
             this.time = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCWishListOpened ttime = this.time;
       if (ttime) {
          p0.writeUInt64(1, ttime);
       }
       if (!(this.wishListId).equals("")) {
          p0.writeString(2, this.wishListId);
       }
       ttime = this.wishEntry;
       if (ttime != null && ttime.length > 0) {
          int i = 0;
          LiveStreamMessages$SCWishListOpened twishEntry = this.wishEntry;
          while (i < twishEntry.length) {
             object oobject = twishEntry[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
