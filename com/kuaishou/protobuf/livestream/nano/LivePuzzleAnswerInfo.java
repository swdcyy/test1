package com.kuaishou.protobuf.livestream.nano.LivePuzzleAnswerInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LivePuzzleAnswerInfo extends MessageNano	// class@000cd5
{
    public int answerId;
    public String answerName;
    public boolean isDefault;
    public static LivePuzzleAnswerInfo[] _emptyArray;

    public void LivePuzzleAnswerInfo(){
       super();
       this.clear();
    }
    public static LivePuzzleAnswerInfo[] emptyArray(){
       if (LivePuzzleAnswerInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePuzzleAnswerInfo._emptyArray == null) {
             LivePuzzleAnswerInfo[] livePuzzleAn = new LivePuzzleAnswerInfo[0];
             LivePuzzleAnswerInfo._emptyArray = livePuzzleAn;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePuzzleAnswerInfo._emptyArray;
    }
    public static LivePuzzleAnswerInfo parseFrom(CodedInputByteBufferNano p0){
       return new LivePuzzleAnswerInfo().mergeFrom(p0);
    }
    public static LivePuzzleAnswerInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePuzzleAnswerInfo(), p0);
    }
    public LivePuzzleAnswerInfo clear(){
       this.answerId = 0;
       this.isDefault = false;
       this.answerName = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LivePuzzleAnswerInfo tanswerId = this.answerId;
       if (tanswerId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tanswerId);
       }
       tanswerId = this.isDefault;
       if (tanswerId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tanswerId);
       }
       if (!(this.answerName).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.answerName);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePuzzleAnswerInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.answerName = p0.readString();
                }
             }else {
                this.isDefault = p0.readBool();
             }
          }else {
             this.answerId = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LivePuzzleAnswerInfo tanswerId = this.answerId;
       if (tanswerId != null) {
          p0.writeUInt32(1, tanswerId);
       }
       tanswerId = this.isDefault;
       if (tanswerId != null) {
          p0.writeBool(2, tanswerId);
       }
       if (!(this.answerName).equals("")) {
          p0.writeString(3, this.answerName);
       }
       super.writeTo(p0);
       return;
    }
}
