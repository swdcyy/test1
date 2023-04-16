package com.kuaishou.client.log.content.packages.nano.ClientContent$BusinessPackageV2;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$CustomV2;

public final class ClientContent$BusinessPackageV2 extends MessageNano	// class@001224
{
    public String businessLine;
    public ClientContent$CustomV2 custom;
    public static ClientContent$BusinessPackageV2[] _emptyArray;

    public void ClientContent$BusinessPackageV2(){
       super();
       this.clear();
    }
    public static ClientContent$BusinessPackageV2[] emptyArray(){
       if (ClientContent$BusinessPackageV2._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$BusinessPackageV2._emptyArray == null) {
             ClientContent$BusinessPackageV2[] uBusinessPac = new ClientContent$BusinessPackageV2[0];
             ClientContent$BusinessPackageV2._emptyArray = uBusinessPac;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$BusinessPackageV2._emptyArray;
    }
    public static ClientContent$BusinessPackageV2 parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$BusinessPackageV2().mergeFrom(p0);
    }
    public static ClientContent$BusinessPackageV2 parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$BusinessPackageV2(), p0);
    }
    public ClientContent$BusinessPackageV2 clear(){
       this.businessLine = "";
       this.custom = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.businessLine).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.businessLine);
       }
       ClientContent$BusinessPackageV2 tcustom = this.custom;
       if (tcustom != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tcustom);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$BusinessPackageV2 mergeFrom(CodedInputByteBufferNano p0){
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
             }else if(this.custom == null){
                this.custom = new ClientContent$CustomV2();
             }
             p0.readMessage(this.custom);
          }else {
             this.businessLine = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.businessLine).equals("")) {
          p0.writeString(1, this.businessLine);
       }
       ClientContent$BusinessPackageV2 tcustom = this.custom;
       if (tcustom != null) {
          p0.writeMessage(2, tcustom);
       }
       super.writeTo(p0);
       return;
    }
}
