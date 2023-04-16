package com.kuaishou.client.log.content.packages.nano.ClientContent$DownloadResourcePackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ResourceProgressPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientContent$DownloadResourcePackage extends MessageNano	// class@001237
{
    public ClientContent$ResourceProgressPackage[] resourceProgressPackage;
    public static ClientContent$DownloadResourcePackage[] _emptyArray;

    public void ClientContent$DownloadResourcePackage(){
       super();
       this.clear();
    }
    public static ClientContent$DownloadResourcePackage[] emptyArray(){
       if (ClientContent$DownloadResourcePackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$DownloadResourcePackage._emptyArray == null) {
             ClientContent$DownloadResourcePackage[] uDownloadRes = new ClientContent$DownloadResourcePackage[0];
             ClientContent$DownloadResourcePackage._emptyArray = uDownloadRes;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$DownloadResourcePackage._emptyArray;
    }
    public static ClientContent$DownloadResourcePackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$DownloadResourcePackage().mergeFrom(p0);
    }
    public static ClientContent$DownloadResourcePackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$DownloadResourcePackage(), p0);
    }
    public ClientContent$DownloadResourcePackage clear(){
       this.resourceProgressPackage = ClientContent$ResourceProgressPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$DownloadResourcePackage tresourcePro = this.resourceProgressPackage;
       if (tresourcePro != null && tresourcePro.length > 0) {
          int i1 = 0;
          ClientContent$DownloadResourcePackage tresourcePro1 = this.resourceProgressPackage;
          while (i1 < tresourcePro1.length) {
             object oobject = tresourcePro1[i1];
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
    public ClientContent$DownloadResourcePackage mergeFrom(CodedInputByteBufferNano p0){
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
             ClientContent$DownloadResourcePackage tresourcePro = this.resourceProgressPackage;
             int i2 = (tresourcePro == null)? 0: tresourcePro.length;
             i = i + i2;
             ClientContent$ResourceProgressPackage[] resourceProg = new ClientContent$ResourceProgressPackage[i];
             if (i2) {
                System.arraycopy(tresourcePro, 0, resourceProg, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                resourceProg[i2] = new ClientContent$ResourceProgressPackage();
                p0.readMessage(resourceProg[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             resourceProg[i2] = new ClientContent$ResourceProgressPackage();
             p0.readMessage(resourceProg[i2]);
             this.resourceProgressPackage = resourceProg;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$DownloadResourcePackage tresourcePro = this.resourceProgressPackage;
       if (tresourcePro != null && tresourcePro.length > 0) {
          int i = 0;
          ClientContent$DownloadResourcePackage tresourcePro1 = this.resourceProgressPackage;
          while (i < tresourcePro1.length) {
             object oobject = tresourcePro1[i];
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
