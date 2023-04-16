package com.kuaishou.protobuf.livestream.nano.SCLiveMultiPkStatistic;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkTeam;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.System;

public final class SCLiveMultiPkStatistic extends MessageNano	// class@000d63
{
    public long[] enableShowRealScoreUser;
    public String pkId;
    public long pkInfoScatterDurationMs;
    public long statisticVersion;
    public LiveMultiPkTeam[] team;
    public long teamVersion;
    public long time;
    public static SCLiveMultiPkStatistic[] _emptyArray;

    public void SCLiveMultiPkStatistic(){
       super();
       this.clear();
    }
    public static SCLiveMultiPkStatistic[] emptyArray(){
       if (SCLiveMultiPkStatistic._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveMultiPkStatistic._emptyArray == null) {
             SCLiveMultiPkStatistic[] sCLiveMultiP = new SCLiveMultiPkStatistic[0];
             SCLiveMultiPkStatistic._emptyArray = sCLiveMultiP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveMultiPkStatistic._emptyArray;
    }
    public static SCLiveMultiPkStatistic parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveMultiPkStatistic().mergeFrom(p0);
    }
    public static SCLiveMultiPkStatistic parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveMultiPkStatistic(), p0);
    }
    public SCLiveMultiPkStatistic clear(){
       this.pkId = "";
       this.time = 0;
       this.team = LiveMultiPkTeam.emptyArray();
       this.enableShowRealScoreUser = WireFormatNano.EMPTY_LONG_ARRAY;
       this.pkInfoScatterDurationMs = 0;
       this.teamVersion = 0;
       this.statisticVersion = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       SCLiveMultiPkStatistic tteam1;
       int i = super.computeSerializedSize();
       if (!(this.pkId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.pkId);
       }
       SCLiveMultiPkStatistic ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttime);
       }
       SCLiveMultiPkStatistic tteam = this.team;
       int i1 = 0;
       if (tteam != null && tteam.length > 0) {
          i2 = 0;
          tteam1 = this.team;
          while (i2 < tteam1.length) {
             object oobject = tteam1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tteam = this.enableShowRealScoreUser;
       if (tteam != null && tteam.length > 0) {
          i2 = 0;
          tteam1 = this.enableShowRealScoreUser;
          while (i1 < tteam1.length) {
             i2 = i2 + CodedOutputByteBufferNano.computeUInt64SizeNoTag(tteam1[i1]);
             i1 = i1 + 1;
          }
          i = (i + i2) + (tteam1.length * 1);
       }
       tteam = this.pkInfoScatterDurationMs;
       if (tteam) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tteam);
       }
       tteam = this.teamVersion;
       if (tteam) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tteam);
       }
       tteam = this.statisticVersion;
       if (tteam) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tteam);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveMultiPkStatistic mergeFrom(CodedInputByteBufferNano p0){
       int i2;
       SCLiveMultiPkStatistic tenableShowR;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                int i1 = 26;
                if (i != i1) {
                   i1 = 32;
                   if (i != i1) {
                      if (i != 34) {
                         if (i != 40) {
                            if (i != 48) {
                               if (i != 56) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  this.statisticVersion = p0.readUInt64();
                               }
                            }else {
                               this.teamVersion = p0.readUInt64();
                            }
                         }else {
                            this.pkInfoScatterDurationMs = p0.readUInt64();
                         }
                      }else {
                         i = p0.pushLimit(p0.readRawVarint32());
                         i1 = p0.getPosition();
                         i2 = 0;
                         while (p0.getBytesUntilLimit() > 0) {
                            p0.readUInt64();
                            i2 = i2 + 1;
                         }
                         p0.rewindToPosition(i1);
                         tenableShowR = this.enableShowRealScoreUser;
                         int i3 = (tenableShowR == null)? 0: tenableShowR.length;
                         i2 = i2 + i3;
                         long[] olongArray = new long[i2];
                         if (i3) {
                            System.arraycopy(tenableShowR, 0, olongArray, 0, i3);
                         }
                         while (i3 < i2) {
                            olongArray[i3] = p0.readUInt64();
                            i3 = i3 + 1;
                         }
                         this.enableShowRealScoreUser = olongArray;
                         p0.popLimit(i);
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      tenableShowR = this.enableShowRealScoreUser;
                      i2 = (tenableShowR == null)? 0: tenableShowR.length;
                      i = i + i2;
                      long[] olongArray1 = new long[i];
                      if (i2) {
                         System.arraycopy(tenableShowR, 0, olongArray1, 0, i2);
                      }
                      i1 = i - 1;
                      while (i2 < i1) {
                         olongArray1[i2] = p0.readUInt64();
                         p0.readTag();
                         i2 = i2 + 1;
                      }
                      olongArray1[i2] = p0.readUInt64();
                      this.enableShowRealScoreUser = olongArray1;
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   tenableShowR = this.team;
                   i2 = (tenableShowR == null)? 0: tenableShowR.length;
                   i = i + i2;
                   LiveMultiPkTeam[] liveMultiPkT = new LiveMultiPkTeam[i];
                   if (i2) {
                      System.arraycopy(tenableShowR, 0, liveMultiPkT, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      liveMultiPkT[i2] = new LiveMultiPkTeam();
                      p0.readMessage(liveMultiPkT[i2]);
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   liveMultiPkT[i2] = new LiveMultiPkTeam();
                   p0.readMessage(liveMultiPkT[i2]);
                   this.team = liveMultiPkT;
                }
             }else {
                this.time = p0.readUInt64();
             }
          }else {
             this.pkId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.pkId).equals("")) {
          p0.writeString(1, this.pkId);
       }
       SCLiveMultiPkStatistic ttime = this.time;
       int i = 0;
       if (ttime - i) {
          p0.writeUInt64(2, ttime);
       }
       ttime = this.team;
       int i1 = 0;
       if (ttime != null && ttime.length > 0) {
          int i2 = 0;
          SCLiveMultiPkStatistic tteam = this.team;
          while (i2 < tteam.length) {
             object oobject = tteam[i2];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i2 = i2 + 1;
          }
       }
       ttime = this.enableShowRealScoreUser;
       if (ttime != null && ttime.length > 0) {
          ttime = this.enableShowRealScoreUser;
          while (i1 < ttime.length) {
             p0.writeUInt64(4, ttime[i1]);
             i1 = i1 + 1;
          }
       }
       ttime = this.pkInfoScatterDurationMs;
       if (ttime - i) {
          p0.writeUInt64(5, ttime);
       }
       ttime = this.teamVersion;
       if (ttime - i) {
          p0.writeUInt64(6, ttime);
       }
       ttime = this.statisticVersion;
       if (ttime - i) {
          p0.writeUInt64(7, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
