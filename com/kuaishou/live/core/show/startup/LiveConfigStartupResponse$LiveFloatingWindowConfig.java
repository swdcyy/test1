package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFloatingWindowConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveConfigStartupResponse$LiveFloatingWindowConfig implements Serializable	// class@00103e
{
    public boolean mDisableLiveFloatingWindow;
    public long mPollStatusIntervalMs;

    public void LiveConfigStartupResponse$LiveFloatingWindowConfig(){
       super();
       this.mPollStatusIntervalMs = 3000;
       this.mDisableLiveFloatingWindow = false;
    }
}
