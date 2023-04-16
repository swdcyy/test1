package com.yxcorp.gifshow.ad.download.intercept.VpnAdDataWrapper;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import erd.g;
import java.lang.Object;
import vq4.c;
import p29.j;
import pxb.a;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import p29.h;
import mxb.j;
import java.util.List;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppLinkToastInfo;
import java.lang.Number;
import com.kuaishou.android.model.ads.PhotoAdvertisement$JumpLiveInfo;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Boolean;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrl;

public class VpnAdDataWrapper implements AdDataWrapper	// class@00175e
{
    public final g mAppendLogConsumer;
    public final AdDataWrapper mRealAdDataWrapper;
    public static final long serialVersionUID = 0x22a15a7a1e0cdd26;

    public void VpnAdDataWrapper(AdDataWrapper p0,g p1){
       super();
       this.mRealAdDataWrapper = p0;
       this.mAppendLogConsumer = p1;
    }
    public static void a(VpnAdDataWrapper p0,c p1){
       p0.lambda$getAdLogParamAppender$358a7097$1(p1);
    }
    private void lambda$getAdLogParamAppender$358a7097$1(c p0){
       try{
          j.a(p0);
          this.mAppendLogConsumer.accept(p0);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public boolean enableReplacePkgName(){
       return a.a(this);
    }
    public AdDataWrapper$AdLogParamAppender getAdLogParamAppender(){
       Object obj = PatchProxy.apply(null, this, VpnAdDataWrapper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new h(this);
    }
    public j getAdLogWrapper(){
       Object obj = PatchProxy.apply(null, this, VpnAdDataWrapper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mRealAdDataWrapper.getAdLogWrapper();
    }
    public int getAdPosition(){
       return a.c(this);
    }
    public String getApkFileName(){
       Object obj = PatchProxy.apply(null, this, VpnAdDataWrapper.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mRealAdDataWrapper.getApkFileName();
    }
    public List getApkMd5s(){
       return a.d(this);
    }
    public String getAppIconUrl(){
       Object obj = PatchProxy.apply(null, this, VpnAdDataWrapper.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mRealAdDataWrapper.getAppIconUrl();
    }
    public PhotoAdvertisement$AppLinkToastInfo getAppLinkToastInfo(){
       return a.e(this);
    }
    public String getAppMarketUriStr(){
       Object obj = PatchProxy.apply(null, this, VpnAdDataWrapper.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mRealAdDataWrapper.getAppMarketUriStr();
    }
    public String getAppName(){
       Object obj = PatchProxy.apply(null, this, VpnAdDataWrapper.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mRealAdDataWrapper.getAppName();
    }
    public int getConversionType(){
       Object obj = PatchProxy.apply(null, this, VpnAdDataWrapper.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mRealAdDataWrapper.getConversionType();
    }
    public boolean getDisableLandingPageDeepLink(){
       return a.f(this);
    }
    public int getDisplayType(){
       return a.g(this);
    }
    public int getDownloadSource(){
       return a.h(this);
    }
    public int getEvocationType(){
       return a.i(this);
    }
    public String getH5Url(){
       return a.j(this);
    }
    public PhotoAdvertisement$JumpLiveInfo getLiveStreamInfo(){
       return a.k(this);
    }
    public String getOriginUrl(){
       Object obj = PatchProxy.apply(null, this, VpnAdDataWrapper.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mRealAdDataWrapper.getOriginUrl();
    }
    public String getPackageName(){
       Object obj = PatchProxy.apply(null, this, VpnAdDataWrapper.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mRealAdDataWrapper.getPackageName();
    }
    public BaseFeed getPhoto(){
       Object obj = PatchProxy.apply(null, this, VpnAdDataWrapper.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mRealAdDataWrapper.getPhoto();
    }
    public String getPhotoId(){
       Object obj = PatchProxy.apply(null, this, VpnAdDataWrapper.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mRealAdDataWrapper.getPhotoId();
    }
    public String getScheme(){
       Object obj = PatchProxy.apply(null, this, VpnAdDataWrapper.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mRealAdDataWrapper.getScheme();
    }
    public int getUnexpectedMd5Strategy(){
       return a.l(this);
    }
    public String getUrl(){
       Object obj = PatchProxy.apply(null, this, VpnAdDataWrapper.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mRealAdDataWrapper.getUrl();
    }
    public String getUserId(){
       Object obj = PatchProxy.apply(null, this, VpnAdDataWrapper.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mRealAdDataWrapper.getUserId();
    }
    public boolean isAd(){
       Object obj = PatchProxy.apply(null, this, VpnAdDataWrapper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mRealAdDataWrapper.isAd();
    }
    public boolean isAdUrlData(){
       return a.m(this);
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
       a.r(this, p0);
    }
    public boolean shouldAlertNetMobile(){
       Object obj = PatchProxy.apply(null, this, VpnAdDataWrapper.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mRealAdDataWrapper.shouldAlertNetMobile();
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
