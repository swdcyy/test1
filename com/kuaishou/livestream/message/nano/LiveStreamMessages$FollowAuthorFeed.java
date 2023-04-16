package com.kuaishou.livestream.message.nano.LiveStreamMessages$FollowAuthorFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$FollowAuthorShareInfo;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamMessages$FollowAuthorFeed extends MessageNano	// class@0012d4
{
    public UserInfos$UserInfo fans;
    public int followAuthorSource;
    public String id;
    public boolean isKoi;
    public int liveAssistantType;
    public LiveAudienceState senderState;
    public LiveStreamMessages$FollowAuthorShareInfo shareInfo;
    public long sortRank;
    public long time;
    public static LiveStreamMessages$FollowAuthorFeed[] _emptyArray;

    public void LiveStreamMessages$FollowAuthorFeed(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$FollowAuthorFeed[] emptyArray(){
       if (LiveStreamMessages$FollowAuthorFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$FollowAuthorFeed._emptyArray == null) {
             LiveStreamMessages$FollowAuthorFeed[] uFollowAutho = new LiveStreamMessages$FollowAuthorFeed[0];
             LiveStreamMessages$FollowAuthorFeed._emptyArray = uFollowAutho;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$FollowAuthorFeed._emptyArray;
    }
    public static LiveStreamMessages$FollowAuthorFeed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$FollowAuthorFeed().mergeFrom(p0);
    }
    public static LiveStreamMessages$FollowAuthorFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$FollowAuthorFeed(), p0);
    }
    public LiveStreamMessages$FollowAuthorFeed clear(){
       this.id = "";
       this.fans = null;
       this.time = 0;
       this.sortRank = 0;
       this.liveAssistantType = 0;
       this.isKoi = false;
       this.senderState = null;
       this.shareInfo = null;
       this.followAuthorSource = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.id).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       LiveStreamMessages$FollowAuthorFeed tuFollowAuth = this.fans;
       if (tuFollowAuth != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tuFollowAuth);
       }
       tuFollowAuth = this.time;
       int i1 = 0;
       if (tuFollowAuth - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tuFollowAuth);
       }
       tuFollowAuth = this.sortRank;
       if (tuFollowAuth - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tuFollowAuth);
       }
       tuFollowAuth = this.liveAssistantType;
       if (tuFollowAuth != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tuFollowAuth);
       }
       tuFollowAuth = this.isKoi;
       if (tuFollowAuth != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, tuFollowAuth);
       }
       tuFollowAuth = this.senderState;
       if (tuFollowAuth != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, tuFollowAuth);
       }
       tuFollowAuth = this.shareInfo;
       if (tuFollowAuth != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, tuFollowAuth);
       }
       tuFollowAuth = this.followAuthorSource;
       if (tuFollowAuth != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(9, tuFollowAuth);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$FollowAuthorFeed mergeFrom(CodedInputByteBufferNano p0){
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
                               if (i != 66) {
                                  if (i != 72) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     i = p0.readInt32();
                                     if (i && (i != 1 && (i != 2 && i != 3))) {
                                        continue ;
                                     }else {
                                        this.followAuthorSource = i;
                                     }
                                  }
                               }else if(this.shareInfo == null){
                                  this.shareInfo = new LiveStreamMessages$FollowAuthorShareInfo();
                               }
                               p0.readMessage(this.shareInfo);
                            }else if(this.senderState == null){
                               this.senderState = new LiveAudienceState();
                            }
                            p0.readMessage(this.senderState);
                         }else {
                            this.isKoi = p0.readBool();
                         }
                      }else {
                         i = p0.readInt32();
                         if (i && (i != 1 && i != 2)) {
                            continue ;
                         }else {
                            this.liveAssistantType = i;
                         }
                      }
                   }else {
                      this.sortRank = p0.readUInt64();
                   }
                }else {
                   this.time = p0.readUInt64();
                }
             }else if(this.fans == null){
                this.fans = new UserInfos$UserInfo();
             }
             p0.readMessage(this.fans);
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
       LiveStreamMessages$FollowAuthorFeed tuFollowAuth = this.fans;
       if (tuFollowAuth != null) {
          p0.writeMessage(2, tuFollowAuth);
       }
       tuFollowAuth = this.time;
       int i = 0;
       if (tuFollowAuth - i) {
          p0.writeUInt64(3, tuFollowAuth);
       }
       tuFollowAuth = this.sortRank;
       if (tuFollowAuth - i) {
          p0.writeUInt64(4, tuFollowAuth);
       }
       tuFollowAuth = this.liveAssistantType;
       if (tuFollowAuth != null) {
          p0.writeInt32(5, tuFollowAuth);
       }
       tuFollowAuth = this.isKoi;
       if (tuFollowAuth != null) {
          p0.writeBool(6, tuFollowAuth);
       }
       tuFollowAuth = this.senderState;
       if (tuFollowAuth != null) {
          p0.writeMessage(7, tuFollowAuth);
       }
       tuFollowAuth = this.shareInfo;
       if (tuFollowAuth != null) {
          p0.writeMessage(8, tuFollowAuth);
       }
       tuFollowAuth = this.followAuthorSource;
       if (tuFollowAuth != null) {
          p0.writeInt32(9, tuFollowAuth);
       }
       super.writeTo(p0);
       return;
    }
}
