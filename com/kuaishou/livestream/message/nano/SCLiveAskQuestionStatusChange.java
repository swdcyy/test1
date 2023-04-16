package com.kuaishou.livestream.message.nano.SCLiveAskQuestionStatusChange;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveAskQuestionStatusChange extends MessageNano	// class@001408
{
    public String askId;
    public String audienceToast;
    public String authorToast;
    public int changeType;
    public String questionId;
    public static SCLiveAskQuestionStatusChange[] _emptyArray;

    public void SCLiveAskQuestionStatusChange(){
       super();
       this.clear();
    }
    public static SCLiveAskQuestionStatusChange[] emptyArray(){
       if (SCLiveAskQuestionStatusChange._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveAskQuestionStatusChange._emptyArray == null) {
             SCLiveAskQuestionStatusChange[] sCLiveAskQue = new SCLiveAskQuestionStatusChange[0];
             SCLiveAskQuestionStatusChange._emptyArray = sCLiveAskQue;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveAskQuestionStatusChange._emptyArray;
    }
    public static SCLiveAskQuestionStatusChange parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveAskQuestionStatusChange().mergeFrom(p0);
    }
    public static SCLiveAskQuestionStatusChange parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveAskQuestionStatusChange(), p0);
    }
    public SCLiveAskQuestionStatusChange clear(){
       this.askId = "";
       this.questionId = "";
       this.changeType = 0;
       this.authorToast = "";
       this.audienceToast = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.askId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.askId);
       }
       if (!(this.questionId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.questionId);
       }
       SCLiveAskQuestionStatusChange tchangeType = this.changeType;
       if (tchangeType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tchangeType);
       }
       if (!(this.authorToast).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.authorToast);
       }
       if (!(this.audienceToast).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.audienceToast);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveAskQuestionStatusChange mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.audienceToast = p0.readString();
                      }
                   }else {
                      this.authorToast = p0.readString();
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && (i != 2 && i != 3))) {
                      continue ;
                   }else {
                      this.changeType = i;
                   }
                }
             }else {
                this.questionId = p0.readString();
             }
          }else {
             this.askId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.askId).equals(str)) {
          p0.writeString(1, this.askId);
       }
       if (!(this.questionId).equals(str)) {
          p0.writeString(2, this.questionId);
       }
       SCLiveAskQuestionStatusChange tchangeType = this.changeType;
       if (tchangeType != null) {
          p0.writeInt32(3, tchangeType);
       }
       if (!(this.authorToast).equals(str)) {
          p0.writeString(4, this.authorToast);
       }
       if (!(this.audienceToast).equals(str)) {
          p0.writeString(5, this.audienceToast);
       }
       super.writeTo(p0);
       return;
    }
}
