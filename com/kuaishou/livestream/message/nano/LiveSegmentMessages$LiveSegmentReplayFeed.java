package com.kuaishou.livestream.message.nano.LiveSegmentMessages$LiveSegmentReplayFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

public final class LiveSegmentMessages$LiveSegmentReplayFeed extends MessageNano	// class@00129a
{
    public int compressionType;
    public long liveOffsetTime;
    public byte[] payload;
    public static LiveSegmentMessages$LiveSegmentReplayFeed[] _emptyArray;

    public void LiveSegmentMessages$LiveSegmentReplayFeed(){
       super();
       this.clear();
    }
    public static LiveSegmentMessages$LiveSegmentReplayFeed[] emptyArray(){
       if (LiveSegmentMessages$LiveSegmentReplayFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveSegmentMessages$LiveSegmentReplayFeed._emptyArray == null) {
             LiveSegmentMessages$LiveSegmentReplayFeed[] liveSegmentR = new LiveSegmentMessages$LiveSegmentReplayFeed[0];
             LiveSegmentMessages$LiveSegmentReplayFeed._emptyArray = liveSegmentR;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveSegmentMessages$LiveSegmentReplayFeed._emptyArray;
    }
    public static LiveSegmentMessages$LiveSegmentReplayFeed parseFrom(CodedInputByteBufferNano p0){
       return new LiveSegmentMessages$LiveSegmentReplayFeed().mergeFrom(p0);
    }
    public static LiveSegmentMessages$LiveSegmentReplayFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveSegmentMessages$LiveSegmentReplayFeed(), p0);
    }
    public LiveSegmentMessages$LiveSegmentReplayFeed clear(){
       this.compressionType = 0;
       this.payload = WireFormatNano.EMPTY_BYTES;
       this.liveOffsetTime = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveSegmentMessages$LiveSegmentReplayFeed tcompression = this.compressionType;
       if (tcompression != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tcompression);
       }
       if (!Arrays.equals(this.payload, WireFormatNano.EMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(2, this.payload);
       }
       tcompression = this.liveOffsetTime;
       if (tcompression) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tcompression);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveSegmentMessages$LiveSegmentReplayFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.liveOffsetTime = p0.readUInt64();
                }
             }else {
                this.payload = p0.readBytes();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.compressionType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveSegmentMessages$LiveSegmentReplayFeed tcompression = this.compressionType;
       if (tcompression != null) {
          p0.writeInt32(1, tcompression);
       }
       if (!Arrays.equals(this.payload, WireFormatNano.EMPTY_BYTES)) {
          p0.writeBytes(2, this.payload);
       }
       tcompression = this.liveOffsetTime;
       if (tcompression) {
          p0.writeUInt64(3, tcompression);
       }
       super.writeTo(p0);
       return;
    }
}
