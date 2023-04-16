package com.kuaishou.protobuf.livestream.nano.ChatWishList;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.ChatWishListEntry;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class ChatWishList extends MessageNano	// class@000c09
{
    public ChatWishListEntry[] entryList;
    public String wishListId;
    public static ChatWishList[] _emptyArray;

    public void ChatWishList(){
       super();
       this.clear();
    }
    public static ChatWishList[] emptyArray(){
       if (ChatWishList._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ChatWishList._emptyArray == null) {
             ChatWishList[] uChatWishLis = new ChatWishList[0];
             ChatWishList._emptyArray = uChatWishLis;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ChatWishList._emptyArray;
    }
    public static ChatWishList parseFrom(CodedInputByteBufferNano p0){
       return new ChatWishList().mergeFrom(p0);
    }
    public static ChatWishList parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ChatWishList(), p0);
    }
    public ChatWishList clear(){
       this.wishListId = "";
       this.entryList = ChatWishListEntry.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.wishListId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.wishListId);
       }
       ChatWishList tentryList = this.entryList;
       if (tentryList != null && tentryList.length > 0) {
          int i1 = 0;
          ChatWishList tentryList1 = this.entryList;
          while (i1 < tentryList1.length) {
             object oobject = tentryList1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ChatWishList mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             int i1 = 18;
             if (i != i1) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                ChatWishList tentryList = this.entryList;
                int i2 = (tentryList == null)? 0: tentryList.length;
                i = i + i2;
                ChatWishListEntry[] uChatWishLis = new ChatWishListEntry[i];
                if (i2) {
                   System.arraycopy(tentryList, 0, uChatWishLis, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uChatWishLis[i2] = new ChatWishListEntry();
                   p0.readMessage(uChatWishLis[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uChatWishLis[i2] = new ChatWishListEntry();
                p0.readMessage(uChatWishLis[i2]);
                this.entryList = uChatWishLis;
             }
          }else {
             this.wishListId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.wishListId).equals("")) {
          p0.writeString(1, this.wishListId);
       }
       ChatWishList tentryList = this.entryList;
       if (tentryList != null && tentryList.length > 0) {
          int i = 0;
          ChatWishList tentryList1 = this.entryList;
          while (i < tentryList1.length) {
             object oobject = tentryList1[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
