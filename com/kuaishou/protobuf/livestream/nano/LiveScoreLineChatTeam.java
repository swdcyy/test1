package com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatTeam;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatTeamMember;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatColorInfo;
import java.lang.System;

public final class LiveScoreLineChatTeam extends MessageNano	// class@000d0f
{
    public int currentRank;
    public String displayTeamScore;
    public String displayTopProgressBarScore;
    public LiveScoreLineChatColorInfo teamFrameColor;
    public int teamId;
    public LiveScoreLineChatTeamMember[] teamMember;
    public long teamScore;
    public long teamTarget;
    public static LiveScoreLineChatTeam[] _emptyArray;

    public void LiveScoreLineChatTeam(){
       super();
       this.clear();
    }
    public static LiveScoreLineChatTeam[] emptyArray(){
       if (LiveScoreLineChatTeam._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveScoreLineChatTeam._emptyArray == null) {
             LiveScoreLineChatTeam[] liveScoreLin = new LiveScoreLineChatTeam[0];
             LiveScoreLineChatTeam._emptyArray = liveScoreLin;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveScoreLineChatTeam._emptyArray;
    }
    public static LiveScoreLineChatTeam parseFrom(CodedInputByteBufferNano p0){
       return new LiveScoreLineChatTeam().mergeFrom(p0);
    }
    public static LiveScoreLineChatTeam parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveScoreLineChatTeam(), p0);
    }
    public LiveScoreLineChatTeam clear(){
       this.teamId = 0;
       this.teamScore = 0;
       this.displayTeamScore = "";
       this.teamMember = LiveScoreLineChatTeamMember.emptyArray();
       this.currentRank = 0;
       this.teamFrameColor = null;
       this.teamTarget = 0;
       this.displayTopProgressBarScore = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       LiveScoreLineChatTeam tteamMember;
       int i = super.computeSerializedSize();
       LiveScoreLineChatTeam tteamId = this.teamId;
       if (tteamId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tteamId);
       }
       tteamId = this.teamScore;
       if (tteamId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tteamId);
       }
       String str = "";
       if (!(this.displayTeamScore).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.displayTeamScore);
       }
       tteamId = this.teamMember;
       if (tteamId != null && tteamId.length > 0) {
          int i1 = 0;
          tteamMember = this.teamMember;
          while (i1 < tteamMember.length) {
             object oobject = tteamMember[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tteamId = this.currentRank;
       if (tteamId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tteamId);
       }
       tteamId = this.teamFrameColor;
       if (tteamId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, tteamId);
       }
       tteamMember = this.teamTarget;
       if (tteamMember) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tteamMember);
       }
       if (!(this.displayTopProgressBarScore).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.displayTopProgressBarScore);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveScoreLineChatTeam mergeFrom(CodedInputByteBufferNano p0){
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
                         if (i != 50) {
                            if (i != 56) {
                               if (i != 66) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  this.displayTopProgressBarScore = p0.readString();
                               }
                            }else {
                               this.teamTarget = p0.readUInt64();
                            }
                         }else if(this.teamFrameColor == null){
                            this.teamFrameColor = new LiveScoreLineChatColorInfo();
                         }
                         p0.readMessage(this.teamFrameColor);
                      }else {
                         this.currentRank = p0.readUInt32();
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      LiveScoreLineChatTeam tteamMember = this.teamMember;
                      int i2 = (tteamMember == null)? 0: tteamMember.length;
                      i = i + i2;
                      LiveScoreLineChatTeamMember[] liveScoreLin = new LiveScoreLineChatTeamMember[i];
                      if (i2) {
                         System.arraycopy(tteamMember, 0, liveScoreLin, 0, i2);
                      }
                      i1 = i - 1;
                      while (i2 < i1) {
                         liveScoreLin[i2] = new LiveScoreLineChatTeamMember();
                         p0.readMessage(liveScoreLin[i2]);
                         p0.readTag();
                         i2 = i2 + 1;
                      }
                      liveScoreLin[i2] = new LiveScoreLineChatTeamMember();
                      p0.readMessage(liveScoreLin[i2]);
                      this.teamMember = liveScoreLin;
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
       LiveScoreLineChatTeam tteamMember;
       LiveScoreLineChatTeam tteamId = this.teamId;
       if (tteamId != null) {
          p0.writeUInt32(1, tteamId);
       }
       tteamId = this.teamScore;
       if (tteamId) {
          p0.writeUInt64(2, tteamId);
       }
       String str = "";
       if (!(this.displayTeamScore).equals(str)) {
          p0.writeString(3, this.displayTeamScore);
       }
       tteamId = this.teamMember;
       if (tteamId != null && tteamId.length > 0) {
          int i = 0;
          tteamMember = this.teamMember;
          while (i < tteamMember.length) {
             object oobject = tteamMember[i];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i = i + 1;
          }
       }
       tteamId = this.currentRank;
       if (tteamId != null) {
          p0.writeUInt32(5, tteamId);
       }
       tteamId = this.teamFrameColor;
       if (tteamId != null) {
          p0.writeMessage(6, tteamId);
       }
       tteamMember = this.teamTarget;
       if (tteamMember) {
          p0.writeUInt64(7, tteamMember);
       }
       if (!(this.displayTopProgressBarScore).equals(str)) {
          p0.writeString(8, this.displayTopProgressBarScore);
       }
       super.writeTo(p0);
       return;
    }
}
