package com.kwai.feature.api.social.reminder.push.BarConfig;
import java.lang.Object;

public final class BarConfig	// class@0011bd
{
    public final boolean enableShowGuideBar;
    public final long showBarAfterCloseIntervalSecond;
    public final int showBarMaxCloseCount;

    public void BarConfig(){
       super(false, false, 0);
    }
    public void BarConfig(boolean p0,int p1,long p2){
       super();
       this.enableShowGuideBar = p0;
       this.showBarMaxCloseCount = p1;
       this.showBarAfterCloseIntervalSecond = p2;
    }
}
