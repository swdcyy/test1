package com.yxcorp.gifshow.detail.plc.helper.ad.PlcAdDataWrapper;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import java.lang.Object;
import pxb.a;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import mxb.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mxb.j0;
import mxb.i0;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.kwai.framework.model.feed.BaseFeed;
import j80.f;
import tkd.b;
import tkd.d;
import ol9.a;
import java.util.List;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppLinkToastInfo;
import java.lang.Number;
import com.kuaishou.android.model.ads.PhotoAdvertisement$JumpLiveInfo;
import kp.r1;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrl;

public class PlcAdDataWrapper implements AdDataWrapper	// class@001670
{
    public final PlcEntryDataAdapter mPlcEntryAdapter;
    public static final long serialVersionUID = 0xd727e8cae4eab5af;

    public void PlcAdDataWrapper(PlcEntryDataAdapter p0){
       super();
       this.mPlcEntryAdapter = p0;
    }
    public boolean enableReplacePkgName(){
       return a.a(this);
    }
    public AdDataWrapper$AdLogParamAppender getAdLogParamAppender(){
       return a.b(this);
    }
    public j getAdLogWrapper(){
       Object obj = PatchProxy.apply(null, this, PlcAdDataWrapper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return i0.a().x(this.mPlcEntryAdapter.getPhoto().mEntity, this.mPlcEntryAdapter.getPlcEntryStyleInfo());
    }
    public int getAdPosition(){
       return a.c(this);
    }
    public String getApkFileName(){
       String obj = PatchProxy.apply(null, this, PlcAdDataWrapper.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mPlcEntryAdapter.getFileName();
       String str = f.f(obj);
       d.a(0x4ffa335e).E9(obj, str);
       return str;
    }
    public List getApkMd5s(){
       return a.d(this);
    }
    public String getAppIconUrl(){
       Object obj = PatchProxy.apply(null, this, PlcAdDataWrapper.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mPlcEntryAdapter.getAppIconUrl();
    }
    public PhotoAdvertisement$AppLinkToastInfo getAppLinkToastInfo(){
       return a.e(this);
    }
    public String getAppMarketUriStr(){
       Object obj = PatchProxy.apply(null, this, PlcAdDataWrapper.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mPlcEntryAdapter.getMarketUri();
    }
    public String getAppName(){
       Object obj = PatchProxy.apply(null, this, PlcAdDataWrapper.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mPlcEntryAdapter.getAppName();
    }
    public int getConversionType(){
       Object obj = PatchProxy.apply(null, this, PlcAdDataWrapper.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int actionType = this.mPlcEntryAdapter.getActionType();
       int i = 2;
       if (actionType == i) {
          return 1;
       }
       if (actionType == 4) {
          return i;
       }
       if (actionType != 5) {
          return 0;
       }
       return 3;
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
       Object obj = PatchProxy.apply(null, this, PlcAdDataWrapper.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mPlcEntryAdapter.getDownloadUrl();
    }
    public String getPackageName(){
       Object obj = PatchProxy.apply(null, this, PlcAdDataWrapper.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mPlcEntryAdapter.getPackageName();
    }
    public BaseFeed getPhoto(){
       Object obj = PatchProxy.apply(null, this, PlcAdDataWrapper.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mPlcEntryAdapter.getPhoto().mEntity;
    }
    public String getPhotoId(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, PlcAdDataWrapper.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getPhoto() != null) {
          objArray = this.getPhoto().getId();
       }
       return objArray;
    }
    public String getScheme(){
       Object obj = PatchProxy.apply(null, this, PlcAdDataWrapper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mPlcEntryAdapter.getAppLink();
    }
    public int getUnexpectedMd5Strategy(){
       return a.l(this);
    }
    public String getUrl(){
       Object obj = PatchProxy.apply(null, this, PlcAdDataWrapper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getOriginUrl();
    }
    public String getUserId(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, PlcAdDataWrapper.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getPhoto() != null) {
          objArray = r1.U1(this.getPhoto());
       }
       return objArray;
    }
    public boolean isAd(){
       return false;
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
