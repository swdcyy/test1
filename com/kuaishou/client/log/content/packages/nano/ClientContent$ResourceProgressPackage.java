package com.kuaishou.client.log.content.packages.nano.ClientContent$ResourceProgressPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Double;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$ResourceProgressPackage extends MessageNano	// class@0012d6
{
    public String name;
    public double progress;
    public static ClientContent$ResourceProgressPackage[] _emptyArray;

    public void ClientContent$ResourceProgressPackage(){
       super();
       this.clear();
    }
    public static ClientContent$ResourceProgressPackage[] emptyArray(){
       if (ClientContent$ResourceProgressPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$ResourceProgressPackage._emptyArray == null) {
             ClientContent$ResourceProgressPackage[] resourceProg = new ClientContent$ResourceProgressPackage[0];
             ClientContent$ResourceProgressPackage._emptyArray = resourceProg;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$ResourceProgressPackage._emptyArray;
    }
    public static ClientContent$ResourceProgressPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$ResourceProgressPackage().mergeFrom(p0);
    }
    public static ClientContent$ResourceProgressPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$ResourceProgressPackage(), p0);
    }
    public ClientContent$ResourceProgressPackage clear(){
       this.name = "";
       this.progress = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.name).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.name);
       }
       if (Double.doubleToLongBits(this.progress) - Double.doubleToLongBits(0)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(2, this.progress);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$ResourceProgressPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 17) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.progress = p0.readDouble();
             }
          }else {
             this.name = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.name).equals("")) {
          p0.writeString(1, this.name);
       }
       if (Double.doubleToLongBits(this.progress) - Double.doubleToLongBits(0)) {
          p0.writeDouble(2, this.progress);
       }
       super.writeTo(p0);
       return;
    }
}
