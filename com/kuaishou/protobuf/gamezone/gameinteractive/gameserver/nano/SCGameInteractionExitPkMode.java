package com.kuaishou.protobuf.gamezone.gameinteractive.gameserver.nano.SCGameInteractionExitPkMode;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCGameInteractionExitPkMode extends MessageNano	// class@000b9b
{
    public String id;
    public long timestamp;
    public static SCGameInteractionExitPkMode[] _emptyArray;

    public void SCGameInteractionExitPkMode(){
       super();
       this.clear();
    }
    public static SCGameInteractionExitPkMode[] emptyArray(){
       if (SCGameInteractionExitPkMode._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGameInteractionExitPkMode._emptyArray == null) {
             SCGameInteractionExitPkMode[] sCGameIntera = new SCGameInteractionExitPkMode[0];
             SCGameInteractionExitPkMode._emptyArray = sCGameIntera;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGameInteractionExitPkMode._emptyArray;
    }
    public static SCGameInteractionExitPkMode parseFrom(CodedInputByteBufferNano p0){
       return new SCGameInteractionExitPkMode().mergeFrom(p0);
    }
    public static SCGameInteractionExitPkMode parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGameInteractionExitPkMode(), p0);
    }
    public SCGameInteractionExitPkMode clear(){
       this.id = "";
       this.timestamp = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.id).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       SCGameInteractionExitPkMode ttimestamp = this.timestamp;
       if (ttimestamp) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttimestamp);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGameInteractionExitPkMode mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.timestamp = p0.readUInt64();
             }
          }else {
             this.id = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.id).equals("")) {
          p0.writeString(1, this.id);
       }
       SCGameInteractionExitPkMode ttimestamp = this.timestamp;
       if (ttimestamp) {
          p0.writeUInt64(2, ttimestamp);
       }
       super.writeTo(p0);
       return;
    }
}
