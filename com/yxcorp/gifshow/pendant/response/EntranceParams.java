package com.yxcorp.gifshow.pendant.response.EntranceParams;
import com.yxcorp.gifshow.pendant.response.PendantSharedParams;
import com.yxcorp.gifshow.pendant.response.EntranceParams$PendantConfig;

public class EntranceParams extends PendantSharedParams	// class@001274
{
    public boolean isFormTkError;
    public EntranceParams$PendantConfig mAdsorptionConfig;
    public boolean mAnimationHold;
    public Map mBubbleConfigs;
    public Map mBubbleTitles;
    public boolean mClickNeedCheckLogin;
    public int mDisappearPolicy;
    public int mDisplayStyle;
    public int mEffectPolicy;
    public boolean mEnableXinHuiCashIncentive;
    public long mEndTime;
    public boolean mIsFromKeyConfig;
    public String mKsOrderId;
    public String mLinkUrl;
    public int mMaxCloseCount;
    public boolean mNeedReportWhenClose;
    public boolean mOnlyTk;
    public int[] mPages;
    public String[] mPages2;
    public String mPendantId;
    public int mPendantType;
    public String mReportId;
    public long mStartTime;
    public boolean mSupportDemote;
    public EntranceParams$PendantConfig mSuspensionConfig;
    public String mTkBundleId;
    public String mTkExtraParams;
    public WatchVideoStyle mWatchVideoStyle;
    public static final long serialVersionUID = 0xf89ed5656fc2eb85;

    public void EntranceParams(){
       super();
       this.mMaxCloseCount = 3;
    }
    public long getAdsorptionMillis(){
       EntranceParams tmSuspension = this.mSuspensionConfig;
       if (tmSuspension == null) {
          return 0;
       }
       return ((long)tmSuspension.mSuspensionSeconds * 1000);
    }
    public boolean isColdStartAppear(){
       boolean b = (this.mDisappearPolicy == 3)? true: false;
       return b;
    }
    public boolean isLoginEffect(){
       boolean b = true;
       if (this.mEffectPolicy == b) {
       }else {
          b = false;
       }
       return b;
    }
}
