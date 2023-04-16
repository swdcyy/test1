package com.kuaishou.client.log.content.packages.nano.ClientContent$BatchMusicDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MusicDetailPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientContent$BatchMusicDetailPackage extends MessageNano	// class@001214
{
    public ClientContent$MusicDetailPackage[] musicDetailPackage;
    public static ClientContent$BatchMusicDetailPackage[] _emptyArray;

    public void ClientContent$BatchMusicDetailPackage(){
       super();
       this.clear();
    }
    public static ClientContent$BatchMusicDetailPackage[] emptyArray(){
       if (ClientContent$BatchMusicDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$BatchMusicDetailPackage._emptyArray == null) {
             ClientContent$BatchMusicDetailPackage[] uBatchMusicD = new ClientContent$BatchMusicDetailPackage[0];
             ClientContent$BatchMusicDetailPackage._emptyArray = uBatchMusicD;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$BatchMusicDetailPackage._emptyArray;
    }
    public static ClientContent$BatchMusicDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$BatchMusicDetailPackage().mergeFrom(p0);
    }
    public static ClientContent$BatchMusicDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$BatchMusicDetailPackage(), p0);
    }
    public ClientContent$BatchMusicDetailPackage clear(){
       this.musicDetailPackage = ClientContent$MusicDetailPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$BatchMusicDetailPackage tmusicDetail = this.musicDetailPackage;
       if (tmusicDetail != null && tmusicDetail.length > 0) {
          int i1 = 0;
          ClientContent$BatchMusicDetailPackage tmusicDetail1 = this.musicDetailPackage;
          while (i1 < tmusicDetail1.length) {
             object oobject = tmusicDetail1[i1];
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
    public ClientContent$BatchMusicDetailPackage mergeFrom(CodedInputByteBufferNano p0){
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
             ClientContent$BatchMusicDetailPackage tmusicDetail = this.musicDetailPackage;
             int i2 = (tmusicDetail == null)? 0: tmusicDetail.length;
             i = i + i2;
             ClientContent$MusicDetailPackage[] musicDetailP = new ClientContent$MusicDetailPackage[i];
             if (i2) {
                System.arraycopy(tmusicDetail, 0, musicDetailP, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                musicDetailP[i2] = new ClientContent$MusicDetailPackage();
                p0.readMessage(musicDetailP[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             musicDetailP[i2] = new ClientContent$MusicDetailPackage();
             p0.readMessage(musicDetailP[i2]);
             this.musicDetailPackage = musicDetailP;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$BatchMusicDetailPackage tmusicDetail = this.musicDetailPackage;
       if (tmusicDetail != null && tmusicDetail.length > 0) {
          int i = 0;
          ClientContent$BatchMusicDetailPackage tmusicDetail1 = this.musicDetailPackage;
          while (i < tmusicDetail1.length) {
             object oobject = tmusicDetail1[i];
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
