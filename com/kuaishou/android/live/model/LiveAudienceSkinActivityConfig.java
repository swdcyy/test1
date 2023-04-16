package com.kuaishou.android.live.model.LiveAudienceSkinActivityConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveAudienceSkinActivityConfig implements Serializable	// class@0007e5
{
    public String mActivityLiveEndText;
    public String mActivityName;
    public CDNUrl[] mCoverActivityCDNUrls;
    public boolean mEnableGiftWheel;
    public boolean mEnableHorizontalScreen;
    public boolean mEnableHorizontalScreenBarrage;
    public boolean mEnableRequestChainLiveInfo;
    public boolean mEnableRequestUserStatus;
    public String mLiveMarkText;
    public long mMaxDelayGetPlayUrlActivityMillis;
    public long mMaxDelayMsGetLivingWidgets;
    public int mProgramListUrlPopMode;
    public String mProgrammeListUrl;
    public float mSendCommentRatio;
    public float mSendLikeRatio;
    public int mShowGiftSlotCount;
    public CDNUrl[] mSkinBannerCDNUrls;
    public CDNUrl[] mSkinCoverCDNUrls;
    public CDNUrl[] mSkinLiveMarkCDNUrls;
    public static final long serialVersionUID = 0x46206fbefac41da7;

    public void LiveAudienceSkinActivityConfig(){
       super();
       this.mEnableHorizontalScreen = false;
       this.mEnableHorizontalScreenBarrage = false;
       this.mEnableRequestChainLiveInfo = false;
       this.mShowGiftSlotCount = 1;
       this.mSendCommentRatio = 0x3f800000;
       this.mSendLikeRatio = 0x3f800000;
       this.mMaxDelayGetPlayUrlActivityMillis = 0x2710;
    }
}
