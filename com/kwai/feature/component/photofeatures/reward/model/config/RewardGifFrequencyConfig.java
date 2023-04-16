package com.kwai.feature.component.photofeatures.reward.model.config.RewardGifFrequencyConfig;
import java.io.Serializable;
import java.lang.Object;

public class RewardGifFrequencyConfig implements Serializable	// class@00123a
{
    public long mIntervalNmin;
    public long mMaxTimesIn24H;
    public long mMaxTimesInNmin;
    public long mRewardHoverWaitMillisecond;

    public void RewardGifFrequencyConfig(){
       super();
       this.mIntervalNmin = 10;
       this.mMaxTimesInNmin = 1;
       this.mMaxTimesIn24H = 500;
       this.mRewardHoverWaitMillisecond = 5000;
    }
}
