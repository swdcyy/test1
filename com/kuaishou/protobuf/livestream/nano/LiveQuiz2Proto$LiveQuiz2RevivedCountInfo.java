package com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$LiveQuiz2RevivedCountInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Float;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveQuiz2Proto$LiveQuiz2RevivedCountInfo extends MessageNano	// class@000ce8
{
    public String revivedCount;
    public float revivedRate;
    public static LiveQuiz2Proto$LiveQuiz2RevivedCountInfo[] _emptyArray;

    public void LiveQuiz2Proto$LiveQuiz2RevivedCountInfo(){
       super();
       this.clear();
    }
    public static LiveQuiz2Proto$LiveQuiz2RevivedCountInfo[] emptyArray(){
       if (LiveQuiz2Proto$LiveQuiz2RevivedCountInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveQuiz2Proto$LiveQuiz2RevivedCountInfo._emptyArray == null) {
             LiveQuiz2Proto$LiveQuiz2RevivedCountInfo[] liveQuiz2Rev = new LiveQuiz2Proto$LiveQuiz2RevivedCountInfo[0];
             LiveQuiz2Proto$LiveQuiz2RevivedCountInfo._emptyArray = liveQuiz2Rev;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveQuiz2Proto$LiveQuiz2RevivedCountInfo._emptyArray;
    }
    public static LiveQuiz2Proto$LiveQuiz2RevivedCountInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveQuiz2Proto$LiveQuiz2RevivedCountInfo().mergeFrom(p0);
    }
    public static LiveQuiz2Proto$LiveQuiz2RevivedCountInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveQuiz2Proto$LiveQuiz2RevivedCountInfo(), p0);
    }
    public LiveQuiz2Proto$LiveQuiz2RevivedCountInfo clear(){
       this.revivedRate = 0;
       this.revivedCount = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (Float.floatToIntBits(this.revivedRate) != Float.floatToIntBits(0)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(1, this.revivedRate);
       }
       if (!(this.revivedCount).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.revivedCount);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveQuiz2Proto$LiveQuiz2RevivedCountInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 13) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.revivedCount = p0.readString();
             }
          }else {
             this.revivedRate = p0.readFloat();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (Float.floatToIntBits(this.revivedRate) != Float.floatToIntBits(0)) {
          p0.writeFloat(1, this.revivedRate);
       }
       if (!(this.revivedCount).equals("")) {
          p0.writeString(2, this.revivedCount);
       }
       super.writeTo(p0);
       return;
    }
}
