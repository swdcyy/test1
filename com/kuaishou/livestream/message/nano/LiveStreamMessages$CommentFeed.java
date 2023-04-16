package com.kuaishou.livestream.message.nano.LiveStreamMessages$CommentFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$CommentFeedEmotion;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamMessages$CommentFeed extends MessageNano	// class@0012cb
{
    public String commentId;
    public String content;
    public String deviceHash;
    public int displayWeight;
    public String id;
    public boolean isAnonymous;
    public boolean isKoi;
    public String landscapeFontColor;
    public int liveAssistantType;
    public LiveStreamMessages$CommentFeedEmotion[] lockedEmotion;
    public LiveAudienceState senderState;
    public long sortRank;
    public long time;
    public UserInfos$UserInfo user;
    public static LiveStreamMessages$CommentFeed[] _emptyArray;

    public void LiveStreamMessages$CommentFeed(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$CommentFeed[] emptyArray(){
       if (LiveStreamMessages$CommentFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$CommentFeed._emptyArray == null) {
             LiveStreamMessages$CommentFeed[] uCommentFeed = new LiveStreamMessages$CommentFeed[0];
             LiveStreamMessages$CommentFeed._emptyArray = uCommentFeed;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$CommentFeed._emptyArray;
    }
    public static LiveStreamMessages$CommentFeed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$CommentFeed().mergeFrom(p0);
    }
    public static LiveStreamMessages$CommentFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$CommentFeed(), p0);
    }
    public LiveStreamMessages$CommentFeed clear(){
       this.id = "";
       this.user = null;
       this.time = 0;
       this.content = "";
       this.sortRank = 0;
       this.liveAssistantType = 0;
       this.deviceHash = "";
       this.landscapeFontColor = "";
       this.isKoi = false;
       this.senderState = null;
       this.lockedEmotion = LiveStreamMessages$CommentFeedEmotion.emptyArray();
       this.isAnonymous = false;
       this.displayWeight = 0;
       this.commentId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       LiveStreamMessages$CommentFeed tuser = this.user;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tuser);
       }
       LiveStreamMessages$CommentFeed ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ttime);
       }
       if (!(this.content).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.content);
       }
       ttime = this.sortRank;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, ttime);
       }
       tuser = this.liveAssistantType;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tuser);
       }
       if (!(this.deviceHash).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.deviceHash);
       }
       if (!(this.landscapeFontColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.landscapeFontColor);
       }
       tuser = this.isKoi;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(9, tuser);
       }
       tuser = this.senderState;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(10, tuser);
       }
       tuser = this.lockedEmotion;
       if (tuser != null && tuser.length > 0) {
          int i1 = 0;
          ttime = this.lockedEmotion;
          while (i1 < ttime.length) {
             object oobject = ttime[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(11, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tuser = this.isAnonymous;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(12, tuser);
       }
       tuser = this.displayWeight;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(13, tuser);
       }
       if (!(this.commentId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.commentId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$CommentFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.id = p0.readString();
                break;
              case 18:
                if (this.user == null) {
                   this.user = new UserInfos$UserInfo();
                }
                p0.readMessage(this.user);
                break;
              case 24:
                this.time = p0.readUInt64();
                break;
              case '"':
                this.content = p0.readString();
                break;
              case '(':
                this.sortRank = p0.readUInt64();
                break;
              case '0':
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.liveAssistantType = i;
                }
                break;
              case ':':
                this.deviceHash = p0.readString();
                break;
              case 'B':
                this.landscapeFontColor = p0.readString();
                break;
              case 'H':
                this.isKoi = p0.readBool();
                break;
              case 'R':
                if (this.senderState == null) {
                   this.senderState = new LiveAudienceState();
                }
                p0.readMessage(this.senderState);
                break;
              case 'Z':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 90);
                LiveStreamMessages$CommentFeed tlockedEmoti = this.lockedEmotion;
                int i1 = (tlockedEmoti == null)? 0: tlockedEmoti.length;
                i = i + i1;
                LiveStreamMessages$CommentFeedEmotion[] uCommentFeed = new LiveStreamMessages$CommentFeedEmotion[i];
                if (i1) {
                   System.arraycopy(tlockedEmoti, 0, uCommentFeed, 0, i1);
                }
                int i2 = i - 1;
                while (i1 < i2) {
                   uCommentFeed[i1] = new LiveStreamMessages$CommentFeedEmotion();
                   p0.readMessage(uCommentFeed[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                uCommentFeed[i1] = new LiveStreamMessages$CommentFeedEmotion();
                p0.readMessage(uCommentFeed[i1]);
                this.lockedEmotion = uCommentFeed;
                break;
              case '`':
                this.isAnonymous = p0.readBool();
                break;
              case 'h':
                this.displayWeight = p0.readUInt32();
                break;
              case 'r':
                this.commentId = p0.readString();
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
       String str = "";
       if (!(this.id).equals(str)) {
          p0.writeString(1, this.id);
       }
       LiveStreamMessages$CommentFeed tuser = this.user;
       if (tuser != null) {
          p0.writeMessage(2, tuser);
       }
       LiveStreamMessages$CommentFeed ttime = this.time;
       if (ttime) {
          p0.writeUInt64(3, ttime);
       }
       if (!(this.content).equals(str)) {
          p0.writeString(4, this.content);
       }
       ttime = this.sortRank;
       if (ttime) {
          p0.writeUInt64(5, ttime);
       }
       tuser = this.liveAssistantType;
       if (tuser != null) {
          p0.writeInt32(6, tuser);
       }
       if (!(this.deviceHash).equals(str)) {
          p0.writeString(7, this.deviceHash);
       }
       if (!(this.landscapeFontColor).equals(str)) {
          p0.writeString(8, this.landscapeFontColor);
       }
       tuser = this.isKoi;
       if (tuser != null) {
          p0.writeBool(9, tuser);
       }
       tuser = this.senderState;
       if (tuser != null) {
          p0.writeMessage(10, tuser);
       }
       tuser = this.lockedEmotion;
       if (tuser != null && tuser.length > 0) {
          int i = 0;
          ttime = this.lockedEmotion;
          while (i < ttime.length) {
             object oobject = ttime[i];
             if (oobject != null) {
                p0.writeMessage(11, oobject);
             }
             i = i + 1;
          }
       }
       tuser = this.isAnonymous;
       if (tuser != null) {
          p0.writeBool(12, tuser);
       }
       tuser = this.displayWeight;
       if (tuser != null) {
          p0.writeUInt32(13, tuser);
       }
       if (!(this.commentId).equals(str)) {
          p0.writeString(14, this.commentId);
       }
       super.writeTo(p0);
       return;
    }
}
