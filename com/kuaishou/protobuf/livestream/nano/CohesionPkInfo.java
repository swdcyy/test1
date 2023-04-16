package com.kuaishou.protobuf.livestream.nano.CohesionPkInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.System;

public final class CohesionPkInfo extends MessageNano	// class@000c0b
{
    public int[] giftId;
    public static CohesionPkInfo[] _emptyArray;

    public void CohesionPkInfo(){
       super();
       this.clear();
    }
    public static CohesionPkInfo[] emptyArray(){
       if (CohesionPkInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (CohesionPkInfo._emptyArray == null) {
             CohesionPkInfo[] uCohesionPkI = new CohesionPkInfo[0];
             CohesionPkInfo._emptyArray = uCohesionPkI;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return CohesionPkInfo._emptyArray;
    }
    public static CohesionPkInfo parseFrom(CodedInputByteBufferNano p0){
       return new CohesionPkInfo().mergeFrom(p0);
    }
    public static CohesionPkInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new CohesionPkInfo(), p0);
    }
    public CohesionPkInfo clear(){
       this.giftId = WireFormatNano.EMPTY_INT_ARRAY;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       CohesionPkInfo tgiftId = this.giftId;
       if (tgiftId != null && tgiftId.length > 0) {
          int i1 = 0;
          int i2 = 0;
          CohesionPkInfo tgiftId1 = this.giftId;
          while (i1 < tgiftId1.length) {
             i2 = i2 + CodedOutputByteBufferNano.computeUInt32SizeNoTag(tgiftId1[i1]);
             i1 = i1 + 1;
          }
          i = (i + i2) + (tgiftId1.length * 1);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public CohesionPkInfo mergeFrom(CodedInputByteBufferNano p0){
       int i2;
       CohesionPkInfo tgiftId;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 8;
          if (i != i1) {
             if (i != 10) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                i = p0.pushLimit(p0.readRawVarint32());
                i1 = p0.getPosition();
                i2 = 0;
                while (p0.getBytesUntilLimit() > 0) {
                   p0.readUInt32();
                   i2 = i2 + 1;
                }
                p0.rewindToPosition(i1);
                tgiftId = this.giftId;
                int i3 = (tgiftId == null)? 0: tgiftId.length;
                i2 = i2 + i3;
                int[] ointArray = new int[i2];
                if (i3) {
                   System.arraycopy(tgiftId, 0, ointArray, 0, i3);
                }
                while (i3 < i2) {
                   ointArray[i3] = p0.readUInt32();
                   i3 = i3 + 1;
                }
                this.giftId = ointArray;
                p0.popLimit(i);
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             tgiftId = this.giftId;
             i2 = (tgiftId == null)? 0: tgiftId.length;
             i = i + i2;
             int[] ointArray1 = new int[i];
             if (i2) {
                System.arraycopy(tgiftId, 0, ointArray1, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                ointArray1[i2] = p0.readUInt32();
                p0.readTag();
                i2 = i2 + 1;
             }
             ointArray1[i2] = p0.readUInt32();
             this.giftId = ointArray1;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       CohesionPkInfo tgiftId = this.giftId;
       if (tgiftId != null && tgiftId.length > 0) {
          int i = 0;
          CohesionPkInfo tgiftId1 = this.giftId;
          while (i < tgiftId1.length) {
             p0.writeUInt32(1, tgiftId1[i]);
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
