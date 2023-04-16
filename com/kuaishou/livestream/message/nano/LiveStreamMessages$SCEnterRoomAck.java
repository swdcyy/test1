package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCEnterRoomAck;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCEnterRoomAck extends MessageNano	// class@00132c
{
    public long getEndSummaryMaxDelayMs;
    public int giftSlotAThreshold;
    public int giftSlotBThreshold;
    public int giftSlotBgGoldenThreshold;
    public int giftSlotBgPurpleThreshold;
    public long heartbeatIntervalMs;
    public long maxReconnectMs;
    public long minReconnectMs;
    public String sUserId;
    public long userId;
    public static LiveStreamMessages$SCEnterRoomAck[] _emptyArray;

    public void LiveStreamMessages$SCEnterRoomAck(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCEnterRoomAck[] emptyArray(){
       if (LiveStreamMessages$SCEnterRoomAck._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCEnterRoomAck._emptyArray == null) {
             LiveStreamMessages$SCEnterRoomAck[] sCEnterRoomA = new LiveStreamMessages$SCEnterRoomAck[0];
             LiveStreamMessages$SCEnterRoomAck._emptyArray = sCEnterRoomA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCEnterRoomAck._emptyArray;
    }
    public static LiveStreamMessages$SCEnterRoomAck parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCEnterRoomAck().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCEnterRoomAck parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCEnterRoomAck(), p0);
    }
    public LiveStreamMessages$SCEnterRoomAck clear(){
       this.userId = 0;
       this.minReconnectMs = 0;
       this.maxReconnectMs = 0;
       this.heartbeatIntervalMs = 0;
       this.giftSlotAThreshold = 0;
       this.giftSlotBThreshold = 0;
       this.giftSlotBgPurpleThreshold = 0;
       this.giftSlotBgGoldenThreshold = 0;
       this.sUserId = "";
       this.getEndSummaryMaxDelayMs = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCEnterRoomAck tuserId = this.userId;
       int i1 = 0;
       if (tuserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tuserId);
       }
       tuserId = this.minReconnectMs;
       if (tuserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tuserId);
       }
       tuserId = this.maxReconnectMs;
       if (tuserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tuserId);
       }
       tuserId = this.heartbeatIntervalMs;
       if (tuserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tuserId);
       }
       tuserId = this.giftSlotAThreshold;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tuserId);
       }
       tuserId = this.giftSlotBThreshold;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tuserId);
       }
       tuserId = this.giftSlotBgPurpleThreshold;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, tuserId);
       }
       tuserId = this.giftSlotBgGoldenThreshold;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, tuserId);
       }
       if (!(this.sUserId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.sUserId);
       }
       tuserId = this.getEndSummaryMaxDelayMs;
       if (tuserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(10, tuserId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCEnterRoomAck mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
                this.userId = p0.readUInt64();
                break;
              case 16:
                this.minReconnectMs = p0.readUInt64();
                break;
              case 24:
                this.maxReconnectMs = p0.readUInt64();
                break;
              case 32:
                this.heartbeatIntervalMs = p0.readUInt64();
                break;
              case '(':
                this.giftSlotAThreshold = p0.readUInt32();
                break;
              case '0':
                this.giftSlotBThreshold = p0.readUInt32();
                break;
              case '8':
                this.giftSlotBgPurpleThreshold = p0.readUInt32();
                break;
              case '@':
                this.giftSlotBgGoldenThreshold = p0.readUInt32();
                break;
              case 'J':
                this.sUserId = p0.readString();
                break;
              case 'P':
                this.getEndSummaryMaxDelayMs = p0.readUInt64();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCEnterRoomAck tuserId = this.userId;
       int i = 0;
       if (tuserId - i) {
          p0.writeUInt64(1, tuserId);
       }
       tuserId = this.minReconnectMs;
       if (tuserId - i) {
          p0.writeUInt64(2, tuserId);
       }
       tuserId = this.maxReconnectMs;
       if (tuserId - i) {
          p0.writeUInt64(3, tuserId);
       }
       tuserId = this.heartbeatIntervalMs;
       if (tuserId - i) {
          p0.writeUInt64(4, tuserId);
       }
       tuserId = this.giftSlotAThreshold;
       if (tuserId != null) {
          p0.writeUInt32(5, tuserId);
       }
       tuserId = this.giftSlotBThreshold;
       if (tuserId != null) {
          p0.writeUInt32(6, tuserId);
       }
       tuserId = this.giftSlotBgPurpleThreshold;
       if (tuserId != null) {
          p0.writeUInt32(7, tuserId);
       }
       tuserId = this.giftSlotBgGoldenThreshold;
       if (tuserId != null) {
          p0.writeUInt32(8, tuserId);
       }
       if (!(this.sUserId).equals("")) {
          p0.writeString(9, this.sUserId);
       }
       tuserId = this.getEndSummaryMaxDelayMs;
       if (tuserId - i) {
          p0.writeUInt64(10, tuserId);
       }
       super.writeTo(p0);
       return;
    }
}
