package com.kuaishou.protobuf.livestream.nano.LiveMultiPkReopen;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveMultiPkReopen extends MessageNano	// class@000cc4
{
    public boolean enableReopenAtEndInAdvance;
    public boolean enableReopenAtPenalty;
    public boolean enableReopenAtPenaltyAtPkingPannel;
    public boolean enableReopenAtVoteAtPkingPannel;
    public long reopenDisplayBeforeEndDuration;
    public long reopenDisplayBeforeEndDurationAtPkingPannel;
    public long reopenRespondTimeoutMillis;
    public static LiveMultiPkReopen[] _emptyArray;

    public void LiveMultiPkReopen(){
       super();
       this.clear();
    }
    public static LiveMultiPkReopen[] emptyArray(){
       if (LiveMultiPkReopen._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMultiPkReopen._emptyArray == null) {
             LiveMultiPkReopen[] liveMultiPkR = new LiveMultiPkReopen[0];
             LiveMultiPkReopen._emptyArray = liveMultiPkR;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMultiPkReopen._emptyArray;
    }
    public static LiveMultiPkReopen parseFrom(CodedInputByteBufferNano p0){
       return new LiveMultiPkReopen().mergeFrom(p0);
    }
    public static LiveMultiPkReopen parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMultiPkReopen(), p0);
    }
    public LiveMultiPkReopen clear(){
       this.enableReopenAtPenalty = false;
       this.reopenDisplayBeforeEndDuration = 0;
       this.enableReopenAtEndInAdvance = false;
       this.reopenRespondTimeoutMillis = 0;
       this.enableReopenAtVoteAtPkingPannel = false;
       this.reopenDisplayBeforeEndDurationAtPkingPannel = 0;
       this.enableReopenAtPenaltyAtPkingPannel = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveMultiPkReopen tenableReope = this.enableReopenAtPenalty;
       if (tenableReope != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tenableReope);
       }
       tenableReope = this.reopenDisplayBeforeEndDuration;
       int i1 = 0;
       if (tenableReope - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tenableReope);
       }
       tenableReope = this.enableReopenAtEndInAdvance;
       if (tenableReope != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tenableReope);
       }
       tenableReope = this.reopenRespondTimeoutMillis;
       if (tenableReope - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tenableReope);
       }
       tenableReope = this.enableReopenAtVoteAtPkingPannel;
       if (tenableReope != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, tenableReope);
       }
       tenableReope = this.reopenDisplayBeforeEndDurationAtPkingPannel;
       if (tenableReope - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tenableReope);
       }
       tenableReope = this.enableReopenAtPenaltyAtPkingPannel;
       if (tenableReope != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, tenableReope);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveMultiPkReopen mergeFrom(CodedInputByteBufferNano p0){
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
                            if (i != 56) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.enableReopenAtPenaltyAtPkingPannel = p0.readBool();
                            }
                         }else {
                            this.reopenDisplayBeforeEndDurationAtPkingPannel = p0.readUInt64();
                         }
                      }else {
                         this.enableReopenAtVoteAtPkingPannel = p0.readBool();
                      }
                   }else {
                      this.reopenRespondTimeoutMillis = p0.readUInt64();
                   }
                }else {
                   this.enableReopenAtEndInAdvance = p0.readBool();
                }
             }else {
                this.reopenDisplayBeforeEndDuration = p0.readUInt64();
             }
          }else {
             this.enableReopenAtPenalty = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveMultiPkReopen tenableReope = this.enableReopenAtPenalty;
       if (tenableReope != null) {
          p0.writeBool(1, tenableReope);
       }
       tenableReope = this.reopenDisplayBeforeEndDuration;
       int i = 0;
       if (tenableReope - i) {
          p0.writeUInt64(2, tenableReope);
       }
       tenableReope = this.enableReopenAtEndInAdvance;
       if (tenableReope != null) {
          p0.writeBool(3, tenableReope);
       }
       tenableReope = this.reopenRespondTimeoutMillis;
       if (tenableReope - i) {
          p0.writeUInt64(4, tenableReope);
       }
       tenableReope = this.enableReopenAtVoteAtPkingPannel;
       if (tenableReope != null) {
          p0.writeBool(5, tenableReope);
       }
       tenableReope = this.reopenDisplayBeforeEndDurationAtPkingPannel;
       if (tenableReope - i) {
          p0.writeUInt64(6, tenableReope);
       }
       tenableReope = this.enableReopenAtPenaltyAtPkingPannel;
       if (tenableReope != null) {
          p0.writeBool(7, tenableReope);
       }
       super.writeTo(p0);
       return;
    }
}
