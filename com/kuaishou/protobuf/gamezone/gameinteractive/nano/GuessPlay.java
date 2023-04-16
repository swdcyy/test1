package com.kuaishou.protobuf.gamezone.gameinteractive.nano.GuessPlay;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.gamezone.gameinteractive.nano.GuessPlayAnswer;
import com.kuaishou.protobuf.gamezone.gameinteractive.nano.GuessPlayGuess;

public final class GuessPlay extends MessageNano	// class@000ba8
{
    public GuessPlayAnswer answer;
    public GuessPlayGuess guess;
    public static GuessPlay[] _emptyArray;

    public void GuessPlay(){
       super();
       this.clear();
    }
    public static GuessPlay[] emptyArray(){
       if (GuessPlay._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (GuessPlay._emptyArray == null) {
             GuessPlay[] guessPlayArr = new GuessPlay[0];
             GuessPlay._emptyArray = guessPlayArr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return GuessPlay._emptyArray;
    }
    public static GuessPlay parseFrom(CodedInputByteBufferNano p0){
       return new GuessPlay().mergeFrom(p0);
    }
    public static GuessPlay parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new GuessPlay(), p0);
    }
    public GuessPlay clear(){
       this.guess = null;
       this.answer = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       GuessPlay tguess = this.guess;
       if (tguess != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tguess);
       }
       tguess = this.answer;
       if (tguess != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tguess);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public GuessPlay mergeFrom(CodedInputByteBufferNano p0){
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
             }else if(this.answer == null){
                this.answer = new GuessPlayAnswer();
             }
             p0.readMessage(this.answer);
          }else if(this.guess == null){
             this.guess = new GuessPlayGuess();
          }
          p0.readMessage(this.guess);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       GuessPlay tguess = this.guess;
       if (tguess != null) {
          p0.writeMessage(1, tguess);
       }
       tguess = this.answer;
       if (tguess != null) {
          p0.writeMessage(2, tguess);
       }
       super.writeTo(p0);
       return;
    }
}
