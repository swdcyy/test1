package com.kuaishou.client.log.content.packages.nano.ClientContent$BatchCommodityDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$CommodityDetailPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientContent$BatchCommodityDetailPackage extends MessageNano	// class@00120b
{
    public ClientContent$CommodityDetailPackage[] commodityDetailPackage;
    public static ClientContent$BatchCommodityDetailPackage[] _emptyArray;

    public void ClientContent$BatchCommodityDetailPackage(){
       super();
       this.clear();
    }
    public static ClientContent$BatchCommodityDetailPackage[] emptyArray(){
       if (ClientContent$BatchCommodityDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$BatchCommodityDetailPackage._emptyArray == null) {
             ClientContent$BatchCommodityDetailPackage[] uBatchCommod = new ClientContent$BatchCommodityDetailPackage[0];
             ClientContent$BatchCommodityDetailPackage._emptyArray = uBatchCommod;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$BatchCommodityDetailPackage._emptyArray;
    }
    public static ClientContent$BatchCommodityDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$BatchCommodityDetailPackage().mergeFrom(p0);
    }
    public static ClientContent$BatchCommodityDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$BatchCommodityDetailPackage(), p0);
    }
    public ClientContent$BatchCommodityDetailPackage clear(){
       this.commodityDetailPackage = ClientContent$CommodityDetailPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$BatchCommodityDetailPackage tcommodityDe = this.commodityDetailPackage;
       if (tcommodityDe != null && tcommodityDe.length > 0) {
          int i1 = 0;
          ClientContent$BatchCommodityDetailPackage tcommodityDe1 = this.commodityDetailPackage;
          while (i1 < tcommodityDe1.length) {
             object oobject = tcommodityDe1[i1];
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
    public ClientContent$BatchCommodityDetailPackage mergeFrom(CodedInputByteBufferNano p0){
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
             ClientContent$BatchCommodityDetailPackage tcommodityDe = this.commodityDetailPackage;
             int i2 = (tcommodityDe == null)? 0: tcommodityDe.length;
             i = i + i2;
             ClientContent$CommodityDetailPackage[] uCommodityDe = new ClientContent$CommodityDetailPackage[i];
             if (i2) {
                System.arraycopy(tcommodityDe, 0, uCommodityDe, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                uCommodityDe[i2] = new ClientContent$CommodityDetailPackage();
                p0.readMessage(uCommodityDe[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             uCommodityDe[i2] = new ClientContent$CommodityDetailPackage();
             p0.readMessage(uCommodityDe[i2]);
             this.commodityDetailPackage = uCommodityDe;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$BatchCommodityDetailPackage tcommodityDe = this.commodityDetailPackage;
       if (tcommodityDe != null && tcommodityDe.length > 0) {
          int i = 0;
          ClientContent$BatchCommodityDetailPackage tcommodityDe1 = this.commodityDetailPackage;
          while (i < tcommodityDe1.length) {
             object oobject = tcommodityDe1[i];
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
