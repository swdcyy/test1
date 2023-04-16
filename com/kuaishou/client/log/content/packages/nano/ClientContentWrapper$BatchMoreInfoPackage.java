package com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$BatchMoreInfoPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$MoreInfoPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientContentWrapper$BatchMoreInfoPackage extends MessageNano	// class@001308
{
    public ClientContentWrapper$MoreInfoPackage[] moreInfoPackage;
    public static ClientContentWrapper$BatchMoreInfoPackage[] _emptyArray;

    public void ClientContentWrapper$BatchMoreInfoPackage(){
       super();
       this.clear();
    }
    public static ClientContentWrapper$BatchMoreInfoPackage[] emptyArray(){
       if (ClientContentWrapper$BatchMoreInfoPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContentWrapper$BatchMoreInfoPackage._emptyArray == null) {
             ClientContentWrapper$BatchMoreInfoPackage[] uBatchMoreIn = new ClientContentWrapper$BatchMoreInfoPackage[0];
             ClientContentWrapper$BatchMoreInfoPackage._emptyArray = uBatchMoreIn;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContentWrapper$BatchMoreInfoPackage._emptyArray;
    }
    public static ClientContentWrapper$BatchMoreInfoPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContentWrapper$BatchMoreInfoPackage().mergeFrom(p0);
    }
    public static ClientContentWrapper$BatchMoreInfoPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContentWrapper$BatchMoreInfoPackage(), p0);
    }
    public ClientContentWrapper$BatchMoreInfoPackage clear(){
       this.moreInfoPackage = ClientContentWrapper$MoreInfoPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContentWrapper$BatchMoreInfoPackage tmoreInfoPac = this.moreInfoPackage;
       if (tmoreInfoPac != null && tmoreInfoPac.length > 0) {
          int i1 = 0;
          ClientContentWrapper$BatchMoreInfoPackage tmoreInfoPac1 = this.moreInfoPackage;
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
    public ClientContentWrapper$BatchMoreInfoPackage mergeFrom(CodedInputByteBufferNano p0){
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
             ClientContentWrapper$BatchMoreInfoPackage tmoreInfoPac = this.moreInfoPackage;
             int i2 = (tmoreInfoPac == null)? 0: tmoreInfoPac.length;
             i = i + i2;
             ClientContentWrapper$MoreInfoPackage[] moreInfoPack = new ClientContentWrapper$MoreInfoPackage[i];
             if (i2) {
                System.arraycopy(tmoreInfoPac, 0, moreInfoPack, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                moreInfoPack[i2] = new ClientContentWrapper$MoreInfoPackage();
                p0.readMessage(moreInfoPack[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             moreInfoPack[i2] = new ClientContentWrapper$MoreInfoPackage();
             p0.readMessage(moreInfoPack[i2]);
             this.moreInfoPackage = moreInfoPack;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContentWrapper$BatchMoreInfoPackage tmoreInfoPac = this.moreInfoPackage;
       if (tmoreInfoPac != null && tmoreInfoPac.length > 0) {
          int i = 0;
          ClientContentWrapper$BatchMoreInfoPackage tmoreInfoPac1 = this.moreInfoPackage;
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
