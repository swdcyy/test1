package da1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCFeedPush;
import ca1.a;
import da1.c;
import java.util.List;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$CommentFeed;
import com.kuaishou.live.common.core.component.comments.model.CommentMessage;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$LikeFeed;
import com.kuaishou.live.common.core.component.like.LikeMessage;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$GiftFeed;
import com.kuaishou.live.core.show.gift.GiftMessage;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Long;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$ToAudienceGiftFeed;
import com.kuaishou.live.common.core.component.gift.data.message.LiveGiftToAudienceMessage;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$DrawingGiftFeed;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kwai.framework.model.user.UserInfo;
import yb6.d;
import java.lang.StringBuilder;
import java.lang.System;
import java.util.ArrayList;
import com.kuaishou.live.core.show.gift.DrawingGift$Point;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$DrawingGiftPoint;
import com.kuaishou.live.core.show.gift.DrawingGift;
import wj1.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$ToAudienceDrawingGiftFeed;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import java.util.Arrays;
import da1.b;
import java.lang.Iterable;
import ok.o;
import qk.y;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$BroadcastGiftFeed;
import com.kuaishou.live.common.core.component.gift.data.message.BroadcastGiftMessage;
import com.kuaishou.live.common.core.component.comments.model.SystemNoticeMessage;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SystemNoticeFeed;
import com.kuaishou.live.common.core.component.redpacket.redpacket.GrabRedPacketMessage;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$GrabRedPackFeed;
import com.kuaishou.live.common.core.component.comments.combo.ComboCommentMessage;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$ComboCommentFeed;
import com.kuaishou.live.common.core.component.comments.model.RichTextMessageOld;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$RichTextFeed;
import ca1.b;
import com.kuaishou.live.common.core.component.follow.FollowAnchorMessage;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$FollowAuthorFeed;
import com.kuaishou.live.common.core.component.comments.model.VoiceCommentMessage;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$VoiceCommentFeed;
import com.kuaishou.protobuf.livestream.nano.LiveCdnNodeView;
import com.yxcorp.gifshow.model.CDNUrl;
import va1.l0;
import com.kuaishou.live.common.core.component.gift.data.message.LiveGiftMergedMessage;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$DisplayGiftFeed;
import com.kuaishou.live.common.core.component.gift.gift.p;
import com.kuaishou.live.common.core.component.gift.data.message.LiveGiftToAudienceMergedMessage;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$ToAudienceDisplayGiftFeed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$EnterRoomFeed;
import com.kuaishou.live.core.show.enterroom.model.EnterRoomMessage;
import com.kuaishou.live.common.core.component.comments.model.PurchaseInfoMessage;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$PurchaseInfoFeed;
import com.kuaishou.live.common.core.component.chat.LiveChatWithGuestApplyMessage;
import com.kuaishou.livestream.message.nano.LiveChatMessageProto$LiveChatUserApplyInfoFeed;
import com.kuaishou.live.common.core.component.comments.model.LiveShareMessage;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$ShareFeed;
import da1.a$a;
import java.util.Comparator;
import java.util.Collections;

public class a	// class@001f59
{
    public long a;

    public void a(){
       super();
       this.a = 0;
    }
    public static a b(){
       a obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a();
       obj.a = 0x3ffff;
       return obj;
    }
    public void a(int p0){
       this.a = this.a | (1 << p0);
    }
    public a c(LiveStreamMessages$SCFeedPush p0){
       LiveStreamMessages$SCFeedPush commentFeeds;
       boolean len;
       int i1;
       int i2;
       GiftMessage giftMessage;
       int len1;
       PatchProxyResult patchProxyRe1;
       a uoa1;
       String str3;
       c uoc;
       LiveStreamMessages$SCFeedPush sCFeedPush;
       String str4;
       int i3;
       int len2;
       LiveStreamMessages$SCFeedPush toAudienceDr;
       int len3;
       int i4;
       object oobject2;
       c uoc1;
       PatchProxyResult patchProxyRe2;
       QLiveMessage obj5;
       LiveStreamMessages$GrabRedPackFeed grabRedPackF;
       LiveStreamMessages$SCFeedPush sCFeedPush1;
       int i5;
       String str5;
       List list1;
       GrabRedPacketMessage grabRedPacke;
       QLiveMessage obj6;
       Object obj = this;
       LiveStreamMessages$SCFeedPush obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       String str = "3";
       c obj2 = PatchProxy.applyOneRefs(obj1, obj, uoa, str);
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       obj2 = c.class;
       String str1 = "4";
       uoa = PatchProxy.applyOneRefs(obj1, obj, uoa, str1);
       if (uoa != patchProxyRe) {
       }else {
          uoa = new a();
          int i = 1;
          if (obj1.commentFeeds != null && obj.d(i)) {
             commentFeeds = obj1.commentFeeds;
             len = commentFeeds.length;
             for (i1 = 0; i1 < len; i1 = i1 + 1) {
                uoa.a().add(c.d(commentFeeds[i1]));
             }
          }
          len = 2;
          if (obj1.likeFeeds != null && obj.d(len)) {
             commentFeeds = obj1.likeFeeds;
             i1 = commentFeeds.length;
             for (i2 = 0; i2 < i1; i2 = i2 + 1) {
                uoa.a().add(c.g(commentFeeds[i2]));
             }
          }
          if (obj1.giftFeeds != null && obj.d(4)) {
             commentFeeds = obj1.giftFeeds;
             i1 = commentFeeds.length;
             i2 = 0;
             while (i2 < i1) {
                giftMessage = c.f(commentFeeds[i2]);
                if (giftMessage != null) {
                   GiftMessage mMagicFaceId = giftMessage.mMagicFaceId;
                   if (mMagicFaceId) {
                      b.a0(LiveLogTag.MAGIC_GIFT, "fromProtoMessage", c.j("MagicFaceId", Long.valueOf(mMagicFaceId)));
                   }
                }
                uoa.a().add(giftMessage);
                i2 = i2 + 1;
                LiveLogTag liveLogTag = 2;
             }
          }
          if (obj1.toAudienceGiftFeed != null && obj.d(5)) {
             commentFeeds = obj1.toAudienceGiftFeed;
             len = commentFeeds.length;
             for (i1 = 0; i1 < len; i1 = i1 + 1) {
                uoa.a().add(c.c(commentFeeds[i1]));
             }
          }
          String str2 = "drawing_message_";
          LiveStreamMessages$SCFeedPush obj3 = null;
          if (obj1.drawingGiftFeeds != null && obj.d(6)) {
             commentFeeds = obj1.drawingGiftFeeds;
             len1 = commentFeeds.length;
             i1 = 0;
             while (i1 < len1) {
                object oobject = commentFeeds[i1];
                List list = uoa.a();
                giftMessage = PatchProxy.applyOneRefs(oobject, obj3, obj2, "5");
                if (giftMessage != patchProxyRe) {
                   patchProxyRe1 = patchProxyRe;
                   uoa1 = uoa;
                   str3 = str;
                   uoc = obj2;
                   sCFeedPush = commentFeeds;
                   str4 = str2;
                   i3 = len1;
                }else {
                   giftMessage = new GiftMessage();
                   giftMessage.mId = oobject.id;
                   giftMessage.mUser = UserInfo.convertFromProto(oobject.user, oobject.liveAssistantType);
                   obj3 = commentFeeds;
                   giftMessage.mTime = oobject.time;
                   giftMessage.mRank = oobject.rank;
                   giftMessage.mClientTimestamp = oobject.clientTimestamp;
                   long l = oobject.expireDuration + d.a();
                   giftMessage.mExpireDate = l;
                   giftMessage.mMergeKey = str2+oobject.id;
                   giftMessage.mIsDrawingGift = true;
                   giftMessage.mComboCount = 1;
                   giftMessage.mCount = 1;
                   giftMessage.mTime = System.currentTimeMillis();
                   l = d.a() + 0x413b380;
                   giftMessage.mExpireDate = l;
                   giftMessage.mDisplayDuration = (int)oobject.slotDisplayDuration;
                   giftMessage.mLiveAssistantType = oobject.liveAssistantType;
                   giftMessage.mDeviceHash = oobject.deviceHash;
                   giftMessage.mSlotPos = oobject.slotPos;
                   giftMessage.mDisplayExtendMillis = oobject.displayExtendMillis;
                   giftMessage.mLiveAudienceState = oobject.senderState;
                   ArrayList uArrayList = new ArrayList();
                   LiveStreamMessages$DrawingGiftFeed points = oobject.points;
                   if (points != null) {
                      sCFeedPush = obj3;
                      if (points.length > 0) {
                         len2 = points.length;
                         i3 = len1;
                         len1 = 0;
                         while (len1 < len2) {
                            object oobject1 = points[len1];
                            DrawingGift$Point point = new DrawingGift$Point(oobject1.giftId, 0, oobject1.left, oobject1.top, oobject1.right, oobject1.bottom);
                            uArrayList.add(points);
                            giftMessage.mGiftId = oobject1.giftId;
                            len1 = len1 + 1;
                            len2 = len2;
                            str = str;
                            uoa = uoa;
                            str2 = str2;
                            patchProxyRe = patchProxyRe;
                            obj2 = obj2;
                         }
                         patchProxyRe1 = patchProxyRe;
                         uoa1 = uoa;
                         str3 = str;
                         uoc = obj2;
                         str4 = str2;
                      label_01e5 :
                         giftMessage.mDrawingGift = new DrawingGift(oobject.width, oobject.height, uArrayList);
                         giftMessage.mNewGiftSlotStyle = a.a(giftMessage)[0];
                         giftMessage.mDisplayDuration = 3000;
                         giftMessage.mIsNaming = oobject.giftNaming;
                      }else {
                         patchProxyRe1 = patchProxyRe;
                         uoa1 = uoa;
                         str3 = str;
                         uoc = obj2;
                         str4 = str2;
                      }
                   }else {
                      patchProxyRe1 = patchProxyRe;
                      uoa1 = uoa;
                      str3 = str;
                      uoc = obj2;
                      str4 = str2;
                      sCFeedPush = obj3;
                   }
                   i3 = len1;
                   goto label_01e5 ;
                }
                list.add(giftMessage);
                i1 = i1 + 1;
                commentFeeds = sCFeedPush;
                len1 = i3;
                str = str3;
                uoa = uoa1;
                str2 = str4;
                patchProxyRe = patchProxyRe1;
                obj2 = uoc;
                obj3 = null;
             }
          }
          patchProxyRe1 = patchProxyRe;
          uoa1 = uoa;
          str3 = str;
          uoc = obj2;
          str4 = str2;
          if (obj1.toAudienceDrawingGiftFeed != null && obj.d(7)) {
             toAudienceDr = obj1.toAudienceDrawingGiftFeed;
             len3 = toAudienceDr.length;
             i4 = 0;
             while (i4 < len3) {
                oobject2 = toAudienceDr[i4];
                uoc1 = uoc;
                UserInfo obj4 = PatchProxy.applyOneRefs(oobject2, null, uoc1, str1);
                patchProxyRe2 = patchProxyRe1;
                if (obj4 != patchProxyRe2) {
                   obj5 = obj4;
                   grabRedPackF = 2;
                }else {
                   LiveGiftToAudienceMessage liveGiftToAu = new LiveGiftToAudienceMessage();
                   liveGiftToAu.mId = oobject2.id;
                   liveGiftToAu.mUser = UserInfo.convertFromProto(oobject2.fromUser, oobject2.senderState.assistantType);
                   i1 = 0;
                   UserInfo userInfo = UserInfo.convertFromProto(oobject2.toUser, i1);
                   liveGiftToAu.mGiftReceiverUserInfo = userInfo;
                   int i7 = 2;
                   if (oobject2.showStrategy == i7) {
                      UserInfo[] userInfoArra = new UserInfo[i7];
                      userInfoArra[i1] = liveGiftToAu.mUser;
                      userInfoArra[1] = userInfo;
                      if (!y.c(Arrays.asList(userInfoArra), b.b)) {
                         obj5 = null;
                      }
                   }
                   liveGiftToAu.mTime = oobject2.time;
                   liveGiftToAu.mRank = oobject2.rank;
                   liveGiftToAu.mClientTimestamp = oobject2.clientTimestamp;
                   long l1 = oobject2.expireDuration + d.a();
                   liveGiftToAu.mExpireDate = l1;
                   String str6 = str4;
                   liveGiftToAu.mMergeKey = str6+oobject2.id;
                   liveGiftToAu.mIsDrawingGift = true;
                   liveGiftToAu.mComboCount = 1;
                   liveGiftToAu.mCount = 1;
                   liveGiftToAu.mTime = System.currentTimeMillis();
                   long l2 = d.a() + 0x413b380;
                   liveGiftToAu.mExpireDate = l2;
                   liveGiftToAu.mDisplayDuration = (int)oobject2.slotDisplayDuration;
                   LiveStreamMessages$ToAudienceDrawingGiftFeed senderState = oobject2.senderState;
                   liveGiftToAu.mLiveAssistantType = senderState.assistantType;
                   liveGiftToAu.mDeviceHash = oobject2.deviceHash;
                   liveGiftToAu.mSlotPos = oobject2.slotPos;
                   liveGiftToAu.mDisplayExtendMillis = oobject2.displayExtendMillis;
                   liveGiftToAu.mLiveAudienceState = senderState;
                   ArrayList uArrayList1 = new ArrayList();
                   LiveStreamMessages$ToAudienceDrawingGiftFeed point1 = oobject2.point;
                   if (point1 != null && point1.length > 0) {
                      len2 = point1.length;
                      len1 = 0;
                      while (len1 < len2) {
                         object oobject3 = point1[len1];
                         DrawingGift$Point point2 = new DrawingGift$Point(oobject3.giftId, 0, oobject3.left, oobject3.top, oobject3.right, oobject3.bottom);
                         uArrayList1.add(toAudienceDr);
                         liveGiftToAu.mGiftId = oobject3.giftId;
                         len1 = len1 + 1;
                         toAudienceDr = toAudienceDr;
                         len3 = len3;
                         str1 = str1;
                         str6 = str6;
                         len2 = len2;
                         grabRedPackF = 2;
                      }
                   }
                   sCFeedPush1 = toAudienceDr;
                   i5 = len3;
                   str5 = str1;
                   str4 = str6;
                   liveGiftToAu.mDrawingGift = new DrawingGift(oobject2.width, oobject2.height, uArrayList1);
                   liveGiftToAu.mNewGiftSlotStyle = a.a(liveGiftToAu)[0];
                   liveGiftToAu.mDisplayDuration = 3000;
                label_0359 :
                   if (obj4) {
                      uoa1.a().add(obj4);
                   }
                   i4 = i4 + 1;
                   uoc = uoc1;
                   patchProxyRe1 = patchProxyRe2;
                   toAudienceDr = sCFeedPush1;
                   len3 = i5;
                   str1 = str5;
                }
                sCFeedPush1 = toAudienceDr;
                i5 = len3;
                obj4 = obj5;
                str5 = str1;
                int i6 = 0x413b380;
                goto label_0359 ;
             }
          }
          patchProxyRe2 = patchProxyRe1;
          uoc1 = uoc;
          if (obj1.broadcastGiftFeed != null && obj.d(8)) {
             toAudienceDr = obj1.broadcastGiftFeed;
             len3 = toAudienceDr.length;
             for (i4 = 0; i4 < len3; i4 = i4 + 1) {
                uoa1.a().add(c.a(toAudienceDr[i4]));
             }
          }
          if (obj1.systemNoticeFeeds != null && obj.d(9)) {
             toAudienceDr = obj1.systemNoticeFeeds;
             len3 = toAudienceDr.length;
             for (i4 = 0; i4 < len3; i4 = i4 + 1) {
                oobject2 = toAudienceDr[i4];
                list1 = uoa1.a();
                SystemNoticeMessage systemNotice = PatchProxy.applyOneRefs(oobject2, null, uoc1, "9");
                if (systemNotice != patchProxyRe2) {
                }else {
                   systemNotice = new SystemNoticeMessage();
                   systemNotice.mId = oobject2.id;
                   systemNotice.mTime = oobject2.time;
                   systemNotice.mUser = UserInfo.convertFromProto(oobject2.user, 0);
                   systemNotice.mContent = oobject2.content;
                   systemNotice.mDisplayDuration = oobject2.displayDuration;
                   systemNotice.mSortRank = oobject2.sortRank;
                   systemNotice.mDisplayType = oobject2.displayType;
                   systemNotice.mLogId = oobject2.id;
                }
                list1.add(systemNotice);
             }
          }
          if (obj1.grabRedPackFeed != null && obj.d(10)) {
             toAudienceDr = obj1.grabRedPackFeed;
             len3 = toAudienceDr.length;
             i4 = 0;
             while (i4 < len3) {
                oobject2 = toAudienceDr[i4];
                list1 = uoa1.a();
                String str7 = str3;
                grabRedPacke = PatchProxy.applyOneRefs(oobject2, null, uoc1, str7);
                if (grabRedPacke != patchProxyRe2) {
                }else {
                   grabRedPacke = new GrabRedPacketMessage();
                   grabRedPacke.setId(oobject2.id).setUser(UserInfo.convertFromProto(oobject2.user, oobject2.liveAssistantType)).setTime(oobject2.time).setSortRank(oobject2.sortRank).setLiveAssistantType(oobject2.liveAssistantType);
                   len = false;
                   grabRedPacke.mIsSnatchMyselfRedPacket = len;
                   grabRedPacke.mRedPackType = oobject2.redPackType;
                   LiveStreamMessages$GrabRedPackFeed fromUser = oobject2.fromUser;
                   if (fromUser != null) {
                      grabRedPacke.mFromUser = UserInfo.convertFromProto(fromUser, len);
                   }
                   grabRedPacke.mGrabKsCoin = (long)oobject2.getKsCoin;
                   grabRedPacke.mLogId = oobject2.id;
                }
                list1.add(grabRedPacke);
                i4 = i4 + 1;
                str3 = str7;
             }
          }
          if (obj1.comboCommentFeed != null && obj.d(11)) {
             toAudienceDr = obj1.comboCommentFeed;
             len3 = toAudienceDr.length;
             for (i4 = 0; i4 < len3; i4 = i4 + 1) {
                oobject2 = toAudienceDr[i4];
                list1 = uoa1.a();
                ComboCommentMessage uComboCommen = PatchProxy.applyOneRefs(oobject2, null, uoc1, "13");
                if (uComboCommen != patchProxyRe2) {
                }else {
                   uComboCommen = new ComboCommentMessage();
                   uComboCommen.mId = oobject2.id;
                   uComboCommen.mComboCount = oobject2.comboCount;
                   uComboCommen.mContent = oobject2.content;
                   uComboCommen.mTime = oobject2.time;
                }
                list1.add(uComboCommen);
             }
          }
          if (obj1.richTextFeeds != null && obj.d(12)) {
             toAudienceDr = obj1.richTextFeeds;
             len3 = toAudienceDr.length;
             for (i4 = 0; i4 < len3; i4 = i4 + 1) {
                oobject2 = toAudienceDr[i4];
                list1 = uoa1.a();
                RichTextMessageOld richTextMess = PatchProxy.applyOneRefs(oobject2, null, uoc1, "15");
                if (richTextMess != patchProxyRe2) {
                }else {
                   richTextMess = b.a(oobject2);
                }
                list1.add(richTextMess);
             }
          }
          if (obj1.followAuthorFeed != null && obj.d(13)) {
             toAudienceDr = obj1.followAuthorFeed;
             len3 = toAudienceDr.length;
             for (i4 = 0; i4 < len3; i4 = i4 + 1) {
                oobject2 = toAudienceDr[i4];
                FollowAnchorMessage uFollowAncho = PatchProxy.applyOneRefs(oobject2, null, uoc1, "16");
                if (uFollowAncho != patchProxyRe2) {
                }else {
                   uFollowAncho = new FollowAnchorMessage();
                   uFollowAncho.parse(oobject2);
                }
                uoa1.a().add(uFollowAncho);
             }
          }
          if (obj1.voiceCommentFeed != null && obj.d(14)) {
             toAudienceDr = obj1.voiceCommentFeed;
             len3 = toAudienceDr.length;
             for (i4 = 0; i4 < len3; i4 = i4 + 1) {
                oobject2 = toAudienceDr[i4];
                list1 = uoa1.a();
                VoiceCommentMessage voiceComment = PatchProxy.applyOneRefs(oobject2, null, uoc1, "21");
                if (voiceComment != patchProxyRe2) {
                }else {
                   voiceComment = new VoiceCommentMessage().setId(oobject2.id).setUser(UserInfo.convertFromProto(oobject2.user, oobject2.liveAssistantType)).setTime(oobject2.time).setSortRank(oobject2.sortRank).setDeviceHash(oobject2.deviceHash).setLiveAssistantType(oobject2.liveAssistantType).setLiveAudienceState(oobject2.senderState).setAnonymous(oobject2.isAnonymous).cast();
                   voiceComment.mDurationMs = oobject2.durationMillis;
                   voiceComment.mContent = oobject2.content;
                   voiceComment.mVoiceFileCdnUrl = l0.o(oobject2.cdnNodeView);
                   voiceComment.mHasCompressed = oobject2.hasCompressed;
                }
                list1.add(voiceComment);
             }
          }
          if (obj.d(18)) {
             toAudienceDr = obj1.displayGiftFeed;
             if (toAudienceDr != null && toAudienceDr.length > 0) {
                len3 = toAudienceDr.length;
                for (i4 = 0; i4 < len3; i4 = i4 + 1) {
                   oobject2 = toAudienceDr[i4];
                   LiveGiftMergedMessage liveGiftMerg = PatchProxy.applyOneRefs(oobject2, null, uoc1, "27");
                   if (liveGiftMerg != patchProxyRe2) {
                   }else {
                      liveGiftMerg = new LiveGiftMergedMessage();
                      liveGiftMerg.mGiftId = oobject2.giftId;
                      liveGiftMerg.mId = oobject2.id;
                      liveGiftMerg.mCount = oobject2.batchSize;
                      liveGiftMerg.mTime = oobject2.time;
                      liveGiftMerg.mUser = UserInfo.convertFromProto(oobject2.user, oobject2.senderState.assistantType);
                      liveGiftMerg.mMergeKey = oobject2.mergeKey;
                      liveGiftMerg.mMergeCount = oobject2.mergeCount;
                      liveGiftMerg.mClientTimestamp = oobject2.clientTimestamp;
                      liveGiftMerg.mSortRank = oobject2.sortRank;
                      liveGiftMerg.mIsDrawingGift = oobject2.isDrawingGift;
                      p.d(liveGiftMerg);
                      LiveStreamMessages$DisplayGiftFeed senderState1 = oobject2.senderState;
                      liveGiftMerg.mLiveAssistantType = senderState1.assistantType;
                      liveGiftMerg.mDeviceHash = oobject2.deviceHash;
                      liveGiftMerg.mIsOpenArrowRedPack = oobject2.isOpenArrowRedPack;
                      liveGiftMerg.mLiveAudienceState = senderState1;
                      liveGiftMerg.mType = oobject2.giftType;
                      int[] ointArray = a.a(liveGiftMerg);
                      liveGiftMerg.mNewGiftSlotStyle = ointArray[0];
                      liveGiftMerg.mDisplayDuration = ointArray[1];
                      liveGiftMerg.mLogId = oobject2.id;
                   }
                   uoa1.a().add(liveGiftMerg);
                }
             }
          }
          if (obj.d(19)) {
             toAudienceDr = obj1.toAudienceDisplayGiftFeed;
             if (toAudienceDr != null && toAudienceDr.length > 0) {
                len3 = toAudienceDr.length;
                for (i4 = 0; i4 < len3; i4 = i4 + 1) {
                   oobject2 = toAudienceDr[i4];
                   LiveGiftToAudienceMergedMessage liveGiftToAu1 = PatchProxy.applyOneRefs(oobject2, null, uoc1, "28");
                   if (liveGiftToAu1 != patchProxyRe2) {
                      obj6 = 1;
                   }else {
                      liveGiftToAu1 = new LiveGiftToAudienceMergedMessage();
                      liveGiftToAu1.mGiftReceiverUserInfo = UserInfo.convertFromProto(oobject2.toUser, 0);
                      liveGiftToAu1.mGiftId = oobject2.giftId;
                      liveGiftToAu1.mId = oobject2.id;
                      liveGiftToAu1.mCount = oobject2.batchSize;
                      liveGiftToAu1.mTime = oobject2.time;
                      liveGiftToAu1.mUser = UserInfo.convertFromProto(oobject2.fromUser, oobject2.senderState.assistantType);
                      liveGiftToAu1.mMergeKey = oobject2.mergeKey;
                      liveGiftToAu1.mMergeCount = oobject2.mergeCount;
                      liveGiftToAu1.mClientTimestamp = oobject2.clientTimestamp;
                      liveGiftToAu1.mSortRank = oobject2.sortRank;
                      liveGiftToAu1.mIsDrawingGift = false;
                      p.d(liveGiftToAu1);
                      LiveStreamMessages$ToAudienceDisplayGiftFeed senderState2 = oobject2.senderState;
                      liveGiftToAu1.mLiveAssistantType = senderState2.assistantType;
                      liveGiftToAu1.mLiveAudienceState = senderState2;
                      liveGiftToAu1.mDeviceHash = oobject2.deviceHash;
                      liveGiftToAu1.mIsOpenArrowRedPack = false;
                      int[] ointArray1 = a.a(liveGiftToAu1);
                      liveGiftToAu1.mNewGiftSlotStyle = ointArray1[0];
                      liveGiftToAu1.mDisplayDuration = ointArray1[1];
                      liveGiftToAu1.mLogId = oobject2.id;
                   }
                   uoa1.a().add(liveGiftToAu1);
                }
             }
          }
          if (obj1.enterRoomFeed != null && obj.d(15)) {
             toAudienceDr = obj1.enterRoomFeed;
             len3 = toAudienceDr.length;
             for (i4 = 0; i4 < len3; i4 = i4 + 1) {
                uoa1.a().add(c.e(toAudienceDr[i4]));
             }
          }
          if (obj1.purchaseInfoFeed != null && obj.d(16)) {
             toAudienceDr = obj1.purchaseInfoFeed;
             len3 = toAudienceDr.length;
             for (i4 = 0; i4 < len3; i4 = i4 + 1) {
                oobject2 = toAudienceDr[i4];
                list1 = uoa1.a();
                obj6 = PatchProxy.applyOneRefs(oobject2, null, uoc1, "22");
                if (obj6 != patchProxyRe2) {
                }else {
                   obj6 = new PurchaseInfoMessage().setCommodityId(oobject2.commodityId).setCommodityName(oobject2.commodityName).setPurchaseCount(oobject2.purchaseCount).setJumpToken(oobject2.jumpToken).setOrderId(oobject2.orderId).setId(oobject2.id).setTime(oobject2.time).setUser(UserInfo.convertFromProto(oobject2.user, 0)).setSortRank(oobject2.sortRank).setLiveAudienceState(oobject2.senderState).setLiveAssistantType(oobject2.liveAssistantType).cast();
                }
                list1.add(obj6);
             }
          }
          if (obj1.liveChatUserApplyInfoFeed != null && obj.d(17)) {
             toAudienceDr = obj1.liveChatUserApplyInfoFeed;
             len3 = toAudienceDr.length;
             for (i4 = 0; i4 < len3; i4 = i4 + 1) {
                oobject2 = toAudienceDr[i4];
                list1 = uoa1.a();
                LiveChatWithGuestApplyMessage liveChatWith = PatchProxy.applyOneRefs(oobject2, null, uoc1, "23");
                if (liveChatWith != patchProxyRe2) {
                   grabRedPacke = 0;
                }else {
                   liveChatWith = new LiveChatWithGuestApplyMessage().setUser(UserInfo.convertFromProto(oobject2.user, 0)).setId(oobject2.id).setSortRank(oobject2.sortRank).cast();
                   liveChatWith.mMediaType = oobject2.mediaTypeValue;
                   liveChatWith.mIsGuestSupportMultiChat = oobject2.isGuestSupportMultiChat;
                   liveChatWith.mLiveAudienceState = oobject2.userState;
                }
                list1.add(liveChatWith);
             }
          }
          if (obj1.shareFeeds != null && obj.d(20)) {
             obj1 = obj1.shareFeeds;
             int len4 = obj1.length;
             for (int i8 = 0; i8 < len4; i8 = i8 + 1) {
                object oobject4 = obj1[i8];
                List list2 = uoa1.a();
                obj5 = PatchProxy.applyOneRefs(oobject4, null, uoc1, "12");
                if (obj5 != patchProxyRe2) {
                }else {
                   obj5 = new LiveShareMessage().setThirdPartyPlatform(oobject4.thirdPartyPlatform).setFansGroupShareIntimacy(oobject4.fansGroupShareIntimacy).setContinueShareCurrentDay(oobject4.fansGroupContinueShareCurrentDay).setShareCount(oobject4.shareCount).setId(oobject4.id).setUser(UserInfo.convertFromProto(oobject4.user, oobject4.liveAssistantType)).setTime(oobject4.time).setSortRank(oobject4.sortRank).setDeviceHash(oobject4.deviceHash).setLiveAssistantType(oobject4.liveAssistantType).setLiveAudienceState(oobject4.senderState).cast();
                }
                list2.add(obj5);
             }
          }
          uoa = uoa1;
       }
       Collections.sort(uoa.a(), new a$a(obj));
       return uoa;
    }
    public boolean d(int p0){
       boolean b = ((this.a & (1 << p0)) > 0)? true: false;
       return b;
    }
    public void e(int p0){
       this.a = this.a & (~ (1 << p0));
    }
}
