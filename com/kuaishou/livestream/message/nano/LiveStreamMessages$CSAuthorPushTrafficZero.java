package com.kuaishou.livestream.message.nano.LiveStreamMessages$CSAuthorPushTrafficZero;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$CSAuthorPushTrafficZero extends MessageNano	// class@0012bf
{
    public long time;
    public static LiveStreamMessages$CSAuthorPushTrafficZero[] _emptyArray;

    public void LiveStreamMessages$CSAuthorPushTrafficZero(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$CSAuthorPushTrafficZero[] emptyArray(){
       if (LiveStreamMessages$CSAuthorPushTrafficZero._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$CSAuthorPushTrafficZero._emptyArray == null) {
             LiveStreamMessages$CSAuthorPushTrafficZero[] uCSAuthorPus = new LiveStreamMessages$CSAuthorPushTrafficZero[0];
             LiveStreamMessages$CSAuthorPushTrafficZero._emptyArray = uCSAuthorPus;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$CSAuthorPushTrafficZero._emptyArray;
    }
    public static LiveStreamMessages$CSAuthorPushTrafficZero parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$CSAuthorPushTrafficZero().mergeFrom(p0);
    }
    public static LiveStreamMessages$CSAuthorPushTrafficZero parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$CSAuthorPushTrafficZero(), p0);
    }
    public LiveStreamMessages$CSAuthorPushTrafficZero clear(){
       this.time = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$CSAuthorPushTrafficZero ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$CSAuthorPushTrafficZero mergeFrom(CodedInputByteBufferNano p0){
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
       LiveStreamMessages$CSAuthorPushTrafficZero ttime = this.time;
       if (ttime) {
          p0.writeUInt64(1, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
