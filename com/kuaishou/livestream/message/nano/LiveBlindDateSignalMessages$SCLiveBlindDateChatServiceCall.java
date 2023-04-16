package com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceCall;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceCall extends MessageNano	// class@001111
{
    public String content;
    public long countDownMillis;
    public String liveStreamId;
    public String sessionId;
    public String title;
    public static LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceCall[] _emptyArray;

    public void LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceCall(){
       super();
       this.clear();
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceCall[] emptyArray(){
       if (LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceCall._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceCall._emptyArray == null) {
             LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceCall[] sCLiveBlindD = new LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceCall[0];
             LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceCall._emptyArray = sCLiveBlindD;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceCall._emptyArray;
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceCall parseFrom(CodedInputByteBufferNano p0){
       return new LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceCall().mergeFrom(p0);
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceCall parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceCall(), p0);
    }
    public LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceCall clear(){
       this.liveStreamId = "";
       this.sessionId = "";
       this.countDownMillis = 0;
       this.title = "";
       this.content = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       if (!(this.sessionId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.sessionId);
       }
       LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceCall tcountDownMi = this.countDownMillis;
       if (tcountDownMi) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tcountDownMi);
       }
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.title);
       }
       if (!(this.content).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.content);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceCall mergeFrom(CodedInputByteBufferNano p0){
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
                         this.content = p0.readString();
                      }
                   }else {
                      this.title = p0.readString();
                   }
                }else {
                   this.countDownMillis = p0.readUInt64();
                }
             }else {
                this.sessionId = p0.readString();
             }
          }else {
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(1, this.liveStreamId);
       }
       if (!(this.sessionId).equals(str)) {
          p0.writeString(2, this.sessionId);
       }
       LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceCall tcountDownMi = this.countDownMillis;
       if (tcountDownMi) {
          p0.writeUInt64(3, tcountDownMi);
       }
       if (!(this.title).equals(str)) {
          p0.writeString(4, this.title);
       }
       if (!(this.content).equals(str)) {
          p0.writeString(5, this.content);
       }
       super.writeTo(p0);
       return;
    }
}
