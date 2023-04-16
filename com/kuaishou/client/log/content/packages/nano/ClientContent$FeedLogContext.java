package com.kuaishou.client.log.content.packages.nano.ClientContent$FeedLogContext;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$FeedLogContext extends MessageNano	// class@00123d
{
    public String interStExParams;
    public String interStidContainer;
    public static ClientContent$FeedLogContext[] _emptyArray;

    public void ClientContent$FeedLogContext(){
       super();
       this.clear();
    }
    public static ClientContent$FeedLogContext[] emptyArray(){
       if (ClientContent$FeedLogContext._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$FeedLogContext._emptyArray == null) {
             ClientContent$FeedLogContext[] uFeedLogCont = new ClientContent$FeedLogContext[0];
             ClientContent$FeedLogContext._emptyArray = uFeedLogCont;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$FeedLogContext._emptyArray;
    }
    public static ClientContent$FeedLogContext parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$FeedLogContext().mergeFrom(p0);
    }
    public static ClientContent$FeedLogContext parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$FeedLogContext(), p0);
    }
    public ClientContent$FeedLogContext clear(){
       this.interStidContainer = "";
       this.interStExParams = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.interStidContainer).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.interStidContainer);
       }
       if (!(this.interStExParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.interStExParams);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$FeedLogContext mergeFrom(CodedInputByteBufferNano p0){
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
                this.interStExParams = p0.readString();
             }
          }else {
             this.interStidContainer = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.interStidContainer).equals(str)) {
          p0.writeString(1, this.interStidContainer);
       }
       if (!(this.interStExParams).equals(str)) {
          p0.writeString(2, this.interStExParams);
       }
       super.writeTo(p0);
       return;
    }
}
