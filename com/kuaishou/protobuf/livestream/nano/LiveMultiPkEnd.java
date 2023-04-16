package com.kuaishou.protobuf.livestream.nano.LiveMultiPkEnd;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.System;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveCommonNotice;

public final class LiveMultiPkEnd extends MessageNano	// class@000cbe
{
    public long endUserId;
    public int pkEndType;
    public long[] rematchUserIds;
    public LiveStreamMessages$SCLiveCommonNotice userLeaveToast;
    public static LiveMultiPkEnd[] _emptyArray;

    public void LiveMultiPkEnd(){
       super();
       this.clear();
    }
    public static LiveMultiPkEnd[] emptyArray(){
       if (LiveMultiPkEnd._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMultiPkEnd._emptyArray == null) {
             LiveMultiPkEnd[] liveMultiPkE = new LiveMultiPkEnd[0];
             LiveMultiPkEnd._emptyArray = liveMultiPkE;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMultiPkEnd._emptyArray;
    }
    public static LiveMultiPkEnd parseFrom(CodedInputByteBufferNano p0){
       return new LiveMultiPkEnd().mergeFrom(p0);
    }
    public static LiveMultiPkEnd parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMultiPkEnd(), p0);
    }
    public LiveMultiPkEnd clear(){
       this.endUserId = 0;
       this.userLeaveToast = null;
       this.pkEndType = 0;
       this.rematchUserIds = WireFormatNano.EMPTY_LONG_ARRAY;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveMultiPkEnd tendUserId = this.endUserId;
       if (tendUserId - null) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tendUserId);
       }
       tendUserId = this.userLeaveToast;
       if (tendUserId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tendUserId);
       }
       tendUserId = this.pkEndType;
       if (tendUserId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tendUserId);
       }
       tendUserId = this.rematchUserIds;
       if (tendUserId != null && tendUserId.length > 0) {
          int i1 = 0;
          int i2 = 0;
          LiveMultiPkEnd trematchUser = this.rematchUserIds;
          while (i1 < trematchUser.length) {
             i2 = i2 + CodedOutputByteBufferNano.computeUInt64SizeNoTag(trematchUser[i1]);
             i1 = i1 + 1;
          }
          i = (i + i2) + (trematchUser.length * 1);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveMultiPkEnd mergeFrom(CodedInputByteBufferNano p0){
       int i2;
       LiveMultiPkEnd trematchUser;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 24) {
                   int i1 = 32;
                   if (i != i1) {
                      if (i != 34) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
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
                }else {
                   this.pkEndType = p0.readUInt32();
                }
             }else if(this.userLeaveToast == null){
                this.userLeaveToast = new LiveStreamMessages$SCLiveCommonNotice();
             }
             p0.readMessage(this.userLeaveToast);
          }else {
             this.endUserId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveMultiPkEnd tendUserId = this.endUserId;
       if (tendUserId) {
          p0.writeUInt64(1, tendUserId);
       }
       tendUserId = this.userLeaveToast;
       if (tendUserId != null) {
          p0.writeMessage(2, tendUserId);
       }
       tendUserId = this.pkEndType;
       if (tendUserId != null) {
          p0.writeUInt32(3, tendUserId);
       }
       tendUserId = this.rematchUserIds;
       if (tendUserId != null && tendUserId.length > 0) {
          int i = 0;
          LiveMultiPkEnd trematchUser = this.rematchUserIds;
          while (i < trematchUser.length) {
             p0.writeUInt64(4, trematchUser[i]);
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
