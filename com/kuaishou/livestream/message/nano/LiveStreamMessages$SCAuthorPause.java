package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCAuthorPause;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCAuthorPause extends MessageNano	// class@001325
{
    public int pauseType;
    public long time;
    public static LiveStreamMessages$SCAuthorPause[] _emptyArray;

    public void LiveStreamMessages$SCAuthorPause(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCAuthorPause[] emptyArray(){
       if (LiveStreamMessages$SCAuthorPause._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCAuthorPause._emptyArray == null) {
             LiveStreamMessages$SCAuthorPause[] sCAuthorPaus = new LiveStreamMessages$SCAuthorPause[0];
             LiveStreamMessages$SCAuthorPause._emptyArray = sCAuthorPaus;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCAuthorPause._emptyArray;
    }
    public static LiveStreamMessages$SCAuthorPause parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCAuthorPause().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCAuthorPause parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCAuthorPause(), p0);
    }
    public LiveStreamMessages$SCAuthorPause clear(){
       this.time = 0;
       this.pauseType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCAuthorPause ttime = this.time;
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
    public LiveStreamMessages$SCAuthorPause mergeFrom(CodedInputByteBufferNano p0){
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
       LiveStreamMessages$SCAuthorPause ttime = this.time;
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
