package com.kuaishou.livestream.message.nano.LiveEffectExtraResInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveEffectResourceData;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveEffectExtraResInfo extends MessageNano	// class@001196
{
    public int bizResource;
    public int reqType;
    public LiveEffectResourceData[] resourceDataList;
    public long seqId;
    public long timeoutDurationMs;
    public static LiveEffectExtraResInfo[] _emptyArray;

    public void LiveEffectExtraResInfo(){
       super();
       this.clear();
    }
    public static LiveEffectExtraResInfo[] emptyArray(){
       if (LiveEffectExtraResInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveEffectExtraResInfo._emptyArray == null) {
             LiveEffectExtraResInfo[] liveEffectEx = new LiveEffectExtraResInfo[0];
             LiveEffectExtraResInfo._emptyArray = liveEffectEx;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveEffectExtraResInfo._emptyArray;
    }
    public static LiveEffectExtraResInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveEffectExtraResInfo().mergeFrom(p0);
    }
    public static LiveEffectExtraResInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveEffectExtraResInfo(), p0);
    }
    public LiveEffectExtraResInfo clear(){
       this.reqType = 0;
       this.timeoutDurationMs = 0;
       this.resourceDataList = LiveEffectResourceData.emptyArray();
       this.bizResource = 0;
       this.seqId = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveEffectExtraResInfo treqType = this.reqType;
       if (treqType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, treqType);
       }
       treqType = this.timeoutDurationMs;
       int i1 = 0;
       if (treqType - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, treqType);
       }
       treqType = this.resourceDataList;
       if (treqType != null && treqType.length > 0) {
          int i2 = 0;
          LiveEffectExtraResInfo tresourceDat = this.resourceDataList;
          while (i2 < tresourceDat.length) {
             object oobject = tresourceDat[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i2 = i2 + 1;
          }
       }
       treqType = this.bizResource;
       if (treqType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, treqType);
       }
       treqType = this.seqId;
       if (treqType - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, treqType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveEffectExtraResInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                int i1 = 26;
                if (i != i1) {
                   if (i != 32) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.seqId = p0.readUInt64();
                      }
                   }else {
                      i = p0.readInt32();
                      if (i && i != 1) {
                         continue ;
                      }else {
                         this.bizResource = i;
                      }
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   LiveEffectExtraResInfo tresourceDat = this.resourceDataList;
                   int i2 = (tresourceDat == null)? 0: tresourceDat.length;
                   i = i + i2;
                   LiveEffectResourceData[] liveEffectRe = new LiveEffectResourceData[i];
                   if (i2) {
                      System.arraycopy(tresourceDat, 0, liveEffectRe, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      liveEffectRe[i2] = new LiveEffectResourceData();
                      p0.readMessage(liveEffectRe[i2]);
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   liveEffectRe[i2] = new LiveEffectResourceData();
                   p0.readMessage(liveEffectRe[i2]);
                   this.resourceDataList = liveEffectRe;
                }
             }else {
                this.timeoutDurationMs = p0.readUInt64();
             }
          }else {
             this.reqType = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveEffectExtraResInfo treqType = this.reqType;
       if (treqType != null) {
          p0.writeUInt32(1, treqType);
       }
       treqType = this.timeoutDurationMs;
       int i = 0;
       if (treqType - i) {
          p0.writeUInt64(2, treqType);
       }
       treqType = this.resourceDataList;
       if (treqType != null && treqType.length > 0) {
          int i1 = 0;
          LiveEffectExtraResInfo tresourceDat = this.resourceDataList;
          while (i1 < tresourceDat.length) {
             object oobject = tresourceDat[i1];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       treqType = this.bizResource;
       if (treqType != null) {
          p0.writeInt32(4, treqType);
       }
       treqType = this.seqId;
       if (treqType - i) {
          p0.writeUInt64(5, treqType);
       }
       super.writeTo(p0);
       return;
    }
}
