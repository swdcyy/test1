package com.kuaishou.livestream.message.nano.LiveStreamMessages$VoiceCommentFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveCdnNodeView;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamMessages$VoiceCommentFeed extends MessageNano	// class@001386
{
    public LiveCdnNodeView[] cdnNodeView;
    public String content;
    public String deviceHash;
    public long durationMillis;
    public boolean hasCompressed;
    public String id;
    public boolean isAnonymous;
    public boolean isKoi;
    public int liveAssistantType;
    public LiveAudienceState senderState;
    public long sortRank;
    public long time;
    public UserInfos$UserInfo user;
    public static LiveStreamMessages$VoiceCommentFeed[] _emptyArray;

    public void LiveStreamMessages$VoiceCommentFeed(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$VoiceCommentFeed[] emptyArray(){
       if (LiveStreamMessages$VoiceCommentFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$VoiceCommentFeed._emptyArray == null) {
             LiveStreamMessages$VoiceCommentFeed[] voiceComment = new LiveStreamMessages$VoiceCommentFeed[0];
             LiveStreamMessages$VoiceCommentFeed._emptyArray = voiceComment;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$VoiceCommentFeed._emptyArray;
    }
    public static LiveStreamMessages$VoiceCommentFeed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$VoiceCommentFeed().mergeFrom(p0);
    }
    public static LiveStreamMessages$VoiceCommentFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$VoiceCommentFeed(), p0);
    }
    public LiveStreamMessages$VoiceCommentFeed clear(){
       this.id = "";
       this.user = null;
       this.time = 0;
       this.sortRank = 0;
       this.liveAssistantType = 0;
       this.deviceHash = "";
       this.durationMillis = 0;
       this.isKoi = false;
       this.senderState = null;
       this.cdnNodeView = LiveCdnNodeView.emptyArray();
       this.content = "";
       this.hasCompressed = false;
       this.isAnonymous = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       LiveStreamMessages$VoiceCommentFeed tuser = this.user;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tuser);
       }
       LiveStreamMessages$VoiceCommentFeed ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ttime);
       }
       ttime = this.sortRank;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, ttime);
       }
       tuser = this.liveAssistantType;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tuser);
       }
       if (!(this.deviceHash).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.deviceHash);
       }
       ttime = this.durationMillis;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, ttime);
       }
       tuser = this.isKoi;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(8, tuser);
       }
       tuser = this.senderState;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, tuser);
       }
       tuser = this.cdnNodeView;
       if (tuser != null && tuser.length > 0) {
          int i1 = 0;
          ttime = this.cdnNodeView;
          while (i1 < ttime.length) {
             object oobject = ttime[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(10, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.content).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.content);
       }
       tuser = this.hasCompressed;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(12, tuser);
       }
       tuser = this.isAnonymous;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(13, tuser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$VoiceCommentFeed mergeFrom(CodedInputByteBufferNano p0){
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
              case 32:
                this.sortRank = p0.readUInt64();
                break;
              case '(':
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.liveAssistantType = i;
                }
                break;
              case '2':
                this.deviceHash = p0.readString();
                break;
              case '8':
                this.durationMillis = p0.readUInt64();
                break;
              case '@':
                this.isKoi = p0.readBool();
                break;
              case 'J':
                if (this.senderState == null) {
                   this.senderState = new LiveAudienceState();
                }
                p0.readMessage(this.senderState);
                break;
              case 'R':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 82);
                LiveStreamMessages$VoiceCommentFeed tcdnNodeView = this.cdnNodeView;
                int i1 = (tcdnNodeView == null)? 0: tcdnNodeView.length;
                i = i + i1;
                LiveCdnNodeView[] liveCdnNodeV = new LiveCdnNodeView[i];
                if (i1) {
                   System.arraycopy(tcdnNodeView, 0, liveCdnNodeV, 0, i1);
                }
                int i2 = i - 1;
                while (i1 < i2) {
                   liveCdnNodeV[i1] = new LiveCdnNodeView();
                   p0.readMessage(liveCdnNodeV[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                liveCdnNodeV[i1] = new LiveCdnNodeView();
                p0.readMessage(liveCdnNodeV[i1]);
                this.cdnNodeView = liveCdnNodeV;
                break;
              case 'Z':
                this.content = p0.readString();
                break;
              case '`':
                this.hasCompressed = p0.readBool();
                break;
              case 'h':
                this.isAnonymous = p0.readBool();
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
       LiveStreamMessages$VoiceCommentFeed tuser = this.user;
       if (tuser != null) {
          p0.writeMessage(2, tuser);
       }
       LiveStreamMessages$VoiceCommentFeed ttime = this.time;
       if (ttime) {
          p0.writeUInt64(3, ttime);
       }
       ttime = this.sortRank;
       if (ttime) {
          p0.writeUInt64(4, ttime);
       }
       tuser = this.liveAssistantType;
       if (tuser != null) {
          p0.writeInt32(5, tuser);
       }
       if (!(this.deviceHash).equals(str)) {
          p0.writeString(6, this.deviceHash);
       }
       ttime = this.durationMillis;
       if (ttime) {
          p0.writeUInt64(7, ttime);
       }
       tuser = this.isKoi;
       if (tuser != null) {
          p0.writeBool(8, tuser);
       }
       tuser = this.senderState;
       if (tuser != null) {
          p0.writeMessage(9, tuser);
       }
       tuser = this.cdnNodeView;
       if (tuser != null && tuser.length > 0) {
          int i = 0;
          ttime = this.cdnNodeView;
          while (i < ttime.length) {
             object oobject = ttime[i];
             if (oobject != null) {
                p0.writeMessage(10, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.content).equals(str)) {
          p0.writeString(11, this.content);
       }
       tuser = this.hasCompressed;
       if (tuser != null) {
          p0.writeBool(12, tuser);
       }
       tuser = this.isAnonymous;
       if (tuser != null) {
          p0.writeBool(13, tuser);
       }
       super.writeTo(p0);
       return;
    }
}
