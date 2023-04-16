package com.kuaishou.protobuf.gamezone.prediction.nano.SCGzonePredictionPkEnd;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCGzonePredictionPkEnd extends MessageNano	// class@000be5
{
    public long maxDelayMillis;
    public long pkPredictionId;
    public static SCGzonePredictionPkEnd[] _emptyArray;

    public void SCGzonePredictionPkEnd(){
       super();
       this.clear();
    }
    public static SCGzonePredictionPkEnd[] emptyArray(){
       if (SCGzonePredictionPkEnd._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGzonePredictionPkEnd._emptyArray == null) {
             SCGzonePredictionPkEnd[] sCGzonePredi = new SCGzonePredictionPkEnd[0];
             SCGzonePredictionPkEnd._emptyArray = sCGzonePredi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGzonePredictionPkEnd._emptyArray;
    }
    public static SCGzonePredictionPkEnd parseFrom(CodedInputByteBufferNano p0){
       return new SCGzonePredictionPkEnd().mergeFrom(p0);
    }
    public static SCGzonePredictionPkEnd parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGzonePredictionPkEnd(), p0);
    }
    public SCGzonePredictionPkEnd clear(){
       this.pkPredictionId = 0;
       this.maxDelayMillis = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCGzonePredictionPkEnd tpkPredictio = this.pkPredictionId;
       int i1 = 0;
       if (tpkPredictio - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tpkPredictio);
       }
       tpkPredictio = this.maxDelayMillis;
       if (tpkPredictio - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tpkPredictio);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGzonePredictionPkEnd mergeFrom(CodedInputByteBufferNano p0){
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
                this.maxDelayMillis = p0.readUInt64();
             }
          }else {
             this.pkPredictionId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCGzonePredictionPkEnd tpkPredictio = this.pkPredictionId;
       int i = 0;
       if (tpkPredictio - i) {
          p0.writeUInt64(1, tpkPredictio);
       }
       tpkPredictio = this.maxDelayMillis;
       if (tpkPredictio - i) {
          p0.writeUInt64(2, tpkPredictio);
       }
       super.writeTo(p0);
       return;
    }
}
