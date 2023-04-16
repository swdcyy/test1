package com.kuaishou.livestream.message.nano.LiveSegmentMessages$LiveSegmentFeedInfoResponse;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveSegmentMessages$LiveSegmentFeedInfo;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveSegmentMessages$LiveSegmentFeedInfoResponse extends MessageNano	// class@001298
{
    public String cursor;
    public LiveSegmentMessages$LiveSegmentFeedInfo[] feedInfo;
    public static LiveSegmentMessages$LiveSegmentFeedInfoResponse[] _emptyArray;

    public void LiveSegmentMessages$LiveSegmentFeedInfoResponse(){
       super();
       this.clear();
    }
    public static LiveSegmentMessages$LiveSegmentFeedInfoResponse[] emptyArray(){
       if (LiveSegmentMessages$LiveSegmentFeedInfoResponse._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveSegmentMessages$LiveSegmentFeedInfoResponse._emptyArray == null) {
             LiveSegmentMessages$LiveSegmentFeedInfoResponse[] liveSegmentF = new LiveSegmentMessages$LiveSegmentFeedInfoResponse[0];
             LiveSegmentMessages$LiveSegmentFeedInfoResponse._emptyArray = liveSegmentF;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveSegmentMessages$LiveSegmentFeedInfoResponse._emptyArray;
    }
    public static LiveSegmentMessages$LiveSegmentFeedInfoResponse parseFrom(CodedInputByteBufferNano p0){
       return new LiveSegmentMessages$LiveSegmentFeedInfoResponse().mergeFrom(p0);
    }
    public static LiveSegmentMessages$LiveSegmentFeedInfoResponse parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveSegmentMessages$LiveSegmentFeedInfoResponse(), p0);
    }
    public LiveSegmentMessages$LiveSegmentFeedInfoResponse clear(){
       this.feedInfo = LiveSegmentMessages$LiveSegmentFeedInfo.emptyArray();
       this.cursor = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveSegmentMessages$LiveSegmentFeedInfoResponse tLiveSegment = this.feedInfo;
       if (tLiveSegment != null && tLiveSegment.length > 0) {
          int i1 = 0;
          LiveSegmentMessages$LiveSegmentFeedInfoResponse tLiveSegment1 = this.feedInfo;
          while (i1 < tLiveSegment1.length) {
             object oobject = tLiveSegment1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.cursor).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.cursor);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveSegmentMessages$LiveSegmentFeedInfoResponse mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.cursor = p0.readString();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             LiveSegmentMessages$LiveSegmentFeedInfoResponse tLiveSegment = this.feedInfo;
             int i2 = (tLiveSegment == null)? 0: tLiveSegment.length;
             i = i + i2;
             LiveSegmentMessages$LiveSegmentFeedInfo[] liveSegmentF = new LiveSegmentMessages$LiveSegmentFeedInfo[i];
             if (i2) {
                System.arraycopy(tLiveSegment, 0, liveSegmentF, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                liveSegmentF[i2] = new LiveSegmentMessages$LiveSegmentFeedInfo();
                p0.readMessage(liveSegmentF[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             liveSegmentF[i2] = new LiveSegmentMessages$LiveSegmentFeedInfo();
             p0.readMessage(liveSegmentF[i2]);
             this.feedInfo = liveSegmentF;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveSegmentMessages$LiveSegmentFeedInfoResponse tLiveSegment = this.feedInfo;
       if (tLiveSegment != null && tLiveSegment.length > 0) {
          int i = 0;
          LiveSegmentMessages$LiveSegmentFeedInfoResponse tLiveSegment1 = this.feedInfo;
          while (i < tLiveSegment1.length) {
             object oobject = tLiveSegment1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.cursor).equals("")) {
          p0.writeString(2, this.cursor);
       }
       super.writeTo(p0);
       return;
    }
}
