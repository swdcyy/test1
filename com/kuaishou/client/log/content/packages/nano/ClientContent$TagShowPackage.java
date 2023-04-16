package com.kuaishou.client.log.content.packages.nano.ClientContent$TagShowPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientContent$TagShowPackage extends MessageNano	// class@0012e5
{
    public ClientContent$TagPackage[] tagPackage;
    public static ClientContent$TagShowPackage[] _emptyArray;

    public void ClientContent$TagShowPackage(){
       super();
       this.clear();
    }
    public static ClientContent$TagShowPackage[] emptyArray(){
       if (ClientContent$TagShowPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$TagShowPackage._emptyArray == null) {
             ClientContent$TagShowPackage[] tagShowPacka = new ClientContent$TagShowPackage[0];
             ClientContent$TagShowPackage._emptyArray = tagShowPacka;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$TagShowPackage._emptyArray;
    }
    public static ClientContent$TagShowPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$TagShowPackage().mergeFrom(p0);
    }
    public static ClientContent$TagShowPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$TagShowPackage(), p0);
    }
    public ClientContent$TagShowPackage clear(){
       this.tagPackage = ClientContent$TagPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$TagShowPackage ttagPackage = this.tagPackage;
       if (ttagPackage != null && ttagPackage.length > 0) {
          int i1 = 0;
          ClientContent$TagShowPackage ttagPackage1 = this.tagPackage;
          while (i1 < ttagPackage1.length) {
             object oobject = ttagPackage1[i1];
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
    public ClientContent$TagShowPackage mergeFrom(CodedInputByteBufferNano p0){
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
             ClientContent$TagShowPackage ttagPackage = this.tagPackage;
             int i2 = (ttagPackage == null)? 0: ttagPackage.length;
             i = i + i2;
             ClientContent$TagPackage[] tagPackageAr = new ClientContent$TagPackage[i];
             if (i2) {
                System.arraycopy(ttagPackage, 0, tagPackageAr, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                tagPackageAr[i2] = new ClientContent$TagPackage();
                p0.readMessage(tagPackageAr[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             tagPackageAr[i2] = new ClientContent$TagPackage();
             p0.readMessage(tagPackageAr[i2]);
             this.tagPackage = tagPackageAr;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$TagShowPackage ttagPackage = this.tagPackage;
       if (ttagPackage != null && ttagPackage.length > 0) {
          int i = 0;
          ClientContent$TagShowPackage ttagPackage1 = this.tagPackage;
          while (i < ttagPackage1.length) {
             object oobject = ttagPackage1[i];
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
