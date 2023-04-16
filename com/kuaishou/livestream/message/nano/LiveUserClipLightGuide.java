package com.kuaishou.livestream.message.nano.LiveUserClipLightGuide;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveUserClipLightGuide extends MessageNano	// class@0013bd
{
    public long time;
    public static LiveUserClipLightGuide[] _emptyArray;

    public void LiveUserClipLightGuide(){
       super();
       this.clear();
    }
    public static LiveUserClipLightGuide[] emptyArray(){
       if (LiveUserClipLightGuide._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveUserClipLightGuide._emptyArray == null) {
             LiveUserClipLightGuide[] liveUserClip = new LiveUserClipLightGuide[0];
             LiveUserClipLightGuide._emptyArray = liveUserClip;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveUserClipLightGuide._emptyArray;
    }
    public static LiveUserClipLightGuide parseFrom(CodedInputByteBufferNano p0){
       return new LiveUserClipLightGuide().mergeFrom(p0);
    }
    public static LiveUserClipLightGuide parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveUserClipLightGuide(), p0);
    }
    public LiveUserClipLightGuide clear(){
       this.time = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveUserClipLightGuide ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveUserClipLightGuide mergeFrom(CodedInputByteBufferNano p0){
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
             this.time = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveUserClipLightGuide ttime = this.time;
       if (ttime) {
          p0.writeUInt64(1, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
