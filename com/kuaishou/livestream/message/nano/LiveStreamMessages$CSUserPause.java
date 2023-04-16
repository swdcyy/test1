package com.kuaishou.livestream.message.nano.LiveStreamMessages$CSUserPause;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$CSUserPause extends MessageNano	// class@0012c5
{
    public int pauseType;
    public long time;
    public static LiveStreamMessages$CSUserPause[] _emptyArray;

    public void LiveStreamMessages$CSUserPause(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$CSUserPause[] emptyArray(){
       if (LiveStreamMessages$CSUserPause._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$CSUserPause._emptyArray == null) {
             LiveStreamMessages$CSUserPause[] uCSUserPause = new LiveStreamMessages$CSUserPause[0];
             LiveStreamMessages$CSUserPause._emptyArray = uCSUserPause;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$CSUserPause._emptyArray;
    }
    public static LiveStreamMessages$CSUserPause parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$CSUserPause().mergeFrom(p0);
    }
    public static LiveStreamMessages$CSUserPause parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$CSUserPause(), p0);
    }
    public LiveStreamMessages$CSUserPause clear(){
       this.time = 0;
       this.pauseType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$CSUserPause ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       ttime = this.pauseType;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$CSUserPause mergeFrom(CodedInputByteBufferNano p0){
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
                   this.pauseType = i;
                }
             }
          }else {
             this.time = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$CSUserPause ttime = this.time;
       if (ttime) {
          p0.writeUInt64(1, ttime);
       }
       ttime = this.pauseType;
       if (ttime != null) {
          p0.writeInt32(2, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
