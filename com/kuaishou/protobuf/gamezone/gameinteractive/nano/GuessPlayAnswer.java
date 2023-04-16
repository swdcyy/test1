package com.kuaishou.protobuf.gamezone.gameinteractive.nano.GuessPlayAnswer;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class GuessPlayAnswer extends MessageNano	// class@000ba9
{
    public String guessId;
    public String result;
    public long toleranceDelay;
    public static GuessPlayAnswer[] _emptyArray;

    public void GuessPlayAnswer(){
       super();
       this.clear();
    }
    public static GuessPlayAnswer[] emptyArray(){
       if (GuessPlayAnswer._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (GuessPlayAnswer._emptyArray == null) {
             GuessPlayAnswer[] guessPlayAns = new GuessPlayAnswer[0];
             GuessPlayAnswer._emptyArray = guessPlayAns;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return GuessPlayAnswer._emptyArray;
    }
    public static GuessPlayAnswer parseFrom(CodedInputByteBufferNano p0){
       return new GuessPlayAnswer().mergeFrom(p0);
    }
    public static GuessPlayAnswer parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new GuessPlayAnswer(), p0);
    }
    public GuessPlayAnswer clear(){
       this.guessId = "";
       this.result = "";
       this.toleranceDelay = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.guessId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.guessId);
       }
       if (!(this.result).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.result);
       }
       GuessPlayAnswer ttoleranceDe = this.toleranceDelay;
       if (ttoleranceDe) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ttoleranceDe);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public GuessPlayAnswer mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.toleranceDelay = p0.readUInt64();
                }
             }else {
                this.result = p0.readString();
             }
          }else {
             this.guessId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.guessId).equals(str)) {
          p0.writeString(1, this.guessId);
       }
       if (!(this.result).equals(str)) {
          p0.writeString(2, this.result);
       }
       GuessPlayAnswer ttoleranceDe = this.toleranceDelay;
       if (ttoleranceDe) {
          p0.writeUInt64(3, ttoleranceDe);
       }
       super.writeTo(p0);
       return;
    }
}
