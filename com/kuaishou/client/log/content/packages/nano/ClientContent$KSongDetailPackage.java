package com.kuaishou.client.log.content.packages.nano.ClientContent$KSongDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$KSongDetailPackage extends MessageNano	// class@00125e
{
    public boolean cover;
    public int model;
    public int type;
    public static ClientContent$KSongDetailPackage[] _emptyArray;

    public void ClientContent$KSongDetailPackage(){
       super();
       this.clear();
    }
    public static ClientContent$KSongDetailPackage[] emptyArray(){
       if (ClientContent$KSongDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$KSongDetailPackage._emptyArray == null) {
             ClientContent$KSongDetailPackage[] kSongDetailP = new ClientContent$KSongDetailPackage[0];
             ClientContent$KSongDetailPackage._emptyArray = kSongDetailP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$KSongDetailPackage._emptyArray;
    }
    public static ClientContent$KSongDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$KSongDetailPackage().mergeFrom(p0);
    }
    public static ClientContent$KSongDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$KSongDetailPackage(), p0);
    }
    public ClientContent$KSongDetailPackage clear(){
       this.type = 0;
       this.cover = false;
       this.model = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$KSongDetailPackage ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       ttype = this.cover;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, ttype);
       }
       ttype = this.model;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, ttype);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$KSongDetailPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                      continue ;
                   }else {
                      this.model = i;
                   }
                }
             }else {
                this.cover = p0.readBool();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.type = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$KSongDetailPackage ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       ttype = this.cover;
       if (ttype != null) {
          p0.writeBool(2, ttype);
       }
       ttype = this.model;
       if (ttype != null) {
          p0.writeInt32(3, ttype);
       }
       super.writeTo(p0);
       return;
    }
}
