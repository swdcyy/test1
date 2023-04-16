package com.kuaishou.protobuf.livestream.nano.LiveArenaLineChatOpen;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveArenaLineChatStatistic;

public final class LiveArenaLineChatOpen extends MessageNano	// class@000c2d
{
    public int adjustOrderMinIntervalInSeconds;
    public String displayScorePrefix;
    public int playType;
    public String ruleUrl;
    public LiveArenaLineChatStatistic statistic;
    public static LiveArenaLineChatOpen[] _emptyArray;

    public void LiveArenaLineChatOpen(){
       super();
       this.clear();
    }
    public static LiveArenaLineChatOpen[] emptyArray(){
       if (LiveArenaLineChatOpen._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveArenaLineChatOpen._emptyArray == null) {
             LiveArenaLineChatOpen[] liveArenaLin = new LiveArenaLineChatOpen[0];
             LiveArenaLineChatOpen._emptyArray = liveArenaLin;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveArenaLineChatOpen._emptyArray;
    }
    public static LiveArenaLineChatOpen parseFrom(CodedInputByteBufferNano p0){
       return new LiveArenaLineChatOpen().mergeFrom(p0);
    }
    public static LiveArenaLineChatOpen parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveArenaLineChatOpen(), p0);
    }
    public LiveArenaLineChatOpen clear(){
       this.statistic = null;
       this.ruleUrl = "";
       this.adjustOrderMinIntervalInSeconds = 0;
       this.playType = 0;
       this.displayScorePrefix = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveArenaLineChatOpen tstatistic = this.statistic;
       if (tstatistic != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tstatistic);
       }
       String str = "";
       if (!(this.ruleUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.ruleUrl);
       }
       tstatistic = this.adjustOrderMinIntervalInSeconds;
       if (tstatistic != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tstatistic);
       }
       tstatistic = this.playType;
       if (tstatistic != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tstatistic);
       }
       if (!(this.displayScorePrefix).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.displayScorePrefix);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveArenaLineChatOpen mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.displayScorePrefix = p0.readString();
                      }
                   }else {
                      i = p0.readInt32();
                      if (i && (i != 1 && i != 2)) {
                         continue ;
                      }else {
                         this.playType = i;
                      }
                   }
                }else {
                   this.adjustOrderMinIntervalInSeconds = p0.readUInt32();
                }
             }else {
                this.ruleUrl = p0.readString();
             }
          }else if(this.statistic == null){
             this.statistic = new LiveArenaLineChatStatistic();
          }
          p0.readMessage(this.statistic);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveArenaLineChatOpen tstatistic = this.statistic;
       if (tstatistic != null) {
          p0.writeMessage(1, tstatistic);
       }
       String str = "";
       if (!(this.ruleUrl).equals(str)) {
          p0.writeString(2, this.ruleUrl);
       }
       tstatistic = this.adjustOrderMinIntervalInSeconds;
       if (tstatistic != null) {
          p0.writeUInt32(3, tstatistic);
       }
       tstatistic = this.playType;
       if (tstatistic != null) {
          p0.writeInt32(4, tstatistic);
       }
       if (!(this.displayScorePrefix).equals(str)) {
          p0.writeString(5, this.displayScorePrefix);
       }
       super.writeTo(p0);
       return;
    }
}
