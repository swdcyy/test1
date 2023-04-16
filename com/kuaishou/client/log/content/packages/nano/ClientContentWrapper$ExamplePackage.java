package com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ExamplePackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContentWrapper$ExamplePackage extends MessageNano	// class@00130e
{
    public String params1;
    public long params2;
    public static ClientContentWrapper$ExamplePackage[] _emptyArray;

    public void ClientContentWrapper$ExamplePackage(){
       super();
       this.clear();
    }
    public static ClientContentWrapper$ExamplePackage[] emptyArray(){
       if (ClientContentWrapper$ExamplePackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContentWrapper$ExamplePackage._emptyArray == null) {
             ClientContentWrapper$ExamplePackage[] uExamplePack = new ClientContentWrapper$ExamplePackage[0];
             ClientContentWrapper$ExamplePackage._emptyArray = uExamplePack;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContentWrapper$ExamplePackage._emptyArray;
    }
    public static ClientContentWrapper$ExamplePackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContentWrapper$ExamplePackage().mergeFrom(p0);
    }
    public static ClientContentWrapper$ExamplePackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContentWrapper$ExamplePackage(), p0);
    }
    public ClientContentWrapper$ExamplePackage clear(){
       this.params1 = "";
       this.params2 = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.params1).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.params1);
       }
       ClientContentWrapper$ExamplePackage tparams2 = this.params2;
       if (tparams2) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tparams2);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContentWrapper$ExamplePackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.params2 = p0.readUInt64();
             }
          }else {
             this.params1 = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.params1).equals("")) {
          p0.writeString(1, this.params1);
       }
       ClientContentWrapper$ExamplePackage tparams2 = this.params2;
       if (tparams2) {
          p0.writeUInt64(2, tparams2);
       }
       super.writeTo(p0);
       return;
    }
}
