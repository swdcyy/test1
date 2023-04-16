package com.kuaishou.live.common.core.component.watchtimer.LiveWatchTimerStartConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveWatchTimerStartConfig implements Serializable	// class@0017cd
{
    public String mBiz;
    public boolean mIsSupportBackground;
    public List mLiveTypes;
    public String mSource;
    public String mToken;
    public static final long serialVersionUID = 0x22a86bc745ea3041;

    public void LiveWatchTimerStartConfig(){
       super();
       this.mIsSupportBackground = true;
    }
}
