package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveDistrictRankClosed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCLiveDistrictRankClosed extends MessageNano	// class@001345
{
    public String liveStreamId;
    public static LiveStreamMessages$SCLiveDistrictRankClosed[] _emptyArray;

    public void LiveStreamMessages$SCLiveDistrictRankClosed(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCLiveDistrictRankClosed[] emptyArray(){
       if (LiveStreamMessages$SCLiveDistrictRankClosed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCLiveDistrictRankClosed._emptyArray == null) {
             LiveStreamMessages$SCLiveDistrictRankClosed[] sCLiveDistri = new LiveStreamMessages$SCLiveDistrictRankClosed[0];
             LiveStreamMessages$SCLiveDistrictRankClosed._emptyArray = sCLiveDistri;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCLiveDistrictRankClosed._emptyArray;
    }
    public static LiveStreamMessages$SCLiveDistrictRankClosed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCLiveDistrictRankClosed().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCLiveDistrictRankClosed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCLiveDistrictRankClosed(), p0);
    }
    public LiveStreamMessages$SCLiveDistrictRankClosed clear(){
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
    public LiveStreamMessages$SCLiveDistrictRankClosed mergeFrom(CodedInputByteBufferNano p0){
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