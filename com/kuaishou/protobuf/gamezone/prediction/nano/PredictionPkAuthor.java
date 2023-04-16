package com.kuaishou.protobuf.gamezone.prediction.nano.PredictionPkAuthor;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class PredictionPkAuthor extends MessageNano	// class@000be2
{
    public String amountDisplay;
    public long amountValue;
    public long authorId;
    public static PredictionPkAuthor[] _emptyArray;

    public void PredictionPkAuthor(){
       super();
       this.clear();
    }
    public static PredictionPkAuthor[] emptyArray(){
       if (PredictionPkAuthor._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (PredictionPkAuthor._emptyArray == null) {
             PredictionPkAuthor[] predictionPk = new PredictionPkAuthor[0];
             PredictionPkAuthor._emptyArray = predictionPk;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return PredictionPkAuthor._emptyArray;
    }
    public static PredictionPkAuthor parseFrom(CodedInputByteBufferNano p0){
       return new PredictionPkAuthor().mergeFrom(p0);
    }
    public static PredictionPkAuthor parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new PredictionPkAuthor(), p0);
    }
    public PredictionPkAuthor clear(){
       this.authorId = 0;
       this.amountValue = 0;
       this.amountDisplay = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       PredictionPkAuthor tauthorId = this.authorId;
       int i1 = 0;
       if (tauthorId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tauthorId);
       }
       tauthorId = this.amountValue;
       if (tauthorId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tauthorId);
       }
       if (!(this.amountDisplay).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.amountDisplay);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public PredictionPkAuthor mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.amountDisplay = p0.readString();
                }
             }else {
                this.amountValue = p0.readUInt64();
             }
          }else {
             this.authorId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       PredictionPkAuthor tauthorId = this.authorId;
       int i = 0;
       if (tauthorId - i) {
          p0.writeUInt64(1, tauthorId);
       }
       tauthorId = this.amountValue;
       if (tauthorId - i) {
          p0.writeUInt64(2, tauthorId);
       }
       if (!(this.amountDisplay).equals("")) {
          p0.writeString(3, this.amountDisplay);
       }
       super.writeTo(p0);
       return;
    }
}
