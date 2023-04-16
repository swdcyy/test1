package com.kuaishou.protobuf.livestream.nano.SCInteractiveChatUserInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatUserInfoIdentity;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatBizIdentity;

public final class SCInteractiveChatUserInfo extends MessageNano	// class@000d3d
{
    public InteractiveChatBizIdentity bizIdentity;
    public String extraInfo;
    public long timestamp;
    public InteractiveChatUserInfoIdentity[] userInfo;
    public static SCInteractiveChatUserInfo[] _emptyArray;

    public void SCInteractiveChatUserInfo(){
       super();
       this.clear();
    }
    public static SCInteractiveChatUserInfo[] emptyArray(){
       if (SCInteractiveChatUserInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCInteractiveChatUserInfo._emptyArray == null) {
             SCInteractiveChatUserInfo[] sCInteractiv = new SCInteractiveChatUserInfo[0];
             SCInteractiveChatUserInfo._emptyArray = sCInteractiv;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCInteractiveChatUserInfo._emptyArray;
    }
    public static SCInteractiveChatUserInfo parseFrom(CodedInputByteBufferNano p0){
       return new SCInteractiveChatUserInfo().mergeFrom(p0);
    }
    public static SCInteractiveChatUserInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCInteractiveChatUserInfo(), p0);
    }
    public SCInteractiveChatUserInfo clear(){
       this.bizIdentity = null;
       this.userInfo = InteractiveChatUserInfoIdentity.emptyArray();
       this.extraInfo = "";
       this.timestamp = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCInteractiveChatUserInfo tbizIdentity = this.bizIdentity;
       if (tbizIdentity != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tbizIdentity);
       }
       tbizIdentity = this.userInfo;
       if (tbizIdentity != null && tbizIdentity.length > 0) {
          int i1 = 0;
          SCInteractiveChatUserInfo tuserInfo = this.userInfo;
          while (i1 < tuserInfo.length) {
             object oobject = tuserInfo[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.extraInfo).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.extraInfo);
       }
       tbizIdentity = this.timestamp;
       if (tbizIdentity) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tbizIdentity);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCInteractiveChatUserInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             int i1 = 18;
             if (i != i1) {
                if (i != 26) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.timestamp = p0.readUInt64();
                   }
                }else {
                   this.extraInfo = p0.readString();
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                SCInteractiveChatUserInfo tuserInfo = this.userInfo;
                int i2 = (tuserInfo == null)? 0: tuserInfo.length;
                i = i + i2;
                InteractiveChatUserInfoIdentity[] interactiveC = new InteractiveChatUserInfoIdentity[i];
                if (i2) {
                   System.arraycopy(tuserInfo, 0, interactiveC, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   interactiveC[i2] = new InteractiveChatUserInfoIdentity();
                   p0.readMessage(interactiveC[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                interactiveC[i2] = new InteractiveChatUserInfoIdentity();
                p0.readMessage(interactiveC[i2]);
                this.userInfo = interactiveC;
             }
          }else if(this.bizIdentity == null){
             this.bizIdentity = new InteractiveChatBizIdentity();
          }
          p0.readMessage(this.bizIdentity);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCInteractiveChatUserInfo tbizIdentity = this.bizIdentity;
       if (tbizIdentity != null) {
          p0.writeMessage(1, tbizIdentity);
       }
       tbizIdentity = this.userInfo;
       if (tbizIdentity != null && tbizIdentity.length > 0) {
          int i = 0;
          SCInteractiveChatUserInfo tuserInfo = this.userInfo;
          while (i < tuserInfo.length) {
             object oobject = tuserInfo[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.extraInfo).equals("")) {
          p0.writeString(3, this.extraInfo);
       }
       tbizIdentity = this.timestamp;
       if (tbizIdentity) {
          p0.writeUInt64(4, tbizIdentity);
       }
       super.writeTo(p0);
       return;
    }
}
