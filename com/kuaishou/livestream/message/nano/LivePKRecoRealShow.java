package com.kuaishou.livestream.message.nano.LivePKRecoRealShow;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.System;

public final class LivePKRecoRealShow extends MessageNano	// class@001204
{
    public long authorId;
    public long recoId;
    public long[] userIdList;
    public static LivePKRecoRealShow[] _emptyArray;

    public void LivePKRecoRealShow(){
       super();
       this.clear();
    }
    public static LivePKRecoRealShow[] emptyArray(){
       if (LivePKRecoRealShow._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePKRecoRealShow._emptyArray == null) {
             LivePKRecoRealShow[] livePKRecoRe = new LivePKRecoRealShow[0];
             LivePKRecoRealShow._emptyArray = livePKRecoRe;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePKRecoRealShow._emptyArray;
    }
    public static LivePKRecoRealShow parseFrom(CodedInputByteBufferNano p0){
       return new LivePKRecoRealShow().mergeFrom(p0);
    }
    public static LivePKRecoRealShow parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePKRecoRealShow(), p0);
    }
    public LivePKRecoRealShow clear(){
       this.recoId = 0;
       this.authorId = 0;
       this.userIdList = WireFormatNano.EMPTY_LONG_ARRAY;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LivePKRecoRealShow trecoId = this.recoId;
       LivePKRecoRealShow livePKRecoRe = null;
       if (trecoId - livePKRecoRe) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, trecoId);
       }
       trecoId = this.authorId;
       if (trecoId - livePKRecoRe) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, trecoId);
       }
       trecoId = this.userIdList;
       if (trecoId != null && trecoId.length > 0) {
          int i1 = 0;
          int i2 = 0;
          livePKRecoRe = this.userIdList;
          while (i1 < livePKRecoRe.length) {
             i2 = i2 + CodedOutputByteBufferNano.computeUInt64SizeNoTag(livePKRecoRe[i1]);
             i1 = i1 + 1;
          }
          i = (i + i2) + (livePKRecoRe.length * 1);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePKRecoRealShow mergeFrom(CodedInputByteBufferNano p0){
       int i2;
       LivePKRecoRealShow tuserIdList;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                int i1 = 24;
                if (i != i1) {
                   if (i != 26) {
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
                      tuserIdList = this.userIdList;
                      int i3 = (tuserIdList == null)? 0: tuserIdList.length;
                      i2 = i2 + i3;
                      long[] olongArray = new long[i2];
                      if (i3) {
                         System.arraycopy(tuserIdList, 0, olongArray, 0, i3);
                      }
                      while (i3 < i2) {
                         olongArray[i3] = p0.readUInt64();
                         i3 = i3 + 1;
                      }
                      this.userIdList = olongArray;
                      p0.popLimit(i);
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   tuserIdList = this.userIdList;
                   i2 = (tuserIdList == null)? 0: tuserIdList.length;
                   i = i + i2;
                   long[] olongArray1 = new long[i];
                   if (i2) {
                      System.arraycopy(tuserIdList, 0, olongArray1, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      olongArray1[i2] = p0.readUInt64();
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   olongArray1[i2] = p0.readUInt64();
                   this.userIdList = olongArray1;
                }
             }else {
                this.authorId = p0.readUInt64();
             }
          }else {
             this.recoId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LivePKRecoRealShow trecoId = this.recoId;
       int i = 0;
       if (trecoId - i) {
          p0.writeUInt64(1, trecoId);
       }
       trecoId = this.authorId;
       if (trecoId - i) {
          p0.writeUInt64(2, trecoId);
       }
       trecoId = this.userIdList;
       if (trecoId != null && trecoId.length > 0) {
          int i1 = 0;
          LivePKRecoRealShow tuserIdList = this.userIdList;
          while (i1 < tuserIdList.length) {
             p0.writeUInt64(3, tuserIdList[i1]);
             i1 = i1 + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
