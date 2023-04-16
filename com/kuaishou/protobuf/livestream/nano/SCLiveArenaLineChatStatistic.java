package com.kuaishou.protobuf.livestream.nano.SCLiveArenaLineChatStatistic;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveArenaLineChatStatistic;

public final class SCLiveArenaLineChatStatistic extends MessageNano	// class@000d40
{
    public String arenaLineChatId;
    public String liveStreamId;
    public String multiLineChatId;
    public LiveArenaLineChatStatistic statistic;
    public static SCLiveArenaLineChatStatistic[] _emptyArray;

    public void SCLiveArenaLineChatStatistic(){
       super();
       this.clear();
    }
    public static SCLiveArenaLineChatStatistic[] emptyArray(){
       if (SCLiveArenaLineChatStatistic._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveArenaLineChatStatistic._emptyArray == null) {
             SCLiveArenaLineChatStatistic[] sCLiveArenaL = new SCLiveArenaLineChatStatistic[0];
             SCLiveArenaLineChatStatistic._emptyArray = sCLiveArenaL;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveArenaLineChatStatistic._emptyArray;
    }
    public static SCLiveArenaLineChatStatistic parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveArenaLineChatStatistic().mergeFrom(p0);
    }
    public static SCLiveArenaLineChatStatistic parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveArenaLineChatStatistic(), p0);
    }
    public SCLiveArenaLineChatStatistic clear(){
       this.liveStreamId = "";
       this.multiLineChatId = "";
       this.arenaLineChatId = "";
       this.statistic = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       if (!(this.multiLineChatId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.multiLineChatId);
       }
       if (!(this.arenaLineChatId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.arenaLineChatId);
       }
       SCLiveArenaLineChatStatistic tstatistic = this.statistic;
       if (tstatistic != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tstatistic);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveArenaLineChatStatistic mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else if(this.statistic == null){
                      this.statistic = new LiveArenaLineChatStatistic();
                   }
                   p0.readMessage(this.statistic);
                }else {
                   this.arenaLineChatId = p0.readString();
                }
             }else {
                this.multiLineChatId = p0.readString();
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
       if (!(this.multiLineChatId).equals(str)) {
          p0.writeString(2, this.multiLineChatId);
       }
       if (!(this.arenaLineChatId).equals(str)) {
          p0.writeString(3, this.arenaLineChatId);
       }
       SCLiveArenaLineChatStatistic tstatistic = this.statistic;
       if (tstatistic != null) {
          p0.writeMessage(4, tstatistic);
       }
       super.writeTo(p0);
       return;
    }
}
