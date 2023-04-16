package com.kuaishou.protobuf.gamezone.gameinteractive.nano.GuessPlayGuess;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.System;

public final class GuessPlayGuess extends MessageNano	// class@000baa
{
    public long duration;
    public String guessId;
    public int[] items;
    public long startTime;
    public static GuessPlayGuess[] _emptyArray;

    public void GuessPlayGuess(){
       super();
       this.clear();
    }
    public static GuessPlayGuess[] emptyArray(){
       if (GuessPlayGuess._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (GuessPlayGuess._emptyArray == null) {
             GuessPlayGuess[] guessPlayGue = new GuessPlayGuess[0];
             GuessPlayGuess._emptyArray = guessPlayGue;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return GuessPlayGuess._emptyArray;
    }
    public static GuessPlayGuess parseFrom(CodedInputByteBufferNano p0){
       return new GuessPlayGuess().mergeFrom(p0);
    }
    public static GuessPlayGuess parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new GuessPlayGuess(), p0);
    }
    public GuessPlayGuess clear(){
       this.guessId = "";
       this.startTime = 0;
       this.duration = 0;
       this.items = WireFormatNano.EMPTY_INT_ARRAY;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.guessId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.guessId);
       }
       GuessPlayGuess tstartTime = this.startTime;
       int i1 = 0;
       if (tstartTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tstartTime);
       }
       tstartTime = this.duration;
       if (tstartTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tstartTime);
       }
       GuessPlayGuess titems = this.items;
       if (titems != null && titems.length > 0) {
          int i2 = 0;
          int i3 = 0;
          GuessPlayGuess titems1 = this.items;
          while (i2 < titems1.length) {
             i3 = i3 + CodedOutputByteBufferNano.computeUInt32SizeNoTag(titems1[i2]);
             i2 = i2 + 1;
          }
          i = (i + i3) + (titems1.length * 1);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public GuessPlayGuess mergeFrom(CodedInputByteBufferNano p0){
       int i2;
       GuessPlayGuess titems;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   int i1 = 32;
                   if (i != i1) {
                      if (i != 34) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         i = p0.pushLimit(p0.readRawVarint32());
                         i1 = p0.getPosition();
                         i2 = 0;
                         while (p0.getBytesUntilLimit() > 0) {
                            p0.readUInt32();
                            i2 = i2 + 1;
                         }
                         p0.rewindToPosition(i1);
                         titems = this.items;
                         int i3 = (titems == null)? 0: titems.length;
                         i2 = i2 + i3;
                         int[] ointArray = new int[i2];
                         if (i3) {
                            System.arraycopy(titems, 0, ointArray, 0, i3);
                         }
                         while (i3 < i2) {
                            ointArray[i3] = p0.readUInt32();
                            i3 = i3 + 1;
                         }
                         this.items = ointArray;
                         p0.popLimit(i);
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      titems = this.items;
                      i2 = (titems == null)? 0: titems.length;
                      i = i + i2;
                      int[] ointArray1 = new int[i];
                      if (i2) {
                         System.arraycopy(titems, 0, ointArray1, 0, i2);
                      }
                      i1 = i - 1;
                      while (i2 < i1) {
                         ointArray1[i2] = p0.readUInt32();
                         p0.readTag();
                         i2 = i2 + 1;
                      }
                      ointArray1[i2] = p0.readUInt32();
                      this.items = ointArray1;
                   }
                }else {
                   this.duration = p0.readUInt64();
                }
             }else {
                this.startTime = p0.readUInt64();
             }
          }else {
             this.guessId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.guessId).equals("")) {
          p0.writeString(1, this.guessId);
       }
       GuessPlayGuess tstartTime = this.startTime;
       int i = 0;
       if (tstartTime - i) {
          p0.writeUInt64(2, tstartTime);
       }
       tstartTime = this.duration;
       if (tstartTime - i) {
          p0.writeUInt64(3, tstartTime);
       }
       tstartTime = this.items;
       if (tstartTime != null && tstartTime.length > 0) {
          int i1 = 0;
          GuessPlayGuess titems = this.items;
          while (i1 < titems.length) {
             p0.writeUInt32(4, titems[i1]);
             i1 = i1 + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
