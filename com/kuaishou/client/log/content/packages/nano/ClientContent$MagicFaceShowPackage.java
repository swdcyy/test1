package com.kuaishou.client.log.content.packages.nano.ClientContent$MagicFaceShowPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MagicFacePackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientContent$MagicFaceShowPackage extends MessageNano	// class@0012a9
{
    public ClientContent$MagicFacePackage[] magicFacePackage;
    public static ClientContent$MagicFaceShowPackage[] _emptyArray;

    public void ClientContent$MagicFaceShowPackage(){
       super();
       this.clear();
    }
    public static ClientContent$MagicFaceShowPackage[] emptyArray(){
       if (ClientContent$MagicFaceShowPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$MagicFaceShowPackage._emptyArray == null) {
             ClientContent$MagicFaceShowPackage[] magicFaceSho = new ClientContent$MagicFaceShowPackage[0];
             ClientContent$MagicFaceShowPackage._emptyArray = magicFaceSho;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$MagicFaceShowPackage._emptyArray;
    }
    public static ClientContent$MagicFaceShowPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$MagicFaceShowPackage().mergeFrom(p0);
    }
    public static ClientContent$MagicFaceShowPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$MagicFaceShowPackage(), p0);
    }
    public ClientContent$MagicFaceShowPackage clear(){
       this.magicFacePackage = ClientContent$MagicFacePackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$MagicFaceShowPackage tmagicFacePa = this.magicFacePackage;
       if (tmagicFacePa != null && tmagicFacePa.length > 0) {
          int i1 = 0;
          ClientContent$MagicFaceShowPackage tmagicFacePa1 = this.magicFacePackage;
          while (i1 < tmagicFacePa1.length) {
             object oobject = tmagicFacePa1[i1];
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
    public ClientContent$MagicFaceShowPackage mergeFrom(CodedInputByteBufferNano p0){
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
             ClientContent$MagicFaceShowPackage tmagicFacePa = this.magicFacePackage;
             int i2 = (tmagicFacePa == null)? 0: tmagicFacePa.length;
             i = i + i2;
             ClientContent$MagicFacePackage[] magicFacePac = new ClientContent$MagicFacePackage[i];
             if (i2) {
                System.arraycopy(tmagicFacePa, 0, magicFacePac, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                magicFacePac[i2] = new ClientContent$MagicFacePackage();
                p0.readMessage(magicFacePac[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             magicFacePac[i2] = new ClientContent$MagicFacePackage();
             p0.readMessage(magicFacePac[i2]);
             this.magicFacePackage = magicFacePac;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$MagicFaceShowPackage tmagicFacePa = this.magicFacePackage;
       if (tmagicFacePa != null && tmagicFacePa.length > 0) {
          int i = 0;
          ClientContent$MagicFaceShowPackage tmagicFacePa1 = this.magicFacePackage;
          while (i < tmagicFacePa1.length) {
             object oobject = tmagicFacePa1[i];
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
