package com.kuaishou.protobuf.livestream.nano.InteractiveChatUserInfoIdentities;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatUserInfoIdentity;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class InteractiveChatUserInfoIdentities extends MessageNano	// class@000c1c
{
    public InteractiveChatUserInfoIdentity[] userInfoIdentity;
    public static InteractiveChatUserInfoIdentities[] _emptyArray;

    public void InteractiveChatUserInfoIdentities(){
       super();
       this.clear();
    }
    public static InteractiveChatUserInfoIdentities[] emptyArray(){
       if (InteractiveChatUserInfoIdentities._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (InteractiveChatUserInfoIdentities._emptyArray == null) {
             InteractiveChatUserInfoIdentities[] interactiveC = new InteractiveChatUserInfoIdentities[0];
             InteractiveChatUserInfoIdentities._emptyArray = interactiveC;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return InteractiveChatUserInfoIdentities._emptyArray;
    }
    public static InteractiveChatUserInfoIdentities parseFrom(CodedInputByteBufferNano p0){
       return new InteractiveChatUserInfoIdentities().mergeFrom(p0);
    }
    public static InteractiveChatUserInfoIdentities parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new InteractiveChatUserInfoIdentities(), p0);
    }
    public InteractiveChatUserInfoIdentities clear(){
       this.userInfoIdentity = InteractiveChatUserInfoIdentity.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       InteractiveChatUserInfoIdentities tuserInfoIde = this.userInfoIdentity;
       if (tuserInfoIde != null && tuserInfoIde.length > 0) {
          int i1 = 0;
          InteractiveChatUserInfoIdentities tuserInfoIde1 = this.userInfoIdentity;
          while (i1 < tuserInfoIde1.length) {
             object oobject = tuserInfoIde1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public InteractiveChatUserInfoIdentities mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             InteractiveChatUserInfoIdentities tuserInfoIde = this.userInfoIdentity;
             int i2 = (tuserInfoIde == null)? 0: tuserInfoIde.length;
             i = i + i2;
             InteractiveChatUserInfoIdentity[] interactiveC = new InteractiveChatUserInfoIdentity[i];
             if (i2) {
                System.arraycopy(tuserInfoIde, 0, interactiveC, 0, i2);
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
             this.userInfoIdentity = interactiveC;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       InteractiveChatUserInfoIdentities tuserInfoIde = this.userInfoIdentity;
       if (tuserInfoIde != null && tuserInfoIde.length > 0) {
          int i = 0;
          InteractiveChatUserInfoIdentities tuserInfoIde1 = this.userInfoIdentity;
          while (i < tuserInfoIde1.length) {
             object oobject = tuserInfoIde1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
