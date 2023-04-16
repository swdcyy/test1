package com.kuaishou.livestream.message.nano.LiveChatMessageProto$LiveChatUserApplyInfoFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveChatMessageProto$LiveChatUserApplyInfoFeed extends MessageNano	// class@001138
{
    public String id;
    public boolean isGuestSupportMultiChat;
    public int mediaTypeValue;
    public long sortRank;
    public UserInfos$UserInfo user;
    public LiveAudienceState userState;
    public static LiveChatMessageProto$LiveChatUserApplyInfoFeed[] _emptyArray;

    public void LiveChatMessageProto$LiveChatUserApplyInfoFeed(){
       super();
       this.clear();
    }
    public static LiveChatMessageProto$LiveChatUserApplyInfoFeed[] emptyArray(){
       if (LiveChatMessageProto$LiveChatUserApplyInfoFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveChatMessageProto$LiveChatUserApplyInfoFeed._emptyArray == null) {
             LiveChatMessageProto$LiveChatUserApplyInfoFeed[] liveChatUser = new LiveChatMessageProto$LiveChatUserApplyInfoFeed[0];
             LiveChatMessageProto$LiveChatUserApplyInfoFeed._emptyArray = liveChatUser;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveChatMessageProto$LiveChatUserApplyInfoFeed._emptyArray;
    }
    public static LiveChatMessageProto$LiveChatUserApplyInfoFeed parseFrom(CodedInputByteBufferNano p0){
       return new LiveChatMessageProto$LiveChatUserApplyInfoFeed().mergeFrom(p0);
    }
    public static LiveChatMessageProto$LiveChatUserApplyInfoFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveChatMessageProto$LiveChatUserApplyInfoFeed(), p0);
    }
    public LiveChatMessageProto$LiveChatUserApplyInfoFeed clear(){
       this.id = "";
       this.user = null;
       this.sortRank = 0;
       this.isGuestSupportMultiChat = false;
       this.mediaTypeValue = 0;
       this.userState = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.id).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       LiveChatMessageProto$LiveChatUserApplyInfoFeed tuser = this.user;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tuser);
       }
       tuser = this.sortRank;
       if (tuser) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tuser);
       }
       tuser = this.isGuestSupportMultiChat;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, tuser);
       }
       tuser = this.mediaTypeValue;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tuser);
       }
       tuser = this.userState;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, tuser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveChatMessageProto$LiveChatUserApplyInfoFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 50) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else if(this.userState == null){
                            this.userState = new LiveAudienceState();
                         }
                         p0.readMessage(this.userState);
                      }else {
                         this.mediaTypeValue = p0.readUInt32();
                      }
                   }else {
                      this.isGuestSupportMultiChat = p0.readBool();
                   }
                }else {
                   this.sortRank = p0.readUInt64();
                }
             }else if(this.user == null){
                this.user = new UserInfos$UserInfo();
             }
             p0.readMessage(this.user);
          }else {
             this.id = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.id).equals("")) {
          p0.writeString(1, this.id);
       }
       LiveChatMessageProto$LiveChatUserApplyInfoFeed tuser = this.user;
       if (tuser != null) {
          p0.writeMessage(2, tuser);
       }
       tuser = this.sortRank;
       if (tuser) {
          p0.writeUInt64(3, tuser);
       }
       tuser = this.isGuestSupportMultiChat;
       if (tuser != null) {
          p0.writeBool(4, tuser);
       }
       tuser = this.mediaTypeValue;
       if (tuser != null) {
          p0.writeUInt32(5, tuser);
       }
       tuser = this.userState;
       if (tuser != null) {
          p0.writeMessage(6, tuser);
       }
       super.writeTo(p0);
       return;
    }
}
