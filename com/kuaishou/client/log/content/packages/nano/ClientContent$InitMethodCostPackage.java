package com.kuaishou.client.log.content.packages.nano.ClientContent$InitMethodCostPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$InitMethodCostPackage extends MessageNano	// class@00125b
{
    public String method;
    public String params;
    public static ClientContent$InitMethodCostPackage[] _emptyArray;

    public void ClientContent$InitMethodCostPackage(){
       super();
       this.clear();
    }
    public static ClientContent$InitMethodCostPackage[] emptyArray(){
       if (ClientContent$InitMethodCostPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$InitMethodCostPackage._emptyArray == null) {
             ClientContent$InitMethodCostPackage[] initMethodCo = new ClientContent$InitMethodCostPackage[0];
             ClientContent$InitMethodCostPackage._emptyArray = initMethodCo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$InitMethodCostPackage._emptyArray;
    }
    public static ClientContent$InitMethodCostPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$InitMethodCostPackage().mergeFrom(p0);
    }
    public static ClientContent$InitMethodCostPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$InitMethodCostPackage(), p0);
    }
    public ClientContent$InitMethodCostPackage clear(){
       this.method = "";
       this.params = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.method).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.method);
       }
       if (!(this.params).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.params);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$InitMethodCostPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.params = p0.readString();
             }
          }else {
             this.method = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.method).equals(str)) {
          p0.writeString(1, this.method);
       }
       if (!(this.params).equals(str)) {
          p0.writeString(2, this.params);
       }
       super.writeTo(p0);
       return;
    }
}
