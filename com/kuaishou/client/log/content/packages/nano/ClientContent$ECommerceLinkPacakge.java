package com.kuaishou.client.log.content.packages.nano.ClientContent$ECommerceLinkPacakge;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$ECommerceLinkPacakge extends MessageNano	// class@001238
{
    public String identity;
    public static ClientContent$ECommerceLinkPacakge[] _emptyArray;

    public void ClientContent$ECommerceLinkPacakge(){
       super();
       this.clear();
    }
    public static ClientContent$ECommerceLinkPacakge[] emptyArray(){
       if (ClientContent$ECommerceLinkPacakge._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$ECommerceLinkPacakge._emptyArray == null) {
             ClientContent$ECommerceLinkPacakge[] uECommerceLi = new ClientContent$ECommerceLinkPacakge[0];
             ClientContent$ECommerceLinkPacakge._emptyArray = uECommerceLi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$ECommerceLinkPacakge._emptyArray;
    }
    public static ClientContent$ECommerceLinkPacakge parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$ECommerceLinkPacakge().mergeFrom(p0);
    }
    public static ClientContent$ECommerceLinkPacakge parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$ECommerceLinkPacakge(), p0);
    }
    public ClientContent$ECommerceLinkPacakge clear(){
       this.identity = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.identity).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.identity);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$ECommerceLinkPacakge mergeFrom(CodedInputByteBufferNano p0){
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
             this.identity = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.identity).equals("")) {
          p0.writeString(1, this.identity);
       }
       super.writeTo(p0);
       return;
    }
}
