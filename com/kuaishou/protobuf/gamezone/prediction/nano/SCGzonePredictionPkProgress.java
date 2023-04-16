package com.kuaishou.protobuf.gamezone.prediction.nano.SCGzonePredictionPkProgress;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.gamezone.prediction.nano.PredictionPkAuthor;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class SCGzonePredictionPkProgress extends MessageNano	// class@000be8
{
    public long maxDelayMillis;
    public PredictionPkAuthor[] pkPredictionAuthor;
    public long pkPredictionId;
    public static SCGzonePredictionPkProgress[] _emptyArray;

    public void SCGzonePredictionPkProgress(){
       super();
       this.clear();
    }
    public static SCGzonePredictionPkProgress[] emptyArray(){
       if (SCGzonePredictionPkProgress._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGzonePredictionPkProgress._emptyArray == null) {
             SCGzonePredictionPkProgress[] sCGzonePredi = new SCGzonePredictionPkProgress[0];
             SCGzonePredictionPkProgress._emptyArray = sCGzonePredi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGzonePredictionPkProgress._emptyArray;
    }
    public static SCGzonePredictionPkProgress parseFrom(CodedInputByteBufferNano p0){
       return new SCGzonePredictionPkProgress().mergeFrom(p0);
    }
    public static SCGzonePredictionPkProgress parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGzonePredictionPkProgress(), p0);
    }
    public SCGzonePredictionPkProgress clear(){
       this.pkPredictionId = 0;
       this.pkPredictionAuthor = PredictionPkAuthor.emptyArray();
       this.maxDelayMillis = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCGzonePredictionPkProgress tpkPredictio = this.pkPredictionId;
       int i1 = 0;
       if (tpkPredictio - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tpkPredictio);
       }
       tpkPredictio = this.pkPredictionAuthor;
       if (tpkPredictio != null && tpkPredictio.length > 0) {
          int i2 = 0;
          SCGzonePredictionPkProgress tpkPredictio1 = this.pkPredictionAuthor;
          while (i2 < tpkPredictio1.length) {
             object oobject = tpkPredictio1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tpkPredictio = this.maxDelayMillis;
       if (tpkPredictio - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tpkPredictio);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGzonePredictionPkProgress mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             int i1 = 18;
             if (i != i1) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.maxDelayMillis = p0.readUInt64();
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                SCGzonePredictionPkProgress tpkPredictio = this.pkPredictionAuthor;
                int i2 = (tpkPredictio == null)? 0: tpkPredictio.length;
                i = i + i2;
                PredictionPkAuthor[] predictionPk = new PredictionPkAuthor[i];
                if (i2) {
                   System.arraycopy(tpkPredictio, 0, predictionPk, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   predictionPk[i2] = new PredictionPkAuthor();
                   p0.readMessage(predictionPk[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                predictionPk[i2] = new PredictionPkAuthor();
                p0.readMessage(predictionPk[i2]);
                this.pkPredictionAuthor = predictionPk;
             }
          }else {
             this.pkPredictionId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCGzonePredictionPkProgress tpkPredictio = this.pkPredictionId;
       int i = 0;
       if (tpkPredictio - i) {
          p0.writeUInt64(1, tpkPredictio);
       }
       tpkPredictio = this.pkPredictionAuthor;
       if (tpkPredictio != null && tpkPredictio.length > 0) {
          int i1 = 0;
          SCGzonePredictionPkProgress tpkPredictio1 = this.pkPredictionAuthor;
          while (i1 < tpkPredictio1.length) {
             object oobject = tpkPredictio1[i1];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tpkPredictio = this.maxDelayMillis;
       if (tpkPredictio - i) {
          p0.writeUInt64(3, tpkPredictio);
       }
       super.writeTo(p0);
       return;
    }
}
