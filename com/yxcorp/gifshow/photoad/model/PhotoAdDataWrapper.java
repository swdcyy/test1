package com.yxcorp.gifshow.photoad.model.PhotoAdDataWrapper;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import pxb.c;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import ok.n;
import java.lang.String;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.abtest.f;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import pxb.a;
import mxb.j;
import wkd.b;
import yx.i0;
import tw.f;
import java.util.List;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdApkMd5Info;
import mxb.c;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppLinkToastInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import nx8.n;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickActionInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$JumpLiveInfo;
import java.lang.CharSequence;
import nx8.k;
import com.kuaishou.android.model.ads.SplashInfo$SplashPlayableInfo;
import tw.l;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrl;
import tw.j;
import kp.r1;

public class PhotoAdDataWrapper implements AdDataWrapper, c	// class@000f9e
{
    public int mActivityEnterAnimation;
    public int mAdPosition;
    public PhotoAdvertisement$ItemClickUrl mCustomClickUrl;
    public boolean mDisableLandingPageDeepLink;
    public int mDownloadSource;
    public int mItemClickType;
    public int mOriginActivityExitAnimation;
    public BaseFeed mPhoto;
    public PhotoAdvertisement mPhotoAdvertisement;
    public boolean mShouldDisplaySplashPopUpOnWeb;
    public static final long serialVersionUID = 0xce14cc55d06f54c2;

    public void PhotoAdDataWrapper(BaseFeed p0){
       super(p0, 0);
    }
    public void PhotoAdDataWrapper(BaseFeed p0,int p1){
       super(p0, p1, 2);
    }
    public void PhotoAdDataWrapper(BaseFeed p0,int p1,int p2){
       super();
       this.mItemClickType = 0;
       this.mShouldDisplaySplashPopUpOnWeb = false;
       this.mDisableLandingPageDeepLink = false;
       n.j(p0);
       this.mPhoto = p0;
       this.mPhotoAdvertisement = p0.get("AD");
       this.mAdPosition = p1;
       this.mDownloadSource = p2;
    }
    public boolean enableReplacePkgName(){
       Object obj = PatchProxy.apply(null, this, PhotoAdDataWrapper.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.a("isPkgNameOpenOpt");
    }
    public int getActivityEnterAnimation(){
       return this.mActivityEnterAnimation;
    }
    public AdDataWrapper$AdLogParamAppender getAdLogParamAppender(){
       return a.b(this);
    }
    public j getAdLogWrapper(){
       i0 obj = PatchProxy.apply(null, this, PhotoAdDataWrapper.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(0x1d6683e9);
       PhotoAdDataWrapper tmAdPosition = this.mAdPosition;
       if (tmAdPosition == null) {
          return obj.c(this.mPhoto);
       }
       return obj.d(this.mPhoto, tmAdPosition);
    }
    public int getAdPosition(){
       return this.mAdPosition;
    }
    public String getApkFileName(){
       Object obj = PatchProxy.apply(null, this, PhotoAdDataWrapper.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return f.c(this.mPhotoAdvertisement);
    }
    public List getApkMd5s(){
       PhotoAdvertisement$AdApkMd5Info obj = PatchProxy.apply(null, this, PhotoAdDataWrapper.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.t(this.mPhoto);
       if (obj != null) {
          return obj.mApkMd5s;
       }
       return null;
    }
    public String getAppIconUrl(){
       PhotoAdvertisement mAppIconUrl;
       PhotoAdDataWrapper tmPhotoAdver = this.mPhotoAdvertisement;
       if (tmPhotoAdver != null) {
          mAppIconUrl = tmPhotoAdver.mAppIconUrl;
          if (mAppIconUrl != null) {
          label_000b :
             return mAppIconUrl;
          }
       }
       mAppIconUrl = "";
       goto label_000b ;
    }
    public PhotoAdvertisement$AppLinkToastInfo getAppLinkToastInfo(){
       PhotoAdDataWrapper tmPhotoAdver = this.mPhotoAdvertisement;
       if (tmPhotoAdver != null) {
          PhotoAdvertisement mAdData = tmPhotoAdver.mAdData;
          if (mAdData != null) {
             return mAdData.mAppLinkToastInfo;
          }
       }
       return null;
    }
    public String getAppMarketUriStr(){
       PhotoAdDataWrapper obj = PatchProxy.apply(null, this, PhotoAdDataWrapper.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mPhotoAdvertisement;
       if (obj == null) {
          return "";
       }
       PhotoAdvertisement mAdData = obj.mAdData;
       if (mAdData == null) {
          return "";
       }
       return TextUtils.I(mAdData.mMarketUri);
    }
    public String getAppName(){
       PhotoAdvertisement mAppName;
       PhotoAdDataWrapper tmPhotoAdver = this.mPhotoAdvertisement;
       if (tmPhotoAdver != null) {
          mAppName = tmPhotoAdver.mAppName;
          if (mAppName != null) {
          label_000b :
             return mAppName;
          }
       }
       mAppName = "";
       goto label_000b ;
    }
    public int getConversionType(){
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       PhotoAdDataWrapper obj = PatchProxy.apply(objArray, this, PhotoAdDataWrapper.class, "9");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.mPhotoAdvertisement;
       int i = 0;
       if (obj == null) {
          return i;
       }
       if (!n.d(this.mItemClickType, obj)) {
          return this.mPhotoAdvertisement.mConversionType;
       }
       obj = this.mItemClickType;
       PhotoAdDataWrapper tmPhotoAdver = this.mPhotoAdvertisement;
       if (PatchProxy.isSupport(n.class)) {
          Object obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(obj), tmPhotoAdver, objArray, n.class, "7");
          if (obj1 != patchProxyRe) {
             i1 = obj1.intValue();
          label_004f :
             return i1;
          }
       }
       a.p(tmPhotoAdver, "ad");
       PhotoAdvertisement$ItemClickActionInfo itemClickAct = n.c(obj, tmPhotoAdver);
       if (itemClickAct != null) {
          i = itemClickAct.mSubConversionType;
       }
       i1 = i;
       goto label_004f ;
    }
    public final PhotoAdvertisement$JumpLiveInfo getDefaultLiveStreamInfo(){
       PhotoAdvertisement$AdData mJumpLiveInf;
       PhotoAdDataWrapper tmPhotoAdver = this.mPhotoAdvertisement;
       if (tmPhotoAdver != null) {
          PhotoAdvertisement mAdData = tmPhotoAdver.mAdData;
          if (mAdData != null) {
             mJumpLiveInf = mAdData.mJumpLiveInfo;
          label_000c :
             return mJumpLiveInf;
          }
       }
       mJumpLiveInf = null;
       goto label_000c ;
    }
    public final String getDefaultScheme(){
       PhotoAdDataWrapper obj = PatchProxy.apply(null, this, PhotoAdDataWrapper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mPhotoAdvertisement;
       PhotoAdvertisement mScheme = (obj != null)? obj.mScheme: "";
       if (!TextUtils.x(mScheme)) {
          mScheme = k.d(mScheme, this.mPhoto);
       }
       return mScheme;
    }
    public final String getDefaultUrl(){
       String str1;
       SplashInfo$SplashPlayableInfo obj = PatchProxy.apply(null, this, PhotoAdDataWrapper.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "";
       if (this.mShouldDisplaySplashPopUpOnWeb != null) {
          obj = l.f(this.mPhoto);
          if (obj != null && !TextUtils.x(obj.mPlayableUrl)) {
             obj = obj.mPlayableUrl;
          label_002a :
             if (TextUtils.x(obj)) {
                PhotoAdDataWrapper tmPhotoAdver = this.mPhotoAdvertisement;
                if (tmPhotoAdver != null) {
                   str = tmPhotoAdver.mUrl;
                }
                str1 = str;
             }
             return str1;
          }
       }
       str1 = str;
       goto label_002a ;
    }
    public boolean getDisableLandingPageDeepLink(){
       return this.mDisableLandingPageDeepLink;
    }
    public int getDisplayType(){
       PhotoAdDataWrapper tmPhotoAdver = this.mPhotoAdvertisement;
       PhotoAdvertisement mDisplayType = (tmPhotoAdver != null)? tmPhotoAdver.mDisplayType: 0;
       return mDisplayType;
    }
    public int getDownloadSource(){
       return this.mDownloadSource;
    }
    public int getEvocationType(){
       return a.i(this);
    }
    public String getH5Url(){
       PhotoAdDataWrapper tmPhotoAdver = this.mPhotoAdvertisement;
       if (tmPhotoAdver != null) {
          PhotoAdvertisement mAdData = tmPhotoAdver.mAdData;
          if (mAdData != null) {
             PhotoAdvertisement$AdData mH5Url = mAdData.mH5Url;
             if (mH5Url != null) {
                return mH5Url;
             }
          }
       }
       return "";
    }
    public int getItemClickType(){
       return this.mItemClickType;
    }
    public final PhotoAdvertisement$ItemClickUrl getItemClickUrl(){
       PhotoAdDataWrapper obj = PatchProxy.apply(null, this, PhotoAdDataWrapper.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mCustomClickUrl;
       if (obj != null) {
          return obj;
       }
       return n.b(this.mItemClickType, this.mPhotoAdvertisement);
    }
    public PhotoAdvertisement$JumpLiveInfo getLiveStreamInfo(){
       PhotoAdvertisement$ItemClickUrl obj = PatchProxy.apply(null, this, PhotoAdDataWrapper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getItemClickUrl();
       if (obj != null) {
          return obj.mJumpLiveInfo;
       }
       return this.getDefaultLiveStreamInfo();
    }
    public int getOriginActivityExitAnimation(){
       return this.mOriginActivityExitAnimation;
    }
    public String getOriginUrl(){
       String defaultUrl;
       PhotoAdvertisement$ItemClickUrl obj = PatchProxy.apply(null, this, PhotoAdDataWrapper.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getItemClickUrl();
       obj = (obj != null)? obj.mUrl: this.getDefaultUrl();
       return obj;
    }
    public String getPackageName(){
       PhotoAdvertisement mPackageName;
       PhotoAdDataWrapper tmPhotoAdver = this.mPhotoAdvertisement;
       if (tmPhotoAdver != null) {
          mPackageName = tmPhotoAdver.mPackageName;
          if (mPackageName != null) {
          label_000b :
             return mPackageName;
          }
       }
       mPackageName = "";
       goto label_000b ;
    }
    public BaseFeed getPhoto(){
       return this.mPhoto;
    }
    public String getPhotoId(){
       Object obj = PatchProxy.apply(null, this, PhotoAdDataWrapper.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mPhoto.getId();
    }
    public String getScheme(){
       PhotoAdvertisement$ItemClickUrl obj = PatchProxy.apply(null, this, PhotoAdDataWrapper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getItemClickUrl();
       if (obj != null) {
          return k.d(obj.mAppLink, this.mPhoto);
       }
       return this.getDefaultScheme();
    }
    public int getUnexpectedMd5Strategy(){
       PhotoAdvertisement$AdApkMd5Info obj = PatchProxy.apply(null, this, PhotoAdDataWrapper.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = c.t(this.mPhoto);
       if (obj != null) {
          obj = obj.mUnexpectedMd5Strategy;
          if (obj <= 2) {
             return obj;
          }
       }
       return 0;
    }
    public String getUrl(){
       String obj = PatchProxy.apply(null, this, PhotoAdDataWrapper.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getOriginUrl();
       PhotoAdDataWrapper tmPhotoAdver = this.mPhotoAdvertisement;
       if (tmPhotoAdver != null && (!j.C(tmPhotoAdver) && !TextUtils.x(obj))) {
          obj = k.d(obj, this.mPhoto);
       }
    label_002a :
       return obj;
    }
    public String getUserId(){
       Object obj = PatchProxy.apply(null, this, PhotoAdDataWrapper.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return r1.U1(this.mPhoto);
    }
    public int getWebViewType(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       PhotoAdDataWrapper obj = PatchProxy.apply(objArray, this, PhotoAdDataWrapper.class, "19");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.mItemClickType;
       PhotoAdDataWrapper tmPhotoAdver = this.mPhotoAdvertisement;
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(obj), tmPhotoAdver, objArray, on, "8");
          if (obj1 != patchProxyRe) {
             i = obj1.intValue();
          }else {
          label_0033 :
             PhotoAdvertisement$ItemClickActionInfo itemClickAct = n.c(obj, tmPhotoAdver);
             if (itemClickAct != null) {
                objArray = Integer.valueOf(itemClickAct.mWebViewType);
             }else if(tmPhotoAdver != null){
                PhotoAdvertisement$AdData adData = tmPhotoAdver.getAdData();
                if (adData != null) {
                   objArray = Integer.valueOf(adData.mWebViewType);
                }
             }
             if (objArray != null) {
                i = objArray.intValue();
             }else {
                i = 0;
             }
          }
       }else {
          goto label_0033 ;
       }
       return i;
    }
    public boolean isAd(){
       boolean b = (this.mPhotoAdvertisement != null)? true: false;
       return b;
    }
    public boolean isAdUrlData(){
       return a.m(this);
    }
    public boolean isH5GameAd(){
       PhotoAdDataWrapper tmPhotoAdver = this.mPhotoAdvertisement;
       boolean b = (tmPhotoAdver != null && tmPhotoAdver.mIsH5App != null)? true: false;
       return b;
    }
    public void setActivityAnimation(int p0,int p1){
       this.mActivityEnterAnimation = p0;
       this.mOriginActivityExitAnimation = p1;
    }
    public void setCustomClickUrl(PhotoAdvertisement$ItemClickUrl p0){
       this.mCustomClickUrl = p0;
    }
    public void setDisableLandingPageDeepLink(boolean p0){
       this.mDisableLandingPageDeepLink = p0;
    }
    public void setDisplaySplashPopUpOnWeb(boolean p0){
       this.mShouldDisplaySplashPopUpOnWeb = p0;
    }
    public void setItemClickType(int p0){
       this.mItemClickType = p0;
    }
    public void setPackageName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoAdDataWrapper.class, "14")) {
          return;
       }
       if (this.mPhotoAdvertisement != null && !TextUtils.x(p0)) {
          this.mPhotoAdvertisement.mPackageName = p0;
       }
       return;
    }
    public boolean shouldAlertNetMobile(){
       PhotoAdDataWrapper obj = PatchProxy.apply(null, this, PhotoAdDataWrapper.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mPhotoAdvertisement;
       boolean b = (obj != null && (obj.mShouldAlertNetMobile != null && !this.usePriorityCard()))? true: false;
       return b;
    }
    public boolean shouldDisplaySplashPopUpOnWeb(){
       return this.mShouldDisplaySplashPopUpOnWeb;
    }
    public boolean shouldEnableVpnInterception(){
       PhotoAdDataWrapper tmPhotoAdver = this.mPhotoAdvertisement;
       boolean b = true;
       if (tmPhotoAdver != null) {
          PhotoAdvertisement mAdData = tmPhotoAdver.mAdData;
          if (mAdData != null && mAdData.mEnableVpnInterception == b) {
          label_000f :
             return b;
          }
       }
       b = false;
       goto label_000f ;
    }
    public boolean usePriorityCard(){
       PhotoAdDataWrapper tmPhotoAdver = this.mPhotoAdvertisement;
       boolean b = (tmPhotoAdver != null && tmPhotoAdver.mUsePriorityCard != null)? true: false;
       return b;
    }
}
