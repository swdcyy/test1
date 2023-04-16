package com.kuaishou.socket.nano.SocketMessages$SCInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class SocketMessages$SCInfo extends MessageNano	// class@000f45
{
    public int code;
    public String msg;
    public static SocketMessages$SCInfo[] _emptyArray;

    public void SocketMessages$SCInfo(){
       super();
       this.clear();
    }
    public static SocketMessages$SCInfo[] emptyArray(){
       if (SocketMessages$SCInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SocketMessages$SCInfo._emptyArray == null) {
             SocketMessages$SCInfo[] sCInfoArray = new SocketMessages$SCInfo[0];
             SocketMessages$SCInfo._emptyArray = sCInfoArray;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SocketMessages$SCInfo._emptyArray;
    }
    public static SocketMessages$SCInfo parseFrom(CodedInputByteBufferNano p0){
       return new SocketMessages$SCInfo().mergeFrom(p0);
    }
    public static SocketMessages$SCInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SocketMessages$SCInfo(), p0);
    }
    public SocketMessages$SCInfo clear(){
       this.code = 0;
       this.msg = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SocketMessages$SCInfo tcode = this.code;
       if (tcode != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tcode);
       }
       if (!(this.msg).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.msg);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SocketMessages$SCInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.msg = p0.readString();
             }
          }else {
             this.code = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SocketMessages$SCInfo tcode = this.code;
       if (tcode != null) {
          p0.writeUInt32(1, tcode);
       }
       if (!(this.msg).equals("")) {
          p0.writeString(2, this.msg);
       }
       super.writeTo(p0);
       return;
    }
}
