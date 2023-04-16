package com.kuaishou.protobuf.livestream.nano.LiveFollowProto$FollowPopupUserInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveFollowProto$FollowPopupUserInfo extends MessageNano	// class@000c8a
{
    public String note;
    public UserInfos$UserInfo userBaseInfo;
    public static LiveFollowProto$FollowPopupUserInfo[] _emptyArray;

    public void LiveFollowProto$FollowPopupUserInfo(){
       super();
       this.clear();
    }
    public static LiveFollowProto$FollowPopupUserInfo[] emptyArray(){
       if (LiveFollowProto$FollowPopupUserInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFollowProto$FollowPopupUserInfo._emptyArray == null) {
             LiveFollowProto$FollowPopupUserInfo[] uFollowPopup = new LiveFollowProto$FollowPopupUserInfo[0];
             LiveFollowProto$FollowPopupUserInfo._emptyArray = uFollowPopup;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFollowProto$FollowPopupUserInfo._emptyArray;
    }
    public static LiveFollowProto$FollowPopupUserInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveFollowProto$FollowPopupUserInfo().mergeFrom(p0);
    }
    public static LiveFollowProto$FollowPopupUserInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFollowProto$FollowPopupUserInfo(), p0);
    }
    public LiveFollowProto$FollowPopupUserInfo clear(){
       this.userBaseInfo = null;
       this.note = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveFollowProto$FollowPopupUserInfo tuserBaseInf = this.userBaseInfo;
       if (tuserBaseInf != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tuserBaseInf);
       }
       if (!(this.note).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.note);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFollowProto$FollowPopupUserInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.note = p0.readString();
             }
          }else if(this.userBaseInfo == null){
             this.userBaseInfo = new UserInfos$UserInfo();
          }
          p0.readMessage(this.userBaseInfo);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveFollowProto$FollowPopupUserInfo tuserBaseInf = this.userBaseInfo;
       if (tuserBaseInf != null) {
          p0.writeMessage(1, tuserBaseInf);
       }
       if (!(this.note).equals("")) {
          p0.writeString(2, this.note);
       }
       super.writeTo(p0);
       return;
    }
}
