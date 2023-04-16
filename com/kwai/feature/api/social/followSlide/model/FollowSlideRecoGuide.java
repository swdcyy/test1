package com.kwai.feature.api.social.followSlide.model.FollowSlideRecoGuide;
import java.io.Serializable;
import java.lang.Object;

public class FollowSlideRecoGuide implements Serializable	// class@0010cf
{
    public boolean mEnableAutoNext;
    public boolean mFollowGuideV1HasShowed;
    public boolean mFollowGuideV2HasShowed;
    public boolean mHasShowed;
    public boolean mRecoGuideHasShowed;
    public long mShowDuration;
    public boolean mShowFromStart;
    public long mShowInterval;
    public String mTextType;
    public String mToastReason;
    public String mType;
    public static final long serialVersionUID = 0xc62f02c7d93da191;

    public void FollowSlideRecoGuide(){
       super();
       this.mHasShowed = false;
       this.mRecoGuideHasShowed = false;
       this.mFollowGuideV1HasShowed = false;
       this.mFollowGuideV2HasShowed = false;
    }
}
