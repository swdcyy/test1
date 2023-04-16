package com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$LiveSandeapyInfoSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.System;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$ItemInfo;

public final class LiveRoomSignalMessage$LiveSandeapyInfoSignal extends MessageNano	// class@001c5f
{
    public int giftId;
    public LiveRoomSignalMessage$ItemInfo itemInfo;
    public int[] priceRange;
    public static LiveRoomSignalMessage$LiveSandeapyInfoSignal[] _emptyArray;

    public void LiveRoomSignalMessage$LiveSandeapyInfoSignal(){
       super();
       this.clear();
    }
    public static LiveRoomSignalMessage$LiveSandeapyInfoSignal[] emptyArray(){
       if (LiveRoomSignalMessage$LiveSandeapyInfoSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomSignalMessage$LiveSandeapyInfoSignal._emptyArray == null) {
             LiveRoomSignalMessage$LiveSandeapyInfoSignal[] liveSandeapy = new LiveRoomSignalMessage$LiveSandeapyInfoSignal[0];
             LiveRoomSignalMessage$LiveSandeapyInfoSignal._emptyArray = liveSandeapy;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomSignalMessage$LiveSandeapyInfoSignal._emptyArray;
    }
    public static LiveRoomSignalMessage$LiveSandeapyInfoSignal parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomSignalMessage$LiveSandeapyInfoSignal().mergeFrom(p0);
    }
    public static LiveRoomSignalMessage$LiveSandeapyInfoSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomSignalMessage$LiveSandeapyInfoSignal(), p0);
    }
    public LiveRoomSignalMessage$LiveSandeapyInfoSignal clear(){
       this.itemInfo = null;
       this.giftId = 0;
       this.priceRange = WireFormatNano.EMPTY_INT_ARRAY;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveRoomSignalMessage$LiveSandeapyInfoSignal titemInfo = this.itemInfo;
       if (titemInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, titemInfo);
       }
       titemInfo = this.giftId;
       if (titemInfo != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, titemInfo);
       }
       titemInfo = this.priceRange;
       if (titemInfo != null && titemInfo.length > 0) {
          int i1 = 0;
          int i2 = 0;
          LiveRoomSignalMessage$LiveSandeapyInfoSignal tpriceRange = this.priceRange;
          while (i1 < tpriceRange.length) {
             i2 = i2 + CodedOutputByteBufferNano.computeUInt32SizeNoTag(tpriceRange[i1]);
             i1 = i1 + 1;
          }
          i = (i + i2) + (tpriceRange.length * 1);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomSignalMessage$LiveSandeapyInfoSignal mergeFrom(CodedInputByteBufferNano p0){
       int i2;
       LiveRoomSignalMessage$LiveSandeapyInfoSignal tpriceRange;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
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
                         p0.readUInt32();
                         i2 = i2 + 1;
                      }
                      p0.rewindToPosition(i1);
                      tpriceRange = this.priceRange;
                      int i3 = (tpriceRange == null)? 0: tpriceRange.length;
                      i2 = i2 + i3;
                      int[] ointArray = new int[i2];
                      if (i3) {
                         System.arraycopy(tpriceRange, 0, ointArray, 0, i3);
                      }
                      while (i3 < i2) {
                         ointArray[i3] = p0.readUInt32();
                         i3 = i3 + 1;
                      }
                      this.priceRange = ointArray;
                      p0.popLimit(i);
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   tpriceRange = this.priceRange;
                   i2 = (tpriceRange == null)? 0: tpriceRange.length;
                   i = i + i2;
                   int[] ointArray1 = new int[i];
                   if (i2) {
                      System.arraycopy(tpriceRange, 0, ointArray1, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      ointArray1[i2] = p0.readUInt32();
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   ointArray1[i2] = p0.readUInt32();
                   this.priceRange = ointArray1;
                }
             }else {
                this.giftId = p0.readUInt32();
             }
          }else if(this.itemInfo == null){
             this.itemInfo = new LiveRoomSignalMessage$ItemInfo();
          }
          p0.readMessage(this.itemInfo);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveRoomSignalMessage$LiveSandeapyInfoSignal titemInfo = this.itemInfo;
       if (titemInfo != null) {
          p0.writeMessage(1, titemInfo);
       }
       titemInfo = this.giftId;
       if (titemInfo != null) {
          p0.writeUInt32(2, titemInfo);
       }
       titemInfo = this.priceRange;
       if (titemInfo != null && titemInfo.length > 0) {
          int i = 0;
          LiveRoomSignalMessage$LiveSandeapyInfoSignal tpriceRange = this.priceRange;
          while (i < tpriceRange.length) {
             p0.writeUInt32(3, tpriceRange[i]);
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
