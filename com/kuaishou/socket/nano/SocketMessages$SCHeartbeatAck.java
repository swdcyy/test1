package com.kuaishou.socket.nano.SocketMessages$SCHeartbeatAck;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SocketMessages$SCHeartbeatAck extends MessageNano	// class@000f44
{
    public long clientTimestamp;
    public long timestamp;
    public static SocketMessages$SCHeartbeatAck[] _emptyArray;

    public void SocketMessages$SCHeartbeatAck(){
       super();
       this.clear();
    }
    public static SocketMessages$SCHeartbeatAck[] emptyArray(){
       if (SocketMessages$SCHeartbeatAck._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SocketMessages$SCHeartbeatAck._emptyArray == null) {
             SocketMessages$SCHeartbeatAck[] sCHeartbeatA = new SocketMessages$SCHeartbeatAck[0];
             SocketMessages$SCHeartbeatAck._emptyArray = sCHeartbeatA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SocketMessages$SCHeartbeatAck._emptyArray;
    }
    public static SocketMessages$SCHeartbeatAck parseFrom(CodedInputByteBufferNano p0){
       return new SocketMessages$SCHeartbeatAck().mergeFrom(p0);
    }
    public static SocketMessages$SCHeartbeatAck parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SocketMessages$SCHeartbeatAck(), p0);
    }
    public SocketMessages$SCHeartbeatAck clear(){
       this.timestamp = 0;
       this.clientTimestamp = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SocketMessages$SCHeartbeatAck ttimestamp = this.timestamp;
       int i1 = 0;
       if (ttimestamp - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttimestamp);
       }
       ttimestamp = this.clientTimestamp;
       if (ttimestamp - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttimestamp);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SocketMessages$SCHeartbeatAck mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.clientTimestamp = p0.readUInt64();
             }
          }else {
             this.timestamp = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SocketMessages$SCHeartbeatAck ttimestamp = this.timestamp;
       int i = 0;
       if (ttimestamp - i) {
          p0.writeUInt64(1, ttimestamp);
       }
       ttimestamp = this.clientTimestamp;
       if (ttimestamp - i) {
          p0.writeUInt64(2, ttimestamp);
       }
       super.writeTo(p0);
       return;
    }
}
