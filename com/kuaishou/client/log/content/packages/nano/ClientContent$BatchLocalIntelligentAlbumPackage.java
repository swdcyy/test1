package com.kuaishou.client.log.content.packages.nano.ClientContent$BatchLocalIntelligentAlbumPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LocalIntelligentAlbumPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientContent$BatchLocalIntelligentAlbumPackage extends MessageNano	// class@001211
{
    public ClientContent$LocalIntelligentAlbumPackage[] localIntelligentAlbumPackage;
    public static ClientContent$BatchLocalIntelligentAlbumPackage[] _emptyArray;

    public void ClientContent$BatchLocalIntelligentAlbumPackage(){
       super();
       this.clear();
    }
    public static ClientContent$BatchLocalIntelligentAlbumPackage[] emptyArray(){
       if (ClientContent$BatchLocalIntelligentAlbumPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$BatchLocalIntelligentAlbumPackage._emptyArray == null) {
             ClientContent$BatchLocalIntelligentAlbumPackage[] uBatchLocalI = new ClientContent$BatchLocalIntelligentAlbumPackage[0];
             ClientContent$BatchLocalIntelligentAlbumPackage._emptyArray = uBatchLocalI;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$BatchLocalIntelligentAlbumPackage._emptyArray;
    }
    public static ClientContent$BatchLocalIntelligentAlbumPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$BatchLocalIntelligentAlbumPackage().mergeFrom(p0);
    }
    public static ClientContent$BatchLocalIntelligentAlbumPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$BatchLocalIntelligentAlbumPackage(), p0);
    }
    public ClientContent$BatchLocalIntelligentAlbumPackage clear(){
       this.localIntelligentAlbumPackage = ClientContent$LocalIntelligentAlbumPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$BatchLocalIntelligentAlbumPackage tlocalIntell = this.localIntelligentAlbumPackage;
       if (tlocalIntell != null && tlocalIntell.length > 0) {
          int i1 = 0;
          ClientContent$BatchLocalIntelligentAlbumPackage tlocalIntell1 = this.localIntelligentAlbumPackage;
          while (i1 < tlocalIntell1.length) {
             object oobject = tlocalIntell1[i1];
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
    public ClientContent$BatchLocalIntelligentAlbumPackage mergeFrom(CodedInputByteBufferNano p0){
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
             ClientContent$BatchLocalIntelligentAlbumPackage tlocalIntell = this.localIntelligentAlbumPackage;
             int i2 = (tlocalIntell == null)? 0: tlocalIntell.length;
             i = i + i2;
             ClientContent$LocalIntelligentAlbumPackage[] localIntelli = new ClientContent$LocalIntelligentAlbumPackage[i];
             if (i2) {
                System.arraycopy(tlocalIntell, 0, localIntelli, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                localIntelli[i2] = new ClientContent$LocalIntelligentAlbumPackage();
                p0.readMessage(localIntelli[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             localIntelli[i2] = new ClientContent$LocalIntelligentAlbumPackage();
             p0.readMessage(localIntelli[i2]);
             this.localIntelligentAlbumPackage = localIntelli;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$BatchLocalIntelligentAlbumPackage tlocalIntell = this.localIntelligentAlbumPackage;
       if (tlocalIntell != null && tlocalIntell.length > 0) {
          int i = 0;
          ClientContent$BatchLocalIntelligentAlbumPackage tlocalIntell1 = this.localIntelligentAlbumPackage;
          while (i < tlocalIntell1.length) {
             object oobject = tlocalIntell1[i];
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
