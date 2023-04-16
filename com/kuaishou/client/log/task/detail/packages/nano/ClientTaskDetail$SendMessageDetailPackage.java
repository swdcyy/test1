package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$SendMessageDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Float;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientTaskDetail$SendMessageDetailPackage extends MessageNano	// class@001479
{
    public float compressRate;
    public int environment;
    public String fromUserId;
    public int messageType;
    public int msgType;
    public int resultCode;
    public long sendTimeCost;
    public long sendTimestamp;
    public long timeSendOnly;
    public float uploadRate;
    public static ClientTaskDetail$SendMessageDetailPackage[] _emptyArray;

    public void ClientTaskDetail$SendMessageDetailPackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$SendMessageDetailPackage[] emptyArray(){
       if (ClientTaskDetail$SendMessageDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$SendMessageDetailPackage._emptyArray == null) {
             ClientTaskDetail$SendMessageDetailPackage[] sendMessageD = new ClientTaskDetail$SendMessageDetailPackage[0];
             ClientTaskDetail$SendMessageDetailPackage._emptyArray = sendMessageD;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$SendMessageDetailPackage._emptyArray;
    }
    public static ClientTaskDetail$SendMessageDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$SendMessageDetailPackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$SendMessageDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$SendMessageDetailPackage(), p0);
    }
    public ClientTaskDetail$SendMessageDetailPackage clear(){
       this.fromUserId = "";
       this.sendTimestamp = 0;
       this.environment = 0;
       this.resultCode = 0;
       this.messageType = 0;
       this.sendTimeCost = 0;
       this.msgType = 0;
       this.compressRate = 0;
       this.uploadRate = 0;
       this.timeSendOnly = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.fromUserId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.fromUserId);
       }
       ClientTaskDetail$SendMessageDetailPackage tsendTimesta = this.sendTimestamp;
       int i1 = 0;
       if (tsendTimesta - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(2, tsendTimesta);
       }
       tsendTimesta = this.environment;
       if (tsendTimesta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tsendTimesta);
       }
       tsendTimesta = this.resultCode;
       if (tsendTimesta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tsendTimesta);
       }
       tsendTimesta = this.messageType;
       if (tsendTimesta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tsendTimesta);
       }
       tsendTimesta = this.sendTimeCost;
       if (tsendTimesta - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(6, tsendTimesta);
       }
       tsendTimesta = this.msgType;
       if (tsendTimesta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(7, tsendTimesta);
       }
       float f = 0;
       if (Float.floatToIntBits(this.compressRate) != Float.floatToIntBits(f)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(8, this.compressRate);
       }
       if (Float.floatToIntBits(this.uploadRate) != Float.floatToIntBits(f)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(9, this.uploadRate);
       }
       tsendTimesta = this.timeSendOnly;
       if (tsendTimesta - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(10, tsendTimesta);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$SendMessageDetailPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.fromUserId = p0.readString();
                break;
              case 16:
                this.sendTimestamp = p0.readInt64();
                break;
              case 24:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.environment = i;
                }
                break;
              case 32:
                this.resultCode = p0.readInt32();
                break;
              case '(':
                i = p0.readInt32();
                if (i != 100) {
                   switch (i){
                       case 0:
                       case 2:
                       case 3:
                       case 4:
                       case 5:
                       case 6:
                       case 7:
                       case 1:
                         break;
                       default:
                   }
                }
                this.messageType = i;
                break;
              case '0':
                this.sendTimeCost = p0.readInt64();
                break;
              case '8':
                this.msgType = p0.readInt32();
                break;
              case 'E':
                this.compressRate = p0.readFloat();
                break;
              case 'M':
                this.uploadRate = p0.readFloat();
                break;
              case 'P':
                this.timeSendOnly = p0.readInt64();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.fromUserId).equals("")) {
          p0.writeString(1, this.fromUserId);
       }
       ClientTaskDetail$SendMessageDetailPackage tsendTimesta = this.sendTimestamp;
       int i = 0;
       if (tsendTimesta - i) {
          p0.writeInt64(2, tsendTimesta);
       }
       tsendTimesta = this.environment;
       if (tsendTimesta != null) {
          p0.writeInt32(3, tsendTimesta);
       }
       tsendTimesta = this.resultCode;
       if (tsendTimesta != null) {
          p0.writeInt32(4, tsendTimesta);
       }
       tsendTimesta = this.messageType;
       if (tsendTimesta != null) {
          p0.writeInt32(5, tsendTimesta);
       }
       tsendTimesta = this.sendTimeCost;
       if (tsendTimesta - i) {
          p0.writeInt64(6, tsendTimesta);
       }
       tsendTimesta = this.msgType;
       if (tsendTimesta != null) {
          p0.writeInt32(7, tsendTimesta);
       }
       float f = 0;
       if (Float.floatToIntBits(this.compressRate) != Float.floatToIntBits(f)) {
          p0.writeFloat(8, this.compressRate);
       }
       if (Float.floatToIntBits(this.uploadRate) != Float.floatToIntBits(f)) {
          p0.writeFloat(9, this.uploadRate);
       }
       tsendTimesta = this.timeSendOnly;
       if (tsendTimesta - i) {
          p0.writeInt64(10, tsendTimesta);
       }
       super.writeTo(p0);
       return;
    }
}
