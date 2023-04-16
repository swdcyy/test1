package com.kuaishou.client.log.content.packages.nano.ClientContent$BatchStickerInfoPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$StickerInfoPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientContent$BatchStickerInfoPackage extends MessageNano	// class@001217
{
    public ClientContent$StickerInfoPackage[] batchInfoPackage;
    public static ClientContent$BatchStickerInfoPackage[] _emptyArray;

    public void ClientContent$BatchStickerInfoPackage(){
       super();
       this.clear();
    }
    public static ClientContent$BatchStickerInfoPackage[] emptyArray(){
       if (ClientContent$BatchStickerInfoPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$BatchStickerInfoPackage._emptyArray == null) {
             ClientContent$BatchStickerInfoPackage[] uBatchSticke = new ClientContent$BatchStickerInfoPackage[0];
             ClientContent$BatchStickerInfoPackage._emptyArray = uBatchSticke;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$BatchStickerInfoPackage._emptyArray;
    }
    public static ClientContent$BatchStickerInfoPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$BatchStickerInfoPackage().mergeFrom(p0);
    }
    public static ClientContent$BatchStickerInfoPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$BatchStickerInfoPackage(), p0);
    }
    public ClientContent$BatchStickerInfoPackage clear(){
       this.batchInfoPackage = ClientContent$StickerInfoPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$BatchStickerInfoPackage tbatchInfoPa = this.batchInfoPackage;
       if (tbatchInfoPa != null && tbatchInfoPa.length > 0) {
          int i1 = 0;
          ClientContent$BatchStickerInfoPackage tbatchInfoPa1 = this.batchInfoPackage;
          while (i1 < tbatchInfoPa1.length) {
             object oobject = tbatchInfoPa1[i1];
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
    public ClientContent$BatchStickerInfoPackage mergeFrom(CodedInputByteBufferNano p0){
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
             ClientContent$BatchStickerInfoPackage tbatchInfoPa = this.batchInfoPackage;
             int i2 = (tbatchInfoPa == null)? 0: tbatchInfoPa.length;
             i = i + i2;
             ClientContent$StickerInfoPackage[] stickerInfoP = new ClientContent$StickerInfoPackage[i];
             if (i2) {
                System.arraycopy(tbatchInfoPa, 0, stickerInfoP, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                stickerInfoP[i2] = new ClientContent$StickerInfoPackage();
                p0.readMessage(stickerInfoP[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             stickerInfoP[i2] = new ClientContent$StickerInfoPackage();
             p0.readMessage(stickerInfoP[i2]);
             this.batchInfoPackage = stickerInfoP;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$BatchStickerInfoPackage tbatchInfoPa = this.batchInfoPackage;
       if (tbatchInfoPa != null && tbatchInfoPa.length > 0) {
          int i = 0;
          ClientContent$BatchStickerInfoPackage tbatchInfoPa1 = this.batchInfoPackage;
          while (i < tbatchInfoPa1.length) {
             object oobject = tbatchInfoPa1[i];
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
