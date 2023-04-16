package com.kuaishou.protobuf.livestream.nano.LiveQuizSf2023Proto$QuizCardSf2023$QuizOption;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveQuizSf2023Proto$QuizCardSf2023$QuizOption extends MessageNano	// class@000d00
{
    public String optionContent;
    public int optionId;
    public static LiveQuizSf2023Proto$QuizCardSf2023$QuizOption[] _emptyArray;

    public void LiveQuizSf2023Proto$QuizCardSf2023$QuizOption(){
       super();
       this.clear();
    }
    public static LiveQuizSf2023Proto$QuizCardSf2023$QuizOption[] emptyArray(){
       if (LiveQuizSf2023Proto$QuizCardSf2023$QuizOption._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveQuizSf2023Proto$QuizCardSf2023$QuizOption._emptyArray == null) {
             LiveQuizSf2023Proto$QuizCardSf2023$QuizOption[] quizCardSf20 = new LiveQuizSf2023Proto$QuizCardSf2023$QuizOption[0];
             LiveQuizSf2023Proto$QuizCardSf2023$QuizOption._emptyArray = quizCardSf20;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveQuizSf2023Proto$QuizCardSf2023$QuizOption._emptyArray;
    }
    public static LiveQuizSf2023Proto$QuizCardSf2023$QuizOption parseFrom(CodedInputByteBufferNano p0){
       return new LiveQuizSf2023Proto$QuizCardSf2023$QuizOption().mergeFrom(p0);
    }
    public static LiveQuizSf2023Proto$QuizCardSf2023$QuizOption parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveQuizSf2023Proto$QuizCardSf2023$QuizOption(), p0);
    }
    public LiveQuizSf2023Proto$QuizCardSf2023$QuizOption clear(){
       this.optionId = 0;
       this.optionContent = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveQuizSf2023Proto$QuizCardSf2023$QuizOption toptionId = this.optionId;
       if (toptionId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, toptionId);
       }
       if (!(this.optionContent).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.optionContent);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveQuizSf2023Proto$QuizCardSf2023$QuizOption mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.optionContent = p0.readString();
             }
          }else {
             this.optionId = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveQuizSf2023Proto$QuizCardSf2023$QuizOption toptionId = this.optionId;
       if (toptionId != null) {
          p0.writeUInt32(1, toptionId);
       }
       if (!(this.optionContent).equals("")) {
          p0.writeString(2, this.optionContent);
       }
       super.writeTo(p0);
       return;
    }
}
