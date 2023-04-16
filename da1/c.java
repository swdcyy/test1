package da1.c;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$BroadcastGiftFeed;
import com.kuaishou.live.common.core.component.gift.data.message.BroadcastGiftMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.common.core.component.gift.gift.p;
import com.kuaishou.live.common.core.component.magiceffect.LiveMagicEffectUtil;
import sz2.g;
import com.kuaishou.livestream.message.nano.GzoneInteractiveCommentNotice;
import java.lang.Integer;
import com.kuaishou.live.common.core.component.comments.model.LiveGzoneInteractiveCommentMessage;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$ToAudienceGiftFeed;
import com.kuaishou.live.common.core.component.gift.data.message.LiveGiftToAudienceMessage;
import com.kuaishou.live.core.show.gift.GiftMessage;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import yb6.d;
import wj1.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$CommentFeed;
import com.kuaishou.live.common.core.component.comments.model.CommentMessage;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$CommentFeedEmotion;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$EnterRoomFeed;
import com.kuaishou.live.core.show.enterroom.model.EnterRoomMessage;
import com.kuaishou.livestream.message.nano.LiveFansGroupMessages$LiveFansGroupState;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$GiftFeed;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$LikeFeed;
import com.kuaishou.live.common.core.component.like.LikeMessage;

public class c	// class@001f5b
{

    public void c(){
       super();
    }
    public static BroadcastGiftMessage a(LiveStreamMessages$BroadcastGiftFeed p0){
       Object obj = null;
       BroadcastGiftMessage obj1 = PatchProxy.applyOneRefs(p0, obj, c.class, "6");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = new BroadcastGiftMessage();
       obj1.mId = p0.id;
       obj1.mFromUser = UserInfo.convertFromProto(p0.fromUser, 0);
       obj1.mToUser = UserInfo.convertFromProto(p0.toUser, 0);
       obj1.mUser = UserInfo.convertFromProto(p0.fromUser, p0.liveAssistantType);
       obj1.mTime = p0.time;
       obj1.mSortRank = p0.sortRank;
       obj1.mClientTimestamp = p0.clientTimestamp;
       obj1.mGiftId = p0.giftId;
       obj1.mCount = p0.batchSize;
       obj1.mFromLiveStreamId = p0.fromLiveStreamId;
       obj1.mSlotDisplayDuration = p0.slotDisplayDuration;
       obj1.mStyle = p0.style;
       obj1.mMagicFaceId = p0.magicFaceId;
       obj1.mEffectKey = p0.effectiveKey;
       if (!PatchProxy.applyVoidOneRefs(obj1, obj, p.class, "4")) {
          long l = LiveMagicEffectUtil.a(obj1.mEffectKey, obj1.mGiftId);
          if (g.e(l)) {
             obj1.mMagicFaceId = l;
          }
       }
       obj1.mAnimationDisplayTime = p0.animationDisplayTime;
       obj1.mDisplayAnimation = p0.displayAnimation;
       obj1.mExpTag = p0.exptag;
       obj1.mServerExpTag = p0.serverExpTag;
       obj1.mBroadcastInfo = p0.broadcastInfo;
       obj1.mDisplayBanner = p0.displayBanner;
       obj1.mDisplayGif = p0.displayGif;
       obj1.mGifUrlNew = p0.gifUrlNew;
       obj1.mUseStyleV2 = p0.useStyleV2;
       obj1.mTitleV2 = p0.titleV2;
       obj1.mToken = p0.token;
       obj1.mContainsRedPack = p0.containsRedPack;
       obj1.mRank = p0.rank;
       obj1.mMergeKey = p0.mergeKey;
       return obj1;
    }
    public static QLiveMessage b(GzoneInteractiveCommentNotice p0,int p1,int p2){
       Object obj;
       if (PatchProxy.isSupport(c.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, c.class, "26");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       LiveGzoneInteractiveCommentMessage liveGzoneInt = new LiveGzoneInteractiveCommentMessage(p0.roleType, p0.roleName, p0.roleHeadUrl, p0.commentText, p0.commentColor, p0.commentBgcolorL, p0.commentBgcolorR, p0.displayDurationMs);
       obj.mMessageViewLeftMargin = p1;
       obj.mMessageViewRightMargin = p2;
       obj.mLogId = p0.id;
       return obj;
    }
    public static LiveGiftToAudienceMessage c(LiveStreamMessages$ToAudienceGiftFeed p0){
       LiveGiftToAudienceMessage obj = PatchProxy.applyOneRefs(p0, null, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveGiftToAudienceMessage();
       obj.mGiftReceiverUserInfo = UserInfo.convertFromProto(p0.toUser, 0);
       obj.mGiftId = p0.giftId;
       obj.mId = p0.id;
       obj.mCount = p0.batchSize;
       obj.mTime = p0.time;
       obj.mUser = UserInfo.convertFromProto(p0.fromUser, p0.senderState.assistantType);
       obj.mComboCount = p0.comboCount;
       obj.mRank = p0.rank;
       obj.mMergeKey = p0.mergeKey;
       obj.mExpireDate = p0.expireDuration + d.a();
       obj.mClientTimestamp = p0.clientTimestamp;
       obj.mSortRank = p0.sortRank;
       obj.mIsDrawingGift = false;
       obj.mDisplayDuration = (int)p0.slotDisplayDuration;
       obj.mStarLevel = p0.starLevel;
       obj.mStyleType = p0.styleType;
       LiveStreamMessages$ToAudienceGiftFeed senderState = p0.senderState;
       obj.mLiveAudienceState = senderState;
       obj.mLiveAssistantType = senderState.assistantType;
       obj.mDeviceHash = p0.deviceHash;
       obj.mSlotPos = p0.slotPos;
       obj.mDisplayExtendMillis = p0.displayExtendMillis;
       obj.mIsOpenArrowRedPack = false;
       int[] ointArray = a.a(obj);
       obj.mNewGiftSlotStyle = ointArray[0];
       obj.mDisplayDuration = ointArray[1];
       obj.mEffectKey = p0.effectiveKey;
       obj.mGiftFeedEffectInfo = p0.effectiveInfo;
       obj.mMagicFaceId = p0.magicFaceId;
       obj.mLogId = p0.id;
       p.d(obj);
       return obj;
    }
    public static CommentMessage d(LiveStreamMessages$CommentFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new CommentMessage().setLandscapeFontColor(p0.landscapeFontColor).setUnsupportedGzoneEmotions(p0.lockedEmotion).setCommentId(p0.commentId).setId(p0.id).setContent(p0.content).setUser(UserInfo.convertFromProto(p0.user, p0.liveAssistantType)).setTime(p0.time).setSortRank(p0.sortRank).setDeviceHash(p0.deviceHash).setLiveAssistantType(p0.liveAssistantType).setLiveAudienceState(p0.senderState).setAnonymous(p0.isAnonymous).setDisplayWeight(p0.displayWeight).cast();
    }
    public static EnterRoomMessage e(LiveStreamMessages$EnterRoomFeed p0){
       EnterRoomMessage obj = PatchProxy.applyOneRefs(p0, null, c.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new EnterRoomMessage();
       obj.mId = p0.id;
       obj.mTime = p0.time;
       obj.mUser = UserInfo.convertFromProto(p0.user, 0);
       obj.mSource = p0.source;
       obj.mSortRank = p0.sortRank;
       obj.mLiveAssistantType = p0.liveAssistantType;
       LiveStreamMessages$EnterRoomFeed senderState = p0.senderState;
       obj.mLiveAudienceState = senderState;
       obj.mDeviceHash = p0.deviceHash;
       obj.mAudienceDisplayMessage = p0.audienceDisplayMessage;
       obj.mEnterAudienceDisplayMessage = p0.enterAudienceDisplayMessage;
       obj.mAuthorDisplayMessage = p0.authorDisplayMessage;
       obj.mDisplayUserName = p0.displayUserName;
       if (senderState != null) {
          LiveAudienceState liveFansGrou = senderState.liveFansGroupState;
          if (liveFansGrou != null) {
             obj.mFansGroupEnterRoomSpecialEffectType = liveFansGrou.enterRoomSpecialEffect;
          }
       }
       obj.setAnonymous(p0.isAnonymous);
       obj.mLogId = p0.id;
       return obj;
    }
    public static GiftMessage f(LiveStreamMessages$GiftFeed p0){
       UserInfo userInfo = null;
       GiftMessage obj = PatchProxy.applyOneRefs(p0, userInfo, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new GiftMessage();
       obj.mGiftId = p0.giftId;
       obj.mId = p0.id;
       obj.mCount = p0.batchSize;
       obj.mTime = p0.time;
       obj.mUser = UserInfo.convertFromProto(p0.user, p0.liveAssistantType);
       LiveStreamMessages$GiftFeed author = p0.author;
       int i = 0;
       if (author != null) {
          userInfo = UserInfo.convertFromProto(author, i);
       }
       obj.mAnchorUser = userInfo;
       obj.mComboCount = p0.comboCount;
       obj.mRank = p0.rank;
       obj.mMergeKey = p0.mergeKey;
       obj.mExpireDate = p0.expireDuration + d.a();
       obj.mClientTimestamp = p0.clientTimestamp;
       obj.mSortRank = p0.sortRank;
       obj.mIsDrawingGift = p0.isDrawingGift;
       LiveStreamMessages$GiftFeed slotDisplayD = p0.slotDisplayDuration;
       obj.mDisplayDuration = (int)slotDisplayD;
       obj.mAnimationDisplayTime = slotDisplayD;
       obj.mStarLevel = p0.starLevel;
       obj.mSubStarLevel = p0.subStarLevel;
       obj.mStyleType = p0.styleType;
       obj.mLiveAssistantType = p0.liveAssistantType;
       obj.mDeviceHash = p0.deviceHash;
       obj.mSlotPos = p0.slotPos;
       obj.mDisplayExtendMillis = p0.displayExtendMillis;
       obj.mIsOpenArrowRedPack = p0.isOpenArrowRedPack;
       obj.mLiveAudienceState = p0.senderState;
       obj.mType = p0.giftType;
       obj.mIsStreamMergingGift = p0.combineStream;
       obj.mShouldOnlyDisplayInSlot = p0.onlyDisplayInSlot;
       int[] ointArray = a.a(obj);
       obj.mNewGiftSlotStyle = ointArray[i];
       obj.mDisplayDuration = ointArray[1];
       obj.setAnonymous(p0.isAnonymous);
       obj.mGiftFeedEffectInfo = p0.effectiveInfo;
       obj.mMagicFaceId = p0.magicFaceId;
       obj.mEffectKey = p0.effectiveKey;
       obj.mLogId = p0.id;
       p.d(obj);
       if ((int)p0.changeVoiceTypeId == 1) {
          i = 1;
       }
       obj.mMagicGiftAudioEffectType = i;
       if ((p0.giftType & 0x800000) > 0) {
          obj.mGiftFeedSerializableData = MessageNano.toByteArray(p0);
       }
       obj.mIsNaming = p0.giftNaming;
       return obj;
    }
    public static LikeMessage g(LiveStreamMessages$LikeFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LikeMessage().setId(p0.id).setUser(UserInfo.convertFromProto(p0.user, p0.liveAssistantType)).setTime(p0.time).setSortRank(p0.sortRank).setDeviceHash(p0.deviceHash).setLiveAssistantType(p0.liveAssistantType).setLiveAudienceState(p0.senderState).setAnonymous(p0.isAnonymous).cast();
    }
}
