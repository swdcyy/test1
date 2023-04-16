package com.kuaishou.client.log.content.packages.nano.ClientContent$ImportOriginVideoPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$VideoSegmentPackage;

public final class ClientContent$ImportOriginVideoPackage extends MessageNano	// class@00125a
{
    public ClientContent$VideoSegmentPackage originVideoPackage;
    public static ClientContent$ImportOriginVideoPackage[] _emptyArray;

    public void ClientContent$ImportOriginVideoPackage(){
       super();
       this.clear();
    }
    public static ClientContent$ImportOriginVideoPackage[] emptyArray(){
       if (ClientContent$ImportOriginVideoPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$ImportOriginVideoPackage._emptyArray == null) {
             ClientContent$ImportOriginVideoPackage[] importOrigin = new ClientContent$ImportOriginVideoPackage[0];
             ClientContent$ImportOriginVideoPackage._emptyArray = importOrigin;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$ImportOriginVideoPackage._emptyArray;
    }
    public static ClientContent$ImportOriginVideoPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$ImportOriginVideoPackage().mergeFrom(p0);
    }
    public static ClientContent$ImportOriginVideoPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$ImportOriginVideoPackage(), p0);
    }
    public ClientContent$ImportOriginVideoPackage clear(){
       this.originVideoPackage = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$ImportOriginVideoPackage toriginVideo = this.originVideoPackage;
       if (toriginVideo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, toriginVideo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$ImportOriginVideoPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else if(this.originVideoPackage == null){
             this.originVideoPackage = new ClientContent$VideoSegmentPackage();
          }
          p0.readMessage(this.originVideoPackage);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$ImportOriginVideoPackage toriginVideo = this.originVideoPackage;
       if (toriginVideo != null) {
          p0.writeMessage(1, toriginVideo);
       }
       super.writeTo(p0);
       return;
    }
}
