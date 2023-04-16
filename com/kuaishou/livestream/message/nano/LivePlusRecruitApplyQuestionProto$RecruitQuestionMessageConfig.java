package com.kuaishou.livestream.message.nano.LivePlusRecruitApplyQuestionProto$RecruitQuestionMessageConfig;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LivePlusRecruitApplyQuestionProto$RecruitQuestionFeed;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LivePlusRecruitApplyQuestionProto$RecruitQuestionMessageConfig extends MessageNano	// class@001234
{
    public LivePlusRecruitApplyQuestionProto$RecruitQuestionFeed[] feeds;
    public String frequencyBizId;
    public int interval;
    public static LivePlusRecruitApplyQuestionProto$RecruitQuestionMessageConfig[] _emptyArray;

    public void LivePlusRecruitApplyQuestionProto$RecruitQuestionMessageConfig(){
       super();
       this.clear();
    }
    public static LivePlusRecruitApplyQuestionProto$RecruitQuestionMessageConfig[] emptyArray(){
       if (LivePlusRecruitApplyQuestionProto$RecruitQuestionMessageConfig._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePlusRecruitApplyQuestionProto$RecruitQuestionMessageConfig._emptyArray == null) {
             LivePlusRecruitApplyQuestionProto$RecruitQuestionMessageConfig[] recruitQuest = new LivePlusRecruitApplyQuestionProto$RecruitQuestionMessageConfig[0];
             LivePlusRecruitApplyQuestionProto$RecruitQuestionMessageConfig._emptyArray = recruitQuest;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePlusRecruitApplyQuestionProto$RecruitQuestionMessageConfig._emptyArray;
    }
    public static LivePlusRecruitApplyQuestionProto$RecruitQuestionMessageConfig parseFrom(CodedInputByteBufferNano p0){
       return new LivePlusRecruitApplyQuestionProto$RecruitQuestionMessageConfig().mergeFrom(p0);
    }
    public static LivePlusRecruitApplyQuestionProto$RecruitQuestionMessageConfig parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePlusRecruitApplyQuestionProto$RecruitQuestionMessageConfig(), p0);
    }
    public LivePlusRecruitApplyQuestionProto$RecruitQuestionMessageConfig clear(){
       this.interval = 0;
       this.frequencyBizId = "";
       this.feeds = LivePlusRecruitApplyQuestionProto$RecruitQuestionFeed.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LivePlusRecruitApplyQuestionProto$RecruitQuestionMessageConfig tinterval = this.interval;
       if (tinterval != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tinterval);
       }
       if (!(this.frequencyBizId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.frequencyBizId);
       }
       tinterval = this.feeds;
       if (tinterval != null && tinterval.length > 0) {
          int i1 = 0;
          LivePlusRecruitApplyQuestionProto$RecruitQuestionMessageConfig tRecruitQues = this.feeds;
          while (i1 < tRecruitQues.length) {
             object oobject = tRecruitQues[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePlusRecruitApplyQuestionProto$RecruitQuestionMessageConfig mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                int i1 = 26;
                if (i != i1) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   LivePlusRecruitApplyQuestionProto$RecruitQuestionMessageConfig tRecruitQues = this.feeds;
                   int i2 = (tRecruitQues == null)? 0: tRecruitQues.length;
                   i = i + i2;
                   LivePlusRecruitApplyQuestionProto$RecruitQuestionFeed[] recruitQuest = new LivePlusRecruitApplyQuestionProto$RecruitQuestionFeed[i];
                   if (i2) {
                      System.arraycopy(tRecruitQues, 0, recruitQuest, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      recruitQuest[i2] = new LivePlusRecruitApplyQuestionProto$RecruitQuestionFeed();
                      p0.readMessage(recruitQuest[i2]);
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   recruitQuest[i2] = new LivePlusRecruitApplyQuestionProto$RecruitQuestionFeed();
                   p0.readMessage(recruitQuest[i2]);
                   this.feeds = recruitQuest;
                }
             }else {
                this.frequencyBizId = p0.readString();
             }
          }else {
             this.interval = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LivePlusRecruitApplyQuestionProto$RecruitQuestionMessageConfig tinterval = this.interval;
       if (tinterval != null) {
          p0.writeUInt32(1, tinterval);
       }
       if (!(this.frequencyBizId).equals("")) {
          p0.writeString(2, this.frequencyBizId);
       }
       tinterval = this.feeds;
       if (tinterval != null && tinterval.length > 0) {
          int i = 0;
          LivePlusRecruitApplyQuestionProto$RecruitQuestionMessageConfig tRecruitQues = this.feeds;
          while (i < tRecruitQues.length) {
             object oobject = tRecruitQues[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
