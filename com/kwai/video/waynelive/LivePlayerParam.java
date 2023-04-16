package com.kwai.video.waynelive.LivePlayerParam;
import com.kwai.video.waynelive.LivePlayerParam$Builder;
import java.lang.Object;
import com.yxcorp.utility.SystemUtil;
import java.lang.String;
import com.yxcorp.utility.TextUtils;
import com.kwai.video.waynelive.LivePlayerParam$1;

public class LivePlayerParam	// class@000dd7
{
    public final String mAnchorId;
    public String mBizExtra;
    public String mBizFt;
    public String mBizType;
    public final boolean mEnableAutoUpdateViewSize;
    public boolean mEnableDummySurface;
    public boolean mEnableLastSelectedQuality;
    public final boolean mEnableMultiSurface;
    public boolean mEnableOesSurface;
    public final boolean mEnableReusePlayerOptimize;
    public final boolean mEnableSmallWindow;
    public final boolean mEnableWebRTCManifest;
    public boolean mForceSystemPlayer;
    public Map mHeaders;
    public final boolean mIsCdnOverload;
    public final boolean mIsForceUseLowestQuality;
    public boolean mIsPreload;
    public boolean mIsVoiceLive;
    public KSLiveVideoContext mKSLiveVideoContext;
    public final String mLiveStreamId;
    public final KwaiPlayerConfig mMediaPlayerConfig;
    public final String mNetworkRetryScene;
    public boolean mPaidLive;
    public boolean mPrivateLive;
    public final JSONObject mQosJson;
    public final QosMonitorConfig mQosMonitorConfig;
    public final boolean mShouldUseHardwareDecoding;
    public final boolean mUseMediaCodecSurfaceView;
    public final int mUseSurfaceView;
    public final int mViewHeight;
    public final int mViewWidth;
    public final String mWebRTCConfig;

    public void LivePlayerParam(LivePlayerParam$Builder p0){
       super();
       this.mQosMonitorConfig = p0.mQosMonitorConfig;
       this.mMediaPlayerConfig = p0.mMediaPlayerConfig;
       this.mShouldUseHardwareDecoding = p0.mShouldUseHardwareDecoding;
       boolean b = (p0.mEnableReusePlayerOptimize != null && SystemUtil.a(23))? true: false;
       this.mEnableReusePlayerOptimize = b;
       this.mUseMediaCodecSurfaceView = p0.mUseMediaCodecSurfaceView;
       this.mEnableSmallWindow = p0.mEnableSmallWindow;
       this.mIsCdnOverload = p0.mIsCdnOverload;
       this.mLiveStreamId = p0.mLiveStreamId;
       this.mEnableWebRTCManifest = p0.mEnableWebRTCManifest;
       this.mWebRTCConfig = p0.mWebRTCConfig;
       this.mPrivateLive = p0.mPrivateLive;
       this.mPaidLive = p0.mPaidLive;
       this.mQosJson = p0.mQosJson;
       this.mEnableLastSelectedQuality = p0.mEnableLastSelectedQuality;
       this.mEnableMultiSurface = p0.mEnableMultiSurface;
       this.mIsForceUseLowestQuality = p0.mIsForceUseLowestQuality;
       this.mEnableAutoUpdateViewSize = p0.mEnableAutoUpdateViewSize;
       this.mViewWidth = p0.mViewWidth;
       this.mViewHeight = p0.mViewHeight;
       this.mAnchorId = TextUtils.k(p0.mAnchorId);
       this.mUseSurfaceView = p0.mUseSurfaceView;
       this.mNetworkRetryScene = p0.mNetworkRetryScene;
       this.mIsPreload = p0.mIsPreload;
       this.mIsVoiceLive = p0.mIsVoiceLive;
       this.mKSLiveVideoContext = p0.mKSLiveVideoContext;
       this.mHeaders = p0.mHeaders;
       this.mForceSystemPlayer = p0.mForceSystemPlayer;
       this.mEnableDummySurface = p0.mEnableDummySurface;
       this.mEnableOesSurface = p0.mEnableOesSurface;
       this.mBizFt = p0.mBizFt;
       this.mBizType = p0.mBizType;
       this.mBizExtra = p0.mBizExtra;
       return;
    }
    public void LivePlayerParam(LivePlayerParam$Builder p0,LivePlayerParam$1 p1){
       super(p0);
    }
}
