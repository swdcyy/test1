package com.kuaishou.protobuf.gamezone.gameinteractive.gameserver.nano.SCGameInteractionPkOtherSideStatus;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCGameInteractionPkOtherSideStatus extends MessageNano	// class@000b9f
{
    public boolean mute;
    public String pkModeId;
    public long timestamp;
    public static SCGameInteractionPkOtherSideStatus[] _emptyArray;

    public void SCGameInteractionPkOtherSideStatus(){
       super();
       this.clear();
    }
    public static SCGameInteractionPkOtherSideStatus[] emptyArray(){
       if (SCGameInteractionPkOtherSideStatus._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGameInteractionPkOtherSideStatus._emptyArray == null) {
             SCGameInteractionPkOtherSideStatus[] sCGameIntera = new SCGameInteractionPkOtherSideStatus[0];
             SCGameInteractionPkOtherSideStatus._emptyArray = sCGameIntera;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGameInteractionPkOtherSideStatus._emptyArray;
    }
    public static SCGameInteractionPkOtherSideStatus parseFrom(CodedInputByteBufferNano p0){
       return new SCGameInteractionPkOtherSideStatus().mergeFrom(p0);
    }
    public static SCGameInteractionPkOtherSideStatus parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGameInteractionPkOtherSideStatus(), p0);
    }
    public SCGameInteractionPkOtherSideStatus clear(){
       this.pkModeId = "";
       this.mute = false;
       this.timestamp = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.pkModeId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.pkModeId);
       }
       SCGameInteractionPkOtherSideStatus tmute = this.mute;
       if (tmute != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tmute);
       }
       tmute = this.timestamp;
       if (tmute) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tmute);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGameInteractionPkOtherSideStatus mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.timestamp = p0.readUInt64();
                }
             }else {
                this.mute = p0.readBool();
             }
          }else {
             this.pkModeId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.pkModeId).equals("")) {
          p0.writeString(1, this.pkModeId);
       }
       SCGameInteractionPkOtherSideStatus tmute = this.mute;
       if (tmute != null) {
          p0.writeBool(2, tmute);
       }
       tmute = this.timestamp;
       if (tmute) {
          p0.writeUInt64(3, tmute);
       }
       super.writeTo(p0);
       return;
    }
}
