package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$ShareFromOtherAppDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientTaskDetail$ShareFromOtherAppDetailPackage extends MessageNano	// class@001481
{
    public String sourceApp;
    public static ClientTaskDetail$ShareFromOtherAppDetailPackage[] _emptyArray;

    public void ClientTaskDetail$ShareFromOtherAppDetailPackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$ShareFromOtherAppDetailPackage[] emptyArray(){
       if (ClientTaskDetail$ShareFromOtherAppDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$ShareFromOtherAppDetailPackage._emptyArray == null) {
             ClientTaskDetail$ShareFromOtherAppDetailPackage[] shareFromOth = new ClientTaskDetail$ShareFromOtherAppDetailPackage[0];
             ClientTaskDetail$ShareFromOtherAppDetailPackage._emptyArray = shareFromOth;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$ShareFromOtherAppDetailPackage._emptyArray;
    }
    public static ClientTaskDetail$ShareFromOtherAppDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$ShareFromOtherAppDetailPackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$ShareFromOtherAppDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$ShareFromOtherAppDetailPackage(), p0);
    }
    public ClientTaskDetail$ShareFromOtherAppDetailPackage clear(){
       this.sourceApp = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.sourceApp).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.sourceApp);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$ShareFromOtherAppDetailPackage mergeFrom(CodedInputByteBufferNano p0){
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
             this.sourceApp = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.sourceApp).equals("")) {
          p0.writeString(1, this.sourceApp);
       }
       super.writeTo(p0);
       return;
    }
}
