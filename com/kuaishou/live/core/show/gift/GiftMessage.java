package com.kuaishou.live.core.show.gift.GiftMessage;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kuaishou.live.core.show.gift.DrawingGift;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.framework.model.user.UserInfo;
import lu7.f;
import java.lang.System;
import java.util.List;
import com.kuaishou.live.core.show.gift.DrawingGift$Point;
import java.lang.StringBuilder;
import yb6.d;
import java.lang.Long;
import com.yxcorp.gifshow.models.Gift;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import o56.a;
import s00.b$b;
import s00.b;
import com.google.common.primitives.Ints;

public class GiftMessage extends QLiveMessage	// class@000bb4
{
    public UserInfo mAnchorUser;
    public long mAnimationDisplayTime;
    public long mClientTimestamp;
    public int mComboCount;
    public int mComboKey;
    public int mCount;
    public List mCustomImageList;
    public int mDisplayDuration;
    public long mDisplayExtendMillis;
    public DrawingGift mDrawingGift;
    public String mEffectKey;
    public long mExpireDate;
    public LiveStreamMessages$GiftFeedEffectiveInfo mGiftFeedEffectInfo;
    public byte[] mGiftFeedSerializableData;
    public int mGiftId;
    public CDNUrl[] mGiftSlotSelfAvatarRingDynamicImageUrls;
    public CDNUrl[] mGiftSlotSelfAvatarRingImageUrls;
    public boolean mIsDrawingGift;
    public boolean mIsFromBroadCastGiftMessage;
    public boolean mIsNaming;
    public boolean mIsOpenArrowRedPack;
    public boolean mIsStreamMergingGift;
    public boolean mIsWishListGift;
    public long mMagicFaceId;
    public int mMagicGiftAudioEffectType;
    public String mMergeKey;
    public int mNewGiftSlotStyle;
    public int mRank;
    public boolean mShouldDisplayFriendTagInGiftSlot;
    public boolean mShouldOnlyDisplayInSlot;
    public int mSlotPos;
    public int mStarLevel;
    public int mStyleType;
    public int mSubStarLevel;
    public long mType;
    public static String b = "";
    public static final long serialVersionUID = 0x9721601a6eb7e8e8;

    public void GiftMessage(){
       super();
    }
    public static GiftMessage createSelfDrawingGiftMessage(DrawingGift p0,int p1){
       GiftMessage obj;
       if (PatchProxy.isSupport(GiftMessage.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, GiftMessage.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new GiftMessage();
       obj.mId = "";
       obj.mUser = f.p(QCurrentUser.ME);
       obj.mTime = System.currentTimeMillis();
       obj.mRank = Integer.MAX_VALUE;
       obj.mCount = 1;
       DrawingGift mPoints = p0.mPoints;
       obj.mMergeKey = "drawing_message_"+p1;
       obj.mGiftId = mPoints.get((mPoints.size() - 1)).mGiftId;
       obj.mExpireDate = d.a() + 0x413b380;
       obj.mDrawingGift = p0;
       obj.mIsDrawingGift = true;
       obj.mDisplayDuration = 3000;
       obj.mDeviceHash = GiftMessage.getDeviceHash();
       obj.mSlotPos = 2;
       return obj;
    }
    public static GiftMessage createSelfGiftMessage(int p0,long p1,int p2,int p3,int p4){
       GiftMessage obj;
       int i = 1;
       int i1 = 2;
       if (PatchProxy.isSupport(GiftMessage.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Long.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          obj = PatchProxy.apply(objArray, null, GiftMessage.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new GiftMessage();
       obj.mGiftId = p0;
       obj.mId = "";
       obj.mCount = p2;
       obj.mTime = System.currentTimeMillis();
       obj.mUser = f.p(QCurrentUser.ME);
       obj.mComboCount = p3;
       obj.mRank = Integer.MAX_VALUE;
       obj.mMergeKey = "self_message-"+p4;
       obj.mExpireDate = d.a() + 0x413b380;
       obj.mDisplayDuration = 3000;
       obj.mDeviceHash = GiftMessage.getDeviceHash();
       obj.mSlotPos = i1;
       obj.mComboKey = p4;
       if ((p1 & 64) - 64) {
          i = false;
       }
       obj.mIsOpenArrowRedPack = i;
       obj.mType = p1;
       return obj;
    }
    public static GiftMessage createSelfGiftMessage(Gift p0,int p1){
       if (PatchProxy.isSupport(GiftMessage.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, GiftMessage.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return GiftMessage.createSelfGiftMessage(p0.mId, p0.mGiftType, p1, 0, 0);
    }
    public static String getDeviceHash(){
       String obj = PatchProxy.apply(null, null, GiftMessage.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(GiftMessage.b) || TextUtils.x(a.a)) {
          return GiftMessage.b;
       }
       obj = b.b().a(Ints.f((a.a).hashCode()));
       GiftMessage.b = obj;
       return obj;
    }
    public UserInfo getGiftReceiverUserInfo(){
       return this.mAnchorUser;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GiftMessage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GiftMessage{mValue=\'"+this.mId+'''+", mUser="+this.mUser+", mTime="+this.mTime+", mGiftId="+this.mGiftId+", mMagicFaceId="+this.mMagicFaceId+", mCount="+this.mCount+", mDisplayDuration="+this.mDisplayDuration+", mComboCount="+this.mComboCount+", mRank="+this.mRank+", mMagicFaceId="+this.mMagicFaceId+", mMergeKey=\'"+this.mMergeKey+'''+", mExpireDate="+this.mExpireDate+", mClientTimestamp="+this.mClientTimestamp+", mIsDrawingGift="+this.mIsDrawingGift+", mDeviceHash="+this.mDeviceHash+", mSlptPos="+this.mSlotPos+", mIsOpenArrowRedPack="+this.mIsOpenArrowRedPack+", isWishListGift="+this.mIsWishListGift+", mIsNaming="+this.mIsNaming+'}';
    }
}
