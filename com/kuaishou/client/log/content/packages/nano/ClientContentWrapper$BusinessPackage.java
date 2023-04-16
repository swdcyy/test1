package com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$BusinessPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$Custom;

public final class ClientContentWrapper$BusinessPackage extends MessageNano	// class@00130b
{
    public String businessLine;
    public ClientContentWrapper$Custom custom;
    public static ClientContentWrapper$BusinessPackage[] _emptyArray;

    public void ClientContentWrapper$BusinessPackage(){
       super();
       this.clear();
    }
    public static ClientContentWrapper$BusinessPackage[] emptyArray(){
       if (ClientContentWrapper$BusinessPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContentWrapper$BusinessPackage._emptyArray == null) {
             ClientContentWrapper$BusinessPackage[] uBusinessPac = new ClientContentWrapper$BusinessPackage[0];
             ClientContentWrapper$BusinessPackage._emptyArray = uBusinessPac;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContentWrapper$BusinessPackage._emptyArray;
    }
    public static ClientContentWrapper$BusinessPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContentWrapper$BusinessPackage().mergeFrom(p0);
    }
    public static ClientContentWrapper$BusinessPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContentWrapper$BusinessPackage(), p0);
    }
    public ClientContentWrapper$BusinessPackage clear(){
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
       ClientContentWrapper$BusinessPackage tcustom = this.custom;
       if (tcustom != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tcustom);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContentWrapper$BusinessPackage mergeFrom(CodedInputByteBufferNano p0){
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
                this.custom = new ClientContentWrapper$Custom();
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
       ClientContentWrapper$BusinessPackage tcustom = this.custom;
       if (tcustom != null) {
          p0.writeMessage(2, tcustom);
       }
       super.writeTo(p0);
       return;
    }
}
