package com.kuaishou.protobuf.merchant.message.nano.DeliveryCouponMessages$CouponInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.System;

public final class DeliveryCouponMessages$CouponInfo extends MessageNano	// class@000def
{
    public String couponName;
    public String couponPrice;
    public String deliveryNum;
    public String extraMap;
    public boolean isFollowReceive;
    public String notAllowedTip;
    public String receiveConditionTitle;
    public int sc;
    public int[] si;
    public String useConditionTitle;
    public String useRangeTitle;
    public String validPeriod;
    public static DeliveryCouponMessages$CouponInfo[] _emptyArray;

    public void DeliveryCouponMessages$CouponInfo(){
       super();
       this.clear();
    }
    public static DeliveryCouponMessages$CouponInfo[] emptyArray(){
       if (DeliveryCouponMessages$CouponInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (DeliveryCouponMessages$CouponInfo._emptyArray == null) {
             DeliveryCouponMessages$CouponInfo[] uCouponInfoA = new DeliveryCouponMessages$CouponInfo[0];
             DeliveryCouponMessages$CouponInfo._emptyArray = uCouponInfoA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return DeliveryCouponMessages$CouponInfo._emptyArray;
    }
    public static DeliveryCouponMessages$CouponInfo parseFrom(CodedInputByteBufferNano p0){
       return new DeliveryCouponMessages$CouponInfo().mergeFrom(p0);
    }
    public static DeliveryCouponMessages$CouponInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new DeliveryCouponMessages$CouponInfo(), p0);
    }
    public DeliveryCouponMessages$CouponInfo clear(){
       this.couponName = "";
       this.couponPrice = "";
       this.useConditionTitle = "";
       this.useRangeTitle = "";
       this.validPeriod = "";
       this.deliveryNum = "";
       this.receiveConditionTitle = "";
       this.isFollowReceive = false;
       this.notAllowedTip = "";
       this.sc = 0;
       this.si = WireFormatNano.EMPTY_INT_ARRAY;
       this.extraMap = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.couponName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.couponName);
       }
       if (!(this.couponPrice).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.couponPrice);
       }
       if (!(this.useConditionTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.useConditionTitle);
       }
       if (!(this.useRangeTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.useRangeTitle);
       }
       if (!(this.validPeriod).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.validPeriod);
       }
       if (!(this.deliveryNum).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.deliveryNum);
       }
       if (!(this.receiveConditionTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.receiveConditionTitle);
       }
       DeliveryCouponMessages$CouponInfo tisFollowRec = this.isFollowReceive;
       if (tisFollowRec != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(8, tisFollowRec);
       }
       if (!(this.notAllowedTip).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.notAllowedTip);
       }
       tisFollowRec = this.sc;
       if (tisFollowRec != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(10, tisFollowRec);
       }
       tisFollowRec = this.si;
       if (tisFollowRec != null && tisFollowRec.length > 0) {
          int i1 = 0;
          int i2 = 0;
          DeliveryCouponMessages$CouponInfo tsi = this.si;
          while (i1 < tsi.length) {
             i2 = i2 + CodedOutputByteBufferNano.computeInt32SizeNoTag(tsi[i1]);
             i1 = i1 + 1;
          }
          i = (i + i2) + (tsi.length * 1);
       }
       if (!(this.extraMap).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.extraMap);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public DeliveryCouponMessages$CouponInfo mergeFrom(CodedInputByteBufferNano p0){
       DeliveryCouponMessages$CouponInfo tsi;
       int i2;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 10:
                this.couponName = p0.readString();
                break;
              case 18:
                this.couponPrice = p0.readString();
                break;
              case 26:
                this.useConditionTitle = p0.readString();
                break;
              case '"':
                this.useRangeTitle = p0.readString();
                break;
              case '*':
                this.validPeriod = p0.readString();
                break;
              case '2':
                this.deliveryNum = p0.readString();
                break;
              case ':':
                this.receiveConditionTitle = p0.readString();
                break;
              case '@':
                this.isFollowReceive = p0.readBool();
                break;
              case 'J':
                this.notAllowedTip = p0.readString();
                break;
              case 'P':
                this.sc = p0.readInt32();
                break;
              case 'X':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 88);
                tsi = this.si;
                i2 = (tsi == null)? 0: tsi.length;
                i = i + i2;
                int[] ointArray = new int[i];
                if (i2) {
                   System.arraycopy(tsi, i1, ointArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   ointArray[i2] = p0.readInt32();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                ointArray[i2] = p0.readInt32();
                this.si = ointArray;
                break;
              case 'Z':
                i = p0.pushLimit(p0.readRawVarint32());
                int position = p0.getPosition();
                i2 = 0;
                while (p0.getBytesUntilLimit() > 0) {
                   p0.readInt32();
                   i2 = i2 + 1;
                }
                p0.rewindToPosition(position);
                tsi = this.si;
                int i3 = (tsi == null)? 0: tsi.length;
                i2 = i2 + i3;
                int[] ointArray1 = new int[i2];
                if (i3) {
                   System.arraycopy(tsi, i1, ointArray1, i1, i3);
                }
                while (i3 < i2) {
                   ointArray1[i3] = p0.readInt32();
                   i3 = i3 + 1;
                }
                this.si = ointArray1;
                p0.popLimit(i);
                break;
              case 'b':
                this.extraMap = p0.readString();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.couponName).equals(str)) {
          p0.writeString(1, this.couponName);
       }
       if (!(this.couponPrice).equals(str)) {
          p0.writeString(2, this.couponPrice);
       }
       if (!(this.useConditionTitle).equals(str)) {
          p0.writeString(3, this.useConditionTitle);
       }
       if (!(this.useRangeTitle).equals(str)) {
          p0.writeString(4, this.useRangeTitle);
       }
       if (!(this.validPeriod).equals(str)) {
          p0.writeString(5, this.validPeriod);
       }
       if (!(this.deliveryNum).equals(str)) {
          p0.writeString(6, this.deliveryNum);
       }
       if (!(this.receiveConditionTitle).equals(str)) {
          p0.writeString(7, this.receiveConditionTitle);
       }
       DeliveryCouponMessages$CouponInfo tisFollowRec = this.isFollowReceive;
       if (tisFollowRec != null) {
          p0.writeBool(8, tisFollowRec);
       }
       if (!(this.notAllowedTip).equals(str)) {
          p0.writeString(9, this.notAllowedTip);
       }
       tisFollowRec = this.sc;
       if (tisFollowRec != null) {
          p0.writeInt32(10, tisFollowRec);
       }
       tisFollowRec = this.si;
       if (tisFollowRec != null && tisFollowRec.length > 0) {
          int i = 0;
          DeliveryCouponMessages$CouponInfo tsi = this.si;
          while (i < tsi.length) {
             p0.writeInt32(11, tsi[i]);
             i = i + 1;
          }
       }
       if (!(this.extraMap).equals(str)) {
          p0.writeString(12, this.extraMap);
       }
       super.writeTo(p0);
       return;
    }
}
