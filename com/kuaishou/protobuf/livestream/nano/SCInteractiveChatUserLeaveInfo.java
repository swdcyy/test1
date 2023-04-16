package com.kuaishou.protobuf.livestream.nano.SCInteractiveChatUserLeaveInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatUserInfoIdentity;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatRoomInfo;
import java.lang.System;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatBizIdentity;

public final class SCInteractiveChatUserLeaveInfo extends MessageNano	// class@000d3f
{
    public InteractiveChatBizIdentity bizIdentity;
    public String extraInfo;
    public long leaveInfoVersion;
    public int leaveReason;
    public InteractiveChatRoomInfo roomInfo;
    public long timestamp;
    public InteractiveChatUserInfoIdentity[] userInfo;
    public static SCInteractiveChatUserLeaveInfo[] _emptyArray;

    public void SCInteractiveChatUserLeaveInfo(){
       super();
       this.clear();
    }
    public static SCInteractiveChatUserLeaveInfo[] emptyArray(){
       if (SCInteractiveChatUserLeaveInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCInteractiveChatUserLeaveInfo._emptyArray == null) {
             SCInteractiveChatUserLeaveInfo[] sCInteractiv = new SCInteractiveChatUserLeaveInfo[0];
             SCInteractiveChatUserLeaveInfo._emptyArray = sCInteractiv;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCInteractiveChatUserLeaveInfo._emptyArray;
    }
    public static SCInteractiveChatUserLeaveInfo parseFrom(CodedInputByteBufferNano p0){
       return new SCInteractiveChatUserLeaveInfo().mergeFrom(p0);
    }
    public static SCInteractiveChatUserLeaveInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCInteractiveChatUserLeaveInfo(), p0);
    }
    public SCInteractiveChatUserLeaveInfo clear(){
       this.bizIdentity = null;
       this.userInfo = InteractiveChatUserInfoIdentity.emptyArray();
       this.leaveReason = 0;
       this.extraInfo = "";
       this.timestamp = 0;
       this.roomInfo = null;
       this.leaveInfoVersion = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCInteractiveChatUserLeaveInfo tbizIdentity = this.bizIdentity;
       if (tbizIdentity != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tbizIdentity);
       }
       tbizIdentity = this.userInfo;
       if (tbizIdentity != null && tbizIdentity.length > 0) {
          int i1 = 0;
          SCInteractiveChatUserLeaveInfo tuserInfo = this.userInfo;
          while (i1 < tuserInfo.length) {
             object oobject = tuserInfo[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tbizIdentity = this.leaveReason;
       if (tbizIdentity != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tbizIdentity);
       }
       if (!(this.extraInfo).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.extraInfo);
       }
       tbizIdentity = this.timestamp;
       int i2 = 0;
       if (tbizIdentity - i2) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tbizIdentity);
       }
       tbizIdentity = this.roomInfo;
       if (tbizIdentity != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, tbizIdentity);
       }
       tbizIdentity = this.leaveInfoVersion;
       if (tbizIdentity - i2) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tbizIdentity);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCInteractiveChatUserLeaveInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             int i1 = 18;
             if (i != i1) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 40) {
                         if (i != 50) {
                            if (i != 56) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.leaveInfoVersion = p0.readUInt64();
                            }
                         }else if(this.roomInfo == null){
                            this.roomInfo = new InteractiveChatRoomInfo();
                         }
                         p0.readMessage(this.roomInfo);
                      }else {
                         this.timestamp = p0.readUInt64();
                      }
                   }else {
                      this.extraInfo = p0.readString();
                   }
                }else {
                   i = p0.readInt32();
                   switch (i){
                       case 0:
                       case 2:
                       case 3:
                       case 4:
                       case 5:
                       case 6:
                       case 7:
                       case 1:
                         break;
                       default:
                   }
                   this.leaveReason = i;
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                SCInteractiveChatUserLeaveInfo tuserInfo = this.userInfo;
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
       SCInteractiveChatUserLeaveInfo tbizIdentity = this.bizIdentity;
       if (tbizIdentity != null) {
          p0.writeMessage(1, tbizIdentity);
       }
       tbizIdentity = this.userInfo;
       if (tbizIdentity != null && tbizIdentity.length > 0) {
          int i = 0;
          SCInteractiveChatUserLeaveInfo tuserInfo = this.userInfo;
          while (i < tuserInfo.length) {
             object oobject = tuserInfo[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       tbizIdentity = this.leaveReason;
       if (tbizIdentity != null) {
          p0.writeInt32(3, tbizIdentity);
       }
       if (!(this.extraInfo).equals("")) {
          p0.writeString(4, this.extraInfo);
       }
       tbizIdentity = this.timestamp;
       int i1 = 0;
       if (tbizIdentity - i1) {
          p0.writeUInt64(5, tbizIdentity);
       }
       tbizIdentity = this.roomInfo;
       if (tbizIdentity != null) {
          p0.writeMessage(6, tbizIdentity);
       }
       tbizIdentity = this.leaveInfoVersion;
       if (tbizIdentity - i1) {
          p0.writeUInt64(7, tbizIdentity);
       }
       super.writeTo(p0);
       return;
    }
}
