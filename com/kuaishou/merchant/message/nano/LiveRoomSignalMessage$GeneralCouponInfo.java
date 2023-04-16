package com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$GeneralCouponInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveRoomSignalMessage$GeneralCouponInfo extends MessageNano	// class@001c4b
{
    public String btnText;
    public String couponName;
    public String couponPrice;
    public int currency;
    public String endTime;
    public String useConditionTitle;
    public String useRangeTitle;
    public static LiveRoomSignalMessage$GeneralCouponInfo[] _emptyArray;

    public void LiveRoomSignalMessage$GeneralCouponInfo(){
       super();
       this.clear();
    }
    public static LiveRoomSignalMessage$GeneralCouponInfo[] emptyArray(){
       if (LiveRoomSignalMessage$GeneralCouponInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomSignalMessage$GeneralCouponInfo._emptyArray == null) {
             LiveRoomSignalMessage$GeneralCouponInfo[] generalCoupo = new LiveRoomSignalMessage$GeneralCouponInfo[0];
             LiveRoomSignalMessage$GeneralCouponInfo._emptyArray = generalCoupo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomSignalMessage$GeneralCouponInfo._emptyArray;
    }
    public static LiveRoomSignalMessage$GeneralCouponInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomSignalMessage$GeneralCouponInfo().mergeFrom(p0);
    }
    public static LiveRoomSignalMessage$GeneralCouponInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomSignalMessage$GeneralCouponInfo(), p0);
    }
    public LiveRoomSignalMessage$GeneralCouponInfo clear(){
       this.couponName = "";
       this.couponPrice = "";
       this.useConditionTitle = "";
       this.useRangeTitle = "";
       this.endTime = "";
       this.currency = 0;
       this.btnText = "";
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
       if (!(this.endTime).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.endTime);
       }
       LiveRoomSignalMessage$GeneralCouponInfo tcurrency = this.currency;
       if (tcurrency != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, tcurrency);
       }
       if (!(this.btnText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.btnText);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomSignalMessage$GeneralCouponInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 56) {
                            if (i != 66) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.btnText = p0.readString();
                            }
                         }else {
                            this.currency = p0.readUInt32();
                         }
                      }else {
                         this.endTime = p0.readString();
                      }
                   }else {
                      this.useRangeTitle = p0.readString();
                   }
                }else {
                   this.useConditionTitle = p0.readString();
                }
             }else {
                this.couponPrice = p0.readString();
             }
          }else {
             this.couponName = p0.readString();
          }
       }
       return this;
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
       if (!(this.endTime).equals(str)) {
          p0.writeString(5, this.endTime);
       }
       LiveRoomSignalMessage$GeneralCouponInfo tcurrency = this.currency;
       if (tcurrency != null) {
          p0.writeUInt32(7, tcurrency);
       }
       if (!(this.btnText).equals(str)) {
          p0.writeString(8, this.btnText);
       }
       super.writeTo(p0);
       return;
    }
}
