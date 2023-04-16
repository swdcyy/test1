package com.kuaishou.livestream.message.nano.LiveVoicePartyPkTeamStatistic;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveVoicePartyPkTopContributor;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveVoicePartyPkTeamStatistic extends MessageNano	// class@0013d0
{
    public UserInfos$UserInfo author;
    public String liveStreamId;
    public long score;
    public int teamType;
    public LiveVoicePartyPkTopContributor[] topContributor;
    public static LiveVoicePartyPkTeamStatistic[] _emptyArray;

    public void LiveVoicePartyPkTeamStatistic(){
       super();
       this.clear();
    }
    public static LiveVoicePartyPkTeamStatistic[] emptyArray(){
       if (LiveVoicePartyPkTeamStatistic._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveVoicePartyPkTeamStatistic._emptyArray == null) {
             LiveVoicePartyPkTeamStatistic[] liveVoicePar = new LiveVoicePartyPkTeamStatistic[0];
             LiveVoicePartyPkTeamStatistic._emptyArray = liveVoicePar;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveVoicePartyPkTeamStatistic._emptyArray;
    }
    public static LiveVoicePartyPkTeamStatistic parseFrom(CodedInputByteBufferNano p0){
       return new LiveVoicePartyPkTeamStatistic().mergeFrom(p0);
    }
    public static LiveVoicePartyPkTeamStatistic parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveVoicePartyPkTeamStatistic(), p0);
    }
    public LiveVoicePartyPkTeamStatistic clear(){
       this.author = null;
       this.liveStreamId = "";
       this.teamType = 0;
       this.score = 0;
       this.topContributor = LiveVoicePartyPkTopContributor.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveVoicePartyPkTeamStatistic tauthor = this.author;
       if (tauthor != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tauthor);
       }
       if (!(this.liveStreamId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.liveStreamId);
       }
       tauthor = this.teamType;
       if (tauthor != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tauthor);
       }
       tauthor = this.score;
       if (tauthor) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tauthor);
       }
       tauthor = this.topContributor;
       if (tauthor != null && tauthor.length > 0) {
          int i1 = 0;
          LiveVoicePartyPkTeamStatistic ttopContribu = this.topContributor;
          while (i1 < ttopContribu.length) {
             object oobject = ttopContribu[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveVoicePartyPkTeamStatistic mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      int i1 = 42;
                      if (i != i1) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                         LiveVoicePartyPkTeamStatistic ttopContribu = this.topContributor;
                         int i2 = (ttopContribu == null)? 0: ttopContribu.length;
                         i = i + i2;
                         LiveVoicePartyPkTopContributor[] liveVoicePar = new LiveVoicePartyPkTopContributor[i];
                         if (i2) {
                            System.arraycopy(ttopContribu, 0, liveVoicePar, 0, i2);
                         }
                         i1 = i - 1;
                         while (i2 < i1) {
                            liveVoicePar[i2] = new LiveVoicePartyPkTopContributor();
                            p0.readMessage(liveVoicePar[i2]);
                            p0.readTag();
                            i2 = i2 + 1;
                         }
                         liveVoicePar[i2] = new LiveVoicePartyPkTopContributor();
                         p0.readMessage(liveVoicePar[i2]);
                         this.topContributor = liveVoicePar;
                      }
                   }else {
                      this.score = p0.readUInt64();
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && i != 2)) {
                      continue ;
                   }else {
                      this.teamType = i;
                   }
                }
             }else {
                this.liveStreamId = p0.readString();
             }
          }else if(this.author == null){
             this.author = new UserInfos$UserInfo();
          }
          p0.readMessage(this.author);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveVoicePartyPkTeamStatistic tauthor = this.author;
       if (tauthor != null) {
          p0.writeMessage(1, tauthor);
       }
       if (!(this.liveStreamId).equals("")) {
          p0.writeString(2, this.liveStreamId);
       }
       tauthor = this.teamType;
       if (tauthor != null) {
          p0.writeInt32(3, tauthor);
       }
       tauthor = this.score;
       if (tauthor) {
          p0.writeUInt64(4, tauthor);
       }
       tauthor = this.topContributor;
       if (tauthor != null && tauthor.length > 0) {
          int i = 0;
          LiveVoicePartyPkTeamStatistic ttopContribu = this.topContributor;
          while (i < ttopContribu.length) {
             object oobject = ttopContribu[i];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
