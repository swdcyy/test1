package com.kuaishou.protobuf.gamezone.prediction.nano.SCGzonePredictionPkInviteReply;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCGzonePredictionPkInviteReply extends MessageNano	// class@000be7
{
    public long authorId;
    public int status;
    public static SCGzonePredictionPkInviteReply[] _emptyArray;

    public void SCGzonePredictionPkInviteReply(){
       super();
       this.clear();
    }
    public static SCGzonePredictionPkInviteReply[] emptyArray(){
       if (SCGzonePredictionPkInviteReply._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGzonePredictionPkInviteReply._emptyArray == null) {
             SCGzonePredictionPkInviteReply[] sCGzonePredi = new SCGzonePredictionPkInviteReply[0];
             SCGzonePredictionPkInviteReply._emptyArray = sCGzonePredi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGzonePredictionPkInviteReply._emptyArray;
    }
    public static SCGzonePredictionPkInviteReply parseFrom(CodedInputByteBufferNano p0){
       return new SCGzonePredictionPkInviteReply().mergeFrom(p0);
    }
    public static SCGzonePredictionPkInviteReply parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGzonePredictionPkInviteReply(), p0);
    }
    public SCGzonePredictionPkInviteReply clear(){
       this.authorId = 0;
       this.status = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCGzonePredictionPkInviteReply tauthorId = this.authorId;
       if (tauthorId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tauthorId);
       }
       tauthorId = this.status;
       if (tauthorId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tauthorId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGzonePredictionPkInviteReply mergeFrom(CodedInputByteBufferNano p0){
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
                this.status = p0.readUInt32();
             }
          }else {
             this.authorId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCGzonePredictionPkInviteReply tauthorId = this.authorId;
       if (tauthorId) {
          p0.writeUInt64(1, tauthorId);
       }
       tauthorId = this.status;
       if (tauthorId != null) {
          p0.writeUInt32(2, tauthorId);
       }
       super.writeTo(p0);
       return;
    }
}
