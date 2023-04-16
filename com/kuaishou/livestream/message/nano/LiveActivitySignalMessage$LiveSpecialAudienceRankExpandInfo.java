package com.kuaishou.livestream.message.nano.LiveActivitySignalMessage$LiveSpecialAudienceRankExpandInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveActivitySignalMessage$LiveSpecialAudienceRankExpandInfo extends MessageNano	// class@0010cb
{
    public String activityId;
    public long autoExpandDurationMillis;
    public String liveStreamId;
    public static LiveActivitySignalMessage$LiveSpecialAudienceRankExpandInfo[] _emptyArray;

    public void LiveActivitySignalMessage$LiveSpecialAudienceRankExpandInfo(){
       super();
       this.clear();
    }
    public static LiveActivitySignalMessage$LiveSpecialAudienceRankExpandInfo[] emptyArray(){
       if (LiveActivitySignalMessage$LiveSpecialAudienceRankExpandInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveActivitySignalMessage$LiveSpecialAudienceRankExpandInfo._emptyArray == null) {
             LiveActivitySignalMessage$LiveSpecialAudienceRankExpandInfo[] liveSpecialA = new LiveActivitySignalMessage$LiveSpecialAudienceRankExpandInfo[0];
             LiveActivitySignalMessage$LiveSpecialAudienceRankExpandInfo._emptyArray = liveSpecialA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveActivitySignalMessage$LiveSpecialAudienceRankExpandInfo._emptyArray;
    }
    public static LiveActivitySignalMessage$LiveSpecialAudienceRankExpandInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveActivitySignalMessage$LiveSpecialAudienceRankExpandInfo().mergeFrom(p0);
    }
    public static LiveActivitySignalMessage$LiveSpecialAudienceRankExpandInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveActivitySignalMessage$LiveSpecialAudienceRankExpandInfo(), p0);
    }
    public LiveActivitySignalMessage$LiveSpecialAudienceRankExpandInfo clear(){
       this.liveStreamId = "";
       this.activityId = "";
       this.autoExpandDurationMillis = 0;
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
       LiveActivitySignalMessage$LiveSpecialAudienceRankExpandInfo tautoExpandD = this.autoExpandDurationMillis;
       if (tautoExpandD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tautoExpandD);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveActivitySignalMessage$LiveSpecialAudienceRankExpandInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.autoExpandDurationMillis = p0.readUInt64();
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
       LiveActivitySignalMessage$LiveSpecialAudienceRankExpandInfo tautoExpandD = this.autoExpandDurationMillis;
       if (tautoExpandD) {
          p0.writeUInt64(3, tautoExpandD);
       }
       super.writeTo(p0);
       return;
    }
}
