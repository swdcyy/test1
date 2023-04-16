package com.kwai.social.startup.reminder.model.ShareActiveSessionIMConfig;
import java.io.Serializable;
import java.lang.Object;

public class ShareActiveSessionIMConfig implements Serializable	// class@000f74
{
    public int mActiveSessionDayThreshold;

    public void ShareActiveSessionIMConfig(){
       super();
       this.mActiveSessionDayThreshold = 30;
    }
}
