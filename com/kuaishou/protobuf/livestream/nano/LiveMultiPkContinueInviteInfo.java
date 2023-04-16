package com.kuaishou.protobuf.livestream.nano.LiveMultiPkContinueInviteInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveMultiPkContinueInviteInfo extends MessageNano	// class@000cba
{
    public long disableContinueInviteDurationAtPenalty;
    public boolean enableShowContinueInviteButton;
    public static LiveMultiPkContinueInviteInfo[] _emptyArray;

    public void LiveMultiPkContinueInviteInfo(){
       super();
       this.clear();
    }
    public static LiveMultiPkContinueInviteInfo[] emptyArray(){
       if (LiveMultiPkContinueInviteInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMultiPkContinueInviteInfo._emptyArray == null) {
             LiveMultiPkContinueInviteInfo[] liveMultiPkC = new LiveMultiPkContinueInviteInfo[0];
             LiveMultiPkContinueInviteInfo._emptyArray = liveMultiPkC;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMultiPkContinueInviteInfo._emptyArray;
    }
    public static LiveMultiPkContinueInviteInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveMultiPkContinueInviteInfo().mergeFrom(p0);
    }
    public static LiveMultiPkContinueInviteInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMultiPkContinueInviteInfo(), p0);
    }
    public LiveMultiPkContinueInviteInfo clear(){
       this.enableShowContinueInviteButton = false;
       this.disableContinueInviteDurationAtPenalty = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveMultiPkContinueInviteInfo tenableShowC = this.enableShowContinueInviteButton;
       if (tenableShowC != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tenableShowC);
       }
       tenableShowC = this.disableContinueInviteDurationAtPenalty;
       if (tenableShowC) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tenableShowC);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveMultiPkContinueInviteInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.disableContinueInviteDurationAtPenalty = p0.readUInt64();
             }
          }else {
             this.enableShowContinueInviteButton = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveMultiPkContinueInviteInfo tenableShowC = this.enableShowContinueInviteButton;
       if (tenableShowC != null) {
          p0.writeBool(1, tenableShowC);
       }
       tenableShowC = this.disableContinueInviteDurationAtPenalty;
       if (tenableShowC) {
          p0.writeUInt64(2, tenableShowC);
       }
       super.writeTo(p0);
       return;
    }
}
