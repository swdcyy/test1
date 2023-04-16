package com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientEvent$AreaPackage extends MessageNano	// class@001348
{
    public String name;
    public String params;
    public static ClientEvent$AreaPackage[] _emptyArray;

    public void ClientEvent$AreaPackage(){
       super();
       this.clear();
    }
    public static ClientEvent$AreaPackage[] emptyArray(){
       if (ClientEvent$AreaPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientEvent$AreaPackage._emptyArray == null) {
             ClientEvent$AreaPackage[] uAreaPackage = new ClientEvent$AreaPackage[0];
             ClientEvent$AreaPackage._emptyArray = uAreaPackage;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientEvent$AreaPackage._emptyArray;
    }
    public static ClientEvent$AreaPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientEvent$AreaPackage().mergeFrom(p0);
    }
    public static ClientEvent$AreaPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientEvent$AreaPackage(), p0);
    }
    public ClientEvent$AreaPackage clear(){
       this.name = "";
       this.params = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.name).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.name);
       }
       if (!(this.params).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.params);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientEvent$AreaPackage mergeFrom(CodedInputByteBufferNano p0){
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
             this.name = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.name).equals(str)) {
          p0.writeString(1, this.name);
       }
       if (!(this.params).equals(str)) {
          p0.writeString(2, this.params);
       }
       super.writeTo(p0);
       return;
    }
}
