package com.kuaishou.livestream.message.nano.LiveAuthorPauseMessages$SCLiveAuthorEnterBackground;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveAuthorPauseMessages$SCLiveAuthorEnterBackground extends MessageNano	// class@001107
{
    public int pauseType;
    public long timestamp;
    public static LiveAuthorPauseMessages$SCLiveAuthorEnterBackground[] _emptyArray;

    public void LiveAuthorPauseMessages$SCLiveAuthorEnterBackground(){
       super();
       this.clear();
    }
    public static LiveAuthorPauseMessages$SCLiveAuthorEnterBackground[] emptyArray(){
       if (LiveAuthorPauseMessages$SCLiveAuthorEnterBackground._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveAuthorPauseMessages$SCLiveAuthorEnterBackground._emptyArray == null) {
             LiveAuthorPauseMessages$SCLiveAuthorEnterBackground[] sCLiveAuthor = new LiveAuthorPauseMessages$SCLiveAuthorEnterBackground[0];
             LiveAuthorPauseMessages$SCLiveAuthorEnterBackground._emptyArray = sCLiveAuthor;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveAuthorPauseMessages$SCLiveAuthorEnterBackground._emptyArray;
    }
    public static LiveAuthorPauseMessages$SCLiveAuthorEnterBackground parseFrom(CodedInputByteBufferNano p0){
       return new LiveAuthorPauseMessages$SCLiveAuthorEnterBackground().mergeFrom(p0);
    }
    public static LiveAuthorPauseMessages$SCLiveAuthorEnterBackground parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveAuthorPauseMessages$SCLiveAuthorEnterBackground(), p0);
    }
    public LiveAuthorPauseMessages$SCLiveAuthorEnterBackground clear(){
       this.timestamp = 0;
       this.pauseType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveAuthorPauseMessages$SCLiveAuthorEnterBackground ttimestamp = this.timestamp;
       if (ttimestamp) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttimestamp);
       }
       ttimestamp = this.pauseType;
       if (ttimestamp != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, ttimestamp);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveAuthorPauseMessages$SCLiveAuthorEnterBackground mergeFrom(CodedInputByteBufferNano p0){
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
             this.timestamp = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveAuthorPauseMessages$SCLiveAuthorEnterBackground ttimestamp = this.timestamp;
       if (ttimestamp) {
          p0.writeUInt64(1, ttimestamp);
       }
       ttimestamp = this.pauseType;
       if (ttimestamp != null) {
          p0.writeInt32(2, ttimestamp);
       }
       super.writeTo(p0);
       return;
    }
}
