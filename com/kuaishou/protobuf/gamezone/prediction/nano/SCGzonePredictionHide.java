package com.kuaishou.protobuf.gamezone.prediction.nano.SCGzonePredictionHide;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCGzonePredictionHide extends MessageNano	// class@000be4
{
    public int type;
    public static SCGzonePredictionHide[] _emptyArray;

    public void SCGzonePredictionHide(){
       super();
       this.clear();
    }
    public static SCGzonePredictionHide[] emptyArray(){
       if (SCGzonePredictionHide._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGzonePredictionHide._emptyArray == null) {
             SCGzonePredictionHide[] sCGzonePredi = new SCGzonePredictionHide[0];
             SCGzonePredictionHide._emptyArray = sCGzonePredi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGzonePredictionHide._emptyArray;
    }
    public static SCGzonePredictionHide parseFrom(CodedInputByteBufferNano p0){
       return new SCGzonePredictionHide().mergeFrom(p0);
    }
    public static SCGzonePredictionHide parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGzonePredictionHide(), p0);
    }
    public SCGzonePredictionHide clear(){
       this.type = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCGzonePredictionHide ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGzonePredictionHide mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             i = p0.readInt32();
             if (i && i != 1) {
                continue ;
             }else {
                this.type = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCGzonePredictionHide ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       super.writeTo(p0);
       return;
    }
}
