package com.kuaishou.protobuf.gamezone.gameinteractive.gameserver.nano.SCGameInteractionPkScoreProgress$Score;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCGameInteractionPkScoreProgress$Score extends MessageNano	// class@000ba2
{
    public int score;
    public long userId;
    public static SCGameInteractionPkScoreProgress$Score[] _emptyArray;

    public void SCGameInteractionPkScoreProgress$Score(){
       super();
       this.clear();
    }
    public static SCGameInteractionPkScoreProgress$Score[] emptyArray(){
       if (SCGameInteractionPkScoreProgress$Score._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGameInteractionPkScoreProgress$Score._emptyArray == null) {
             SCGameInteractionPkScoreProgress$Score[] scoreArray = new SCGameInteractionPkScoreProgress$Score[0];
             SCGameInteractionPkScoreProgress$Score._emptyArray = scoreArray;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGameInteractionPkScoreProgress$Score._emptyArray;
    }
    public static SCGameInteractionPkScoreProgress$Score parseFrom(CodedInputByteBufferNano p0){
       return new SCGameInteractionPkScoreProgress$Score().mergeFrom(p0);
    }
    public static SCGameInteractionPkScoreProgress$Score parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGameInteractionPkScoreProgress$Score(), p0);
    }
    public SCGameInteractionPkScoreProgress$Score clear(){
       this.userId = 0;
       this.score = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCGameInteractionPkScoreProgress$Score tuserId = this.userId;
       if (tuserId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tuserId);
       }
       tuserId = this.score;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tuserId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGameInteractionPkScoreProgress$Score mergeFrom(CodedInputByteBufferNano p0){
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
                this.score = p0.readUInt32();
             }
          }else {
             this.userId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCGameInteractionPkScoreProgress$Score tuserId = this.userId;
       if (tuserId) {
          p0.writeUInt64(1, tuserId);
       }
       tuserId = this.score;
       if (tuserId != null) {
          p0.writeUInt32(2, tuserId);
       }
       super.writeTo(p0);
       return;
    }
}
