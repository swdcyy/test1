package com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoShowPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientContent$PhotoShowPackage extends MessageNano	// class@0012c6
{
    public ClientContent$PhotoPackage[] photoPackage;
    public static ClientContent$PhotoShowPackage[] _emptyArray;

    public void ClientContent$PhotoShowPackage(){
       super();
       this.clear();
    }
    public static ClientContent$PhotoShowPackage[] emptyArray(){
       if (ClientContent$PhotoShowPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$PhotoShowPackage._emptyArray == null) {
             ClientContent$PhotoShowPackage[] photoShowPac = new ClientContent$PhotoShowPackage[0];
             ClientContent$PhotoShowPackage._emptyArray = photoShowPac;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$PhotoShowPackage._emptyArray;
    }
    public static ClientContent$PhotoShowPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$PhotoShowPackage().mergeFrom(p0);
    }
    public static ClientContent$PhotoShowPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$PhotoShowPackage(), p0);
    }
    public ClientContent$PhotoShowPackage clear(){
       this.photoPackage = ClientContent$PhotoPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$PhotoShowPackage tphotoPackag = this.photoPackage;
       if (tphotoPackag != null && tphotoPackag.length > 0) {
          int i1 = 0;
          ClientContent$PhotoShowPackage tphotoPackag1 = this.photoPackage;
          while (i1 < tphotoPackag1.length) {
             object oobject = tphotoPackag1[i1];
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
    public ClientContent$PhotoShowPackage mergeFrom(CodedInputByteBufferNano p0){
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
             ClientContent$PhotoShowPackage tphotoPackag = this.photoPackage;
             int i2 = (tphotoPackag == null)? 0: tphotoPackag.length;
             i = i + i2;
             ClientContent$PhotoPackage[] photoPackage = new ClientContent$PhotoPackage[i];
             if (i2) {
                System.arraycopy(tphotoPackag, 0, photoPackage, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                photoPackage[i2] = new ClientContent$PhotoPackage();
                p0.readMessage(photoPackage[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             photoPackage[i2] = new ClientContent$PhotoPackage();
             p0.readMessage(photoPackage[i2]);
             this.photoPackage = photoPackage;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$PhotoShowPackage tphotoPackag = this.photoPackage;
       if (tphotoPackag != null && tphotoPackag.length > 0) {
          int i = 0;
          ClientContent$PhotoShowPackage tphotoPackag1 = this.photoPackage;
          while (i < tphotoPackag1.length) {
             object oobject = tphotoPackag1[i];
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
