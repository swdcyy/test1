package com.kuaishou.protobuf.livestream.nano.LiveMultiPkTeam;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkTeamMember;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkColorInfo;
import java.lang.System;

public final class LiveMultiPkTeam extends MessageNano	// class@000cca
{
    public int currentRank;
    public String displayTeamScore;
    public boolean enableClickContributionList;
    public boolean needFuzzyScore;
    public LiveMultiPkColorInfo progressBarColor;
    public LiveMultiPkColorInfo teamFrameColor;
    public int teamId;
    public LiveMultiPkTeamMember[] teamMember;
    public long teamScore;
    public static LiveMultiPkTeam[] _emptyArray;

    public void LiveMultiPkTeam(){
       super();
       this.clear();
    }
    public static LiveMultiPkTeam[] emptyArray(){
       if (LiveMultiPkTeam._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMultiPkTeam._emptyArray == null) {
             LiveMultiPkTeam[] liveMultiPkT = new LiveMultiPkTeam[0];
             LiveMultiPkTeam._emptyArray = liveMultiPkT;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMultiPkTeam._emptyArray;
    }
    public static LiveMultiPkTeam parseFrom(CodedInputByteBufferNano p0){
       return new LiveMultiPkTeam().mergeFrom(p0);
    }
    public static LiveMultiPkTeam parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMultiPkTeam(), p0);
    }
    public LiveMultiPkTeam clear(){
       this.teamId = 0;
       this.teamScore = 0;
       this.displayTeamScore = "";
       this.teamMember = LiveMultiPkTeamMember.emptyArray();
       this.enableClickContributionList = false;
       this.currentRank = 0;
       this.teamFrameColor = null;
       this.progressBarColor = null;
       this.needFuzzyScore = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveMultiPkTeam tteamId = this.teamId;
       if (tteamId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tteamId);
       }
       tteamId = this.teamScore;
       if (tteamId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tteamId);
       }
       if (!(this.displayTeamScore).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.displayTeamScore);
       }
       tteamId = this.teamMember;
       if (tteamId != null && tteamId.length > 0) {
          int i1 = 0;
          LiveMultiPkTeam tteamMember = this.teamMember;
          while (i1 < tteamMember.length) {
             object oobject = tteamMember[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tteamId = this.enableClickContributionList;
       if (tteamId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, tteamId);
       }
       tteamId = this.currentRank;
       if (tteamId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tteamId);
       }
       tteamId = this.teamFrameColor;
       if (tteamId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, tteamId);
       }
       tteamId = this.progressBarColor;
       if (tteamId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, tteamId);
       }
       tteamId = this.needFuzzyScore;
       if (tteamId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(9, tteamId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveMultiPkTeam mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   int i1 = 34;
                   if (i != i1) {
                      if (i != 40) {
                         if (i != 48) {
                            if (i != 58) {
                               if (i != 66) {
                                  if (i != 72) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     this.needFuzzyScore = p0.readBool();
                                  }
                               }else if(this.progressBarColor == null){
                                  this.progressBarColor = new LiveMultiPkColorInfo();
                               }
                               p0.readMessage(this.progressBarColor);
                            }else if(this.teamFrameColor == null){
                               this.teamFrameColor = new LiveMultiPkColorInfo();
                            }
                            p0.readMessage(this.teamFrameColor);
                         }else {
                            this.currentRank = p0.readUInt32();
                         }
                      }else {
                         this.enableClickContributionList = p0.readBool();
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      LiveMultiPkTeam tteamMember = this.teamMember;
                      int i2 = (tteamMember == null)? 0: tteamMember.length;
                      i = i + i2;
                      LiveMultiPkTeamMember[] liveMultiPkT = new LiveMultiPkTeamMember[i];
                      if (i2) {
                         System.arraycopy(tteamMember, 0, liveMultiPkT, 0, i2);
                      }
                      i1 = i - 1;
                      while (i2 < i1) {
                         liveMultiPkT[i2] = new LiveMultiPkTeamMember();
                         p0.readMessage(liveMultiPkT[i2]);
                         p0.readTag();
                         i2 = i2 + 1;
                      }
                      liveMultiPkT[i2] = new LiveMultiPkTeamMember();
                      p0.readMessage(liveMultiPkT[i2]);
                      this.teamMember = liveMultiPkT;
                   }
                }else {
                   this.displayTeamScore = p0.readString();
                }
             }else {
                this.teamScore = p0.readUInt64();
             }
          }else {
             this.teamId = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveMultiPkTeam tteamId = this.teamId;
       if (tteamId != null) {
          p0.writeUInt32(1, tteamId);
       }
       tteamId = this.teamScore;
       if (tteamId) {
          p0.writeUInt64(2, tteamId);
       }
       if (!(this.displayTeamScore).equals("")) {
          p0.writeString(3, this.displayTeamScore);
       }
       tteamId = this.teamMember;
       if (tteamId != null && tteamId.length > 0) {
          int i = 0;
          LiveMultiPkTeam tteamMember = this.teamMember;
          while (i < tteamMember.length) {
             object oobject = tteamMember[i];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i = i + 1;
          }
       }
       tteamId = this.enableClickContributionList;
       if (tteamId != null) {
          p0.writeBool(5, tteamId);
       }
       tteamId = this.currentRank;
       if (tteamId != null) {
          p0.writeUInt32(6, tteamId);
       }
       tteamId = this.teamFrameColor;
       if (tteamId != null) {
          p0.writeMessage(7, tteamId);
       }
       tteamId = this.progressBarColor;
       if (tteamId != null) {
          p0.writeMessage(8, tteamId);
       }
       tteamId = this.needFuzzyScore;
       if (tteamId != null) {
          p0.writeBool(9, tteamId);
       }
       super.writeTo(p0);
       return;
    }
}
