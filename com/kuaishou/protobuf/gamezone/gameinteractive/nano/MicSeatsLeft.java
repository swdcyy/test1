package com.kuaishou.protobuf.gamezone.gameinteractive.nano.MicSeatsLeft;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class MicSeatsLeft extends MessageNano	// class@000bb5
{
    public int leftReason;
    public long leftUserId;
    public long operatorUserId;
    public static MicSeatsLeft[] _emptyArray;

    public void MicSeatsLeft(){
       super();
       this.clear();
    }
    public static MicSeatsLeft[] emptyArray(){
       if (MicSeatsLeft._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (MicSeatsLeft._emptyArray == null) {
             MicSeatsLeft[] micSeatsLeft = new MicSeatsLeft[0];
             MicSeatsLeft._emptyArray = micSeatsLeft;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return MicSeatsLeft._emptyArray;
    }
    public static MicSeatsLeft parseFrom(CodedInputByteBufferNano p0){
       return new MicSeatsLeft().mergeFrom(p0);
    }
    public static MicSeatsLeft parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new MicSeatsLeft(), p0);
    }
    public MicSeatsLeft clear(){
       this.operatorUserId = 0;
       this.leftUserId = 0;
       this.leftReason = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       MicSeatsLeft toperatorUse = this.operatorUserId;
       int i1 = 0;
       if (toperatorUse - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, toperatorUse);
       }
       toperatorUse = this.leftUserId;
       if (toperatorUse - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, toperatorUse);
       }
       toperatorUse = this.leftReason;
       if (toperatorUse != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, toperatorUse);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public MicSeatsLeft mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.leftReason = p0.readUInt32();
                }
             }else {
                this.leftUserId = p0.readUInt64();
             }
          }else {
             this.operatorUserId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       MicSeatsLeft toperatorUse = this.operatorUserId;
       int i = 0;
       if (toperatorUse - i) {
          p0.writeUInt64(1, toperatorUse);
       }
       toperatorUse = this.leftUserId;
       if (toperatorUse - i) {
          p0.writeUInt64(2, toperatorUse);
       }
       toperatorUse = this.leftReason;
       if (toperatorUse != null) {
          p0.writeUInt32(3, toperatorUse);
       }
       super.writeTo(p0);
       return;
    }
}
