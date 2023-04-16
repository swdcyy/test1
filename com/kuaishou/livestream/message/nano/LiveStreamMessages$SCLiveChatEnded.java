package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveChatEnded;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCLiveChatEnded extends MessageNano	// class@00133d
{
    public static LiveStreamMessages$SCLiveChatEnded[] _emptyArray;

    public void LiveStreamMessages$SCLiveChatEnded(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCLiveChatEnded[] emptyArray(){
       if (LiveStreamMessages$SCLiveChatEnded._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCLiveChatEnded._emptyArray == null) {
             LiveStreamMessages$SCLiveChatEnded[] sCLiveChatEn = new LiveStreamMessages$SCLiveChatEnded[0];
             LiveStreamMessages$SCLiveChatEnded._emptyArray = sCLiveChatEn;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCLiveChatEnded._emptyArray;
    }
    public static LiveStreamMessages$SCLiveChatEnded parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCLiveChatEnded().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCLiveChatEnded parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCLiveChatEnded(), p0);
    }
    public LiveStreamMessages$SCLiveChatEnded clear(){
       this.cachedSize = -1;
       return this;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCLiveChatEnded mergeFrom(CodedInputByteBufferNano p0){
       int i;
       do {
          i = p0.readTag();
       } while (!i || !WireFormatNano.parseUnknownField(p0, i));
       return this;
    }
}
