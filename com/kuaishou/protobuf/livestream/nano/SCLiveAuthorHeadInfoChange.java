package com.kuaishou.protobuf.livestream.nano.SCLiveAuthorHeadInfoChange;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class SCLiveAuthorHeadInfoChange extends MessageNano	// class@000d42
{
    public int changeType;
    public UserInfos$UserInfo targetUserInfo;
    public String title;
    public static SCLiveAuthorHeadInfoChange[] _emptyArray;

    public void SCLiveAuthorHeadInfoChange(){
       super();
       this.clear();
    }
    public static SCLiveAuthorHeadInfoChange[] emptyArray(){
       if (SCLiveAuthorHeadInfoChange._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveAuthorHeadInfoChange._emptyArray == null) {
             SCLiveAuthorHeadInfoChange[] sCLiveAuthor = new SCLiveAuthorHeadInfoChange[0];
             SCLiveAuthorHeadInfoChange._emptyArray = sCLiveAuthor;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveAuthorHeadInfoChange._emptyArray;
    }
    public static SCLiveAuthorHeadInfoChange parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveAuthorHeadInfoChange().mergeFrom(p0);
    }
    public static SCLiveAuthorHeadInfoChange parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveAuthorHeadInfoChange(), p0);
    }
    public SCLiveAuthorHeadInfoChange clear(){
       this.changeType = 0;
       this.targetUserInfo = null;
       this.title = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveAuthorHeadInfoChange tchangeType = this.changeType;
       if (tchangeType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tchangeType);
       }
       tchangeType = this.targetUserInfo;
       if (tchangeType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tchangeType);
       }
       if (!(this.title).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.title);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveAuthorHeadInfoChange mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.title = p0.readString();
                }
             }else if(this.targetUserInfo == null){
                this.targetUserInfo = new UserInfos$UserInfo();
             }
             p0.readMessage(this.targetUserInfo);
          }else {
             this.changeType = p0.readInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCLiveAuthorHeadInfoChange tchangeType = this.changeType;
       if (tchangeType != null) {
          p0.writeInt32(1, tchangeType);
       }
       tchangeType = this.targetUserInfo;
       if (tchangeType != null) {
          p0.writeMessage(2, tchangeType);
       }
       if (!(this.title).equals("")) {
          p0.writeString(3, this.title);
       }
       super.writeTo(p0);
       return;
    }
}
