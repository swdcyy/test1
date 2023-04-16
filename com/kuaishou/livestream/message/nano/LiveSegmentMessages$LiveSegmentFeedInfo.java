package com.kuaishou.livestream.message.nano.LiveSegmentMessages$LiveSegmentFeedInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveSegmentMessages$LiveSegmentReplayFeed;

public final class LiveSegmentMessages$LiveSegmentFeedInfo extends MessageNano	// class@001297
{
    public LiveSegmentMessages$LiveSegmentReplayFeed feed;
    public long segmentOffsetTime;
    public static LiveSegmentMessages$LiveSegmentFeedInfo[] _emptyArray;

    public void LiveSegmentMessages$LiveSegmentFeedInfo(){
       super();
       this.clear();
    }
    public static LiveSegmentMessages$LiveSegmentFeedInfo[] emptyArray(){
       if (LiveSegmentMessages$LiveSegmentFeedInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveSegmentMessages$LiveSegmentFeedInfo._emptyArray == null) {
             LiveSegmentMessages$LiveSegmentFeedInfo[] liveSegmentF = new LiveSegmentMessages$LiveSegmentFeedInfo[0];
             LiveSegmentMessages$LiveSegmentFeedInfo._emptyArray = liveSegmentF;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveSegmentMessages$LiveSegmentFeedInfo._emptyArray;
    }
    public static LiveSegmentMessages$LiveSegmentFeedInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveSegmentMessages$LiveSegmentFeedInfo().mergeFrom(p0);
    }
    public static LiveSegmentMessages$LiveSegmentFeedInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveSegmentMessages$LiveSegmentFeedInfo(), p0);
    }
    public LiveSegmentMessages$LiveSegmentFeedInfo clear(){
       this.feed = null;
       this.segmentOffsetTime = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveSegmentMessages$LiveSegmentFeedInfo tLiveSegment = this.feed;
       if (tLiveSegment != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tLiveSegment);
       }
       tLiveSegment = this.segmentOffsetTime;
       if (tLiveSegment) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tLiveSegment);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveSegmentMessages$LiveSegmentFeedInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.segmentOffsetTime = p0.readUInt64();
             }
          }else if(this.feed == null){
             this.feed = new LiveSegmentMessages$LiveSegmentReplayFeed();
          }
          p0.readMessage(this.feed);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveSegmentMessages$LiveSegmentFeedInfo tLiveSegment = this.feed;
       if (tLiveSegment != null) {
          p0.writeMessage(1, tLiveSegment);
       }
       tLiveSegment = this.segmentOffsetTime;
       if (tLiveSegment) {
          p0.writeUInt64(2, tLiveSegment);
       }
       super.writeTo(p0);
       return;
    }
}
