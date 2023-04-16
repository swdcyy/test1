package com.kuaishou.protobuf.livestream.nano.LivePuzzleUserInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.lang.System;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LivePuzzleUserInfo extends MessageNano	// class@000cdc
{
    public int answerId;
    public int answerIdThisTime;
    public int countRecord;
    public String countRecordDescription;
    public boolean isPublish;
    public boolean isWin;
    public boolean isWinThisTime;
    public String liveStreamId;
    public UserInfos$UserInfo player;
    public String quickCommentRouter;
    public int roleType;
    public long[] thisTimeBeWonAuthorId;
    public int winNum;
    public static LivePuzzleUserInfo[] _emptyArray;

    public void LivePuzzleUserInfo(){
       super();
       this.clear();
    }
    public static LivePuzzleUserInfo[] emptyArray(){
       if (LivePuzzleUserInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePuzzleUserInfo._emptyArray == null) {
             LivePuzzleUserInfo[] livePuzzleUs = new LivePuzzleUserInfo[0];
             LivePuzzleUserInfo._emptyArray = livePuzzleUs;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePuzzleUserInfo._emptyArray;
    }
    public static LivePuzzleUserInfo parseFrom(CodedInputByteBufferNano p0){
       return new LivePuzzleUserInfo().mergeFrom(p0);
    }
    public static LivePuzzleUserInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePuzzleUserInfo(), p0);
    }
    public LivePuzzleUserInfo clear(){
       this.player = null;
       this.liveStreamId = "";
       this.quickCommentRouter = "";
       this.roleType = 0;
       this.isPublish = false;
       this.answerId = 0;
       this.countRecordDescription = "";
       this.countRecord = 0;
       this.isWin = false;
       this.isWinThisTime = false;
       this.answerIdThisTime = 0;
       this.winNum = 0;
       this.thisTimeBeWonAuthorId = WireFormatNano.EMPTY_LONG_ARRAY;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LivePuzzleUserInfo tplayer = this.player;
       if (tplayer != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tplayer);
       }
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.liveStreamId);
       }
       if (!(this.quickCommentRouter).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.quickCommentRouter);
       }
       tplayer = this.roleType;
       if (tplayer != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tplayer);
       }
       tplayer = this.isPublish;
       if (tplayer != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, tplayer);
       }
       tplayer = this.answerId;
       if (tplayer != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tplayer);
       }
       if (!(this.countRecordDescription).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.countRecordDescription);
       }
       tplayer = this.countRecord;
       if (tplayer != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, tplayer);
       }
       tplayer = this.isWin;
       if (tplayer != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(9, tplayer);
       }
       tplayer = this.isWinThisTime;
       if (tplayer != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(10, tplayer);
       }
       tplayer = this.answerIdThisTime;
       if (tplayer != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(11, tplayer);
       }
       tplayer = this.winNum;
       if (tplayer != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(12, tplayer);
       }
       tplayer = this.thisTimeBeWonAuthorId;
       if (tplayer != null && tplayer.length > 0) {
          int i1 = 0;
          int i2 = 0;
          LivePuzzleUserInfo tthisTimeBeW = this.thisTimeBeWonAuthorId;
          while (i1 < tthisTimeBeW.length) {
             i2 = i2 + CodedOutputByteBufferNano.computeUInt64SizeNoTag(tthisTimeBeW[i1]);
             i1 = i1 + 1;
          }
          i = (i + i2) + (tthisTimeBeW.length * 1);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePuzzleUserInfo mergeFrom(CodedInputByteBufferNano p0){
       LivePuzzleUserInfo tthisTimeBeW;
       int i2;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 10:
                if (this.player == null) {
                   this.player = new UserInfos$UserInfo();
                }
                p0.readMessage(this.player);
                break;
              case 18:
                this.liveStreamId = p0.readString();
                break;
              case 26:
                this.quickCommentRouter = p0.readString();
                break;
              case 32:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.roleType = i;
                }
                break;
              case '(':
                this.isPublish = p0.readBool();
                break;
              case '0':
                this.answerId = p0.readUInt32();
                break;
              case ':':
                this.countRecordDescription = p0.readString();
                break;
              case '@':
                this.countRecord = p0.readUInt32();
                break;
              case 'H':
                this.isWin = p0.readBool();
                break;
              case 'P':
                this.isWinThisTime = p0.readBool();
                break;
              case 'X':
                this.answerIdThisTime = p0.readUInt32();
                break;
              case '`':
                this.winNum = p0.readUInt32();
                break;
              case 'h':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 104);
                tthisTimeBeW = this.thisTimeBeWonAuthorId;
                i2 = (tthisTimeBeW == null)? 0: tthisTimeBeW.length;
                i = i + i2;
                long[] olongArray = new long[i];
                if (i2) {
                   System.arraycopy(tthisTimeBeW, i1, olongArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   olongArray[i2] = p0.readUInt64();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                olongArray[i2] = p0.readUInt64();
                this.thisTimeBeWonAuthorId = olongArray;
                break;
              case 'j':
                i = p0.pushLimit(p0.readRawVarint32());
                int position = p0.getPosition();
                i2 = 0;
                while (p0.getBytesUntilLimit() > 0) {
                   p0.readUInt64();
                   i2 = i2 + 1;
                }
                p0.rewindToPosition(position);
                tthisTimeBeW = this.thisTimeBeWonAuthorId;
                int i3 = (tthisTimeBeW == null)? 0: tthisTimeBeW.length;
                i2 = i2 + i3;
                long[] olongArray1 = new long[i2];
                if (i3) {
                   System.arraycopy(tthisTimeBeW, i1, olongArray1, i1, i3);
                }
                while (i3 < i2) {
                   olongArray1[i3] = p0.readUInt64();
                   i3 = i3 + 1;
                }
                this.thisTimeBeWonAuthorId = olongArray1;
                p0.popLimit(i);
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
       LivePuzzleUserInfo tplayer = this.player;
       if (tplayer != null) {
          p0.writeMessage(1, tplayer);
       }
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(2, this.liveStreamId);
       }
       if (!(this.quickCommentRouter).equals(str)) {
          p0.writeString(3, this.quickCommentRouter);
       }
       tplayer = this.roleType;
       if (tplayer != null) {
          p0.writeInt32(4, tplayer);
       }
       tplayer = this.isPublish;
       if (tplayer != null) {
          p0.writeBool(5, tplayer);
       }
       tplayer = this.answerId;
       if (tplayer != null) {
          p0.writeUInt32(6, tplayer);
       }
       if (!(this.countRecordDescription).equals(str)) {
          p0.writeString(7, this.countRecordDescription);
       }
       tplayer = this.countRecord;
       if (tplayer != null) {
          p0.writeUInt32(8, tplayer);
       }
       tplayer = this.isWin;
       if (tplayer != null) {
          p0.writeBool(9, tplayer);
       }
       tplayer = this.isWinThisTime;
       if (tplayer != null) {
          p0.writeBool(10, tplayer);
       }
       tplayer = this.answerIdThisTime;
       if (tplayer != null) {
          p0.writeUInt32(11, tplayer);
       }
       tplayer = this.winNum;
       if (tplayer != null) {
          p0.writeUInt32(12, tplayer);
       }
       tplayer = this.thisTimeBeWonAuthorId;
       if (tplayer != null && tplayer.length > 0) {
          int i = 0;
          LivePuzzleUserInfo tthisTimeBeW = this.thisTimeBeWonAuthorId;
          while (i < tthisTimeBeW.length) {
             p0.writeUInt64(13, tthisTimeBeW[i]);
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
