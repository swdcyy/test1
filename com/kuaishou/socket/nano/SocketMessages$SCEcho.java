package com.kuaishou.socket.nano.SocketMessages$SCEcho;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SocketMessages$SCEcho extends MessageNano	// class@000f42
{
    public String content;
    public static SocketMessages$SCEcho[] _emptyArray;

    public void SocketMessages$SCEcho(){
       super();
       this.clear();
    }
    public static SocketMessages$SCEcho[] emptyArray(){
       if (SocketMessages$SCEcho._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SocketMessages$SCEcho._emptyArray == null) {
             SocketMessages$SCEcho[] sCEchoArray = new SocketMessages$SCEcho[0];
             SocketMessages$SCEcho._emptyArray = sCEchoArray;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SocketMessages$SCEcho._emptyArray;
    }
    public static SocketMessages$SCEcho parseFrom(CodedInputByteBufferNano p0){
       return new SocketMessages$SCEcho().mergeFrom(p0);
    }
    public static SocketMessages$SCEcho parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SocketMessages$SCEcho(), p0);
    }
    public SocketMessages$SCEcho clear(){
       this.content = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.content).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.content);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SocketMessages$SCEcho mergeFrom(CodedInputByteBufferNano p0){
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
             this.content = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.content).equals("")) {
          p0.writeString(1, this.content);
       }
       super.writeTo(p0);
       return;
    }
}
