package com.kuaishou.live.common.core.component.gift.data.message.BroadcastGiftMessage;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.Arrays;

public class BroadcastGiftMessage extends QLiveMessage	// class@001161
{
    public long mAnimationDisplayTime;
    public String mBroadcastInfo;
    public long mClientTimestamp;
    public boolean mContainsRedPack;
    public int mCount;
    public boolean mDisplayAnimation;
    public boolean mDisplayBanner;
    public boolean mDisplayGif;
    public String mEffectKey;
    public String mExpTag;
    public String mFromLiveStreamId;
    public UserInfo mFromUser;
    public String[] mGifUrlNew;
    public int mGiftId;
    public long mMagicFaceId;
    public String mMergeKey;
    public int mRank;
    public String mServerExpTag;
    public long mSlotDisplayDuration;
    public int mStyle;
    public String mTitleV2;
    public UserInfo mToUser;
    public String mToken;
    public boolean mUseStyleV2;
    public static final long serialVersionUID = 0x38a10790f74b0daf;

    public void BroadcastGiftMessage(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, BroadcastGiftMessage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "BroadcastGiftMessage{mValue=\'"+this.mId+'''+", mFromUser="+this.mFromUser+", mGiftReceiverUserInfo="+this.mToUser+", mTime="+this.mTime+", mGiftId="+this.mGiftId+", mCount="+this.mCount+", mFromLiveStreamId=\'"+this.mFromLiveStreamId+'''+", mSortRank="+this.mSortRank+", mClientTimestamp="+this.mClientTimestamp+", mSlotDisplayDuration="+this.mSlotDisplayDuration+", mMagicFaceId="+this.mMagicFaceId+", mAnimationDisplayTime="+this.mAnimationDisplayTime+", mDisiplayAnimation="+this.mDisplayAnimation+", mDisplayBanner="+this.mDisplayBanner+", mStyle="+this.mStyle+", mLiveAssistantType="+this.mLiveAssistantType+", mExpTag=\'"+this.mExpTag+'''+", mServerExpTag="+this.mServerExpTag+'''+", mBroadcastInfo=\'"+this.mBroadcastInfo+'''+", mDisplayGift ="+this.mDisplayGif+"\', mGiftUrlNew ="+Arrays.toString(this.mGifUrlNew)+"\', mToken ="+this.mToken+"\', mContainsRedPack ="+this.mContainsRedPack+"\'"+'}';
    }
}
