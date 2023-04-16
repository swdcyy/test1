package com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$CustomizedPriceIncrementConfig;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.System;

public final class LiveRoomSignalMessage$CustomizedPriceIncrementConfig extends MessageNano	// class@001c48
{
    public long lowerBidPrice;
    public long[] priceIncrement;
    public long upperBidPrice;
    public static LiveRoomSignalMessage$CustomizedPriceIncrementConfig[] _emptyArray;

    public void LiveRoomSignalMessage$CustomizedPriceIncrementConfig(){
       super();
       this.clear();
    }
    public static LiveRoomSignalMessage$CustomizedPriceIncrementConfig[] emptyArray(){
       if (LiveRoomSignalMessage$CustomizedPriceIncrementConfig._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomSignalMessage$CustomizedPriceIncrementConfig._emptyArray == null) {
             LiveRoomSignalMessage$CustomizedPriceIncrementConfig[] uCustomizedP = new LiveRoomSignalMessage$CustomizedPriceIncrementConfig[0];
             LiveRoomSignalMessage$CustomizedPriceIncrementConfig._emptyArray = uCustomizedP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomSignalMessage$CustomizedPriceIncrementConfig._emptyArray;
    }
    public static LiveRoomSignalMessage$CustomizedPriceIncrementConfig parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomSignalMessage$CustomizedPriceIncrementConfig().mergeFrom(p0);
    }
    public static LiveRoomSignalMessage$CustomizedPriceIncrementConfig parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomSignalMessage$CustomizedPriceIncrementConfig(), p0);
    }
    public LiveRoomSignalMessage$CustomizedPriceIncrementConfig clear(){
       this.lowerBidPrice = 0;
       this.upperBidPrice = 0;
       this.priceIncrement = WireFormatNano.EMPTY_LONG_ARRAY;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveRoomSignalMessage$CustomizedPriceIncrementConfig tlowerBidPri = this.lowerBidPrice;
       LiveRoomSignalMessage$CustomizedPriceIncrementConfig uCustomizedP = null;
       if (tlowerBidPri - uCustomizedP) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tlowerBidPri);
       }
       tlowerBidPri = this.upperBidPrice;
       if (tlowerBidPri - uCustomizedP) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tlowerBidPri);
       }
       tlowerBidPri = this.priceIncrement;
       if (tlowerBidPri != null && tlowerBidPri.length > 0) {
          int i1 = 0;
          int i2 = 0;
          uCustomizedP = this.priceIncrement;
          while (i1 < uCustomizedP.length) {
             i2 = i2 + CodedOutputByteBufferNano.computeUInt64SizeNoTag(uCustomizedP[i1]);
             i1 = i1 + 1;
          }
          i = (i + i2) + (uCustomizedP.length * 1);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomSignalMessage$CustomizedPriceIncrementConfig mergeFrom(CodedInputByteBufferNano p0){
       int i2;
       LiveRoomSignalMessage$CustomizedPriceIncrementConfig tpriceIncrem;
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
                      tpriceIncrem = this.priceIncrement;
                      int i3 = (tpriceIncrem == null)? 0: tpriceIncrem.length;
                      i2 = i2 + i3;
                      long[] olongArray = new long[i2];
                      if (i3) {
                         System.arraycopy(tpriceIncrem, 0, olongArray, 0, i3);
                      }
                      while (i3 < i2) {
                         olongArray[i3] = p0.readUInt64();
                         i3 = i3 + 1;
                      }
                      this.priceIncrement = olongArray;
                      p0.popLimit(i);
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   tpriceIncrem = this.priceIncrement;
                   i2 = (tpriceIncrem == null)? 0: tpriceIncrem.length;
                   i = i + i2;
                   long[] olongArray1 = new long[i];
                   if (i2) {
                      System.arraycopy(tpriceIncrem, 0, olongArray1, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      olongArray1[i2] = p0.readUInt64();
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   olongArray1[i2] = p0.readUInt64();
                   this.priceIncrement = olongArray1;
                }
             }else {
                this.upperBidPrice = p0.readUInt64();
             }
          }else {
             this.lowerBidPrice = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveRoomSignalMessage$CustomizedPriceIncrementConfig tlowerBidPri = this.lowerBidPrice;
       int i = 0;
       if (tlowerBidPri - i) {
          p0.writeUInt64(1, tlowerBidPri);
       }
       tlowerBidPri = this.upperBidPrice;
       if (tlowerBidPri - i) {
          p0.writeUInt64(2, tlowerBidPri);
       }
       tlowerBidPri = this.priceIncrement;
       if (tlowerBidPri != null && tlowerBidPri.length > 0) {
          int i1 = 0;
          LiveRoomSignalMessage$CustomizedPriceIncrementConfig tpriceIncrem = this.priceIncrement;
          while (i1 < tpriceIncrem.length) {
             p0.writeUInt64(3, tpriceIncrem[i1]);
             i1 = i1 + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
