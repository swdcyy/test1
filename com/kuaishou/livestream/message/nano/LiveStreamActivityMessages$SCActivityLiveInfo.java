package com.kuaishou.livestream.message.nano.LiveStreamActivityMessages$SCActivityLiveInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamActivityMessages$SCActivityLiveInfo extends MessageNano	// class@0012b6
{
    public String accumulatedWatchCount;
    public String liteAccumulatedWatchCount;
    public String liveStreamId;
    public static LiveStreamActivityMessages$SCActivityLiveInfo[] _emptyArray;

    public void LiveStreamActivityMessages$SCActivityLiveInfo(){
       super();
       this.clear();
    }
    public static LiveStreamActivityMessages$SCActivityLiveInfo[] emptyArray(){
       if (LiveStreamActivityMessages$SCActivityLiveInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamActivityMessages$SCActivityLiveInfo._emptyArray == null) {
             LiveStreamActivityMessages$SCActivityLiveInfo[] sCActivityLi = new LiveStreamActivityMessages$SCActivityLiveInfo[0];
             LiveStreamActivityMessages$SCActivityLiveInfo._emptyArray = sCActivityLi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamActivityMessages$SCActivityLiveInfo._emptyArray;
    }
    public static LiveStreamActivityMessages$SCActivityLiveInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamActivityMessages$SCActivityLiveInfo().mergeFrom(p0);
    }
    public static LiveStreamActivityMessages$SCActivityLiveInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamActivityMessages$SCActivityLiveInfo(), p0);
    }
    public LiveStreamActivityMessages$SCActivityLiveInfo clear(){
       this.liveStreamId = "";
       this.accumulatedWatchCount = "";
       this.liteAccumulatedWatchCount = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       if (!(this.accumulatedWatchCount).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.accumulatedWatchCount);
       }
       if (!(this.liteAccumulatedWatchCount).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.liteAccumulatedWatchCount);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamActivityMessages$SCActivityLiveInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.liteAccumulatedWatchCount = p0.readString();
                }
             }else {
                this.accumulatedWatchCount = p0.readString();
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
       if (!(this.accumulatedWatchCount).equals(str)) {
          p0.writeString(2, this.accumulatedWatchCount);
       }
       if (!(this.liteAccumulatedWatchCount).equals(str)) {
          p0.writeString(3, this.liteAccumulatedWatchCount);
       }
       super.writeTo(p0);
       return;
    }
}
