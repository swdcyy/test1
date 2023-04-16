package com.kuaishou.protobuf.livestream.nano.LiveMultiPkTeamMember;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LivePkMessages$PkTopScoreUserDetailInfo;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.BountyGameInfo;
import com.kuaishou.protobuf.livestream.nano.MultiPkSkinTheme;
import java.lang.System;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkColorInfo;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveMultiPkTeamMember extends MessageNano	// class@000ccb
{
    public BountyGameInfo bountyGameInfo;
    public MultiPkSkinTheme customPkSkinTheme;
    public String displayScore;
    public String liveStreamId;
    public UserInfos$UserInfo player;
    public long score;
    public LiveMultiPkColorInfo scoreBackgroundColor;
    public LivePkMessages$PkTopScoreUserDetailInfo[] topUserDetail;
    public static LiveMultiPkTeamMember[] _emptyArray;

    public void LiveMultiPkTeamMember(){
       super();
       this.clear();
    }
    public static LiveMultiPkTeamMember[] emptyArray(){
       if (LiveMultiPkTeamMember._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMultiPkTeamMember._emptyArray == null) {
             LiveMultiPkTeamMember[] liveMultiPkT = new LiveMultiPkTeamMember[0];
             LiveMultiPkTeamMember._emptyArray = liveMultiPkT;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMultiPkTeamMember._emptyArray;
    }
    public static LiveMultiPkTeamMember parseFrom(CodedInputByteBufferNano p0){
       return new LiveMultiPkTeamMember().mergeFrom(p0);
    }
    public static LiveMultiPkTeamMember parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMultiPkTeamMember(), p0);
    }
    public LiveMultiPkTeamMember clear(){
       this.player = null;
       this.score = 0;
       this.displayScore = "";
       this.liveStreamId = "";
       this.scoreBackgroundColor = null;
       this.topUserDetail = LivePkMessages$PkTopScoreUserDetailInfo.emptyArray();
       this.customPkSkinTheme = null;
       this.bountyGameInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveMultiPkTeamMember tplayer = this.player;
       if (tplayer != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tplayer);
       }
       tplayer = this.score;
       if (tplayer - null) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tplayer);
       }
       String str = "";
       if (!(this.displayScore).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.displayScore);
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.liveStreamId);
       }
       tplayer = this.scoreBackgroundColor;
       if (tplayer != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, tplayer);
       }
       tplayer = this.topUserDetail;
       if (tplayer != null && tplayer.length > 0) {
          int i1 = 0;
          LiveMultiPkTeamMember ttopUserDeta = this.topUserDetail;
          while (i1 < ttopUserDeta.length) {
             object oobject = ttopUserDeta[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(6, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tplayer = this.customPkSkinTheme;
       if (tplayer != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, tplayer);
       }
       tplayer = this.bountyGameInfo;
       if (tplayer != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, tplayer);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveMultiPkTeamMember mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         int i1 = 50;
                         if (i != i1) {
                            if (i != 58) {
                               if (i != 66) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else if(this.bountyGameInfo == null){
                                  this.bountyGameInfo = new BountyGameInfo();
                               }
                               p0.readMessage(this.bountyGameInfo);
                            }else if(this.customPkSkinTheme == null){
                               this.customPkSkinTheme = new MultiPkSkinTheme();
                            }
                            p0.readMessage(this.customPkSkinTheme);
                         }else {
                            i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                            LiveMultiPkTeamMember ttopUserDeta = this.topUserDetail;
                            int i2 = (ttopUserDeta == null)? 0: ttopUserDeta.length;
                            i = i + i2;
                            LivePkMessages$PkTopScoreUserDetailInfo[] pkTopScoreUs = new LivePkMessages$PkTopScoreUserDetailInfo[i];
                            if (i2) {
                               System.arraycopy(ttopUserDeta, 0, pkTopScoreUs, 0, i2);
                            }
                            i1 = i - 1;
                            while (i2 < i1) {
                               pkTopScoreUs[i2] = new LivePkMessages$PkTopScoreUserDetailInfo();
                               p0.readMessage(pkTopScoreUs[i2]);
                               p0.readTag();
                               i2 = i2 + 1;
                            }
                            pkTopScoreUs[i2] = new LivePkMessages$PkTopScoreUserDetailInfo();
                            p0.readMessage(pkTopScoreUs[i2]);
                            this.topUserDetail = pkTopScoreUs;
                         }
                      }else if(this.scoreBackgroundColor == null){
                         this.scoreBackgroundColor = new LiveMultiPkColorInfo();
                      }
                      p0.readMessage(this.scoreBackgroundColor);
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
       LiveMultiPkTeamMember tplayer = this.player;
       if (tplayer != null) {
          p0.writeMessage(1, tplayer);
       }
       tplayer = this.score;
       if (tplayer - null) {
          p0.writeUInt64(2, tplayer);
       }
       String str = "";
       if (!(this.displayScore).equals(str)) {
          p0.writeString(3, this.displayScore);
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(4, this.liveStreamId);
       }
       tplayer = this.scoreBackgroundColor;
       if (tplayer != null) {
          p0.writeMessage(5, tplayer);
       }
       tplayer = this.topUserDetail;
       if (tplayer != null && tplayer.length > 0) {
          int i = 0;
          LiveMultiPkTeamMember ttopUserDeta = this.topUserDetail;
          while (i < ttopUserDeta.length) {
             object oobject = ttopUserDeta[i];
             if (oobject != null) {
                p0.writeMessage(6, oobject);
             }
             i = i + 1;
          }
       }
       tplayer = this.customPkSkinTheme;
       if (tplayer != null) {
          p0.writeMessage(7, tplayer);
       }
       tplayer = this.bountyGameInfo;
       if (tplayer != null) {
          p0.writeMessage(8, tplayer);
       }
       super.writeTo(p0);
       return;
    }
}
