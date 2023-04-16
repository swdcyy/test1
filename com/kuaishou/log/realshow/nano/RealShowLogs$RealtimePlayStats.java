package com.kuaishou.log.realshow.nano.RealShowLogs$RealtimePlayStats;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.log.realshow.nano.RealShowLogs$RealtimePlayStat;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class RealShowLogs$RealtimePlayStats extends MessageNano	// class@0014b6
{
    public RealShowLogs$RealtimePlayStat[] realtimePlayStat;
    public static RealShowLogs$RealtimePlayStats[] _emptyArray;

    public void RealShowLogs$RealtimePlayStats(){
       super();
       this.clear();
    }
    public static RealShowLogs$RealtimePlayStats[] emptyArray(){
       if (RealShowLogs$RealtimePlayStats._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (RealShowLogs$RealtimePlayStats._emptyArray == null) {
             RealShowLogs$RealtimePlayStats[] realtimePlay = new RealShowLogs$RealtimePlayStats[0];
             RealShowLogs$RealtimePlayStats._emptyArray = realtimePlay;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return RealShowLogs$RealtimePlayStats._emptyArray;
    }
    public static RealShowLogs$RealtimePlayStats parseFrom(CodedInputByteBufferNano p0){
       return new RealShowLogs$RealtimePlayStats().mergeFrom(p0);
    }
    public static RealShowLogs$RealtimePlayStats parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new RealShowLogs$RealtimePlayStats(), p0);
    }
    public RealShowLogs$RealtimePlayStats clear(){
       this.realtimePlayStat = RealShowLogs$RealtimePlayStat.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       RealShowLogs$RealtimePlayStats trealtimePla = this.realtimePlayStat;
       if (trealtimePla != null && trealtimePla.length > 0) {
          int i1 = 0;
          RealShowLogs$RealtimePlayStats trealtimePla1 = this.realtimePlayStat;
          while (i1 < trealtimePla1.length) {
             object oobject = trealtimePla1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public RealShowLogs$RealtimePlayStats mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             RealShowLogs$RealtimePlayStats trealtimePla = this.realtimePlayStat;
             int i2 = (trealtimePla == null)? 0: trealtimePla.length;
             i = i + i2;
             RealShowLogs$RealtimePlayStat[] realtimePlay = new RealShowLogs$RealtimePlayStat[i];
             if (i2) {
                System.arraycopy(trealtimePla, 0, realtimePlay, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                realtimePlay[i2] = new RealShowLogs$RealtimePlayStat();
                p0.readMessage(realtimePlay[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             realtimePlay[i2] = new RealShowLogs$RealtimePlayStat();
             p0.readMessage(realtimePlay[i2]);
             this.realtimePlayStat = realtimePlay;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       RealShowLogs$RealtimePlayStats trealtimePla = this.realtimePlayStat;
       if (trealtimePla != null && trealtimePla.length > 0) {
          int i = 0;
          RealShowLogs$RealtimePlayStats trealtimePla1 = this.realtimePlayStat;
          while (i < trealtimePla1.length) {
             object oobject = trealtimePla1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
