package gm1.a;
import java.lang.Object;
import com.kuaishou.live.core.show.gift.GiftMessage;
import com.kuaishou.live.common.core.component.gift.domain.slot.data.GiftSlotMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.live.effect.resource.download.common.e;
import cm1.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCFeedPush;
import gm1.d;
import java.util.List;
import gm1.a$a;
import java.util.Comparator;
import java.util.Collections;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$GiftFeed;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kwai.framework.model.user.UserInfo;
import yb6.d;
import wj1.a;
import sz2.g;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Long;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import com.kuaishou.live.common.core.component.gift.data.message.BroadcastGiftMessage;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$BroadcastGiftFeed;

public class a	// class@00251a
{
    public long a;

    public void a(){
       super();
       this.a = 0;
       this.a = 0x3ffff;
    }
    public static GiftSlotMessage a(GiftMessage p0){
       GiftSlotMessage obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new GiftSlotMessage();
       obj.mGiftId = p0.mGiftId;
       obj.mId = p0.mId;
       obj.mCount = p0.mCount;
       obj.mTime = p0.mTime;
       obj.mUser = p0.mUser;
       obj.mAnchorUser = p0.mAnchorUser;
       obj.mComboCount = p0.mComboCount;
       obj.mRank = p0.mRank;
       obj.mMergeKey = p0.mMergeKey;
       obj.mExpireDate = p0.mExpireDate;
       obj.mClientTimestamp = p0.mClientTimestamp;
       obj.mSortRank = p0.mSortRank;
       obj.mIsDrawingGift = p0.mIsDrawingGift;
       obj.mDisplayDuration = p0.mDisplayDuration;
       obj.mAnimationDisplayTime = p0.mAnimationDisplayTime;
       obj.mStarLevel = p0.mStarLevel;
       obj.mSubStarLevel = p0.mSubStarLevel;
       obj.mStyleType = p0.mStyleType;
       obj.mLiveAssistantType = p0.mLiveAssistantType;
       obj.mDeviceHash = p0.mDeviceHash;
       obj.mSlotPos = p0.mSlotPos;
       obj.mDisplayExtendMillis = p0.mDisplayExtendMillis;
       obj.mLiveAudienceState = p0.mLiveAudienceState;
       obj.mIsStreamMergingGift = p0.mIsStreamMergingGift;
       obj.mNewGiftSlotStyle = p0.mNewGiftSlotStyle;
       obj.mGiftSlotSelfAvatarRingImageUrls = p0.mGiftSlotSelfAvatarRingImageUrls;
       obj.mGiftSlotSelfAvatarRingDynamicImageUrls = p0.mGiftSlotSelfAvatarRingDynamicImageUrls;
       obj.mIsAnonymous = p0.mIsAnonymous;
       return obj;
    }
    public static long c(String p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoa, "8");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       long l = e.b().C1(p0);
       if (!l && p1 > 0) {
          l = a.d(p1);
       }
       return l;
    }
    public d b(LiveStreamMessages$SCFeedPush p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       d uod = this.e(p0);
       Collections.sort(uod.a(), new a$a(this));
       return uod;
    }
    public boolean d(int p0){
       boolean b = ((this.a & (1 << p0)) > 0)? true: false;
       return b;
    }
    public final d e(LiveStreamMessages$SCFeedPush p0){
       int len;
       LiveStreamMessages$GiftFeed giftFeed;
       Object obj = this;
       LiveStreamMessages$SCFeedPush obj1 = p0;
       d obj2 = PatchProxy.applyOneRefs(obj1, obj, a.class, "3");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       obj2 = new d();
       if (obj1.giftFeeds != null && obj.d(4)) {
          LiveStreamMessages$SCFeedPush giftFeeds = obj1.giftFeeds;
          len = giftFeeds.length;
          for (int i = 0; i < len; i = i + 1) {
             object oobject = giftFeeds[i];
             GiftMessage giftMessage = PatchProxy.applyOneRefs(oobject, null, a.class, "5");
             if (giftMessage != PatchProxyResult.class) {
                giftFeed = null;
             }else {
                giftMessage = new GiftMessage();
                giftMessage.mGiftId = oobject.giftId;
                giftMessage.mId = oobject.id;
                giftMessage.mCount = oobject.batchSize;
                giftMessage.mTime = oobject.time;
                giftMessage.mUser = UserInfo.convertFromProto(oobject.user, oobject.liveAssistantType);
                giftFeed = oobject.author;
                UserInfo userInfo = (giftFeed == null)? null: UserInfo.convertFromProto(giftFeed, 0);
                giftMessage.mAnchorUser = userInfo;
                giftMessage.mComboCount = oobject.comboCount;
                giftMessage.mRank = oobject.rank;
                giftMessage.mMergeKey = oobject.mergeKey;
                long l = oobject.expireDuration + d.a();
                giftMessage.mExpireDate = l;
                giftMessage.mClientTimestamp = oobject.clientTimestamp;
                giftMessage.mSortRank = oobject.sortRank;
                giftMessage.mIsDrawingGift = oobject.isDrawingGift;
                giftFeed = oobject.slotDisplayDuration;
                giftMessage.mDisplayDuration = (int)giftFeed;
                giftMessage.mAnimationDisplayTime = giftFeed;
                giftMessage.mStarLevel = oobject.starLevel;
                giftMessage.mSubStarLevel = oobject.subStarLevel;
                giftMessage.mStyleType = oobject.styleType;
                giftMessage.mLiveAssistantType = oobject.liveAssistantType;
                giftMessage.mDeviceHash = oobject.deviceHash;
                giftMessage.mSlotPos = oobject.slotPos;
                giftMessage.mDisplayExtendMillis = oobject.displayExtendMillis;
                giftMessage.mIsOpenArrowRedPack = oobject.isOpenArrowRedPack;
                giftMessage.mLiveAudienceState = oobject.senderState;
                giftMessage.mType = oobject.giftType;
                giftMessage.mIsStreamMergingGift = oobject.combineStream;
                giftMessage.mShouldOnlyDisplayInSlot = oobject.onlyDisplayInSlot;
                int[] ointArray = a.a(giftMessage);
                giftMessage.mNewGiftSlotStyle = ointArray[0];
                int i1 = 1;
                giftMessage.mDisplayDuration = ointArray[i1];
                giftMessage.setAnonymous(oobject.isAnonymous);
                giftMessage.mGiftFeedEffectInfo = oobject.effectiveInfo;
                giftMessage.mMagicFaceId = oobject.magicFaceId;
                giftMessage.mEffectKey = oobject.effectiveKey;
                giftMessage.mLogId = oobject.id;
                if (!PatchProxy.applyVoidOneRefs(giftMessage, null, a.class, "6")) {
                   l = a.c(giftMessage.mEffectKey, giftMessage.mGiftId);
                   if (g.e(l)) {
                      giftMessage.mMagicFaceId = l;
                   }
                }
                if ((int)oobject.changeVoiceTypeId != i1) {
                   i1 = 0;
                }
                giftMessage.mMagicGiftAudioEffectType = i1;
                long l1 = oobject.giftType & 0x800000;
                giftFeed = null;
                if (l1 - giftFeed > 0) {
                   giftMessage.mGiftFeedSerializableData = MessageNano.toByteArray(oobject);
                }
             }
             GiftMessage mMagicFaceId = giftMessage.mMagicFaceId;
             if (mMagicFaceId - giftFeed) {
                b.a0(LiveLogTag.MAGIC_GIFT, "fromProtoMessage", c.j("MagicFaceId", Long.valueOf(mMagicFaceId)));
             }
             obj2.a().add(giftMessage);
          }
       }
       if (obj1.broadcastGiftFeed != null && obj.d(8)) {
          obj1 = obj1.broadcastGiftFeed;
          int len1 = obj1.length;
          for (len = 0; len < len1; len = len + 1) {
             object oobject1 = obj1[len];
             BroadcastGiftMessage uBroadcastGi = PatchProxy.applyOneRefs(oobject1, null, a.class, "4");
             if (uBroadcastGi != PatchProxyResult.class) {
             }else {
                uBroadcastGi = new BroadcastGiftMessage();
                uBroadcastGi.mId = oobject1.id;
                uBroadcastGi.mFromUser = UserInfo.convertFromProto(oobject1.fromUser, 0);
                uBroadcastGi.mToUser = UserInfo.convertFromProto(oobject1.toUser, 0);
                uBroadcastGi.mUser = UserInfo.convertFromProto(oobject1.fromUser, oobject1.liveAssistantType);
                uBroadcastGi.mTime = oobject1.time;
                uBroadcastGi.mSortRank = oobject1.sortRank;
                uBroadcastGi.mClientTimestamp = oobject1.clientTimestamp;
                uBroadcastGi.mGiftId = oobject1.giftId;
                uBroadcastGi.mCount = oobject1.batchSize;
                uBroadcastGi.mFromLiveStreamId = oobject1.fromLiveStreamId;
                uBroadcastGi.mSlotDisplayDuration = oobject1.slotDisplayDuration;
                uBroadcastGi.mStyle = oobject1.style;
                uBroadcastGi.mMagicFaceId = oobject1.magicFaceId;
                uBroadcastGi.mEffectKey = oobject1.effectiveKey;
                if (!PatchProxy.applyVoidOneRefs(uBroadcastGi, null, a.class, "7")) {
                   long l2 = a.c(uBroadcastGi.mEffectKey, uBroadcastGi.mGiftId);
                   if (g.e(l2)) {
                      uBroadcastGi.mMagicFaceId = l2;
                   }
                }
                uBroadcastGi.mAnimationDisplayTime = oobject1.animationDisplayTime;
                uBroadcastGi.mDisplayAnimation = oobject1.displayAnimation;
                uBroadcastGi.mExpTag = oobject1.exptag;
                uBroadcastGi.mServerExpTag = oobject1.serverExpTag;
                uBroadcastGi.mBroadcastInfo = oobject1.broadcastInfo;
                uBroadcastGi.mDisplayBanner = oobject1.displayBanner;
                uBroadcastGi.mDisplayGif = oobject1.displayGif;
                uBroadcastGi.mGifUrlNew = oobject1.gifUrlNew;
                uBroadcastGi.mUseStyleV2 = oobject1.useStyleV2;
                uBroadcastGi.mTitleV2 = oobject1.titleV2;
                uBroadcastGi.mToken = oobject1.token;
                uBroadcastGi.mContainsRedPack = oobject1.containsRedPack;
                uBroadcastGi.mRank = oobject1.rank;
                uBroadcastGi.mMergeKey = oobject1.mergeKey;
             }
             obj2.a().add(uBroadcastGi);
          }
       }
       return obj2;
    }
}
