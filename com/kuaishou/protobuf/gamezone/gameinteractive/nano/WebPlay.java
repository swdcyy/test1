package com.kuaishou.protobuf.gamezone.gameinteractive.nano.WebPlay;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class WebPlay extends MessageNano	// class@000bbd
{
    public String url;
    public static WebPlay[] _emptyArray;

    public void WebPlay(){
       super();
       this.clear();
    }
    public static WebPlay[] emptyArray(){
       if (WebPlay._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (WebPlay._emptyArray == null) {
             WebPlay[] webPlayArray = new WebPlay[0];
             WebPlay._emptyArray = webPlayArray;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return WebPlay._emptyArray;
    }
    public static WebPlay parseFrom(CodedInputByteBufferNano p0){
       return new WebPlay().mergeFrom(p0);
    }
    public static WebPlay parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new WebPlay(), p0);
    }
    public WebPlay clear(){
       this.url = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.url).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.url);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public WebPlay mergeFrom(CodedInputByteBufferNano p0){
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
             this.url = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.url).equals("")) {
          p0.writeString(1, this.url);
       }
       super.writeTo(p0);
       return;
    }
}
