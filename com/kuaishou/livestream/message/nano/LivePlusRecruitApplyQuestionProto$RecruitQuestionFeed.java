package com.kuaishou.livestream.message.nano.LivePlusRecruitApplyQuestionProto$RecruitQuestionFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LivePlusRecruitApplyQuestionProto$RecruitQuestionFeed extends MessageNano	// class@001233
{
    public String buttonContent;
    public String buttonRouter;
    public String content;
    public String prefix;
    public static LivePlusRecruitApplyQuestionProto$RecruitQuestionFeed[] _emptyArray;

    public void LivePlusRecruitApplyQuestionProto$RecruitQuestionFeed(){
       super();
       this.clear();
    }
    public static LivePlusRecruitApplyQuestionProto$RecruitQuestionFeed[] emptyArray(){
       if (LivePlusRecruitApplyQuestionProto$RecruitQuestionFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePlusRecruitApplyQuestionProto$RecruitQuestionFeed._emptyArray == null) {
             LivePlusRecruitApplyQuestionProto$RecruitQuestionFeed[] recruitQuest = new LivePlusRecruitApplyQuestionProto$RecruitQuestionFeed[0];
             LivePlusRecruitApplyQuestionProto$RecruitQuestionFeed._emptyArray = recruitQuest;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePlusRecruitApplyQuestionProto$RecruitQuestionFeed._emptyArray;
    }
    public static LivePlusRecruitApplyQuestionProto$RecruitQuestionFeed parseFrom(CodedInputByteBufferNano p0){
       return new LivePlusRecruitApplyQuestionProto$RecruitQuestionFeed().mergeFrom(p0);
    }
    public static LivePlusRecruitApplyQuestionProto$RecruitQuestionFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePlusRecruitApplyQuestionProto$RecruitQuestionFeed(), p0);
    }
    public LivePlusRecruitApplyQuestionProto$RecruitQuestionFeed clear(){
       this.prefix = "";
       this.content = "";
       this.buttonContent = "";
       this.buttonRouter = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.prefix).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.prefix);
       }
       if (!(this.content).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.content);
       }
       if (!(this.buttonContent).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.buttonContent);
       }
       if (!(this.buttonRouter).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.buttonRouter);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePlusRecruitApplyQuestionProto$RecruitQuestionFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.buttonRouter = p0.readString();
                   }
                }else {
                   this.buttonContent = p0.readString();
                }
             }else {
                this.content = p0.readString();
             }
          }else {
             this.prefix = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.prefix).equals(str)) {
          p0.writeString(1, this.prefix);
       }
       if (!(this.content).equals(str)) {
          p0.writeString(2, this.content);
       }
       if (!(this.buttonContent).equals(str)) {
          p0.writeString(3, this.buttonContent);
       }
       if (!(this.buttonRouter).equals(str)) {
          p0.writeString(4, this.buttonRouter);
       }
       super.writeTo(p0);
       return;
    }
}
