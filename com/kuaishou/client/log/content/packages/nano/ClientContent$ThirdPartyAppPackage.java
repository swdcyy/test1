package com.kuaishou.client.log.content.packages.nano.ClientContent$ThirdPartyAppPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$ThirdPartyAppPackage extends MessageNano	// class@0012e9
{
    public String id;
    public String name;
    public static ClientContent$ThirdPartyAppPackage[] _emptyArray;

    public void ClientContent$ThirdPartyAppPackage(){
       super();
       this.clear();
    }
    public static ClientContent$ThirdPartyAppPackage[] emptyArray(){
       if (ClientContent$ThirdPartyAppPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$ThirdPartyAppPackage._emptyArray == null) {
             ClientContent$ThirdPartyAppPackage[] thirdPartyAp = new ClientContent$ThirdPartyAppPackage[0];
             ClientContent$ThirdPartyAppPackage._emptyArray = thirdPartyAp;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$ThirdPartyAppPackage._emptyArray;
    }
    public static ClientContent$ThirdPartyAppPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$ThirdPartyAppPackage().mergeFrom(p0);
    }
    public static ClientContent$ThirdPartyAppPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$ThirdPartyAppPackage(), p0);
    }
    public ClientContent$ThirdPartyAppPackage clear(){
       this.id = "";
       this.name = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       if (!(this.name).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.name);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$ThirdPartyAppPackage mergeFrom(CodedInputByteBufferNano p0){
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
                this.name = p0.readString();
             }
          }else {
             this.id = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.id).equals(str)) {
          p0.writeString(1, this.id);
       }
       if (!(this.name).equals(str)) {
          p0.writeString(2, this.name);
       }
       super.writeTo(p0);
       return;
    }
}
