package com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$SCLiveQuiz2CloseConfig;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$LiveQuiz2Model;

public final class LiveQuiz2Proto$SCLiveQuiz2CloseConfig extends MessageNano	// class@000ce9
{
    public LiveQuiz2Proto$LiveQuiz2Model liveQuiz;
    public static LiveQuiz2Proto$SCLiveQuiz2CloseConfig[] _emptyArray;

    public void LiveQuiz2Proto$SCLiveQuiz2CloseConfig(){
       super();
       this.clear();
    }
    public static LiveQuiz2Proto$SCLiveQuiz2CloseConfig[] emptyArray(){
       if (LiveQuiz2Proto$SCLiveQuiz2CloseConfig._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveQuiz2Proto$SCLiveQuiz2CloseConfig._emptyArray == null) {
             LiveQuiz2Proto$SCLiveQuiz2CloseConfig[] sCLiveQuiz2C = new LiveQuiz2Proto$SCLiveQuiz2CloseConfig[0];
             LiveQuiz2Proto$SCLiveQuiz2CloseConfig._emptyArray = sCLiveQuiz2C;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveQuiz2Proto$SCLiveQuiz2CloseConfig._emptyArray;
    }
    public static LiveQuiz2Proto$SCLiveQuiz2CloseConfig parseFrom(CodedInputByteBufferNano p0){
       return new LiveQuiz2Proto$SCLiveQuiz2CloseConfig().mergeFrom(p0);
    }
    public static LiveQuiz2Proto$SCLiveQuiz2CloseConfig parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveQuiz2Proto$SCLiveQuiz2CloseConfig(), p0);
    }
    public LiveQuiz2Proto$SCLiveQuiz2CloseConfig clear(){
       this.liveQuiz = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveQuiz2Proto$SCLiveQuiz2CloseConfig tliveQuiz = this.liveQuiz;
       if (tliveQuiz != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tliveQuiz);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveQuiz2Proto$SCLiveQuiz2CloseConfig mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else if(this.liveQuiz == null){
             this.liveQuiz = new LiveQuiz2Proto$LiveQuiz2Model();
          }
          p0.readMessage(this.liveQuiz);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveQuiz2Proto$SCLiveQuiz2CloseConfig tliveQuiz = this.liveQuiz;
       if (tliveQuiz != null) {
          p0.writeMessage(1, tliveQuiz);
       }
       super.writeTo(p0);
       return;
    }
}
