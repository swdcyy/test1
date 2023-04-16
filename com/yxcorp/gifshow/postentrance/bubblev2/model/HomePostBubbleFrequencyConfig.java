package com.yxcorp.gifshow.postentrance.bubblev2.model.HomePostBubbleFrequencyConfig;
import java.io.Serializable;
import com.yxcorp.gifshow.postentrance.bubblev2.model.HomePostBubbleFrequencyConfig$a;
import nsd.u;
import com.yxcorp.gifshow.postentrance.bubblev2.model.HomePostBubbleFrequencyConfig$Companion$defaultHomePostBubbleFrequencyConfig$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;

public final class HomePostBubbleFrequencyConfig implements Serializable	// class@00100c
{
    public int dailyShowTimes;
    public int lifeCycleShowTimes;
    public int showInterval;
    public static final HomePostBubbleFrequencyConfig$a Companion;
    public static final p defaultHomePostBubbleFrequencyConfig$delegate;

    static {
       HomePostBubbleFrequencyConfig.Companion = new HomePostBubbleFrequencyConfig$a(null);
       HomePostBubbleFrequencyConfig.defaultHomePostBubbleFrequencyConfig$delegate = s.c(HomePostBubbleFrequencyConfig$Companion$defaultHomePostBubbleFrequencyConfig$2.INSTANCE);
    }
    public void HomePostBubbleFrequencyConfig(){
       super();
       this.dailyShowTimes = 3;
       this.lifeCycleShowTimes = 2;
       this.showInterval = 60;
    }
    public final int getDailyShowTimes(){
       return this.dailyShowTimes;
    }
    public final int getLifeCycleShowTimes(){
       return this.lifeCycleShowTimes;
    }
    public final int getShowInterval(){
       return this.showInterval;
    }
    public final void setDailyShowTimes(int p0){
       this.dailyShowTimes = p0;
    }
    public final void setLifeCycleShowTimes(int p0){
       this.lifeCycleShowTimes = p0;
    }
    public final void setShowInterval(int p0){
       this.showInterval = p0;
    }
}
