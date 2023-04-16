package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$MultiFrameUploadPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientTaskDetail$MultiFrameUploadPackage extends MessageNano	// class@001466
{
    public int batchNumber;
    public int batchSize;
    public long cost;
    public long dataSize;
    public static ClientTaskDetail$MultiFrameUploadPackage[] _emptyArray;

    public void ClientTaskDetail$MultiFrameUploadPackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$MultiFrameUploadPackage[] emptyArray(){
       if (ClientTaskDetail$MultiFrameUploadPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$MultiFrameUploadPackage._emptyArray == null) {
             ClientTaskDetail$MultiFrameUploadPackage[] multiFrameUp = new ClientTaskDetail$MultiFrameUploadPackage[0];
             ClientTaskDetail$MultiFrameUploadPackage._emptyArray = multiFrameUp;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$MultiFrameUploadPackage._emptyArray;
    }
    public static ClientTaskDetail$MultiFrameUploadPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$MultiFrameUploadPackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$MultiFrameUploadPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$MultiFrameUploadPackage(), p0);
    }
    public ClientTaskDetail$MultiFrameUploadPackage clear(){
       this.cost = 0;
       this.batchSize = 0;
       this.batchNumber = 0;
       this.dataSize = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientTaskDetail$MultiFrameUploadPackage tcost = this.cost;
       int i1 = 0;
       if (tcost - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tcost);
       }
       tcost = this.batchSize;
       if (tcost != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tcost);
       }
       tcost = this.batchNumber;
       if (tcost != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tcost);
       }
       tcost = this.dataSize;
       if (tcost - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tcost);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$MultiFrameUploadPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.dataSize = p0.readUInt64();
                   }
                }else {
                   this.batchNumber = p0.readUInt32();
                }
             }else {
                this.batchSize = p0.readUInt32();
             }
          }else {
             this.cost = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientTaskDetail$MultiFrameUploadPackage tcost = this.cost;
       int i = 0;
       if (tcost - i) {
          p0.writeUInt64(1, tcost);
       }
       tcost = this.batchSize;
       if (tcost != null) {
          p0.writeUInt32(2, tcost);
       }
       tcost = this.batchNumber;
       if (tcost != null) {
          p0.writeUInt32(3, tcost);
       }
       tcost = this.dataSize;
       if (tcost - i) {
          p0.writeUInt64(4, tcost);
       }
       super.writeTo(p0);
       return;
    }
}
