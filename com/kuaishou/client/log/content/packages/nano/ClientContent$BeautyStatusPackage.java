package com.kuaishou.client.log.content.packages.nano.ClientContent$BeautyStatusPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BeautySubFeaturesPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class ClientContent$BeautyStatusPackage extends MessageNano	// class@00121f
{
    public ClientContent$BeautySubFeaturesPackage[] beautySubFeaturesPackage;
    public String segmentIndex;
    public int type;
    public boolean useQuickBeauty;
    public static ClientContent$BeautyStatusPackage[] _emptyArray;

    public void ClientContent$BeautyStatusPackage(){
       super();
       this.clear();
    }
    public static ClientContent$BeautyStatusPackage[] emptyArray(){
       if (ClientContent$BeautyStatusPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$BeautyStatusPackage._emptyArray == null) {
             ClientContent$BeautyStatusPackage[] uBeautyStatu = new ClientContent$BeautyStatusPackage[0];
             ClientContent$BeautyStatusPackage._emptyArray = uBeautyStatu;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$BeautyStatusPackage._emptyArray;
    }
    public static ClientContent$BeautyStatusPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$BeautyStatusPackage().mergeFrom(p0);
    }
    public static ClientContent$BeautyStatusPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$BeautyStatusPackage(), p0);
    }
    public ClientContent$BeautyStatusPackage clear(){
       this.type = 0;
       this.beautySubFeaturesPackage = ClientContent$BeautySubFeaturesPackage.emptyArray();
       this.segmentIndex = "";
       this.useQuickBeauty = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$BeautyStatusPackage ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, ttype);
       }
       ttype = this.beautySubFeaturesPackage;
       if (ttype != null && ttype.length > 0) {
          int i1 = 0;
          ClientContent$BeautyStatusPackage tbeautySubFe = this.beautySubFeaturesPackage;
          while (i1 < tbeautySubFe.length) {
             object oobject = tbeautySubFe[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.segmentIndex).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.segmentIndex);
       }
       ttype = this.useQuickBeauty;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, ttype);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$BeautyStatusPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             int i1 = 18;
             if (i != i1) {
                if (i != 26) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.useQuickBeauty = p0.readBool();
                   }
                }else {
                   this.segmentIndex = p0.readString();
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                ClientContent$BeautyStatusPackage tbeautySubFe = this.beautySubFeaturesPackage;
                int i2 = (tbeautySubFe == null)? 0: tbeautySubFe.length;
                i = i + i2;
                ClientContent$BeautySubFeaturesPackage[] uBeautySubFe = new ClientContent$BeautySubFeaturesPackage[i];
                if (i2) {
                   System.arraycopy(tbeautySubFe, 0, uBeautySubFe, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uBeautySubFe[i2] = new ClientContent$BeautySubFeaturesPackage();
                   p0.readMessage(uBeautySubFe[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uBeautySubFe[i2] = new ClientContent$BeautySubFeaturesPackage();
                p0.readMessage(uBeautySubFe[i2]);
                this.beautySubFeaturesPackage = uBeautySubFe;
             }
          }else {
             this.type = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$BeautyStatusPackage ttype = this.type;
       if (ttype != null) {
          p0.writeUInt32(1, ttype);
       }
       ttype = this.beautySubFeaturesPackage;
       if (ttype != null && ttype.length > 0) {
          int i = 0;
          ClientContent$BeautyStatusPackage tbeautySubFe = this.beautySubFeaturesPackage;
          while (i < tbeautySubFe.length) {
             object oobject = tbeautySubFe[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.segmentIndex).equals("")) {
          p0.writeString(3, this.segmentIndex);
       }
       ttype = this.useQuickBeauty;
       if (ttype != null) {
          p0.writeBool(4, ttype);
       }
       super.writeTo(p0);
       return;
    }
}
