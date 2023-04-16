package com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoSegmentPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$PhotoSegmentPackage extends MessageNano	// class@0012c5
{
    public int height;
    public int width;
    public static ClientContent$PhotoSegmentPackage[] _emptyArray;

    public void ClientContent$PhotoSegmentPackage(){
       super();
       this.clear();
    }
    public static ClientContent$PhotoSegmentPackage[] emptyArray(){
       if (ClientContent$PhotoSegmentPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$PhotoSegmentPackage._emptyArray == null) {
             ClientContent$PhotoSegmentPackage[] photoSegment = new ClientContent$PhotoSegmentPackage[0];
             ClientContent$PhotoSegmentPackage._emptyArray = photoSegment;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$PhotoSegmentPackage._emptyArray;
    }
    public static ClientContent$PhotoSegmentPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$PhotoSegmentPackage().mergeFrom(p0);
    }
    public static ClientContent$PhotoSegmentPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$PhotoSegmentPackage(), p0);
    }
    public ClientContent$PhotoSegmentPackage clear(){
       this.width = 0;
       this.height = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$PhotoSegmentPackage twidth = this.width;
       if (twidth != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, twidth);
       }
       twidth = this.height;
       if (twidth != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, twidth);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$PhotoSegmentPackage mergeFrom(CodedInputByteBufferNano p0){
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
                this.height = p0.readUInt32();
             }
          }else {
             this.width = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$PhotoSegmentPackage twidth = this.width;
       if (twidth != null) {
          p0.writeUInt32(1, twidth);
       }
       twidth = this.height;
       if (twidth != null) {
          p0.writeUInt32(2, twidth);
       }
       super.writeTo(p0);
       return;
    }
}
