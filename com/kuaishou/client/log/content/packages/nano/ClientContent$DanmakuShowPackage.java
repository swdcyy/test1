package com.kuaishou.client.log.content.packages.nano.ClientContent$DanmakuShowPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$DanmakuPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientContent$DanmakuShowPackage extends MessageNano	// class@001234
{
    public ClientContent$DanmakuPackage[] danmakuPackage;
    public static ClientContent$DanmakuShowPackage[] _emptyArray;

    public void ClientContent$DanmakuShowPackage(){
       super();
       this.clear();
    }
    public static ClientContent$DanmakuShowPackage[] emptyArray(){
       if (ClientContent$DanmakuShowPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$DanmakuShowPackage._emptyArray == null) {
             ClientContent$DanmakuShowPackage[] uDanmakuShow = new ClientContent$DanmakuShowPackage[0];
             ClientContent$DanmakuShowPackage._emptyArray = uDanmakuShow;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$DanmakuShowPackage._emptyArray;
    }
    public static ClientContent$DanmakuShowPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$DanmakuShowPackage().mergeFrom(p0);
    }
    public static ClientContent$DanmakuShowPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$DanmakuShowPackage(), p0);
    }
    public ClientContent$DanmakuShowPackage clear(){
       this.danmakuPackage = ClientContent$DanmakuPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$DanmakuShowPackage tdanmakuPack = this.danmakuPackage;
       if (tdanmakuPack != null && tdanmakuPack.length > 0) {
          int i1 = 0;
          ClientContent$DanmakuShowPackage tdanmakuPack1 = this.danmakuPackage;
          while (i1 < tdanmakuPack1.length) {
             object oobject = tdanmakuPack1[i1];
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
    public ClientContent$DanmakuShowPackage mergeFrom(CodedInputByteBufferNano p0){
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
             ClientContent$DanmakuShowPackage tdanmakuPack = this.danmakuPackage;
             int i2 = (tdanmakuPack == null)? 0: tdanmakuPack.length;
             i = i + i2;
             ClientContent$DanmakuPackage[] uDanmakuPack = new ClientContent$DanmakuPackage[i];
             if (i2) {
                System.arraycopy(tdanmakuPack, 0, uDanmakuPack, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                uDanmakuPack[i2] = new ClientContent$DanmakuPackage();
                p0.readMessage(uDanmakuPack[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             uDanmakuPack[i2] = new ClientContent$DanmakuPackage();
             p0.readMessage(uDanmakuPack[i2]);
             this.danmakuPackage = uDanmakuPack;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$DanmakuShowPackage tdanmakuPack = this.danmakuPackage;
       if (tdanmakuPack != null && tdanmakuPack.length > 0) {
          int i = 0;
          ClientContent$DanmakuShowPackage tdanmakuPack1 = this.danmakuPackage;
          while (i < tdanmakuPack1.length) {
             object oobject = tdanmakuPack1[i];
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
