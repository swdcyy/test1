package com.kuaishou.client.log.content.packages.nano.ClientContent$RecordInfoPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$RecordInfoPackage extends MessageNano	// class@0012d2
{
    public int action;
    public long cost;
    public int encodeType;
    public static ClientContent$RecordInfoPackage[] _emptyArray;

    public void ClientContent$RecordInfoPackage(){
       super();
       this.clear();
    }
    public static ClientContent$RecordInfoPackage[] emptyArray(){
       if (ClientContent$RecordInfoPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$RecordInfoPackage._emptyArray == null) {
             ClientContent$RecordInfoPackage[] recordInfoPa = new ClientContent$RecordInfoPackage[0];
             ClientContent$RecordInfoPackage._emptyArray = recordInfoPa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$RecordInfoPackage._emptyArray;
    }
    public static ClientContent$RecordInfoPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$RecordInfoPackage().mergeFrom(p0);
    }
    public static ClientContent$RecordInfoPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$RecordInfoPackage(), p0);
    }
    public ClientContent$RecordInfoPackage clear(){
       this.encodeType = 0;
       this.cost = 0;
       this.action = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$RecordInfoPackage tencodeType = this.encodeType;
       if (tencodeType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tencodeType);
       }
       tencodeType = this.cost;
       if (tencodeType) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tencodeType);
       }
       tencodeType = this.action;
       if (tencodeType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tencodeType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$RecordInfoPackage mergeFrom(CodedInputByteBufferNano p0){
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
                   switch (i){
                       case 0:
                       case 2:
                       case 3:
                       case 4:
                       case 5:
                       case 6:
                       case 7:
                       case 8:
                       case 1:
                         break;
                       default:
                   }
                   this.action = i;
                }
             }else {
                this.cost = p0.readUInt64();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.encodeType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$RecordInfoPackage tencodeType = this.encodeType;
       if (tencodeType != null) {
          p0.writeInt32(1, tencodeType);
       }
       tencodeType = this.cost;
       if (tencodeType) {
          p0.writeUInt64(2, tencodeType);
       }
       tencodeType = this.action;
       if (tencodeType != null) {
          p0.writeInt32(3, tencodeType);
       }
       super.writeTo(p0);
       return;
    }
}
