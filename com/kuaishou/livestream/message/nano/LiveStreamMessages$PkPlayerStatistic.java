package com.kuaishou.livestream.message.nano.LiveStreamMessages$PkPlayerStatistic;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LivePkMessages$PkPlayerRoundStatistic;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.ChatWishList;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$PkPlayerSeasonInfo;
import java.lang.System;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamMessages$PkPlayerStatistic extends MessageNano	// class@00131a
{
    public int continuousWinCount;
    public LiveStreamMessages$PkPlayerSeasonInfo curSeasonInfo;
    public String displayScoreText;
    public int levelChangeInfo;
    public String liveStreamId;
    public boolean openWishList;
    public boolean participant;
    public UserInfos$UserInfo player;
    public LiveStreamMessages$PkPlayerSeasonInfo preSeasonInfo;
    public LivePkMessages$PkPlayerRoundStatistic[] roundStatistic;
    public long score;
    public ChatWishList wishList;
    public int wonRounds;
    public static LiveStreamMessages$PkPlayerStatistic[] _emptyArray;

    public void LiveStreamMessages$PkPlayerStatistic(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$PkPlayerStatistic[] emptyArray(){
       if (LiveStreamMessages$PkPlayerStatistic._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$PkPlayerStatistic._emptyArray == null) {
             LiveStreamMessages$PkPlayerStatistic[] pkPlayerStat = new LiveStreamMessages$PkPlayerStatistic[0];
             LiveStreamMessages$PkPlayerStatistic._emptyArray = pkPlayerStat;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$PkPlayerStatistic._emptyArray;
    }
    public static LiveStreamMessages$PkPlayerStatistic parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$PkPlayerStatistic().mergeFrom(p0);
    }
    public static LiveStreamMessages$PkPlayerStatistic parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$PkPlayerStatistic(), p0);
    }
    public LiveStreamMessages$PkPlayerStatistic clear(){
       this.player = null;
       this.score = 0;
       this.liveStreamId = "";
       this.roundStatistic = LivePkMessages$PkPlayerRoundStatistic.emptyArray();
       this.wonRounds = 0;
       this.continuousWinCount = 0;
       this.preSeasonInfo = null;
       this.curSeasonInfo = null;
       this.participant = false;
       this.levelChangeInfo = 0;
       this.displayScoreText = "";
       this.openWishList = false;
       this.wishList = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$PkPlayerStatistic tplayer = this.player;
       if (tplayer != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tplayer);
       }
       tplayer = this.score;
       if (tplayer - null) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tplayer);
       }
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.liveStreamId);
       }
       tplayer = this.roundStatistic;
       if (tplayer != null && tplayer.length > 0) {
          int i1 = 0;
          LiveStreamMessages$PkPlayerStatistic troundStatis = this.roundStatistic;
          while (i1 < troundStatis.length) {
             object oobject = troundStatis[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tplayer = this.wonRounds;
       if (tplayer != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tplayer);
       }
       tplayer = this.continuousWinCount;
       if (tplayer != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tplayer);
       }
       tplayer = this.preSeasonInfo;
       if (tplayer != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, tplayer);
       }
       tplayer = this.curSeasonInfo;
       if (tplayer != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, tplayer);
       }
       tplayer = this.participant;
       if (tplayer != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(9, tplayer);
       }
       tplayer = this.levelChangeInfo;
       if (tplayer != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(10, tplayer);
       }
       if (!(this.displayScoreText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.displayScoreText);
       }
       tplayer = this.openWishList;
       if (tplayer != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(12, tplayer);
       }
       tplayer = this.wishList;
       if (tplayer != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(13, tplayer);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$PkPlayerStatistic mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                if (this.player == null) {
                   this.player = new UserInfos$UserInfo();
                }
                p0.readMessage(this.player);
                break;
              case 16:
                this.score = p0.readUInt64();
                break;
              case 26:
                this.liveStreamId = p0.readString();
                break;
              case '"':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 34);
                LiveStreamMessages$PkPlayerStatistic troundStatis = this.roundStatistic;
                int i1 = (troundStatis == null)? 0: troundStatis.length;
                i = i + i1;
                LivePkMessages$PkPlayerRoundStatistic[] pkPlayerRoun = new LivePkMessages$PkPlayerRoundStatistic[i];
                if (i1) {
                   System.arraycopy(troundStatis, 0, pkPlayerRoun, 0, i1);
                }
                int i2 = i - 1;
                while (i1 < i2) {
                   pkPlayerRoun[i1] = new LivePkMessages$PkPlayerRoundStatistic();
                   p0.readMessage(pkPlayerRoun[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                pkPlayerRoun[i1] = new LivePkMessages$PkPlayerRoundStatistic();
                p0.readMessage(pkPlayerRoun[i1]);
                this.roundStatistic = pkPlayerRoun;
                break;
              case '(':
                this.wonRounds = p0.readUInt32();
                break;
              case '0':
                this.continuousWinCount = p0.readUInt32();
                break;
              case ':':
                if (this.preSeasonInfo == null) {
                   this.preSeasonInfo = new LiveStreamMessages$PkPlayerSeasonInfo();
                }
                p0.readMessage(this.preSeasonInfo);
                break;
              case 'B':
                if (this.curSeasonInfo == null) {
                   this.curSeasonInfo = new LiveStreamMessages$PkPlayerSeasonInfo();
                }
                p0.readMessage(this.curSeasonInfo);
                break;
              case 'H':
                this.participant = p0.readBool();
                break;
              case 'P':
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && (i != 4 && i != 5))))) {
                   continue ;
                }else {
                   this.levelChangeInfo = i;
                }
                break;
              case 'Z':
                this.displayScoreText = p0.readString();
                break;
              case '`':
                this.openWishList = p0.readBool();
                break;
              case 'j':
                if (this.wishList == null) {
                   this.wishList = new ChatWishList();
                }
                p0.readMessage(this.wishList);
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
       LiveStreamMessages$PkPlayerStatistic tplayer = this.player;
       if (tplayer != null) {
          p0.writeMessage(1, tplayer);
       }
       tplayer = this.score;
       if (tplayer - null) {
          p0.writeUInt64(2, tplayer);
       }
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(3, this.liveStreamId);
       }
       tplayer = this.roundStatistic;
       if (tplayer != null && tplayer.length > 0) {
          int i = 0;
          LiveStreamMessages$PkPlayerStatistic troundStatis = this.roundStatistic;
          while (i < troundStatis.length) {
             object oobject = troundStatis[i];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i = i + 1;
          }
       }
       tplayer = this.wonRounds;
       if (tplayer != null) {
          p0.writeUInt32(5, tplayer);
       }
       tplayer = this.continuousWinCount;
       if (tplayer != null) {
          p0.writeUInt32(6, tplayer);
       }
       tplayer = this.preSeasonInfo;
       if (tplayer != null) {
          p0.writeMessage(7, tplayer);
       }
       tplayer = this.curSeasonInfo;
       if (tplayer != null) {
          p0.writeMessage(8, tplayer);
       }
       tplayer = this.participant;
       if (tplayer != null) {
          p0.writeBool(9, tplayer);
       }
       tplayer = this.levelChangeInfo;
       if (tplayer != null) {
          p0.writeInt32(10, tplayer);
       }
       if (!(this.displayScoreText).equals(str)) {
          p0.writeString(11, this.displayScoreText);
       }
       tplayer = this.openWishList;
       if (tplayer != null) {
          p0.writeBool(12, tplayer);
       }
       tplayer = this.wishList;
       if (tplayer != null) {
          p0.writeMessage(13, tplayer);
       }
       super.writeTo(p0);
       return;
    }
}
