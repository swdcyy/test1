package com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$LiveSandeapyBidRefreshSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.System;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$ItemInfo;

public final class LiveRoomSignalMessage$LiveSandeapyBidRefreshSignal extends MessageNano	// class@001c5c
{
    public int giftId;
    public LiveRoomSignalMessage$ItemInfo itemInfo;
    public int[] priceRange;
    public int totalBidder;
    public static LiveRoomSignalMessage$LiveSandeapyBidRefreshSignal[] _emptyArray;

    public void LiveRoomSignalMessage$LiveSandeapyBidRefreshSignal(){
       super();
       this.clear();
    }
    public static LiveRoomSignalMessage$LiveSandeapyBidRefreshSignal[] emptyArray(){
       if (LiveRoomSignalMessage$LiveSandeapyBidRefreshSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomSignalMessage$LiveSandeapyBidRefreshSignal._emptyArray == null) {
             LiveRoomSignalMessage$LiveSandeapyBidRefreshSignal[] liveSandeapy = new LiveRoomSignalMessage$LiveSandeapyBidRefreshSignal[0];
             LiveRoomSignalMessage$LiveSandeapyBidRefreshSignal._emptyArray = liveSandeapy;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomSignalMessage$LiveSandeapyBidRefreshSignal._emptyArray;
    }
    public static LiveRoomSignalMessage$LiveSandeapyBidRefreshSignal parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomSignalMessage$LiveSandeapyBidRefreshSignal().mergeFrom(p0);
    }
    public static LiveRoomSignalMessage$LiveSandeapyBidRefreshSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomSignalMessage$LiveSandeapyBidRefreshSignal(), p0);
    }
    public LiveRoomSignalMessage$LiveSandeapyBidRefreshSignal clear(){
       this.itemInfo = null;
       this.giftId = 0;
       this.priceRange = WireFormatNano.EMPTY_INT_ARRAY;
       this.totalBidder = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveRoomSignalMessage$LiveSandeapyBidRefreshSignal titemInfo = this.itemInfo;
       int i1 = 1;
       if (titemInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, titemInfo);
       }
       titemInfo = this.giftId;
       if (titemInfo != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, titemInfo);
       }
       titemInfo = this.priceRange;
       if (titemInfo != null && titemInfo.length > 0) {
          int i2 = 0;
          int i3 = 0;
          LiveRoomSignalMessage$LiveSandeapyBidRefreshSignal tpriceRange = this.priceRange;
          while (i2 < tpriceRange.length) {
             i3 = i3 + CodedOutputByteBufferNano.computeUInt32SizeNoTag(tpriceRange[i2]);
             i2 = i2 + 1;
          }
          i = (i + i3) + (tpriceRange.length * 1);
       }
       titemInfo = this.totalBidder;
       if (titemInfo != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, titemInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomSignalMessage$LiveSandeapyBidRefreshSignal mergeFrom(CodedInputByteBufferNano p0){
       int i2;
       LiveRoomSignalMessage$LiveSandeapyBidRefreshSignal tpriceRange;
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
                      if (i != 32) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.totalBidder = p0.readUInt32();
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
       LiveRoomSignalMessage$LiveSandeapyBidRefreshSignal titemInfo = this.itemInfo;
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
          LiveRoomSignalMessage$LiveSandeapyBidRefreshSignal tpriceRange = this.priceRange;
          while (i < tpriceRange.length) {
             p0.writeUInt32(3, tpriceRange[i]);
             i = i + 1;
          }
       }
       titemInfo = this.totalBidder;
       if (titemInfo != null) {
          p0.writeUInt32(4, titemInfo);
       }
       super.writeTo(p0);
       return;
    }
}
