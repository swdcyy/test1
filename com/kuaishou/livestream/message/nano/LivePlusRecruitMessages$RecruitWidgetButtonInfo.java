package com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$RecruitWidgetButtonInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LivePlusRecruitMessages$RecruitWidgetButtonInfo extends MessageNano	// class@001245
{
    public String backgroundColor;
    public String buttonText;
    public String buttonTextColor;
    public String buttonUrl;
    public int type;
    public static LivePlusRecruitMessages$RecruitWidgetButtonInfo[] _emptyArray;

    public void LivePlusRecruitMessages$RecruitWidgetButtonInfo(){
       super();
       this.clear();
    }
    public static LivePlusRecruitMessages$RecruitWidgetButtonInfo[] emptyArray(){
       if (LivePlusRecruitMessages$RecruitWidgetButtonInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePlusRecruitMessages$RecruitWidgetButtonInfo._emptyArray == null) {
             LivePlusRecruitMessages$RecruitWidgetButtonInfo[] recruitWidge = new LivePlusRecruitMessages$RecruitWidgetButtonInfo[0];
             LivePlusRecruitMessages$RecruitWidgetButtonInfo._emptyArray = recruitWidge;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePlusRecruitMessages$RecruitWidgetButtonInfo._emptyArray;
    }
    public static LivePlusRecruitMessages$RecruitWidgetButtonInfo parseFrom(CodedInputByteBufferNano p0){
       return new LivePlusRecruitMessages$RecruitWidgetButtonInfo().mergeFrom(p0);
    }
    public static LivePlusRecruitMessages$RecruitWidgetButtonInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePlusRecruitMessages$RecruitWidgetButtonInfo(), p0);
    }
    public LivePlusRecruitMessages$RecruitWidgetButtonInfo clear(){
       this.buttonText = "";
       this.buttonUrl = "";
       this.type = 0;
       this.backgroundColor = "";
       this.buttonTextColor = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.buttonText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.buttonText);
       }
       if (!(this.buttonUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.buttonUrl);
       }
       LivePlusRecruitMessages$RecruitWidgetButtonInfo ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, ttype);
       }
       if (!(this.backgroundColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.backgroundColor);
       }
       if (!(this.buttonTextColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.buttonTextColor);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePlusRecruitMessages$RecruitWidgetButtonInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.buttonTextColor = p0.readString();
                      }
                   }else {
                      this.backgroundColor = p0.readString();
                   }
                }else {
                   i = p0.readInt32();
                   switch (i){
                       case 0:
                       case 2:
                       case 3:
                       case 4:
                       case 5:
                       case 6:
                       case 1:
                         break;
                       default:
                   }
                   this.type = i;
                }
             }else {
                this.buttonUrl = p0.readString();
             }
          }else {
             this.buttonText = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.buttonText).equals(str)) {
          p0.writeString(1, this.buttonText);
       }
       if (!(this.buttonUrl).equals(str)) {
          p0.writeString(2, this.buttonUrl);
       }
       LivePlusRecruitMessages$RecruitWidgetButtonInfo ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(3, ttype);
       }
       if (!(this.backgroundColor).equals(str)) {
          p0.writeString(4, this.backgroundColor);
       }
       if (!(this.buttonTextColor).equals(str)) {
          p0.writeString(5, this.buttonTextColor);
       }
       super.writeTo(p0);
       return;
    }
}
