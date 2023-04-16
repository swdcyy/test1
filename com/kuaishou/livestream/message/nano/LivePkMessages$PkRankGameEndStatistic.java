package com.kuaishou.livestream.message.nano.LivePkMessages$PkRankGameEndStatistic;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LivePkMessages$PkRankGameEndStatistic extends MessageNano	// class@00121c
{
    public int changeType;
    public long deltaScore;
    public String displayInfo;
    public int hardWorkingCount;
    public int reason;
    public static LivePkMessages$PkRankGameEndStatistic[] _emptyArray;

    public void LivePkMessages$PkRankGameEndStatistic(){
       super();
       this.clear();
    }
    public static LivePkMessages$PkRankGameEndStatistic[] emptyArray(){
       if (LivePkMessages$PkRankGameEndStatistic._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePkMessages$PkRankGameEndStatistic._emptyArray == null) {
             LivePkMessages$PkRankGameEndStatistic[] pkRankGameEn = new LivePkMessages$PkRankGameEndStatistic[0];
             LivePkMessages$PkRankGameEndStatistic._emptyArray = pkRankGameEn;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePkMessages$PkRankGameEndStatistic._emptyArray;
    }
    public static LivePkMessages$PkRankGameEndStatistic parseFrom(CodedInputByteBufferNano p0){
       return new LivePkMessages$PkRankGameEndStatistic().mergeFrom(p0);
    }
    public static LivePkMessages$PkRankGameEndStatistic parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePkMessages$PkRankGameEndStatistic(), p0);
    }
    public LivePkMessages$PkRankGameEndStatistic clear(){
       this.reason = 0;
       this.changeType = 0;
       this.deltaScore = 0;
       this.displayInfo = "";
       this.hardWorkingCount = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LivePkMessages$PkRankGameEndStatistic treason = this.reason;
       if (treason != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, treason);
       }
       treason = this.changeType;
       if (treason != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, treason);
       }
       treason = this.deltaScore;
       if (treason) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, treason);
       }
       if (!(this.displayInfo).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.displayInfo);
       }
       treason = this.hardWorkingCount;
       if (treason != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, treason);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePkMessages$PkRankGameEndStatistic mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.hardWorkingCount = p0.readUInt32();
                      }
                   }else {
                      this.displayInfo = p0.readString();
                   }
                }else {
                   this.deltaScore = p0.readUInt64();
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.changeType = i;
                }
             }
          }else {
             i = p0.readInt32();
             switch (i){
                 case 0:
                 case 2:
                 case 3:
                 case 4:
                 case 5:
                 case 6:
                 case 1:
                   break;
                 default:
             }
             this.reason = i;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LivePkMessages$PkRankGameEndStatistic treason = this.reason;
       if (treason != null) {
          p0.writeInt32(1, treason);
       }
       treason = this.changeType;
       if (treason != null) {
          p0.writeInt32(2, treason);
       }
       treason = this.deltaScore;
       if (treason) {
          p0.writeUInt64(3, treason);
       }
       if (!(this.displayInfo).equals("")) {
          p0.writeString(4, this.displayInfo);
       }
       treason = this.hardWorkingCount;
       if (treason != null) {
          p0.writeUInt32(5, treason);
       }
       super.writeTo(p0);
       return;
    }
}
