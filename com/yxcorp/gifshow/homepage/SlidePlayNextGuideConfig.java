package com.yxcorp.gifshow.homepage.SlidePlayNextGuideConfig;
import java.io.Serializable;
import java.lang.Object;

public final class SlidePlayNextGuideConfig implements Serializable	// class@0016a0
{
    public int mCountdownTime;
    public int mMaxShowNumber;
    public int mMaxShowNumberOfPerDay;
    public long mPopShowDuration;
    public long mRetentionTime;
    public int mShowOnceMinInterval;
    public SlidePlayNextGuideConfig mSlideShareNextGuideConfig;
    public int mStartTime;

    public void SlidePlayNextGuideConfig(){
       super();
       this.mPopShowDuration = 3000;
    }
    public final long getMRetentionTime(){
       return this.mRetentionTime;
    }
    public final SlidePlayNextGuideConfig getMSlideShareNextGuideConfig(){
       return this.mSlideShareNextGuideConfig;
    }
    public final int getMStartTime(){
       return this.mStartTime;
    }
    public final void setMRetentionTime(long p0){
       this.mRetentionTime = p0;
    }
    public final void setMSlideShareNextGuideConfig(SlidePlayNextGuideConfig p0){
       this.mSlideShareNextGuideConfig = p0;
    }
    public final void setMStartTime(int p0){
       this.mStartTime = p0;
    }
}
