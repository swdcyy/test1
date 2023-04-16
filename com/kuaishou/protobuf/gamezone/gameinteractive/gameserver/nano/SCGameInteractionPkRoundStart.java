package com.kuaishou.protobuf.gamezone.gameinteractive.gameserver.nano.SCGameInteractionPkRoundStart;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCGameInteractionPkRoundStart extends MessageNano	// class@000ba1
{
    public String id;
    public int maxDuration;
    public String pkModeId;
    public boolean showProcess;
    public long timestamp;
    public static SCGameInteractionPkRoundStart[] _emptyArray;

    public void SCGameInteractionPkRoundStart(){
       super();
       this.clear();
    }
    public static SCGameInteractionPkRoundStart[] emptyArray(){
       if (SCGameInteractionPkRoundStart._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGameInteractionPkRoundStart._emptyArray == null) {
             SCGameInteractionPkRoundStart[] sCGameIntera = new SCGameInteractionPkRoundStart[0];
             SCGameInteractionPkRoundStart._emptyArray = sCGameIntera;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGameInteractionPkRoundStart._emptyArray;
    }
    public static SCGameInteractionPkRoundStart parseFrom(CodedInputByteBufferNano p0){
       return new SCGameInteractionPkRoundStart().mergeFrom(p0);
    }
    public static SCGameInteractionPkRoundStart parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGameInteractionPkRoundStart(), p0);
    }
    public SCGameInteractionPkRoundStart clear(){
       this.pkModeId = "";
       this.id = "";
       this.maxDuration = 0;
       this.showProcess = false;
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
       SCGameInteractionPkRoundStart tmaxDuration = this.maxDuration;
       if (tmaxDuration != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tmaxDuration);
       }
       tmaxDuration = this.showProcess;
       if (tmaxDuration != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, tmaxDuration);
       }
       tmaxDuration = this.timestamp;
       if (tmaxDuration) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tmaxDuration);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGameInteractionPkRoundStart mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.timestamp = p0.readUInt64();
                      }
                   }else {
                      this.showProcess = p0.readBool();
                   }
                }else {
                   this.maxDuration = p0.readUInt32();
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
       SCGameInteractionPkRoundStart tmaxDuration = this.maxDuration;
       if (tmaxDuration != null) {
          p0.writeUInt32(3, tmaxDuration);
       }
       tmaxDuration = this.showProcess;
       if (tmaxDuration != null) {
          p0.writeBool(4, tmaxDuration);
       }
       tmaxDuration = this.timestamp;
       if (tmaxDuration) {
          p0.writeUInt64(5, tmaxDuration);
       }
       super.writeTo(p0);
       return;
    }
}
