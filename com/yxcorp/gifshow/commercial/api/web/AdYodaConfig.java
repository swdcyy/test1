package com.yxcorp.gifshow.commercial.api.web.AdYodaConfig;
import java.io.Serializable;
import com.yxcorp.gifshow.commercial.api.web.AdYodaConfig$a;
import nsd.u;
import java.lang.Object;

public final class AdYodaConfig implements Serializable	// class@001126
{
    public long mAdClickTime;
    public int mAdPosition;
    public boolean mAutoRegisterFragmentLifecycle;
    public boolean mDisableLandingPageDeepLink;
    public long mEnterTime;
    public int mEntrySource;
    public BaseFeed mFeed;
    public boolean mIsPreload;
    public AdDataWrapper$AdLogParamAppender mLogParamAppender;
    public boolean mNeedCheckOverScroll;
    public boolean mNotifyAdWebViewVisibleChanged;
    public String mReferer;
    public boolean mShouldAddAvatarHeadInfo;
    public boolean mShouldDisplayPlayableSplashPopup;
    public String mUrl;
    public int mWebSource;
    public int mWebViewType;
    public static final AdYodaConfig$a Companion;
    public static final long serialVersionUID;

    static {
       AdYodaConfig.Companion = new AdYodaConfig$a(null);
    }
    public void AdYodaConfig(){
       super();
       this.mAutoRegisterFragmentLifecycle = true;
    }
    public static void getMAdPosition$annotations(){
    }
    public static void getMEntrySource$annotations(){
    }
    public static void getMWebSource$annotations(){
    }
    public static void getMWebViewType$annotations(){
    }
}
