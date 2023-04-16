package com.kuaishou.livestream.message.nano.SCLiveEncourageTreasureBoxRewardCartoon;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveEncourageTreasureBoxRewardCartoon extends MessageNano	// class@00141b
{
    public long rewardAmount;
    public int showSeconds;
    public long taskId;
    public String text;
    public static SCLiveEncourageTreasureBoxRewardCartoon[] _emptyArray;

    public void SCLiveEncourageTreasureBoxRewardCartoon(){
       super();
       this.clear();
    }
    public static SCLiveEncourageTreasureBoxRewardCartoon[] emptyArray(){
       if (SCLiveEncourageTreasureBoxRewardCartoon._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveEncourageTreasureBoxRewardCartoon._emptyArray == null) {
             SCLiveEncourageTreasureBoxRewardCartoon[] sCLiveEncour = new SCLiveEncourageTreasureBoxRewardCartoon[0];
             SCLiveEncourageTreasureBoxRewardCartoon._emptyArray = sCLiveEncour;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveEncourageTreasureBoxRewardCartoon._emptyArray;
    }
    public static SCLiveEncourageTreasureBoxRewardCartoon parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveEncourageTreasureBoxRewardCartoon().mergeFrom(p0);
    }
    public static SCLiveEncourageTreasureBoxRewardCartoon parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveEncourageTreasureBoxRewardCartoon(), p0);
    }
    public SCLiveEncourageTreasureBoxRewardCartoon clear(){
       this.taskId = 0;
       this.rewardAmount = 0;
       this.text = "";
       this.showSeconds = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveEncourageTreasureBoxRewardCartoon ttaskId = this.taskId;
       int i1 = 0;
       if (ttaskId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttaskId);
       }
       ttaskId = this.rewardAmount;
       if (ttaskId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttaskId);
       }
       if (!(this.text).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.text);
       }
       ttaskId = this.showSeconds;
       if (ttaskId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, ttaskId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveEncourageTreasureBoxRewardCartoon mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.showSeconds = p0.readUInt32();
                   }
                }else {
                   this.text = p0.readString();
                }
             }else {
                this.rewardAmount = p0.readUInt64();
             }
          }else {
             this.taskId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCLiveEncourageTreasureBoxRewardCartoon ttaskId = this.taskId;
       int i = 0;
       if (ttaskId - i) {
          p0.writeUInt64(1, ttaskId);
       }
       ttaskId = this.rewardAmount;
       if (ttaskId - i) {
          p0.writeUInt64(2, ttaskId);
       }
       if (!(this.text).equals("")) {
          p0.writeString(3, this.text);
       }
       ttaskId = this.showSeconds;
       if (ttaskId != null) {
          p0.writeUInt32(4, ttaskId);
       }
       super.writeTo(p0);
       return;
    }
}
