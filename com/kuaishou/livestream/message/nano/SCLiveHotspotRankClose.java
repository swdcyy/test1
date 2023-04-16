package com.kuaishou.livestream.message.nano.SCLiveHotspotRankClose;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveHotspotRankClose extends MessageNano	// class@001426
{
    public long timestamp;
    public static SCLiveHotspotRankClose[] _emptyArray;

    public void SCLiveHotspotRankClose(){
       super();
       this.clear();
    }
    public static SCLiveHotspotRankClose[] emptyArray(){
       if (SCLiveHotspotRankClose._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveHotspotRankClose._emptyArray == null) {
             SCLiveHotspotRankClose[] sCLiveHotspo = new SCLiveHotspotRankClose[0];
             SCLiveHotspotRankClose._emptyArray = sCLiveHotspo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveHotspotRankClose._emptyArray;
    }
    public static SCLiveHotspotRankClose parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveHotspotRankClose().mergeFrom(p0);
    }
    public static SCLiveHotspotRankClose parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveHotspotRankClose(), p0);
    }
    public SCLiveHotspotRankClose clear(){
       this.timestamp = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveHotspotRankClose ttimestamp = this.timestamp;
       if (ttimestamp) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttimestamp);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveHotspotRankClose mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             this.timestamp = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCLiveHotspotRankClose ttimestamp = this.timestamp;
       if (ttimestamp) {
          p0.writeUInt64(1, ttimestamp);
       }
       super.writeTo(p0);
       return;
    }
}
