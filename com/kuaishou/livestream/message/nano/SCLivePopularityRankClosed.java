package com.kuaishou.livestream.message.nano.SCLivePopularityRankClosed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLivePopularityRankClosed extends MessageNano	// class@001433
{
    public String liveStreamId;
    public static SCLivePopularityRankClosed[] _emptyArray;

    public void SCLivePopularityRankClosed(){
       super();
       this.clear();
    }
    public static SCLivePopularityRankClosed[] emptyArray(){
       if (SCLivePopularityRankClosed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLivePopularityRankClosed._emptyArray == null) {
             SCLivePopularityRankClosed[] sCLivePopula = new SCLivePopularityRankClosed[0];
             SCLivePopularityRankClosed._emptyArray = sCLivePopula;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLivePopularityRankClosed._emptyArray;
    }
    public static SCLivePopularityRankClosed parseFrom(CodedInputByteBufferNano p0){
       return new SCLivePopularityRankClosed().mergeFrom(p0);
    }
    public static SCLivePopularityRankClosed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLivePopularityRankClosed(), p0);
    }
    public SCLivePopularityRankClosed clear(){
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
    public SCLivePopularityRankClosed mergeFrom(CodedInputByteBufferNano p0){
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
