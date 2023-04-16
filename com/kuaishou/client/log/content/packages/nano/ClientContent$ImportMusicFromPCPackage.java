package com.kuaishou.client.log.content.packages.nano.ClientContent$ImportMusicFromPCPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$ImportMusicFromPCPackage extends MessageNano	// class@001258
{
    public int networkStatus;
    public int uploadStatus;
    public static ClientContent$ImportMusicFromPCPackage[] _emptyArray;

    public void ClientContent$ImportMusicFromPCPackage(){
       super();
       this.clear();
    }
    public static ClientContent$ImportMusicFromPCPackage[] emptyArray(){
       if (ClientContent$ImportMusicFromPCPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$ImportMusicFromPCPackage._emptyArray == null) {
             ClientContent$ImportMusicFromPCPackage[] importMusicF = new ClientContent$ImportMusicFromPCPackage[0];
             ClientContent$ImportMusicFromPCPackage._emptyArray = importMusicF;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$ImportMusicFromPCPackage._emptyArray;
    }
    public static ClientContent$ImportMusicFromPCPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$ImportMusicFromPCPackage().mergeFrom(p0);
    }
    public static ClientContent$ImportMusicFromPCPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$ImportMusicFromPCPackage(), p0);
    }
    public ClientContent$ImportMusicFromPCPackage clear(){
       this.networkStatus = 0;
       this.uploadStatus = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$ImportMusicFromPCPackage tnetworkStat = this.networkStatus;
       if (tnetworkStat != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tnetworkStat);
       }
       tnetworkStat = this.uploadStatus;
       if (tnetworkStat != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tnetworkStat);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$ImportMusicFromPCPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.uploadStatus = i;
                }
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.networkStatus = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$ImportMusicFromPCPackage tnetworkStat = this.networkStatus;
       if (tnetworkStat != null) {
          p0.writeInt32(1, tnetworkStat);
       }
       tnetworkStat = this.uploadStatus;
       if (tnetworkStat != null) {
          p0.writeInt32(2, tnetworkStat);
       }
       super.writeTo(p0);
       return;
    }
}
