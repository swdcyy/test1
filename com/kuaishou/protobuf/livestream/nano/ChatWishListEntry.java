package com.kuaishou.protobuf.livestream.nano.ChatWishListEntry;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ChatWishListEntry extends MessageNano	// class@000c0a
{
    public String color;
    public long currentCount;
    public String displayCurrentCount;
    public String displayExpectCount;
    public long expectCount;
    public int giftId;
    public String wishId;
    public static ChatWishListEntry[] _emptyArray;

    public void ChatWishListEntry(){
       super();
       this.clear();
    }
    public static ChatWishListEntry[] emptyArray(){
       if (ChatWishListEntry._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ChatWishListEntry._emptyArray == null) {
             ChatWishListEntry[] uChatWishLis = new ChatWishListEntry[0];
             ChatWishListEntry._emptyArray = uChatWishLis;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ChatWishListEntry._emptyArray;
    }
    public static ChatWishListEntry parseFrom(CodedInputByteBufferNano p0){
       return new ChatWishListEntry().mergeFrom(p0);
    }
    public static ChatWishListEntry parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ChatWishListEntry(), p0);
    }
    public ChatWishListEntry clear(){
       this.wishId = "";
       this.giftId = 0;
       this.expectCount = 0;
       this.currentCount = 0;
       this.displayExpectCount = "";
       this.displayCurrentCount = "";
       this.color = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.wishId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.wishId);
       }
       ChatWishListEntry tgiftId = this.giftId;
       if (tgiftId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tgiftId);
       }
       ChatWishListEntry texpectCount = this.expectCount;
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
       if (!(this.color).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.color);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ChatWishListEntry mergeFrom(CodedInputByteBufferNano p0){
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
                            if (i != 58) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.color = p0.readString();
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
       ChatWishListEntry tgiftId = this.giftId;
       if (tgiftId != null) {
          p0.writeUInt32(2, tgiftId);
       }
       ChatWishListEntry texpectCount = this.expectCount;
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
       if (!(this.color).equals(str)) {
          p0.writeString(7, this.color);
       }
       super.writeTo(p0);
       return;
    }
}
