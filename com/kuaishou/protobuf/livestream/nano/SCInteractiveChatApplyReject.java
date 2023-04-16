package com.kuaishou.protobuf.livestream.nano.SCInteractiveChatApplyReject;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatUserInfoIdentity;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatBizIdentity;

public final class SCInteractiveChatApplyReject extends MessageNano	// class@000d34
{
    public UserInfos$UserInfo applicant;
    public InteractiveChatUserInfoIdentity applicantIdentity;
    public InteractiveChatBizIdentity bizIdentity;
    public String extraInfo;
    public UserInfos$UserInfo respondent;
    public InteractiveChatUserInfoIdentity respondentIdentity;
    public long timestamp;
    public static SCInteractiveChatApplyReject[] _emptyArray;

    public void SCInteractiveChatApplyReject(){
       super();
       this.clear();
    }
    public static SCInteractiveChatApplyReject[] emptyArray(){
       if (SCInteractiveChatApplyReject._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCInteractiveChatApplyReject._emptyArray == null) {
             SCInteractiveChatApplyReject[] sCInteractiv = new SCInteractiveChatApplyReject[0];
             SCInteractiveChatApplyReject._emptyArray = sCInteractiv;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCInteractiveChatApplyReject._emptyArray;
    }
    public static SCInteractiveChatApplyReject parseFrom(CodedInputByteBufferNano p0){
       return new SCInteractiveChatApplyReject().mergeFrom(p0);
    }
    public static SCInteractiveChatApplyReject parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCInteractiveChatApplyReject(), p0);
    }
    public SCInteractiveChatApplyReject clear(){
       this.bizIdentity = null;
       this.applicant = null;
       this.respondent = null;
       this.extraInfo = "";
       this.timestamp = 0;
       this.applicantIdentity = null;
       this.respondentIdentity = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCInteractiveChatApplyReject tbizIdentity = this.bizIdentity;
       if (tbizIdentity != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tbizIdentity);
       }
       tbizIdentity = this.applicant;
       if (tbizIdentity != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tbizIdentity);
       }
       tbizIdentity = this.respondent;
       if (tbizIdentity != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tbizIdentity);
       }
       if (!(this.extraInfo).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.extraInfo);
       }
       tbizIdentity = this.timestamp;
       if (tbizIdentity) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tbizIdentity);
       }
       tbizIdentity = this.applicantIdentity;
       if (tbizIdentity != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, tbizIdentity);
       }
       tbizIdentity = this.respondentIdentity;
       if (tbizIdentity != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, tbizIdentity);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCInteractiveChatApplyReject mergeFrom(CodedInputByteBufferNano p0){
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
                         if (i != 50) {
                            if (i != 58) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else if(this.respondentIdentity == null){
                               this.respondentIdentity = new InteractiveChatUserInfoIdentity();
                            }
                            p0.readMessage(this.respondentIdentity);
                         }else if(this.applicantIdentity == null){
                            this.applicantIdentity = new InteractiveChatUserInfoIdentity();
                         }
                         p0.readMessage(this.applicantIdentity);
                      }else {
                         this.timestamp = p0.readUInt64();
                      }
                   }else {
                      this.extraInfo = p0.readString();
                   }
                }else if(this.respondent == null){
                   this.respondent = new UserInfos$UserInfo();
                }
                p0.readMessage(this.respondent);
             }else if(this.applicant == null){
                this.applicant = new UserInfos$UserInfo();
             }
             p0.readMessage(this.applicant);
          }else if(this.bizIdentity == null){
             this.bizIdentity = new InteractiveChatBizIdentity();
          }
          p0.readMessage(this.bizIdentity);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCInteractiveChatApplyReject tbizIdentity = this.bizIdentity;
       if (tbizIdentity != null) {
          p0.writeMessage(1, tbizIdentity);
       }
       tbizIdentity = this.applicant;
       if (tbizIdentity != null) {
          p0.writeMessage(2, tbizIdentity);
       }
       tbizIdentity = this.respondent;
       if (tbizIdentity != null) {
          p0.writeMessage(3, tbizIdentity);
       }
       if (!(this.extraInfo).equals("")) {
          p0.writeString(4, this.extraInfo);
       }
       tbizIdentity = this.timestamp;
       if (tbizIdentity) {
          p0.writeUInt64(5, tbizIdentity);
       }
       tbizIdentity = this.applicantIdentity;
       if (tbizIdentity != null) {
          p0.writeMessage(6, tbizIdentity);
       }
       tbizIdentity = this.respondentIdentity;
       if (tbizIdentity != null) {
          p0.writeMessage(7, tbizIdentity);
       }
       super.writeTo(p0);
       return;
    }
}
