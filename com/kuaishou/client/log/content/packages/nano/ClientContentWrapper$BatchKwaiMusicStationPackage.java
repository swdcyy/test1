package com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$BatchKwaiMusicStationPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$KwaiMusicStationPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientContentWrapper$BatchKwaiMusicStationPackage extends MessageNano	// class@001307
{
    public ClientContentWrapper$KwaiMusicStationPackage[] kwaiMusicStationPackage;
    public static ClientContentWrapper$BatchKwaiMusicStationPackage[] _emptyArray;

    public void ClientContentWrapper$BatchKwaiMusicStationPackage(){
       super();
       this.clear();
    }
    public static ClientContentWrapper$BatchKwaiMusicStationPackage[] emptyArray(){
       if (ClientContentWrapper$BatchKwaiMusicStationPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContentWrapper$BatchKwaiMusicStationPackage._emptyArray == null) {
             ClientContentWrapper$BatchKwaiMusicStationPackage[] uBatchKwaiMu = new ClientContentWrapper$BatchKwaiMusicStationPackage[0];
             ClientContentWrapper$BatchKwaiMusicStationPackage._emptyArray = uBatchKwaiMu;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContentWrapper$BatchKwaiMusicStationPackage._emptyArray;
    }
    public static ClientContentWrapper$BatchKwaiMusicStationPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContentWrapper$BatchKwaiMusicStationPackage().mergeFrom(p0);
    }
    public static ClientContentWrapper$BatchKwaiMusicStationPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContentWrapper$BatchKwaiMusicStationPackage(), p0);
    }
    public ClientContentWrapper$BatchKwaiMusicStationPackage clear(){
       this.kwaiMusicStationPackage = ClientContentWrapper$KwaiMusicStationPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContentWrapper$BatchKwaiMusicStationPackage tkwaiMusicSt = this.kwaiMusicStationPackage;
       if (tkwaiMusicSt != null && tkwaiMusicSt.length > 0) {
          int i1 = 0;
          ClientContentWrapper$BatchKwaiMusicStationPackage tkwaiMusicSt1 = this.kwaiMusicStationPackage;
          while (i1 < tkwaiMusicSt1.length) {
             object oobject = tkwaiMusicSt1[i1];
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
    public ClientContentWrapper$BatchKwaiMusicStationPackage mergeFrom(CodedInputByteBufferNano p0){
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
             ClientContentWrapper$BatchKwaiMusicStationPackage tkwaiMusicSt = this.kwaiMusicStationPackage;
             int i2 = (tkwaiMusicSt == null)? 0: tkwaiMusicSt.length;
             i = i + i2;
             ClientContentWrapper$KwaiMusicStationPackage[] kwaiMusicSta = new ClientContentWrapper$KwaiMusicStationPackage[i];
             if (i2) {
                System.arraycopy(tkwaiMusicSt, 0, kwaiMusicSta, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                kwaiMusicSta[i2] = new ClientContentWrapper$KwaiMusicStationPackage();
                p0.readMessage(kwaiMusicSta[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             kwaiMusicSta[i2] = new ClientContentWrapper$KwaiMusicStationPackage();
             p0.readMessage(kwaiMusicSta[i2]);
             this.kwaiMusicStationPackage = kwaiMusicSta;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContentWrapper$BatchKwaiMusicStationPackage tkwaiMusicSt = this.kwaiMusicStationPackage;
       if (tkwaiMusicSt != null && tkwaiMusicSt.length > 0) {
          int i = 0;
          ClientContentWrapper$BatchKwaiMusicStationPackage tkwaiMusicSt1 = this.kwaiMusicStationPackage;
          while (i < tkwaiMusicSt1.length) {
             object oobject = tkwaiMusicSt1[i];
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
