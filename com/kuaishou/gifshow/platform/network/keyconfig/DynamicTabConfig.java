package com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig;
import java.io.Serializable;
import java.lang.Comparable;
import mkd.a;
import java.util.HashMap;
import java.lang.Object;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig$Status;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig$ActivityTabConfig;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig$ResourceConfig;
import com.kwai.framework.model.kcube.TabViewInfo;
import com.kwai.framework.model.kcube.TabViewInfo$TabIcon;
import ekd.j;
import com.kwai.framework.model.kcube.TabViewInfo$TabLottie;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.kcube.ActionBarSkinConfig;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import java.lang.Boolean;
import ok.k;
import java.lang.StringBuilder;
import java.util.Map;
import java.lang.Long;
import ekd.k1;

public class DynamicTabConfig implements Serializable, Comparable, a	// class@000860
{
    public DynamicTabConfig$ActivityTabConfig mActivityTabConfig;
    public DynamicTabConfig$TabBizParams mBizParams;
    public String mCurrentResourceName;
    public long mEndTime;
    public String mId;
    public int mMaxDelayRefreshTime;
    public int mPriority;
    public DynamicTabConfig$ResourceConfig mResourceConfig;
    public long mStartTime;
    public DynamicTabConfig$Status mStatus;
    public List mStrategies;
    public String mTabName;
    public String mTabNameEn;
    public String mTabNameTc;
    public String mType;
    public int mVersion;
    public static final Map b;
    public static final long serialVersionUID;

    static {
       DynamicTabConfig.b = new HashMap();
    }
    public void DynamicTabConfig(){
       super();
       this.mStatus = DynamicTabConfig$Status.UNCHANGED;
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, DynamicTabConfig.class, "5")) {
          return;
       }
       if (this.mResourceConfig != null) {
          DynamicTabConfig tmActivityTa = this.mActivityTabConfig;
          if (tmActivityTa != null && !q.f(tmActivityTa.mResourceConfigTemplates)) {
             Iterator iterator = this.mActivityTabConfig.mResourceConfigTemplates.iterator();
             while (iterator.hasNext()) {
                DynamicTabConfig$ResourceConfig resourceConf = iterator.next();
                DynamicTabConfig$ResourceConfig mTabViewInfo = resourceConf.mTabViewInfo;
                if (mTabViewInfo == null) {
                   resourceConf.mTabViewInfo = this.mResourceConfig.mTabViewInfo;
                }else {
                   TabViewInfo mTabIcon = mTabViewInfo.mTabIcon;
                   if (mTabIcon == null) {
                      mTabViewInfo.mTabIcon = this.mResourceConfig.mTabViewInfo.mTabIcon;
                   }else if(j.h(mTabIcon.mSelectedTabIconUrl)){
                      resourceConf.mTabViewInfo.mTabIcon.mSelectedTabIconUrl = this.mResourceConfig.mTabViewInfo.mTabIcon.mSelectedTabIconUrl;
                   }
                   if (j.h(resourceConf.mTabViewInfo.mTabIcon.mDarkDefaultTabIconUrls)) {
                      resourceConf.mTabViewInfo.mTabIcon.mDarkDefaultTabIconUrls = this.mResourceConfig.mTabViewInfo.mTabIcon.mDarkDefaultTabIconUrls;
                   }
                   if (j.h(resourceConf.mTabViewInfo.mTabIcon.mLightDefaultTabIconUrls)) {
                      resourceConf.mTabViewInfo.mTabIcon.mLightDefaultTabIconUrls = this.mResourceConfig.mTabViewInfo.mTabIcon.mLightDefaultTabIconUrls;
                   }
                   mTabViewInfo = resourceConf.mTabViewInfo;
                   mTabIcon = mTabViewInfo.mTabLottie;
                   if (mTabIcon == null) {
                      mTabViewInfo.mTabLottie = this.mResourceConfig.mTabViewInfo.mTabLottie;
                   }else if(!mTabIcon.mDelay){
                      mTabIcon.mDelay = this.mResourceConfig.mTabViewInfo.mTabLottie.mDelay;
                   }
                   if (mTabIcon.mLottieDisplayMaxCount == null) {
                      mTabIcon.mLottieDisplayMaxCount = this.mResourceConfig.mTabViewInfo.mTabLottie.mLottieDisplayMaxCount;
                   }
                   if (TextUtils.x(mTabIcon.mId)) {
                      resourceConf.mTabViewInfo.mTabLottie.mId = this.mResourceConfig.mTabViewInfo.mTabLottie.mId;
                   }
                   if (j.h(resourceConf.mTabViewInfo.mTabLottie.mTabLottieUrl)) {
                      resourceConf.mTabViewInfo.mTabLottie.mTabLottieUrl = this.mResourceConfig.mTabViewInfo.mTabLottie.mTabLottieUrl;
                   }
                }
                mTabViewInfo = resourceConf.mActionBarSkinConfig;
                if (mTabViewInfo == null) {
                   resourceConf.mActionBarSkinConfig = this.mResourceConfig.mActionBarSkinConfig;
                }else if(TextUtils.x(mTabViewInfo.mSelectedTextColor)){
                   resourceConf.mActionBarSkinConfig.mSelectedTextColor = this.mResourceConfig.mActionBarSkinConfig.mSelectedTextColor;
                }
                if (TextUtils.x(resourceConf.mActionBarSkinConfig.mDarkDefaultTextColor)) {
                   resourceConf.mActionBarSkinConfig.mDarkDefaultTextColor = this.mResourceConfig.mActionBarSkinConfig.mDarkDefaultTextColor;
                }
                if (TextUtils.x(resourceConf.mActionBarSkinConfig.mLightDefaultTextColor)) {
                   resourceConf.mActionBarSkinConfig.mLightDefaultTextColor = this.mResourceConfig.mActionBarSkinConfig.mLightDefaultTextColor;
                }
                if (TextUtils.x(resourceConf.mActionBarSkinConfig.mOtherTabDefaultTextColor)) {
                   resourceConf.mActionBarSkinConfig.mOtherTabDefaultTextColor = this.mResourceConfig.mActionBarSkinConfig.mOtherTabDefaultTextColor;
                }
                if (TextUtils.x(resourceConf.mActionBarSkinConfig.mActionBarColor)) {
                   resourceConf.mActionBarSkinConfig.mActionBarColor = this.mResourceConfig.mActionBarSkinConfig.mActionBarColor;
                }
                if (TextUtils.x(resourceConf.mActionBarSkinConfig.mActionBarBgUrl)) {
                   resourceConf.mActionBarSkinConfig.mActionBarBgUrl = this.mResourceConfig.mActionBarSkinConfig.mActionBarBgUrl;
                }
                if (TextUtils.x(resourceConf.mActionBarSkinConfig.mHomeActionBarBgGravity)) {
                   resourceConf.mActionBarSkinConfig.mHomeActionBarBgGravity = this.mResourceConfig.mActionBarSkinConfig.mHomeActionBarBgGravity;
                }
                if (TextUtils.x(resourceConf.mActionBarSkinConfig.mHomeActionBarIndicatorColor)) {
                   resourceConf.mActionBarSkinConfig.mHomeActionBarIndicatorColor = this.mResourceConfig.mActionBarSkinConfig.mHomeActionBarIndicatorColor;
                }
                if (TextUtils.x(resourceConf.mActionBarSkinConfig.mHomeActionBarDotStrokeColor)) {
                   resourceConf.mActionBarSkinConfig.mHomeActionBarDotStrokeColor = this.mResourceConfig.mActionBarSkinConfig.mHomeActionBarDotStrokeColor;
                }
                if (TextUtils.x(resourceConf.mActionBarSkinConfig.mHomeActionBarDotFillColor)) {
                   resourceConf.mActionBarSkinConfig.mHomeActionBarDotFillColor = this.mResourceConfig.mActionBarSkinConfig.mHomeActionBarDotFillColor;
                }
                if (TextUtils.x(resourceConf.mActionBarSkinConfig.mHomeActionBarFollowIconUrl)) {
                   resourceConf.mActionBarSkinConfig.mHomeActionBarFollowIconUrl = this.mResourceConfig.mActionBarSkinConfig.mHomeActionBarFollowIconUrl;
                }
                if (TextUtils.x(resourceConf.mActionBarSkinConfig.mHomeActionBarTriangleColor)) {
                   resourceConf.mActionBarSkinConfig.mHomeActionBarTriangleColor = this.mResourceConfig.mActionBarSkinConfig.mHomeActionBarTriangleColor;
                }
                if (TextUtils.x(resourceConf.mActionBarSkinConfig.mActionBarSearchIconUrl)) {
                   resourceConf.mActionBarSkinConfig.mActionBarSearchIconUrl = this.mResourceConfig.mActionBarSkinConfig.mActionBarSearchIconUrl;
                }
                if (TextUtils.x(resourceConf.mActionBarSkinConfig.mActionBarMenuIconUrl)) {
                   resourceConf.mActionBarSkinConfig.mActionBarMenuIconUrl = this.mResourceConfig.mActionBarSkinConfig.mActionBarMenuIconUrl;
                }
                if (TextUtils.x(resourceConf.mActionBarSkinConfig.mActionBarLeftTextColor)) {
                   resourceConf.mActionBarSkinConfig.mActionBarLeftTextColor = this.mResourceConfig.mActionBarSkinConfig.mActionBarLeftTextColor;
                }
                if (TextUtils.x(resourceConf.mActionBarSkinConfig.mSkinTone)) {
                   resourceConf.mActionBarSkinConfig.mSkinTone = this.mResourceConfig.mActionBarSkinConfig.mSkinTone;
                }
                mTabViewInfo = resourceConf.mActionBarSkinConfig;
                if (mTabViewInfo.mHideHomeActionBarChannelStartEndMask == null) {
                   mTabViewInfo.mHideHomeActionBarChannelStartEndMask = this.mResourceConfig.mActionBarSkinConfig.mHideHomeActionBarChannelStartEndMask;
                }
                if (mTabViewInfo.mHideStatusBar == null) {
                   mTabViewInfo.mHideStatusBar = this.mResourceConfig.mActionBarSkinConfig.mHideStatusBar;
                }
                if (mTabViewInfo.mLightStatusBar == null) {
                   mTabViewInfo.mLightStatusBar = this.mResourceConfig.mActionBarSkinConfig.mLightStatusBar;
                }
                if (TextUtils.x(resourceConf.mWebviewBackgroundColor)) {
                   resourceConf.mWebviewBackgroundColor = this.mResourceConfig.mWebviewBackgroundColor;
                }
                if (TextUtils.x(resourceConf.mXTabBackgroundColor)) {
                   resourceConf.mXTabBackgroundColor = this.mResourceConfig.mXTabBackgroundColor;
                }
             }
          }
       }
       return;
    }
    public int compareTo(DynamicTabConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DynamicTabConfig.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Integer.compare(this.mPriority, p0.mPriority);
    }
    public int compareTo(Object p0){
       return this.compareTo(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DynamicTabConfig.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (this.mStartTime - p0.mStartTime || (this.mEndTime - p0.mEndTime || (this.mPriority != p0.mPriority || (this.mVersion != p0.mVersion || (!k.a(this.mId, p0.mId) || (!k.a(this.mType, p0.mType) || (!k.a(this.mTabName, p0.mTabName) || (!k.a(this.mTabNameEn, p0.mTabNameEn) || (!k.a(this.mTabNameTc, p0.mTabNameTc) || (!k.a(this.mStrategies, p0.mStrategies) || (!k.a(this.mResourceConfig, p0.mResourceConfig) || !k.a(this.mActivityTabConfig, p0.mActivityTabConfig)))))))))))) {
          b = false;
       }
       return b;
    }
    public long getDelayTime(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, DynamicTabConfig.class, "3");
       if (obj != patchProxyRe) {
          return obj.longValue();
       }
       obj = PatchProxy.apply(objArray, this, DynamicTabConfig.class, "4");
       if (obj != patchProxyRe) {
       }else {
          obj = this.mType+":"+this.mId;
       }
       Map b = DynamicTabConfig.b;
       Long longx = b.get(obj);
       if (longx == null) {
          DynamicTabConfig tmMaxDelayRe = this.mMaxDelayRefreshTime;
          longx = (tmMaxDelayRe <= null)? Long.valueOf(0): Long.valueOf(k1.k((long)tmMaxDelayRe));
          b.put(obj, longx);
       }
       return longx.longValue();
    }
    public long getEndTime(){
       Object obj = PatchProxy.apply(null, this, DynamicTabConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return (this.mEndTime + this.getDelayTime());
    }
    public long getStartTime(){
       Object obj = PatchProxy.apply(null, this, DynamicTabConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return (this.mStartTime + this.getDelayTime());
    }
    public String logInfo(){
       Object obj = PatchProxy.apply(null, this, DynamicTabConfig.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DynamicTabConfig{mId=\'"+this.mId+'''+", mType=\'"+this.mType+'''+", mTabName=\'"+this.mTabName+'''+", mStartTime=\'"+this.mStartTime+'''+", mEndTime=\'"+this.mEndTime+'''+", mPriority="+this.mPriority+'}';
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DynamicTabConfig.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DynamicTabConfig{mId=\'"+this.mId+'''+", mType=\'"+this.mType+'''+", mBizParams=\'"+this.mBizParams+'''+", mTabName=\'"+this.mTabName+'''+", mTabNameEn=\'"+this.mTabNameEn+'''+", mTabNameTc=\'"+this.mTabNameTc+'''+", mStartTime=\'"+this.mStartTime+'''+", mEndTime=\'"+this.mEndTime+'''+", mMaxDelayRefreshTime=\'"+this.mMaxDelayRefreshTime+'''+", mStatus=\'"+this.mStatus+'''+", mStrategies="+this.mStrategies+", mPriority="+this.mPriority+'}';
    }
}
