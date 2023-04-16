package com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceNotice;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceNotice extends MessageNano	// class@001113
{
    public String content;
    public String liveStreamId;
    public String title;
    public static LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceNotice[] _emptyArray;

    public void LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceNotice(){
       super();
       this.clear();
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceNotice[] emptyArray(){
       if (LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceNotice._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceNotice._emptyArray == null) {
             LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceNotice[] sCLiveBlindD = new LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceNotice[0];
             LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceNotice._emptyArray = sCLiveBlindD;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceNotice._emptyArray;
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceNotice parseFrom(CodedInputByteBufferNano p0){
       return new LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceNotice().mergeFrom(p0);
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceNotice parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceNotice(), p0);
    }
    public LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceNotice clear(){
       this.liveStreamId = "";
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
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.title);
       }
       if (!(this.content).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.content);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceNotice mergeFrom(CodedInputByteBufferNano p0){
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
                }else {
                   this.content = p0.readString();
                }
             }else {
                this.title = p0.readString();
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
       if (!(this.title).equals(str)) {
          p0.writeString(2, this.title);
       }
       if (!(this.content).equals(str)) {
          p0.writeString(3, this.content);
       }
       super.writeTo(p0);
       return;
    }
}
