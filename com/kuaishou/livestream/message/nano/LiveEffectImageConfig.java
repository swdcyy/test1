package com.kuaishou.livestream.message.nano.LiveEffectImageConfig;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveEffectImageConfig extends MessageNano	// class@001197
{
    public int height;
    public int witdh;
    public static LiveEffectImageConfig[] _emptyArray;

    public void LiveEffectImageConfig(){
       super();
       this.clear();
    }
    public static LiveEffectImageConfig[] emptyArray(){
       if (LiveEffectImageConfig._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveEffectImageConfig._emptyArray == null) {
             LiveEffectImageConfig[] liveEffectIm = new LiveEffectImageConfig[0];
             LiveEffectImageConfig._emptyArray = liveEffectIm;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveEffectImageConfig._emptyArray;
    }
    public static LiveEffectImageConfig parseFrom(CodedInputByteBufferNano p0){
       return new LiveEffectImageConfig().mergeFrom(p0);
    }
    public static LiveEffectImageConfig parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveEffectImageConfig(), p0);
    }
    public LiveEffectImageConfig clear(){
       this.witdh = 0;
       this.height = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveEffectImageConfig twitdh = this.witdh;
       if (twitdh != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, twitdh);
       }
       twitdh = this.height;
       if (twitdh != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, twitdh);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveEffectImageConfig mergeFrom(CodedInputByteBufferNano p0){
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
                this.height = p0.readUInt32();
             }
          }else {
             this.witdh = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveEffectImageConfig twitdh = this.witdh;
       if (twitdh != null) {
          p0.writeUInt32(1, twitdh);
       }
       twitdh = this.height;
       if (twitdh != null) {
          p0.writeUInt32(2, twitdh);
       }
       super.writeTo(p0);
       return;
    }
}
