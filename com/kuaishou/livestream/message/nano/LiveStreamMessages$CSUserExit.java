package com.kuaishou.livestream.message.nano.LiveStreamMessages$CSUserExit;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$CSUserExit extends MessageNano	// class@0012c4
{
    public long time;
    public static LiveStreamMessages$CSUserExit[] _emptyArray;

    public void LiveStreamMessages$CSUserExit(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$CSUserExit[] emptyArray(){
       if (LiveStreamMessages$CSUserExit._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$CSUserExit._emptyArray == null) {
             LiveStreamMessages$CSUserExit[] uCSUserExitA = new LiveStreamMessages$CSUserExit[0];
             LiveStreamMessages$CSUserExit._emptyArray = uCSUserExitA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$CSUserExit._emptyArray;
    }
    public static LiveStreamMessages$CSUserExit parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$CSUserExit().mergeFrom(p0);
    }
    public static LiveStreamMessages$CSUserExit parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$CSUserExit(), p0);
    }
    public LiveStreamMessages$CSUserExit clear(){
       this.time = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$CSUserExit ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$CSUserExit mergeFrom(CodedInputByteBufferNano p0){
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
             this.time = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$CSUserExit ttime = this.time;
       if (ttime) {
          p0.writeUInt64(1, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
