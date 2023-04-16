package com.kuaishou.socket.nano.SocketMessages$CSError;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SocketMessages$CSError extends MessageNano	// class@000f3c
{
    public int code;
    public static SocketMessages$CSError[] _emptyArray;

    public void SocketMessages$CSError(){
       super();
       this.clear();
    }
    public static SocketMessages$CSError[] emptyArray(){
       if (SocketMessages$CSError._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SocketMessages$CSError._emptyArray == null) {
             SocketMessages$CSError[] uCSErrorArra = new SocketMessages$CSError[0];
             SocketMessages$CSError._emptyArray = uCSErrorArra;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SocketMessages$CSError._emptyArray;
    }
    public static SocketMessages$CSError parseFrom(CodedInputByteBufferNano p0){
       return new SocketMessages$CSError().mergeFrom(p0);
    }
    public static SocketMessages$CSError parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SocketMessages$CSError(), p0);
    }
    public SocketMessages$CSError clear(){
       this.code = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SocketMessages$CSError tcode = this.code;
       if (tcode != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tcode);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SocketMessages$CSError mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             this.code = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SocketMessages$CSError tcode = this.code;
       if (tcode != null) {
          p0.writeUInt32(1, tcode);
       }
       super.writeTo(p0);
       return;
    }
}
