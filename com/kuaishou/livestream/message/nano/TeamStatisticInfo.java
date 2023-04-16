package com.kuaishou.livestream.message.nano.TeamStatisticInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.TeamPkTopUser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class TeamStatisticInfo extends MessageNano	// class@001475
{
    public long score;
    public int team;
    public TeamPkTopUser[] topUser;
    public static TeamStatisticInfo[] _emptyArray;

    public void TeamStatisticInfo(){
       super();
       this.clear();
    }
    public static TeamStatisticInfo[] emptyArray(){
       if (TeamStatisticInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (TeamStatisticInfo._emptyArray == null) {
             TeamStatisticInfo[] teamStatisti = new TeamStatisticInfo[0];
             TeamStatisticInfo._emptyArray = teamStatisti;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return TeamStatisticInfo._emptyArray;
    }
    public static TeamStatisticInfo parseFrom(CodedInputByteBufferNano p0){
       return new TeamStatisticInfo().mergeFrom(p0);
    }
    public static TeamStatisticInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new TeamStatisticInfo(), p0);
    }
    public TeamStatisticInfo clear(){
       this.team = 0;
       this.score = 0;
       this.topUser = TeamPkTopUser.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       TeamStatisticInfo tteam = this.team;
       if (tteam != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tteam);
       }
       tteam = this.score;
       if (tteam) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tteam);
       }
       tteam = this.topUser;
       if (tteam != null && tteam.length > 0) {
          int i1 = 0;
          TeamStatisticInfo ttopUser = this.topUser;
          while (i1 < ttopUser.length) {
             object oobject = ttopUser[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public TeamStatisticInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                int i1 = 26;
                if (i != i1) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   TeamStatisticInfo ttopUser = this.topUser;
                   int i2 = (ttopUser == null)? 0: ttopUser.length;
                   i = i + i2;
                   TeamPkTopUser[] teamPkTopUse = new TeamPkTopUser[i];
                   if (i2) {
                      System.arraycopy(ttopUser, 0, teamPkTopUse, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      teamPkTopUse[i2] = new TeamPkTopUser();
                      p0.readMessage(teamPkTopUse[i2]);
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   teamPkTopUse[i2] = new TeamPkTopUser();
                   p0.readMessage(teamPkTopUse[i2]);
                   this.topUser = teamPkTopUse;
                }
             }else {
                this.score = p0.readUInt64();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.team = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       TeamStatisticInfo tteam = this.team;
       if (tteam != null) {
          p0.writeInt32(1, tteam);
       }
       tteam = this.score;
       if (tteam) {
          p0.writeUInt64(2, tteam);
       }
       tteam = this.topUser;
       if (tteam != null && tteam.length > 0) {
          int i = 0;
          TeamStatisticInfo ttopUser = this.topUser;
          while (i < ttopUser.length) {
             object oobject = ttopUser[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
