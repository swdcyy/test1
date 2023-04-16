package com.kuaishou.livestream.message.nano.ImpetusPendantUnfoldMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.ImpetusPendantContentWithStyle;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ImpetusPendantUnfoldMessage extends MessageNano	// class@0010b9
{
    public ImpetusPendantContentWithStyle[] countDownText;
    public static ImpetusPendantUnfoldMessage[] _emptyArray;

    public void ImpetusPendantUnfoldMessage(){
       super();
       this.clear();
    }
    public static ImpetusPendantUnfoldMessage[] emptyArray(){
       if (ImpetusPendantUnfoldMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ImpetusPendantUnfoldMessage._emptyArray == null) {
             ImpetusPendantUnfoldMessage[] impetusPenda = new ImpetusPendantUnfoldMessage[0];
             ImpetusPendantUnfoldMessage._emptyArray = impetusPenda;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ImpetusPendantUnfoldMessage._emptyArray;
    }
    public static ImpetusPendantUnfoldMessage parseFrom(CodedInputByteBufferNano p0){
       return new ImpetusPendantUnfoldMessage().mergeFrom(p0);
    }
    public static ImpetusPendantUnfoldMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ImpetusPendantUnfoldMessage(), p0);
    }
    public ImpetusPendantUnfoldMessage clear(){
       this.countDownText = ImpetusPendantContentWithStyle.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ImpetusPendantUnfoldMessage tcountDownTe = this.countDownText;
       if (tcountDownTe != null && tcountDownTe.length > 0) {
          int i1 = 0;
          ImpetusPendantUnfoldMessage tcountDownTe1 = this.countDownText;
          while (i1 < tcountDownTe1.length) {
             object oobject = tcountDownTe1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ImpetusPendantUnfoldMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             ImpetusPendantUnfoldMessage tcountDownTe = this.countDownText;
             int i2 = (tcountDownTe == null)? 0: tcountDownTe.length;
             i = i + i2;
             ImpetusPendantContentWithStyle[] impetusPenda = new ImpetusPendantContentWithStyle[i];
             if (i2) {
                System.arraycopy(tcountDownTe, 0, impetusPenda, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                impetusPenda[i2] = new ImpetusPendantContentWithStyle();
                p0.readMessage(impetusPenda[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             impetusPenda[i2] = new ImpetusPendantContentWithStyle();
             p0.readMessage(impetusPenda[i2]);
             this.countDownText = impetusPenda;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ImpetusPendantUnfoldMessage tcountDownTe = this.countDownText;
       if (tcountDownTe != null && tcountDownTe.length > 0) {
          int i = 0;
          ImpetusPendantUnfoldMessage tcountDownTe1 = this.countDownText;
          while (i < tcountDownTe1.length) {
             object oobject = tcountDownTe1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
