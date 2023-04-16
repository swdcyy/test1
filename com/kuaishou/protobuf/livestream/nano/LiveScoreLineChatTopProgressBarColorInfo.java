package com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatTopProgressBarColorInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatColorInfo;

public final class LiveScoreLineChatTopProgressBarColorInfo extends MessageNano	// class@000d12
{
    public LiveScoreLineChatColorInfo blankBarDownColor;
    public LiveScoreLineChatColorInfo blankBarUpColor;
    public LiveScoreLineChatColorInfo scoreProgressColor;
    public static LiveScoreLineChatTopProgressBarColorInfo[] _emptyArray;

    public void LiveScoreLineChatTopProgressBarColorInfo(){
       super();
       this.clear();
    }
    public static LiveScoreLineChatTopProgressBarColorInfo[] emptyArray(){
       if (LiveScoreLineChatTopProgressBarColorInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveScoreLineChatTopProgressBarColorInfo._emptyArray == null) {
             LiveScoreLineChatTopProgressBarColorInfo[] liveScoreLin = new LiveScoreLineChatTopProgressBarColorInfo[0];
             LiveScoreLineChatTopProgressBarColorInfo._emptyArray = liveScoreLin;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveScoreLineChatTopProgressBarColorInfo._emptyArray;
    }
    public static LiveScoreLineChatTopProgressBarColorInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveScoreLineChatTopProgressBarColorInfo().mergeFrom(p0);
    }
    public static LiveScoreLineChatTopProgressBarColorInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveScoreLineChatTopProgressBarColorInfo(), p0);
    }
    public LiveScoreLineChatTopProgressBarColorInfo clear(){
       this.blankBarUpColor = null;
       this.blankBarDownColor = null;
       this.scoreProgressColor = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveScoreLineChatTopProgressBarColorInfo tblankBarUpC = this.blankBarUpColor;
       if (tblankBarUpC != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tblankBarUpC);
       }
       tblankBarUpC = this.blankBarDownColor;
       if (tblankBarUpC != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tblankBarUpC);
       }
       tblankBarUpC = this.scoreProgressColor;
       if (tblankBarUpC != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tblankBarUpC);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveScoreLineChatTopProgressBarColorInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else if(this.scoreProgressColor == null){
                   this.scoreProgressColor = new LiveScoreLineChatColorInfo();
                }
                p0.readMessage(this.scoreProgressColor);
             }else if(this.blankBarDownColor == null){
                this.blankBarDownColor = new LiveScoreLineChatColorInfo();
             }
             p0.readMessage(this.blankBarDownColor);
          }else if(this.blankBarUpColor == null){
             this.blankBarUpColor = new LiveScoreLineChatColorInfo();
          }
          p0.readMessage(this.blankBarUpColor);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveScoreLineChatTopProgressBarColorInfo tblankBarUpC = this.blankBarUpColor;
       if (tblankBarUpC != null) {
          p0.writeMessage(1, tblankBarUpC);
       }
       tblankBarUpC = this.blankBarDownColor;
       if (tblankBarUpC != null) {
          p0.writeMessage(2, tblankBarUpC);
       }
       tblankBarUpC = this.scoreProgressColor;
       if (tblankBarUpC != null) {
          p0.writeMessage(3, tblankBarUpC);
       }
       super.writeTo(p0);
       return;
    }
}
