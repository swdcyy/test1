package com.kuaishou.client.log.stat.packages.nano.ClientStat$LocalMusicStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LocalMusicPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientStat$LocalMusicStatEvent extends MessageNano	// class@0007ea
{
    public ClientContent$LocalMusicPackage[] localMusic;
    public static ClientStat$LocalMusicStatEvent[] _emptyArray;

    public void ClientStat$LocalMusicStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$LocalMusicStatEvent[] emptyArray(){
       if (ClientStat$LocalMusicStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$LocalMusicStatEvent._emptyArray == null) {
             ClientStat$LocalMusicStatEvent[] localMusicSt = new ClientStat$LocalMusicStatEvent[0];
             ClientStat$LocalMusicStatEvent._emptyArray = localMusicSt;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$LocalMusicStatEvent._emptyArray;
    }
    public static ClientStat$LocalMusicStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$LocalMusicStatEvent().mergeFrom(p0);
    }
    public static ClientStat$LocalMusicStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$LocalMusicStatEvent(), p0);
    }
    public ClientStat$LocalMusicStatEvent clear(){
       this.localMusic = ClientContent$LocalMusicPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$LocalMusicStatEvent tlocalMusic = this.localMusic;
       if (tlocalMusic != null && tlocalMusic.length > 0) {
          int i1 = 0;
          ClientStat$LocalMusicStatEvent tlocalMusic1 = this.localMusic;
          while (i1 < tlocalMusic1.length) {
             object oobject = tlocalMusic1[i1];
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
    public ClientStat$LocalMusicStatEvent mergeFrom(CodedInputByteBufferNano p0){
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
             ClientStat$LocalMusicStatEvent tlocalMusic = this.localMusic;
             int i2 = (tlocalMusic == null)? 0: tlocalMusic.length;
             i = i + i2;
             ClientContent$LocalMusicPackage[] localMusicPa = new ClientContent$LocalMusicPackage[i];
             if (i2) {
                System.arraycopy(tlocalMusic, 0, localMusicPa, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                localMusicPa[i2] = new ClientContent$LocalMusicPackage();
                p0.readMessage(localMusicPa[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             localMusicPa[i2] = new ClientContent$LocalMusicPackage();
             p0.readMessage(localMusicPa[i2]);
             this.localMusic = localMusicPa;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$LocalMusicStatEvent tlocalMusic = this.localMusic;
       if (tlocalMusic != null && tlocalMusic.length > 0) {
          int i = 0;
          ClientStat$LocalMusicStatEvent tlocalMusic1 = this.localMusic;
          while (i < tlocalMusic1.length) {
             object oobject = tlocalMusic1[i];
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
