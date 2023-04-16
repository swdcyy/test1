package com.kuaishou.client.log.content.packages.nano.ClientContent$BusinessProfilePackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$BusinessProfilePackage extends MessageNano	// class@001225
{
    public String visitedUserId;
    public static ClientContent$BusinessProfilePackage[] _emptyArray;

    public void ClientContent$BusinessProfilePackage(){
       super();
       this.clear();
    }
    public static ClientContent$BusinessProfilePackage[] emptyArray(){
       if (ClientContent$BusinessProfilePackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$BusinessProfilePackage._emptyArray == null) {
             ClientContent$BusinessProfilePackage[] uBusinessPro = new ClientContent$BusinessProfilePackage[0];
             ClientContent$BusinessProfilePackage._emptyArray = uBusinessPro;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$BusinessProfilePackage._emptyArray;
    }
    public static ClientContent$BusinessProfilePackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$BusinessProfilePackage().mergeFrom(p0);
    }
    public static ClientContent$BusinessProfilePackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$BusinessProfilePackage(), p0);
    }
    public ClientContent$BusinessProfilePackage clear(){
       this.visitedUserId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.visitedUserId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.visitedUserId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$BusinessProfilePackage mergeFrom(CodedInputByteBufferNano p0){
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
             this.visitedUserId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.visitedUserId).equals("")) {
          p0.writeString(1, this.visitedUserId);
       }
       super.writeTo(p0);
       return;
    }
}
