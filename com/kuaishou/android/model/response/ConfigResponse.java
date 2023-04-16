package com.kuaishou.android.model.response.ConfigResponse;
import java.io.Serializable;
import doc.a;
import java.lang.Object;
import com.kuaishou.android.model.response.LiveRetryConfig;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import java.io.File;
import java.lang.Number;

public class ConfigResponse implements Serializable, a	// class@000e93
{
    public boolean mAllowBaiduPlusErised;
    public boolean mAutoOriginNameOn;
    public int mBufferTimeSizeMs;
    public String mDeNoiseMode;
    public String mDefaultResource;
    public float mDetailLoadingABTestProbability;
    public String mDirtylensResource;
    public String mEffectResource;
    public String mEmojiResource;
    public String mEmojiTTFResource;
    public String mFaceMagicEffectResource;
    public String mFilterResource;
    public String mGlassesResource;
    public String mHiaiMagicEmojiResource;
    public String mHuaweiHiai;
    public String mKbarMmuModel;
    public String mLiveLowDelayConfig;
    public LiveRetryConfig mLiveRetryConfig;
    public String mMagicFingerResource;
    public String mMessageEmojiResource;
    public String mMusicianPlanLogoUrl;
    public boolean mOriginNameOn;
    public String mScreencastPatch;
    public List mSecurityAppPackageNames;
    public int mSessionTimeoutDuration;
    public String mSplashGameResource;
    public String mStickerResource;
    public String mStoryStickerResource;
    public String mTextResource;
    public String mThemeResource;
    public long mUploadContactsInterval;
    public float mUploadContactsPercentage;
    public List mUrlPrefixes;
    public String mVoiceDetectMode;
    public static final long serialVersionUID = 0xcfe190be6ca89d41;

    public void ConfigResponse(){
       super();
       this.mOriginNameOn = false;
       this.mAutoOriginNameOn = false;
       this.mUploadContactsInterval = -1;
       this.mUploadContactsPercentage = 0;
       this.mAllowBaiduPlusErised = false;
       this.mSessionTimeoutDuration = 0x7530;
       this.mBufferTimeSizeMs = 7000;
       this.mLiveRetryConfig = new LiveRetryConfig();
    }
    public String addCdnPrefix(String p0,int p1){
       if (PatchProxy.isSupport(ConfigResponse.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, ConfigResponse.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 > this.mUrlPrefixes.size() || TextUtils.isEmpty(p0)) {
          return "";
       }else {
          return this.mUrlPrefixes.get(p1)+File.separator+p0;
       }
    }
    public int getCdnCount(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, ConfigResponse.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.intValue();
       }
       ConfigResponse tmUrlPrefixe = this.mUrlPrefixes;
       int i = 0;
       if (tmUrlPrefixe == null) {
          return i;
       }
       if (tmUrlPrefixe != null) {
          i = tmUrlPrefixe.size();
       }
       return i;
    }
    public String getDownloadUrlSuffix(String p0,int p1){
       return "";
    }
}
