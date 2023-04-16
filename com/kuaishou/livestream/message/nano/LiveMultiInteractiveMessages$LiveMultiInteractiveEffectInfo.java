package com.kuaishou.livestream.message.nano.LiveMultiInteractiveMessages$LiveMultiInteractiveEffectInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveMultiInteractiveMessages$LiveMultiInteractiveEffectControl;
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;

public final class LiveMultiInteractiveMessages$LiveMultiInteractiveEffectInfo extends MessageNano	// class@0011fe
{
    public LiveCommonEffectInfo effect;
    public LiveMultiInteractiveMessages$LiveMultiInteractiveEffectControl effectControl;
    public static LiveMultiInteractiveMessages$LiveMultiInteractiveEffectInfo[] _emptyArray;

    public void LiveMultiInteractiveMessages$LiveMultiInteractiveEffectInfo(){
       super();
       this.clear();
    }
    public static LiveMultiInteractiveMessages$LiveMultiInteractiveEffectInfo[] emptyArray(){
       if (LiveMultiInteractiveMessages$LiveMultiInteractiveEffectInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMultiInteractiveMessages$LiveMultiInteractiveEffectInfo._emptyArray == null) {
             LiveMultiInteractiveMessages$LiveMultiInteractiveEffectInfo[] liveMultiInt = new LiveMultiInteractiveMessages$LiveMultiInteractiveEffectInfo[0];
             LiveMultiInteractiveMessages$LiveMultiInteractiveEffectInfo._emptyArray = liveMultiInt;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMultiInteractiveMessages$LiveMultiInteractiveEffectInfo._emptyArray;
    }
    public static LiveMultiInteractiveMessages$LiveMultiInteractiveEffectInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveMultiInteractiveMessages$LiveMultiInteractiveEffectInfo().mergeFrom(p0);
    }
    public static LiveMultiInteractiveMessages$LiveMultiInteractiveEffectInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMultiInteractiveMessages$LiveMultiInteractiveEffectInfo(), p0);
    }
    public LiveMultiInteractiveMessages$LiveMultiInteractiveEffectInfo clear(){
       this.effect = null;
       this.effectControl = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveMultiInteractiveMessages$LiveMultiInteractiveEffectInfo teffect = this.effect;
       if (teffect != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, teffect);
       }
       teffect = this.effectControl;
       if (teffect != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, teffect);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveMultiInteractiveMessages$LiveMultiInteractiveEffectInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else if(this.effectControl == null){
                this.effectControl = new LiveMultiInteractiveMessages$LiveMultiInteractiveEffectControl();
             }
             p0.readMessage(this.effectControl);
          }else if(this.effect == null){
             this.effect = new LiveCommonEffectInfo();
          }
          p0.readMessage(this.effect);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveMultiInteractiveMessages$LiveMultiInteractiveEffectInfo teffect = this.effect;
       if (teffect != null) {
          p0.writeMessage(1, teffect);
       }
       teffect = this.effectControl;
       if (teffect != null) {
          p0.writeMessage(2, teffect);
       }
       super.writeTo(p0);
       return;
    }
}
