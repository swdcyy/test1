package com.kuaishou.socket.nano.SocketMessages$CSHeartbeat;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SocketMessages$CSHeartbeat extends MessageNano	// class@000f3e
{
    public int heartbeatType;
    public long timestamp;
    public static SocketMessages$CSHeartbeat[] _emptyArray;

    public void SocketMessages$CSHeartbeat(){
       super();
       this.clear();
    }
    public static SocketMessages$CSHeartbeat[] emptyArray(){
       if (SocketMessages$CSHeartbeat._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SocketMessages$CSHeartbeat._emptyArray == null) {
             SocketMessages$CSHeartbeat[] uCSHeartbeat = new SocketMessages$CSHeartbeat[0];
             SocketMessages$CSHeartbeat._emptyArray = uCSHeartbeat;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SocketMessages$CSHeartbeat._emptyArray;
    }
    public static SocketMessages$CSHeartbeat parseFrom(CodedInputByteBufferNano p0){
       return new SocketMessages$CSHeartbeat().mergeFrom(p0);
    }
    public static SocketMessages$CSHeartbeat parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SocketMessages$CSHeartbeat(), p0);
    }
    public SocketMessages$CSHeartbeat clear(){
       this.timestamp = 0;
       this.heartbeatType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SocketMessages$CSHeartbeat ttimestamp = this.timestamp;
       if (ttimestamp) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttimestamp);
       }
       ttimestamp = this.heartbeatType;
       if (ttimestamp != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, ttimestamp);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SocketMessages$CSHeartbeat mergeFrom(CodedInputByteBufferNano p0){
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
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.heartbeatType = i;
                }
             }
          }else {
             this.timestamp = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SocketMessages$CSHeartbeat ttimestamp = this.timestamp;
       if (ttimestamp) {
          p0.writeUInt64(1, ttimestamp);
       }
       ttimestamp = this.heartbeatType;
       if (ttimestamp != null) {
          p0.writeInt32(2, ttimestamp);
       }
       super.writeTo(p0);
       return;
    }
}
