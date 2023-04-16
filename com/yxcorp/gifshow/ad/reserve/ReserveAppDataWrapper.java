package com.yxcorp.gifshow.ad.reserve.ReserveAppDataWrapper;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.ad.response.ReserveAppResponse$AppInfo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import pxb.a;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import mxb.j;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mxb.j0;
import mxb.i0;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import tw.f;
import java.util.List;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppLinkToastInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$JumpLiveInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrl;

public final class ReserveAppDataWrapper implements AdDataWrapper	// class@0017c8
{
    public final ReserveAppResponse$AppInfo appInfo;
    public final BaseFeed feed;
    public final QPhoto photo;

    public void ReserveAppDataWrapper(BaseFeed p0,ReserveAppResponse$AppInfo p1){
       a.p(p0, "feed");
       a.p(p1, "appInfo");
       super();
       this.feed = p0;
       this.appInfo = p1;
       this.photo = new QPhoto(p0);
    }
    public boolean enableReplacePkgName(){
       return a.a(this);
    }
    public AdDataWrapper$AdLogParamAppender getAdLogParamAppender(){
       return a.b(this);
    }
    public j getAdLogWrapper(){
       j obj = PatchProxy.apply(null, this, ReserveAppDataWrapper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i0.a().x(this.feed, this.photo.getPlcEntryStyleInfo());
       a.o(obj, "PhotoAdvertisementLogRep¡­ photo.plcEntryStyleInfo\)");
       return obj;
    }
    public int getAdPosition(){
       return a.c(this);
    }
    public String getApkFileName(){
       Object obj = PatchProxy.apply(null, this, ReserveAppDataWrapper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return f.d(this.getAppName());
    }
    public List getApkMd5s(){
       return a.d(this);
    }
    public String getAppIconUrl(){
       ReserveAppResponse$AppInfo mAppIconUrl = this.appInfo.mAppIconUrl;
       if (mAppIconUrl != null) {
       }else {
          mAppIconUrl = "";
       }
       return mAppIconUrl;
    }
    public PhotoAdvertisement$AppLinkToastInfo getAppLinkToastInfo(){
       return a.e(this);
    }
    public String getAppMarketUriStr(){
       return "";
    }
    public String getAppName(){
       ReserveAppResponse$AppInfo mAppName = this.appInfo.mAppName;
       if (mAppName != null) {
       }else {
          mAppName = "";
       }
       return mAppName;
    }
    public int getConversionType(){
       return 1;
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
       ReserveAppResponse$AppInfo mDownloadUrl = this.appInfo.mDownloadUrl;
       if (mDownloadUrl != null) {
       }else {
          mDownloadUrl = "";
       }
       return mDownloadUrl;
    }
    public String getPackageName(){
       ReserveAppResponse$AppInfo mPackageName = this.appInfo.mPackageName;
       if (mPackageName != null) {
       }else {
          mPackageName = "";
       }
       return mPackageName;
    }
    public BaseFeed getPhoto(){
       return this.feed;
    }
    public String getPhotoId(){
       String obj = PatchProxy.apply(null, this, ReserveAppDataWrapper.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.photo.getPhotoId();
       if (obj == null) {
          obj = "";
       }
       return obj;
    }
    public String getScheme(){
       return "";
    }
    public int getUnexpectedMd5Strategy(){
       return a.l(this);
    }
    public String getUrl(){
       Object obj = PatchProxy.apply(null, this, ReserveAppDataWrapper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getOriginUrl();
    }
    public String getUserId(){
       String obj = PatchProxy.apply(null, this, ReserveAppDataWrapper.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.photo.getUserId();
       if (obj == null) {
          obj = "";
       }
       return obj;
    }
    public boolean isAd(){
       return true;
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
       return false;
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
