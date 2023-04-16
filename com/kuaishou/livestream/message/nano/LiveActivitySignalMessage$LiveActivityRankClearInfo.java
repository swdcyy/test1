package com.kuaishou.livestream.message.nano.LiveActivitySignalMessage$LiveActivityRankClearInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveActivitySignalMessage$LiveActivityRankClearInfo extends MessageNano	// class@0010c9
{
    public String activityId;
    public String liveStreamId;
    public static LiveActivitySignalMessage$LiveActivityRankClearInfo[] _emptyArray;

    public void LiveActivitySignalMessage$LiveActivityRankClearInfo(){
       super();
       this.clear();
    }
    public static LiveActivitySignalMessage$LiveActivityRankClearInfo[] emptyArray(){
       if (LiveActivitySignalMessage$LiveActivityRankClearInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveActivitySignalMessage$LiveActivityRankClearInfo._emptyArray == null) {
             LiveActivitySignalMessage$LiveActivityRankClearInfo[] liveActivity = new LiveActivitySignalMessage$LiveActivityRankClearInfo[0];
             LiveActivitySignalMessage$LiveActivityRankClearInfo._emptyArray = liveActivity;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveActivitySignalMessage$LiveActivityRankClearInfo._emptyArray;
    }
    public static LiveActivitySignalMessage$LiveActivityRankClearInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveActivitySignalMessage$LiveActivityRankClearInfo().mergeFrom(p0);
    }
    public static LiveActivitySignalMessage$LiveActivityRankClearInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveActivitySignalMessage$LiveActivityRankClearInfo(), p0);
    }
    public LiveActivitySignalMessage$LiveActivityRankClearInfo clear(){
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
    public LiveActivitySignalMessage$LiveActivityRankClearInfo mergeFrom(CodedInputByteBufferNano p0){
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
