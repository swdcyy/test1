package com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$MusicBillboardPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContentWrapper$MusicBillboardPackage extends MessageNano	// class@001334
{
    public long id;
    public String name;
    public long rank;
    public long updateTime;
    public static ClientContentWrapper$MusicBillboardPackage[] _emptyArray;

    public void ClientContentWrapper$MusicBillboardPackage(){
       super();
       this.clear();
    }
    public static ClientContentWrapper$MusicBillboardPackage[] emptyArray(){
       if (ClientContentWrapper$MusicBillboardPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContentWrapper$MusicBillboardPackage._emptyArray == null) {
             ClientContentWrapper$MusicBillboardPackage[] musicBillboa = new ClientContentWrapper$MusicBillboardPackage[0];
             ClientContentWrapper$MusicBillboardPackage._emptyArray = musicBillboa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContentWrapper$MusicBillboardPackage._emptyArray;
    }
    public static ClientContentWrapper$MusicBillboardPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContentWrapper$MusicBillboardPackage().mergeFrom(p0);
    }
    public static ClientContentWrapper$MusicBillboardPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContentWrapper$MusicBillboardPackage(), p0);
    }
    public ClientContentWrapper$MusicBillboardPackage clear(){
       this.id = 0;
       this.name = "";
       this.updateTime = 0;
       this.rank = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContentWrapper$MusicBillboardPackage tid = this.id;
       int i1 = 0;
       if (tid - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tid);
       }
       if (!(this.name).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.name);
       }
       tid = this.updateTime;
       if (tid - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tid);
       }
       tid = this.rank;
       if (tid - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tid);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContentWrapper$MusicBillboardPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.rank = p0.readUInt64();
                   }
                }else {
                   this.updateTime = p0.readUInt64();
                }
             }else {
                this.name = p0.readString();
             }
          }else {
             this.id = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContentWrapper$MusicBillboardPackage tid = this.id;
       int i = 0;
       if (tid - i) {
          p0.writeUInt64(1, tid);
       }
       if (!(this.name).equals("")) {
          p0.writeString(2, this.name);
       }
       tid = this.updateTime;
       if (tid - i) {
          p0.writeUInt64(3, tid);
       }
       tid = this.rank;
       if (tid - i) {
          p0.writeUInt64(4, tid);
       }
       super.writeTo(p0);
       return;
    }
}
