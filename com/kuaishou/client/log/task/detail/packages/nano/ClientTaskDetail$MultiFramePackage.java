package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$MultiFramePackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientTaskDetail$MultiFramePackage extends MessageNano	// class@001465
{
    public int frameCount;
    public long totalCost;
    public static ClientTaskDetail$MultiFramePackage[] _emptyArray;

    public void ClientTaskDetail$MultiFramePackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$MultiFramePackage[] emptyArray(){
       if (ClientTaskDetail$MultiFramePackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$MultiFramePackage._emptyArray == null) {
             ClientTaskDetail$MultiFramePackage[] multiFramePa = new ClientTaskDetail$MultiFramePackage[0];
             ClientTaskDetail$MultiFramePackage._emptyArray = multiFramePa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$MultiFramePackage._emptyArray;
    }
    public static ClientTaskDetail$MultiFramePackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$MultiFramePackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$MultiFramePackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$MultiFramePackage(), p0);
    }
    public ClientTaskDetail$MultiFramePackage clear(){
       this.totalCost = 0;
       this.frameCount = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientTaskDetail$MultiFramePackage ttotalCost = this.totalCost;
       if (ttotalCost) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttotalCost);
       }
       ttotalCost = this.frameCount;
       if (ttotalCost != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, ttotalCost);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$MultiFramePackage mergeFrom(CodedInputByteBufferNano p0){
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
                this.frameCount = p0.readUInt32();
             }
          }else {
             this.totalCost = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientTaskDetail$MultiFramePackage ttotalCost = this.totalCost;
       if (ttotalCost) {
          p0.writeUInt64(1, ttotalCost);
       }
       ttotalCost = this.frameCount;
       if (ttotalCost != null) {
          p0.writeUInt32(2, ttotalCost);
       }
       super.writeTo(p0);
       return;
    }
}
