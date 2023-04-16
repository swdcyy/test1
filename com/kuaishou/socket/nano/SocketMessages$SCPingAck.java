package com.kuaishou.socket.nano.SocketMessages$SCPingAck;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SocketMessages$SCPingAck extends MessageNano	// class@000f47
{
    public String echoData;
    public static SocketMessages$SCPingAck[] _emptyArray;

    public void SocketMessages$SCPingAck(){
       super();
       this.clear();
    }
    public static SocketMessages$SCPingAck[] emptyArray(){
       if (SocketMessages$SCPingAck._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SocketMessages$SCPingAck._emptyArray == null) {
             SocketMessages$SCPingAck[] sCPingAckArr = new SocketMessages$SCPingAck[0];
             SocketMessages$SCPingAck._emptyArray = sCPingAckArr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SocketMessages$SCPingAck._emptyArray;
    }
    public static SocketMessages$SCPingAck parseFrom(CodedInputByteBufferNano p0){
       return new SocketMessages$SCPingAck().mergeFrom(p0);
    }
    public static SocketMessages$SCPingAck parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SocketMessages$SCPingAck(), p0);
    }
    public SocketMessages$SCPingAck clear(){
       this.echoData = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.echoData).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.echoData);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SocketMessages$SCPingAck mergeFrom(CodedInputByteBufferNano p0){
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
             this.echoData = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.echoData).equals("")) {
          p0.writeString(1, this.echoData);
       }
       super.writeTo(p0);
       return;
    }
}
