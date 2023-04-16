package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$OpenRedPackDetailPackage$TimeInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientTaskDetail$OpenRedPackDetailPackage$TimeInfo extends MessageNano	// class@001467
{
    public boolean clientNtpAvailable;
    public long clientTimestamp;
    public long serverTimestamp;
    public static ClientTaskDetail$OpenRedPackDetailPackage$TimeInfo[] _emptyArray;

    public void ClientTaskDetail$OpenRedPackDetailPackage$TimeInfo(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$OpenRedPackDetailPackage$TimeInfo[] emptyArray(){
       if (ClientTaskDetail$OpenRedPackDetailPackage$TimeInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$OpenRedPackDetailPackage$TimeInfo._emptyArray == null) {
             ClientTaskDetail$OpenRedPackDetailPackage$TimeInfo[] openRedPackD = new ClientTaskDetail$OpenRedPackDetailPackage$TimeInfo[0];
             ClientTaskDetail$OpenRedPackDetailPackage$TimeInfo._emptyArray = openRedPackD;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$OpenRedPackDetailPackage$TimeInfo._emptyArray;
    }
    public static ClientTaskDetail$OpenRedPackDetailPackage$TimeInfo parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$OpenRedPackDetailPackage$TimeInfo().mergeFrom(p0);
    }
    public static ClientTaskDetail$OpenRedPackDetailPackage$TimeInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$OpenRedPackDetailPackage$TimeInfo(), p0);
    }
    public ClientTaskDetail$OpenRedPackDetailPackage$TimeInfo clear(){
       this.clientTimestamp = 0;
       this.serverTimestamp = 0;
       this.clientNtpAvailable = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientTaskDetail$OpenRedPackDetailPackage$TimeInfo tclientTimes = this.clientTimestamp;
       int i1 = 0;
       if (tclientTimes - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tclientTimes);
       }
       tclientTimes = this.serverTimestamp;
       if (tclientTimes - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tclientTimes);
       }
       tclientTimes = this.clientNtpAvailable;
       if (tclientTimes != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tclientTimes);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$OpenRedPackDetailPackage$TimeInfo mergeFrom(CodedInputByteBufferNano p0){
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
                   this.clientNtpAvailable = p0.readBool();
                }
             }else {
                this.serverTimestamp = p0.readUInt64();
             }
          }else {
             this.clientTimestamp = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientTaskDetail$OpenRedPackDetailPackage$TimeInfo tclientTimes = this.clientTimestamp;
       int i = 0;
       if (tclientTimes - i) {
          p0.writeUInt64(1, tclientTimes);
       }
       tclientTimes = this.serverTimestamp;
       if (tclientTimes - i) {
          p0.writeUInt64(2, tclientTimes);
       }
       tclientTimes = this.clientNtpAvailable;
       if (tclientTimes != null) {
          p0.writeBool(3, tclientTimes);
       }
       super.writeTo(p0);
       return;
    }
}
