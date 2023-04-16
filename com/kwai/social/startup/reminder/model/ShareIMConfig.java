package com.kwai.social.startup.reminder.model.ShareIMConfig;
import java.lang.Object;

public class ShareIMConfig	// class@000f77
{
    public int mRecentDayThreshold;
    public int mRecentSessionCount;
    public int mShareCountThreshold;

    public void ShareIMConfig(){
       super();
       this.mShareCountThreshold = 1;
       this.mRecentDayThreshold = 15;
       this.mRecentSessionCount = 100;
    }
}
