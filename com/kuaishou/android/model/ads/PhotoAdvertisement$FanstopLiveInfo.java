package com.kuaishou.android.model.ads.PhotoAdvertisement$FanstopLiveInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdGroup;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;

public class PhotoAdvertisement$FanstopLiveInfo implements Serializable	// class@00093d
{
    public PhotoAdvertisement$AdData mAdData;
    public PhotoAdvertisement$AdGroup mAdGroup;
    public PhotoAdvertisement$AutoConversionInfo mAutoConversionInfo;
    public String mCallbackParam;
    public String mChargeInfo;
    public long mCoverId;
    public long mCreativeId;
    public Long mExpireTimestamp;
    public String mExtData;
    public String mFansTopAttributeParams;
    public long mFansTopAwardBonusTime;
    public LiveAdNeoParam mFeedFlowAdNeoParam;
    public boolean mHadEarnFansTopCoin;
    public boolean mHasCountdownReported;
    public String mLlsid;
    public String mMerchantURLParamsStr;
    public long mPageId;
    public String mPhotoPage;
    public String mRequestApiExtData;
    public int mSourceType;
    public long mSubPageId;
    public int mTemplateType;
    public List mTracks;
    public static final long serialVersionUID = 0xe19ff303188d48d0;

    public void PhotoAdvertisement$FanstopLiveInfo(){
       super();
       this.mAdGroup = PhotoAdvertisement$AdGroup.UNKNOWN;
       this.mExtData = "";
       this.mRequestApiExtData = "";
       this.mPhotoPage = "";
       this.mAdData = new PhotoAdvertisement$AdData(true);
       this.mMerchantURLParamsStr = "";
       this.mFeedFlowAdNeoParam = null;
       this.mHasCountdownReported = false;
    }
}
