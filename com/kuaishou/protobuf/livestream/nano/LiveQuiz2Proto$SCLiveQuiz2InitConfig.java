package com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$SCLiveQuiz2InitConfig;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$LiveQuiz2Model;

public final class LiveQuiz2Proto$SCLiveQuiz2InitConfig extends MessageNano	// class@000ceb
{
    public String enterRoomNoticeDesc;
    public LiveQuiz2Proto$LiveQuiz2Model liveQuiz;
    public static LiveQuiz2Proto$SCLiveQuiz2InitConfig[] _emptyArray;

    public void LiveQuiz2Proto$SCLiveQuiz2InitConfig(){
       super();
       this.clear();
    }
    public static LiveQuiz2Proto$SCLiveQuiz2InitConfig[] emptyArray(){
       if (LiveQuiz2Proto$SCLiveQuiz2InitConfig._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveQuiz2Proto$SCLiveQuiz2InitConfig._emptyArray == null) {
             LiveQuiz2Proto$SCLiveQuiz2InitConfig[] sCLiveQuiz2I = new LiveQuiz2Proto$SCLiveQuiz2InitConfig[0];
             LiveQuiz2Proto$SCLiveQuiz2InitConfig._emptyArray = sCLiveQuiz2I;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveQuiz2Proto$SCLiveQuiz2InitConfig._emptyArray;
    }
    public static LiveQuiz2Proto$SCLiveQuiz2InitConfig parseFrom(CodedInputByteBufferNano p0){
       return new LiveQuiz2Proto$SCLiveQuiz2InitConfig().mergeFrom(p0);
    }
    public static LiveQuiz2Proto$SCLiveQuiz2InitConfig parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveQuiz2Proto$SCLiveQuiz2InitConfig(), p0);
    }
    public LiveQuiz2Proto$SCLiveQuiz2InitConfig clear(){
       this.liveQuiz = null;
       this.enterRoomNoticeDesc = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveQuiz2Proto$SCLiveQuiz2InitConfig tliveQuiz = this.liveQuiz;
       if (tliveQuiz != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tliveQuiz);
       }
       if (!(this.enterRoomNoticeDesc).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.enterRoomNoticeDesc);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveQuiz2Proto$SCLiveQuiz2InitConfig mergeFrom(CodedInputByteBufferNano p0){
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
             }else {
                this.enterRoomNoticeDesc = p0.readString();
             }
          }else if(this.liveQuiz == null){
             this.liveQuiz = new LiveQuiz2Proto$LiveQuiz2Model();
          }
          p0.readMessage(this.liveQuiz);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveQuiz2Proto$SCLiveQuiz2InitConfig tliveQuiz = this.liveQuiz;
       if (tliveQuiz != null) {
          p0.writeMessage(1, tliveQuiz);
       }
       if (!(this.enterRoomNoticeDesc).equals("")) {
          p0.writeString(2, this.enterRoomNoticeDesc);
       }
       super.writeTo(p0);
       return;
    }
}
