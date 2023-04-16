package com.kuaishou.socket.nano.SocketMessages$SCError;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class SocketMessages$SCError extends MessageNano	// class@000f43
{
    public int code;
    public long maxDelayMs;
    public long minDelayMs;
    public String msg;
    public int subCode;
    public static SocketMessages$SCError[] _emptyArray;

    public void SocketMessages$SCError(){
       super();
       this.clear();
    }
    public static SocketMessages$SCError[] emptyArray(){
       if (SocketMessages$SCError._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SocketMessages$SCError._emptyArray == null) {
             SocketMessages$SCError[] sCErrorArray = new SocketMessages$SCError[0];
             SocketMessages$SCError._emptyArray = sCErrorArray;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SocketMessages$SCError._emptyArray;
    }
    public static SocketMessages$SCError parseFrom(CodedInputByteBufferNano p0){
       return new SocketMessages$SCError().mergeFrom(p0);
    }
    public static SocketMessages$SCError parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SocketMessages$SCError(), p0);
    }
    public SocketMessages$SCError clear(){
       this.code = 0;
       this.msg = "";
       this.subCode = 0;
       this.minDelayMs = 0;
       this.maxDelayMs = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SocketMessages$SCError tcode = this.code;
       if (tcode != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tcode);
       }
       if (!(this.msg).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.msg);
       }
       tcode = this.subCode;
       if (tcode != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tcode);
       }
       tcode = this.minDelayMs;
       int i1 = 0;
       if (tcode - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tcode);
       }
       tcode = this.maxDelayMs;
       if (tcode - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tcode);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SocketMessages$SCError mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.maxDelayMs = p0.readUInt64();
                      }
                   }else {
                      this.minDelayMs = p0.readUInt64();
                   }
                }else {
                   this.subCode = p0.readUInt32();
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
       SocketMessages$SCError tcode = this.code;
       if (tcode != null) {
          p0.writeUInt32(1, tcode);
       }
       if (!(this.msg).equals("")) {
          p0.writeString(2, this.msg);
       }
       tcode = this.subCode;
       if (tcode != null) {
          p0.writeUInt32(3, tcode);
       }
       tcode = this.minDelayMs;
       int i = 0;
       if (tcode - i) {
          p0.writeUInt64(4, tcode);
       }
       tcode = this.maxDelayMs;
       if (tcode - i) {
          p0.writeUInt64(5, tcode);
       }
       super.writeTo(p0);
       return;
    }
}
