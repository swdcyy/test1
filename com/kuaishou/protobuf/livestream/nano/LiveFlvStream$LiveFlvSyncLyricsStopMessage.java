package com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvSyncLyricsStopMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveFlvStream$LiveFlvSyncLyricsStopMessage extends MessageNano	// class@000c72
{
    public String orderId;
    public static LiveFlvStream$LiveFlvSyncLyricsStopMessage[] _emptyArray;

    public void LiveFlvStream$LiveFlvSyncLyricsStopMessage(){
       super();
       this.clear();
    }
    public static LiveFlvStream$LiveFlvSyncLyricsStopMessage[] emptyArray(){
       if (LiveFlvStream$LiveFlvSyncLyricsStopMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFlvStream$LiveFlvSyncLyricsStopMessage._emptyArray == null) {
             LiveFlvStream$LiveFlvSyncLyricsStopMessage[] liveFlvSyncL = new LiveFlvStream$LiveFlvSyncLyricsStopMessage[0];
             LiveFlvStream$LiveFlvSyncLyricsStopMessage._emptyArray = liveFlvSyncL;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFlvStream$LiveFlvSyncLyricsStopMessage._emptyArray;
    }
    public static LiveFlvStream$LiveFlvSyncLyricsStopMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveFlvStream$LiveFlvSyncLyricsStopMessage().mergeFrom(p0);
    }
    public static LiveFlvStream$LiveFlvSyncLyricsStopMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFlvStream$LiveFlvSyncLyricsStopMessage(), p0);
    }
    public LiveFlvStream$LiveFlvSyncLyricsStopMessage clear(){
       this.orderId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.orderId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.orderId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFlvStream$LiveFlvSyncLyricsStopMessage mergeFrom(CodedInputByteBufferNano p0){
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
             this.orderId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.orderId).equals("")) {
          p0.writeString(1, this.orderId);
       }
       super.writeTo(p0);
       return;
    }
}
