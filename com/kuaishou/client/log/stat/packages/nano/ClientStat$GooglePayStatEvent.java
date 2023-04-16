package com.kuaishou.client.log.stat.packages.nano.ClientStat$GooglePayStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$GooglePayStatEvent extends MessageNano	// class@0007c7
{
    public int actionType;
    public String billingResponse;
    public int responseCode;
    public String responseMsg;
    public static ClientStat$GooglePayStatEvent[] _emptyArray;

    public void ClientStat$GooglePayStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$GooglePayStatEvent[] emptyArray(){
       if (ClientStat$GooglePayStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$GooglePayStatEvent._emptyArray == null) {
             ClientStat$GooglePayStatEvent[] googlePaySta = new ClientStat$GooglePayStatEvent[0];
             ClientStat$GooglePayStatEvent._emptyArray = googlePaySta;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$GooglePayStatEvent._emptyArray;
    }
    public static ClientStat$GooglePayStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$GooglePayStatEvent().mergeFrom(p0);
    }
    public static ClientStat$GooglePayStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$GooglePayStatEvent(), p0);
    }
    public ClientStat$GooglePayStatEvent clear(){
       this.actionType = 0;
       this.responseCode = 0;
       this.responseMsg = "";
       this.billingResponse = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$GooglePayStatEvent tactionType = this.actionType;
       if (tactionType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tactionType);
       }
       tactionType = this.responseCode;
       if (tactionType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tactionType);
       }
       String str = "";
       if (!(this.responseMsg).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.responseMsg);
       }
       if (!(this.billingResponse).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.billingResponse);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$GooglePayStatEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.billingResponse = p0.readString();
                   }
                }else {
                   this.responseMsg = p0.readString();
                }
             }else {
                this.responseCode = p0.readUInt32();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && (i != 2 && (i != 3 && (i != 4 && i != 5))))) {
                continue ;
             }else {
                this.actionType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$GooglePayStatEvent tactionType = this.actionType;
       if (tactionType != null) {
          p0.writeInt32(1, tactionType);
       }
       tactionType = this.responseCode;
       if (tactionType != null) {
          p0.writeUInt32(2, tactionType);
       }
       String str = "";
       if (!(this.responseMsg).equals(str)) {
          p0.writeString(3, this.responseMsg);
       }
       if (!(this.billingResponse).equals(str)) {
          p0.writeString(4, this.billingResponse);
       }
       super.writeTo(p0);
       return;
    }
}
