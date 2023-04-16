package com.kuaishou.client.log.content.packages.nano.ClientContent$AtlasPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$AtlasPackage extends MessageNano	// class@001207
{
    public long count;
    public int type;
    public long viewedCount;
    public static ClientContent$AtlasPackage[] _emptyArray;

    public void ClientContent$AtlasPackage(){
       super();
       this.clear();
    }
    public static ClientContent$AtlasPackage[] emptyArray(){
       if (ClientContent$AtlasPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$AtlasPackage._emptyArray == null) {
             ClientContent$AtlasPackage[] uAtlasPackag = new ClientContent$AtlasPackage[0];
             ClientContent$AtlasPackage._emptyArray = uAtlasPackag;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$AtlasPackage._emptyArray;
    }
    public static ClientContent$AtlasPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$AtlasPackage().mergeFrom(p0);
    }
    public static ClientContent$AtlasPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$AtlasPackage(), p0);
    }
    public ClientContent$AtlasPackage clear(){
       this.type = 0;
       this.count = 0;
       this.viewedCount = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$AtlasPackage ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       ttype = this.count;
       int i1 = 0;
       if (ttype - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttype);
       }
       ttype = this.viewedCount;
       if (ttype - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ttype);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$AtlasPackage mergeFrom(CodedInputByteBufferNano p0){
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
                   this.viewedCount = p0.readUInt64();
                }
             }else {
                this.count = p0.readUInt64();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && (i != 2 && i != 3))) {
                continue ;
             }else {
                this.type = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$AtlasPackage ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       ttype = this.count;
       int i = 0;
       if (ttype - i) {
          p0.writeUInt64(2, ttype);
       }
       ttype = this.viewedCount;
       if (ttype - i) {
          p0.writeUInt64(3, ttype);
       }
       super.writeTo(p0);
       return;
    }
}
