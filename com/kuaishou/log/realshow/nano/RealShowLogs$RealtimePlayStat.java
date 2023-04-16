package com.kuaishou.log.realshow.nano.RealShowLogs$RealtimePlayStat;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class RealShowLogs$RealtimePlayStat extends MessageNano	// class@0014b5
{
    public long commentStayDuration;
    public long duration;
    public String photoId;
    public long playedDuration;
    public long prepareDuration;
    public static RealShowLogs$RealtimePlayStat[] _emptyArray;

    public void RealShowLogs$RealtimePlayStat(){
       super();
       this.clear();
    }
    public static RealShowLogs$RealtimePlayStat[] emptyArray(){
       if (RealShowLogs$RealtimePlayStat._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (RealShowLogs$RealtimePlayStat._emptyArray == null) {
             RealShowLogs$RealtimePlayStat[] realtimePlay = new RealShowLogs$RealtimePlayStat[0];
             RealShowLogs$RealtimePlayStat._emptyArray = realtimePlay;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return RealShowLogs$RealtimePlayStat._emptyArray;
    }
    public static RealShowLogs$RealtimePlayStat parseFrom(CodedInputByteBufferNano p0){
       return new RealShowLogs$RealtimePlayStat().mergeFrom(p0);
    }
    public static RealShowLogs$RealtimePlayStat parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new RealShowLogs$RealtimePlayStat(), p0);
    }
    public RealShowLogs$RealtimePlayStat clear(){
       this.duration = 0;
       this.playedDuration = 0;
       this.prepareDuration = 0;
       this.commentStayDuration = 0;
       this.photoId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       RealShowLogs$RealtimePlayStat tduration = this.duration;
       int i1 = 0;
       if (tduration - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tduration);
       }
       tduration = this.playedDuration;
       if (tduration - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tduration);
       }
       tduration = this.prepareDuration;
       if (tduration - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tduration);
       }
       tduration = this.commentStayDuration;
       if (tduration - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tduration);
       }
       if (!(this.photoId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.photoId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public RealShowLogs$RealtimePlayStat mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 32) {
                   if (i != 40) {
                      if (i != 50) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.photoId = p0.readString();
                      }
                   }else {
                      this.commentStayDuration = p0.readUInt64();
                   }
                }else {
                   this.prepareDuration = p0.readUInt64();
                }
             }else {
                this.playedDuration = p0.readUInt64();
             }
          }else {
             this.duration = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       RealShowLogs$RealtimePlayStat tduration = this.duration;
       int i = 0;
       if (tduration - i) {
          p0.writeUInt64(1, tduration);
       }
       tduration = this.playedDuration;
       if (tduration - i) {
          p0.writeUInt64(2, tduration);
       }
       tduration = this.prepareDuration;
       if (tduration - i) {
          p0.writeUInt64(4, tduration);
       }
       tduration = this.commentStayDuration;
       if (tduration - i) {
          p0.writeUInt64(5, tduration);
       }
       if (!(this.photoId).equals("")) {
          p0.writeString(6, this.photoId);
       }
       super.writeTo(p0);
       return;
    }
}
