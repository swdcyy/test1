package com.kuaishou.socket.nano.SocketMessages$CSPing;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SocketMessages$CSPing extends MessageNano	// class@000f3f
{
    public String appVer;
    public int clientId;
    public String deviceId;
    public String echoData;
    public static SocketMessages$CSPing[] _emptyArray;

    public void SocketMessages$CSPing(){
       super();
       this.clear();
    }
    public static SocketMessages$CSPing[] emptyArray(){
       if (SocketMessages$CSPing._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SocketMessages$CSPing._emptyArray == null) {
             SocketMessages$CSPing[] uCSPingArray = new SocketMessages$CSPing[0];
             SocketMessages$CSPing._emptyArray = uCSPingArray;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SocketMessages$CSPing._emptyArray;
    }
    public static SocketMessages$CSPing parseFrom(CodedInputByteBufferNano p0){
       return new SocketMessages$CSPing().mergeFrom(p0);
    }
    public static SocketMessages$CSPing parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SocketMessages$CSPing(), p0);
    }
    public SocketMessages$CSPing clear(){
       this.echoData = "";
       this.clientId = 0;
       this.deviceId = "";
       this.appVer = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.echoData).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.echoData);
       }
       SocketMessages$CSPing tclientId = this.clientId;
       if (tclientId != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tclientId);
       }
       if (!(this.deviceId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.deviceId);
       }
       if (!(this.appVer).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.appVer);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SocketMessages$CSPing mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.appVer = p0.readString();
                   }
                }else {
                   this.deviceId = p0.readString();
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && (i != 6 && (i != 13 && (i != 8 && (i != 9 && (i != 22 && i != 23))))))))) {
                   continue ;
                }else {
                   this.clientId = i;
                }
             }
          }else {
             this.echoData = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.echoData).equals(str)) {
          p0.writeString(1, this.echoData);
       }
       SocketMessages$CSPing tclientId = this.clientId;
       if (tclientId != null) {
          p0.writeInt32(2, tclientId);
       }
       if (!(this.deviceId).equals(str)) {
          p0.writeString(3, this.deviceId);
       }
       if (!(this.appVer).equals(str)) {
          p0.writeString(4, this.appVer);
       }
       super.writeTo(p0);
       return;
    }
}
