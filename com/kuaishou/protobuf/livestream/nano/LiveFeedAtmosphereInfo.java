package com.kuaishou.protobuf.livestream.nano.LiveFeedAtmosphereInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveFeedAtmosphereInfo extends MessageNano	// class@000c5e
{
    public boolean atmosphere;
    public int feedType;
    public long liveStreamId;
    public long timestamp;
    public long userId;
    public static LiveFeedAtmosphereInfo[] _emptyArray;

    public void LiveFeedAtmosphereInfo(){
       super();
       this.clear();
    }
    public static LiveFeedAtmosphereInfo[] emptyArray(){
       if (LiveFeedAtmosphereInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFeedAtmosphereInfo._emptyArray == null) {
             LiveFeedAtmosphereInfo[] liveFeedAtmo = new LiveFeedAtmosphereInfo[0];
             LiveFeedAtmosphereInfo._emptyArray = liveFeedAtmo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFeedAtmosphereInfo._emptyArray;
    }
    public static LiveFeedAtmosphereInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveFeedAtmosphereInfo().mergeFrom(p0);
    }
    public static LiveFeedAtmosphereInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFeedAtmosphereInfo(), p0);
    }
    public LiveFeedAtmosphereInfo clear(){
       this.liveStreamId = 0;
       this.userId = 0;
       this.timestamp = 0;
       this.feedType = 0;
       this.atmosphere = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveFeedAtmosphereInfo tliveStreamI = this.liveStreamId;
       int i1 = 0;
       if (tliveStreamI - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tliveStreamI);
       }
       tliveStreamI = this.userId;
       if (tliveStreamI - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tliveStreamI);
       }
       tliveStreamI = this.timestamp;
       if (tliveStreamI - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tliveStreamI);
       }
       tliveStreamI = this.feedType;
       if (tliveStreamI != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tliveStreamI);
       }
       tliveStreamI = this.atmosphere;
       if (tliveStreamI != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, tliveStreamI);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFeedAtmosphereInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.atmosphere = p0.readBool();
                      }
                   }else {
                      i = p0.readInt32();
                      if (i && i != 1) {
                         continue ;
                      }else {
                         this.feedType = i;
                      }
                   }
                }else {
                   this.timestamp = p0.readUInt64();
                }
             }else {
                this.userId = p0.readUInt64();
             }
          }else {
             this.liveStreamId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveFeedAtmosphereInfo tliveStreamI = this.liveStreamId;
       int i = 0;
       if (tliveStreamI - i) {
          p0.writeUInt64(1, tliveStreamI);
       }
       tliveStreamI = this.userId;
       if (tliveStreamI - i) {
          p0.writeUInt64(2, tliveStreamI);
       }
       tliveStreamI = this.timestamp;
       if (tliveStreamI - i) {
          p0.writeUInt64(3, tliveStreamI);
       }
       tliveStreamI = this.feedType;
       if (tliveStreamI != null) {
          p0.writeInt32(4, tliveStreamI);
       }
       tliveStreamI = this.atmosphere;
       if (tliveStreamI != null) {
          p0.writeBool(5, tliveStreamI);
       }
       super.writeTo(p0);
       return;
    }
}
