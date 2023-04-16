package com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattleForTk$SCLiveBattleDistrictRankForTk;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveDistrictRankForTk$KdsInfo;

public final class LiveDistrictRankFinalBattleForTk$SCLiveBattleDistrictRankForTk extends MessageNano	// class@00118e
{
    public long battleDistrictRankEndTimestamp;
    public String extraInfo;
    public LiveDistrictRankForTk$KdsInfo kdsInfo;
    public long waitEndTimestamp;
    public static LiveDistrictRankFinalBattleForTk$SCLiveBattleDistrictRankForTk[] _emptyArray;

    public void LiveDistrictRankFinalBattleForTk$SCLiveBattleDistrictRankForTk(){
       super();
       this.clear();
    }
    public static LiveDistrictRankFinalBattleForTk$SCLiveBattleDistrictRankForTk[] emptyArray(){
       if (LiveDistrictRankFinalBattleForTk$SCLiveBattleDistrictRankForTk._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveDistrictRankFinalBattleForTk$SCLiveBattleDistrictRankForTk._emptyArray == null) {
             LiveDistrictRankFinalBattleForTk$SCLiveBattleDistrictRankForTk[] sCLiveBattle = new LiveDistrictRankFinalBattleForTk$SCLiveBattleDistrictRankForTk[0];
             LiveDistrictRankFinalBattleForTk$SCLiveBattleDistrictRankForTk._emptyArray = sCLiveBattle;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveDistrictRankFinalBattleForTk$SCLiveBattleDistrictRankForTk._emptyArray;
    }
    public static LiveDistrictRankFinalBattleForTk$SCLiveBattleDistrictRankForTk parseFrom(CodedInputByteBufferNano p0){
       return new LiveDistrictRankFinalBattleForTk$SCLiveBattleDistrictRankForTk().mergeFrom(p0);
    }
    public static LiveDistrictRankFinalBattleForTk$SCLiveBattleDistrictRankForTk parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveDistrictRankFinalBattleForTk$SCLiveBattleDistrictRankForTk(), p0);
    }
    public LiveDistrictRankFinalBattleForTk$SCLiveBattleDistrictRankForTk clear(){
       this.battleDistrictRankEndTimestamp = 0;
       this.waitEndTimestamp = 0;
       this.kdsInfo = null;
       this.extraInfo = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveDistrictRankFinalBattleForTk$SCLiveBattleDistrictRankForTk tbattleDistr = this.battleDistrictRankEndTimestamp;
       int i1 = 0;
       if (tbattleDistr - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(1, tbattleDistr);
       }
       tbattleDistr = this.waitEndTimestamp;
       if (tbattleDistr - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(2, tbattleDistr);
       }
       tbattleDistr = this.kdsInfo;
       if (tbattleDistr != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tbattleDistr);
       }
       if (!(this.extraInfo).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.extraInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveDistrictRankFinalBattleForTk$SCLiveBattleDistrictRankForTk mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.extraInfo = p0.readString();
                   }
                }else if(this.kdsInfo == null){
                   this.kdsInfo = new LiveDistrictRankForTk$KdsInfo();
                }
                p0.readMessage(this.kdsInfo);
             }else {
                this.waitEndTimestamp = p0.readInt64();
             }
          }else {
             this.battleDistrictRankEndTimestamp = p0.readInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveDistrictRankFinalBattleForTk$SCLiveBattleDistrictRankForTk tbattleDistr = this.battleDistrictRankEndTimestamp;
       int i = 0;
       if (tbattleDistr - i) {
          p0.writeInt64(1, tbattleDistr);
       }
       tbattleDistr = this.waitEndTimestamp;
       if (tbattleDistr - i) {
          p0.writeInt64(2, tbattleDistr);
       }
       tbattleDistr = this.kdsInfo;
       if (tbattleDistr != null) {
          p0.writeMessage(3, tbattleDistr);
       }
       if (!(this.extraInfo).equals("")) {
          p0.writeString(4, this.extraInfo);
       }
       super.writeTo(p0);
       return;
    }
}
