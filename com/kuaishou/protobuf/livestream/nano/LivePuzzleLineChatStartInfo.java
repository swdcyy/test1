package com.kuaishou.protobuf.livestream.nano.LivePuzzleLineChatStartInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LivePuzzleAnswerInfo;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Map;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LivePuzzleLineChatResourceInfo;
import java.lang.System;

public final class LivePuzzleLineChatStartInfo extends MessageNano	// class@000cd8
{
    public LivePuzzleAnswerInfo[] answerInfo;
    public String answererConfirmKrnUrl;
    public long autoChooseAnswerDeadline;
    public String playRoleUrl;
    public String puzzleHeaderPath;
    public String puzzleLineChatId;
    public String puzzleLineChatName;
    public int puzzleType;
    public long queryStatisticsDeadline;
    public String questionerConfirmKrnUrl;
    public LivePuzzleLineChatResourceInfo resourceInfo;
    public long roomOwnerId;
    public Map userRoleInfo;
    public static LivePuzzleLineChatStartInfo[] _emptyArray;

    public void LivePuzzleLineChatStartInfo(){
       super();
       this.clear();
    }
    public static LivePuzzleLineChatStartInfo[] emptyArray(){
       if (LivePuzzleLineChatStartInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePuzzleLineChatStartInfo._emptyArray == null) {
             LivePuzzleLineChatStartInfo[] livePuzzleLi = new LivePuzzleLineChatStartInfo[0];
             LivePuzzleLineChatStartInfo._emptyArray = livePuzzleLi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePuzzleLineChatStartInfo._emptyArray;
    }
    public static LivePuzzleLineChatStartInfo parseFrom(CodedInputByteBufferNano p0){
       return new LivePuzzleLineChatStartInfo().mergeFrom(p0);
    }
    public static LivePuzzleLineChatStartInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePuzzleLineChatStartInfo(), p0);
    }
    public LivePuzzleLineChatStartInfo clear(){
       this.puzzleLineChatId = "";
       this.puzzleType = 0;
       this.userRoleInfo = null;
       this.roomOwnerId = 0;
       this.answerInfo = LivePuzzleAnswerInfo.emptyArray();
       this.questionerConfirmKrnUrl = "";
       this.answererConfirmKrnUrl = "";
       this.autoChooseAnswerDeadline = 0;
       this.queryStatisticsDeadline = 0;
       this.puzzleHeaderPath = "";
       this.resourceInfo = null;
       this.puzzleLineChatName = "";
       this.playRoleUrl = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       LivePuzzleLineChatStartInfo tanswerInfo;
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.puzzleLineChatId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.puzzleLineChatId);
       }
       LivePuzzleLineChatStartInfo tpuzzleType = this.puzzleType;
       if (tpuzzleType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tpuzzleType);
       }
       tpuzzleType = this.userRoleInfo;
       int i1 = 4;
       if (tpuzzleType != null) {
          i = i + InternalNano.computeMapFieldSize(tpuzzleType, 3, i1, 14);
       }
       LivePuzzleLineChatStartInfo troomOwnerId = this.roomOwnerId;
       if (troomOwnerId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(i1, troomOwnerId);
       }
       tpuzzleType = this.answerInfo;
       if (tpuzzleType != null && tpuzzleType.length > 0) {
          int i2 = 0;
          tanswerInfo = this.answerInfo;
          while (i2 < tanswerInfo.length) {
             object oobject = tanswerInfo[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i2 = i2 + 1;
          }
       }
       if (!(this.questionerConfirmKrnUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.questionerConfirmKrnUrl);
       }
       if (!(this.answererConfirmKrnUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.answererConfirmKrnUrl);
       }
       tanswerInfo = this.autoChooseAnswerDeadline;
       if (tanswerInfo) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tanswerInfo);
       }
       tanswerInfo = this.queryStatisticsDeadline;
       if (tanswerInfo) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, tanswerInfo);
       }
       if (!(this.puzzleHeaderPath).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.puzzleHeaderPath);
       }
       tpuzzleType = this.resourceInfo;
       if (tpuzzleType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(11, tpuzzleType);
       }
       if (!(this.puzzleLineChatName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.puzzleLineChatName);
       }
       if (!(this.playRoleUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.playRoleUrl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePuzzleLineChatStartInfo mergeFrom(CodedInputByteBufferNano p0){
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.puzzleLineChatId = p0.readString();
                break;
              case 16:
                i = p0.readInt32();
                if (i && i != 1) {
                   continue ;
                }else {
                   this.puzzleType = i;
                }
                break;
              case 26:
                this.userRoleInfo = InternalNano.mergeMapEntry(p0, this.userRoleInfo, mapFactory, 4, 14, null, 8, 16);
                break;
              case 32:
                this.roomOwnerId = p0.readUInt64();
                break;
              case '*':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 42);
                LivePuzzleLineChatStartInfo tanswerInfo = this.answerInfo;
                int i1 = 0;
                int i2 = (tanswerInfo == null)? 0: tanswerInfo.length;
                i = i + i2;
                LivePuzzleAnswerInfo[] livePuzzleAn = new LivePuzzleAnswerInfo[i];
                if (i2) {
                   System.arraycopy(tanswerInfo, i1, livePuzzleAn, i1, i2);
                }
                int i3 = i - 1;
                while (i2 < i3) {
                   livePuzzleAn[i2] = new LivePuzzleAnswerInfo();
                   p0.readMessage(livePuzzleAn[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                livePuzzleAn[i2] = new LivePuzzleAnswerInfo();
                p0.readMessage(livePuzzleAn[i2]);
                this.answerInfo = livePuzzleAn;
                break;
              case '2':
                this.questionerConfirmKrnUrl = p0.readString();
                break;
              case ':':
                this.answererConfirmKrnUrl = p0.readString();
                break;
              case '@':
                this.autoChooseAnswerDeadline = p0.readUInt64();
                break;
              case 'H':
                this.queryStatisticsDeadline = p0.readUInt64();
                break;
              case 'R':
                this.puzzleHeaderPath = p0.readString();
                break;
              case 'Z':
                if (this.resourceInfo == null) {
                   this.resourceInfo = new LivePuzzleLineChatResourceInfo();
                }
                p0.readMessage(this.resourceInfo);
                break;
              case 'b':
                this.puzzleLineChatName = p0.readString();
                break;
              case 'j':
                this.playRoleUrl = p0.readString();
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
       LivePuzzleLineChatStartInfo tanswerInfo;
       String str = "";
       if (!(this.puzzleLineChatId).equals(str)) {
          p0.writeString(1, this.puzzleLineChatId);
       }
       LivePuzzleLineChatStartInfo tpuzzleType = this.puzzleType;
       if (tpuzzleType != null) {
          p0.writeInt32(2, tpuzzleType);
       }
       tpuzzleType = this.userRoleInfo;
       int i = 4;
       if (tpuzzleType != null) {
          InternalNano.serializeMapField(p0, tpuzzleType, 3, i, 14);
       }
       LivePuzzleLineChatStartInfo troomOwnerId = this.roomOwnerId;
       if (troomOwnerId) {
          p0.writeUInt64(i, troomOwnerId);
       }
       tpuzzleType = this.answerInfo;
       if (tpuzzleType != null && tpuzzleType.length > 0) {
          int i1 = 0;
          tanswerInfo = this.answerInfo;
          while (i1 < tanswerInfo.length) {
             object oobject = tanswerInfo[i1];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.questionerConfirmKrnUrl).equals(str)) {
          p0.writeString(6, this.questionerConfirmKrnUrl);
       }
       if (!(this.answererConfirmKrnUrl).equals(str)) {
          p0.writeString(7, this.answererConfirmKrnUrl);
       }
       tanswerInfo = this.autoChooseAnswerDeadline;
       if (tanswerInfo) {
          p0.writeUInt64(8, tanswerInfo);
       }
       tanswerInfo = this.queryStatisticsDeadline;
       if (tanswerInfo) {
          p0.writeUInt64(9, tanswerInfo);
       }
       if (!(this.puzzleHeaderPath).equals(str)) {
          p0.writeString(10, this.puzzleHeaderPath);
       }
       tpuzzleType = this.resourceInfo;
       if (tpuzzleType != null) {
          p0.writeMessage(11, tpuzzleType);
       }
       if (!(this.puzzleLineChatName).equals(str)) {
          p0.writeString(12, this.puzzleLineChatName);
       }
       if (!(this.playRoleUrl).equals(str)) {
          p0.writeString(13, this.playRoleUrl);
       }
       super.writeTo(p0);
       return;
    }
}
