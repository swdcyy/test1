package com.kuaishou.protobuf.gamezone.gameinteractive.gameserver.nano.SCGameInteractionPkScoreProgress;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.gamezone.gameinteractive.gameserver.nano.SCGameInteractionPkScoreProgress$Score;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCGameInteractionPkScoreProgress extends MessageNano	// class@000ba3
{
    public String pkModeId;
    public String pkRoundId;
    public SCGameInteractionPkScoreProgress$Score[] score;
    public long timestamp;
    public static SCGameInteractionPkScoreProgress[] _emptyArray;

    public void SCGameInteractionPkScoreProgress(){
       super();
       this.clear();
    }
    public static SCGameInteractionPkScoreProgress[] emptyArray(){
       if (SCGameInteractionPkScoreProgress._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGameInteractionPkScoreProgress._emptyArray == null) {
             SCGameInteractionPkScoreProgress[] sCGameIntera = new SCGameInteractionPkScoreProgress[0];
             SCGameInteractionPkScoreProgress._emptyArray = sCGameIntera;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGameInteractionPkScoreProgress._emptyArray;
    }
    public static SCGameInteractionPkScoreProgress parseFrom(CodedInputByteBufferNano p0){
       return new SCGameInteractionPkScoreProgress().mergeFrom(p0);
    }
    public static SCGameInteractionPkScoreProgress parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGameInteractionPkScoreProgress(), p0);
    }
    public SCGameInteractionPkScoreProgress clear(){
       this.pkModeId = "";
       this.pkRoundId = "";
       this.score = SCGameInteractionPkScoreProgress$Score.emptyArray();
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
       if (!(this.pkRoundId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.pkRoundId);
       }
       SCGameInteractionPkScoreProgress tscore = this.score;
       if (tscore != null && tscore.length > 0) {
          int i1 = 0;
          SCGameInteractionPkScoreProgress tscore1 = this.score;
          while (i1 < tscore1.length) {
             object oobject = tscore1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tscore = this.timestamp;
       if (tscore) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tscore);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGameInteractionPkScoreProgress mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                int i1 = 26;
                if (i != i1) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.timestamp = p0.readUInt64();
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   SCGameInteractionPkScoreProgress tscore = this.score;
                   int i2 = (tscore == null)? 0: tscore.length;
                   i = i + i2;
                   SCGameInteractionPkScoreProgress$Score[] scoreArray = new SCGameInteractionPkScoreProgress$Score[i];
                   if (i2) {
                      System.arraycopy(tscore, 0, scoreArray, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      scoreArray[i2] = new SCGameInteractionPkScoreProgress$Score();
                      p0.readMessage(scoreArray[i2]);
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   scoreArray[i2] = new SCGameInteractionPkScoreProgress$Score();
                   p0.readMessage(scoreArray[i2]);
                   this.score = scoreArray;
                }
             }else {
                this.pkRoundId = p0.readString();
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
       if (!(this.pkRoundId).equals(str)) {
          p0.writeString(2, this.pkRoundId);
       }
       SCGameInteractionPkScoreProgress tscore = this.score;
       if (tscore != null && tscore.length > 0) {
          int i = 0;
          SCGameInteractionPkScoreProgress tscore1 = this.score;
          while (i < tscore1.length) {
             object oobject = tscore1[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       tscore = this.timestamp;
       if (tscore) {
          p0.writeUInt64(4, tscore);
       }
       super.writeTo(p0);
       return;
    }
}
