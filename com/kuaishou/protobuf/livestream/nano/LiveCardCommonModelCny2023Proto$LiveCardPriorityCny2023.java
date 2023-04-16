package com.kuaishou.protobuf.livestream.nano.LiveCardCommonModelCny2023Proto$LiveCardPriorityCny2023;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveCardCommonModelCny2023Proto$LiveCardPriorityCny2023 extends MessageNano	// class@000c3f
{
    public int priority;
    public static LiveCardCommonModelCny2023Proto$LiveCardPriorityCny2023[] _emptyArray;

    public void LiveCardCommonModelCny2023Proto$LiveCardPriorityCny2023(){
       super();
       this.clear();
    }
    public static LiveCardCommonModelCny2023Proto$LiveCardPriorityCny2023[] emptyArray(){
       if (LiveCardCommonModelCny2023Proto$LiveCardPriorityCny2023._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCardCommonModelCny2023Proto$LiveCardPriorityCny2023._emptyArray == null) {
             LiveCardCommonModelCny2023Proto$LiveCardPriorityCny2023[] liveCardPrio = new LiveCardCommonModelCny2023Proto$LiveCardPriorityCny2023[0];
             LiveCardCommonModelCny2023Proto$LiveCardPriorityCny2023._emptyArray = liveCardPrio;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCardCommonModelCny2023Proto$LiveCardPriorityCny2023._emptyArray;
    }
    public static LiveCardCommonModelCny2023Proto$LiveCardPriorityCny2023 parseFrom(CodedInputByteBufferNano p0){
       return new LiveCardCommonModelCny2023Proto$LiveCardPriorityCny2023().mergeFrom(p0);
    }
    public static LiveCardCommonModelCny2023Proto$LiveCardPriorityCny2023 parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCardCommonModelCny2023Proto$LiveCardPriorityCny2023(), p0);
    }
    public LiveCardCommonModelCny2023Proto$LiveCardPriorityCny2023 clear(){
       this.priority = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveCardCommonModelCny2023Proto$LiveCardPriorityCny2023 tpriority = this.priority;
       if (tpriority != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tpriority);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCardCommonModelCny2023Proto$LiveCardPriorityCny2023 mergeFrom(CodedInputByteBufferNano p0){
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
             this.priority = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveCardCommonModelCny2023Proto$LiveCardPriorityCny2023 tpriority = this.priority;
       if (tpriority != null) {
          p0.writeUInt32(1, tpriority);
       }
       super.writeTo(p0);
       return;
    }
}
