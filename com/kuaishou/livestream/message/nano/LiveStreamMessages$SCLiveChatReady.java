package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveChatReady;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamMessages$SCLiveChatReady extends MessageNano	// class@001340
{
    public boolean allowGuestGift;
    public LiveAudienceState audienceState;
    public UserInfos$UserInfo author;
    public UserInfos$UserInfo guestUser;
    public int liveChatRoomId;
    public int liveGuestAssistantType;
    public int mediaType;
    public int xOffset;
    public int yOffset;
    public static LiveStreamMessages$SCLiveChatReady[] _emptyArray;

    public void LiveStreamMessages$SCLiveChatReady(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCLiveChatReady[] emptyArray(){
       if (LiveStreamMessages$SCLiveChatReady._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCLiveChatReady._emptyArray == null) {
             LiveStreamMessages$SCLiveChatReady[] sCLiveChatRe = new LiveStreamMessages$SCLiveChatReady[0];
             LiveStreamMessages$SCLiveChatReady._emptyArray = sCLiveChatRe;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCLiveChatReady._emptyArray;
    }
    public static LiveStreamMessages$SCLiveChatReady parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCLiveChatReady().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCLiveChatReady parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCLiveChatReady(), p0);
    }
    public LiveStreamMessages$SCLiveChatReady clear(){
       this.author = null;
       this.guestUser = null;
       this.mediaType = 0;
       this.xOffset = 0;
       this.yOffset = 0;
       this.liveGuestAssistantType = 0;
       this.audienceState = null;
       this.allowGuestGift = false;
       this.liveChatRoomId = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCLiveChatReady tauthor = this.author;
       if (tauthor != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tauthor);
       }
       tauthor = this.guestUser;
       if (tauthor != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tauthor);
       }
       tauthor = this.mediaType;
       if (tauthor != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tauthor);
       }
       tauthor = this.xOffset;
       if (tauthor != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tauthor);
       }
       tauthor = this.yOffset;
       if (tauthor != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tauthor);
       }
       tauthor = this.liveGuestAssistantType;
       if (tauthor != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tauthor);
       }
       tauthor = this.audienceState;
       if (tauthor != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, tauthor);
       }
       tauthor = this.allowGuestGift;
       if (tauthor != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(8, tauthor);
       }
       tauthor = this.liveChatRoomId;
       if (tauthor != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(9, tauthor);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCLiveChatReady mergeFrom(CodedInputByteBufferNano p0){
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
                         if (i != 48) {
                            if (i != 58) {
                               if (i != 64) {
                                  if (i != 72) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     this.liveChatRoomId = p0.readUInt32();
                                  }
                               }else {
                                  this.allowGuestGift = p0.readBool();
                               }
                            }else if(this.audienceState == null){
                               this.audienceState = new LiveAudienceState();
                            }
                            p0.readMessage(this.audienceState);
                         }else {
                            i = p0.readInt32();
                            if (i && (i != 1 && i != 2)) {
                               continue ;
                            }else {
                               this.liveGuestAssistantType = i;
                            }
                         }
                      }else {
                         this.yOffset = p0.readInt32();
                      }
                   }else {
                      this.xOffset = p0.readInt32();
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && i != 2)) {
                      continue ;
                   }else {
                      this.mediaType = i;
                   }
                }
             }else if(this.guestUser == null){
                this.guestUser = new UserInfos$UserInfo();
             }
             p0.readMessage(this.guestUser);
          }else if(this.author == null){
             this.author = new UserInfos$UserInfo();
          }
          p0.readMessage(this.author);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCLiveChatReady tauthor = this.author;
       if (tauthor != null) {
          p0.writeMessage(1, tauthor);
       }
       tauthor = this.guestUser;
       if (tauthor != null) {
          p0.writeMessage(2, tauthor);
       }
       tauthor = this.mediaType;
       if (tauthor != null) {
          p0.writeInt32(3, tauthor);
       }
       tauthor = this.xOffset;
       if (tauthor != null) {
          p0.writeInt32(4, tauthor);
       }
       tauthor = this.yOffset;
       if (tauthor != null) {
          p0.writeInt32(5, tauthor);
       }
       tauthor = this.liveGuestAssistantType;
       if (tauthor != null) {
          p0.writeInt32(6, tauthor);
       }
       tauthor = this.audienceState;
       if (tauthor != null) {
          p0.writeMessage(7, tauthor);
       }
       tauthor = this.allowGuestGift;
       if (tauthor != null) {
          p0.writeBool(8, tauthor);
       }
       tauthor = this.liveChatRoomId;
       if (tauthor != null) {
          p0.writeUInt32(9, tauthor);
       }
       super.writeTo(p0);
       return;
    }
}
