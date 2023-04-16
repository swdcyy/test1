package com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$LiveQuiz2OptionModel;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveQuiz2Proto$LiveQuiz2OptionModel extends MessageNano	// class@000ce6
{
    public String body;
    public String id;
    public static LiveQuiz2Proto$LiveQuiz2OptionModel[] _emptyArray;

    public void LiveQuiz2Proto$LiveQuiz2OptionModel(){
       super();
       this.clear();
    }
    public static LiveQuiz2Proto$LiveQuiz2OptionModel[] emptyArray(){
       if (LiveQuiz2Proto$LiveQuiz2OptionModel._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveQuiz2Proto$LiveQuiz2OptionModel._emptyArray == null) {
             LiveQuiz2Proto$LiveQuiz2OptionModel[] liveQuiz2Opt = new LiveQuiz2Proto$LiveQuiz2OptionModel[0];
             LiveQuiz2Proto$LiveQuiz2OptionModel._emptyArray = liveQuiz2Opt;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveQuiz2Proto$LiveQuiz2OptionModel._emptyArray;
    }
    public static LiveQuiz2Proto$LiveQuiz2OptionModel parseFrom(CodedInputByteBufferNano p0){
       return new LiveQuiz2Proto$LiveQuiz2OptionModel().mergeFrom(p0);
    }
    public static LiveQuiz2Proto$LiveQuiz2OptionModel parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveQuiz2Proto$LiveQuiz2OptionModel(), p0);
    }
    public LiveQuiz2Proto$LiveQuiz2OptionModel clear(){
       this.id = "";
       this.body = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       if (!(this.body).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.body);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveQuiz2Proto$LiveQuiz2OptionModel mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.body = p0.readString();
             }
          }else {
             this.id = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.id).equals(str)) {
          p0.writeString(1, this.id);
       }
       if (!(this.body).equals(str)) {
          p0.writeString(2, this.body);
       }
       super.writeTo(p0);
       return;
    }
}
