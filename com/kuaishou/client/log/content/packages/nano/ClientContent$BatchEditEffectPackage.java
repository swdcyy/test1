package com.kuaishou.client.log.content.packages.nano.ClientContent$BatchEditEffectPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$EditEffectPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientContent$BatchEditEffectPackage extends MessageNano	// class@00120c
{
    public ClientContent$EditEffectPackage[] editEffectPackage;
    public static ClientContent$BatchEditEffectPackage[] _emptyArray;

    public void ClientContent$BatchEditEffectPackage(){
       super();
       this.clear();
    }
    public static ClientContent$BatchEditEffectPackage[] emptyArray(){
       if (ClientContent$BatchEditEffectPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$BatchEditEffectPackage._emptyArray == null) {
             ClientContent$BatchEditEffectPackage[] uBatchEditEf = new ClientContent$BatchEditEffectPackage[0];
             ClientContent$BatchEditEffectPackage._emptyArray = uBatchEditEf;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$BatchEditEffectPackage._emptyArray;
    }
    public static ClientContent$BatchEditEffectPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$BatchEditEffectPackage().mergeFrom(p0);
    }
    public static ClientContent$BatchEditEffectPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$BatchEditEffectPackage(), p0);
    }
    public ClientContent$BatchEditEffectPackage clear(){
       this.editEffectPackage = ClientContent$EditEffectPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$BatchEditEffectPackage teditEffectP = this.editEffectPackage;
       if (teditEffectP != null && teditEffectP.length > 0) {
          int i1 = 0;
          ClientContent$BatchEditEffectPackage teditEffectP1 = this.editEffectPackage;
          while (i1 < teditEffectP1.length) {
             object oobject = teditEffectP1[i1];
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
    public ClientContent$BatchEditEffectPackage mergeFrom(CodedInputByteBufferNano p0){
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
             ClientContent$BatchEditEffectPackage teditEffectP = this.editEffectPackage;
             int i2 = (teditEffectP == null)? 0: teditEffectP.length;
             i = i + i2;
             ClientContent$EditEffectPackage[] uEditEffectP = new ClientContent$EditEffectPackage[i];
             if (i2) {
                System.arraycopy(teditEffectP, 0, uEditEffectP, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                uEditEffectP[i2] = new ClientContent$EditEffectPackage();
                p0.readMessage(uEditEffectP[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             uEditEffectP[i2] = new ClientContent$EditEffectPackage();
             p0.readMessage(uEditEffectP[i2]);
             this.editEffectPackage = uEditEffectP;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$BatchEditEffectPackage teditEffectP = this.editEffectPackage;
       if (teditEffectP != null && teditEffectP.length > 0) {
          int i = 0;
          ClientContent$BatchEditEffectPackage teditEffectP1 = this.editEffectPackage;
          while (i < teditEffectP1.length) {
             object oobject = teditEffectP1[i];
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
