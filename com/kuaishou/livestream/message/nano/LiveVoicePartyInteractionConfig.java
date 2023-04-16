package com.kuaishou.livestream.message.nano.LiveVoicePartyInteractionConfig;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveVoicePartyInteractionConfig extends MessageNano	// class@0013cb
{
    public static LiveVoicePartyInteractionConfig[] _emptyArray;

    public void LiveVoicePartyInteractionConfig(){
       super();
       this.clear();
    }
    public static LiveVoicePartyInteractionConfig[] emptyArray(){
       if (LiveVoicePartyInteractionConfig._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveVoicePartyInteractionConfig._emptyArray == null) {
             LiveVoicePartyInteractionConfig[] liveVoicePar = new LiveVoicePartyInteractionConfig[0];
             LiveVoicePartyInteractionConfig._emptyArray = liveVoicePar;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveVoicePartyInteractionConfig._emptyArray;
    }
    public static LiveVoicePartyInteractionConfig parseFrom(CodedInputByteBufferNano p0){
       return new LiveVoicePartyInteractionConfig().mergeFrom(p0);
    }
    public static LiveVoicePartyInteractionConfig parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveVoicePartyInteractionConfig(), p0);
    }
    public LiveVoicePartyInteractionConfig clear(){
       this.cachedSize = -1;
       return this;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveVoicePartyInteractionConfig mergeFrom(CodedInputByteBufferNano p0){
       int i;
       do {
          i = p0.readTag();
       } while (!i || !WireFormatNano.parseUnknownField(p0, i));
       return this;
    }
}
