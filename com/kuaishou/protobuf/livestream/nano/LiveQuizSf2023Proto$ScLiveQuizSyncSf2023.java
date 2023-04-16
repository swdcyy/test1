package com.kuaishou.protobuf.livestream.nano.LiveQuizSf2023Proto$ScLiveQuizSyncSf2023;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveQuizSf2023Proto$ScLiveQuizSyncSf2023 extends MessageNano	// class@000d04
{
    public long apiDelayDurationMs;
    public static LiveQuizSf2023Proto$ScLiveQuizSyncSf2023[] _emptyArray;

    public void LiveQuizSf2023Proto$ScLiveQuizSyncSf2023(){
       super();
       this.clear();
    }
    public static LiveQuizSf2023Proto$ScLiveQuizSyncSf2023[] emptyArray(){
       if (LiveQuizSf2023Proto$ScLiveQuizSyncSf2023._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveQuizSf2023Proto$ScLiveQuizSyncSf2023._emptyArray == null) {
             LiveQuizSf2023Proto$ScLiveQuizSyncSf2023[] scLiveQuizSy = new LiveQuizSf2023Proto$ScLiveQuizSyncSf2023[0];
             LiveQuizSf2023Proto$ScLiveQuizSyncSf2023._emptyArray = scLiveQuizSy;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveQuizSf2023Proto$ScLiveQuizSyncSf2023._emptyArray;
    }
    public static LiveQuizSf2023Proto$ScLiveQuizSyncSf2023 parseFrom(CodedInputByteBufferNano p0){
       return new LiveQuizSf2023Proto$ScLiveQuizSyncSf2023().mergeFrom(p0);
    }
    public static LiveQuizSf2023Proto$ScLiveQuizSyncSf2023 parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveQuizSf2023Proto$ScLiveQuizSyncSf2023(), p0);
    }
    public LiveQuizSf2023Proto$ScLiveQuizSyncSf2023 clear(){
       this.apiDelayDurationMs = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveQuizSf2023Proto$ScLiveQuizSyncSf2023 tapiDelayDur = this.apiDelayDurationMs;
       if (tapiDelayDur) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tapiDelayDur);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveQuizSf2023Proto$ScLiveQuizSyncSf2023 mergeFrom(CodedInputByteBufferNano p0){
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
             this.apiDelayDurationMs = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveQuizSf2023Proto$ScLiveQuizSyncSf2023 tapiDelayDur = this.apiDelayDurationMs;
       if (tapiDelayDur) {
          p0.writeUInt64(1, tapiDelayDur);
       }
       super.writeTo(p0);
       return;
    }
}
