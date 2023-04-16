package com.kuaishou.client.log.content.packages.nano.ClientContent$AtlasEditPackageV2;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$AtlasEditPackageV2 extends MessageNano	// class@001205
{
    public long clippedCount;
    public long importedCount;
    public int type;
    public static ClientContent$AtlasEditPackageV2[] _emptyArray;

    public void ClientContent$AtlasEditPackageV2(){
       super();
       this.clear();
    }
    public static ClientContent$AtlasEditPackageV2[] emptyArray(){
       if (ClientContent$AtlasEditPackageV2._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$AtlasEditPackageV2._emptyArray == null) {
             ClientContent$AtlasEditPackageV2[] uAtlasEditPa = new ClientContent$AtlasEditPackageV2[0];
             ClientContent$AtlasEditPackageV2._emptyArray = uAtlasEditPa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$AtlasEditPackageV2._emptyArray;
    }
    public static ClientContent$AtlasEditPackageV2 parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$AtlasEditPackageV2().mergeFrom(p0);
    }
    public static ClientContent$AtlasEditPackageV2 parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$AtlasEditPackageV2(), p0);
    }
    public ClientContent$AtlasEditPackageV2 clear(){
       this.type = 0;
       this.importedCount = 0;
       this.clippedCount = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$AtlasEditPackageV2 ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       ttype = this.importedCount;
       int i1 = 0;
       if (ttype - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttype);
       }
       ttype = this.clippedCount;
       if (ttype - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ttype);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$AtlasEditPackageV2 mergeFrom(CodedInputByteBufferNano p0){
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
                   this.clippedCount = p0.readUInt64();
                }
             }else {
                this.importedCount = p0.readUInt64();
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
       ClientContent$AtlasEditPackageV2 ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       ttype = this.importedCount;
       int i = 0;
       if (ttype - i) {
          p0.writeUInt64(2, ttype);
       }
       ttype = this.clippedCount;
       if (ttype - i) {
          p0.writeUInt64(3, ttype);
       }
       super.writeTo(p0);
       return;
    }
}
