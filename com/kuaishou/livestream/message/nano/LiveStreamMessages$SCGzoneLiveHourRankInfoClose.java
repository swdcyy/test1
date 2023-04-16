package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCGzoneLiveHourRankInfoClose;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCGzoneLiveHourRankInfoClose extends MessageNano	// class@001334
{
    public String liveStreamId;
    public static LiveStreamMessages$SCGzoneLiveHourRankInfoClose[] _emptyArray;

    public void LiveStreamMessages$SCGzoneLiveHourRankInfoClose(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCGzoneLiveHourRankInfoClose[] emptyArray(){
       if (LiveStreamMessages$SCGzoneLiveHourRankInfoClose._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCGzoneLiveHourRankInfoClose._emptyArray == null) {
             LiveStreamMessages$SCGzoneLiveHourRankInfoClose[] sCGzoneLiveH = new LiveStreamMessages$SCGzoneLiveHourRankInfoClose[0];
             LiveStreamMessages$SCGzoneLiveHourRankInfoClose._emptyArray = sCGzoneLiveH;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCGzoneLiveHourRankInfoClose._emptyArray;
    }
    public static LiveStreamMessages$SCGzoneLiveHourRankInfoClose parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCGzoneLiveHourRankInfoClose().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCGzoneLiveHourRankInfoClose parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCGzoneLiveHourRankInfoClose(), p0);
    }
    public LiveStreamMessages$SCGzoneLiveHourRankInfoClose clear(){
       this.liveStreamId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.liveStreamId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCGzoneLiveHourRankInfoClose mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.liveStreamId).equals("")) {
          p0.writeString(1, this.liveStreamId);
       }
       super.writeTo(p0);
       return;
    }
}
