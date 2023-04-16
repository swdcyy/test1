package com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$BatchImportPartPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ImportPartPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientContentWrapper$BatchImportPartPackage extends MessageNano	// class@001306
{
    public ClientContentWrapper$ImportPartPackage[] importPartPackage;
    public static ClientContentWrapper$BatchImportPartPackage[] _emptyArray;

    public void ClientContentWrapper$BatchImportPartPackage(){
       super();
       this.clear();
    }
    public static ClientContentWrapper$BatchImportPartPackage[] emptyArray(){
       if (ClientContentWrapper$BatchImportPartPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContentWrapper$BatchImportPartPackage._emptyArray == null) {
             ClientContentWrapper$BatchImportPartPackage[] uBatchImport = new ClientContentWrapper$BatchImportPartPackage[0];
             ClientContentWrapper$BatchImportPartPackage._emptyArray = uBatchImport;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContentWrapper$BatchImportPartPackage._emptyArray;
    }
    public static ClientContentWrapper$BatchImportPartPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContentWrapper$BatchImportPartPackage().mergeFrom(p0);
    }
    public static ClientContentWrapper$BatchImportPartPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContentWrapper$BatchImportPartPackage(), p0);
    }
    public ClientContentWrapper$BatchImportPartPackage clear(){
       this.importPartPackage = ClientContentWrapper$ImportPartPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContentWrapper$BatchImportPartPackage timportPartP = this.importPartPackage;
       if (timportPartP != null && timportPartP.length > 0) {
          int i1 = 0;
          ClientContentWrapper$BatchImportPartPackage timportPartP1 = this.importPartPackage;
          while (i1 < timportPartP1.length) {
             object oobject = timportPartP1[i1];
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
    public ClientContentWrapper$BatchImportPartPackage mergeFrom(CodedInputByteBufferNano p0){
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
             ClientContentWrapper$BatchImportPartPackage timportPartP = this.importPartPackage;
             int i2 = (timportPartP == null)? 0: timportPartP.length;
             i = i + i2;
             ClientContentWrapper$ImportPartPackage[] importPartPa = new ClientContentWrapper$ImportPartPackage[i];
             if (i2) {
                System.arraycopy(timportPartP, 0, importPartPa, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                importPartPa[i2] = new ClientContentWrapper$ImportPartPackage();
                p0.readMessage(importPartPa[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             importPartPa[i2] = new ClientContentWrapper$ImportPartPackage();
             p0.readMessage(importPartPa[i2]);
             this.importPartPackage = importPartPa;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContentWrapper$BatchImportPartPackage timportPartP = this.importPartPackage;
       if (timportPartP != null && timportPartP.length > 0) {
          int i = 0;
          ClientContentWrapper$BatchImportPartPackage timportPartP1 = this.importPartPackage;
          while (i < timportPartP1.length) {
             object oobject = timportPartP1[i];
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
