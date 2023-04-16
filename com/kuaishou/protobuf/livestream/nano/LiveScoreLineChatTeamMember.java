package com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatTeamMember;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveScoreLineChatTeamMember extends MessageNano	// class@000d10
{
    public String displayScore;
    public String displayTargetScore;
    public String liveStreamId;
    public UserInfos$UserInfo player;
    public long score;
    public String scoreBackgroundColor;
    public String scoreBlankColor;
    public String scoreProgressColor;
    public long targetScore;
    public static LiveScoreLineChatTeamMember[] _emptyArray;

    public void LiveScoreLineChatTeamMember(){
       super();
       this.clear();
    }
    public static LiveScoreLineChatTeamMember[] emptyArray(){
       if (LiveScoreLineChatTeamMember._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveScoreLineChatTeamMember._emptyArray == null) {
             LiveScoreLineChatTeamMember[] liveScoreLin = new LiveScoreLineChatTeamMember[0];
             LiveScoreLineChatTeamMember._emptyArray = liveScoreLin;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveScoreLineChatTeamMember._emptyArray;
    }
    public static LiveScoreLineChatTeamMember parseFrom(CodedInputByteBufferNano p0){
       return new LiveScoreLineChatTeamMember().mergeFrom(p0);
    }
    public static LiveScoreLineChatTeamMember parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveScoreLineChatTeamMember(), p0);
    }
    public LiveScoreLineChatTeamMember clear(){
       this.player = null;
       this.score = 0;
       this.displayScore = "";
       this.liveStreamId = "";
       this.targetScore = 0;
       this.displayTargetScore = "";
       this.scoreProgressColor = "";
       this.scoreBlankColor = "";
       this.scoreBackgroundColor = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveScoreLineChatTeamMember tplayer = this.player;
       if (tplayer != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tplayer);
       }
       tplayer = this.score;
       LiveScoreLineChatTeamMember liveScoreLin = null;
       if (tplayer - liveScoreLin) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tplayer);
       }
       String str = "";
       if (!(this.displayScore).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.displayScore);
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.liveStreamId);
       }
       LiveScoreLineChatTeamMember ttargetScore = this.targetScore;
       if (ttargetScore - liveScoreLin) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, ttargetScore);
       }
       if (!(this.displayTargetScore).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.displayTargetScore);
       }
       if (!(this.scoreProgressColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.scoreProgressColor);
       }
       if (!(this.scoreBlankColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.scoreBlankColor);
       }
       if (!(this.scoreBackgroundColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.scoreBackgroundColor);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveScoreLineChatTeamMember mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 40) {
                         if (i != 50) {
                            if (i != 58) {
                               if (i != 66) {
                                  if (i != 74) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     this.scoreBackgroundColor = p0.readString();
                                  }
                               }else {
                                  this.scoreBlankColor = p0.readString();
                               }
                            }else {
                               this.scoreProgressColor = p0.readString();
                            }
                         }else {
                            this.displayTargetScore = p0.readString();
                         }
                      }else {
                         this.targetScore = p0.readUInt64();
                      }
                   }else {
                      this.liveStreamId = p0.readString();
                   }
                }else {
                   this.displayScore = p0.readString();
                }
             }else {
                this.score = p0.readUInt64();
             }
          }else if(this.player == null){
             this.player = new UserInfos$UserInfo();
          }
          p0.readMessage(this.player);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveScoreLineChatTeamMember tplayer = this.player;
       if (tplayer != null) {
          p0.writeMessage(1, tplayer);
       }
       tplayer = this.score;
       LiveScoreLineChatTeamMember liveScoreLin = null;
       if (tplayer - liveScoreLin) {
          p0.writeUInt64(2, tplayer);
       }
       String str = "";
       if (!(this.displayScore).equals(str)) {
          p0.writeString(3, this.displayScore);
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(4, this.liveStreamId);
       }
       LiveScoreLineChatTeamMember ttargetScore = this.targetScore;
       if (ttargetScore - liveScoreLin) {
          p0.writeUInt64(5, ttargetScore);
       }
       if (!(this.displayTargetScore).equals(str)) {
          p0.writeString(6, this.displayTargetScore);
       }
       if (!(this.scoreProgressColor).equals(str)) {
          p0.writeString(7, this.scoreProgressColor);
       }
       if (!(this.scoreBlankColor).equals(str)) {
          p0.writeString(8, this.scoreBlankColor);
       }
       if (!(this.scoreBackgroundColor).equals(str)) {
          p0.writeString(9, this.scoreBackgroundColor);
       }
       super.writeTo(p0);
       return;
    }
}
