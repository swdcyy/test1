package com.kuaishou.livestream.message.nano.LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$LivePkPanelNoticeTipPlaceHolder;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$LivePkPanelNoticeTipPlaceHolder extends MessageNano	// class@00120a
{
    public String placeHolderKey;
    public String placeHolderText;
    public String placeHolderTextColor;
    public static LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$LivePkPanelNoticeTipPlaceHolder[] _emptyArray;

    public void LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$LivePkPanelNoticeTipPlaceHolder(){
       super();
       this.clear();
    }
    public static LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$LivePkPanelNoticeTipPlaceHolder[] emptyArray(){
       if (LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$LivePkPanelNoticeTipPlaceHolder._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$LivePkPanelNoticeTipPlaceHolder._emptyArray == null) {
             LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$LivePkPanelNoticeTipPlaceHolder[] livePkPanelN = new LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$LivePkPanelNoticeTipPlaceHolder[0];
             LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$LivePkPanelNoticeTipPlaceHolder._emptyArray = livePkPanelN;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$LivePkPanelNoticeTipPlaceHolder._emptyArray;
    }
    public static LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$LivePkPanelNoticeTipPlaceHolder parseFrom(CodedInputByteBufferNano p0){
       return new LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$LivePkPanelNoticeTipPlaceHolder().mergeFrom(p0);
    }
    public static LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$LivePkPanelNoticeTipPlaceHolder parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$LivePkPanelNoticeTipPlaceHolder(), p0);
    }
    public LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$LivePkPanelNoticeTipPlaceHolder clear(){
       this.placeHolderKey = "";
       this.placeHolderText = "";
       this.placeHolderTextColor = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.placeHolderKey).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.placeHolderKey);
       }
       if (!(this.placeHolderText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.placeHolderText);
       }
       if (!(this.placeHolderTextColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.placeHolderTextColor);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$LivePkPanelNoticeTipPlaceHolder mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.placeHolderTextColor = p0.readString();
                }
             }else {
                this.placeHolderText = p0.readString();
             }
          }else {
             this.placeHolderKey = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.placeHolderKey).equals(str)) {
          p0.writeString(1, this.placeHolderKey);
       }
       if (!(this.placeHolderText).equals(str)) {
          p0.writeString(2, this.placeHolderText);
       }
       if (!(this.placeHolderTextColor).equals(str)) {
          p0.writeString(3, this.placeHolderTextColor);
       }
       super.writeTo(p0);
       return;
    }
}
