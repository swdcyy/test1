package com.kuaishou.protobuf.livestream.nano.LiveQuizSf2023Proto$ScLiveQuizEmergencyStopSf2023;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveQuizSf2023Proto$ScLiveQuizEmergencyStopSf2023 extends MessageNano	// class@000d02
{
    public static LiveQuizSf2023Proto$ScLiveQuizEmergencyStopSf2023[] _emptyArray;

    public void LiveQuizSf2023Proto$ScLiveQuizEmergencyStopSf2023(){
       super();
       this.clear();
    }
    public static LiveQuizSf2023Proto$ScLiveQuizEmergencyStopSf2023[] emptyArray(){
       if (LiveQuizSf2023Proto$ScLiveQuizEmergencyStopSf2023._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveQuizSf2023Proto$ScLiveQuizEmergencyStopSf2023._emptyArray == null) {
             LiveQuizSf2023Proto$ScLiveQuizEmergencyStopSf2023[] scLiveQuizEm = new LiveQuizSf2023Proto$ScLiveQuizEmergencyStopSf2023[0];
             LiveQuizSf2023Proto$ScLiveQuizEmergencyStopSf2023._emptyArray = scLiveQuizEm;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveQuizSf2023Proto$ScLiveQuizEmergencyStopSf2023._emptyArray;
    }
    public static LiveQuizSf2023Proto$ScLiveQuizEmergencyStopSf2023 parseFrom(CodedInputByteBufferNano p0){
       return new LiveQuizSf2023Proto$ScLiveQuizEmergencyStopSf2023().mergeFrom(p0);
    }
    public static LiveQuizSf2023Proto$ScLiveQuizEmergencyStopSf2023 parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveQuizSf2023Proto$ScLiveQuizEmergencyStopSf2023(), p0);
    }
    public LiveQuizSf2023Proto$ScLiveQuizEmergencyStopSf2023 clear(){
       this.cachedSize = -1;
       return this;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveQuizSf2023Proto$ScLiveQuizEmergencyStopSf2023 mergeFrom(CodedInputByteBufferNano p0){
       int i;
       do {
          i = p0.readTag();
       } while (!i || !WireFormatNano.parseUnknownField(p0, i));
       return this;
    }
}
