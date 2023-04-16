package com.kuaishou.livestream.message.nano.LiveFansTopOrderHelpBuyFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveFansTopOrderHelpBuyFeed extends MessageNano	// class@0011b4
{
    public long authorId;
    public String id;
    public String liveStreamId;
    public UserInfos$UserInfo user;
    public long userId;
    public LiveAudienceState userState;
    public static LiveFansTopOrderHelpBuyFeed[] _emptyArray;

    public void LiveFansTopOrderHelpBuyFeed(){
       super();
       this.clear();
    }
    public static LiveFansTopOrderHelpBuyFeed[] emptyArray(){
       if (LiveFansTopOrderHelpBuyFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFansTopOrderHelpBuyFeed._emptyArray == null) {
             LiveFansTopOrderHelpBuyFeed[] liveFansTopO = new LiveFansTopOrderHelpBuyFeed[0];
             LiveFansTopOrderHelpBuyFeed._emptyArray = liveFansTopO;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFansTopOrderHelpBuyFeed._emptyArray;
    }
    public static LiveFansTopOrderHelpBuyFeed parseFrom(CodedInputByteBufferNano p0){
       return new LiveFansTopOrderHelpBuyFeed().mergeFrom(p0);
    }
    public static LiveFansTopOrderHelpBuyFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFansTopOrderHelpBuyFeed(), p0);
    }
    public LiveFansTopOrderHelpBuyFeed clear(){
       this.userId = 0;
       this.user = null;
       this.liveStreamId = "";
       this.authorId = 0;
       this.userState = null;
       this.id = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveFansTopOrderHelpBuyFeed tuserId = this.userId;
       int i1 = 0;
       if (tuserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tuserId);
       }
       tuserId = this.user;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tuserId);
       }
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.liveStreamId);
       }
       LiveFansTopOrderHelpBuyFeed tauthorId = this.authorId;
       if (tauthorId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tauthorId);
       }
       tuserId = this.userState;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, tuserId);
       }
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.id);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFansTopOrderHelpBuyFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 42) {
                         if (i != 50) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.id = p0.readString();
                         }
                      }else if(this.userState == null){
                         this.userState = new LiveAudienceState();
                      }
                      p0.readMessage(this.userState);
                   }else {
                      this.authorId = p0.readUInt64();
                   }
                }else {
                   this.liveStreamId = p0.readString();
                }
             }else if(this.user == null){
                this.user = new UserInfos$UserInfo();
             }
             p0.readMessage(this.user);
          }else {
             this.userId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveFansTopOrderHelpBuyFeed tuserId = this.userId;
       int i = 0;
       if (tuserId - i) {
          p0.writeUInt64(1, tuserId);
       }
       tuserId = this.user;
       if (tuserId != null) {
          p0.writeMessage(2, tuserId);
       }
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(3, this.liveStreamId);
       }
       LiveFansTopOrderHelpBuyFeed tauthorId = this.authorId;
       if (tauthorId - i) {
          p0.writeUInt64(4, tauthorId);
       }
       tuserId = this.userState;
       if (tuserId != null) {
          p0.writeMessage(5, tuserId);
       }
       if (!(this.id).equals(str)) {
          p0.writeString(6, this.id);
       }
       super.writeTo(p0);
       return;
    }
}
