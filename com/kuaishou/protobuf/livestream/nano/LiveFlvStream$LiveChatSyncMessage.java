package com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveChatSyncMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveFlvStream$LiveChatSyncMessage extends MessageNano	// class@000c67
{
    public String guestId;
    public boolean isConnected;
    public int liveChatRoomId;
    public static LiveFlvStream$LiveChatSyncMessage[] _emptyArray;

    public void LiveFlvStream$LiveChatSyncMessage(){
       super();
       this.clear();
    }
    public static LiveFlvStream$LiveChatSyncMessage[] emptyArray(){
       if (LiveFlvStream$LiveChatSyncMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFlvStream$LiveChatSyncMessage._emptyArray == null) {
             LiveFlvStream$LiveChatSyncMessage[] liveChatSync = new LiveFlvStream$LiveChatSyncMessage[0];
             LiveFlvStream$LiveChatSyncMessage._emptyArray = liveChatSync;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFlvStream$LiveChatSyncMessage._emptyArray;
    }
    public static LiveFlvStream$LiveChatSyncMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveFlvStream$LiveChatSyncMessage().mergeFrom(p0);
    }
    public static LiveFlvStream$LiveChatSyncMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFlvStream$LiveChatSyncMessage(), p0);
    }
    public LiveFlvStream$LiveChatSyncMessage clear(){
       this.guestId = "";
       this.isConnected = false;
       this.liveChatRoomId = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.guestId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.guestId);
       }
       LiveFlvStream$LiveChatSyncMessage tisConnected = this.isConnected;
       if (tisConnected != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tisConnected);
       }
       tisConnected = this.liveChatRoomId;
       if (tisConnected != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tisConnected);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFlvStream$LiveChatSyncMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.liveChatRoomId = p0.readUInt32();
                }
             }else {
                this.isConnected = p0.readBool();
             }
          }else {
             this.guestId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.guestId).equals("")) {
          p0.writeString(1, this.guestId);
       }
       LiveFlvStream$LiveChatSyncMessage tisConnected = this.isConnected;
       if (tisConnected != null) {
          p0.writeBool(2, tisConnected);
       }
       tisConnected = this.liveChatRoomId;
       if (tisConnected != null) {
          p0.writeUInt32(3, tisConnected);
       }
       super.writeTo(p0);
       return;
    }
}
