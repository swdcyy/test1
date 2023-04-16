package com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAdInfo;
import java.io.Serializable;
import java.lang.Object;

public class PhotoAdvertisement$InspireAdInfo implements Serializable	// class@000965
{
    public int mAdNeoTkControl;
    public long mCacheExpireMin;
    public boolean mDisableAvatarFollow;
    public boolean mEnableClickOtherArea;
    public boolean mHasReserved;
    public PhotoAdvertisement$InspireAction mInspireAction;
    public long mInspireAdBillTime;
    public PhotoAdvertisement$InterceptInfo mInterceptInfo;
    public String mLiveStartTime;
    public String mNeoParams;
    public PhotoAdvertisement$NeoReportInfo mNeoReportInfo;
    public int mPendantScene;
    public int mProcessActionType;
    public PhotoAdvertisement$RewardEndInfo mRewardEndInfo;
    public int mSocialControl;
    public int mSourceType;
    public boolean mSupportLiveReservation;
    public boolean mVideoLoop;
    public static final long serialVersionUID = 0xeec7d21bf2a3cb50;

    public void PhotoAdvertisement$InspireAdInfo(){
       super();
       this.mPendantScene = 0;
       this.mProcessActionType = 0;
    }
}
