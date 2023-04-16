package com.kuaishou.livestream.message.nano.SCLiveQuestionnaire;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveQuestionnaire extends MessageNano	// class@001438
{
    public int bizType;
    public boolean isTest;
    public int priority;
    public String questionnaireId;
    public long userWatchMaxDurationMs;
    public long userWatchMinDurationMs;
    public static SCLiveQuestionnaire[] _emptyArray;

    public void SCLiveQuestionnaire(){
       super();
       this.clear();
    }
    public static SCLiveQuestionnaire[] emptyArray(){
       if (SCLiveQuestionnaire._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveQuestionnaire._emptyArray == null) {
             SCLiveQuestionnaire[] sCLiveQuesti = new SCLiveQuestionnaire[0];
             SCLiveQuestionnaire._emptyArray = sCLiveQuesti;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveQuestionnaire._emptyArray;
    }
    public static SCLiveQuestionnaire parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveQuestionnaire().mergeFrom(p0);
    }
    public static SCLiveQuestionnaire parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveQuestionnaire(), p0);
    }
    public SCLiveQuestionnaire clear(){
       this.questionnaireId = "";
       this.userWatchMinDurationMs = 0;
       this.userWatchMaxDurationMs = 0;
       this.isTest = false;
       this.bizType = 0;
       this.priority = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.questionnaireId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.questionnaireId);
       }
       SCLiveQuestionnaire tuserWatchMi = this.userWatchMinDurationMs;
       int i1 = 0;
       if (tuserWatchMi - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tuserWatchMi);
       }
       tuserWatchMi = this.userWatchMaxDurationMs;
       if (tuserWatchMi - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tuserWatchMi);
       }
       tuserWatchMi = this.isTest;
       if (tuserWatchMi != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, tuserWatchMi);
       }
       tuserWatchMi = this.bizType;
       if (tuserWatchMi != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tuserWatchMi);
       }
       tuserWatchMi = this.priority;
       if (tuserWatchMi != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tuserWatchMi);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveQuestionnaire mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.priority = p0.readUInt32();
                         }
                      }else {
                         this.bizType = p0.readUInt32();
                      }
                   }else {
                      this.isTest = p0.readBool();
                   }
                }else {
                   this.userWatchMaxDurationMs = p0.readUInt64();
                }
             }else {
                this.userWatchMinDurationMs = p0.readUInt64();
             }
          }else {
             this.questionnaireId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.questionnaireId).equals("")) {
          p0.writeString(1, this.questionnaireId);
       }
       SCLiveQuestionnaire tuserWatchMi = this.userWatchMinDurationMs;
       int i = 0;
       if (tuserWatchMi - i) {
          p0.writeUInt64(2, tuserWatchMi);
       }
       tuserWatchMi = this.userWatchMaxDurationMs;
       if (tuserWatchMi - i) {
          p0.writeUInt64(3, tuserWatchMi);
       }
       tuserWatchMi = this.isTest;
       if (tuserWatchMi != null) {
          p0.writeBool(4, tuserWatchMi);
       }
       tuserWatchMi = this.bizType;
       if (tuserWatchMi != null) {
          p0.writeUInt32(5, tuserWatchMi);
       }
       tuserWatchMi = this.priority;
       if (tuserWatchMi != null) {
          p0.writeUInt32(6, tuserWatchMi);
       }
       super.writeTo(p0);
       return;
    }
}
