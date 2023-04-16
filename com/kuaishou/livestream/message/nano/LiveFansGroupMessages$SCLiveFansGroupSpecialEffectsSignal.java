package com.kuaishou.livestream.message.nano.LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBaseItemData;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBackgroundData;
import java.lang.Object;
import java.lang.System;

public final class LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal extends MessageNano	// class@0011b0
{
    public LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBackgroundData backgroundData;
    public LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBaseItemData[] baseItemData;
    public int priority;
    public int runwayType;
    public int type;
    public long userId;
    public static LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal[] _emptyArray;

    public void LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal(){
       super();
       this.clear();
    }
    public static LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal[] emptyArray(){
       if (LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal._emptyArray == null) {
             LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal[] sCLiveFansGr = new LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal[0];
             LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal._emptyArray = sCLiveFansGr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal._emptyArray;
    }
    public static LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal parseFrom(CodedInputByteBufferNano p0){
       return new LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal().mergeFrom(p0);
    }
    public static LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal(), p0);
    }
    public LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal clear(){
       this.type = 0;
       this.priority = 0;
       this.runwayType = 0;
       this.userId = 0;
       this.baseItemData = LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBaseItemData.emptyArray();
       this.backgroundData = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, ttype);
       }
       ttype = this.priority;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, ttype);
       }
       ttype = this.runwayType;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, ttype);
       }
       ttype = this.userId;
       if (ttype) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, ttype);
       }
       ttype = this.baseItemData;
       if (ttype != null && ttype.length > 0) {
          int i1 = 0;
          LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal tbaseItemDat = this.baseItemData;
          while (i1 < tbaseItemDat.length) {
             object oobject = tbaseItemDat[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ttype = this.backgroundData;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, ttype);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      int i1 = 42;
                      if (i != i1) {
                         if (i != 50) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else if(this.backgroundData == null){
                            this.backgroundData = new LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBackgroundData();
                         }
                         p0.readMessage(this.backgroundData);
                      }else {
                         i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                         LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal tbaseItemDat = this.baseItemData;
                         int i2 = (tbaseItemDat == null)? 0: tbaseItemDat.length;
                         i = i + i2;
                         LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBaseItemData[] sCLiveFansGr = new LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBaseItemData[i];
                         if (i2) {
                            System.arraycopy(tbaseItemDat, 0, sCLiveFansGr, 0, i2);
                         }
                         i1 = i - 1;
                         while (i2 < i1) {
                            sCLiveFansGr[i2] = new LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBaseItemData();
                            p0.readMessage(sCLiveFansGr[i2]);
                            p0.readTag();
                            i2 = i2 + 1;
                         }
                         sCLiveFansGr[i2] = new LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal$LiveFloatingScreenBaseItemData();
                         p0.readMessage(sCLiveFansGr[i2]);
                         this.baseItemData = sCLiveFansGr;
                      }
                   }else {
                      this.userId = p0.readUInt64();
                   }
                }else {
                   this.runwayType = p0.readUInt32();
                }
             }else {
                this.priority = p0.readUInt32();
             }
          }else {
             this.type = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal ttype = this.type;
       if (ttype != null) {
          p0.writeUInt32(1, ttype);
       }
       ttype = this.priority;
       if (ttype != null) {
          p0.writeUInt32(2, ttype);
       }
       ttype = this.runwayType;
       if (ttype != null) {
          p0.writeUInt32(3, ttype);
       }
       ttype = this.userId;
       if (ttype) {
          p0.writeUInt64(4, ttype);
       }
       ttype = this.baseItemData;
       if (ttype != null && ttype.length > 0) {
          int i = 0;
          LiveFansGroupMessages$SCLiveFansGroupSpecialEffectsSignal tbaseItemDat = this.baseItemData;
          while (i < tbaseItemDat.length) {
             object oobject = tbaseItemDat[i];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i = i + 1;
          }
       }
       ttype = this.backgroundData;
       if (ttype != null) {
          p0.writeMessage(6, ttype);
       }
       super.writeTo(p0);
       return;
    }
}
