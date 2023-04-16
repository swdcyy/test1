package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCPkAbnormalEnd;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCPkAbnormalEnd extends MessageNano	// class@001359
{
    public String endLiveStreamId;
    public int endType;
    public String pkId;
    public long time;
    public static LiveStreamMessages$SCPkAbnormalEnd[] _emptyArray;

    public void LiveStreamMessages$SCPkAbnormalEnd(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCPkAbnormalEnd[] emptyArray(){
       if (LiveStreamMessages$SCPkAbnormalEnd._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCPkAbnormalEnd._emptyArray == null) {
             LiveStreamMessages$SCPkAbnormalEnd[] sCPkAbnormal = new LiveStreamMessages$SCPkAbnormalEnd[0];
             LiveStreamMessages$SCPkAbnormalEnd._emptyArray = sCPkAbnormal;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCPkAbnormalEnd._emptyArray;
    }
    public static LiveStreamMessages$SCPkAbnormalEnd parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCPkAbnormalEnd().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCPkAbnormalEnd parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCPkAbnormalEnd(), p0);
    }
    public LiveStreamMessages$SCPkAbnormalEnd clear(){
       this.pkId = "";
       this.time = 0;
       this.endType = 0;
       this.endLiveStreamId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.pkId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.pkId);
       }
       LiveStreamMessages$SCPkAbnormalEnd ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttime);
       }
       LiveStreamMessages$SCPkAbnormalEnd tendType = this.endType;
       if (tendType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tendType);
       }
       if (!(this.endLiveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.endLiveStreamId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCPkAbnormalEnd mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.endLiveStreamId = p0.readString();
                   }
                }else {
                   i = p0.readInt32();
                   switch (i){
                       case 0:
                       case 2:
                       case 3:
                       case 4:
                       case 5:
                       case 6:
                       case 1:
                         break;
                       default:
                   }
                   this.endType = i;
                }
             }else {
                this.time = p0.readUInt64();
             }
          }else {
             this.pkId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.pkId).equals(str)) {
          p0.writeString(1, this.pkId);
       }
       LiveStreamMessages$SCPkAbnormalEnd ttime = this.time;
       if (ttime) {
          p0.writeUInt64(2, ttime);
       }
       LiveStreamMessages$SCPkAbnormalEnd tendType = this.endType;
       if (tendType != null) {
          p0.writeInt32(3, tendType);
       }
       if (!(this.endLiveStreamId).equals(str)) {
          p0.writeString(4, this.endLiveStreamId);
       }
       super.writeTo(p0);
       return;
    }
}
