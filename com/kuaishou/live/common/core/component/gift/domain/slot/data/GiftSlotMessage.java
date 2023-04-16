package com.kuaishou.live.common.core.component.gift.domain.slot.data.GiftSlotMessage;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class GiftSlotMessage extends QLiveMessage	// class@001262
{
    public UserInfo mAnchorUser;
    public long mAnimationDisplayTime;
    public long mClientTimestamp;
    public int mComboCount;
    public int mCount;
    public int mDisplayDuration;
    public long mDisplayExtendMillis;
    public DrawingGift mDrawingGift;
    public long mExpireDate;
    public Gift mGift;
    public int mGiftId;
    public CDNUrl[] mGiftSlotSelfAvatarRingDynamicImageUrls;
    public CDNUrl[] mGiftSlotSelfAvatarRingImageUrls;
    public boolean mIsDrawingGift;
    public boolean mIsStreamMergingGift;
    public long mMagicFaceId;
    public String mMergeKey;
    public int mNewGiftSlotStyle;
    public int mRank;
    public int mSlotPos;
    public int mStarLevel;
    public int mStyleType;
    public int mSubStarLevel;
    public LiveSendGiftBaseTraceInfo traceInfo;
    public static final long serialVersionUID = 0x3ce95899e6ae76e6;

    public void GiftSlotMessage(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GiftSlotMessage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GiftMessage{mValue=\'"+this.mId+'''+", mUser="+this.mUser+", mTime="+this.mTime+", mGiftId="+this.mGiftId+", mMagicFaceId="+this.mMagicFaceId+", mCount="+this.mCount+", mDisplayDuration="+this.mDisplayDuration+", mComboCount="+this.mComboCount+", mRank="+this.mRank+", mMagicFaceId="+this.mMagicFaceId+", mMergeKey=\'"+this.mMergeKey+'''+", mExpireDate="+this.mExpireDate+", mClientTimestamp="+this.mClientTimestamp+", mIsDrawingGift="+this.mIsDrawingGift+", mDeviceHash="+this.mDeviceHash+", mSlptPos="+this.mSlotPos+'}';
    }
}
