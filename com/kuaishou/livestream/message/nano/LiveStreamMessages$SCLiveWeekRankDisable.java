package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveWeekRankDisable;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCLiveWeekRankDisable extends MessageNano	// class@001353
{
    public static LiveStreamMessages$SCLiveWeekRankDisable[] _emptyArray;

    public void LiveStreamMessages$SCLiveWeekRankDisable(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCLiveWeekRankDisable[] emptyArray(){
       if (LiveStreamMessages$SCLiveWeekRankDisable._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCLiveWeekRankDisable._emptyArray == null) {
             LiveStreamMessages$SCLiveWeekRankDisable[] sCLiveWeekRa = new LiveStreamMessages$SCLiveWeekRankDisable[0];
             LiveStreamMessages$SCLiveWeekRankDisable._emptyArray = sCLiveWeekRa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCLiveWeekRankDisable._emptyArray;
    }
    public static LiveStreamMessages$SCLiveWeekRankDisable parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCLiveWeekRankDisable().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCLiveWeekRankDisable parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCLiveWeekRankDisable(), p0);
    }
    public LiveStreamMessages$SCLiveWeekRankDisable clear(){
       this.cachedSize = -1;
       return this;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCLiveWeekRankDisable mergeFrom(CodedInputByteBufferNano p0){
       int i;
       do {
          i = p0.readTag();
       } while (!i || !WireFormatNano.parseUnknownField(p0, i));
       return this;
    }
}
