package com.kuaishou.socket.nano.SocketMessages$PSHostInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SocketMessages$PSHostInfo extends MessageNano	// class@000f40
{
    public String ip;
    public int port;
    public static SocketMessages$PSHostInfo[] _emptyArray;

    public void SocketMessages$PSHostInfo(){
       super();
       this.clear();
    }
    public static SocketMessages$PSHostInfo[] emptyArray(){
       if (SocketMessages$PSHostInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SocketMessages$PSHostInfo._emptyArray == null) {
             SocketMessages$PSHostInfo[] pSHostInfoAr = new SocketMessages$PSHostInfo[0];
             SocketMessages$PSHostInfo._emptyArray = pSHostInfoAr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SocketMessages$PSHostInfo._emptyArray;
    }
    public static SocketMessages$PSHostInfo parseFrom(CodedInputByteBufferNano p0){
       return new SocketMessages$PSHostInfo().mergeFrom(p0);
    }
    public static SocketMessages$PSHostInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SocketMessages$PSHostInfo(), p0);
    }
    public SocketMessages$PSHostInfo clear(){
       this.ip = "";
       this.port = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.ip).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.ip);
       }
       SocketMessages$PSHostInfo tport = this.port;
       if (tport != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tport);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SocketMessages$PSHostInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.port = p0.readInt32();
             }
          }else {
             this.ip = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.ip).equals("")) {
          p0.writeString(1, this.ip);
       }
       SocketMessages$PSHostInfo tport = this.port;
       if (tport != null) {
          p0.writeInt32(2, tport);
       }
       super.writeTo(p0);
       return;
    }
}
