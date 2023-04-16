package com.kwai.live.gzone.bean.LiveGzoneActivityBanner;
import java.io.Serializable;
import java.lang.Object;

public class LiveGzoneActivityBanner implements Serializable	// class@000c6b
{
    public int mBannerCloseType;
    public String mBannerId;
    public String mBannerName;
    public String mContentLink;
    public boolean mEnableEnterUnfold;
    public boolean mEnableHalfUnfoldInteraction;
    public boolean mEnableImageBanner;
    public boolean mEnableUnfoldAutoRefresh;
    public CDNUrl[] mImageBannerUrls;
    public int mMaxDisplayTimes;
    public String mUnfoldButtonText;
    public CDNUrl[] mUnfoldButtonUrls;
    public float mWidthHeightRatio;
    public static final long serialVersionUID = 0xb5bc4b6d4d602c96;

    public void LiveGzoneActivityBanner(){
       super();
    }
}
