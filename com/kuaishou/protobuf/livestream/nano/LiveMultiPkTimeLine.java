package com.kuaishou.protobuf.livestream.nano.LiveMultiPkTimeLine;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveMultiPkTimeLine extends MessageNano	// class@000ccc
{
    public long penaltyDeadline;
    public long prePenaltyDeadline;
    public long serverTime;
    public long startTime;
    public long voteDeadline;
    public long voteEndWaitDeadline;
    public static LiveMultiPkTimeLine[] _emptyArray;

    public void LiveMultiPkTimeLine(){
       super();
       this.clear();
    }
    public static LiveMultiPkTimeLine[] emptyArray(){
       if (LiveMultiPkTimeLine._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMultiPkTimeLine._emptyArray == null) {
             LiveMultiPkTimeLine[] liveMultiPkT = new LiveMultiPkTimeLine[0];
             LiveMultiPkTimeLine._emptyArray = liveMultiPkT;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMultiPkTimeLine._emptyArray;
    }
    public static LiveMultiPkTimeLine parseFrom(CodedInputByteBufferNano p0){
       return new LiveMultiPkTimeLine().mergeFrom(p0);
    }
    public static LiveMultiPkTimeLine parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMultiPkTimeLine(), p0);
    }
    public LiveMultiPkTimeLine clear(){
       this.serverTime = 0;
       this.startTime = 0;
       this.voteDeadline = 0;
       this.voteEndWaitDeadline = 0;
       this.prePenaltyDeadline = 0;
       this.penaltyDeadline = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveMultiPkTimeLine tserverTime = this.serverTime;
       int i1 = 0;
       if (tserverTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tserverTime);
       }
       tserverTime = this.startTime;
       if (tserverTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tserverTime);
       }
       tserverTime = this.voteDeadline;
       if (tserverTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tserverTime);
       }
       tserverTime = this.voteEndWaitDeadline;
       if (tserverTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tserverTime);
       }
       tserverTime = this.prePenaltyDeadline;
       if (tserverTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tserverTime);
       }
       tserverTime = this.penaltyDeadline;
       if (tserverTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tserverTime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveMultiPkTimeLine mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.penaltyDeadline = p0.readUInt64();
                         }
                      }else {
                         this.prePenaltyDeadline = p0.readUInt64();
                      }
                   }else {
                      this.voteEndWaitDeadline = p0.readUInt64();
                   }
                }else {
                   this.voteDeadline = p0.readUInt64();
                }
             }else {
                this.startTime = p0.readUInt64();
             }
          }else {
             this.serverTime = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveMultiPkTimeLine tserverTime = this.serverTime;
       int i = 0;
       if (tserverTime - i) {
          p0.writeUInt64(1, tserverTime);
       }
       tserverTime = this.startTime;
       if (tserverTime - i) {
          p0.writeUInt64(2, tserverTime);
       }
       tserverTime = this.voteDeadline;
       if (tserverTime - i) {
          p0.writeUInt64(3, tserverTime);
       }
       tserverTime = this.voteEndWaitDeadline;
       if (tserverTime - i) {
          p0.writeUInt64(4, tserverTime);
       }
       tserverTime = this.prePenaltyDeadline;
       if (tserverTime - i) {
          p0.writeUInt64(5, tserverTime);
       }
       tserverTime = this.penaltyDeadline;
       if (tserverTime - i) {
          p0.writeUInt64(6, tserverTime);
       }
       super.writeTo(p0);
       return;
    }
}
