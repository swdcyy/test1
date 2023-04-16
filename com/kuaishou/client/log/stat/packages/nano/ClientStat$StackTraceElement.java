package com.kuaishou.client.log.stat.packages.nano.ClientStat$StackTraceElement;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$StackTraceElement extends MessageNano	// class@001427
{
    public String stackTraceDetail;
    public static ClientStat$StackTraceElement[] _emptyArray;

    public void ClientStat$StackTraceElement(){
       super();
       this.clear();
    }
    public static ClientStat$StackTraceElement[] emptyArray(){
       if (ClientStat$StackTraceElement._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$StackTraceElement._emptyArray == null) {
             ClientStat$StackTraceElement[] stackTraceEl = new ClientStat$StackTraceElement[0];
             ClientStat$StackTraceElement._emptyArray = stackTraceEl;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$StackTraceElement._emptyArray;
    }
    public static ClientStat$StackTraceElement parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$StackTraceElement().mergeFrom(p0);
    }
    public static ClientStat$StackTraceElement parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$StackTraceElement(), p0);
    }
    public ClientStat$StackTraceElement clear(){
       this.stackTraceDetail = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.stackTraceDetail).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.stackTraceDetail);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$StackTraceElement mergeFrom(CodedInputByteBufferNano p0){
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
             this.stackTraceDetail = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.stackTraceDetail).equals("")) {
          p0.writeString(1, this.stackTraceDetail);
       }
       super.writeTo(p0);
       return;
    }
}
