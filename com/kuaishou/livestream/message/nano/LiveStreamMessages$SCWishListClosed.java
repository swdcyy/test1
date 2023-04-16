package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCWishListClosed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCWishListClosed extends MessageNano	// class@001379
{
    public long time;
    public String wishListId;
    public static LiveStreamMessages$SCWishListClosed[] _emptyArray;

    public void LiveStreamMessages$SCWishListClosed(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCWishListClosed[] emptyArray(){
       if (LiveStreamMessages$SCWishListClosed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCWishListClosed._emptyArray == null) {
             LiveStreamMessages$SCWishListClosed[] sCWishListCl = new LiveStreamMessages$SCWishListClosed[0];
             LiveStreamMessages$SCWishListClosed._emptyArray = sCWishListCl;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCWishListClosed._emptyArray;
    }
    public static LiveStreamMessages$SCWishListClosed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCWishListClosed().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCWishListClosed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCWishListClosed(), p0);
    }
    public LiveStreamMessages$SCWishListClosed clear(){
       this.time = 0;
       this.wishListId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCWishListClosed ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       if (!(this.wishListId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.wishListId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCWishListClosed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
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
       LiveStreamMessages$SCWishListClosed ttime = this.time;
       if (ttime) {
          p0.writeUInt64(1, ttime);
       }
       if (!(this.wishListId).equals("")) {
          p0.writeString(2, this.wishListId);
       }
       super.writeTo(p0);
       return;
    }
}
