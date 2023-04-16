package com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientEvent$ExpTagTrans extends MessageNano	// class@001354
{
    public String clientExpTag;
    public String serverExpTag;
    public static ClientEvent$ExpTagTrans[] _emptyArray;

    public void ClientEvent$ExpTagTrans(){
       super();
       this.clear();
    }
    public static ClientEvent$ExpTagTrans[] emptyArray(){
       if (ClientEvent$ExpTagTrans._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientEvent$ExpTagTrans._emptyArray == null) {
             ClientEvent$ExpTagTrans[] uExpTagTrans = new ClientEvent$ExpTagTrans[0];
             ClientEvent$ExpTagTrans._emptyArray = uExpTagTrans;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientEvent$ExpTagTrans._emptyArray;
    }
    public static ClientEvent$ExpTagTrans parseFrom(CodedInputByteBufferNano p0){
       return new ClientEvent$ExpTagTrans().mergeFrom(p0);
    }
    public static ClientEvent$ExpTagTrans parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientEvent$ExpTagTrans(), p0);
    }
    public ClientEvent$ExpTagTrans clear(){
       this.serverExpTag = "";
       this.clientExpTag = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.serverExpTag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.serverExpTag);
       }
       if (!(this.clientExpTag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.clientExpTag);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientEvent$ExpTagTrans mergeFrom(CodedInputByteBufferNano p0){
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
                this.clientExpTag = p0.readString();
             }
          }else {
             this.serverExpTag = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.serverExpTag).equals(str)) {
          p0.writeString(1, this.serverExpTag);
       }
       if (!(this.clientExpTag).equals(str)) {
          p0.writeString(2, this.clientExpTag);
       }
       super.writeTo(p0);
       return;
    }
}
