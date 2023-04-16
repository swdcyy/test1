package com.kuaishou.client.log.content.packages.nano.ClientContent$StyleStatusPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$AdjustSilderItemPackage;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class ClientContent$StyleStatusPackage extends MessageNano	// class@0012e2
{
    public ClientContent$AdjustSilderItemPackage[] adjustSliderItemPackage;
    public String name;
    public String styleId;
    public static ClientContent$StyleStatusPackage[] _emptyArray;

    public void ClientContent$StyleStatusPackage(){
       super();
       this.clear();
    }
    public static ClientContent$StyleStatusPackage[] emptyArray(){
       if (ClientContent$StyleStatusPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$StyleStatusPackage._emptyArray == null) {
             ClientContent$StyleStatusPackage[] styleStatusP = new ClientContent$StyleStatusPackage[0];
             ClientContent$StyleStatusPackage._emptyArray = styleStatusP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$StyleStatusPackage._emptyArray;
    }
    public static ClientContent$StyleStatusPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$StyleStatusPackage().mergeFrom(p0);
    }
    public static ClientContent$StyleStatusPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$StyleStatusPackage(), p0);
    }
    public ClientContent$StyleStatusPackage clear(){
       this.styleId = "";
       this.name = "";
       this.adjustSliderItemPackage = ClientContent$AdjustSilderItemPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.styleId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.styleId);
       }
       if (!(this.name).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.name);
       }
       ClientContent$StyleStatusPackage tadjustSlide = this.adjustSliderItemPackage;
       if (tadjustSlide != null && tadjustSlide.length > 0) {
          int i1 = 0;
          ClientContent$StyleStatusPackage tadjustSlide1 = this.adjustSliderItemPackage;
          while (i1 < tadjustSlide1.length) {
             object oobject = tadjustSlide1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$StyleStatusPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                int i1 = 26;
                if (i != i1) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   ClientContent$StyleStatusPackage tadjustSlide = this.adjustSliderItemPackage;
                   int i2 = (tadjustSlide == null)? 0: tadjustSlide.length;
                   i = i + i2;
                   ClientContent$AdjustSilderItemPackage[] uAdjustSilde = new ClientContent$AdjustSilderItemPackage[i];
                   if (i2) {
                      System.arraycopy(tadjustSlide, 0, uAdjustSilde, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      uAdjustSilde[i2] = new ClientContent$AdjustSilderItemPackage();
                      p0.readMessage(uAdjustSilde[i2]);
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   uAdjustSilde[i2] = new ClientContent$AdjustSilderItemPackage();
                   p0.readMessage(uAdjustSilde[i2]);
                   this.adjustSliderItemPackage = uAdjustSilde;
                }
             }else {
                this.name = p0.readString();
             }
          }else {
             this.styleId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.styleId).equals(str)) {
          p0.writeString(1, this.styleId);
       }
       if (!(this.name).equals(str)) {
          p0.writeString(2, this.name);
       }
       ClientContent$StyleStatusPackage tadjustSlide = this.adjustSliderItemPackage;
       if (tadjustSlide != null && tadjustSlide.length > 0) {
          int i = 0;
          ClientContent$StyleStatusPackage tadjustSlide1 = this.adjustSliderItemPackage;
          while (i < tadjustSlide1.length) {
             object oobject = tadjustSlide1[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
