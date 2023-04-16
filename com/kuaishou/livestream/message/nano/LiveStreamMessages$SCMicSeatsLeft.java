package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCMicSeatsLeft;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCMicSeatsLeft extends MessageNano	// class@001358
{
    public int leftReason;
    public long leftUserId;
    public long operatorUserId;
    public long time;
    public static LiveStreamMessages$SCMicSeatsLeft[] _emptyArray;

    public void LiveStreamMessages$SCMicSeatsLeft(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCMicSeatsLeft[] emptyArray(){
       if (LiveStreamMessages$SCMicSeatsLeft._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCMicSeatsLeft._emptyArray == null) {
             LiveStreamMessages$SCMicSeatsLeft[] sCMicSeatsLe = new LiveStreamMessages$SCMicSeatsLeft[0];
             LiveStreamMessages$SCMicSeatsLeft._emptyArray = sCMicSeatsLe;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCMicSeatsLeft._emptyArray;
    }
    public static LiveStreamMessages$SCMicSeatsLeft parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCMicSeatsLeft().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCMicSeatsLeft parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCMicSeatsLeft(), p0);
    }
    public LiveStreamMessages$SCMicSeatsLeft clear(){
       this.time = 0;
       this.operatorUserId = 0;
       this.leftUserId = 0;
       this.leftReason = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCMicSeatsLeft ttime = this.time;
       int i1 = 0;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       ttime = this.operatorUserId;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttime);
       }
       ttime = this.leftUserId;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ttime);
       }
       ttime = this.leftReason;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCMicSeatsLeft mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      i = p0.readInt32();
                      if (i && (i != 1 && (i != 2 && (i != 3 && (i != 4 && i != 5))))) {
                         continue ;
                      }else {
                         this.leftReason = i;
                      }
                   }
                }else {
                   this.leftUserId = p0.readUInt64();
                }
             }else {
                this.operatorUserId = p0.readUInt64();
             }
          }else {
             this.time = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCMicSeatsLeft ttime = this.time;
       int i = 0;
       if (ttime - i) {
          p0.writeUInt64(1, ttime);
       }
       ttime = this.operatorUserId;
       if (ttime - i) {
          p0.writeUInt64(2, ttime);
       }
       ttime = this.leftUserId;
       if (ttime - i) {
          p0.writeUInt64(3, ttime);
       }
       ttime = this.leftReason;
       if (ttime != null) {
          p0.writeInt32(4, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
