package com.kwai.video.waynelive.LivePlayerParam$Builder;
import java.lang.Object;
import com.kwai.video.waynelive.LivePlayerParam;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.waynelive.LivePlayerParam$1;
import com.kwai.video.waynelive.qosmoniter.QosMonitorConfig;
import org.json.JSONObject;
import java.util.Map;
import com.kwai.video.waynelive.wayneplayer.logger.KSLiveVideoContext;

public class LivePlayerParam$Builder	// class@000dd6
{
    public String mAnchorId;
    public String mBizExtra;
    public String mBizFt;
    public String mBizType;
    public boolean mEnableAutoUpdateViewSize;
    public boolean mEnableDummySurface;
    public boolean mEnableLastSelectedQuality;
    public boolean mEnableMultiSurface;
    public boolean mEnableOesSurface;
    public boolean mEnableReusePlayerOptimize;
    public boolean mEnableSmallWindow;
    public boolean mEnableWebRTCManifest;
    public boolean mForceSystemPlayer;
    public Map mHeaders;
    public boolean mIsCdnOverload;
    public boolean mIsForceUseLowestQuality;
    public boolean mIsPreload;
    public boolean mIsVoiceLive;
    public KSLiveVideoContext mKSLiveVideoContext;
    public String mLiveStreamId;
    public KwaiPlayerConfig mMediaPlayerConfig;
    public String mNetworkRetryScene;
    public boolean mPaidLive;
    public boolean mPrivateLive;
    public JSONObject mQosJson;
    public QosMonitorConfig mQosMonitorConfig;
    public boolean mShouldUseHardwareDecoding;
    public boolean mUseMediaCodecSurfaceView;
    public int mUseSurfaceView;
    public int mViewHeight;
    public int mViewWidth;
    public String mWebRTCConfig;
    public static int USE_SURFACE_VIEW_STATUS;

    public void LivePlayerParam$Builder(){
       super();
       this.mEnableLastSelectedQuality = true;
       this.mShouldUseHardwareDecoding = false;
       this.mEnableReusePlayerOptimize = false;
       this.mUseMediaCodecSurfaceView = false;
       this.mIsCdnOverload = false;
       this.mEnableSmallWindow = false;
       this.mLiveStreamId = "";
       this.mWebRTCConfig = "";
       this.mPaidLive = false;
       this.mPrivateLive = false;
       this.mEnableMultiSurface = false;
       this.mViewWidth = 0;
       this.mViewHeight = 0;
       this.mUseSurfaceView = LivePlayerParam$Builder.USE_SURFACE_VIEW_STATUS;
    }
    public LivePlayerParam build(){
       Object obj = PatchProxy.apply(null, this, LivePlayerParam$Builder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LivePlayerParam(this, null);
    }
    public LivePlayerParam$Builder enableLastSelectedQuality(boolean p0){
       this.mEnableLastSelectedQuality = p0;
       return this;
    }
    public LivePlayerParam$Builder enableMultiSurface(boolean p0){
       this.mEnableMultiSurface = p0;
       return this;
    }
    public LivePlayerParam$Builder enableReusePlayerOptimize(boolean p0){
       this.mEnableReusePlayerOptimize = p0;
       return this;
    }
    public LivePlayerParam$Builder enableSmallWindow(boolean p0){
       this.mEnableSmallWindow = p0;
       return this;
    }
    public LivePlayerParam$Builder enableWebRTCManifest(boolean p0){
       this.mEnableWebRTCManifest = p0;
       return this;
    }
    public LivePlayerParam$Builder forceUseLowestQuality(boolean p0){
       this.mIsForceUseLowestQuality = p0;
       return this;
    }
    public LivePlayerParam$Builder isCdnOverload(boolean p0){
       this.mIsCdnOverload = p0;
       return this;
    }
    public LivePlayerParam$Builder liveStreamId(String p0){
       this.mLiveStreamId = p0;
       return this;
    }
    public LivePlayerParam$Builder qosMonitorConfig(QosMonitorConfig p0){
       this.mQosMonitorConfig = p0;
       return this;
    }
    public LivePlayerParam$Builder setAnchorId(String p0){
       this.mAnchorId = p0;
       return this;
    }
    public LivePlayerParam$Builder setAppQosStatJson(JSONObject p0){
       this.mQosJson = p0;
       return this;
    }
    public LivePlayerParam$Builder setBizExtra(String p0){
       this.mBizExtra = p0;
       return this;
    }
    public LivePlayerParam$Builder setBizFt(String p0){
       this.mBizFt = p0;
       return this;
    }
    public LivePlayerParam$Builder setBizType(String p0){
       this.mBizType = p0;
       return this;
    }
    public LivePlayerParam$Builder setEnableAutoUpdateViewSize(boolean p0){
       this.mEnableAutoUpdateViewSize = p0;
       return this;
    }
    public LivePlayerParam$Builder setEnableDummySurface(boolean p0){
       this.mEnableDummySurface = p0;
       return this;
    }
    public LivePlayerParam$Builder setEnableOesSurface(boolean p0){
       this.mEnableOesSurface = p0;
       return this;
    }
    public LivePlayerParam$Builder setForceSystemPlayer(boolean p0){
       this.mForceSystemPlayer = p0;
       return this;
    }
    public LivePlayerParam$Builder setHeaders(Map p0){
       this.mHeaders = p0;
       return this;
    }
    public LivePlayerParam$Builder setIsPaidLive(boolean p0){
       this.mPaidLive = p0;
       return this;
    }
    public LivePlayerParam$Builder setIsPreload(boolean p0){
       this.mIsPreload = p0;
       return this;
    }
    public LivePlayerParam$Builder setIsPrivateLive(boolean p0){
       this.mPrivateLive = p0;
       return this;
    }
    public LivePlayerParam$Builder setIsVoiceLive(boolean p0){
       this.mIsVoiceLive = p0;
       return this;
    }
    public LivePlayerParam$Builder setKSLiveVideoContext(KSLiveVideoContext p0){
       this.mKSLiveVideoContext = p0;
       return this;
    }
    public LivePlayerParam$Builder setNetworkRetryScene(String p0){
       this.mNetworkRetryScene = p0;
       return this;
    }
    public LivePlayerParam$Builder setUseMediaCodecSurfaceView(boolean p0){
       this.mUseMediaCodecSurfaceView = p0;
       return this;
    }
    public LivePlayerParam$Builder setViewPixelSize(int p0,int p1){
       this.mViewWidth = p0;
       this.mViewHeight = p1;
       return this;
    }
    public LivePlayerParam$Builder setWebRTCConfig(String p0){
       this.mWebRTCConfig = p0;
       return this;
    }
    public LivePlayerParam$Builder shouldUseHardwareDecoding(boolean p0){
       this.mShouldUseHardwareDecoding = p0;
       return this;
    }
    public LivePlayerParam$Builder useSurfaceView(int p0){
       this.mUseSurfaceView = p0;
       return this;
    }
}
