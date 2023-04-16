package com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$RecruitWidgetTopLeftAlertInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LivePlusRecruitMessages$RecruitWidgetTopLeftAlertInfo extends MessageNano	// class@001247
{
    public String alertText;
    public String alertTextColor;
    public String backgroundColor;
    public int status;
    public static LivePlusRecruitMessages$RecruitWidgetTopLeftAlertInfo[] _emptyArray;

    public void LivePlusRecruitMessages$RecruitWidgetTopLeftAlertInfo(){
       super();
       this.clear();
    }
    public static LivePlusRecruitMessages$RecruitWidgetTopLeftAlertInfo[] emptyArray(){
       if (LivePlusRecruitMessages$RecruitWidgetTopLeftAlertInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePlusRecruitMessages$RecruitWidgetTopLeftAlertInfo._emptyArray == null) {
             LivePlusRecruitMessages$RecruitWidgetTopLeftAlertInfo[] recruitWidge = new LivePlusRecruitMessages$RecruitWidgetTopLeftAlertInfo[0];
             LivePlusRecruitMessages$RecruitWidgetTopLeftAlertInfo._emptyArray = recruitWidge;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePlusRecruitMessages$RecruitWidgetTopLeftAlertInfo._emptyArray;
    }
    public static LivePlusRecruitMessages$RecruitWidgetTopLeftAlertInfo parseFrom(CodedInputByteBufferNano p0){
       return new LivePlusRecruitMessages$RecruitWidgetTopLeftAlertInfo().mergeFrom(p0);
    }
    public static LivePlusRecruitMessages$RecruitWidgetTopLeftAlertInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePlusRecruitMessages$RecruitWidgetTopLeftAlertInfo(), p0);
    }
    public LivePlusRecruitMessages$RecruitWidgetTopLeftAlertInfo clear(){
       this.alertText = "";
       this.alertTextColor = "";
       this.backgroundColor = "";
       this.status = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.alertText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.alertText);
       }
       if (!(this.alertTextColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.alertTextColor);
       }
       if (!(this.backgroundColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.backgroundColor);
       }
       LivePlusRecruitMessages$RecruitWidgetTopLeftAlertInfo tstatus = this.status;
       if (tstatus != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tstatus);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePlusRecruitMessages$RecruitWidgetTopLeftAlertInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      i = p0.readInt32();
                      if (i && (i != 1 && (i != 2 && i != 3))) {
                         continue ;
                      }else {
                         this.status = i;
                      }
                   }
                }else {
                   this.backgroundColor = p0.readString();
                }
             }else {
                this.alertTextColor = p0.readString();
             }
          }else {
             this.alertText = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.alertText).equals(str)) {
          p0.writeString(1, this.alertText);
       }
       if (!(this.alertTextColor).equals(str)) {
          p0.writeString(2, this.alertTextColor);
       }
       if (!(this.backgroundColor).equals(str)) {
          p0.writeString(3, this.backgroundColor);
       }
       LivePlusRecruitMessages$RecruitWidgetTopLeftAlertInfo tstatus = this.status;
       if (tstatus != null) {
          p0.writeInt32(4, tstatus);
       }
       super.writeTo(p0);
       return;
    }
}
