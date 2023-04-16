package com.kuaishou.livestream.message.nano.WealthHighGradeBulletComment;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class WealthHighGradeBulletComment extends MessageNano	// class@001488
{
    public String comment;
    public int displayType;
    public String extraInfo;
    public LiveAudienceState senderState;
    public UserInfos$UserInfo user;
    public static WealthHighGradeBulletComment[] _emptyArray;

    public void WealthHighGradeBulletComment(){
       super();
       this.clear();
    }
    public static WealthHighGradeBulletComment[] emptyArray(){
       if (WealthHighGradeBulletComment._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (WealthHighGradeBulletComment._emptyArray == null) {
             WealthHighGradeBulletComment[] wealthHighGr = new WealthHighGradeBulletComment[0];
             WealthHighGradeBulletComment._emptyArray = wealthHighGr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return WealthHighGradeBulletComment._emptyArray;
    }
    public static WealthHighGradeBulletComment parseFrom(CodedInputByteBufferNano p0){
       return new WealthHighGradeBulletComment().mergeFrom(p0);
    }
    public static WealthHighGradeBulletComment parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new WealthHighGradeBulletComment(), p0);
    }
    public WealthHighGradeBulletComment clear(){
       this.user = null;
       this.comment = "";
       this.senderState = null;
       this.extraInfo = "";
       this.displayType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       WealthHighGradeBulletComment tuser = this.user;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tuser);
       }
       String str = "";
       if (!(this.comment).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.comment);
       }
       tuser = this.senderState;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tuser);
       }
       if (!(this.extraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.extraInfo);
       }
       tuser = this.displayType;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tuser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public WealthHighGradeBulletComment mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         i = p0.readInt32();
                         if (i && i != 1) {
                            continue ;
                         }else {
                            this.displayType = i;
                         }
                      }
                   }else {
                      this.extraInfo = p0.readString();
                   }
                }else if(this.senderState == null){
                   this.senderState = new LiveAudienceState();
                }
                p0.readMessage(this.senderState);
             }else {
                this.comment = p0.readString();
             }
          }else if(this.user == null){
             this.user = new UserInfos$UserInfo();
          }
          p0.readMessage(this.user);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       WealthHighGradeBulletComment tuser = this.user;
       if (tuser != null) {
          p0.writeMessage(1, tuser);
       }
       String str = "";
       if (!(this.comment).equals(str)) {
          p0.writeString(2, this.comment);
       }
       tuser = this.senderState;
       if (tuser != null) {
          p0.writeMessage(3, tuser);
       }
       if (!(this.extraInfo).equals(str)) {
          p0.writeString(4, this.extraInfo);
       }
       tuser = this.displayType;
       if (tuser != null) {
          p0.writeInt32(5, tuser);
       }
       super.writeTo(p0);
       return;
    }
}
