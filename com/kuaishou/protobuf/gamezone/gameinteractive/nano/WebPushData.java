package com.kuaishou.protobuf.gamezone.gameinteractive.nano.WebPushData;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class WebPushData extends MessageNano	// class@000bbe
{
    public String command;
    public String data;
    public long timestamp;
    public static WebPushData[] _emptyArray;

    public void WebPushData(){
       super();
       this.clear();
    }
    public static WebPushData[] emptyArray(){
       if (WebPushData._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (WebPushData._emptyArray == null) {
             WebPushData[] webPushDataA = new WebPushData[0];
             WebPushData._emptyArray = webPushDataA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return WebPushData._emptyArray;
    }
    public static WebPushData parseFrom(CodedInputByteBufferNano p0){
       return new WebPushData().mergeFrom(p0);
    }
    public static WebPushData parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new WebPushData(), p0);
    }
    public WebPushData clear(){
       this.command = "";
       this.timestamp = 0;
       this.data = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.command).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.command);
       }
       WebPushData ttimestamp = this.timestamp;
       if (ttimestamp) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttimestamp);
       }
       if (!(this.data).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.data);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public WebPushData mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.data = p0.readString();
                }
             }else {
                this.timestamp = p0.readUInt64();
             }
          }else {
             this.command = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.command).equals(str)) {
          p0.writeString(1, this.command);
       }
       WebPushData ttimestamp = this.timestamp;
       if (ttimestamp) {
          p0.writeUInt64(2, ttimestamp);
       }
       if (!(this.data).equals(str)) {
          p0.writeString(3, this.data);
       }
       super.writeTo(p0);
       return;
    }
}
