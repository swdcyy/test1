package com.kuaishou.protobuf.livestream.nano.InteractiveChatUserInfoIdentity;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatUserCommonInfo;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class InteractiveChatUserInfoIdentity extends MessageNano	// class@000c1d
{
    public String liveStreamId;
    public int mediaType;
    public String sessionId;
    public InteractiveChatUserCommonInfo userCommonInfo;
    public String userExtraInfo;
    public UserInfos$UserInfo userInfo;
    public static InteractiveChatUserInfoIdentity[] _emptyArray;

    public void InteractiveChatUserInfoIdentity(){
       super();
       this.clear();
    }
    public static InteractiveChatUserInfoIdentity[] emptyArray(){
       if (InteractiveChatUserInfoIdentity._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (InteractiveChatUserInfoIdentity._emptyArray == null) {
             InteractiveChatUserInfoIdentity[] interactiveC = new InteractiveChatUserInfoIdentity[0];
             InteractiveChatUserInfoIdentity._emptyArray = interactiveC;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return InteractiveChatUserInfoIdentity._emptyArray;
    }
    public static InteractiveChatUserInfoIdentity parseFrom(CodedInputByteBufferNano p0){
       return new InteractiveChatUserInfoIdentity().mergeFrom(p0);
    }
    public static InteractiveChatUserInfoIdentity parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new InteractiveChatUserInfoIdentity(), p0);
    }
    public InteractiveChatUserInfoIdentity clear(){
       this.userInfo = null;
       this.sessionId = "";
       this.mediaType = 0;
       this.userExtraInfo = "";
       this.liveStreamId = "";
       this.userCommonInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       InteractiveChatUserInfoIdentity tuserInfo = this.userInfo;
       if (tuserInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tuserInfo);
       }
       String str = "";
       if (!(this.sessionId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.sessionId);
       }
       tuserInfo = this.mediaType;
       if (tuserInfo != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tuserInfo);
       }
       if (!(this.userExtraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.userExtraInfo);
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.liveStreamId);
       }
       tuserInfo = this.userCommonInfo;
       if (tuserInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, tuserInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public InteractiveChatUserInfoIdentity mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 50) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else if(this.userCommonInfo == null){
                            this.userCommonInfo = new InteractiveChatUserCommonInfo();
                         }
                         p0.readMessage(this.userCommonInfo);
                      }else {
                         this.liveStreamId = p0.readString();
                      }
                   }else {
                      this.userExtraInfo = p0.readString();
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && i != 2)) {
                      continue ;
                   }else {
                      this.mediaType = i;
                   }
                }
             }else {
                this.sessionId = p0.readString();
             }
          }else if(this.userInfo == null){
             this.userInfo = new UserInfos$UserInfo();
          }
          p0.readMessage(this.userInfo);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       InteractiveChatUserInfoIdentity tuserInfo = this.userInfo;
       if (tuserInfo != null) {
          p0.writeMessage(1, tuserInfo);
       }
       String str = "";
       if (!(this.sessionId).equals(str)) {
          p0.writeString(2, this.sessionId);
       }
       tuserInfo = this.mediaType;
       if (tuserInfo != null) {
          p0.writeInt32(3, tuserInfo);
       }
       if (!(this.userExtraInfo).equals(str)) {
          p0.writeString(4, this.userExtraInfo);
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(5, this.liveStreamId);
       }
       tuserInfo = this.userCommonInfo;
       if (tuserInfo != null) {
          p0.writeMessage(6, tuserInfo);
       }
       super.writeTo(p0);
       return;
    }
}
