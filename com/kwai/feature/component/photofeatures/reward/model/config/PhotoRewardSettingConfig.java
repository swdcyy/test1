package com.kwai.feature.component.photofeatures.reward.model.config.PhotoRewardSettingConfig;
import java.io.Serializable;
import java.lang.Object;

public class PhotoRewardSettingConfig implements Serializable	// class@001239
{
    public int mBubbleMaxCount;
    public boolean mEnableAddComment;
    public String mGiftAndLevelAnimation;
    public int mHoverAnimationThreshold;
    public String mLevelAnimationUrl;
    public PhotoRewardSettingConfig$RewardSetting mRewardSetting;
    public static final long serialVersionUID = 0x754cef38b66068c2;

    public void PhotoRewardSettingConfig(){
       super();
       this.mHoverAnimationThreshold = 0x2710;
    }
}
