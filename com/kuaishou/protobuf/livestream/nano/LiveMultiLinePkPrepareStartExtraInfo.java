package com.kuaishou.protobuf.livestream.nano.LiveMultiLinePkPrepareStartExtraInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveMultiLinePkPrepareStartExtraInfo extends MessageNano	// class@000cb6
{
    public long forbidInviteDurationMsBeforeDeadline;
    public int joinType;
    public long prepareEndDeadline;
    public long prepareEndNotifyDeadline;
    public static LiveMultiLinePkPrepareStartExtraInfo[] _emptyArray;

    public void LiveMultiLinePkPrepareStartExtraInfo(){
       super();
       this.clear();
    }
    public static LiveMultiLinePkPrepareStartExtraInfo[] emptyArray(){
       if (LiveMultiLinePkPrepareStartExtraInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMultiLinePkPrepareStartExtraInfo._emptyArray == null) {
             LiveMultiLinePkPrepareStartExtraInfo[] liveMultiLin = new LiveMultiLinePkPrepareStartExtraInfo[0];
             LiveMultiLinePkPrepareStartExtraInfo._emptyArray = liveMultiLin;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMultiLinePkPrepareStartExtraInfo._emptyArray;
    }
    public static LiveMultiLinePkPrepareStartExtraInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveMultiLinePkPrepareStartExtraInfo().mergeFrom(p0);
    }
    public static LiveMultiLinePkPrepareStartExtraInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMultiLinePkPrepareStartExtraInfo(), p0);
    }
    public LiveMultiLinePkPrepareStartExtraInfo clear(){
       this.prepareEndDeadline = 0;
       this.prepareEndNotifyDeadline = 0;
       this.forbidInviteDurationMsBeforeDeadline = 0;
       this.joinType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveMultiLinePkPrepareStartExtraInfo tprepareEndD = this.prepareEndDeadline;
       int i1 = 0;
       if (tprepareEndD - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tprepareEndD);
       }
       tprepareEndD = this.prepareEndNotifyDeadline;
       if (tprepareEndD - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tprepareEndD);
       }
       tprepareEndD = this.forbidInviteDurationMsBeforeDeadline;
       if (tprepareEndD - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tprepareEndD);
       }
       tprepareEndD = this.joinType;
       if (tprepareEndD != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tprepareEndD);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveMultiLinePkPrepareStartExtraInfo mergeFrom(CodedInputByteBufferNano p0){
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
                      this.joinType = p0.readUInt32();
                   }
                }else {
                   this.forbidInviteDurationMsBeforeDeadline = p0.readUInt64();
                }
             }else {
                this.prepareEndNotifyDeadline = p0.readUInt64();
             }
          }else {
             this.prepareEndDeadline = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveMultiLinePkPrepareStartExtraInfo tprepareEndD = this.prepareEndDeadline;
       int i = 0;
       if (tprepareEndD - i) {
          p0.writeUInt64(1, tprepareEndD);
       }
       tprepareEndD = this.prepareEndNotifyDeadline;
       if (tprepareEndD - i) {
          p0.writeUInt64(2, tprepareEndD);
       }
       tprepareEndD = this.forbidInviteDurationMsBeforeDeadline;
       if (tprepareEndD - i) {
          p0.writeUInt64(3, tprepareEndD);
       }
       tprepareEndD = this.joinType;
       if (tprepareEndD != null) {
          p0.writeUInt32(4, tprepareEndD);
       }
       super.writeTo(p0);
       return;
    }
}
