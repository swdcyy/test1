package com.kuaishou.protobuf.livestream.nano.SCInteractiveChatCancelCall;
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

public final class SCInteractiveChatCancelCall extends MessageNano	// class@000d36
{
    public InteractiveChatBizIdentity bizIdentity;
    public InteractiveChatUserInfoIdentity caller;
    public String extraInfo;
    public InteractiveChatUserInfoIdentity[] guest;
    public static SCInteractiveChatCancelCall[] _emptyArray;

    public void SCInteractiveChatCancelCall(){
       super();
       this.clear();
    }
    public static SCInteractiveChatCancelCall[] emptyArray(){
       if (SCInteractiveChatCancelCall._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCInteractiveChatCancelCall._emptyArray == null) {
             SCInteractiveChatCancelCall[] sCInteractiv = new SCInteractiveChatCancelCall[0];
             SCInteractiveChatCancelCall._emptyArray = sCInteractiv;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCInteractiveChatCancelCall._emptyArray;
    }
    public static SCInteractiveChatCancelCall parseFrom(CodedInputByteBufferNano p0){
       return new SCInteractiveChatCancelCall().mergeFrom(p0);
    }
    public static SCInteractiveChatCancelCall parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCInteractiveChatCancelCall(), p0);
    }
    public SCInteractiveChatCancelCall clear(){
       this.bizIdentity = null;
       this.caller = null;
       this.guest = InteractiveChatUserInfoIdentity.emptyArray();
       this.extraInfo = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCInteractiveChatCancelCall tbizIdentity = this.bizIdentity;
       if (tbizIdentity != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tbizIdentity);
       }
       tbizIdentity = this.caller;
       if (tbizIdentity != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tbizIdentity);
       }
       tbizIdentity = this.guest;
       if (tbizIdentity != null && tbizIdentity.length > 0) {
          int i1 = 0;
          SCInteractiveChatCancelCall tguest = this.guest;
          while (i1 < tguest.length) {
             object oobject = tguest[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.extraInfo).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.extraInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCInteractiveChatCancelCall mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                int i1 = 26;
                if (i != i1) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.extraInfo = p0.readString();
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   SCInteractiveChatCancelCall tguest = this.guest;
                   int i2 = (tguest == null)? 0: tguest.length;
                   i = i + i2;
                   InteractiveChatUserInfoIdentity[] interactiveC = new InteractiveChatUserInfoIdentity[i];
                   if (i2) {
                      System.arraycopy(tguest, 0, interactiveC, 0, i2);
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
                   this.guest = interactiveC;
                }
             }else if(this.caller == null){
                this.caller = new InteractiveChatUserInfoIdentity();
             }
             p0.readMessage(this.caller);
          }else if(this.bizIdentity == null){
             this.bizIdentity = new InteractiveChatBizIdentity();
          }
          p0.readMessage(this.bizIdentity);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCInteractiveChatCancelCall tbizIdentity = this.bizIdentity;
       if (tbizIdentity != null) {
          p0.writeMessage(1, tbizIdentity);
       }
       tbizIdentity = this.caller;
       if (tbizIdentity != null) {
          p0.writeMessage(2, tbizIdentity);
       }
       tbizIdentity = this.guest;
       if (tbizIdentity != null && tbizIdentity.length > 0) {
          int i = 0;
          SCInteractiveChatCancelCall tguest = this.guest;
          while (i < tguest.length) {
             object oobject = tguest[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.extraInfo).equals("")) {
          p0.writeString(4, this.extraInfo);
       }
       super.writeTo(p0);
       return;
    }
}
