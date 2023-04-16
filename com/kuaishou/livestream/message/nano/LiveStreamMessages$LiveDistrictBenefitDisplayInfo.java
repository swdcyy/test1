package com.kuaishou.livestream.message.nano.LiveStreamMessages$LiveDistrictBenefitDisplayInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$LiveDistrictBenefitDisplayInfo extends MessageNano	// class@0012f3
{
    public String backGroundColorBegin;
    public String backGroundColorEnd;
    public String benefitDisplayMessage;
    public long benefitDisplayMessageDuration;
    public long benefitEndTime;
    public String contentColor;
    public static LiveStreamMessages$LiveDistrictBenefitDisplayInfo[] _emptyArray;

    public void LiveStreamMessages$LiveDistrictBenefitDisplayInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$LiveDistrictBenefitDisplayInfo[] emptyArray(){
       if (LiveStreamMessages$LiveDistrictBenefitDisplayInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$LiveDistrictBenefitDisplayInfo._emptyArray == null) {
             LiveStreamMessages$LiveDistrictBenefitDisplayInfo[] liveDistrict = new LiveStreamMessages$LiveDistrictBenefitDisplayInfo[0];
             LiveStreamMessages$LiveDistrictBenefitDisplayInfo._emptyArray = liveDistrict;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$LiveDistrictBenefitDisplayInfo._emptyArray;
    }
    public static LiveStreamMessages$LiveDistrictBenefitDisplayInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$LiveDistrictBenefitDisplayInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$LiveDistrictBenefitDisplayInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$LiveDistrictBenefitDisplayInfo(), p0);
    }
    public LiveStreamMessages$LiveDistrictBenefitDisplayInfo clear(){
       this.benefitDisplayMessage = "";
       this.benefitDisplayMessageDuration = 0;
       this.benefitEndTime = 0;
       this.backGroundColorBegin = "";
       this.backGroundColorEnd = "";
       this.contentColor = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.benefitDisplayMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.benefitDisplayMessage);
       }
       LiveStreamMessages$LiveDistrictBenefitDisplayInfo tbenefitDisp = this.benefitDisplayMessageDuration;
       if (tbenefitDisp) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tbenefitDisp);
       }
       tbenefitDisp = this.benefitEndTime;
       if (tbenefitDisp) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tbenefitDisp);
       }
       if (!(this.backGroundColorBegin).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.backGroundColorBegin);
       }
       if (!(this.backGroundColorEnd).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.backGroundColorEnd);
       }
       if (!(this.contentColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.contentColor);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$LiveDistrictBenefitDisplayInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 50) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.contentColor = p0.readString();
                         }
                      }else {
                         this.backGroundColorEnd = p0.readString();
                      }
                   }else {
                      this.backGroundColorBegin = p0.readString();
                   }
                }else {
                   this.benefitEndTime = p0.readUInt64();
                }
             }else {
                this.benefitDisplayMessageDuration = p0.readUInt64();
             }
          }else {
             this.benefitDisplayMessage = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.benefitDisplayMessage).equals(str)) {
          p0.writeString(1, this.benefitDisplayMessage);
       }
       LiveStreamMessages$LiveDistrictBenefitDisplayInfo tbenefitDisp = this.benefitDisplayMessageDuration;
       if (tbenefitDisp) {
          p0.writeUInt64(2, tbenefitDisp);
       }
       tbenefitDisp = this.benefitEndTime;
       if (tbenefitDisp) {
          p0.writeUInt64(3, tbenefitDisp);
       }
       if (!(this.backGroundColorBegin).equals(str)) {
          p0.writeString(4, this.backGroundColorBegin);
       }
       if (!(this.backGroundColorEnd).equals(str)) {
          p0.writeString(5, this.backGroundColorEnd);
       }
       if (!(this.contentColor).equals(str)) {
          p0.writeString(6, this.contentColor);
       }
       super.writeTo(p0);
       return;
    }
}
