package com.kuaishou.protobuf.livestream.nano.LiveQuizSf2023Proto$LiveQuizAacSyncSf2023;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveQuizSf2023Proto$LiveQuizAacSyncSf2023 extends MessageNano	// class@000cfd
{
    public long apiDelayDurationMs;
    public long index;
    public String quizId;
    public int type;
    public static LiveQuizSf2023Proto$LiveQuizAacSyncSf2023[] _emptyArray;

    public void LiveQuizSf2023Proto$LiveQuizAacSyncSf2023(){
       super();
       this.clear();
    }
    public static LiveQuizSf2023Proto$LiveQuizAacSyncSf2023[] emptyArray(){
       if (LiveQuizSf2023Proto$LiveQuizAacSyncSf2023._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveQuizSf2023Proto$LiveQuizAacSyncSf2023._emptyArray == null) {
             LiveQuizSf2023Proto$LiveQuizAacSyncSf2023[] liveQuizAacS = new LiveQuizSf2023Proto$LiveQuizAacSyncSf2023[0];
             LiveQuizSf2023Proto$LiveQuizAacSyncSf2023._emptyArray = liveQuizAacS;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveQuizSf2023Proto$LiveQuizAacSyncSf2023._emptyArray;
    }
    public static LiveQuizSf2023Proto$LiveQuizAacSyncSf2023 parseFrom(CodedInputByteBufferNano p0){
       return new LiveQuizSf2023Proto$LiveQuizAacSyncSf2023().mergeFrom(p0);
    }
    public static LiveQuizSf2023Proto$LiveQuizAacSyncSf2023 parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveQuizSf2023Proto$LiveQuizAacSyncSf2023(), p0);
    }
    public LiveQuizSf2023Proto$LiveQuizAacSyncSf2023 clear(){
       this.quizId = "";
       this.index = 0;
       this.type = 0;
       this.apiDelayDurationMs = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.quizId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.quizId);
       }
       LiveQuizSf2023Proto$LiveQuizAacSyncSf2023 tindex = this.index;
       int i1 = 0;
       if (tindex - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tindex);
       }
       tindex = this.type;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tindex);
       }
       tindex = this.apiDelayDurationMs;
       if (tindex - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tindex);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveQuizSf2023Proto$LiveQuizAacSyncSf2023 mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.apiDelayDurationMs = p0.readUInt64();
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && (i != 2 && i != 3))) {
                      continue ;
                   }else {
                      this.type = i;
                   }
                }
             }else {
                this.index = p0.readUInt64();
             }
          }else {
             this.quizId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.quizId).equals("")) {
          p0.writeString(1, this.quizId);
       }
       LiveQuizSf2023Proto$LiveQuizAacSyncSf2023 tindex = this.index;
       int i = 0;
       if (tindex - i) {
          p0.writeUInt64(2, tindex);
       }
       tindex = this.type;
       if (tindex != null) {
          p0.writeInt32(3, tindex);
       }
       tindex = this.apiDelayDurationMs;
       if (tindex - i) {
          p0.writeUInt64(4, tindex);
       }
       super.writeTo(p0);
       return;
    }
}
