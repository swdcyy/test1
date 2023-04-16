package com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$KsOrderInfoPackage extends MessageNano	// class@00125f
{
    public String ksOrderId;
    public static ClientContent$KsOrderInfoPackage[] _emptyArray;

    public void ClientContent$KsOrderInfoPackage(){
       super();
       this.clear();
    }
    public static ClientContent$KsOrderInfoPackage[] emptyArray(){
       if (ClientContent$KsOrderInfoPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$KsOrderInfoPackage._emptyArray == null) {
             ClientContent$KsOrderInfoPackage[] ksOrderInfoP = new ClientContent$KsOrderInfoPackage[0];
             ClientContent$KsOrderInfoPackage._emptyArray = ksOrderInfoP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$KsOrderInfoPackage._emptyArray;
    }
    public static ClientContent$KsOrderInfoPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$KsOrderInfoPackage().mergeFrom(p0);
    }
    public static ClientContent$KsOrderInfoPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$KsOrderInfoPackage(), p0);
    }
    public ClientContent$KsOrderInfoPackage clear(){
       this.ksOrderId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.ksOrderId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.ksOrderId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$KsOrderInfoPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             this.ksOrderId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.ksOrderId).equals("")) {
          p0.writeString(1, this.ksOrderId);
       }
       super.writeTo(p0);
       return;
    }
}
