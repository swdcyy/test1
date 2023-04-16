package com.kuaishou.protobuf.gamezone.gameinteractive.gameserver.nano.SCGameInteractionActionMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCGameInteractionActionMessage extends MessageNano	// class@000b99
{
    public String cmd;
    public String message;
    public static SCGameInteractionActionMessage[] _emptyArray;

    public void SCGameInteractionActionMessage(){
       super();
       this.clear();
    }
    public static SCGameInteractionActionMessage[] emptyArray(){
       if (SCGameInteractionActionMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGameInteractionActionMessage._emptyArray == null) {
             SCGameInteractionActionMessage[] sCGameIntera = new SCGameInteractionActionMessage[0];
             SCGameInteractionActionMessage._emptyArray = sCGameIntera;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGameInteractionActionMessage._emptyArray;
    }
    public static SCGameInteractionActionMessage parseFrom(CodedInputByteBufferNano p0){
       return new SCGameInteractionActionMessage().mergeFrom(p0);
    }
    public static SCGameInteractionActionMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGameInteractionActionMessage(), p0);
    }
    public SCGameInteractionActionMessage clear(){
       this.message = "";
       this.cmd = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.message).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.message);
       }
       if (!(this.cmd).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.cmd);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGameInteractionActionMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.cmd = p0.readString();
             }
          }else {
             this.message = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.message).equals(str)) {
          p0.writeString(1, this.message);
       }
       if (!(this.cmd).equals(str)) {
          p0.writeString(2, this.cmd);
       }
       super.writeTo(p0);
       return;
    }
}
