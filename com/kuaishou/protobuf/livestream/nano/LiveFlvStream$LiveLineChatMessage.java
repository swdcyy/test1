package com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveLineChatMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveFlvStream$LiveLineChatMessage extends MessageNano	// class@000c79
{
    public String lineChatId;
    public static LiveFlvStream$LiveLineChatMessage[] _emptyArray;

    public void LiveFlvStream$LiveLineChatMessage(){
       super();
       this.clear();
    }
    public static LiveFlvStream$LiveLineChatMessage[] emptyArray(){
       if (LiveFlvStream$LiveLineChatMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFlvStream$LiveLineChatMessage._emptyArray == null) {
             LiveFlvStream$LiveLineChatMessage[] liveLineChat = new LiveFlvStream$LiveLineChatMessage[0];
             LiveFlvStream$LiveLineChatMessage._emptyArray = liveLineChat;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFlvStream$LiveLineChatMessage._emptyArray;
    }
    public static LiveFlvStream$LiveLineChatMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveFlvStream$LiveLineChatMessage().mergeFrom(p0);
    }
    public static LiveFlvStream$LiveLineChatMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFlvStream$LiveLineChatMessage(), p0);
    }
    public LiveFlvStream$LiveLineChatMessage clear(){
       this.lineChatId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.lineChatId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.lineChatId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFlvStream$LiveLineChatMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             this.lineChatId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.lineChatId).equals("")) {
          p0.writeString(1, this.lineChatId);
       }
       super.writeTo(p0);
       return;
    }
}
