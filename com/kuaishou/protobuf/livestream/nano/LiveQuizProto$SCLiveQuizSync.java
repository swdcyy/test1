package com.kuaishou.protobuf.livestream.nano.LiveQuizProto$SCLiveQuizSync;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveQuizProto$LiveQuizModel;

public final class LiveQuizProto$SCLiveQuizSync extends MessageNano	// class@000cf7
{
    public LiveQuizProto$LiveQuizModel liveQuiz;
    public long maxDelayMillis;
    public int syncType;
    public long time;
    public static LiveQuizProto$SCLiveQuizSync[] _emptyArray;

    public void LiveQuizProto$SCLiveQuizSync(){
       super();
       this.clear();
    }
    public static LiveQuizProto$SCLiveQuizSync[] emptyArray(){
       if (LiveQuizProto$SCLiveQuizSync._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveQuizProto$SCLiveQuizSync._emptyArray == null) {
             LiveQuizProto$SCLiveQuizSync[] sCLiveQuizSy = new LiveQuizProto$SCLiveQuizSync[0];
             LiveQuizProto$SCLiveQuizSync._emptyArray = sCLiveQuizSy;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveQuizProto$SCLiveQuizSync._emptyArray;
    }
    public static LiveQuizProto$SCLiveQuizSync parseFrom(CodedInputByteBufferNano p0){
       return new LiveQuizProto$SCLiveQuizSync().mergeFrom(p0);
    }
    public static LiveQuizProto$SCLiveQuizSync parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveQuizProto$SCLiveQuizSync(), p0);
    }
    public LiveQuizProto$SCLiveQuizSync clear(){
       this.time = 0;
       this.liveQuiz = null;
       this.syncType = 0;
       this.maxDelayMillis = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveQuizProto$SCLiveQuizSync ttime = this.time;
       int i1 = 0;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       ttime = this.liveQuiz;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, ttime);
       }
       ttime = this.syncType;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, ttime);
       }
       ttime = this.maxDelayMillis;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveQuizProto$SCLiveQuizSync mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.maxDelayMillis = p0.readUInt64();
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && i != 2)) {
                      continue ;
                   }else {
                      this.syncType = i;
                   }
                }
             }else if(this.liveQuiz == null){
                this.liveQuiz = new LiveQuizProto$LiveQuizModel();
             }
             p0.readMessage(this.liveQuiz);
          }else {
             this.time = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveQuizProto$SCLiveQuizSync ttime = this.time;
       int i = 0;
       if (ttime - i) {
          p0.writeUInt64(1, ttime);
       }
       ttime = this.liveQuiz;
       if (ttime != null) {
          p0.writeMessage(2, ttime);
       }
       ttime = this.syncType;
       if (ttime != null) {
          p0.writeInt32(3, ttime);
       }
       ttime = this.maxDelayMillis;
       if (ttime - i) {
          p0.writeUInt64(4, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
