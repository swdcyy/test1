package com.kwai.social.startup.reminder.model.ShareIMIntimacyConfig;
import java.lang.Object;

public class ShareIMIntimacyConfig	// class@000f78
{
    public int mIntimacySelectCount;
    public int mRecentSendDayThreshold;
    public int mRecentShareDayThreshold;

    public void ShareIMIntimacyConfig(){
       super();
       this.mIntimacySelectCount = 4;
       this.mRecentSendDayThreshold = 7;
       this.mRecentShareDayThreshold = 60;
    }
}
