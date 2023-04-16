package com.kuaishou.log.realshow.nano.ClickLogs$ClickLog;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.log.realshow.nano.ClickLogs$ClickFeed;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClickLogs$ClickLog extends MessageNano	// class@0014a1
{
    public ClickLogs$ClickFeed[] feed;
    public static ClickLogs$ClickLog[] _emptyArray;

    public void ClickLogs$ClickLog(){
       super();
       this.clear();
    }
    public static ClickLogs$ClickLog[] emptyArray(){
       if (ClickLogs$ClickLog._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClickLogs$ClickLog._emptyArray == null) {
             ClickLogs$ClickLog[] uClickLogArr = new ClickLogs$ClickLog[0];
             ClickLogs$ClickLog._emptyArray = uClickLogArr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClickLogs$ClickLog._emptyArray;
    }
    public static ClickLogs$ClickLog parseFrom(CodedInputByteBufferNano p0){
       return new ClickLogs$ClickLog().mergeFrom(p0);
    }
    public static ClickLogs$ClickLog parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClickLogs$ClickLog(), p0);
    }
    public ClickLogs$ClickLog clear(){
       this.feed = ClickLogs$ClickFeed.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClickLogs$ClickLog tuClickLog = this.feed;
       if (tuClickLog != null && tuClickLog.length > 0) {
          int i1 = 0;
          ClickLogs$ClickLog tuClickLog1 = this.feed;
          while (i1 < tuClickLog1.length) {
             object oobject = tuClickLog1[i1];
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
    public ClickLogs$ClickLog mergeFrom(CodedInputByteBufferNano p0){
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
             ClickLogs$ClickLog tuClickLog = this.feed;
             int i2 = (tuClickLog == null)? 0: tuClickLog.length;
             i = i + i2;
             ClickLogs$ClickFeed[] uClickFeedAr = new ClickLogs$ClickFeed[i];
             if (i2) {
                System.arraycopy(tuClickLog, 0, uClickFeedAr, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                uClickFeedAr[i2] = new ClickLogs$ClickFeed();
                p0.readMessage(uClickFeedAr[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             uClickFeedAr[i2] = new ClickLogs$ClickFeed();
             p0.readMessage(uClickFeedAr[i2]);
             this.feed = uClickFeedAr;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClickLogs$ClickLog tuClickLog = this.feed;
       if (tuClickLog != null && tuClickLog.length > 0) {
          int i = 0;
          ClickLogs$ClickLog tuClickLog1 = this.feed;
          while (i < tuClickLog1.length) {
             object oobject = tuClickLog1[i];
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
