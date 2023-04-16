package com.kuaishou.livestream.message.nano.LiveActivitySignalMessage$LiveSpecialAudienceRankShrinkInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveActivitySignalMessage$LiveSpecialAudienceRankShrinkInfo extends MessageNano	// class@0010cd
{
    public String activityId;
    public String liveStreamId;
    public static LiveActivitySignalMessage$LiveSpecialAudienceRankShrinkInfo[] _emptyArray;

    public void LiveActivitySignalMessage$LiveSpecialAudienceRankShrinkInfo(){
       super();
       this.clear();
    }
    public static LiveActivitySignalMessage$LiveSpecialAudienceRankShrinkInfo[] emptyArray(){
       if (LiveActivitySignalMessage$LiveSpecialAudienceRankShrinkInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveActivitySignalMessage$LiveSpecialAudienceRankShrinkInfo._emptyArray == null) {
             LiveActivitySignalMessage$LiveSpecialAudienceRankShrinkInfo[] liveSpecialA = new LiveActivitySignalMessage$LiveSpecialAudienceRankShrinkInfo[0];
             LiveActivitySignalMessage$LiveSpecialAudienceRankShrinkInfo._emptyArray = liveSpecialA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveActivitySignalMessage$LiveSpecialAudienceRankShrinkInfo._emptyArray;
    }
    public static LiveActivitySignalMessage$LiveSpecialAudienceRankShrinkInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveActivitySignalMessage$LiveSpecialAudienceRankShrinkInfo().mergeFrom(p0);
    }
    public static LiveActivitySignalMessage$LiveSpecialAudienceRankShrinkInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveActivitySignalMessage$LiveSpecialAudienceRankShrinkInfo(), p0);
    }
    public LiveActivitySignalMessage$LiveSpecialAudienceRankShrinkInfo clear(){
       this.liveStreamId = "";
       this.activityId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       if (!(this.activityId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.activityId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveActivitySignalMessage$LiveSpecialAudienceRankShrinkInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.activityId = p0.readString();
             }
          }else {
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(1, this.liveStreamId);
       }
       if (!(this.activityId).equals(str)) {
          p0.writeString(2, this.activityId);
       }
       super.writeTo(p0);
       return;
    }
}
