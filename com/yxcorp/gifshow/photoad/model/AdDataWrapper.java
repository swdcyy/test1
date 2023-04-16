package com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import java.io.Serializable;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import mxb.j;
import java.lang.String;
import java.util.List;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppLinkToastInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$JumpLiveInfo;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrl;

public interface abstract AdDataWrapper implements Serializable	// class@000f9c
{

    boolean enableReplacePkgName();
    AdDataWrapper$AdLogParamAppender getAdLogParamAppender();
    j getAdLogWrapper();
    int getAdPosition();
    String getApkFileName();
    List getApkMd5s();
    String getAppIconUrl();
    PhotoAdvertisement$AppLinkToastInfo getAppLinkToastInfo();
    String getAppMarketUriStr();
    String getAppName();
    int getConversionType();
    boolean getDisableLandingPageDeepLink();
    int getDisplayType();
    int getDownloadSource();
    int getEvocationType();
    String getH5Url();
    PhotoAdvertisement$JumpLiveInfo getLiveStreamInfo();
    String getOriginUrl();
    String getPackageName();
    BaseFeed getPhoto();
    String getPhotoId();
    String getScheme();
    int getUnexpectedMd5Strategy();
    String getUrl();
    String getUserId();
    boolean isAd();
    boolean isAdUrlData();
    boolean isH5GameAd();
    void setCustomClickUrl(PhotoAdvertisement$ItemClickUrl p0);
    void setDisableLandingPageDeepLink(boolean p0);
    void setDisplaySplashPopUpOnWeb(boolean p0);
    void setPackageName(String p0);
    boolean shouldAlertNetMobile();
    boolean shouldDisplaySplashPopUpOnWeb();
    boolean shouldEnableVpnInterception();
    boolean usePriorityCard();
}
