package com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$LiveQuiz2OptionWithStat;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$LiveQuiz2OptionModel;

public final class LiveQuiz2Proto$LiveQuiz2OptionWithStat extends MessageNano	// class@000ce7
{
    public LiveQuiz2Proto$LiveQuiz2OptionModel option;
    public String voteCount;
    public float voteRate;
    public static LiveQuiz2Proto$LiveQuiz2OptionWithStat[] _emptyArray;

    public void LiveQuiz2Proto$LiveQuiz2OptionWithStat(){
       super();
       this.clear();
    }
    public static LiveQuiz2Proto$LiveQuiz2OptionWithStat[] emptyArray(){
       if (LiveQuiz2Proto$LiveQuiz2OptionWithStat._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveQuiz2Proto$LiveQuiz2OptionWithStat._emptyArray == null) {
             LiveQuiz2Proto$LiveQuiz2OptionWithStat[] liveQuiz2Opt = new LiveQuiz2Proto$LiveQuiz2OptionWithStat[0];
             LiveQuiz2Proto$LiveQuiz2OptionWithStat._emptyArray = liveQuiz2Opt;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveQuiz2Proto$LiveQuiz2OptionWithStat._emptyArray;
    }
    public static LiveQuiz2Proto$LiveQuiz2OptionWithStat parseFrom(CodedInputByteBufferNano p0){
       return new LiveQuiz2Proto$LiveQuiz2OptionWithStat().mergeFrom(p0);
    }
    public static LiveQuiz2Proto$LiveQuiz2OptionWithStat parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveQuiz2Proto$LiveQuiz2OptionWithStat(), p0);
    }
    public LiveQuiz2Proto$LiveQuiz2OptionWithStat clear(){
       this.option = null;
       this.voteRate = 0;
       this.voteCount = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveQuiz2Proto$LiveQuiz2OptionWithStat toption = this.option;
       if (toption != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, toption);
       }
       if (Float.floatToIntBits(this.voteRate) != Float.floatToIntBits(0)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(2, this.voteRate);
       }
       if (!(this.voteCount).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.voteCount);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveQuiz2Proto$LiveQuiz2OptionWithStat mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 21) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.voteCount = p0.readString();
                }
             }else {
                this.voteRate = p0.readFloat();
             }
          }else if(this.option == null){
             this.option = new LiveQuiz2Proto$LiveQuiz2OptionModel();
          }
          p0.readMessage(this.option);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveQuiz2Proto$LiveQuiz2OptionWithStat toption = this.option;
       if (toption != null) {
          p0.writeMessage(1, toption);
       }
       if (Float.floatToIntBits(this.voteRate) != Float.floatToIntBits(0)) {
          p0.writeFloat(2, this.voteRate);
       }
       if (!(this.voteCount).equals("")) {
          p0.writeString(3, this.voteCount);
       }
       super.writeTo(p0);
       return;
    }
}
