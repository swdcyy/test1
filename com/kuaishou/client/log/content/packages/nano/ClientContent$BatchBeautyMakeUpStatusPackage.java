package com.kuaishou.client.log.content.packages.nano.ClientContent$BatchBeautyMakeUpStatusPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BeautyMakeUpStatusPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientContent$BatchBeautyMakeUpStatusPackage extends MessageNano	// class@001209
{
    public ClientContent$BeautyMakeUpStatusPackage[] beautyMakeUpStatusUsePackage;
    public static ClientContent$BatchBeautyMakeUpStatusPackage[] _emptyArray;

    public void ClientContent$BatchBeautyMakeUpStatusPackage(){
       super();
       this.clear();
    }
    public static ClientContent$BatchBeautyMakeUpStatusPackage[] emptyArray(){
       if (ClientContent$BatchBeautyMakeUpStatusPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$BatchBeautyMakeUpStatusPackage._emptyArray == null) {
             ClientContent$BatchBeautyMakeUpStatusPackage[] uBatchBeauty = new ClientContent$BatchBeautyMakeUpStatusPackage[0];
             ClientContent$BatchBeautyMakeUpStatusPackage._emptyArray = uBatchBeauty;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$BatchBeautyMakeUpStatusPackage._emptyArray;
    }
    public static ClientContent$BatchBeautyMakeUpStatusPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$BatchBeautyMakeUpStatusPackage().mergeFrom(p0);
    }
    public static ClientContent$BatchBeautyMakeUpStatusPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$BatchBeautyMakeUpStatusPackage(), p0);
    }
    public ClientContent$BatchBeautyMakeUpStatusPackage clear(){
       this.beautyMakeUpStatusUsePackage = ClientContent$BeautyMakeUpStatusPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$BatchBeautyMakeUpStatusPackage tbeautyMakeU = this.beautyMakeUpStatusUsePackage;
       if (tbeautyMakeU != null && tbeautyMakeU.length > 0) {
          int i1 = 0;
          ClientContent$BatchBeautyMakeUpStatusPackage tbeautyMakeU1 = this.beautyMakeUpStatusUsePackage;
          while (i1 < tbeautyMakeU1.length) {
             object oobject = tbeautyMakeU1[i1];
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
    public ClientContent$BatchBeautyMakeUpStatusPackage mergeFrom(CodedInputByteBufferNano p0){
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
             ClientContent$BatchBeautyMakeUpStatusPackage tbeautyMakeU = this.beautyMakeUpStatusUsePackage;
             int i2 = (tbeautyMakeU == null)? 0: tbeautyMakeU.length;
             i = i + i2;
             ClientContent$BeautyMakeUpStatusPackage[] uBeautyMakeU = new ClientContent$BeautyMakeUpStatusPackage[i];
             if (i2) {
                System.arraycopy(tbeautyMakeU, 0, uBeautyMakeU, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                uBeautyMakeU[i2] = new ClientContent$BeautyMakeUpStatusPackage();
                p0.readMessage(uBeautyMakeU[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             uBeautyMakeU[i2] = new ClientContent$BeautyMakeUpStatusPackage();
             p0.readMessage(uBeautyMakeU[i2]);
             this.beautyMakeUpStatusUsePackage = uBeautyMakeU;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$BatchBeautyMakeUpStatusPackage tbeautyMakeU = this.beautyMakeUpStatusUsePackage;
       if (tbeautyMakeU != null && tbeautyMakeU.length > 0) {
          int i = 0;
          ClientContent$BatchBeautyMakeUpStatusPackage tbeautyMakeU1 = this.beautyMakeUpStatusUsePackage;
          while (i < tbeautyMakeU1.length) {
             object oobject = tbeautyMakeU1[i];
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
