package com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$SCLiveRankVisibleUpdateInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.System;

public final class LiveDistrictRankFinalBattle$SCLiveRankVisibleUpdateInfo extends MessageNano	// class@00118a
{
    public int[] visibleType;
    public static LiveDistrictRankFinalBattle$SCLiveRankVisibleUpdateInfo[] _emptyArray;

    public void LiveDistrictRankFinalBattle$SCLiveRankVisibleUpdateInfo(){
       super();
       this.clear();
    }
    public static LiveDistrictRankFinalBattle$SCLiveRankVisibleUpdateInfo[] emptyArray(){
       if (LiveDistrictRankFinalBattle$SCLiveRankVisibleUpdateInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveDistrictRankFinalBattle$SCLiveRankVisibleUpdateInfo._emptyArray == null) {
             LiveDistrictRankFinalBattle$SCLiveRankVisibleUpdateInfo[] sCLiveRankVi = new LiveDistrictRankFinalBattle$SCLiveRankVisibleUpdateInfo[0];
             LiveDistrictRankFinalBattle$SCLiveRankVisibleUpdateInfo._emptyArray = sCLiveRankVi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveDistrictRankFinalBattle$SCLiveRankVisibleUpdateInfo._emptyArray;
    }
    public static LiveDistrictRankFinalBattle$SCLiveRankVisibleUpdateInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveDistrictRankFinalBattle$SCLiveRankVisibleUpdateInfo().mergeFrom(p0);
    }
    public static LiveDistrictRankFinalBattle$SCLiveRankVisibleUpdateInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveDistrictRankFinalBattle$SCLiveRankVisibleUpdateInfo(), p0);
    }
    public LiveDistrictRankFinalBattle$SCLiveRankVisibleUpdateInfo clear(){
       this.visibleType = WireFormatNano.EMPTY_INT_ARRAY;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveDistrictRankFinalBattle$SCLiveRankVisibleUpdateInfo tvisibleType = this.visibleType;
       if (tvisibleType != null && tvisibleType.length > 0) {
          int i1 = 0;
          int i2 = 0;
          LiveDistrictRankFinalBattle$SCLiveRankVisibleUpdateInfo tvisibleType1 = this.visibleType;
          while (i1 < tvisibleType1.length) {
             i2 = i2 + CodedOutputByteBufferNano.computeUInt32SizeNoTag(tvisibleType1[i1]);
             i1 = i1 + 1;
          }
          i = (i + i2) + (tvisibleType1.length * 1);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveDistrictRankFinalBattle$SCLiveRankVisibleUpdateInfo mergeFrom(CodedInputByteBufferNano p0){
       int i2;
       LiveDistrictRankFinalBattle$SCLiveRankVisibleUpdateInfo tvisibleType;
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
                tvisibleType = this.visibleType;
                int i3 = (tvisibleType == null)? 0: tvisibleType.length;
                i2 = i2 + i3;
                int[] ointArray = new int[i2];
                if (i3) {
                   System.arraycopy(tvisibleType, 0, ointArray, 0, i3);
                }
                while (i3 < i2) {
                   ointArray[i3] = p0.readUInt32();
                   i3 = i3 + 1;
                }
                this.visibleType = ointArray;
                p0.popLimit(i);
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             tvisibleType = this.visibleType;
             i2 = (tvisibleType == null)? 0: tvisibleType.length;
             i = i + i2;
             int[] ointArray1 = new int[i];
             if (i2) {
                System.arraycopy(tvisibleType, 0, ointArray1, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                ointArray1[i2] = p0.readUInt32();
                p0.readTag();
                i2 = i2 + 1;
             }
             ointArray1[i2] = p0.readUInt32();
             this.visibleType = ointArray1;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveDistrictRankFinalBattle$SCLiveRankVisibleUpdateInfo tvisibleType = this.visibleType;
       if (tvisibleType != null && tvisibleType.length > 0) {
          int i = 0;
          LiveDistrictRankFinalBattle$SCLiveRankVisibleUpdateInfo tvisibleType1 = this.visibleType;
          while (i < tvisibleType1.length) {
             p0.writeUInt32(1, tvisibleType1[i]);
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
