package com.kuaishou.client.log.content.packages.nano.ClientContent$BatchMomentMessagePackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MomentMessagePackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientContent$BatchMomentMessagePackage extends MessageNano	// class@001212
{
    public ClientContent$MomentMessagePackage[] momentMessagePackage;
    public static ClientContent$BatchMomentMessagePackage[] _emptyArray;

    public void ClientContent$BatchMomentMessagePackage(){
       super();
       this.clear();
    }
    public static ClientContent$BatchMomentMessagePackage[] emptyArray(){
       if (ClientContent$BatchMomentMessagePackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$BatchMomentMessagePackage._emptyArray == null) {
             ClientContent$BatchMomentMessagePackage[] uBatchMoment = new ClientContent$BatchMomentMessagePackage[0];
             ClientContent$BatchMomentMessagePackage._emptyArray = uBatchMoment;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$BatchMomentMessagePackage._emptyArray;
    }
    public static ClientContent$BatchMomentMessagePackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$BatchMomentMessagePackage().mergeFrom(p0);
    }
    public static ClientContent$BatchMomentMessagePackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$BatchMomentMessagePackage(), p0);
    }
    public ClientContent$BatchMomentMessagePackage clear(){
       this.momentMessagePackage = ClientContent$MomentMessagePackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$BatchMomentMessagePackage tmomentMessa = this.momentMessagePackage;
       if (tmomentMessa != null && tmomentMessa.length > 0) {
          int i1 = 0;
          ClientContent$BatchMomentMessagePackage tmomentMessa1 = this.momentMessagePackage;
          while (i1 < tmomentMessa1.length) {
             object oobject = tmomentMessa1[i1];
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
    public ClientContent$BatchMomentMessagePackage mergeFrom(CodedInputByteBufferNano p0){
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
             ClientContent$BatchMomentMessagePackage tmomentMessa = this.momentMessagePackage;
             int i2 = (tmomentMessa == null)? 0: tmomentMessa.length;
             i = i + i2;
             ClientContent$MomentMessagePackage[] momentMessag = new ClientContent$MomentMessagePackage[i];
             if (i2) {
                System.arraycopy(tmomentMessa, 0, momentMessag, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                momentMessag[i2] = new ClientContent$MomentMessagePackage();
                p0.readMessage(momentMessag[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             momentMessag[i2] = new ClientContent$MomentMessagePackage();
             p0.readMessage(momentMessag[i2]);
             this.momentMessagePackage = momentMessag;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$BatchMomentMessagePackage tmomentMessa = this.momentMessagePackage;
       if (tmomentMessa != null && tmomentMessa.length > 0) {
          int i = 0;
          ClientContent$BatchMomentMessagePackage tmomentMessa1 = this.momentMessagePackage;
          while (i < tmomentMessa1.length) {
             object oobject = tmomentMessa1[i];
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
