package com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatState;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatTeam;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatHeadView;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.SCLiveScoreLineChatStatistic;
import com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatTopProgressBarInfo;
import java.lang.System;
import com.kuaishou.protobuf.livestream.nano.TargetGiftTabInfo;
import com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatVoteEnd;
import com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatTimeLine;

public final class LiveScoreLineChatState extends MessageNano	// class@000d0e
{
    public String contributionListKrn;
    public boolean enableShowAttachGiftEntrance;
    public int giftId;
    public String giftToken;
    public LiveScoreLineChatHeadView[] headViewList;
    public UserInfos$PicUrl[] headerViewPicUrl;
    public long roomOwner;
    public String scoreLineChatId;
    public int scoreType;
    public SCLiveScoreLineChatStatistic statistic;
    public int status;
    public TargetGiftTabInfo targetGiftTabInfo;
    public LiveScoreLineChatTeam[] team;
    public LiveScoreLineChatTimeLine timeLine;
    public LiveScoreLineChatTopProgressBarInfo topProgressBarInfo;
    public LiveScoreLineChatVoteEnd voteEndInfo;
    public static LiveScoreLineChatState[] _emptyArray;

    public void LiveScoreLineChatState(){
       super();
       this.clear();
    }
    public static LiveScoreLineChatState[] emptyArray(){
       if (LiveScoreLineChatState._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveScoreLineChatState._emptyArray == null) {
             LiveScoreLineChatState[] liveScoreLin = new LiveScoreLineChatState[0];
             LiveScoreLineChatState._emptyArray = liveScoreLin;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveScoreLineChatState._emptyArray;
    }
    public static LiveScoreLineChatState parseFrom(CodedInputByteBufferNano p0){
       return new LiveScoreLineChatState().mergeFrom(p0);
    }
    public static LiveScoreLineChatState parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveScoreLineChatState(), p0);
    }
    public LiveScoreLineChatState clear(){
       this.scoreLineChatId = "";
       this.scoreType = 0;
       this.status = 0;
       this.timeLine = null;
       this.team = LiveScoreLineChatTeam.emptyArray();
       this.giftId = 0;
       this.roomOwner = 0;
       this.voteEndInfo = null;
       this.targetGiftTabInfo = null;
       this.giftToken = "";
       this.headerViewPicUrl = UserInfos$PicUrl.emptyArray();
       this.enableShowAttachGiftEntrance = false;
       this.headViewList = LiveScoreLineChatHeadView.emptyArray();
       this.topProgressBarInfo = null;
       this.contributionListKrn = "";
       this.statistic = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       LiveScoreLineChatState tteam;
       object oobject;
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.scoreLineChatId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.scoreLineChatId);
       }
       LiveScoreLineChatState tscoreType = this.scoreType;
       if (tscoreType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tscoreType);
       }
       tscoreType = this.status;
       if (tscoreType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tscoreType);
       }
       tscoreType = this.timeLine;
       if (tscoreType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tscoreType);
       }
       tscoreType = this.team;
       int i1 = 0;
       if (tscoreType != null && tscoreType.length > 0) {
          i2 = 0;
          tteam = this.team;
          while (i2 < tteam.length) {
             oobject = tteam[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tscoreType = this.giftId;
       if (tscoreType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tscoreType);
       }
       tteam = this.roomOwner;
       if (tteam) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tteam);
       }
       tscoreType = this.voteEndInfo;
       if (tscoreType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, tscoreType);
       }
       tscoreType = this.targetGiftTabInfo;
       if (tscoreType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, tscoreType);
       }
       if (!(this.giftToken).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.giftToken);
       }
       tscoreType = this.headerViewPicUrl;
       if (tscoreType != null && tscoreType.length > 0) {
          i2 = 0;
          tteam = this.headerViewPicUrl;
          while (i2 < tteam.length) {
             oobject = tteam[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(11, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tscoreType = this.enableShowAttachGiftEntrance;
       if (tscoreType != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(12, tscoreType);
       }
       tscoreType = this.headViewList;
       if (tscoreType != null && tscoreType.length > 0) {
          tscoreType = this.headViewList;
          while (i1 < tscoreType.length) {
             object oobject1 = tscoreType[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(13, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tscoreType = this.topProgressBarInfo;
       if (tscoreType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(14, tscoreType);
       }
       if (!(this.contributionListKrn).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(15, this.contributionListKrn);
       }
       tscoreType = this.statistic;
       if (tscoreType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(16, tscoreType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveScoreLineChatState mergeFrom(CodedInputByteBufferNano p0){
       int i1;
       int i2;
       while (true) {
          int i = p0.readTag();
          LiveScoreLineChatState liveScoreLin = 1;
          switch (i){
              case 0:
                return this;
              case 10:
                this.scoreLineChatId = p0.readString();
                break;
              case 16:
                i = p0.readInt32();
                if (i && i != liveScoreLin) {
                   continue ;
                }else {
                   this.scoreType = i;
                }
                break;
              case 24:
                i = p0.readInt32();
                if (i && (i != liveScoreLin && i != 2)) {
                   continue ;
                }else {
                   this.status = i;
                }
                break;
              case '"':
                if (this.timeLine == null) {
                   this.timeLine = new LiveScoreLineChatTimeLine();
                }
                p0.readMessage(this.timeLine);
                break;
              case '*':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 42);
                liveScoreLin = this.team;
                i1 = (liveScoreLin == null)? 0: liveScoreLin.length;
                i = i + i1;
                LiveScoreLineChatTeam[] liveScoreLin1 = new LiveScoreLineChatTeam[i];
                if (i1) {
                   System.arraycopy(liveScoreLin, 0, liveScoreLin1, 0, i1);
                }
                i2 = i - 1;
                while (i1 < i2) {
                   liveScoreLin1[i1] = new LiveScoreLineChatTeam();
                   p0.readMessage(liveScoreLin1[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                liveScoreLin1[i1] = new LiveScoreLineChatTeam();
                p0.readMessage(liveScoreLin1[i1]);
                this.team = liveScoreLin1;
                break;
              case '0':
                this.giftId = p0.readUInt32();
                break;
              case '8':
                this.roomOwner = p0.readUInt64();
                break;
              case 'B':
                if (this.voteEndInfo == null) {
                   this.voteEndInfo = new LiveScoreLineChatVoteEnd();
                }
                p0.readMessage(this.voteEndInfo);
                break;
              case 'J':
                if (this.targetGiftTabInfo == null) {
                   this.targetGiftTabInfo = new TargetGiftTabInfo();
                }
                p0.readMessage(this.targetGiftTabInfo);
                break;
              case 'R':
                this.giftToken = p0.readString();
                break;
              case 'Z':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 90);
                liveScoreLin = this.headerViewPicUrl;
                i1 = (liveScoreLin == null)? 0: liveScoreLin.length;
                i = i + i1;
                UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                if (i1) {
                   System.arraycopy(liveScoreLin, 0, picUrlArray, 0, i1);
                }
                i2 = i - 1;
                while (i1 < i2) {
                   picUrlArray[i1] = new UserInfos$PicUrl();
                   p0.readMessage(picUrlArray[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                picUrlArray[i1] = new UserInfos$PicUrl();
                p0.readMessage(picUrlArray[i1]);
                this.headerViewPicUrl = picUrlArray;
                break;
              case '`':
                this.enableShowAttachGiftEntrance = p0.readBool();
                break;
              case 'j':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 106);
                liveScoreLin = this.headViewList;
                i1 = (liveScoreLin == null)? 0: liveScoreLin.length;
                i = i + i1;
                LiveScoreLineChatHeadView[] liveScoreLin2 = new LiveScoreLineChatHeadView[i];
                if (i1) {
                   System.arraycopy(liveScoreLin, 0, liveScoreLin2, 0, i1);
                }
                i2 = i - 1;
                while (i1 < i2) {
                   liveScoreLin2[i1] = new LiveScoreLineChatHeadView();
                   p0.readMessage(liveScoreLin2[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                liveScoreLin2[i1] = new LiveScoreLineChatHeadView();
                p0.readMessage(liveScoreLin2[i1]);
                this.headViewList = liveScoreLin2;
                break;
              case 'r':
                if (this.topProgressBarInfo == null) {
                   this.topProgressBarInfo = new LiveScoreLineChatTopProgressBarInfo();
                }
                p0.readMessage(this.topProgressBarInfo);
                break;
              case 'z':
                this.contributionListKrn = p0.readString();
                break;
              case 130:
                if (this.statistic == null) {
                   this.statistic = new SCLiveScoreLineChatStatistic();
                }
                p0.readMessage(this.statistic);
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       int i1;
       LiveScoreLineChatState tteam;
       object oobject;
       String str = "";
       if (!(this.scoreLineChatId).equals(str)) {
          p0.writeString(1, this.scoreLineChatId);
       }
       LiveScoreLineChatState tscoreType = this.scoreType;
       if (tscoreType != null) {
          p0.writeInt32(2, tscoreType);
       }
       tscoreType = this.status;
       if (tscoreType != null) {
          p0.writeInt32(3, tscoreType);
       }
       tscoreType = this.timeLine;
       if (tscoreType != null) {
          p0.writeMessage(4, tscoreType);
       }
       tscoreType = this.team;
       int i = 0;
       if (tscoreType != null && tscoreType.length > 0) {
          i1 = 0;
          tteam = this.team;
          while (i1 < tteam.length) {
             oobject = tteam[i1];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tscoreType = this.giftId;
       if (tscoreType != null) {
          p0.writeUInt32(6, tscoreType);
       }
       tteam = this.roomOwner;
       if (tteam) {
          p0.writeUInt64(7, tteam);
       }
       tscoreType = this.voteEndInfo;
       if (tscoreType != null) {
          p0.writeMessage(8, tscoreType);
       }
       tscoreType = this.targetGiftTabInfo;
       if (tscoreType != null) {
          p0.writeMessage(9, tscoreType);
       }
       if (!(this.giftToken).equals(str)) {
          p0.writeString(10, this.giftToken);
       }
       tscoreType = this.headerViewPicUrl;
       if (tscoreType != null && tscoreType.length > 0) {
          i1 = 0;
          tteam = this.headerViewPicUrl;
          while (i1 < tteam.length) {
             oobject = tteam[i1];
             if (oobject != null) {
                p0.writeMessage(11, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tscoreType = this.enableShowAttachGiftEntrance;
       if (tscoreType != null) {
          p0.writeBool(12, tscoreType);
       }
       tscoreType = this.headViewList;
       if (tscoreType != null && tscoreType.length > 0) {
          tscoreType = this.headViewList;
          while (i < tscoreType.length) {
             object oobject1 = tscoreType[i];
             if (oobject1 != null) {
                p0.writeMessage(13, oobject1);
             }
             i = i + 1;
          }
       }
       tscoreType = this.topProgressBarInfo;
       if (tscoreType != null) {
          p0.writeMessage(14, tscoreType);
       }
       if (!(this.contributionListKrn).equals(str)) {
          p0.writeString(15, this.contributionListKrn);
       }
       tscoreType = this.statistic;
       if (tscoreType != null) {
          p0.writeMessage(16, tscoreType);
       }
       super.writeTo(p0);
       return;
    }
}
