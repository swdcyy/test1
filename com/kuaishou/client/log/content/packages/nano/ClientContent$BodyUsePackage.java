package com.kuaishou.client.log.content.packages.nano.ClientContent$BodyUsePackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BodySubFeaturesPackage;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Float;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class ClientContent$BodyUsePackage extends MessageNano	// class@001223
{
    public ClientContent$BodySubFeaturesPackage[] bodySubFeaturesPackage;
    public String item;
    public boolean useQuickBody;
    public float value;
    public static ClientContent$BodyUsePackage[] _emptyArray;

    public void ClientContent$BodyUsePackage(){
       super();
       this.clear();
    }
    public static ClientContent$BodyUsePackage[] emptyArray(){
       if (ClientContent$BodyUsePackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$BodyUsePackage._emptyArray == null) {
             ClientContent$BodyUsePackage[] uBodyUsePack = new ClientContent$BodyUsePackage[0];
             ClientContent$BodyUsePackage._emptyArray = uBodyUsePack;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$BodyUsePackage._emptyArray;
    }
    public static ClientContent$BodyUsePackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$BodyUsePackage().mergeFrom(p0);
    }
    public static ClientContent$BodyUsePackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$BodyUsePackage(), p0);
    }
    public ClientContent$BodyUsePackage clear(){
       this.item = "";
       this.value = 0;
       this.useQuickBody = false;
       this.bodySubFeaturesPackage = ClientContent$BodySubFeaturesPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.item).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.item);
       }
       if (Float.floatToIntBits(this.value) != Float.floatToIntBits(0)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(2, this.value);
       }
       ClientContent$BodyUsePackage tuseQuickBod = this.useQuickBody;
       if (tuseQuickBod != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tuseQuickBod);
       }
       tuseQuickBod = this.bodySubFeaturesPackage;
       if (tuseQuickBod != null && tuseQuickBod.length > 0) {
          int i1 = 0;
          ClientContent$BodyUsePackage tbodySubFeat = this.bodySubFeaturesPackage;
          while (i1 < tbodySubFeat.length) {
             object oobject = tbodySubFeat[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$BodyUsePackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 21) {
                if (i != 24) {
                   int i1 = 34;
                   if (i != i1) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      ClientContent$BodyUsePackage tbodySubFeat = this.bodySubFeaturesPackage;
                      int i2 = (tbodySubFeat == null)? 0: tbodySubFeat.length;
                      i = i + i2;
                      ClientContent$BodySubFeaturesPackage[] uBodySubFeat = new ClientContent$BodySubFeaturesPackage[i];
                      if (i2) {
                         System.arraycopy(tbodySubFeat, 0, uBodySubFeat, 0, i2);
                      }
                      i1 = i - 1;
                      while (i2 < i1) {
                         uBodySubFeat[i2] = new ClientContent$BodySubFeaturesPackage();
                         p0.readMessage(uBodySubFeat[i2]);
                         p0.readTag();
                         i2 = i2 + 1;
                      }
                      uBodySubFeat[i2] = new ClientContent$BodySubFeaturesPackage();
                      p0.readMessage(uBodySubFeat[i2]);
                      this.bodySubFeaturesPackage = uBodySubFeat;
                   }
                }else {
                   this.useQuickBody = p0.readBool();
                }
             }else {
                this.value = p0.readFloat();
             }
          }else {
             this.item = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.item).equals("")) {
          p0.writeString(1, this.item);
       }
       if (Float.floatToIntBits(this.value) != Float.floatToIntBits(0)) {
          p0.writeFloat(2, this.value);
       }
       ClientContent$BodyUsePackage tuseQuickBod = this.useQuickBody;
       if (tuseQuickBod != null) {
          p0.writeBool(3, tuseQuickBod);
       }
       tuseQuickBod = this.bodySubFeaturesPackage;
       if (tuseQuickBod != null && tuseQuickBod.length > 0) {
          int i = 0;
          ClientContent$BodyUsePackage tbodySubFeat = this.bodySubFeaturesPackage;
          while (i < tbodySubFeat.length) {
             object oobject = tbodySubFeat[i];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
