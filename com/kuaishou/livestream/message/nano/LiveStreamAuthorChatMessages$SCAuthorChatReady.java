package com.kuaishou.livestream.message.nano.LiveStreamAuthorChatMessages$SCAuthorChatReady;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveShopMessages$LiveInteractiveRoomShopCartStatus;
import com.kuaishou.livestream.message.nano.LiveStreamAuthorChatMessages$AuthorChatPlayerInfo;

public final class LiveStreamAuthorChatMessages$SCAuthorChatReady extends MessageNano	// class@0012bb
{
    public LiveStreamAuthorChatMessages$AuthorChatPlayerInfo anotherAuthorInfo;
    public String authorChatId;
    public LiveShopMessages$LiveInteractiveRoomShopCartStatus shopCartStatus;
    public static LiveStreamAuthorChatMessages$SCAuthorChatReady[] _emptyArray;

    public void LiveStreamAuthorChatMessages$SCAuthorChatReady(){
       super();
       this.clear();
    }
    public static LiveStreamAuthorChatMessages$SCAuthorChatReady[] emptyArray(){
       if (LiveStreamAuthorChatMessages$SCAuthorChatReady._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamAuthorChatMessages$SCAuthorChatReady._emptyArray == null) {
             LiveStreamAuthorChatMessages$SCAuthorChatReady[] sCAuthorChat = new LiveStreamAuthorChatMessages$SCAuthorChatReady[0];
             LiveStreamAuthorChatMessages$SCAuthorChatReady._emptyArray = sCAuthorChat;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamAuthorChatMessages$SCAuthorChatReady._emptyArray;
    }
    public static LiveStreamAuthorChatMessages$SCAuthorChatReady parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamAuthorChatMessages$SCAuthorChatReady().mergeFrom(p0);
    }
    public static LiveStreamAuthorChatMessages$SCAuthorChatReady parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamAuthorChatMessages$SCAuthorChatReady(), p0);
    }
    public LiveStreamAuthorChatMessages$SCAuthorChatReady clear(){
       this.authorChatId = "";
       this.anotherAuthorInfo = null;
       this.shopCartStatus = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.authorChatId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.authorChatId);
       }
       LiveStreamAuthorChatMessages$SCAuthorChatReady tanotherAuth = this.anotherAuthorInfo;
       if (tanotherAuth != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tanotherAuth);
       }
       tanotherAuth = this.shopCartStatus;
       if (tanotherAuth != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tanotherAuth);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamAuthorChatMessages$SCAuthorChatReady mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else if(this.shopCartStatus == null){
                   this.shopCartStatus = new LiveShopMessages$LiveInteractiveRoomShopCartStatus();
                }
                p0.readMessage(this.shopCartStatus);
             }else if(this.anotherAuthorInfo == null){
                this.anotherAuthorInfo = new LiveStreamAuthorChatMessages$AuthorChatPlayerInfo();
             }
             p0.readMessage(this.anotherAuthorInfo);
          }else {
             this.authorChatId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.authorChatId).equals("")) {
          p0.writeString(1, this.authorChatId);
       }
       LiveStreamAuthorChatMessages$SCAuthorChatReady tanotherAuth = this.anotherAuthorInfo;
       if (tanotherAuth != null) {
          p0.writeMessage(2, tanotherAuth);
       }
       tanotherAuth = this.shopCartStatus;
       if (tanotherAuth != null) {
          p0.writeMessage(3, tanotherAuth);
       }
       super.writeTo(p0);
       return;
    }
}
