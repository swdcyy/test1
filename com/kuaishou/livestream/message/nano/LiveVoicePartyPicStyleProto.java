package com.kuaishou.livestream.message.nano.LiveVoicePartyPicStyleProto;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveVoicePartyPicStyleProto extends MessageNano	// class@0013cf
{
    public static LiveVoicePartyPicStyleProto[] _emptyArray;

    public void LiveVoicePartyPicStyleProto(){
       super();
       this.clear();
    }
    public static LiveVoicePartyPicStyleProto[] emptyArray(){
       if (LiveVoicePartyPicStyleProto._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveVoicePartyPicStyleProto._emptyArray == null) {
             LiveVoicePartyPicStyleProto[] liveVoicePar = new LiveVoicePartyPicStyleProto[0];
             LiveVoicePartyPicStyleProto._emptyArray = liveVoicePar;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveVoicePartyPicStyleProto._emptyArray;
    }
    public static LiveVoicePartyPicStyleProto parseFrom(CodedInputByteBufferNano p0){
       return new LiveVoicePartyPicStyleProto().mergeFrom(p0);
    }
    public static LiveVoicePartyPicStyleProto parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveVoicePartyPicStyleProto(), p0);
    }
    public LiveVoicePartyPicStyleProto clear(){
       this.cachedSize = -1;
       return this;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveVoicePartyPicStyleProto mergeFrom(CodedInputByteBufferNano p0){
       int i;
       do {
          i = p0.readTag();
       } while (!i || !WireFormatNano.parseUnknownField(p0, i));
       return this;
    }
}
