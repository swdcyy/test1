package com.kuaishou.livestream.message.nano.LiveStreamMessages$LikeFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamMessages$LikeFeed extends MessageNano	// class@0012df
{
    public String deviceHash;
    public String id;
    public boolean isAnonymous;
    public boolean isKoi;
    public int liveAssistantType;
    public LiveAudienceState senderState;
    public long sortRank;
    public long time;
    public UserInfos$UserInfo user;
    public static LiveStreamMessages$LikeFeed[] _emptyArray;

    public void LiveStreamMessages$LikeFeed(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$LikeFeed[] emptyArray(){
       if (LiveStreamMessages$LikeFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$LikeFeed._emptyArray == null) {
             LiveStreamMessages$LikeFeed[] likeFeedArra = new LiveStreamMessages$LikeFeed[0];
             LiveStreamMessages$LikeFeed._emptyArray = likeFeedArra;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$LikeFeed._emptyArray;
    }
    public static LiveStreamMessages$LikeFeed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$LikeFeed().mergeFrom(p0);
    }
    public static LiveStreamMessages$LikeFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$LikeFeed(), p0);
    }
    public LiveStreamMessages$LikeFeed clear(){
       this.id = "";
       this.user = null;
       this.time = 0;
       this.sortRank = 0;
       this.liveAssistantType = 0;
       this.deviceHash = "";
       this.isKoi = false;
       this.senderState = null;
       this.isAnonymous = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       LiveStreamMessages$LikeFeed tuser = this.user;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tuser);
       }
       LiveStreamMessages$LikeFeed ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ttime);
       }
       ttime = this.sortRank;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, ttime);
       }
       tuser = this.liveAssistantType;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tuser);
       }
       if (!(this.deviceHash).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.deviceHash);
       }
       tuser = this.isKoi;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, tuser);
       }
       tuser = this.senderState;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, tuser);
       }
       tuser = this.isAnonymous;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(9, tuser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$LikeFeed mergeFrom(CodedInputByteBufferNano p0){
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
                            if (i != 56) {
                               if (i != 66) {
                                  if (i != 72) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     this.isAnonymous = p0.readBool();
                                  }
                               }else if(this.senderState == null){
                                  this.senderState = new LiveAudienceState();
                               }
                               p0.readMessage(this.senderState);
                            }else {
                               this.isKoi = p0.readBool();
                            }
                         }else {
                            this.deviceHash = p0.readString();
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
       String str = "";
       if (!(this.id).equals(str)) {
          p0.writeString(1, this.id);
       }
       LiveStreamMessages$LikeFeed tuser = this.user;
       if (tuser != null) {
          p0.writeMessage(2, tuser);
       }
       LiveStreamMessages$LikeFeed ttime = this.time;
       if (ttime) {
          p0.writeUInt64(3, ttime);
       }
       ttime = this.sortRank;
       if (ttime) {
          p0.writeUInt64(4, ttime);
       }
       tuser = this.liveAssistantType;
       if (tuser != null) {
          p0.writeInt32(5, tuser);
       }
       if (!(this.deviceHash).equals(str)) {
          p0.writeString(6, this.deviceHash);
       }
       tuser = this.isKoi;
       if (tuser != null) {
          p0.writeBool(7, tuser);
       }
       tuser = this.senderState;
       if (tuser != null) {
          p0.writeMessage(8, tuser);
       }
       tuser = this.isAnonymous;
       if (tuser != null) {
          p0.writeBool(9, tuser);
       }
       super.writeTo(p0);
       return;
    }
}
