package com.kuaishou.livestream.message.nano.RangeInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.System;

public final class RangeInfo extends MessageNano	// class@0013e8
{
    public int rangeHigher;
    public int rangeLower;
    public int rangeMod;
    public long[] whiteList;
    public static RangeInfo[] _emptyArray;

    public void RangeInfo(){
       super();
       this.clear();
    }
    public static RangeInfo[] emptyArray(){
       if (RangeInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (RangeInfo._emptyArray == null) {
             RangeInfo[] rangeInfoArr = new RangeInfo[0];
             RangeInfo._emptyArray = rangeInfoArr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return RangeInfo._emptyArray;
    }
    public static RangeInfo parseFrom(CodedInputByteBufferNano p0){
       return new RangeInfo().mergeFrom(p0);
    }
    public static RangeInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new RangeInfo(), p0);
    }
    public RangeInfo clear(){
       this.rangeLower = 0;
       this.rangeHigher = 0;
       this.rangeMod = 0;
       this.whiteList = WireFormatNano.EMPTY_LONG_ARRAY;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       RangeInfo trangeLower = this.rangeLower;
       if (trangeLower != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, trangeLower);
       }
       trangeLower = this.rangeHigher;
       if (trangeLower != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, trangeLower);
       }
       trangeLower = this.rangeMod;
       if (trangeLower != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, trangeLower);
       }
       trangeLower = this.whiteList;
       if (trangeLower != null && trangeLower.length > 0) {
          int i1 = 0;
          int i2 = 0;
          RangeInfo twhiteList = this.whiteList;
          while (i1 < twhiteList.length) {
             i2 = i2 + CodedOutputByteBufferNano.computeInt64SizeNoTag(twhiteList[i1]);
             i1 = i1 + 1;
          }
          i = (i + i2) + (twhiteList.length * 1);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public RangeInfo mergeFrom(CodedInputByteBufferNano p0){
       int i2;
       RangeInfo twhiteList;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
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
                            p0.readInt64();
                            i2 = i2 + 1;
                         }
                         p0.rewindToPosition(i1);
                         twhiteList = this.whiteList;
                         int i3 = (twhiteList == null)? 0: twhiteList.length;
                         i2 = i2 + i3;
                         long[] olongArray = new long[i2];
                         if (i3) {
                            System.arraycopy(twhiteList, 0, olongArray, 0, i3);
                         }
                         while (i3 < i2) {
                            olongArray[i3] = p0.readInt64();
                            i3 = i3 + 1;
                         }
                         this.whiteList = olongArray;
                         p0.popLimit(i);
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      twhiteList = this.whiteList;
                      i2 = (twhiteList == null)? 0: twhiteList.length;
                      i = i + i2;
                      long[] olongArray1 = new long[i];
                      if (i2) {
                         System.arraycopy(twhiteList, 0, olongArray1, 0, i2);
                      }
                      i1 = i - 1;
                      while (i2 < i1) {
                         olongArray1[i2] = p0.readInt64();
                         p0.readTag();
                         i2 = i2 + 1;
                      }
                      olongArray1[i2] = p0.readInt64();
                      this.whiteList = olongArray1;
                   }
                }else {
                   this.rangeMod = p0.readInt32();
                }
             }else {
                this.rangeHigher = p0.readInt32();
             }
          }else {
             this.rangeLower = p0.readInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       RangeInfo trangeLower = this.rangeLower;
       if (trangeLower != null) {
          p0.writeInt32(1, trangeLower);
       }
       trangeLower = this.rangeHigher;
       if (trangeLower != null) {
          p0.writeInt32(2, trangeLower);
       }
       trangeLower = this.rangeMod;
       if (trangeLower != null) {
          p0.writeInt32(3, trangeLower);
       }
       trangeLower = this.whiteList;
       if (trangeLower != null && trangeLower.length > 0) {
          int i = 0;
          RangeInfo twhiteList = this.whiteList;
          while (i < twhiteList.length) {
             p0.writeInt64(4, twhiteList[i]);
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
