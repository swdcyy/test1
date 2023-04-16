package com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatTopProgressBarInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatTopProgressBarColorInfo;

public final class LiveScoreLineChatTopProgressBarInfo extends MessageNano	// class@000d13
{
    public LiveScoreLineChatTopProgressBarColorInfo leftColorInfo;
    public LiveScoreLineChatTopProgressBarColorInfo rightColorInfo;
    public static LiveScoreLineChatTopProgressBarInfo[] _emptyArray;

    public void LiveScoreLineChatTopProgressBarInfo(){
       super();
       this.clear();
    }
    public static LiveScoreLineChatTopProgressBarInfo[] emptyArray(){
       if (LiveScoreLineChatTopProgressBarInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveScoreLineChatTopProgressBarInfo._emptyArray == null) {
             LiveScoreLineChatTopProgressBarInfo[] liveScoreLin = new LiveScoreLineChatTopProgressBarInfo[0];
             LiveScoreLineChatTopProgressBarInfo._emptyArray = liveScoreLin;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveScoreLineChatTopProgressBarInfo._emptyArray;
    }
    public static LiveScoreLineChatTopProgressBarInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveScoreLineChatTopProgressBarInfo().mergeFrom(p0);
    }
    public static LiveScoreLineChatTopProgressBarInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveScoreLineChatTopProgressBarInfo(), p0);
    }
    public LiveScoreLineChatTopProgressBarInfo clear(){
       this.leftColorInfo = null;
       this.rightColorInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveScoreLineChatTopProgressBarInfo tleftColorIn = this.leftColorInfo;
       if (tleftColorIn != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tleftColorIn);
       }
       tleftColorIn = this.rightColorInfo;
       if (tleftColorIn != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tleftColorIn);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveScoreLineChatTopProgressBarInfo mergeFrom(CodedInputByteBufferNano p0){
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
             }else if(this.rightColorInfo == null){
                this.rightColorInfo = new LiveScoreLineChatTopProgressBarColorInfo();
             }
             p0.readMessage(this.rightColorInfo);
          }else if(this.leftColorInfo == null){
             this.leftColorInfo = new LiveScoreLineChatTopProgressBarColorInfo();
          }
          p0.readMessage(this.leftColorInfo);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveScoreLineChatTopProgressBarInfo tleftColorIn = this.leftColorInfo;
       if (tleftColorIn != null) {
          p0.writeMessage(1, tleftColorIn);
       }
       tleftColorIn = this.rightColorInfo;
       if (tleftColorIn != null) {
          p0.writeMessage(2, tleftColorIn);
       }
       super.writeTo(p0);
       return;
    }
}
