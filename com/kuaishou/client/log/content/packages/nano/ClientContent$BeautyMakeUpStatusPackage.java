package com.kuaishou.client.log.content.packages.nano.ClientContent$BeautyMakeUpStatusPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BeautyMakeUpSubFeaturesPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class ClientContent$BeautyMakeUpStatusPackage extends MessageNano	// class@00121c
{
    public ClientContent$BeautyMakeUpSubFeaturesPackage[] beautyMakeUpSubFeaturesPackage;
    public String primaryIndex;
    public int primaryType;
    public String primaryTypeNew;
    public static ClientContent$BeautyMakeUpStatusPackage[] _emptyArray;

    public void ClientContent$BeautyMakeUpStatusPackage(){
       super();
       this.clear();
    }
    public static ClientContent$BeautyMakeUpStatusPackage[] emptyArray(){
       if (ClientContent$BeautyMakeUpStatusPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$BeautyMakeUpStatusPackage._emptyArray == null) {
             ClientContent$BeautyMakeUpStatusPackage[] uBeautyMakeU = new ClientContent$BeautyMakeUpStatusPackage[0];
             ClientContent$BeautyMakeUpStatusPackage._emptyArray = uBeautyMakeU;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$BeautyMakeUpStatusPackage._emptyArray;
    }
    public static ClientContent$BeautyMakeUpStatusPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$BeautyMakeUpStatusPackage().mergeFrom(p0);
    }
    public static ClientContent$BeautyMakeUpStatusPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$BeautyMakeUpStatusPackage(), p0);
    }
    public ClientContent$BeautyMakeUpStatusPackage clear(){
       this.primaryType = 0;
       this.beautyMakeUpSubFeaturesPackage = ClientContent$BeautyMakeUpSubFeaturesPackage.emptyArray();
       this.primaryTypeNew = "";
       this.primaryIndex = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$BeautyMakeUpStatusPackage tprimaryType = this.primaryType;
       if (tprimaryType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tprimaryType);
       }
       tprimaryType = this.beautyMakeUpSubFeaturesPackage;
       if (tprimaryType != null && tprimaryType.length > 0) {
          int i1 = 0;
          ClientContent$BeautyMakeUpStatusPackage tbeautyMakeU = this.beautyMakeUpSubFeaturesPackage;
          while (i1 < tbeautyMakeU.length) {
             object oobject = tbeautyMakeU[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       String str = "";
       if (!(this.primaryTypeNew).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.primaryTypeNew);
       }
       if (!(this.primaryIndex).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.primaryIndex);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$BeautyMakeUpStatusPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             int i1 = 18;
             if (i != i1) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.primaryIndex = p0.readString();
                   }
                }else {
                   this.primaryTypeNew = p0.readString();
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                ClientContent$BeautyMakeUpStatusPackage tbeautyMakeU = this.beautyMakeUpSubFeaturesPackage;
                int i2 = (tbeautyMakeU == null)? 0: tbeautyMakeU.length;
                i = i + i2;
                ClientContent$BeautyMakeUpSubFeaturesPackage[] uBeautyMakeU = new ClientContent$BeautyMakeUpSubFeaturesPackage[i];
                if (i2) {
                   System.arraycopy(tbeautyMakeU, 0, uBeautyMakeU, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uBeautyMakeU[i2] = new ClientContent$BeautyMakeUpSubFeaturesPackage();
                   p0.readMessage(uBeautyMakeU[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uBeautyMakeU[i2] = new ClientContent$BeautyMakeUpSubFeaturesPackage();
                p0.readMessage(uBeautyMakeU[i2]);
                this.beautyMakeUpSubFeaturesPackage = uBeautyMakeU;
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
             this.primaryType = i;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$BeautyMakeUpStatusPackage tprimaryType = this.primaryType;
       if (tprimaryType != null) {
          p0.writeInt32(1, tprimaryType);
       }
       tprimaryType = this.beautyMakeUpSubFeaturesPackage;
       if (tprimaryType != null && tprimaryType.length > 0) {
          int i = 0;
          ClientContent$BeautyMakeUpStatusPackage tbeautyMakeU = this.beautyMakeUpSubFeaturesPackage;
          while (i < tbeautyMakeU.length) {
             object oobject = tbeautyMakeU[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       String str = "";
       if (!(this.primaryTypeNew).equals(str)) {
          p0.writeString(3, this.primaryTypeNew);
       }
       if (!(this.primaryIndex).equals(str)) {
          p0.writeString(4, this.primaryIndex);
       }
       super.writeTo(p0);
       return;
    }
}
