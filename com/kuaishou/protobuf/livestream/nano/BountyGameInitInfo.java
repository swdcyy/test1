package com.kuaishou.protobuf.livestream.nano.BountyGameInitInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class BountyGameInitInfo extends MessageNano	// class@000c05
{
    public String currentRoundEndShortTips;
    public long currentRoundEndTime;
    public String currentRoundEndTips;
    public String jumpUrl;
    public boolean meetBountyGameCondition;
    public String notMeetBountyGameConditionShortTips;
    public String notMeetBountyGameConditionTips;
    public String scoreEnoughShortTips;
    public String scoreEnoughTips;
    public String scoreNotEnoughShortTips;
    public String scoreNotEnoughTips;
    public long serverTimestamp;
    public long winBountyMinScore;
    public static BountyGameInitInfo[] _emptyArray;

    public void BountyGameInitInfo(){
       super();
       this.clear();
    }
    public static BountyGameInitInfo[] emptyArray(){
       if (BountyGameInitInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (BountyGameInitInfo._emptyArray == null) {
             BountyGameInitInfo[] uBountyGameI = new BountyGameInitInfo[0];
             BountyGameInitInfo._emptyArray = uBountyGameI;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return BountyGameInitInfo._emptyArray;
    }
    public static BountyGameInitInfo parseFrom(CodedInputByteBufferNano p0){
       return new BountyGameInitInfo().mergeFrom(p0);
    }
    public static BountyGameInitInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new BountyGameInitInfo(), p0);
    }
    public BountyGameInitInfo clear(){
       this.meetBountyGameCondition = false;
       this.currentRoundEndTime = 0;
       this.winBountyMinScore = 0;
       this.scoreNotEnoughTips = "";
       this.scoreNotEnoughShortTips = "";
       this.scoreEnoughTips = "";
       this.scoreEnoughShortTips = "";
       this.notMeetBountyGameConditionTips = "";
       this.notMeetBountyGameConditionShortTips = "";
       this.currentRoundEndTips = "";
       this.currentRoundEndShortTips = "";
       this.jumpUrl = "";
       this.serverTimestamp = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       BountyGameInitInfo tmeetBountyG = this.meetBountyGameCondition;
       if (tmeetBountyG != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tmeetBountyG);
       }
       tmeetBountyG = this.currentRoundEndTime;
       int i1 = 0;
       if (tmeetBountyG - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tmeetBountyG);
       }
       tmeetBountyG = this.winBountyMinScore;
       if (tmeetBountyG - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tmeetBountyG);
       }
       String str = "";
       if (!(this.scoreNotEnoughTips).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.scoreNotEnoughTips);
       }
       if (!(this.scoreNotEnoughShortTips).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.scoreNotEnoughShortTips);
       }
       if (!(this.scoreEnoughTips).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.scoreEnoughTips);
       }
       if (!(this.scoreEnoughShortTips).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.scoreEnoughShortTips);
       }
       if (!(this.notMeetBountyGameConditionTips).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.notMeetBountyGameConditionTips);
       }
       if (!(this.notMeetBountyGameConditionShortTips).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.notMeetBountyGameConditionShortTips);
       }
       if (!(this.currentRoundEndTips).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.currentRoundEndTips);
       }
       if (!(this.currentRoundEndShortTips).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.currentRoundEndShortTips);
       }
       if (!(this.jumpUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.jumpUrl);
       }
       tmeetBountyG = this.serverTimestamp;
       if (tmeetBountyG - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(13, tmeetBountyG);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public BountyGameInitInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
                this.meetBountyGameCondition = p0.readBool();
                break;
              case 16:
                this.currentRoundEndTime = p0.readUInt64();
                break;
              case 24:
                this.winBountyMinScore = p0.readUInt64();
                break;
              case '"':
                this.scoreNotEnoughTips = p0.readString();
                break;
              case '*':
                this.scoreNotEnoughShortTips = p0.readString();
                break;
              case '2':
                this.scoreEnoughTips = p0.readString();
                break;
              case ':':
                this.scoreEnoughShortTips = p0.readString();
                break;
              case 'B':
                this.notMeetBountyGameConditionTips = p0.readString();
                break;
              case 'J':
                this.notMeetBountyGameConditionShortTips = p0.readString();
                break;
              case 'R':
                this.currentRoundEndTips = p0.readString();
                break;
              case 'Z':
                this.currentRoundEndShortTips = p0.readString();
                break;
              case 'b':
                this.jumpUrl = p0.readString();
                break;
              case 'h':
                this.serverTimestamp = p0.readUInt64();
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
       BountyGameInitInfo tmeetBountyG = this.meetBountyGameCondition;
       if (tmeetBountyG != null) {
          p0.writeBool(1, tmeetBountyG);
       }
       tmeetBountyG = this.currentRoundEndTime;
       int i = 0;
       if (tmeetBountyG - i) {
          p0.writeUInt64(2, tmeetBountyG);
       }
       tmeetBountyG = this.winBountyMinScore;
       if (tmeetBountyG - i) {
          p0.writeUInt64(3, tmeetBountyG);
       }
       String str = "";
       if (!(this.scoreNotEnoughTips).equals(str)) {
          p0.writeString(4, this.scoreNotEnoughTips);
       }
       if (!(this.scoreNotEnoughShortTips).equals(str)) {
          p0.writeString(5, this.scoreNotEnoughShortTips);
       }
       if (!(this.scoreEnoughTips).equals(str)) {
          p0.writeString(6, this.scoreEnoughTips);
       }
       if (!(this.scoreEnoughShortTips).equals(str)) {
          p0.writeString(7, this.scoreEnoughShortTips);
       }
       if (!(this.notMeetBountyGameConditionTips).equals(str)) {
          p0.writeString(8, this.notMeetBountyGameConditionTips);
       }
       if (!(this.notMeetBountyGameConditionShortTips).equals(str)) {
          p0.writeString(9, this.notMeetBountyGameConditionShortTips);
       }
       if (!(this.currentRoundEndTips).equals(str)) {
          p0.writeString(10, this.currentRoundEndTips);
       }
       if (!(this.currentRoundEndShortTips).equals(str)) {
          p0.writeString(11, this.currentRoundEndShortTips);
       }
       if (!(this.jumpUrl).equals(str)) {
          p0.writeString(12, this.jumpUrl);
       }
       tmeetBountyG = this.serverTimestamp;
       if (tmeetBountyG - i) {
          p0.writeUInt64(13, tmeetBountyG);
       }
       super.writeTo(p0);
       return;
    }
}
