package com.kuaishou.protobuf.livestream.nano.InteractiveChatRoomInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatUserInfoIdentity;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatLayoutConfig;
import java.lang.Object;
import java.lang.System;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatBizIdentity;

public final class InteractiveChatRoomInfo extends MessageNano	// class@000c19
{
    public InteractiveChatBizIdentity bizIdentity;
    public InteractiveChatLayoutConfig layoutConfig;
    public InteractiveChatUserInfoIdentity[] userInfo;
    public long version;
    public static InteractiveChatRoomInfo[] _emptyArray;

    public void InteractiveChatRoomInfo(){
       super();
       this.clear();
    }
    public static InteractiveChatRoomInfo[] emptyArray(){
       if (InteractiveChatRoomInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (InteractiveChatRoomInfo._emptyArray == null) {
             InteractiveChatRoomInfo[] interactiveC = new InteractiveChatRoomInfo[0];
             InteractiveChatRoomInfo._emptyArray = interactiveC;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return InteractiveChatRoomInfo._emptyArray;
    }
    public static InteractiveChatRoomInfo parseFrom(CodedInputByteBufferNano p0){
       return new InteractiveChatRoomInfo().mergeFrom(p0);
    }
    public static InteractiveChatRoomInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new InteractiveChatRoomInfo(), p0);
    }
    public InteractiveChatRoomInfo clear(){
       this.bizIdentity = null;
       this.userInfo = InteractiveChatUserInfoIdentity.emptyArray();
       this.layoutConfig = null;
       this.version = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       InteractiveChatRoomInfo tbizIdentity = this.bizIdentity;
       if (tbizIdentity != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tbizIdentity);
       }
       tbizIdentity = this.userInfo;
       if (tbizIdentity != null && tbizIdentity.length > 0) {
          int i1 = 0;
          InteractiveChatRoomInfo tuserInfo = this.userInfo;
          while (i1 < tuserInfo.length) {
             object oobject = tuserInfo[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tbizIdentity = this.layoutConfig;
       if (tbizIdentity != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tbizIdentity);
       }
       tbizIdentity = this.version;
       if (tbizIdentity) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tbizIdentity);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public InteractiveChatRoomInfo mergeFrom(CodedInputByteBufferNano p0){
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
                      this.version = p0.readUInt64();
                   }
                }else if(this.layoutConfig == null){
                   this.layoutConfig = new InteractiveChatLayoutConfig();
                }
                p0.readMessage(this.layoutConfig);
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                InteractiveChatRoomInfo tuserInfo = this.userInfo;
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
       InteractiveChatRoomInfo tbizIdentity = this.bizIdentity;
       if (tbizIdentity != null) {
          p0.writeMessage(1, tbizIdentity);
       }
       tbizIdentity = this.userInfo;
       if (tbizIdentity != null && tbizIdentity.length > 0) {
          int i = 0;
          InteractiveChatRoomInfo tuserInfo = this.userInfo;
          while (i < tuserInfo.length) {
             object oobject = tuserInfo[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       tbizIdentity = this.layoutConfig;
       if (tbizIdentity != null) {
          p0.writeMessage(3, tbizIdentity);
       }
       tbizIdentity = this.version;
       if (tbizIdentity) {
          p0.writeUInt64(4, tbizIdentity);
       }
       super.writeTo(p0);
       return;
    }
}
