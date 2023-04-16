package com.kuaishou.client.log.content.packages.nano.ClientContent$BatchKuaishanVideoPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KuaishanVideoPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientContent$BatchKuaishanVideoPackage extends MessageNano	// class@001210
{
    public ClientContent$KuaishanVideoPackage[] kuaishanVideoPackage;
    public static ClientContent$BatchKuaishanVideoPackage[] _emptyArray;

    public void ClientContent$BatchKuaishanVideoPackage(){
       super();
       this.clear();
    }
    public static ClientContent$BatchKuaishanVideoPackage[] emptyArray(){
       if (ClientContent$BatchKuaishanVideoPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$BatchKuaishanVideoPackage._emptyArray == null) {
             ClientContent$BatchKuaishanVideoPackage[] uBatchKuaish = new ClientContent$BatchKuaishanVideoPackage[0];
             ClientContent$BatchKuaishanVideoPackage._emptyArray = uBatchKuaish;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$BatchKuaishanVideoPackage._emptyArray;
    }
    public static ClientContent$BatchKuaishanVideoPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$BatchKuaishanVideoPackage().mergeFrom(p0);
    }
    public static ClientContent$BatchKuaishanVideoPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$BatchKuaishanVideoPackage(), p0);
    }
    public ClientContent$BatchKuaishanVideoPackage clear(){
       this.kuaishanVideoPackage = ClientContent$KuaishanVideoPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$BatchKuaishanVideoPackage tkuaishanVid = this.kuaishanVideoPackage;
       if (tkuaishanVid != null && tkuaishanVid.length > 0) {
          int i1 = 0;
          ClientContent$BatchKuaishanVideoPackage tkuaishanVid1 = this.kuaishanVideoPackage;
          while (i1 < tkuaishanVid1.length) {
             object oobject = tkuaishanVid1[i1];
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
    public ClientContent$BatchKuaishanVideoPackage mergeFrom(CodedInputByteBufferNano p0){
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
             ClientContent$BatchKuaishanVideoPackage tkuaishanVid = this.kuaishanVideoPackage;
             int i2 = (tkuaishanVid == null)? 0: tkuaishanVid.length;
             i = i + i2;
             ClientContent$KuaishanVideoPackage[] kuaishanVide = new ClientContent$KuaishanVideoPackage[i];
             if (i2) {
                System.arraycopy(tkuaishanVid, 0, kuaishanVide, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                kuaishanVide[i2] = new ClientContent$KuaishanVideoPackage();
                p0.readMessage(kuaishanVide[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             kuaishanVide[i2] = new ClientContent$KuaishanVideoPackage();
             p0.readMessage(kuaishanVide[i2]);
             this.kuaishanVideoPackage = kuaishanVide;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$BatchKuaishanVideoPackage tkuaishanVid = this.kuaishanVideoPackage;
       if (tkuaishanVid != null && tkuaishanVid.length > 0) {
          int i = 0;
          ClientContent$BatchKuaishanVideoPackage tkuaishanVid1 = this.kuaishanVideoPackage;
          while (i < tkuaishanVid1.length) {
             object oobject = tkuaishanVid1[i];
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
