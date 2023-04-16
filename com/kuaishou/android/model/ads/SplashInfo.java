package com.kuaishou.android.model.ads.SplashInfo;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class SplashInfo implements Serializable, Cloneable	// class@000ac4
{
    public SplashInfo$SplashActionBarInfo mActionBarInfo;
    public SplashInfo$AnimationInfo mAnimationInfo;
    public boolean mAudioButtonVisible;
    public String mBindAdToLiveStreamIds;
    public SplashInfo$BubbleInfo mBubbleInfo;
    public String mCallBackStr;
    public String mChargeInfo;
    public boolean mClearMaterialAfterImpression;
    public SplashInfo$ClickButtonInfo mClickButtonInfo;
    public String mCoinToken;
    public boolean mEnablePhotoBackupImage;
    public boolean mEnableStayWhenVideoFinish;
    public FallingEggsInfo mFallingEggsInfo;
    public SplashInfo$FloatingCardInfo mFloatingCardInfo;
    public boolean mForceDownloadMaterial;
    public String[] mImageUrls;
    public SplashInfo$InteractionInfo mInteractionInfo;
    public boolean mIsBirthday;
    public boolean mIsFakeSplash;
    public boolean mIsLandscape;
    public boolean mIsRealTimePic;
    public SplashInfo$SplashLableInfo mLabelInfo;
    public String mLiveStreamIds;
    public SplashInfo$SplashLocalRecordInfo mLocalRecordedInfo;
    public int mMaterialHeight;
    public int mMaterialWidth;
    public String mPersonalText;
    public SplashInfo$SplashPlayableInfo mPlayableInfo;
    public int mPreloadDurMs;
    public SplashInfo$SplashPreloadInfo mPreloadInfo;
    public String mPreloadLlsid;
    public long mPreviewEndTime;
    public int mPreviewMaterialType;
    public String mRealtimeInfo;
    public String mServerExpTag;
    public SplashInfo$ShadowInfo mShadowInfo;
    public String mSharePrefixDesc;
    public String mShareSuffixDesc;
    public boolean mShowAvatarIcon;
    public boolean mShowInformation;
    public boolean mShowLiveIcon;
    public SplashInfo$SplashSkipInfo mSkipInfo;
    public int mSplashAdDisplayStyle;
    public int mSplashAdDuration;
    public String mSplashAdFeedActionBarContent;
    public int mSplashAdMaterialType;
    public int mSplashAdType;
    public SplashBaseInfo mSplashBaseInfo;
    public PhotoAdvertisement$ItemClickUrl mSplashClickUrlInfo;
    public int mSplashInformationType;
    public SplashInfo$SplashLogoInfo mSplashLogoInfo;
    public int mSplashMaterialDisplayType;
    public int mSplashShowControl;
    public String mSplashTouchControl;
    public int mToLiveType;
    public boolean mforceDisplayNormalSplashForEyemax;
    public static int ROTATE_DEGREE_DEFAULT = 45;
    public static final long serialVersionUID = 0xe8d2a64a5c187c44;

    public void SplashInfo(){
       super();
       this.mSplashAdDisplayStyle = 1;
    }
    public Object clone(){
       Object obj = PatchProxy.apply(null, this, SplashInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return super.clone();
       }catch(java.lang.Exception e0){
          return new SplashInfo();
       }
    }
}
