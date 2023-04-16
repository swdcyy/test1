package com.kuaishou.protobuf.livestream.nano.LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCloseCny2023;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCloseCny2023 extends MessageNano	// class@000c84
{
    public long timestamp;
    public static LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCloseCny2023[] _emptyArray;

    public void LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCloseCny2023(){
       super();
       this.clear();
    }
    public static LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCloseCny2023[] emptyArray(){
       if (LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCloseCny2023._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCloseCny2023._emptyArray == null) {
             LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCloseCny2023[] sCLiveFollow = new LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCloseCny2023[0];
             LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCloseCny2023._emptyArray = sCLiveFollow;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCloseCny2023._emptyArray;
    }
    public static LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCloseCny2023 parseFrom(CodedInputByteBufferNano p0){
       return new LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCloseCny2023().mergeFrom(p0);
    }
    public static LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCloseCny2023 parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCloseCny2023(), p0);
    }
    public LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCloseCny2023 clear(){
       this.timestamp = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCloseCny2023 ttimestamp = this.timestamp;
       if (ttimestamp) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttimestamp);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCloseCny2023 mergeFrom(CodedInputByteBufferNano p0){
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
       LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCloseCny2023 ttimestamp = this.timestamp;
       if (ttimestamp) {
          p0.writeUInt64(1, ttimestamp);
       }
       super.writeTo(p0);
       return;
    }
}
