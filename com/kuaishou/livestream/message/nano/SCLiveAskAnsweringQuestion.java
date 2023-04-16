package com.kuaishou.livestream.message.nano.SCLiveAskAnsweringQuestion;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.Question;

public final class SCLiveAskAnsweringQuestion extends MessageNano	// class@001403
{
    public Question answeringQuestion;
    public String askId;
    public static SCLiveAskAnsweringQuestion[] _emptyArray;

    public void SCLiveAskAnsweringQuestion(){
       super();
       this.clear();
    }
    public static SCLiveAskAnsweringQuestion[] emptyArray(){
       if (SCLiveAskAnsweringQuestion._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveAskAnsweringQuestion._emptyArray == null) {
             SCLiveAskAnsweringQuestion[] sCLiveAskAns = new SCLiveAskAnsweringQuestion[0];
             SCLiveAskAnsweringQuestion._emptyArray = sCLiveAskAns;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveAskAnsweringQuestion._emptyArray;
    }
    public static SCLiveAskAnsweringQuestion parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveAskAnsweringQuestion().mergeFrom(p0);
    }
    public static SCLiveAskAnsweringQuestion parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveAskAnsweringQuestion(), p0);
    }
    public SCLiveAskAnsweringQuestion clear(){
       this.askId = "";
       this.answeringQuestion = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.askId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.askId);
       }
       SCLiveAskAnsweringQuestion tansweringQu = this.answeringQuestion;
       if (tansweringQu != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tansweringQu);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveAskAnsweringQuestion mergeFrom(CodedInputByteBufferNano p0){
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
             }else if(this.answeringQuestion == null){
                this.answeringQuestion = new Question();
             }
             p0.readMessage(this.answeringQuestion);
          }else {
             this.askId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.askId).equals("")) {
          p0.writeString(1, this.askId);
       }
       SCLiveAskAnsweringQuestion tansweringQu = this.answeringQuestion;
       if (tansweringQu != null) {
          p0.writeMessage(2, tansweringQu);
       }
       super.writeTo(p0);
       return;
    }
}
