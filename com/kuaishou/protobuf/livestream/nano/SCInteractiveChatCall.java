package com.kuaishou.protobuf.livestream.nano.SCInteractiveChatCall;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatUserInfoIdentity;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatBizIdentity;

public final class SCInteractiveChatCall extends MessageNano	// class@000d35
{
    public boolean autoAccept;
    public InteractiveChatBizIdentity bizIdentity;
    public UserInfos$UserInfo caller;
    public InteractiveChatUserInfoIdentity callerIdentity;
    public long countdownMs;
    public InteractiveChatUserInfoIdentity[] currentUser;
    public String extraInfo;
    public boolean fromMatch;
    public InteractiveChatUserInfoIdentity[] guest;
    public long timestamp;
    public static SCInteractiveChatCall[] _emptyArray;

    public void SCInteractiveChatCall(){
       super();
       this.clear();
    }
    public static SCInteractiveChatCall[] emptyArray(){
       if (SCInteractiveChatCall._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCInteractiveChatCall._emptyArray == null) {
             SCInteractiveChatCall[] sCInteractiv = new SCInteractiveChatCall[0];
             SCInteractiveChatCall._emptyArray = sCInteractiv;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCInteractiveChatCall._emptyArray;
    }
    public static SCInteractiveChatCall parseFrom(CodedInputByteBufferNano p0){
       return new SCInteractiveChatCall().mergeFrom(p0);
    }
    public static SCInteractiveChatCall parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCInteractiveChatCall(), p0);
    }
    public SCInteractiveChatCall clear(){
       this.bizIdentity = null;
       this.caller = null;
       this.countdownMs = 0;
       this.guest = InteractiveChatUserInfoIdentity.emptyArray();
       this.extraInfo = "";
       this.timestamp = 0;
       this.callerIdentity = null;
       this.currentUser = InteractiveChatUserInfoIdentity.emptyArray();
       this.fromMatch = false;
       this.autoAccept = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       SCInteractiveChatCall tguest;
       int i = super.computeSerializedSize();
       SCInteractiveChatCall tbizIdentity = this.bizIdentity;
       if (tbizIdentity != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tbizIdentity);
       }
       tbizIdentity = this.caller;
       if (tbizIdentity != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tbizIdentity);
       }
       tbizIdentity = this.countdownMs;
       int i1 = 0;
       if (tbizIdentity - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tbizIdentity);
       }
       tbizIdentity = this.guest;
       int i2 = 0;
       if (tbizIdentity != null && tbizIdentity.length > 0) {
          int i3 = 0;
          tguest = this.guest;
          while (i3 < tguest.length) {
             object oobject = tguest[i3];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject);
             }
             i3 = i3 + 1;
          }
       }
       if (!(this.extraInfo).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.extraInfo);
       }
       tguest = this.timestamp;
       if (tguest - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tguest);
       }
       tbizIdentity = this.callerIdentity;
       if (tbizIdentity != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, tbizIdentity);
       }
       tbizIdentity = this.currentUser;
       if (tbizIdentity != null && tbizIdentity.length > 0) {
          tbizIdentity = this.currentUser;
          while (i2 < tbizIdentity.length) {
             object oobject1 = tbizIdentity[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(8, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       tbizIdentity = this.fromMatch;
       if (tbizIdentity != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(9, tbizIdentity);
       }
       tbizIdentity = this.autoAccept;
       if (tbizIdentity != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(10, tbizIdentity);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCInteractiveChatCall mergeFrom(CodedInputByteBufferNano p0){
       SCInteractiveChatCall tguest;
       int i2;
       InteractiveChatUserInfoIdentity[] interactiveC;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 10:
                if (this.bizIdentity == null) {
                   this.bizIdentity = new InteractiveChatBizIdentity();
                }
                p0.readMessage(this.bizIdentity);
                break;
              case 18:
                if (this.caller == null) {
                   this.caller = new UserInfos$UserInfo();
                }
                p0.readMessage(this.caller);
                break;
              case 24:
                this.countdownMs = p0.readUInt64();
                break;
              case '"':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 34);
                tguest = this.guest;
                i2 = (tguest == null)? 0: tguest.length;
                i = i + i2;
                interactiveC = new InteractiveChatUserInfoIdentity[i];
                if (i2) {
                   System.arraycopy(tguest, i1, interactiveC, i1, i2);
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
                break;
              case '*':
                this.extraInfo = p0.readString();
                break;
              case '0':
                this.timestamp = p0.readUInt64();
                break;
              case ':':
                if (this.callerIdentity == null) {
                   this.callerIdentity = new InteractiveChatUserInfoIdentity();
                }
                p0.readMessage(this.callerIdentity);
                break;
              case 'B':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 66);
                tguest = this.currentUser;
                i2 = (tguest == null)? 0: tguest.length;
                i = i + i2;
                interactiveC = new InteractiveChatUserInfoIdentity[i];
                if (i2) {
                   System.arraycopy(tguest, i1, interactiveC, i1, i2);
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
                this.currentUser = interactiveC;
                break;
              case 'H':
                this.fromMatch = p0.readBool();
                break;
              case 'P':
                this.autoAccept = p0.readBool();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCInteractiveChatCall tguest;
       SCInteractiveChatCall tbizIdentity = this.bizIdentity;
       if (tbizIdentity != null) {
          p0.writeMessage(1, tbizIdentity);
       }
       tbizIdentity = this.caller;
       if (tbizIdentity != null) {
          p0.writeMessage(2, tbizIdentity);
       }
       tbizIdentity = this.countdownMs;
       int i = 0;
       if (tbizIdentity - i) {
          p0.writeUInt64(3, tbizIdentity);
       }
       tbizIdentity = this.guest;
       int i1 = 0;
       if (tbizIdentity != null && tbizIdentity.length > 0) {
          int i2 = 0;
          tguest = this.guest;
          while (i2 < tguest.length) {
             object oobject = tguest[i2];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i2 = i2 + 1;
          }
       }
       if (!(this.extraInfo).equals("")) {
          p0.writeString(5, this.extraInfo);
       }
       tguest = this.timestamp;
       if (tguest - i) {
          p0.writeUInt64(6, tguest);
       }
       tbizIdentity = this.callerIdentity;
       if (tbizIdentity != null) {
          p0.writeMessage(7, tbizIdentity);
       }
       tbizIdentity = this.currentUser;
       if (tbizIdentity != null && tbizIdentity.length > 0) {
          tbizIdentity = this.currentUser;
          while (i1 < tbizIdentity.length) {
             object oobject1 = tbizIdentity[i1];
             if (oobject1 != null) {
                p0.writeMessage(8, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tbizIdentity = this.fromMatch;
       if (tbizIdentity != null) {
          p0.writeBool(9, tbizIdentity);
       }
       tbizIdentity = this.autoAccept;
       if (tbizIdentity != null) {
          p0.writeBool(10, tbizIdentity);
       }
       super.writeTo(p0);
       return;
    }
}
