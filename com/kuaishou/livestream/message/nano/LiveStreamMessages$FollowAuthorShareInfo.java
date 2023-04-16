package com.kuaishou.livestream.message.nano.LiveStreamMessages$FollowAuthorShareInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamMessages$FollowAuthorShareInfo extends MessageNano	// class@0012d5
{
    public boolean hasFollowedShareUser;
    public boolean isFromFansGroupShare;
    public boolean isFromShare;
    public UserInfos$UserInfo shareUser;
    public static LiveStreamMessages$FollowAuthorShareInfo[] _emptyArray;

    public void LiveStreamMessages$FollowAuthorShareInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$FollowAuthorShareInfo[] emptyArray(){
       if (LiveStreamMessages$FollowAuthorShareInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$FollowAuthorShareInfo._emptyArray == null) {
             LiveStreamMessages$FollowAuthorShareInfo[] uFollowAutho = new LiveStreamMessages$FollowAuthorShareInfo[0];
             LiveStreamMessages$FollowAuthorShareInfo._emptyArray = uFollowAutho;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$FollowAuthorShareInfo._emptyArray;
    }
    public static LiveStreamMessages$FollowAuthorShareInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$FollowAuthorShareInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$FollowAuthorShareInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$FollowAuthorShareInfo(), p0);
    }
    public LiveStreamMessages$FollowAuthorShareInfo clear(){
       this.isFromShare = false;
       this.isFromFansGroupShare = false;
       this.shareUser = null;
       this.hasFollowedShareUser = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$FollowAuthorShareInfo tisFromShare = this.isFromShare;
       if (tisFromShare != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tisFromShare);
       }
       tisFromShare = this.isFromFansGroupShare;
       if (tisFromShare != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tisFromShare);
       }
       tisFromShare = this.shareUser;
       if (tisFromShare != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tisFromShare);
       }
       tisFromShare = this.hasFollowedShareUser;
       if (tisFromShare != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, tisFromShare);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$FollowAuthorShareInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.hasFollowedShareUser = p0.readBool();
                   }
                }else if(this.shareUser == null){
                   this.shareUser = new UserInfos$UserInfo();
                }
                p0.readMessage(this.shareUser);
             }else {
                this.isFromFansGroupShare = p0.readBool();
             }
          }else {
             this.isFromShare = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$FollowAuthorShareInfo tisFromShare = this.isFromShare;
       if (tisFromShare != null) {
          p0.writeBool(1, tisFromShare);
       }
       tisFromShare = this.isFromFansGroupShare;
       if (tisFromShare != null) {
          p0.writeBool(2, tisFromShare);
       }
       tisFromShare = this.shareUser;
       if (tisFromShare != null) {
          p0.writeMessage(3, tisFromShare);
       }
       tisFromShare = this.hasFollowedShareUser;
       if (tisFromShare != null) {
          p0.writeBool(4, tisFromShare);
       }
       super.writeTo(p0);
       return;
    }
}
