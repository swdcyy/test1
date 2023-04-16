package com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveStageLayoutConfigChecksum;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveFlvStream$LiveStageLayoutConfigChecksum extends MessageNano	// class@000c80
{
    public long checksum;
    public int version;
    public static LiveFlvStream$LiveStageLayoutConfigChecksum[] _emptyArray;

    public void LiveFlvStream$LiveStageLayoutConfigChecksum(){
       super();
       this.clear();
    }
    public static LiveFlvStream$LiveStageLayoutConfigChecksum[] emptyArray(){
       if (LiveFlvStream$LiveStageLayoutConfigChecksum._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFlvStream$LiveStageLayoutConfigChecksum._emptyArray == null) {
             LiveFlvStream$LiveStageLayoutConfigChecksum[] liveStageLay = new LiveFlvStream$LiveStageLayoutConfigChecksum[0];
             LiveFlvStream$LiveStageLayoutConfigChecksum._emptyArray = liveStageLay;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFlvStream$LiveStageLayoutConfigChecksum._emptyArray;
    }
    public static LiveFlvStream$LiveStageLayoutConfigChecksum parseFrom(CodedInputByteBufferNano p0){
       return new LiveFlvStream$LiveStageLayoutConfigChecksum().mergeFrom(p0);
    }
    public static LiveFlvStream$LiveStageLayoutConfigChecksum parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFlvStream$LiveStageLayoutConfigChecksum(), p0);
    }
    public LiveFlvStream$LiveStageLayoutConfigChecksum clear(){
       this.version = 0;
       this.checksum = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveFlvStream$LiveStageLayoutConfigChecksum tversion = this.version;
       if (tversion != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tversion);
       }
       tversion = this.checksum;
       if (tversion) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tversion);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFlvStream$LiveStageLayoutConfigChecksum mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.checksum = p0.readUInt64();
             }
          }else {
             this.version = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveFlvStream$LiveStageLayoutConfigChecksum tversion = this.version;
       if (tversion != null) {
          p0.writeUInt32(1, tversion);
       }
       tversion = this.checksum;
       if (tversion) {
          p0.writeUInt64(2, tversion);
       }
       super.writeTo(p0);
       return;
    }
}
