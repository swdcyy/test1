package com.kuaishou.protobuf.livestream.nano.LiveMultiLineChatEnd;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveMultiLineChatNotice;
import java.lang.Object;
import java.lang.System;

public final class LiveMultiLineChatEnd extends MessageNano	// class@000cb0
{
    public LiveMultiLineChatNotice authorEndToast;
    public long[] rematchUserIds;
    public static LiveMultiLineChatEnd[] _emptyArray;

    public void LiveMultiLineChatEnd(){
       super();
       this.clear();
    }
    public static LiveMultiLineChatEnd[] emptyArray(){
       if (LiveMultiLineChatEnd._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMultiLineChatEnd._emptyArray == null) {
             LiveMultiLineChatEnd[] liveMultiLin = new LiveMultiLineChatEnd[0];
             LiveMultiLineChatEnd._emptyArray = liveMultiLin;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMultiLineChatEnd._emptyArray;
    }
    public static LiveMultiLineChatEnd parseFrom(CodedInputByteBufferNano p0){
       return new LiveMultiLineChatEnd().mergeFrom(p0);
    }
    public static LiveMultiLineChatEnd parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMultiLineChatEnd(), p0);
    }
    public LiveMultiLineChatEnd clear(){
       this.rematchUserIds = WireFormatNano.EMPTY_LONG_ARRAY;
       this.authorEndToast = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveMultiLineChatEnd trematchUser = this.rematchUserIds;
       if (trematchUser != null && trematchUser.length > 0) {
          int i1 = 0;
          int i2 = 0;
          LiveMultiLineChatEnd trematchUser1 = this.rematchUserIds;
          while (i1 < trematchUser1.length) {
             i2 = i2 + CodedOutputByteBufferNano.computeUInt64SizeNoTag(trematchUser1[i1]);
             i1 = i1 + 1;
          }
          i = (i + i2) + (trematchUser1.length * 1);
       }
       trematchUser = this.authorEndToast;
       if (trematchUser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, trematchUser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveMultiLineChatEnd mergeFrom(CodedInputByteBufferNano p0){
       int i2;
       LiveMultiLineChatEnd trematchUser;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 8;
          if (i != i1) {
             if (i != 10) {
                if (i != 18) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else if(this.authorEndToast == null){
                   this.authorEndToast = new LiveMultiLineChatNotice();
                }
                p0.readMessage(this.authorEndToast);
             }else {
                i = p0.pushLimit(p0.readRawVarint32());
                i1 = p0.getPosition();
                i2 = 0;
                while (p0.getBytesUntilLimit() > 0) {
                   p0.readUInt64();
                   i2 = i2 + 1;
                }
                p0.rewindToPosition(i1);
                trematchUser = this.rematchUserIds;
                int i3 = (trematchUser == null)? 0: trematchUser.length;
                i2 = i2 + i3;
                long[] olongArray = new long[i2];
                if (i3) {
                   System.arraycopy(trematchUser, 0, olongArray, 0, i3);
                }
                while (i3 < i2) {
                   olongArray[i3] = p0.readUInt64();
                   i3 = i3 + 1;
                }
                this.rematchUserIds = olongArray;
                p0.popLimit(i);
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             trematchUser = this.rematchUserIds;
             i2 = (trematchUser == null)? 0: trematchUser.length;
             i = i + i2;
             long[] olongArray1 = new long[i];
             if (i2) {
                System.arraycopy(trematchUser, 0, olongArray1, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                olongArray1[i2] = p0.readUInt64();
                p0.readTag();
                i2 = i2 + 1;
             }
             olongArray1[i2] = p0.readUInt64();
             this.rematchUserIds = olongArray1;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveMultiLineChatEnd trematchUser = this.rematchUserIds;
       if (trematchUser != null && trematchUser.length > 0) {
          int i = 0;
          LiveMultiLineChatEnd trematchUser1 = this.rematchUserIds;
          while (i < trematchUser1.length) {
             p0.writeUInt64(1, trematchUser1[i]);
             i = i + 1;
          }
       }
       trematchUser = this.authorEndToast;
       if (trematchUser != null) {
          p0.writeMessage(2, trematchUser);
       }
       super.writeTo(p0);
       return;
    }
}
