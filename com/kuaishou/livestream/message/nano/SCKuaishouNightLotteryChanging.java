package com.kuaishou.livestream.message.nano.SCKuaishouNightLotteryChanging;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCKuaishouNightLotteryChanging extends MessageNano	// class@0013fc
{
    public long maxDelayDeadlineTimeMs;
    public long maxDelayMs;
    public int maxRequestTimes;
    public static SCKuaishouNightLotteryChanging[] _emptyArray;

    public void SCKuaishouNightLotteryChanging(){
       super();
       this.clear();
    }
    public static SCKuaishouNightLotteryChanging[] emptyArray(){
       if (SCKuaishouNightLotteryChanging._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCKuaishouNightLotteryChanging._emptyArray == null) {
             SCKuaishouNightLotteryChanging[] sCKuaishouNi = new SCKuaishouNightLotteryChanging[0];
             SCKuaishouNightLotteryChanging._emptyArray = sCKuaishouNi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCKuaishouNightLotteryChanging._emptyArray;
    }
    public static SCKuaishouNightLotteryChanging parseFrom(CodedInputByteBufferNano p0){
       return new SCKuaishouNightLotteryChanging().mergeFrom(p0);
    }
    public static SCKuaishouNightLotteryChanging parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCKuaishouNightLotteryChanging(), p0);
    }
    public SCKuaishouNightLotteryChanging clear(){
       this.maxDelayDeadlineTimeMs = 0;
       this.maxDelayMs = 0;
       this.maxRequestTimes = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCKuaishouNightLotteryChanging tmaxDelayDea = this.maxDelayDeadlineTimeMs;
       int i1 = 0;
       if (tmaxDelayDea - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tmaxDelayDea);
       }
       tmaxDelayDea = this.maxDelayMs;
       if (tmaxDelayDea - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tmaxDelayDea);
       }
       tmaxDelayDea = this.maxRequestTimes;
       if (tmaxDelayDea != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tmaxDelayDea);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCKuaishouNightLotteryChanging mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.maxRequestTimes = p0.readUInt32();
                }
             }else {
                this.maxDelayMs = p0.readUInt64();
             }
          }else {
             this.maxDelayDeadlineTimeMs = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCKuaishouNightLotteryChanging tmaxDelayDea = this.maxDelayDeadlineTimeMs;
       int i = 0;
       if (tmaxDelayDea - i) {
          p0.writeUInt64(1, tmaxDelayDea);
       }
       tmaxDelayDea = this.maxDelayMs;
       if (tmaxDelayDea - i) {
          p0.writeUInt64(2, tmaxDelayDea);
       }
       tmaxDelayDea = this.maxRequestTimes;
       if (tmaxDelayDea != null) {
          p0.writeUInt32(3, tmaxDelayDea);
       }
       super.writeTo(p0);
       return;
    }
}
