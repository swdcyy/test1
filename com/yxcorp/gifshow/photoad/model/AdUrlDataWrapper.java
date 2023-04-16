package com.yxcorp.gifshow.photoad.model.AdUrlDataWrapper;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import com.yxcorp.gifshow.commercial.adsdk.model.AdUrlInfo;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.abtest.f;
import mxb.j;
import wkd.b;
import yx.i0;
import tl8.d;
import com.kwai.sdk.switchconfig.a;
import pxb.d;
import erd.g;
import pxb.a;
import tw.f;
import java.util.List;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdApkMd5Info;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppLinkToastInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$JumpLiveInfo;
import tw.j;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import nx8.k;
import kp.r1;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrl;

public class AdUrlDataWrapper implements AdDataWrapper	// class@000f9d
{
    public final AdDataWrapper$AdLogParamAppender mAdLogParamAppender;
    public final AdUrlInfo mAdUrlInfo;
    public final BaseFeed mFeed;
    public static final long serialVersionUID = 0x4022851ada52021f;

    public void AdUrlDataWrapper(AdUrlInfo p0,BaseFeed p1){
       super(p0, p1, null);
    }
    public void AdUrlDataWrapper(AdUrlInfo p0,BaseFeed p1,AdDataWrapper$AdLogParamAppender p2){
       super();
       this.mAdUrlInfo = p0;
       this.mFeed = p1;
       this.mAdLogParamAppender = p2;
    }
    public static void a(AdUrlDataWrapper p0,c p1){
       p0.lambda$getAdLogWrapper$0(p1);
    }
    private void lambda$getAdLogWrapper$0(c p0){
       AdUrlDataWrapper tmAdLogParam = this.mAdLogParamAppender;
       if (tmAdLogParam != null) {
          tmAdLogParam.appendAdLogParam(p0);
       }
       return;
    }
    public boolean enableReplacePkgName(){
       Object obj = PatchProxy.apply(null, this, AdUrlDataWrapper.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.a("isPkgNameOpenOpt");
    }
    public AdDataWrapper$AdLogParamAppender getAdLogParamAppender(){
       return this.mAdLogParamAppender;
    }
    public j getAdLogWrapper(){
       i0 obj = PatchProxy.apply(null, this, AdUrlDataWrapper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(0x1d6683e9);
       j oj = (this.mFeed.get("AD") == null && (this.mAdUrlInfo.mNeedNonAdLogReport != null && a.t().d("isBuildAdLogInBiz", true)))? obj.a(this.mFeed): obj.c(this.mFeed);
       oj.a(new d(this));
       return oj;
    }
    public int getAdPosition(){
       return a.c(this);
    }
    public String getApkFileName(){
       Object obj = PatchProxy.apply(null, this, AdUrlDataWrapper.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return f.d(this.mAdUrlInfo.mAppName);
    }
    public List getApkMd5s(){
       AdUrlInfo mAdApkMd5Inf = this.mAdUrlInfo.mAdApkMd5Info;
       if (mAdApkMd5Inf != null) {
          return mAdApkMd5Inf.mApkMd5s;
       }
       return null;
    }
    public String getAppIconUrl(){
       return this.mAdUrlInfo.mAppIcon;
    }
    public PhotoAdvertisement$AppLinkToastInfo getAppLinkToastInfo(){
       return a.e(this);
    }
    public String getAppMarketUriStr(){
       return this.mAdUrlInfo.mMarketUri;
    }
    public String getAppName(){
       return this.mAdUrlInfo.mAppName;
    }
    public int getConversionType(){
       return this.mAdUrlInfo.mType;
    }
    public boolean getDisableLandingPageDeepLink(){
       return this.mAdUrlInfo.mDisableLandingPageDeepLink;
    }
    public int getDisplayType(){
       return a.g(this);
    }
    public int getDownloadSource(){
       return 1;
    }
    public int getEvocationType(){
       return 2;
    }
    public String getH5Url(){
       return a.j(this);
    }
    public PhotoAdvertisement$JumpLiveInfo getLiveStreamInfo(){
       return a.k(this);
    }
    public String getOriginUrl(){
       return this.mAdUrlInfo.mUrl;
    }
    public String getPackageName(){
       return this.mAdUrlInfo.mPkgName;
    }
    public BaseFeed getPhoto(){
       return this.mFeed;
    }
    public String getPhotoId(){
       AdUrlDataWrapper obj = PatchProxy.apply(null, this, AdUrlDataWrapper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mFeed;
       String id = (obj != null)? obj.getId(): "";
       return id;
    }
    public String getScheme(){
       return this.mAdUrlInfo.mScheme;
    }
    public int getUnexpectedMd5Strategy(){
       AdUrlInfo mAdApkMd5Inf = this.mAdUrlInfo.mAdApkMd5Info;
       if (mAdApkMd5Inf != null) {
          PhotoAdvertisement$AdApkMd5Info mUnexpectedM = mAdApkMd5Inf.mUnexpectedMd5Strategy;
          if (mUnexpectedM <= 2) {
             return mUnexpectedM;
          }
       }
       return 0;
    }
    public String getUrl(){
       String obj = PatchProxy.apply(null, this, AdUrlDataWrapper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getOriginUrl();
       if (!j.B(this.getConversionType()) && !TextUtils.x(obj)) {
          obj = k.d(obj, this.mFeed);
       }
       return obj;
    }
    public String getUserId(){
       AdUrlDataWrapper obj = PatchProxy.apply(null, this, AdUrlDataWrapper.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mFeed;
       String str = (obj != null)? r1.U1(obj): "";
       return str;
    }
    public boolean isAd(){
       return true;
    }
    public boolean isAdUrlData(){
       return true;
    }
    public boolean isH5GameAd(){
       return a.n(this);
    }
    public void setCustomClickUrl(PhotoAdvertisement$ItemClickUrl p0){
       a.o(this, p0);
    }
    public void setDisableLandingPageDeepLink(boolean p0){
       a.p(this, p0);
    }
    public void setDisplaySplashPopUpOnWeb(boolean p0){
       a.q(this, p0);
    }
    public void setPackageName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdUrlDataWrapper.class, "6")) {
          return;
       }
       if (this.mAdUrlInfo != null && !TextUtils.x(p0)) {
          this.mAdUrlInfo.mPkgName = p0;
       }
       return;
    }
    public boolean shouldAlertNetMobile(){
       return true;
    }
    public boolean shouldDisplaySplashPopUpOnWeb(){
       return a.s(this);
    }
    public boolean shouldEnableVpnInterception(){
       return a.t(this);
    }
    public boolean usePriorityCard(){
       return a.u(this);
    }
}
