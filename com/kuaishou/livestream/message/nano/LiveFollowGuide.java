package com.kuaishou.livestream.message.nano.LiveFollowGuide;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveFollowGuide extends MessageNano	// class@0011b5
{
    public long time;
    public int type;
    public static LiveFollowGuide[] _emptyArray;

    public void LiveFollowGuide(){
       super();
       this.clear();
    }
    public static LiveFollowGuide[] emptyArray(){
       if (LiveFollowGuide._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFollowGuide._emptyArray == null) {
             LiveFollowGuide[] liveFollowGu = new LiveFollowGuide[0];
             LiveFollowGuide._emptyArray = liveFollowGu;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFollowGuide._emptyArray;
    }
    public static LiveFollowGuide parseFrom(CodedInputByteBufferNano p0){
       return new LiveFollowGuide().mergeFrom(p0);
    }
    public static LiveFollowGuide parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFollowGuide(), p0);
    }
    public LiveFollowGuide clear(){
       this.time = 0;
       this.type = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveFollowGuide ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       ttime = this.type;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFollowGuide mergeFrom(CodedInputByteBufferNano p0){
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
                this.type = p0.readUInt32();
             }
          }else {
             this.time = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveFollowGuide ttime = this.time;
       if (ttime) {
          p0.writeUInt64(1, ttime);
       }
       ttime = this.type;
       if (ttime != null) {
          p0.writeUInt32(2, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
