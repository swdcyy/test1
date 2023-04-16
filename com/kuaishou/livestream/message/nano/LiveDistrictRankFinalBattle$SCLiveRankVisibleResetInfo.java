package com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$SCLiveRankVisibleResetInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveDistrictRankFinalBattle$SCLiveRankVisibleResetInfo extends MessageNano	// class@001188
{
    public boolean districtRankBattleVisible;
    public boolean districtRankVisible;
    public boolean popularityRankBattleVisible;
    public boolean popularityRankVisible;
    public static LiveDistrictRankFinalBattle$SCLiveRankVisibleResetInfo[] _emptyArray;

    public void LiveDistrictRankFinalBattle$SCLiveRankVisibleResetInfo(){
       super();
       this.clear();
    }
    public static LiveDistrictRankFinalBattle$SCLiveRankVisibleResetInfo[] emptyArray(){
       if (LiveDistrictRankFinalBattle$SCLiveRankVisibleResetInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveDistrictRankFinalBattle$SCLiveRankVisibleResetInfo._emptyArray == null) {
             LiveDistrictRankFinalBattle$SCLiveRankVisibleResetInfo[] sCLiveRankVi = new LiveDistrictRankFinalBattle$SCLiveRankVisibleResetInfo[0];
             LiveDistrictRankFinalBattle$SCLiveRankVisibleResetInfo._emptyArray = sCLiveRankVi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveDistrictRankFinalBattle$SCLiveRankVisibleResetInfo._emptyArray;
    }
    public static LiveDistrictRankFinalBattle$SCLiveRankVisibleResetInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveDistrictRankFinalBattle$SCLiveRankVisibleResetInfo().mergeFrom(p0);
    }
    public static LiveDistrictRankFinalBattle$SCLiveRankVisibleResetInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveDistrictRankFinalBattle$SCLiveRankVisibleResetInfo(), p0);
    }
    public LiveDistrictRankFinalBattle$SCLiveRankVisibleResetInfo clear(){
       this.districtRankVisible = false;
       this.districtRankBattleVisible = false;
       this.popularityRankVisible = false;
       this.popularityRankBattleVisible = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveDistrictRankFinalBattle$SCLiveRankVisibleResetInfo tdistrictRan = this.districtRankVisible;
       if (tdistrictRan != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tdistrictRan);
       }
       tdistrictRan = this.districtRankBattleVisible;
       if (tdistrictRan != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tdistrictRan);
       }
       tdistrictRan = this.popularityRankVisible;
       if (tdistrictRan != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tdistrictRan);
       }
       tdistrictRan = this.popularityRankBattleVisible;
       if (tdistrictRan != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, tdistrictRan);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveDistrictRankFinalBattle$SCLiveRankVisibleResetInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.popularityRankBattleVisible = p0.readBool();
                   }
                }else {
                   this.popularityRankVisible = p0.readBool();
                }
             }else {
                this.districtRankBattleVisible = p0.readBool();
             }
          }else {
             this.districtRankVisible = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveDistrictRankFinalBattle$SCLiveRankVisibleResetInfo tdistrictRan = this.districtRankVisible;
       if (tdistrictRan != null) {
          p0.writeBool(1, tdistrictRan);
       }
       tdistrictRan = this.districtRankBattleVisible;
       if (tdistrictRan != null) {
          p0.writeBool(2, tdistrictRan);
       }
       tdistrictRan = this.popularityRankVisible;
       if (tdistrictRan != null) {
          p0.writeBool(3, tdistrictRan);
       }
       tdistrictRan = this.popularityRankBattleVisible;
       if (tdistrictRan != null) {
          p0.writeBool(4, tdistrictRan);
       }
       super.writeTo(p0);
       return;
    }
}
