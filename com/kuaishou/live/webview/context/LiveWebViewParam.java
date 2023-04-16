package com.kuaishou.live.webview.context.LiveWebViewParam;
import java.io.Serializable;
import jq3.d;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.yoda.model.LaunchModel;
import com.kwai.yoda.model.LaunchModel$a;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Objects;
import az7.a;
import yz7.c;
import java.lang.Boolean;
import com.kuaishou.live.webview.context.LiveWebViewBackgroundImageParam;

public class LiveWebViewParam implements Serializable	// class@000fff
{
    public String mActionBarBgColor;
    public String mActionBarLeftBtnType;
    public int mActionBarLeftDrawableResId;
    public LiveWebViewBackgroundImageParam mBackGroundImageParam;
    public boolean mCloseFullScreenWhenLoadError;
    public String mDayNightMode;
    public float mDimAmount;
    public boolean mDisableScrollBar;
    public boolean mEnableClickOutsideDismiss;
    public Boolean mEnableLoading;
    public boolean mEnablePanDown;
    public boolean mEnablePercentScreenHeight;
    public boolean mEnableShowExit;
    public boolean mFullScreen;
    public boolean mHideLeftTopBtn;
    public int mInOutAnimation;
    public boolean mIsKeepLandscape;
    public int mLandscapeWidthPixel;
    public String mLayoutType;
    public boolean mNeedCorner;
    public int mOverScrollMode;
    public int mPortraitHeightPixel;
    public float mPortraitHeightRatio;
    public String mProgressBarColor;
    public String mTitle;
    public String mTitleColor;
    public int mTopRadiusDp;
    public boolean mTransparent;
    public String mWebTypeUA;
    public String mWebUrl;
    public String mWebViewBgColor;
    public static final int b = 0;
    public static final int c = 0;
    public static final long serialVersionUID = 0x63604aefe4e0d53f;

    static {
       LiveWebViewParam.b = d.a();
       LiveWebViewParam.c = a1.e(325.00f);
    }
    public void LiveWebViewParam(){
       super();
       this.mFullScreen = false;
       this.mPortraitHeightRatio = 0;
       this.mPortraitHeightPixel = LiveWebViewParam.b;
       this.mLandscapeWidthPixel = LiveWebViewParam.c;
       this.mLayoutType = "0";
       this.mInOutAnimation = 0;
       this.mDimAmount = 0;
       this.mEnablePanDown = true;
       this.mEnableClickOutsideDismiss = true;
       this.mTransparent = false;
       this.mNeedCorner = true;
       this.mTopRadiusDp = 16;
       this.mActionBarLeftDrawableResId = 0;
       this.mActionBarLeftBtnType = "back";
       this.mHideLeftTopBtn = false;
       this.mCloseFullScreenWhenLoadError = false;
       this.mEnableShowExit = false;
    }
    public static LiveWebViewParam createDefaultParam(){
       Object obj = PatchProxy.apply(null, null, LiveWebViewParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveWebViewParam();
    }
    public LaunchModel getLaunchModel(){
       LaunchModel$a uoa = LaunchModel$a.class;
       String str = "2";
       LaunchModel$a obj = PatchProxy.apply(null, this, LiveWebViewParam.class, str);
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LaunchModel$a(this.mWebUrl);
       LiveWebViewParam tmTitle = this.mTitle;
       LaunchModel$a uoa1 = PatchProxy.applyOneRefs(tmTitle, obj, uoa, str);
       if (uoa1 != PatchProxyResult.class) {
       }else if(!TextUtils.isEmpty(tmTitle)){
          obj.k = tmTitle;
       }
       uoa1 = obj;
       tmTitle = this.mTitleColor;
       Objects.requireNonNull(uoa1);
       Object obj1 = PatchProxy.applyOneRefs(tmTitle, uoa1, uoa, "11");
       if (obj1 != PatchProxyResult.class) {
          uoa1 = obj1;
       }else if(a.a(tmTitle) || c.a(tmTitle)){
          uoa1.s = tmTitle;
       }
       tmTitle = this.mActionBarBgColor;
       Objects.requireNonNull(uoa1);
       obj1 = PatchProxy.applyOneRefs(tmTitle, uoa1, uoa, "13");
       if (obj1 != PatchProxyResult.class) {
          uoa1 = obj1;
       }else if(a.a(tmTitle) || c.a(tmTitle)){
          uoa1.t = tmTitle;
       }
       tmTitle = this.mWebViewBgColor;
       Objects.requireNonNull(uoa1);
       obj1 = PatchProxy.applyOneRefs(tmTitle, uoa1, uoa, "17");
       if (obj1 != PatchProxyResult.class) {
          uoa1 = obj1;
       }else if(a.a(tmTitle) || c.a(tmTitle)){
          uoa1.v = tmTitle;
       }
       tmTitle = this.mProgressBarColor;
       Objects.requireNonNull(uoa1);
       obj1 = PatchProxy.applyOneRefs(tmTitle, uoa1, uoa, "19");
       if (obj1 != PatchProxyResult.class) {
          uoa1 = obj1;
       }else if(a.a(tmTitle) || c.a(tmTitle)){
          uoa1.w = tmTitle;
       }
       tmTitle = this.mDayNightMode;
       Objects.requireNonNull(uoa1);
       if (PatchProxy.applyOneRefs(tmTitle, uoa1, uoa, "9") != PatchProxyResult.class) {
       }else if(!TextUtils.isEmpty(tmTitle)){
          uoa1.r = tmTitle;
       }
       LiveWebViewParam tmEnableLoad = this.mEnableLoading;
       if (tmEnableLoad != null) {
          obj.f(tmEnableLoad.booleanValue());
       }
       return obj.a();
    }
    public boolean needClipCorner(){
       boolean b = (this.mEnableShowExit != null && (this.mEnablePanDown != null || this.mNeedCorner != null))? true: false;
       return b;
    }
    public LiveWebViewParam setActionBarBgColor(String p0){
       this.mActionBarBgColor = p0;
       return this;
    }
    public LiveWebViewParam setActionBarLeftBtnType(String p0){
       this.mActionBarLeftBtnType = p0;
       return this;
    }
    public LiveWebViewParam setActionBarLeftDrawableResId(int p0){
       this.mActionBarLeftDrawableResId = p0;
       return this;
    }
    public LiveWebViewParam setBackgroundImageParam(LiveWebViewBackgroundImageParam p0){
       this.mBackGroundImageParam = p0;
       return this;
    }
    public LiveWebViewParam setCloseFullScreenWhenLoadError(boolean p0){
       this.mCloseFullScreenWhenLoadError = p0;
       return this;
    }
    public LiveWebViewParam setDayNightMode(String p0){
       this.mDayNightMode = p0;
       return this;
    }
    public LiveWebViewParam setDimAmount(float p0){
       this.mDimAmount = p0;
       return this;
    }
    public LiveWebViewParam setDisableScrollBar(boolean p0){
       this.mDisableScrollBar = p0;
       return this;
    }
    public LiveWebViewParam setEnableClickOutsideDismiss(boolean p0){
       this.mEnableClickOutsideDismiss = p0;
       return this;
    }
    public LiveWebViewParam setEnableLoading(boolean p0){
       if (PatchProxy.isSupport(LiveWebViewParam.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, LiveWebViewParam.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mEnableLoading = Boolean.valueOf(p0);
       return this;
    }
    public LiveWebViewParam setEnablePanDown(boolean p0){
       this.mEnablePanDown = p0;
       return this;
    }
    public LiveWebViewParam setEnablePercentScreenHeight(boolean p0){
       this.mEnablePercentScreenHeight = p0;
       return this;
    }
    public LiveWebViewParam setEnableShowExitIcon(boolean p0){
       this.mEnableShowExit = p0;
       return this;
    }
    public LiveWebViewParam setFullScreen(boolean p0){
       this.mFullScreen = p0;
       return this;
    }
    public LiveWebViewParam setHideLeftTopBtn(boolean p0){
       this.mHideLeftTopBtn = p0;
       return this;
    }
    public LiveWebViewParam setInOutAnimation(int p0){
       this.mInOutAnimation = p0;
       return this;
    }
    public LiveWebViewParam setIsKeepLandscape(boolean p0){
       this.mIsKeepLandscape = p0;
       return this;
    }
    public LiveWebViewParam setLandscapeWidthPixel(int p0){
       this.mLandscapeWidthPixel = p0;
       return this;
    }
    public LiveWebViewParam setLayoutType(String p0){
       this.mLayoutType = p0;
       return this;
    }
    public LiveWebViewParam setNeedCorner(boolean p0){
       this.mNeedCorner = p0;
       return this;
    }
    public LiveWebViewParam setOverScrollMode(int p0){
       this.mOverScrollMode = p0;
       return this;
    }
    public LiveWebViewParam setPortraitHeightPixel(int p0){
       this.mPortraitHeightPixel = p0;
       return this;
    }
    public LiveWebViewParam setPortraitHeightRatio(float p0){
       this.mPortraitHeightRatio = p0;
       return this;
    }
    public LiveWebViewParam setProgressBarColor(String p0){
       this.mProgressBarColor = p0;
       return this;
    }
    public LiveWebViewParam setTitle(String p0){
       this.mTitle = p0;
       return this;
    }
    public LiveWebViewParam setTitleColor(String p0){
       this.mTitleColor = p0;
       return this;
    }
    public LiveWebViewParam setTopRadiusDp(int p0){
       this.mTopRadiusDp = p0;
       return this;
    }
    public LiveWebViewParam setTransparent(boolean p0){
       this.mTransparent = p0;
       return this;
    }
    public LiveWebViewParam setWebTypeUA(String p0){
       this.mWebTypeUA = p0;
       return this;
    }
    public LiveWebViewParam setWebViewBgColor(String p0){
       this.mWebViewBgColor = p0;
       return this;
    }
}
