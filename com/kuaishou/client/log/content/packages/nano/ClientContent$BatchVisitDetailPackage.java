package com.kuaishou.client.log.content.packages.nano.ClientContent$BatchVisitDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$VisitDetailPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientContent$BatchVisitDetailPackage extends MessageNano	// class@00121a
{
    public ClientContent$VisitDetailPackage[] visitDetailPackage;
    public static ClientContent$BatchVisitDetailPackage[] _emptyArray;

    public void ClientContent$BatchVisitDetailPackage(){
       super();
       this.clear();
    }
    public static ClientContent$BatchVisitDetailPackage[] emptyArray(){
       if (ClientContent$BatchVisitDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$BatchVisitDetailPackage._emptyArray == null) {
             ClientContent$BatchVisitDetailPackage[] uBatchVisitD = new ClientContent$BatchVisitDetailPackage[0];
             ClientContent$BatchVisitDetailPackage._emptyArray = uBatchVisitD;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$BatchVisitDetailPackage._emptyArray;
    }
    public static ClientContent$BatchVisitDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$BatchVisitDetailPackage().mergeFrom(p0);
    }
    public static ClientContent$BatchVisitDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$BatchVisitDetailPackage(), p0);
    }
    public ClientContent$BatchVisitDetailPackage clear(){
       this.visitDetailPackage = ClientContent$VisitDetailPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$BatchVisitDetailPackage tvisitDetail = this.visitDetailPackage;
       if (tvisitDetail != null && tvisitDetail.length > 0) {
          int i1 = 0;
          ClientContent$BatchVisitDetailPackage tvisitDetail1 = this.visitDetailPackage;
          while (i1 < tvisitDetail1.length) {
             object oobject = tvisitDetail1[i1];
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
    public ClientContent$BatchVisitDetailPackage mergeFrom(CodedInputByteBufferNano p0){
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
             ClientContent$BatchVisitDetailPackage tvisitDetail = this.visitDetailPackage;
             int i2 = (tvisitDetail == null)? 0: tvisitDetail.length;
             i = i + i2;
             ClientContent$VisitDetailPackage[] visitDetailP = new ClientContent$VisitDetailPackage[i];
             if (i2) {
                System.arraycopy(tvisitDetail, 0, visitDetailP, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                visitDetailP[i2] = new ClientContent$VisitDetailPackage();
                p0.readMessage(visitDetailP[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             visitDetailP[i2] = new ClientContent$VisitDetailPackage();
             p0.readMessage(visitDetailP[i2]);
             this.visitDetailPackage = visitDetailP;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$BatchVisitDetailPackage tvisitDetail = this.visitDetailPackage;
       if (tvisitDetail != null && tvisitDetail.length > 0) {
          int i = 0;
          ClientContent$BatchVisitDetailPackage tvisitDetail1 = this.visitDetailPackage;
          while (i < tvisitDetail1.length) {
             object oobject = tvisitDetail1[i];
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
