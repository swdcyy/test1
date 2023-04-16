package com.kuaishou.livestream.message.nano.LiveAuthorPauseMessages$SCLiveAuthorEnterForeground;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveAuthorPauseMessages$SCLiveAuthorEnterForeground extends MessageNano	// class@001108
{
    public long timestamp;
    public static LiveAuthorPauseMessages$SCLiveAuthorEnterForeground[] _emptyArray;

    public void LiveAuthorPauseMessages$SCLiveAuthorEnterForeground(){
       super();
       this.clear();
    }
    public static LiveAuthorPauseMessages$SCLiveAuthorEnterForeground[] emptyArray(){
       if (LiveAuthorPauseMessages$SCLiveAuthorEnterForeground._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveAuthorPauseMessages$SCLiveAuthorEnterForeground._emptyArray == null) {
             LiveAuthorPauseMessages$SCLiveAuthorEnterForeground[] sCLiveAuthor = new LiveAuthorPauseMessages$SCLiveAuthorEnterForeground[0];
             LiveAuthorPauseMessages$SCLiveAuthorEnterForeground._emptyArray = sCLiveAuthor;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveAuthorPauseMessages$SCLiveAuthorEnterForeground._emptyArray;
    }
    public static LiveAuthorPauseMessages$SCLiveAuthorEnterForeground parseFrom(CodedInputByteBufferNano p0){
       return new LiveAuthorPauseMessages$SCLiveAuthorEnterForeground().mergeFrom(p0);
    }
    public static LiveAuthorPauseMessages$SCLiveAuthorEnterForeground parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveAuthorPauseMessages$SCLiveAuthorEnterForeground(), p0);
    }
    public LiveAuthorPauseMessages$SCLiveAuthorEnterForeground clear(){
       this.timestamp = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveAuthorPauseMessages$SCLiveAuthorEnterForeground ttimestamp = this.timestamp;
       if (ttimestamp) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttimestamp);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveAuthorPauseMessages$SCLiveAuthorEnterForeground mergeFrom(CodedInputByteBufferNano p0){
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
             this.timestamp = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveAuthorPauseMessages$SCLiveAuthorEnterForeground ttimestamp = this.timestamp;
       if (ttimestamp) {
          p0.writeUInt64(1, ttimestamp);
       }
       super.writeTo(p0);
       return;
    }
}
