package com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$SCLiveBattlePopularityRank;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$ContentWithStyle;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$BattleDistrictRankUnfold;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$BattleDistrictRankFold;

public final class LiveDistrictRankFinalBattle$SCLiveBattlePopularityRank extends MessageNano	// class@001187
{
    public long battleDistrictRankEndTime;
    public LiveDistrictRankFinalBattle$BattleDistrictRankFold battleDistrictRankFold;
    public LiveDistrictRankFinalBattle$BattleDistrictRankUnfold battleDistrictRankUnfold;
    public long nextUnfoldTime;
    public int popularityRankType;
    public boolean shouldClose;
    public long unfoldDuration;
    public long unfoldInterval;
    public String waitCountDownColor;
    public LiveDistrictRankFinalBattle$ContentWithStyle waitCountDownText;
    public LiveDistrictRankFinalBattle$ContentWithStyle waitDescribeText;
    public long waitDisplayEndDurationMs;
    public long waitEndTimestamp;
    public LiveDistrictRankFinalBattle$ContentWithStyle waitRemindText;
    public static LiveDistrictRankFinalBattle$SCLiveBattlePopularityRank[] _emptyArray;

    public void LiveDistrictRankFinalBattle$SCLiveBattlePopularityRank(){
       super();
       this.clear();
    }
    public static LiveDistrictRankFinalBattle$SCLiveBattlePopularityRank[] emptyArray(){
       if (LiveDistrictRankFinalBattle$SCLiveBattlePopularityRank._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveDistrictRankFinalBattle$SCLiveBattlePopularityRank._emptyArray == null) {
             LiveDistrictRankFinalBattle$SCLiveBattlePopularityRank[] sCLiveBattle = new LiveDistrictRankFinalBattle$SCLiveBattlePopularityRank[0];
             LiveDistrictRankFinalBattle$SCLiveBattlePopularityRank._emptyArray = sCLiveBattle;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveDistrictRankFinalBattle$SCLiveBattlePopularityRank._emptyArray;
    }
    public static LiveDistrictRankFinalBattle$SCLiveBattlePopularityRank parseFrom(CodedInputByteBufferNano p0){
       return new LiveDistrictRankFinalBattle$SCLiveBattlePopularityRank().mergeFrom(p0);
    }
    public static LiveDistrictRankFinalBattle$SCLiveBattlePopularityRank parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveDistrictRankFinalBattle$SCLiveBattlePopularityRank(), p0);
    }
    public LiveDistrictRankFinalBattle$SCLiveBattlePopularityRank clear(){
       this.battleDistrictRankEndTime = 0;
       this.battleDistrictRankFold = null;
       this.battleDistrictRankUnfold = null;
       this.nextUnfoldTime = 0;
       this.unfoldDuration = 0;
       this.popularityRankType = 0;
       this.unfoldInterval = 0;
       this.waitEndTimestamp = 0;
       this.waitDescribeText = null;
       this.waitCountDownText = null;
       this.waitRemindText = null;
       this.waitDisplayEndDurationMs = 0;
       this.waitCountDownColor = "";
       this.shouldClose = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveDistrictRankFinalBattle$SCLiveBattlePopularityRank tbattleDistr = this.battleDistrictRankEndTime;
       int i1 = 0;
       if (tbattleDistr - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(1, tbattleDistr);
       }
       tbattleDistr = this.battleDistrictRankFold;
       if (tbattleDistr != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tbattleDistr);
       }
       tbattleDistr = this.battleDistrictRankUnfold;
       if (tbattleDistr != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tbattleDistr);
       }
       tbattleDistr = this.nextUnfoldTime;
       if (tbattleDistr - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(4, tbattleDistr);
       }
       tbattleDistr = this.unfoldDuration;
       if (tbattleDistr - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(5, tbattleDistr);
       }
       tbattleDistr = this.popularityRankType;
       if (tbattleDistr != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tbattleDistr);
       }
       tbattleDistr = this.unfoldInterval;
       if (tbattleDistr - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(7, tbattleDistr);
       }
       tbattleDistr = this.waitEndTimestamp;
       if (tbattleDistr - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(8, tbattleDistr);
       }
       tbattleDistr = this.waitDescribeText;
       if (tbattleDistr != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, tbattleDistr);
       }
       tbattleDistr = this.waitCountDownText;
       if (tbattleDistr != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(10, tbattleDistr);
       }
       tbattleDistr = this.waitRemindText;
       if (tbattleDistr != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(11, tbattleDistr);
       }
       tbattleDistr = this.waitDisplayEndDurationMs;
       if (tbattleDistr - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(12, tbattleDistr);
       }
       if (!(this.waitCountDownColor).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.waitCountDownColor);
       }
       tbattleDistr = this.shouldClose;
       if (tbattleDistr != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(14, tbattleDistr);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveDistrictRankFinalBattle$SCLiveBattlePopularityRank mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
                this.battleDistrictRankEndTime = p0.readInt64();
                break;
              case 18:
                if (this.battleDistrictRankFold == null) {
                   this.battleDistrictRankFold = new LiveDistrictRankFinalBattle$BattleDistrictRankFold();
                }
                p0.readMessage(this.battleDistrictRankFold);
                break;
              case 26:
                if (this.battleDistrictRankUnfold == null) {
                   this.battleDistrictRankUnfold = new LiveDistrictRankFinalBattle$BattleDistrictRankUnfold();
                }
                p0.readMessage(this.battleDistrictRankUnfold);
                break;
              case 32:
                this.nextUnfoldTime = p0.readInt64();
                break;
              case '(':
                this.unfoldDuration = p0.readInt64();
                break;
              case '0':
                this.popularityRankType = p0.readUInt32();
                break;
              case '8':
                this.unfoldInterval = p0.readInt64();
                break;
              case '@':
                this.waitEndTimestamp = p0.readInt64();
                break;
              case 'J':
                if (this.waitDescribeText == null) {
                   this.waitDescribeText = new LiveDistrictRankFinalBattle$ContentWithStyle();
                }
                p0.readMessage(this.waitDescribeText);
                break;
              case 'R':
                if (this.waitCountDownText == null) {
                   this.waitCountDownText = new LiveDistrictRankFinalBattle$ContentWithStyle();
                }
                p0.readMessage(this.waitCountDownText);
                break;
              case 'Z':
                if (this.waitRemindText == null) {
                   this.waitRemindText = new LiveDistrictRankFinalBattle$ContentWithStyle();
                }
                p0.readMessage(this.waitRemindText);
                break;
              case '`':
                this.waitDisplayEndDurationMs = p0.readInt64();
                break;
              case 'j':
                this.waitCountDownColor = p0.readString();
                break;
              case 'p':
                this.shouldClose = p0.readBool();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveDistrictRankFinalBattle$SCLiveBattlePopularityRank tbattleDistr = this.battleDistrictRankEndTime;
       int i = 0;
       if (tbattleDistr - i) {
          p0.writeInt64(1, tbattleDistr);
       }
       tbattleDistr = this.battleDistrictRankFold;
       if (tbattleDistr != null) {
          p0.writeMessage(2, tbattleDistr);
       }
       tbattleDistr = this.battleDistrictRankUnfold;
       if (tbattleDistr != null) {
          p0.writeMessage(3, tbattleDistr);
       }
       tbattleDistr = this.nextUnfoldTime;
       if (tbattleDistr - i) {
          p0.writeInt64(4, tbattleDistr);
       }
       tbattleDistr = this.unfoldDuration;
       if (tbattleDistr - i) {
          p0.writeInt64(5, tbattleDistr);
       }
       tbattleDistr = this.popularityRankType;
       if (tbattleDistr != null) {
          p0.writeUInt32(6, tbattleDistr);
       }
       tbattleDistr = this.unfoldInterval;
       if (tbattleDistr - i) {
          p0.writeInt64(7, tbattleDistr);
       }
       tbattleDistr = this.waitEndTimestamp;
       if (tbattleDistr - i) {
          p0.writeInt64(8, tbattleDistr);
       }
       tbattleDistr = this.waitDescribeText;
       if (tbattleDistr != null) {
          p0.writeMessage(9, tbattleDistr);
       }
       tbattleDistr = this.waitCountDownText;
       if (tbattleDistr != null) {
          p0.writeMessage(10, tbattleDistr);
       }
       tbattleDistr = this.waitRemindText;
       if (tbattleDistr != null) {
          p0.writeMessage(11, tbattleDistr);
       }
       tbattleDistr = this.waitDisplayEndDurationMs;
       if (tbattleDistr - i) {
          p0.writeInt64(12, tbattleDistr);
       }
       if (!(this.waitCountDownColor).equals("")) {
          p0.writeString(13, this.waitCountDownColor);
       }
       tbattleDistr = this.shouldClose;
       if (tbattleDistr != null) {
          p0.writeBool(14, tbattleDistr);
       }
       super.writeTo(p0);
       return;
    }
}