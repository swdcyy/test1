package com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatTimeLine;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveScoreLineChatTimeLine extends MessageNano	// class@000d11
{
    public long exceedDeadlineBuffer;
    public long penaltyDeadline;
    public long voteDeadline;
    public static LiveScoreLineChatTimeLine[] _emptyArray;

    public void LiveScoreLineChatTimeLine(){
       super();
       this.clear();
    }
    public static LiveScoreLineChatTimeLine[] emptyArray(){
       if (LiveScoreLineChatTimeLine._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveScoreLineChatTimeLine._emptyArray == null) {
             LiveScoreLineChatTimeLine[] liveScoreLin = new LiveScoreLineChatTimeLine[0];
             LiveScoreLineChatTimeLine._emptyArray = liveScoreLin;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveScoreLineChatTimeLine._emptyArray;
    }
    public static LiveScoreLineChatTimeLine parseFrom(CodedInputByteBufferNano p0){
       return new LiveScoreLineChatTimeLine().mergeFrom(p0);
    }
    public static LiveScoreLineChatTimeLine parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveScoreLineChatTimeLine(), p0);
    }
    public LiveScoreLineChatTimeLine clear(){
       this.voteDeadline = 0;
       this.penaltyDeadline = 0;
       this.exceedDeadlineBuffer = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveScoreLineChatTimeLine tvoteDeadlin = this.voteDeadline;
       int i1 = 0;
       if (tvoteDeadlin - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tvoteDeadlin);
       }
       tvoteDeadlin = this.penaltyDeadline;
       if (tvoteDeadlin - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tvoteDeadlin);
       }
       tvoteDeadlin = this.exceedDeadlineBuffer;
       if (tvoteDeadlin - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tvoteDeadlin);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveScoreLineChatTimeLine mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.exceedDeadlineBuffer = p0.readUInt64();
                }
             }else {
                this.penaltyDeadline = p0.readUInt64();
             }
          }else {
             this.voteDeadline = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveScoreLineChatTimeLine tvoteDeadlin = this.voteDeadline;
       int i = 0;
       if (tvoteDeadlin - i) {
          p0.writeUInt64(1, tvoteDeadlin);
       }
       tvoteDeadlin = this.penaltyDeadline;
       if (tvoteDeadlin - i) {
          p0.writeUInt64(2, tvoteDeadlin);
       }
       tvoteDeadlin = this.exceedDeadlineBuffer;
       if (tvoteDeadlin - i) {
          p0.writeUInt64(3, tvoteDeadlin);
       }
       super.writeTo(p0);
       return;
    }
}
