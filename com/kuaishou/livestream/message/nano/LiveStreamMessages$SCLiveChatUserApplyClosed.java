package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveChatUserApplyClosed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCLiveChatUserApplyClosed extends MessageNano	// class@001341
{
    public long time;
    public static LiveStreamMessages$SCLiveChatUserApplyClosed[] _emptyArray;

    public void LiveStreamMessages$SCLiveChatUserApplyClosed(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCLiveChatUserApplyClosed[] emptyArray(){
       if (LiveStreamMessages$SCLiveChatUserApplyClosed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCLiveChatUserApplyClosed._emptyArray == null) {
             LiveStreamMessages$SCLiveChatUserApplyClosed[] sCLiveChatUs = new LiveStreamMessages$SCLiveChatUserApplyClosed[0];
             LiveStreamMessages$SCLiveChatUserApplyClosed._emptyArray = sCLiveChatUs;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCLiveChatUserApplyClosed._emptyArray;
    }
    public static LiveStreamMessages$SCLiveChatUserApplyClosed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCLiveChatUserApplyClosed().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCLiveChatUserApplyClosed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCLiveChatUserApplyClosed(), p0);
    }
    public LiveStreamMessages$SCLiveChatUserApplyClosed clear(){
       this.time = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCLiveChatUserApplyClosed ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCLiveChatUserApplyClosed mergeFrom(CodedInputByteBufferNano p0){
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
       LiveStreamMessages$SCLiveChatUserApplyClosed ttime = this.time;
       if (ttime) {
          p0.writeUInt64(1, ttime);
       }
       super.writeTo(p0);
       return;
    }
}