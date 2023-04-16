package com.kuaishou.protobuf.livestream.nano.LiveMultiPkContinueInviteUserInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.BountyGameDivisionInfo;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveMultiPkContinueInviteUserInfo extends MessageNano	// class@000cbb
{
    public BountyGameDivisionInfo bountyGameDivisionInfo;
    public String onlineUserCount;
    public UserInfos$UserInfo userInfo;
    public static LiveMultiPkContinueInviteUserInfo[] _emptyArray;

    public void LiveMultiPkContinueInviteUserInfo(){
       super();
       this.clear();
    }
    public static LiveMultiPkContinueInviteUserInfo[] emptyArray(){
       if (LiveMultiPkContinueInviteUserInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMultiPkContinueInviteUserInfo._emptyArray == null) {
             LiveMultiPkContinueInviteUserInfo[] liveMultiPkC = new LiveMultiPkContinueInviteUserInfo[0];
             LiveMultiPkContinueInviteUserInfo._emptyArray = liveMultiPkC;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMultiPkContinueInviteUserInfo._emptyArray;
    }
    public static LiveMultiPkContinueInviteUserInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveMultiPkContinueInviteUserInfo().mergeFrom(p0);
    }
    public static LiveMultiPkContinueInviteUserInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMultiPkContinueInviteUserInfo(), p0);
    }
    public LiveMultiPkContinueInviteUserInfo clear(){
       this.userInfo = null;
       this.onlineUserCount = "";
       this.bountyGameDivisionInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveMultiPkContinueInviteUserInfo tuserInfo = this.userInfo;
       if (tuserInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tuserInfo);
       }
       if (!(this.onlineUserCount).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.onlineUserCount);
       }
       tuserInfo = this.bountyGameDivisionInfo;
       if (tuserInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tuserInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveMultiPkContinueInviteUserInfo mergeFrom(CodedInputByteBufferNano p0){
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
                }else if(this.bountyGameDivisionInfo == null){
                   this.bountyGameDivisionInfo = new BountyGameDivisionInfo();
                }
                p0.readMessage(this.bountyGameDivisionInfo);
             }else {
                this.onlineUserCount = p0.readString();
             }
          }else if(this.userInfo == null){
             this.userInfo = new UserInfos$UserInfo();
          }
          p0.readMessage(this.userInfo);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveMultiPkContinueInviteUserInfo tuserInfo = this.userInfo;
       if (tuserInfo != null) {
          p0.writeMessage(1, tuserInfo);
       }
       if (!(this.onlineUserCount).equals("")) {
          p0.writeString(2, this.onlineUserCount);
       }
       tuserInfo = this.bountyGameDivisionInfo;
       if (tuserInfo != null) {
          p0.writeMessage(3, tuserInfo);
       }
       super.writeTo(p0);
       return;
    }
}
