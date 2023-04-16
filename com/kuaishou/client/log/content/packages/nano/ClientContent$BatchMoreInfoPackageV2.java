package com.kuaishou.client.log.content.packages.nano.ClientContent$BatchMoreInfoPackageV2;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientContent$BatchMoreInfoPackageV2 extends MessageNano	// class@001213
{
    public ClientContent$MoreInfoPackageV2[] moreInfoPackage;
    public static ClientContent$BatchMoreInfoPackageV2[] _emptyArray;

    public void ClientContent$BatchMoreInfoPackageV2(){
       super();
       this.clear();
    }
    public static ClientContent$BatchMoreInfoPackageV2[] emptyArray(){
       if (ClientContent$BatchMoreInfoPackageV2._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$BatchMoreInfoPackageV2._emptyArray == null) {
             ClientContent$BatchMoreInfoPackageV2[] uBatchMoreIn = new ClientContent$BatchMoreInfoPackageV2[0];
             ClientContent$BatchMoreInfoPackageV2._emptyArray = uBatchMoreIn;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$BatchMoreInfoPackageV2._emptyArray;
    }
    public static ClientContent$BatchMoreInfoPackageV2 parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$BatchMoreInfoPackageV2().mergeFrom(p0);
    }
    public static ClientContent$BatchMoreInfoPackageV2 parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$BatchMoreInfoPackageV2(), p0);
    }
    public ClientContent$BatchMoreInfoPackageV2 clear(){
       this.moreInfoPackage = ClientContent$MoreInfoPackageV2.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$BatchMoreInfoPackageV2 tmoreInfoPac = this.moreInfoPackage;
       if (tmoreInfoPac != null && tmoreInfoPac.length > 0) {
          int i1 = 0;
          ClientContent$BatchMoreInfoPackageV2 tmoreInfoPac1 = this.moreInfoPackage;
          while (i1 < tmoreInfoPac1.length) {
             object oobject = tmoreInfoPac1[i1];
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
    public ClientContent$BatchMoreInfoPackageV2 mergeFrom(CodedInputByteBufferNano p0){
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
             ClientContent$BatchMoreInfoPackageV2 tmoreInfoPac = this.moreInfoPackage;
             int i2 = (tmoreInfoPac == null)? 0: tmoreInfoPac.length;
             i = i + i2;
             ClientContent$MoreInfoPackageV2[] moreInfoPack = new ClientContent$MoreInfoPackageV2[i];
             if (i2) {
                System.arraycopy(tmoreInfoPac, 0, moreInfoPack, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                moreInfoPack[i2] = new ClientContent$MoreInfoPackageV2();
                p0.readMessage(moreInfoPack[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             moreInfoPack[i2] = new ClientContent$MoreInfoPackageV2();
             p0.readMessage(moreInfoPack[i2]);
             this.moreInfoPackage = moreInfoPack;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$BatchMoreInfoPackageV2 tmoreInfoPac = this.moreInfoPackage;
       if (tmoreInfoPac != null && tmoreInfoPac.length > 0) {
          int i = 0;
          ClientContent$BatchMoreInfoPackageV2 tmoreInfoPac1 = this.moreInfoPackage;
          while (i < tmoreInfoPac1.length) {
             object oobject = tmoreInfoPac1[i];
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
