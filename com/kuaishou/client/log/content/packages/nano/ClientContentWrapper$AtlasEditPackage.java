package com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$AtlasEditPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContentWrapper$AtlasEditPackage extends MessageNano	// class@001305
{
    public long clippedCount;
    public long importedCount;
    public int type;
    public static ClientContentWrapper$AtlasEditPackage[] _emptyArray;

    public void ClientContentWrapper$AtlasEditPackage(){
       super();
       this.clear();
    }
    public static ClientContentWrapper$AtlasEditPackage[] emptyArray(){
       if (ClientContentWrapper$AtlasEditPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContentWrapper$AtlasEditPackage._emptyArray == null) {
             ClientContentWrapper$AtlasEditPackage[] uAtlasEditPa = new ClientContentWrapper$AtlasEditPackage[0];
             ClientContentWrapper$AtlasEditPackage._emptyArray = uAtlasEditPa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContentWrapper$AtlasEditPackage._emptyArray;
    }
    public static ClientContentWrapper$AtlasEditPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContentWrapper$AtlasEditPackage().mergeFrom(p0);
    }
    public static ClientContentWrapper$AtlasEditPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContentWrapper$AtlasEditPackage(), p0);
    }
    public ClientContentWrapper$AtlasEditPackage clear(){
       this.type = 0;
       this.importedCount = 0;
       this.clippedCount = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContentWrapper$AtlasEditPackage ttype = this.type;
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
    public ClientContentWrapper$AtlasEditPackage mergeFrom(CodedInputByteBufferNano p0){
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
       ClientContentWrapper$AtlasEditPackage ttype = this.type;
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
