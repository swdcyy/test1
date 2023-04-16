package com.kuaishou.cny2023.message.nano.CnyCdnDegradeProto$SCCdnDegradeCommandStateSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.System;

public final class CnyCdnDegradeProto$SCCdnDegradeCommandStateSignal extends MessageNano	// class@001491
{
    public int cdnDegradeLevel;
    public int[] location;
    public long timestamp;
    public static CnyCdnDegradeProto$SCCdnDegradeCommandStateSignal[] _emptyArray;

    public void CnyCdnDegradeProto$SCCdnDegradeCommandStateSignal(){
       super();
       this.clear();
    }
    public static CnyCdnDegradeProto$SCCdnDegradeCommandStateSignal[] emptyArray(){
       if (CnyCdnDegradeProto$SCCdnDegradeCommandStateSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (CnyCdnDegradeProto$SCCdnDegradeCommandStateSignal._emptyArray == null) {
             CnyCdnDegradeProto$SCCdnDegradeCommandStateSignal[] sCCdnDegrade = new CnyCdnDegradeProto$SCCdnDegradeCommandStateSignal[0];
             CnyCdnDegradeProto$SCCdnDegradeCommandStateSignal._emptyArray = sCCdnDegrade;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return CnyCdnDegradeProto$SCCdnDegradeCommandStateSignal._emptyArray;
    }
    public static CnyCdnDegradeProto$SCCdnDegradeCommandStateSignal parseFrom(CodedInputByteBufferNano p0){
       return new CnyCdnDegradeProto$SCCdnDegradeCommandStateSignal().mergeFrom(p0);
    }
    public static CnyCdnDegradeProto$SCCdnDegradeCommandStateSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new CnyCdnDegradeProto$SCCdnDegradeCommandStateSignal(), p0);
    }
    public CnyCdnDegradeProto$SCCdnDegradeCommandStateSignal clear(){
       this.cdnDegradeLevel = 0;
       this.timestamp = 0;
       this.location = WireFormatNano.EMPTY_INT_ARRAY;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       CnyCdnDegradeProto$SCCdnDegradeCommandStateSignal tcdnDegradeL = this.cdnDegradeLevel;
       if (tcdnDegradeL != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tcdnDegradeL);
       }
       CnyCdnDegradeProto$SCCdnDegradeCommandStateSignal ttimestamp = this.timestamp;
       if (ttimestamp) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttimestamp);
       }
       tcdnDegradeL = this.location;
       if (tcdnDegradeL != null && tcdnDegradeL.length > 0) {
          int i1 = 0;
          int i2 = 0;
          CnyCdnDegradeProto$SCCdnDegradeCommandStateSignal tlocation = this.location;
          while (i1 < tlocation.length) {
             i2 = i2 + CodedOutputByteBufferNano.computeInt32SizeNoTag(tlocation[i1]);
             i1 = i1 + 1;
          }
          i = (i + i2) + (tlocation.length * 1);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public CnyCdnDegradeProto$SCCdnDegradeCommandStateSignal mergeFrom(CodedInputByteBufferNano p0){
       int i4;
       int i5;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                int i1 = 24;
                CnyCdnDegradeProto$SCCdnDegradeCommandStateSignal sCCdnDegrade = 2;
                int i2 = 1;
                int i3 = 0;
                if (i != i1) {
                   if (i != 26) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      i = p0.pushLimit(p0.readRawVarint32());
                      i1 = p0.getPosition();
                      i4 = 0;
                      while (p0.getBytesUntilLimit() > 0) {
                         i5 = p0.readInt32();
                         if (i5 && (i5 != i2 && i5 != sCCdnDegrade)) {
                            continue ;
                         }
                         i4 = i4 + 1;
                      }
                      if (i4) {
                         p0.rewindToPosition(i1);
                         CnyCdnDegradeProto$SCCdnDegradeCommandStateSignal tlocation = this.location;
                         i5 = (tlocation == null)? 0: tlocation.length;
                         i4 = i4 + i5;
                         int[] ointArray = new int[i4];
                         if (i5) {
                            System.arraycopy(tlocation, i3, ointArray, i3, i5);
                         }
                         while (p0.getBytesUntilLimit() > 0) {
                            i1 = p0.readInt32();
                            if (i1 && (i1 != i2 && i1 != sCCdnDegrade)) {
                               continue ;
                            }
                            i3 = i5 + 1;
                            ointArray[i5] = i1;
                            i5 = i3;
                         }
                         this.location = ointArray;
                      }
                      p0.popLimit(i);
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   int[] ointArray1 = new int[i];
                   i4 = 0;
                   i5 = 0;
                   while (i4 < i) {
                      if (i4) {
                         p0.readTag();
                      }
                      int i6 = p0.readInt32();
                      if (!i6 || (i6 == i2 || i6 == sCCdnDegrade)) {
                         int i7 = i5 + 1;
                         ointArray1[i5] = i6;
                         i5 = i7;
                      }
                      i4 = i4 + 1;
                   }
                   if (i5) {
                      sCCdnDegrade = this.location;
                      i2 = (sCCdnDegrade == null)? 0: sCCdnDegrade.length;
                      if (!i2 && i5 == i) {
                         this.location = ointArray1;
                      }else {
                         i = i2 + i5;
                         int[] ointArray2 = new int[i];
                         if (i2) {
                            System.arraycopy(sCCdnDegrade, i3, ointArray2, i3, i2);
                         }
                         System.arraycopy(ointArray1, i3, ointArray2, i2, i5);
                         this.location = ointArray2;
                      }
                   }
                }
             }else {
                this.timestamp = p0.readUInt64();
             }
          }else {
             this.cdnDegradeLevel = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       CnyCdnDegradeProto$SCCdnDegradeCommandStateSignal tcdnDegradeL = this.cdnDegradeLevel;
       if (tcdnDegradeL != null) {
          p0.writeUInt32(1, tcdnDegradeL);
       }
       tcdnDegradeL = this.timestamp;
       if (tcdnDegradeL) {
          p0.writeUInt64(2, tcdnDegradeL);
       }
       tcdnDegradeL = this.location;
       if (tcdnDegradeL != null && tcdnDegradeL.length > 0) {
          int i = 0;
          CnyCdnDegradeProto$SCCdnDegradeCommandStateSignal tlocation = this.location;
          while (i < tlocation.length) {
             p0.writeInt32(3, tlocation[i]);
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
