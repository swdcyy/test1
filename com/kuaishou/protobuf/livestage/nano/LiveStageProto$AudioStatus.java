package com.kuaishou.protobuf.livestage.nano.LiveStageProto$AudioStatus;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.System;

public final class LiveStageProto$AudioStatus extends MessageNano	// class@000bfb
{
    public long[] muteUserIds;
    public long[] speakingUserIds;
    public long timestamp;
    public int verion;
    public static LiveStageProto$AudioStatus[] _emptyArray;

    public void LiveStageProto$AudioStatus(){
       super();
       this.clear();
    }
    public static LiveStageProto$AudioStatus[] emptyArray(){
       if (LiveStageProto$AudioStatus._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStageProto$AudioStatus._emptyArray == null) {
             LiveStageProto$AudioStatus[] uAudioStatus = new LiveStageProto$AudioStatus[0];
             LiveStageProto$AudioStatus._emptyArray = uAudioStatus;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStageProto$AudioStatus._emptyArray;
    }
    public static LiveStageProto$AudioStatus parseFrom(CodedInputByteBufferNano p0){
       return new LiveStageProto$AudioStatus().mergeFrom(p0);
    }
    public static LiveStageProto$AudioStatus parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStageProto$AudioStatus(), p0);
    }
    public LiveStageProto$AudioStatus clear(){
       this.verion = 0;
       long[] eMPTY_LONG_A = WireFormatNano.EMPTY_LONG_ARRAY;
       this.muteUserIds = eMPTY_LONG_A;
       this.speakingUserIds = eMPTY_LONG_A;
       this.timestamp = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       int i = super.computeSerializedSize();
       LiveStageProto$AudioStatus tmuteUserIds = this.muteUserIds;
       int i1 = 0;
       if (tmuteUserIds != null && tmuteUserIds.length > 0) {
          i2 = 0;
          int i3 = 0;
          LiveStageProto$AudioStatus tmuteUserIds1 = this.muteUserIds;
          while (i2 < tmuteUserIds1.length) {
             i3 = i3 + CodedOutputByteBufferNano.computeUInt64SizeNoTag(tmuteUserIds1[i2]);
             i2 = i2 + 1;
          }
          i = (i + i3) + (tmuteUserIds1.length * 1);
       }
       tmuteUserIds = this.speakingUserIds;
       if (tmuteUserIds != null && tmuteUserIds.length > 0) {
          i2 = 0;
          LiveStageProto$AudioStatus tspeakingUse = this.speakingUserIds;
          while (i1 < tspeakingUse.length) {
             i2 = i2 + CodedOutputByteBufferNano.computeUInt64SizeNoTag(tspeakingUse[i1]);
             i1 = i1 + 1;
          }
          i = (i + i2) + (tspeakingUse.length * 1);
       }
       tmuteUserIds = this.verion;
       if (tmuteUserIds != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tmuteUserIds);
       }
       tmuteUserIds = this.timestamp;
       if (tmuteUserIds) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tmuteUserIds);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStageProto$AudioStatus mergeFrom(CodedInputByteBufferNano p0){
       int i2;
       LiveStageProto$AudioStatus tspeakingUse;
       int i3;
       long[] olongArray;
       long[] olongArray1;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 8;
          if (i != i1) {
             if (i != 10) {
                i1 = 16;
                if (i != i1) {
                   if (i != 18) {
                      if (i != 24) {
                         if (i != 32) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.timestamp = p0.readUInt64();
                         }
                      }else {
                         i = p0.readInt32();
                         if (i && i != 1) {
                            continue ;
                         }else {
                            this.verion = i;
                         }
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
                      tspeakingUse = this.speakingUserIds;
                      i3 = (tspeakingUse == null)? 0: tspeakingUse.length;
                      i2 = i2 + i3;
                      olongArray = new long[i2];
                      if (i3) {
                         System.arraycopy(tspeakingUse, 0, olongArray, 0, i3);
                      }
                      while (i3 < i2) {
                         olongArray[i3] = p0.readUInt64();
                         i3 = i3 + 1;
                      }
                      this.speakingUserIds = olongArray;
                      p0.popLimit(i);
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   tspeakingUse = this.speakingUserIds;
                   i2 = (tspeakingUse == null)? 0: tspeakingUse.length;
                   i = i + i2;
                   olongArray1 = new long[i];
                   if (i2) {
                      System.arraycopy(tspeakingUse, 0, olongArray1, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      olongArray1[i2] = p0.readUInt64();
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   olongArray1[i2] = p0.readUInt64();
                   this.speakingUserIds = olongArray1;
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
                tspeakingUse = this.muteUserIds;
                i3 = (tspeakingUse == null)? 0: tspeakingUse.length;
                i2 = i2 + i3;
                olongArray = new long[i2];
                if (i3) {
                   System.arraycopy(tspeakingUse, 0, olongArray, 0, i3);
                }
                while (i3 < i2) {
                   olongArray[i3] = p0.readUInt64();
                   i3 = i3 + 1;
                }
                this.muteUserIds = olongArray;
                p0.popLimit(i);
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             tspeakingUse = this.muteUserIds;
             i2 = (tspeakingUse == null)? 0: tspeakingUse.length;
             i = i + i2;
             olongArray1 = new long[i];
             if (i2) {
                System.arraycopy(tspeakingUse, 0, olongArray1, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                olongArray1[i2] = p0.readUInt64();
                p0.readTag();
                i2 = i2 + 1;
             }
             olongArray1[i2] = p0.readUInt64();
             this.muteUserIds = olongArray1;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStageProto$AudioStatus tmuteUserIds = this.muteUserIds;
       int i = 0;
       if (tmuteUserIds != null && tmuteUserIds.length > 0) {
          int i1 = 0;
          LiveStageProto$AudioStatus tmuteUserIds1 = this.muteUserIds;
          while (i1 < tmuteUserIds1.length) {
             p0.writeUInt64(1, tmuteUserIds1[i1]);
             i1 = i1 + 1;
          }
       }
       tmuteUserIds = this.speakingUserIds;
       if (tmuteUserIds != null && tmuteUserIds.length > 0) {
          tmuteUserIds = this.speakingUserIds;
          while (i < tmuteUserIds.length) {
             p0.writeUInt64(2, tmuteUserIds[i]);
             i = i + 1;
          }
       }
       tmuteUserIds = this.verion;
       if (tmuteUserIds != null) {
          p0.writeInt32(3, tmuteUserIds);
       }
       tmuteUserIds = this.timestamp;
       if (tmuteUserIds) {
          p0.writeUInt64(4, tmuteUserIds);
       }
       super.writeTo(p0);
       return;
    }
}
