package com.kuaishou.protobuf.gamezone.gameinteractive.gameserver.nano.SCGameInteractionPkContributionRank;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.gamezone.gameinteractive.gameserver.nano.SCGameInteractionPkContributionRank$Rank;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCGameInteractionPkContributionRank extends MessageNano	// class@000b9e
{
    public String pkModeId;
    public String pkRoundId;
    public SCGameInteractionPkContributionRank$Rank[] rank;
    public long timestamp;
    public static SCGameInteractionPkContributionRank[] _emptyArray;

    public void SCGameInteractionPkContributionRank(){
       super();
       this.clear();
    }
    public static SCGameInteractionPkContributionRank[] emptyArray(){
       if (SCGameInteractionPkContributionRank._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGameInteractionPkContributionRank._emptyArray == null) {
             SCGameInteractionPkContributionRank[] sCGameIntera = new SCGameInteractionPkContributionRank[0];
             SCGameInteractionPkContributionRank._emptyArray = sCGameIntera;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGameInteractionPkContributionRank._emptyArray;
    }
    public static SCGameInteractionPkContributionRank parseFrom(CodedInputByteBufferNano p0){
       return new SCGameInteractionPkContributionRank().mergeFrom(p0);
    }
    public static SCGameInteractionPkContributionRank parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGameInteractionPkContributionRank(), p0);
    }
    public SCGameInteractionPkContributionRank clear(){
       this.pkModeId = "";
       this.pkRoundId = "";
       this.rank = SCGameInteractionPkContributionRank$Rank.emptyArray();
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
       SCGameInteractionPkContributionRank trank = this.rank;
       if (trank != null && trank.length > 0) {
          int i1 = 0;
          SCGameInteractionPkContributionRank trank1 = this.rank;
          while (i1 < trank1.length) {
             object oobject = trank1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       trank = this.timestamp;
       if (trank) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, trank);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGameInteractionPkContributionRank mergeFrom(CodedInputByteBufferNano p0){
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
                   SCGameInteractionPkContributionRank trank = this.rank;
                   int i2 = (trank == null)? 0: trank.length;
                   i = i + i2;
                   SCGameInteractionPkContributionRank$Rank[] rankArray = new SCGameInteractionPkContributionRank$Rank[i];
                   if (i2) {
                      System.arraycopy(trank, 0, rankArray, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      rankArray[i2] = new SCGameInteractionPkContributionRank$Rank();
                      p0.readMessage(rankArray[i2]);
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   rankArray[i2] = new SCGameInteractionPkContributionRank$Rank();
                   p0.readMessage(rankArray[i2]);
                   this.rank = rankArray;
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
       SCGameInteractionPkContributionRank trank = this.rank;
       if (trank != null && trank.length > 0) {
          int i = 0;
          SCGameInteractionPkContributionRank trank1 = this.rank;
          while (i < trank1.length) {
             object oobject = trank1[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       trank = this.timestamp;
       if (trank) {
          p0.writeUInt64(4, trank);
       }
       super.writeTo(p0);
       return;
    }
}
