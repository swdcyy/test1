package com.kuaishou.protobuf.gamezone.gameinteractive.gameserver.nano.SCGameInteractionPkRoundResult;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCGameInteractionPkRoundResult extends MessageNano	// class@000ba0
{
    public String id;
    public String pkModeId;
    public long timestamp;
    public long winner;
    public static SCGameInteractionPkRoundResult[] _emptyArray;

    public void SCGameInteractionPkRoundResult(){
       super();
       this.clear();
    }
    public static SCGameInteractionPkRoundResult[] emptyArray(){
       if (SCGameInteractionPkRoundResult._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGameInteractionPkRoundResult._emptyArray == null) {
             SCGameInteractionPkRoundResult[] sCGameIntera = new SCGameInteractionPkRoundResult[0];
             SCGameInteractionPkRoundResult._emptyArray = sCGameIntera;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGameInteractionPkRoundResult._emptyArray;
    }
    public static SCGameInteractionPkRoundResult parseFrom(CodedInputByteBufferNano p0){
       return new SCGameInteractionPkRoundResult().mergeFrom(p0);
    }
    public static SCGameInteractionPkRoundResult parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGameInteractionPkRoundResult(), p0);
    }
    public SCGameInteractionPkRoundResult clear(){
       this.pkModeId = "";
       this.id = "";
       this.winner = 0;
       this.timestamp = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.pkModeId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.pkModeId);
       }
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.id);
       }
       SCGameInteractionPkRoundResult twinner = this.winner;
       int i1 = 0;
       if (twinner - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, twinner);
       }
       twinner = this.timestamp;
       if (twinner - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, twinner);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGameInteractionPkRoundResult mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.timestamp = p0.readUInt64();
                   }
                }else {
                   this.winner = p0.readUInt64();
                }
             }else {
                this.id = p0.readString();
             }
          }else {
             this.pkModeId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.pkModeId).equals(str)) {
          p0.writeString(1, this.pkModeId);
       }
       if (!(this.id).equals(str)) {
          p0.writeString(2, this.id);
       }
       SCGameInteractionPkRoundResult twinner = this.winner;
       int i = 0;
       if (twinner - i) {
          p0.writeUInt64(3, twinner);
       }
       twinner = this.timestamp;
       if (twinner - i) {
          p0.writeUInt64(4, twinner);
       }
       super.writeTo(p0);
       return;
    }
}
