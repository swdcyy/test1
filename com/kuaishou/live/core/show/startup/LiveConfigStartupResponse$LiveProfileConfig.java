package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveProfileConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveConfigStartupResponse$LiveProfileConfig implements Serializable	// class@001064
{
    public boolean mEnableNewLiveProfileCard;
    public boolean mEnableWatchAnchorNewProfileCard;
    public int mLiveProfileMaxCacheUserProductCount;
    public static final long serialVersionUID = 0xb2c80e9b57a73050;

    public void LiveConfigStartupResponse$LiveProfileConfig(){
       super();
       this.mLiveProfileMaxCacheUserProductCount = 3;
    }
}
