package com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$RedPointDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContentWrapper$RedPointDetailPackage extends MessageNano	// class@00133b
{
    public String source;
    public static ClientContentWrapper$RedPointDetailPackage[] _emptyArray;

    public void ClientContentWrapper$RedPointDetailPackage(){
       super();
       this.clear();
    }
    public static ClientContentWrapper$RedPointDetailPackage[] emptyArray(){
       if (ClientContentWrapper$RedPointDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContentWrapper$RedPointDetailPackage._emptyArray == null) {
             ClientContentWrapper$RedPointDetailPackage[] redPointDeta = new ClientContentWrapper$RedPointDetailPackage[0];
             ClientContentWrapper$RedPointDetailPackage._emptyArray = redPointDeta;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContentWrapper$RedPointDetailPackage._emptyArray;
    }
    public static ClientContentWrapper$RedPointDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContentWrapper$RedPointDetailPackage().mergeFrom(p0);
    }
    public static ClientContentWrapper$RedPointDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContentWrapper$RedPointDetailPackage(), p0);
    }
    public ClientContentWrapper$RedPointDetailPackage clear(){
       this.source = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.source).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.source);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContentWrapper$RedPointDetailPackage mergeFrom(CodedInputByteBufferNano p0){
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
             this.source = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.source).equals("")) {
          p0.writeString(1, this.source);
       }
       super.writeTo(p0);
       return;
    }
}
