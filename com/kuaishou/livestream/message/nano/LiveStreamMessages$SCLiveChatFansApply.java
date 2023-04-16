package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveChatFansApply;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamMessages$SCLiveChatFansApply extends MessageNano	// class@00133e
{
    public long applyUserId;
    public UserInfos$UserInfo applyUserInfo;
    public long authorId;
    public boolean close;
    public long countDownMs;
    public String label;
    public String liveStreamId;
    public int mediaType;
    public static LiveStreamMessages$SCLiveChatFansApply[] _emptyArray;

    public void LiveStreamMessages$SCLiveChatFansApply(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCLiveChatFansApply[] emptyArray(){
       if (LiveStreamMessages$SCLiveChatFansApply._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCLiveChatFansApply._emptyArray == null) {
             LiveStreamMessages$SCLiveChatFansApply[] sCLiveChatFa = new LiveStreamMessages$SCLiveChatFansApply[0];
             LiveStreamMessages$SCLiveChatFansApply._emptyArray = sCLiveChatFa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCLiveChatFansApply._emptyArray;
    }
    public static LiveStreamMessages$SCLiveChatFansApply parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCLiveChatFansApply().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCLiveChatFansApply parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCLiveChatFansApply(), p0);
    }
    public LiveStreamMessages$SCLiveChatFansApply clear(){
       this.liveStreamId = "";
       this.authorId = 0;
       this.applyUserInfo = null;
       this.applyUserId = 0;
       this.label = "";
       this.countDownMs = 0;
       this.close = false;
       this.mediaType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       LiveStreamMessages$SCLiveChatFansApply tauthorId = this.authorId;
       if (tauthorId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tauthorId);
       }
       LiveStreamMessages$SCLiveChatFansApply tapplyUserIn = this.applyUserInfo;
       if (tapplyUserIn != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tapplyUserIn);
       }
       tauthorId = this.applyUserId;
       if (tauthorId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tauthorId);
       }
       if (!(this.label).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.label);
       }
       tapplyUserIn = this.countDownMs;
       if (tapplyUserIn) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tapplyUserIn);
       }
       tapplyUserIn = this.close;
       if (tapplyUserIn != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, tapplyUserIn);
       }
       tapplyUserIn = this.mediaType;
       if (tapplyUserIn != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, tapplyUserIn);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCLiveChatFansApply mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 42) {
                         if (i != 48) {
                            if (i != 56) {
                               if (i != 64) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
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
                               this.close = p0.readBool();
                            }
                         }else {
                            this.countDownMs = p0.readUInt64();
                         }
                      }else {
                         this.label = p0.readString();
                      }
                   }else {
                      this.applyUserId = p0.readUInt64();
                   }
                }else if(this.applyUserInfo == null){
                   this.applyUserInfo = new UserInfos$UserInfo();
                }
                p0.readMessage(this.applyUserInfo);
             }else {
                this.authorId = p0.readUInt64();
             }
          }else {
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(1, this.liveStreamId);
       }
       LiveStreamMessages$SCLiveChatFansApply tauthorId = this.authorId;
       if (tauthorId) {
          p0.writeUInt64(2, tauthorId);
       }
       LiveStreamMessages$SCLiveChatFansApply tapplyUserIn = this.applyUserInfo;
       if (tapplyUserIn != null) {
          p0.writeMessage(3, tapplyUserIn);
       }
       tauthorId = this.applyUserId;
       if (tauthorId) {
          p0.writeUInt64(4, tauthorId);
       }
       if (!(this.label).equals(str)) {
          p0.writeString(5, this.label);
       }
       tapplyUserIn = this.countDownMs;
       if (tapplyUserIn) {
          p0.writeUInt64(6, tapplyUserIn);
       }
       tapplyUserIn = this.close;
       if (tapplyUserIn != null) {
          p0.writeBool(7, tapplyUserIn);
       }
       tapplyUserIn = this.mediaType;
       if (tapplyUserIn != null) {
          p0.writeInt32(8, tapplyUserIn);
       }
       super.writeTo(p0);
       return;
    }
}
