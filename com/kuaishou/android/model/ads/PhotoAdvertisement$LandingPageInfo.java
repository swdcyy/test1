package com.kuaishou.android.model.ads.PhotoAdvertisement$LandingPageInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.android.model.ads.PhotoAdvertisement$LandingPageType;

public class PhotoAdvertisement$LandingPageInfo implements Serializable	// class@00098d
{
    public String mActionBarDisplayName;
    public long mActionBarShowTime;
    public List mAllowedDeeplinkPrefixList;
    public boolean mCommentTagVisible;
    public PhotoAdvertisement$LandingPageType mLandingPageStyle;
    public String mLandingPageTitle;
    public int mPopLandingPageHeightPct;
    public static final long serialVersionUID = 0x54c8f666dafba254;

    public void PhotoAdvertisement$LandingPageInfo(){
       super();
       this.mLandingPageStyle = PhotoAdvertisement$LandingPageType.START_NEW_WEB;
    }
}
