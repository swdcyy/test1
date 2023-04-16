package com.kuaishou.client.log.content.packages.nano.ClientContent$BatchCollectionPackageV2;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$CollectionPackageV2;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientContent$BatchCollectionPackageV2 extends MessageNano	// class@00120a
{
    public ClientContent$CollectionPackageV2[] collectionPackage;
    public static ClientContent$BatchCollectionPackageV2[] _emptyArray;

    public void ClientContent$BatchCollectionPackageV2(){
       super();
       this.clear();
    }
    public static ClientContent$BatchCollectionPackageV2[] emptyArray(){
       if (ClientContent$BatchCollectionPackageV2._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$BatchCollectionPackageV2._emptyArray == null) {
             ClientContent$BatchCollectionPackageV2[] uBatchCollec = new ClientContent$BatchCollectionPackageV2[0];
             ClientContent$BatchCollectionPackageV2._emptyArray = uBatchCollec;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$BatchCollectionPackageV2._emptyArray;
    }
    public static ClientContent$BatchCollectionPackageV2 parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$BatchCollectionPackageV2().mergeFrom(p0);
    }
    public static ClientContent$BatchCollectionPackageV2 parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$BatchCollectionPackageV2(), p0);
    }
    public ClientContent$BatchCollectionPackageV2 clear(){
       this.collectionPackage = ClientContent$CollectionPackageV2.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$BatchCollectionPackageV2 tcollectionP = this.collectionPackage;
       if (tcollectionP != null && tcollectionP.length > 0) {
          int i1 = 0;
          ClientContent$BatchCollectionPackageV2 tcollectionP1 = this.collectionPackage;
          while (i1 < tcollectionP1.length) {
             object oobject = tcollectionP1[i1];
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
    public ClientContent$BatchCollectionPackageV2 mergeFrom(CodedInputByteBufferNano p0){
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
             ClientContent$BatchCollectionPackageV2 tcollectionP = this.collectionPackage;
             int i2 = (tcollectionP == null)? 0: tcollectionP.length;
             i = i + i2;
             ClientContent$CollectionPackageV2[] uCollectionP = new ClientContent$CollectionPackageV2[i];
             if (i2) {
                System.arraycopy(tcollectionP, 0, uCollectionP, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                uCollectionP[i2] = new ClientContent$CollectionPackageV2();
                p0.readMessage(uCollectionP[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             uCollectionP[i2] = new ClientContent$CollectionPackageV2();
             p0.readMessage(uCollectionP[i2]);
             this.collectionPackage = uCollectionP;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$BatchCollectionPackageV2 tcollectionP = this.collectionPackage;
       if (tcollectionP != null && tcollectionP.length > 0) {
          int i = 0;
          ClientContent$BatchCollectionPackageV2 tcollectionP1 = this.collectionPackage;
          while (i < tcollectionP1.length) {
             object oobject = tcollectionP1[i];
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
