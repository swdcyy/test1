package com.kuaishou.protobuf.livestream.nano.SCInteractiveChatClosed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatSwitchBizExtraInfo;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatBizIdentity;

public final class SCInteractiveChatClosed extends MessageNano	// class@000d37
{
    public InteractiveChatBizIdentity bizIdentity;
    public InteractiveChatSwitchBizExtraInfo endExtraInfoPb;
    public String extraInfo;
    public long timestamp;
    public String toast;
    public UserInfos$UserInfo userInfo;
    public static SCInteractiveChatClosed[] _emptyArray;

    public void SCInteractiveChatClosed(){
       super();
       this.clear();
    }
    public static SCInteractiveChatClosed[] emptyArray(){
       if (SCInteractiveChatClosed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCInteractiveChatClosed._emptyArray == null) {
             SCInteractiveChatClosed[] sCInteractiv = new SCInteractiveChatClosed[0];
             SCInteractiveChatClosed._emptyArray = sCInteractiv;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCInteractiveChatClosed._emptyArray;
    }
    public static SCInteractiveChatClosed parseFrom(CodedInputByteBufferNano p0){
       return new SCInteractiveChatClosed().mergeFrom(p0);
    }
    public static SCInteractiveChatClosed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCInteractiveChatClosed(), p0);
    }
    public SCInteractiveChatClosed clear(){
       this.bizIdentity = null;
       this.userInfo = null;
       this.extraInfo = "";
       this.timestamp = 0;
       this.toast = "";
       this.endExtraInfoPb = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCInteractiveChatClosed tbizIdentity = this.bizIdentity;
       if (tbizIdentity != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tbizIdentity);
       }
       tbizIdentity = this.userInfo;
       if (tbizIdentity != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tbizIdentity);
       }
       String str = "";
       if (!(this.extraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.extraInfo);
       }
       SCInteractiveChatClosed ttimestamp = this.timestamp;
       if (ttimestamp) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, ttimestamp);
       }
       if (!(this.toast).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.toast);
       }
       tbizIdentity = this.endExtraInfoPb;
       if (tbizIdentity != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, tbizIdentity);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCInteractiveChatClosed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 42) {
                         if (i != 50) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else if(this.endExtraInfoPb == null){
                            this.endExtraInfoPb = new InteractiveChatSwitchBizExtraInfo();
                         }
                         p0.readMessage(this.endExtraInfoPb);
                      }else {
                         this.toast = p0.readString();
                      }
                   }else {
                      this.timestamp = p0.readUInt64();
                   }
                }else {
                   this.extraInfo = p0.readString();
                }
             }else if(this.userInfo == null){
                this.userInfo = new UserInfos$UserInfo();
             }
             p0.readMessage(this.userInfo);
          }else if(this.bizIdentity == null){
             this.bizIdentity = new InteractiveChatBizIdentity();
          }
          p0.readMessage(this.bizIdentity);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCInteractiveChatClosed tbizIdentity = this.bizIdentity;
       if (tbizIdentity != null) {
          p0.writeMessage(1, tbizIdentity);
       }
       tbizIdentity = this.userInfo;
       if (tbizIdentity != null) {
          p0.writeMessage(2, tbizIdentity);
       }
       String str = "";
       if (!(this.extraInfo).equals(str)) {
          p0.writeString(3, this.extraInfo);
       }
       SCInteractiveChatClosed ttimestamp = this.timestamp;
       if (ttimestamp) {
          p0.writeUInt64(4, ttimestamp);
       }
       if (!(this.toast).equals(str)) {
          p0.writeString(5, this.toast);
       }
       tbizIdentity = this.endExtraInfoPb;
       if (tbizIdentity != null) {
          p0.writeMessage(6, tbizIdentity);
       }
       super.writeTo(p0);
       return;
    }
}
