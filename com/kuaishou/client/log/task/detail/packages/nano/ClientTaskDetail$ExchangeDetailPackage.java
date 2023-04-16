package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$ExchangeDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientTaskDetail$ExchangeDetailPackage extends MessageNano	// class@001455
{
    public int type;
    public static ClientTaskDetail$ExchangeDetailPackage[] _emptyArray;

    public void ClientTaskDetail$ExchangeDetailPackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$ExchangeDetailPackage[] emptyArray(){
       if (ClientTaskDetail$ExchangeDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$ExchangeDetailPackage._emptyArray == null) {
             ClientTaskDetail$ExchangeDetailPackage[] uExchangeDet = new ClientTaskDetail$ExchangeDetailPackage[0];
             ClientTaskDetail$ExchangeDetailPackage._emptyArray = uExchangeDet;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$ExchangeDetailPackage._emptyArray;
    }
    public static ClientTaskDetail$ExchangeDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$ExchangeDetailPackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$ExchangeDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$ExchangeDetailPackage(), p0);
    }
    public ClientTaskDetail$ExchangeDetailPackage clear(){
       this.type = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientTaskDetail$ExchangeDetailPackage ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$ExchangeDetailPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.type = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientTaskDetail$ExchangeDetailPackage ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       super.writeTo(p0);
       return;
    }
}
