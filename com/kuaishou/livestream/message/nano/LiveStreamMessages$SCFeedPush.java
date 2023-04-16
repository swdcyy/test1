package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCFeedPush;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$CommentFeed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$LikeFeed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$WatchingFeed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$GiftFeed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SystemNoticeFeed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$DrawingGiftFeed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$GrabRedPackFeed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$BroadcastGiftFeed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$ShareFeed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$ComboCommentFeed;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$RichTextFeed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$VoiceCommentFeed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$FollowAuthorFeed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$EnterRoomFeed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$PurchaseInfoFeed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatsApplyInfoFeed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$NormalNoticeFeed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$ToAudienceGiftFeed;
import com.kuaishou.livestream.message.nano.LiveChatMessageProto$LiveChatUserApplyInfoFeed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$ToAudienceDrawingGiftFeed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$DisplayGiftFeed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$ToAudienceDisplayGiftFeed;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveStreamMessages$SCFeedPush extends MessageNano	// class@00132d
{
    public LiveStreamMessages$CommentFeed[] allPulledCommentFeed;
    public long authorId;
    public LiveStreamMessages$BroadcastGiftFeed[] broadcastGiftFeed;
    public LiveStreamMessages$ComboCommentFeed[] comboCommentFeed;
    public LiveStreamMessages$CommentFeed[] commentFeeds;
    public LiveStreamMessages$DisplayGiftFeed[] displayGiftFeed;
    public String displayLikeCount;
    public String displayWatchingCount;
    public LiveStreamMessages$DrawingGiftFeed[] drawingGiftFeeds;
    public LiveStreamMessages$EnterRoomFeed[] enterRoomFeed;
    public LiveStreamMessages$FollowAuthorFeed[] followAuthorFeed;
    public LiveStreamMessages$GiftFeed[] giftFeeds;
    public LiveStreamMessages$GrabRedPackFeed[] grabRedPackFeed;
    public long likeCount;
    public LiveStreamMessages$LikeFeed[] likeFeeds;
    public String liteDisplayWatchingCount;
    public LiveChatMessageProto$LiveChatUserApplyInfoFeed[] liveChatUserApplyInfoFeed;
    public LiveStreamMessages$MicSeatsApplyInfoFeed[] micSeatsApplyInfoFeed;
    public boolean needReportGiftFeed;
    public LiveStreamMessages$NormalNoticeFeed[] noticeFeed;
    public long pendingLikeCount;
    public LiveStreamMessages$PurchaseInfoFeed[] purchaseInfoFeed;
    public long pushInterval;
    public LiveStreamRichTextFeed$RichTextFeed[] richTextFeeds;
    public LiveStreamMessages$ShareFeed[] shareFeeds;
    public LiveStreamMessages$SystemNoticeFeed[] systemNoticeFeeds;
    public long time;
    public LiveStreamMessages$ToAudienceDisplayGiftFeed[] toAudienceDisplayGiftFeed;
    public LiveStreamMessages$ToAudienceDrawingGiftFeed[] toAudienceDrawingGiftFeed;
    public LiveStreamMessages$ToAudienceGiftFeed[] toAudienceGiftFeed;
    public LiveStreamMessages$VoiceCommentFeed[] voiceCommentFeed;
    public long watchingCount;
    public LiveStreamMessages$WatchingFeed[] watchingFeeds;
    public static LiveStreamMessages$SCFeedPush[] _emptyArray;

    public void LiveStreamMessages$SCFeedPush(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCFeedPush[] emptyArray(){
       if (LiveStreamMessages$SCFeedPush._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCFeedPush._emptyArray == null) {
             LiveStreamMessages$SCFeedPush[] sCFeedPushAr = new LiveStreamMessages$SCFeedPush[0];
             LiveStreamMessages$SCFeedPush._emptyArray = sCFeedPushAr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCFeedPush._emptyArray;
    }
    public static LiveStreamMessages$SCFeedPush parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCFeedPush().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCFeedPush parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCFeedPush(), p0);
    }
    public LiveStreamMessages$SCFeedPush clear(){
       this.commentFeeds = LiveStreamMessages$CommentFeed.emptyArray();
       this.likeFeeds = LiveStreamMessages$LikeFeed.emptyArray();
       this.watchingFeeds = LiveStreamMessages$WatchingFeed.emptyArray();
       this.giftFeeds = LiveStreamMessages$GiftFeed.emptyArray();
       this.watchingCount = 0;
       this.likeCount = 0;
       this.pendingLikeCount = 0;
       this.pushInterval = 0;
       this.systemNoticeFeeds = LiveStreamMessages$SystemNoticeFeed.emptyArray();
       this.drawingGiftFeeds = LiveStreamMessages$DrawingGiftFeed.emptyArray();
       this.displayWatchingCount = "";
       this.displayLikeCount = "";
       this.grabRedPackFeed = LiveStreamMessages$GrabRedPackFeed.emptyArray();
       this.broadcastGiftFeed = LiveStreamMessages$BroadcastGiftFeed.emptyArray();
       this.shareFeeds = LiveStreamMessages$ShareFeed.emptyArray();
       this.comboCommentFeed = LiveStreamMessages$ComboCommentFeed.emptyArray();
       this.richTextFeeds = LiveStreamRichTextFeed$RichTextFeed.emptyArray();
       this.authorId = 0;
       this.voiceCommentFeed = LiveStreamMessages$VoiceCommentFeed.emptyArray();
       this.followAuthorFeed = LiveStreamMessages$FollowAuthorFeed.emptyArray();
       this.enterRoomFeed = LiveStreamMessages$EnterRoomFeed.emptyArray();
       this.time = 0;
       this.purchaseInfoFeed = LiveStreamMessages$PurchaseInfoFeed.emptyArray();
       this.micSeatsApplyInfoFeed = LiveStreamMessages$MicSeatsApplyInfoFeed.emptyArray();
       this.noticeFeed = LiveStreamMessages$NormalNoticeFeed.emptyArray();
       this.toAudienceGiftFeed = LiveStreamMessages$ToAudienceGiftFeed.emptyArray();
       this.liveChatUserApplyInfoFeed = LiveChatMessageProto$LiveChatUserApplyInfoFeed.emptyArray();
       this.toAudienceDrawingGiftFeed = LiveStreamMessages$ToAudienceDrawingGiftFeed.emptyArray();
       this.displayGiftFeed = LiveStreamMessages$DisplayGiftFeed.emptyArray();
       this.toAudienceDisplayGiftFeed = LiveStreamMessages$ToAudienceDisplayGiftFeed.emptyArray();
       this.allPulledCommentFeed = LiveStreamMessages$CommentFeed.emptyArray();
       this.needReportGiftFeed = false;
       this.liteDisplayWatchingCount = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       LiveStreamMessages$SCFeedPush tcommentFeed1;
       object oobject;
       LiveStreamMessages$SCFeedPush tgrabRedPack;
       object oobject1;
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCFeedPush tcommentFeed = this.commentFeeds;
       int i1 = 0;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i2 = 0;
          tcommentFeed1 = this.commentFeeds;
          while (i2 < tcommentFeed1.length) {
             oobject = tcommentFeed1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tcommentFeed = this.likeFeeds;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i2 = 0;
          tcommentFeed1 = this.likeFeeds;
          while (i2 < tcommentFeed1.length) {
             oobject = tcommentFeed1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tcommentFeed = this.watchingFeeds;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i2 = 0;
          tcommentFeed1 = this.watchingFeeds;
          while (i2 < tcommentFeed1.length) {
             oobject = tcommentFeed1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tcommentFeed = this.giftFeeds;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i2 = 0;
          tcommentFeed1 = this.giftFeeds;
          while (i2 < tcommentFeed1.length) {
             oobject = tcommentFeed1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tcommentFeed1 = this.watchingCount;
       int i3 = 0;
       if (tcommentFeed1 - i3) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tcommentFeed1);
       }
       tcommentFeed1 = this.likeCount;
       if (tcommentFeed1 - i3) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tcommentFeed1);
       }
       tcommentFeed1 = this.pendingLikeCount;
       if (tcommentFeed1 - i3) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tcommentFeed1);
       }
       tcommentFeed1 = this.pushInterval;
       if (tcommentFeed1 - i3) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tcommentFeed1);
       }
       tcommentFeed = this.systemNoticeFeeds;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i2 = 0;
          tcommentFeed1 = this.systemNoticeFeeds;
          while (i2 < tcommentFeed1.length) {
             oobject = tcommentFeed1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(9, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tcommentFeed = this.drawingGiftFeeds;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i2 = 0;
          tcommentFeed1 = this.drawingGiftFeeds;
          while (i2 < tcommentFeed1.length) {
             oobject = tcommentFeed1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(10, oobject);
             }
             i2 = i2 + 1;
          }
       }
       if (!(this.displayWatchingCount).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.displayWatchingCount);
       }
       if (!(this.displayLikeCount).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.displayLikeCount);
       }
       tcommentFeed = this.grabRedPackFeed;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i2 = 0;
          tgrabRedPack = this.grabRedPackFeed;
          while (i2 < tgrabRedPack.length) {
             oobject1 = tgrabRedPack[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(20, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       tcommentFeed = this.broadcastGiftFeed;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i2 = 0;
          tgrabRedPack = this.broadcastGiftFeed;
          while (i2 < tgrabRedPack.length) {
             oobject1 = tgrabRedPack[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(21, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       tcommentFeed = this.shareFeeds;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i2 = 0;
          tgrabRedPack = this.shareFeeds;
          while (i2 < tgrabRedPack.length) {
             oobject1 = tgrabRedPack[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(22, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       tcommentFeed = this.comboCommentFeed;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i2 = 0;
          tgrabRedPack = this.comboCommentFeed;
          while (i2 < tgrabRedPack.length) {
             oobject1 = tgrabRedPack[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(23, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       tcommentFeed = this.richTextFeeds;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i2 = 0;
          tgrabRedPack = this.richTextFeeds;
          while (i2 < tgrabRedPack.length) {
             oobject1 = tgrabRedPack[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(24, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       LiveStreamMessages$SCFeedPush tauthorId = this.authorId;
       if (tauthorId - i3) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(25, tauthorId);
       }
       tcommentFeed = this.voiceCommentFeed;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i2 = 0;
          tgrabRedPack = this.voiceCommentFeed;
          while (i2 < tgrabRedPack.length) {
             oobject1 = tgrabRedPack[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(26, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       tcommentFeed = this.followAuthorFeed;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i2 = 0;
          tgrabRedPack = this.followAuthorFeed;
          while (i2 < tgrabRedPack.length) {
             oobject1 = tgrabRedPack[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(27, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       tcommentFeed = this.enterRoomFeed;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i2 = 0;
          tgrabRedPack = this.enterRoomFeed;
          while (i2 < tgrabRedPack.length) {
             oobject1 = tgrabRedPack[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(28, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       tauthorId = this.time;
       if (tauthorId - i3) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(29, tauthorId);
       }
       tcommentFeed = this.purchaseInfoFeed;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i2 = 0;
          tgrabRedPack = this.purchaseInfoFeed;
          while (i2 < tgrabRedPack.length) {
             oobject1 = tgrabRedPack[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(30, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       tcommentFeed = this.micSeatsApplyInfoFeed;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i2 = 0;
          tgrabRedPack = this.micSeatsApplyInfoFeed;
          while (i2 < tgrabRedPack.length) {
             oobject1 = tgrabRedPack[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(31, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       tcommentFeed = this.noticeFeed;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i2 = 0;
          tgrabRedPack = this.noticeFeed;
          while (i2 < tgrabRedPack.length) {
             oobject1 = tgrabRedPack[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(32, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       tcommentFeed = this.toAudienceGiftFeed;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i2 = 0;
          tgrabRedPack = this.toAudienceGiftFeed;
          while (i2 < tgrabRedPack.length) {
             oobject1 = tgrabRedPack[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(33, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       tcommentFeed = this.liveChatUserApplyInfoFeed;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i2 = 0;
          tgrabRedPack = this.liveChatUserApplyInfoFeed;
          while (i2 < tgrabRedPack.length) {
             oobject1 = tgrabRedPack[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(34, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       tcommentFeed = this.toAudienceDrawingGiftFeed;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i2 = 0;
          tgrabRedPack = this.toAudienceDrawingGiftFeed;
          while (i2 < tgrabRedPack.length) {
             oobject1 = tgrabRedPack[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(35, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       tcommentFeed = this.displayGiftFeed;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i2 = 0;
          tgrabRedPack = this.displayGiftFeed;
          while (i2 < tgrabRedPack.length) {
             oobject1 = tgrabRedPack[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(36, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       tcommentFeed = this.toAudienceDisplayGiftFeed;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i2 = 0;
          tgrabRedPack = this.toAudienceDisplayGiftFeed;
          while (i2 < tgrabRedPack.length) {
             oobject1 = tgrabRedPack[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(37, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       tcommentFeed = this.allPulledCommentFeed;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          tcommentFeed = this.allPulledCommentFeed;
          while (i1 < tcommentFeed.length) {
             object oobject2 = tcommentFeed[i1];
             if (oobject2 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(38, oobject2);
             }
             i1 = i1 + 1;
          }
       }
       tcommentFeed = this.needReportGiftFeed;
       if (tcommentFeed != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(39, tcommentFeed);
       }
       if (!(this.liteDisplayWatchingCount).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(40, this.liteDisplayWatchingCount);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCFeedPush mergeFrom(CodedInputByteBufferNano p0){
       LiveStreamMessages$SCFeedPush tcommentFeed;
       int i2;
       LiveStreamMessages$CommentFeed[] uCommentFeed;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 10:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 10);
                tcommentFeed = this.commentFeeds;
                i2 = (tcommentFeed == null)? 0: tcommentFeed.length;
                i = i + i2;
                uCommentFeed = new LiveStreamMessages$CommentFeed[i];
                if (i2) {
                   System.arraycopy(tcommentFeed, i1, uCommentFeed, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uCommentFeed[i2] = new LiveStreamMessages$CommentFeed();
                   p0.readMessage(uCommentFeed[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uCommentFeed[i2] = new LiveStreamMessages$CommentFeed();
                p0.readMessage(uCommentFeed[i2]);
                this.commentFeeds = uCommentFeed;
                break;
              case 18:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 18);
                tcommentFeed = this.likeFeeds;
                i2 = (tcommentFeed == null)? 0: tcommentFeed.length;
                i = i + i2;
                LiveStreamMessages$LikeFeed[] likeFeedArra = new LiveStreamMessages$LikeFeed[i];
                if (i2) {
                   System.arraycopy(tcommentFeed, i1, likeFeedArra, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   likeFeedArra[i2] = new LiveStreamMessages$LikeFeed();
                   p0.readMessage(likeFeedArra[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                likeFeedArra[i2] = new LiveStreamMessages$LikeFeed();
                p0.readMessage(likeFeedArra[i2]);
                this.likeFeeds = likeFeedArra;
                break;
              case 26:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 26);
                tcommentFeed = this.watchingFeeds;
                i2 = (tcommentFeed == null)? 0: tcommentFeed.length;
                i = i + i2;
                LiveStreamMessages$WatchingFeed[] watchingFeed = new LiveStreamMessages$WatchingFeed[i];
                if (i2) {
                   System.arraycopy(tcommentFeed, i1, watchingFeed, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   watchingFeed[i2] = new LiveStreamMessages$WatchingFeed();
                   p0.readMessage(watchingFeed[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                watchingFeed[i2] = new LiveStreamMessages$WatchingFeed();
                p0.readMessage(watchingFeed[i2]);
                this.watchingFeeds = watchingFeed;
                break;
              case '"':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 34);
                tcommentFeed = this.giftFeeds;
                i2 = (tcommentFeed == null)? 0: tcommentFeed.length;
                i = i + i2;
                LiveStreamMessages$GiftFeed[] giftFeedArra = new LiveStreamMessages$GiftFeed[i];
                if (i2) {
                   System.arraycopy(tcommentFeed, i1, giftFeedArra, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   giftFeedArra[i2] = new LiveStreamMessages$GiftFeed();
                   p0.readMessage(giftFeedArra[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                giftFeedArra[i2] = new LiveStreamMessages$GiftFeed();
                p0.readMessage(giftFeedArra[i2]);
                this.giftFeeds = giftFeedArra;
                break;
              case '(':
                this.watchingCount = p0.readUInt64();
                break;
              case '0':
                this.likeCount = p0.readUInt64();
                break;
              case '8':
                this.pendingLikeCount = p0.readUInt64();
                break;
              case '@':
                this.pushInterval = p0.readUInt64();
                break;
              case 'J':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 74);
                tcommentFeed = this.systemNoticeFeeds;
                i2 = (tcommentFeed == null)? 0: tcommentFeed.length;
                i = i + i2;
                LiveStreamMessages$SystemNoticeFeed[] systemNotice = new LiveStreamMessages$SystemNoticeFeed[i];
                if (i2) {
                   System.arraycopy(tcommentFeed, i1, systemNotice, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   systemNotice[i2] = new LiveStreamMessages$SystemNoticeFeed();
                   p0.readMessage(systemNotice[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                systemNotice[i2] = new LiveStreamMessages$SystemNoticeFeed();
                p0.readMessage(systemNotice[i2]);
                this.systemNoticeFeeds = systemNotice;
                break;
              case 'R':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 82);
                tcommentFeed = this.drawingGiftFeeds;
                i2 = (tcommentFeed == null)? 0: tcommentFeed.length;
                i = i + i2;
                LiveStreamMessages$DrawingGiftFeed[] uDrawingGift = new LiveStreamMessages$DrawingGiftFeed[i];
                if (i2) {
                   System.arraycopy(tcommentFeed, i1, uDrawingGift, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uDrawingGift[i2] = new LiveStreamMessages$DrawingGiftFeed();
                   p0.readMessage(uDrawingGift[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uDrawingGift[i2] = new LiveStreamMessages$DrawingGiftFeed();
                p0.readMessage(uDrawingGift[i2]);
                this.drawingGiftFeeds = uDrawingGift;
                break;
              case 'Z':
                this.displayWatchingCount = p0.readString();
                break;
              case 'b':
                this.displayLikeCount = p0.readString();
                break;
              case 162:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 162);
                tcommentFeed = this.grabRedPackFeed;
                i2 = (tcommentFeed == null)? 0: tcommentFeed.length;
                i = i + i2;
                LiveStreamMessages$GrabRedPackFeed[] grabRedPackF = new LiveStreamMessages$GrabRedPackFeed[i];
                if (i2) {
                   System.arraycopy(tcommentFeed, i1, grabRedPackF, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   grabRedPackF[i2] = new LiveStreamMessages$GrabRedPackFeed();
                   p0.readMessage(grabRedPackF[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                grabRedPackF[i2] = new LiveStreamMessages$GrabRedPackFeed();
                p0.readMessage(grabRedPackF[i2]);
                this.grabRedPackFeed = grabRedPackF;
                break;
              case 170:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 170);
                tcommentFeed = this.broadcastGiftFeed;
                i2 = (tcommentFeed == null)? 0: tcommentFeed.length;
                i = i + i2;
                LiveStreamMessages$BroadcastGiftFeed[] uBroadcastGi = new LiveStreamMessages$BroadcastGiftFeed[i];
                if (i2) {
                   System.arraycopy(tcommentFeed, i1, uBroadcastGi, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uBroadcastGi[i2] = new LiveStreamMessages$BroadcastGiftFeed();
                   p0.readMessage(uBroadcastGi[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uBroadcastGi[i2] = new LiveStreamMessages$BroadcastGiftFeed();
                p0.readMessage(uBroadcastGi[i2]);
                this.broadcastGiftFeed = uBroadcastGi;
                break;
              case 178:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 178);
                tcommentFeed = this.shareFeeds;
                i2 = (tcommentFeed == null)? 0: tcommentFeed.length;
                i = i + i2;
                LiveStreamMessages$ShareFeed[] shareFeedArr = new LiveStreamMessages$ShareFeed[i];
                if (i2) {
                   System.arraycopy(tcommentFeed, i1, shareFeedArr, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   shareFeedArr[i2] = new LiveStreamMessages$ShareFeed();
                   p0.readMessage(shareFeedArr[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                shareFeedArr[i2] = new LiveStreamMessages$ShareFeed();
                p0.readMessage(shareFeedArr[i2]);
                this.shareFeeds = shareFeedArr;
                break;
              case 186:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 186);
                tcommentFeed = this.comboCommentFeed;
                i2 = (tcommentFeed == null)? 0: tcommentFeed.length;
                i = i + i2;
                LiveStreamMessages$ComboCommentFeed[] uComboCommen = new LiveStreamMessages$ComboCommentFeed[i];
                if (i2) {
                   System.arraycopy(tcommentFeed, i1, uComboCommen, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uComboCommen[i2] = new LiveStreamMessages$ComboCommentFeed();
                   p0.readMessage(uComboCommen[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uComboCommen[i2] = new LiveStreamMessages$ComboCommentFeed();
                p0.readMessage(uComboCommen[i2]);
                this.comboCommentFeed = uComboCommen;
                break;
              case 194:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 194);
                tcommentFeed = this.richTextFeeds;
                i2 = (tcommentFeed == null)? 0: tcommentFeed.length;
                i = i + i2;
                LiveStreamRichTextFeed$RichTextFeed[] richTextFeed = new LiveStreamRichTextFeed$RichTextFeed[i];
                if (i2) {
                   System.arraycopy(tcommentFeed, i1, richTextFeed, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   richTextFeed[i2] = new LiveStreamRichTextFeed$RichTextFeed();
                   p0.readMessage(richTextFeed[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                richTextFeed[i2] = new LiveStreamRichTextFeed$RichTextFeed();
                p0.readMessage(richTextFeed[i2]);
                this.richTextFeeds = richTextFeed;
                break;
              case 200:
                this.authorId = p0.readUInt64();
                break;
              case 210:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 210);
                tcommentFeed = this.voiceCommentFeed;
                i2 = (tcommentFeed == null)? 0: tcommentFeed.length;
                i = i + i2;
                LiveStreamMessages$VoiceCommentFeed[] voiceComment = new LiveStreamMessages$VoiceCommentFeed[i];
                if (i2) {
                   System.arraycopy(tcommentFeed, i1, voiceComment, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   voiceComment[i2] = new LiveStreamMessages$VoiceCommentFeed();
                   p0.readMessage(voiceComment[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                voiceComment[i2] = new LiveStreamMessages$VoiceCommentFeed();
                p0.readMessage(voiceComment[i2]);
                this.voiceCommentFeed = voiceComment;
                break;
              case 218:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 218);
                tcommentFeed = this.followAuthorFeed;
                i2 = (tcommentFeed == null)? 0: tcommentFeed.length;
                i = i + i2;
                LiveStreamMessages$FollowAuthorFeed[] uFollowAutho = new LiveStreamMessages$FollowAuthorFeed[i];
                if (i2) {
                   System.arraycopy(tcommentFeed, i1, uFollowAutho, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uFollowAutho[i2] = new LiveStreamMessages$FollowAuthorFeed();
                   p0.readMessage(uFollowAutho[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uFollowAutho[i2] = new LiveStreamMessages$FollowAuthorFeed();
                p0.readMessage(uFollowAutho[i2]);
                this.followAuthorFeed = uFollowAutho;
                break;
              case 226:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 226);
                tcommentFeed = this.enterRoomFeed;
                i2 = (tcommentFeed == null)? 0: tcommentFeed.length;
                i = i + i2;
                LiveStreamMessages$EnterRoomFeed[] uEnterRoomFe = new LiveStreamMessages$EnterRoomFeed[i];
                if (i2) {
                   System.arraycopy(tcommentFeed, i1, uEnterRoomFe, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uEnterRoomFe[i2] = new LiveStreamMessages$EnterRoomFeed();
                   p0.readMessage(uEnterRoomFe[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uEnterRoomFe[i2] = new LiveStreamMessages$EnterRoomFeed();
                p0.readMessage(uEnterRoomFe[i2]);
                this.enterRoomFeed = uEnterRoomFe;
                break;
              case 232:
                this.time = p0.readUInt64();
                break;
              case 242:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 242);
                tcommentFeed = this.purchaseInfoFeed;
                i2 = (tcommentFeed == null)? 0: tcommentFeed.length;
                i = i + i2;
                LiveStreamMessages$PurchaseInfoFeed[] purchaseInfo = new LiveStreamMessages$PurchaseInfoFeed[i];
                if (i2) {
                   System.arraycopy(tcommentFeed, i1, purchaseInfo, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   purchaseInfo[i2] = new LiveStreamMessages$PurchaseInfoFeed();
                   p0.readMessage(purchaseInfo[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                purchaseInfo[i2] = new LiveStreamMessages$PurchaseInfoFeed();
                p0.readMessage(purchaseInfo[i2]);
                this.purchaseInfoFeed = purchaseInfo;
                break;
              case 250:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 250);
                tcommentFeed = this.micSeatsApplyInfoFeed;
                i2 = (tcommentFeed == null)? 0: tcommentFeed.length;
                i = i + i2;
                LiveStreamMessages$MicSeatsApplyInfoFeed[] micSeatsAppl = new LiveStreamMessages$MicSeatsApplyInfoFeed[i];
                if (i2) {
                   System.arraycopy(tcommentFeed, i1, micSeatsAppl, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   micSeatsAppl[i2] = new LiveStreamMessages$MicSeatsApplyInfoFeed();
                   p0.readMessage(micSeatsAppl[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                micSeatsAppl[i2] = new LiveStreamMessages$MicSeatsApplyInfoFeed();
                p0.readMessage(micSeatsAppl[i2]);
                this.micSeatsApplyInfoFeed = micSeatsAppl;
                break;
              case 258:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 258);
                tcommentFeed = this.noticeFeed;
                i2 = (tcommentFeed == null)? 0: tcommentFeed.length;
                i = i + i2;
                LiveStreamMessages$NormalNoticeFeed[] normalNotice = new LiveStreamMessages$NormalNoticeFeed[i];
                if (i2) {
                   System.arraycopy(tcommentFeed, i1, normalNotice, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   normalNotice[i2] = new LiveStreamMessages$NormalNoticeFeed();
                   p0.readMessage(normalNotice[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                normalNotice[i2] = new LiveStreamMessages$NormalNoticeFeed();
                p0.readMessage(normalNotice[i2]);
                this.noticeFeed = normalNotice;
                break;
              case 266:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 266);
                tcommentFeed = this.toAudienceGiftFeed;
                i2 = (tcommentFeed == null)? 0: tcommentFeed.length;
                i = i + i2;
                LiveStreamMessages$ToAudienceGiftFeed[] toAudienceGi = new LiveStreamMessages$ToAudienceGiftFeed[i];
                if (i2) {
                   System.arraycopy(tcommentFeed, i1, toAudienceGi, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   toAudienceGi[i2] = new LiveStreamMessages$ToAudienceGiftFeed();
                   p0.readMessage(toAudienceGi[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                toAudienceGi[i2] = new LiveStreamMessages$ToAudienceGiftFeed();
                p0.readMessage(toAudienceGi[i2]);
                this.toAudienceGiftFeed = toAudienceGi;
                break;
              case 274:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 274);
                tcommentFeed = this.liveChatUserApplyInfoFeed;
                i2 = (tcommentFeed == null)? 0: tcommentFeed.length;
                i = i + i2;
                LiveChatMessageProto$LiveChatUserApplyInfoFeed[] liveChatUser = new LiveChatMessageProto$LiveChatUserApplyInfoFeed[i];
                if (i2) {
                   System.arraycopy(tcommentFeed, i1, liveChatUser, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveChatUser[i2] = new LiveChatMessageProto$LiveChatUserApplyInfoFeed();
                   p0.readMessage(liveChatUser[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveChatUser[i2] = new LiveChatMessageProto$LiveChatUserApplyInfoFeed();
                p0.readMessage(liveChatUser[i2]);
                this.liveChatUserApplyInfoFeed = liveChatUser;
                break;
              case 282:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 282);
                tcommentFeed = this.toAudienceDrawingGiftFeed;
                i2 = (tcommentFeed == null)? 0: tcommentFeed.length;
                i = i + i2;
                LiveStreamMessages$ToAudienceDrawingGiftFeed[] toAudienceDr = new LiveStreamMessages$ToAudienceDrawingGiftFeed[i];
                if (i2) {
                   System.arraycopy(tcommentFeed, i1, toAudienceDr, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   toAudienceDr[i2] = new LiveStreamMessages$ToAudienceDrawingGiftFeed();
                   p0.readMessage(toAudienceDr[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                toAudienceDr[i2] = new LiveStreamMessages$ToAudienceDrawingGiftFeed();
                p0.readMessage(toAudienceDr[i2]);
                this.toAudienceDrawingGiftFeed = toAudienceDr;
                break;
              case 290:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 290);
                tcommentFeed = this.displayGiftFeed;
                i2 = (tcommentFeed == null)? 0: tcommentFeed.length;
                i = i + i2;
                LiveStreamMessages$DisplayGiftFeed[] uDisplayGift = new LiveStreamMessages$DisplayGiftFeed[i];
                if (i2) {
                   System.arraycopy(tcommentFeed, i1, uDisplayGift, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uDisplayGift[i2] = new LiveStreamMessages$DisplayGiftFeed();
                   p0.readMessage(uDisplayGift[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uDisplayGift[i2] = new LiveStreamMessages$DisplayGiftFeed();
                p0.readMessage(uDisplayGift[i2]);
                this.displayGiftFeed = uDisplayGift;
                break;
              case 298:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 298);
                tcommentFeed = this.toAudienceDisplayGiftFeed;
                i2 = (tcommentFeed == null)? 0: tcommentFeed.length;
                i = i + i2;
                LiveStreamMessages$ToAudienceDisplayGiftFeed[] toAudienceDi = new LiveStreamMessages$ToAudienceDisplayGiftFeed[i];
                if (i2) {
                   System.arraycopy(tcommentFeed, i1, toAudienceDi, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   toAudienceDi[i2] = new LiveStreamMessages$ToAudienceDisplayGiftFeed();
                   p0.readMessage(toAudienceDi[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                toAudienceDi[i2] = new LiveStreamMessages$ToAudienceDisplayGiftFeed();
                p0.readMessage(toAudienceDi[i2]);
                this.toAudienceDisplayGiftFeed = toAudienceDi;
                break;
              case 306:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 306);
                tcommentFeed = this.allPulledCommentFeed;
                i2 = (tcommentFeed == null)? 0: tcommentFeed.length;
                i = i + i2;
                uCommentFeed = new LiveStreamMessages$CommentFeed[i];
                if (i2) {
                   System.arraycopy(tcommentFeed, i1, uCommentFeed, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uCommentFeed[i2] = new LiveStreamMessages$CommentFeed();
                   p0.readMessage(uCommentFeed[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uCommentFeed[i2] = new LiveStreamMessages$CommentFeed();
                p0.readMessage(uCommentFeed[i2]);
                this.allPulledCommentFeed = uCommentFeed;
                break;
              case 312:
                this.needReportGiftFeed = p0.readBool();
                break;
              case 322:
                this.liteDisplayWatchingCount = p0.readString();
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
       LiveStreamMessages$SCFeedPush tcommentFeed1;
       object oobject;
       LiveStreamMessages$SCFeedPush tgrabRedPack;
       object oobject1;
       LiveStreamMessages$SCFeedPush tcommentFeed = this.commentFeeds;
       int i = 0;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i1 = 0;
          tcommentFeed1 = this.commentFeeds;
          while (i1 < tcommentFeed1.length) {
             oobject = tcommentFeed1[i1];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tcommentFeed = this.likeFeeds;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i1 = 0;
          tcommentFeed1 = this.likeFeeds;
          while (i1 < tcommentFeed1.length) {
             oobject = tcommentFeed1[i1];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tcommentFeed = this.watchingFeeds;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i1 = 0;
          tcommentFeed1 = this.watchingFeeds;
          while (i1 < tcommentFeed1.length) {
             oobject = tcommentFeed1[i1];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tcommentFeed = this.giftFeeds;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i1 = 0;
          tcommentFeed1 = this.giftFeeds;
          while (i1 < tcommentFeed1.length) {
             oobject = tcommentFeed1[i1];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tcommentFeed1 = this.watchingCount;
       int i2 = 0;
       if (tcommentFeed1 - i2) {
          p0.writeUInt64(5, tcommentFeed1);
       }
       tcommentFeed1 = this.likeCount;
       if (tcommentFeed1 - i2) {
          p0.writeUInt64(6, tcommentFeed1);
       }
       tcommentFeed1 = this.pendingLikeCount;
       if (tcommentFeed1 - i2) {
          p0.writeUInt64(7, tcommentFeed1);
       }
       tcommentFeed1 = this.pushInterval;
       if (tcommentFeed1 - i2) {
          p0.writeUInt64(8, tcommentFeed1);
       }
       tcommentFeed = this.systemNoticeFeeds;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i1 = 0;
          tcommentFeed1 = this.systemNoticeFeeds;
          while (i1 < tcommentFeed1.length) {
             oobject = tcommentFeed1[i1];
             if (oobject != null) {
                p0.writeMessage(9, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tcommentFeed = this.drawingGiftFeeds;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i1 = 0;
          tcommentFeed1 = this.drawingGiftFeeds;
          while (i1 < tcommentFeed1.length) {
             oobject = tcommentFeed1[i1];
             if (oobject != null) {
                p0.writeMessage(10, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.displayWatchingCount).equals("")) {
          p0.writeString(11, this.displayWatchingCount);
       }
       if (!(this.displayLikeCount).equals("")) {
          p0.writeString(12, this.displayLikeCount);
       }
       tcommentFeed = this.grabRedPackFeed;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i1 = 0;
          tgrabRedPack = this.grabRedPackFeed;
          while (i1 < tgrabRedPack.length) {
             oobject1 = tgrabRedPack[i1];
             if (oobject1 != null) {
                p0.writeMessage(20, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tcommentFeed = this.broadcastGiftFeed;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i1 = 0;
          tgrabRedPack = this.broadcastGiftFeed;
          while (i1 < tgrabRedPack.length) {
             oobject1 = tgrabRedPack[i1];
             if (oobject1 != null) {
                p0.writeMessage(21, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tcommentFeed = this.shareFeeds;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i1 = 0;
          tgrabRedPack = this.shareFeeds;
          while (i1 < tgrabRedPack.length) {
             oobject1 = tgrabRedPack[i1];
             if (oobject1 != null) {
                p0.writeMessage(22, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tcommentFeed = this.comboCommentFeed;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i1 = 0;
          tgrabRedPack = this.comboCommentFeed;
          while (i1 < tgrabRedPack.length) {
             oobject1 = tgrabRedPack[i1];
             if (oobject1 != null) {
                p0.writeMessage(23, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tcommentFeed = this.richTextFeeds;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i1 = 0;
          tgrabRedPack = this.richTextFeeds;
          while (i1 < tgrabRedPack.length) {
             oobject1 = tgrabRedPack[i1];
             if (oobject1 != null) {
                p0.writeMessage(24, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       LiveStreamMessages$SCFeedPush tauthorId = this.authorId;
       if (tauthorId - i2) {
          p0.writeUInt64(25, tauthorId);
       }
       tcommentFeed = this.voiceCommentFeed;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i1 = 0;
          tgrabRedPack = this.voiceCommentFeed;
          while (i1 < tgrabRedPack.length) {
             oobject1 = tgrabRedPack[i1];
             if (oobject1 != null) {
                p0.writeMessage(26, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tcommentFeed = this.followAuthorFeed;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i1 = 0;
          tgrabRedPack = this.followAuthorFeed;
          while (i1 < tgrabRedPack.length) {
             oobject1 = tgrabRedPack[i1];
             if (oobject1 != null) {
                p0.writeMessage(27, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tcommentFeed = this.enterRoomFeed;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i1 = 0;
          tgrabRedPack = this.enterRoomFeed;
          while (i1 < tgrabRedPack.length) {
             oobject1 = tgrabRedPack[i1];
             if (oobject1 != null) {
                p0.writeMessage(28, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tauthorId = this.time;
       if (tauthorId - i2) {
          p0.writeUInt64(29, tauthorId);
       }
       tcommentFeed = this.purchaseInfoFeed;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i1 = 0;
          tgrabRedPack = this.purchaseInfoFeed;
          while (i1 < tgrabRedPack.length) {
             oobject1 = tgrabRedPack[i1];
             if (oobject1 != null) {
                p0.writeMessage(30, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tcommentFeed = this.micSeatsApplyInfoFeed;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i1 = 0;
          tgrabRedPack = this.micSeatsApplyInfoFeed;
          while (i1 < tgrabRedPack.length) {
             oobject1 = tgrabRedPack[i1];
             if (oobject1 != null) {
                p0.writeMessage(31, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tcommentFeed = this.noticeFeed;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i1 = 0;
          tgrabRedPack = this.noticeFeed;
          while (i1 < tgrabRedPack.length) {
             oobject1 = tgrabRedPack[i1];
             if (oobject1 != null) {
                p0.writeMessage(32, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tcommentFeed = this.toAudienceGiftFeed;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i1 = 0;
          tgrabRedPack = this.toAudienceGiftFeed;
          while (i1 < tgrabRedPack.length) {
             oobject1 = tgrabRedPack[i1];
             if (oobject1 != null) {
                p0.writeMessage(33, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tcommentFeed = this.liveChatUserApplyInfoFeed;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i1 = 0;
          tgrabRedPack = this.liveChatUserApplyInfoFeed;
          while (i1 < tgrabRedPack.length) {
             oobject1 = tgrabRedPack[i1];
             if (oobject1 != null) {
                p0.writeMessage(34, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tcommentFeed = this.toAudienceDrawingGiftFeed;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i1 = 0;
          tgrabRedPack = this.toAudienceDrawingGiftFeed;
          while (i1 < tgrabRedPack.length) {
             oobject1 = tgrabRedPack[i1];
             if (oobject1 != null) {
                p0.writeMessage(35, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tcommentFeed = this.displayGiftFeed;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i1 = 0;
          tgrabRedPack = this.displayGiftFeed;
          while (i1 < tgrabRedPack.length) {
             oobject1 = tgrabRedPack[i1];
             if (oobject1 != null) {
                p0.writeMessage(36, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tcommentFeed = this.toAudienceDisplayGiftFeed;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          i1 = 0;
          tgrabRedPack = this.toAudienceDisplayGiftFeed;
          while (i1 < tgrabRedPack.length) {
             oobject1 = tgrabRedPack[i1];
             if (oobject1 != null) {
                p0.writeMessage(37, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tcommentFeed = this.allPulledCommentFeed;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          tcommentFeed = this.allPulledCommentFeed;
          while (i < tcommentFeed.length) {
             object oobject2 = tcommentFeed[i];
             if (oobject2 != null) {
                p0.writeMessage(38, oobject2);
             }
             i = i + 1;
          }
       }
       tcommentFeed = this.needReportGiftFeed;
       if (tcommentFeed != null) {
          p0.writeBool(39, tcommentFeed);
       }
       if (!(this.liteDisplayWatchingCount).equals("")) {
          p0.writeString(40, this.liteDisplayWatchingCount);
       }
       super.writeTo(p0);
       return;
    }
}
