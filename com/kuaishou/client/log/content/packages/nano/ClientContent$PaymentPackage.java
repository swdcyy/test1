package com.kuaishou.client.log.content.packages.nano.ClientContent$PaymentPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$PaymentPackage extends MessageNano	// class@0012bd
{
    public String currency;
    public String identity;
    public int provider;
    public static ClientContent$PaymentPackage[] _emptyArray;

    public void ClientContent$PaymentPackage(){
       super();
       this.clear();
    }
    public static ClientContent$PaymentPackage[] emptyArray(){
       if (ClientContent$PaymentPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$PaymentPackage._emptyArray == null) {
             ClientContent$PaymentPackage[] paymentPacka = new ClientContent$PaymentPackage[0];
             ClientContent$PaymentPackage._emptyArray = paymentPacka;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$PaymentPackage._emptyArray;
    }
    public static ClientContent$PaymentPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$PaymentPackage().mergeFrom(p0);
    }
    public static ClientContent$PaymentPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$PaymentPackage(), p0);
    }
    public ClientContent$PaymentPackage clear(){
       this.identity = "";
       this.provider = 0;
       this.currency = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.identity).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.identity);
       }
       ClientContent$PaymentPackage tprovider = this.provider;
       if (tprovider != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tprovider);
       }
       if (!(this.currency).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.currency);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$PaymentPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.currency = p0.readString();
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                   continue ;
                }else {
                   this.provider = i;
                }
             }
          }else {
             this.identity = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.identity).equals(str)) {
          p0.writeString(1, this.identity);
       }
       ClientContent$PaymentPackage tprovider = this.provider;
       if (tprovider != null) {
          p0.writeInt32(2, tprovider);
       }
       if (!(this.currency).equals(str)) {
          p0.writeString(3, this.currency);
       }
       super.writeTo(p0);
       return;
    }
}
