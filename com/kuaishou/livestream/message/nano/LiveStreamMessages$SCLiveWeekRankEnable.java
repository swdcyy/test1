package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveWeekRankEnable;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCLiveWeekRankEnable extends MessageNano	// class@001354
{
    public static LiveStreamMessages$SCLiveWeekRankEnable[] _emptyArray;

    public void LiveStreamMessages$SCLiveWeekRankEnable(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCLiveWeekRankEnable[] emptyArray(){
       if (LiveStreamMessages$SCLiveWeekRankEnable._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCLiveWeekRankEnable._emptyArray == null) {
             LiveStreamMessages$SCLiveWeekRankEnable[] sCLiveWeekRa = new LiveStreamMessages$SCLiveWeekRankEnable[0];
             LiveStreamMessages$SCLiveWeekRankEnable._emptyArray = sCLiveWeekRa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCLiveWeekRankEnable._emptyArray;
    }
    public static LiveStreamMessages$SCLiveWeekRankEnable parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCLiveWeekRankEnable().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCLiveWeekRankEnable parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCLiveWeekRankEnable(), p0);
    }
    public LiveStreamMessages$SCLiveWeekRankEnable clear(){
       this.cachedSize = -1;
       return this;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCLiveWeekRankEnable mergeFrom(CodedInputByteBufferNano p0){
       int i;
       do {
          i = p0.readTag();
       } while (!i || !WireFormatNano.parseUnknownField(p0, i));
       return this;
    }
}
