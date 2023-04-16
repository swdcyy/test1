package com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatVoteEnd;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Map;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveScoreLineChatVoteEnd extends MessageNano	// class@000d16
{
    public long achieveTargetAuthorId;
    public Map authorIdToRankState;
    public String penaltyText;
    public UserInfos$PicUrl[] voteEndPicUrl;
    public int voteEndReason;
    public String voteEndText;
    public static LiveScoreLineChatVoteEnd[] _emptyArray;

    public void LiveScoreLineChatVoteEnd(){
       super();
       this.clear();
    }
    public static LiveScoreLineChatVoteEnd[] emptyArray(){
       if (LiveScoreLineChatVoteEnd._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveScoreLineChatVoteEnd._emptyArray == null) {
             LiveScoreLineChatVoteEnd[] liveScoreLin = new LiveScoreLineChatVoteEnd[0];
             LiveScoreLineChatVoteEnd._emptyArray = liveScoreLin;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveScoreLineChatVoteEnd._emptyArray;
    }
    public static LiveScoreLineChatVoteEnd parseFrom(CodedInputByteBufferNano p0){
       return new LiveScoreLineChatVoteEnd().mergeFrom(p0);
    }
    public static LiveScoreLineChatVoteEnd parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveScoreLineChatVoteEnd(), p0);
    }
    public LiveScoreLineChatVoteEnd clear(){
       this.penaltyText = "";
       this.voteEndReason = 0;
       this.achieveTargetAuthorId = 0;
       this.authorIdToRankState = null;
       this.voteEndText = "";
       this.voteEndPicUrl = UserInfos$PicUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.penaltyText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.penaltyText);
       }
       LiveScoreLineChatVoteEnd tvoteEndReas = this.voteEndReason;
       if (tvoteEndReas != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tvoteEndReas);
       }
       LiveScoreLineChatVoteEnd tachieveTarg = this.achieveTargetAuthorId;
       if (tachieveTarg) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tachieveTarg);
       }
       tvoteEndReas = this.authorIdToRankState;
       if (tvoteEndReas != null) {
          i = i + InternalNano.computeMapFieldSize(tvoteEndReas, 4, 4, 14);
       }
       if (!(this.voteEndText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.voteEndText);
       }
       tvoteEndReas = this.voteEndPicUrl;
       if (tvoteEndReas != null && tvoteEndReas.length > 0) {
          int i1 = 0;
          LiveScoreLineChatVoteEnd tvoteEndPicU = this.voteEndPicUrl;
          while (i1 < tvoteEndPicU.length) {
             object oobject = tvoteEndPicU[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(6, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveScoreLineChatVoteEnd mergeFrom(CodedInputByteBufferNano p0){
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 42) {
                         int i1 = 50;
                         if (i != i1) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                            LiveScoreLineChatVoteEnd tvoteEndPicU = this.voteEndPicUrl;
                            int i2 = 0;
                            int i3 = (tvoteEndPicU == null)? 0: tvoteEndPicU.length;
                            i = i + i3;
                            UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                            if (i3) {
                               System.arraycopy(tvoteEndPicU, i2, picUrlArray, i2, i3);
                            }
                            i1 = i - 1;
                            while (i3 < i1) {
                               picUrlArray[i3] = new UserInfos$PicUrl();
                               p0.readMessage(picUrlArray[i3]);
                               p0.readTag();
                               i3 = i3 + 1;
                            }
                            picUrlArray[i3] = new UserInfos$PicUrl();
                            p0.readMessage(picUrlArray[i3]);
                            this.voteEndPicUrl = picUrlArray;
                         }
                      }else {
                         this.voteEndText = p0.readString();
                      }
                   }else {
                      this.authorIdToRankState = InternalNano.mergeMapEntry(p0, this.authorIdToRankState, mapFactory, 4, 14, null, 8, 16);
                   }
                }else {
                   this.achieveTargetAuthorId = p0.readUInt64();
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.voteEndReason = i;
                }
             }
          }else {
             this.penaltyText = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.penaltyText).equals(str)) {
          p0.writeString(1, this.penaltyText);
       }
       LiveScoreLineChatVoteEnd tvoteEndReas = this.voteEndReason;
       if (tvoteEndReas != null) {
          p0.writeInt32(2, tvoteEndReas);
       }
       LiveScoreLineChatVoteEnd tachieveTarg = this.achieveTargetAuthorId;
       if (tachieveTarg) {
          p0.writeUInt64(3, tachieveTarg);
       }
       tvoteEndReas = this.authorIdToRankState;
       if (tvoteEndReas != null) {
          InternalNano.serializeMapField(p0, tvoteEndReas, 4, 4, 14);
       }
       if (!(this.voteEndText).equals(str)) {
          p0.writeString(5, this.voteEndText);
       }
       tvoteEndReas = this.voteEndPicUrl;
       if (tvoteEndReas != null && tvoteEndReas.length > 0) {
          int i = 0;
          LiveScoreLineChatVoteEnd tvoteEndPicU = this.voteEndPicUrl;
          while (i < tvoteEndPicU.length) {
             object oobject = tvoteEndPicU[i];
             if (oobject != null) {
                p0.writeMessage(6, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
