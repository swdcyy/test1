package com.kuaishou.client.log.packages.nano.ClientBase$Experiment;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientBase$Experiment extends MessageNano	// class@00077b
{
    public String name;
    public String value;
    public static ClientBase$Experiment[] _emptyArray;

    public void ClientBase$Experiment(){
       super();
       this.clear();
    }
    public static ClientBase$Experiment[] emptyArray(){
       if (ClientBase$Experiment._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientBase$Experiment._emptyArray == null) {
             ClientBase$Experiment[] uExperimentA = new ClientBase$Experiment[0];
             ClientBase$Experiment._emptyArray = uExperimentA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientBase$Experiment._emptyArray;
    }
    public static ClientBase$Experiment parseFrom(CodedInputByteBufferNano p0){
       return new ClientBase$Experiment().mergeFrom(p0);
    }
    public static ClientBase$Experiment parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientBase$Experiment(), p0);
    }
    public ClientBase$Experiment clear(){
       this.name = "";
       this.value = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.name).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.name);
       }
       if (!(this.value).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.value);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientBase$Experiment mergeFrom(CodedInputByteBufferNano p0){
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
                this.value = p0.readString();
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
       if (!(this.value).equals(str)) {
          p0.writeString(2, this.value);
       }
       super.writeTo(p0);
       return;
    }
}
