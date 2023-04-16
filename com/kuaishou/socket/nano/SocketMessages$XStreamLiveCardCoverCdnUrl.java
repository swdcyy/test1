package com.kuaishou.socket.nano.SocketMessages$XStreamLiveCardCoverCdnUrl;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SocketMessages$XStreamLiveCardCoverCdnUrl extends MessageNano	// class@000f4e
{
    public String cdn;
    public String url;
    public static SocketMessages$XStreamLiveCardCoverCdnUrl[] _emptyArray;

    public void SocketMessages$XStreamLiveCardCoverCdnUrl(){
       super();
       this.clear();
    }
    public static SocketMessages$XStreamLiveCardCoverCdnUrl[] emptyArray(){
       if (SocketMessages$XStreamLiveCardCoverCdnUrl._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SocketMessages$XStreamLiveCardCoverCdnUrl._emptyArray == null) {
             SocketMessages$XStreamLiveCardCoverCdnUrl[] xStreamLiveC = new SocketMessages$XStreamLiveCardCoverCdnUrl[0];
             SocketMessages$XStreamLiveCardCoverCdnUrl._emptyArray = xStreamLiveC;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SocketMessages$XStreamLiveCardCoverCdnUrl._emptyArray;
    }
    public static SocketMessages$XStreamLiveCardCoverCdnUrl parseFrom(CodedInputByteBufferNano p0){
       return new SocketMessages$XStreamLiveCardCoverCdnUrl().mergeFrom(p0);
    }
    public static SocketMessages$XStreamLiveCardCoverCdnUrl parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SocketMessages$XStreamLiveCardCoverCdnUrl(), p0);
    }
    public SocketMessages$XStreamLiveCardCoverCdnUrl clear(){
       this.cdn = "";
       this.url = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.cdn).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.cdn);
       }
       if (!(this.url).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.url);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SocketMessages$XStreamLiveCardCoverCdnUrl mergeFrom(CodedInputByteBufferNano p0){
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
                this.url = p0.readString();
             }
          }else {
             this.cdn = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.cdn).equals(str)) {
          p0.writeString(1, this.cdn);
       }
       if (!(this.url).equals(str)) {
          p0.writeString(2, this.url);
       }
       super.writeTo(p0);
       return;
    }
}
