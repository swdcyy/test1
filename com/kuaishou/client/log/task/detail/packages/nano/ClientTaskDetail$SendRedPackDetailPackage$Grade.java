package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$SendRedPackDetailPackage$Grade;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientTaskDetail$SendRedPackDetailPackage$Grade extends MessageNano	// class@00147a
{
    public long highValue;
    public long lowValue;
    public long middleValue;
    public static ClientTaskDetail$SendRedPackDetailPackage$Grade[] _emptyArray;

    public void ClientTaskDetail$SendRedPackDetailPackage$Grade(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$SendRedPackDetailPackage$Grade[] emptyArray(){
       if (ClientTaskDetail$SendRedPackDetailPackage$Grade._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$SendRedPackDetailPackage$Grade._emptyArray == null) {
             ClientTaskDetail$SendRedPackDetailPackage$Grade[] sendRedPackD = new ClientTaskDetail$SendRedPackDetailPackage$Grade[0];
             ClientTaskDetail$SendRedPackDetailPackage$Grade._emptyArray = sendRedPackD;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$SendRedPackDetailPackage$Grade._emptyArray;
    }
    public static ClientTaskDetail$SendRedPackDetailPackage$Grade parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$SendRedPackDetailPackage$Grade().mergeFrom(p0);
    }
    public static ClientTaskDetail$SendRedPackDetailPackage$Grade parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$SendRedPackDetailPackage$Grade(), p0);
    }
    public ClientTaskDetail$SendRedPackDetailPackage$Grade clear(){
       this.lowValue = 0;
       this.middleValue = 0;
       this.highValue = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientTaskDetail$SendRedPackDetailPackage$Grade tlowValue = this.lowValue;
       int i1 = 0;
       if (tlowValue - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tlowValue);
       }
       tlowValue = this.middleValue;
       if (tlowValue - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tlowValue);
       }
       tlowValue = this.highValue;
       if (tlowValue - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tlowValue);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$SendRedPackDetailPackage$Grade mergeFrom(CodedInputByteBufferNano p0){
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
                   this.highValue = p0.readUInt64();
                }
             }else {
                this.middleValue = p0.readUInt64();
             }
          }else {
             this.lowValue = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientTaskDetail$SendRedPackDetailPackage$Grade tlowValue = this.lowValue;
       int i = 0;
       if (tlowValue - i) {
          p0.writeUInt64(1, tlowValue);
       }
       tlowValue = this.middleValue;
       if (tlowValue - i) {
          p0.writeUInt64(2, tlowValue);
       }
       tlowValue = this.highValue;
       if (tlowValue - i) {
          p0.writeUInt64(3, tlowValue);
       }
       super.writeTo(p0);
       return;
    }
}
