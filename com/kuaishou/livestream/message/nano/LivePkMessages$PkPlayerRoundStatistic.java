package com.kuaishou.livestream.message.nano.LivePkMessages$PkPlayerRoundStatistic;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LivePkMessages$PkPlayerRoundStatistic extends MessageNano	// class@001217
{
    public int roundIndex;
    public long roundScore;
    public static LivePkMessages$PkPlayerRoundStatistic[] _emptyArray;

    public void LivePkMessages$PkPlayerRoundStatistic(){
       super();
       this.clear();
    }
    public static LivePkMessages$PkPlayerRoundStatistic[] emptyArray(){
       if (LivePkMessages$PkPlayerRoundStatistic._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePkMessages$PkPlayerRoundStatistic._emptyArray == null) {
             LivePkMessages$PkPlayerRoundStatistic[] pkPlayerRoun = new LivePkMessages$PkPlayerRoundStatistic[0];
             LivePkMessages$PkPlayerRoundStatistic._emptyArray = pkPlayerRoun;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePkMessages$PkPlayerRoundStatistic._emptyArray;
    }
    public static LivePkMessages$PkPlayerRoundStatistic parseFrom(CodedInputByteBufferNano p0){
       return new LivePkMessages$PkPlayerRoundStatistic().mergeFrom(p0);
    }
    public static LivePkMessages$PkPlayerRoundStatistic parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePkMessages$PkPlayerRoundStatistic(), p0);
    }
    public LivePkMessages$PkPlayerRoundStatistic clear(){
       this.roundScore = 0;
       this.roundIndex = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LivePkMessages$PkPlayerRoundStatistic troundScore = this.roundScore;
       if (troundScore) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, troundScore);
       }
       troundScore = this.roundIndex;
       if (troundScore != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, troundScore);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePkMessages$PkPlayerRoundStatistic mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.roundIndex = p0.readUInt32();
             }
          }else {
             this.roundScore = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LivePkMessages$PkPlayerRoundStatistic troundScore = this.roundScore;
       if (troundScore) {
          p0.writeUInt64(1, troundScore);
       }
       troundScore = this.roundIndex;
       if (troundScore != null) {
          p0.writeUInt32(2, troundScore);
       }
       super.writeTo(p0);
       return;
    }
}
