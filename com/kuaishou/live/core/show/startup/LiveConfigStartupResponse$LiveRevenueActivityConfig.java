package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveRevenueActivityConfig;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveRevenueActivityConfig$LiveRevenueActivityPendantConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveRevenueActivityConfig$LiveEnterRoomConfig;

public class LiveConfigStartupResponse$LiveRevenueActivityConfig implements Serializable	// class@001077
{
    public LiveConfigStartupResponse$LiveRevenueActivityConfig$LiveEnterRoomConfig mLiveEnterRoomConfig;
    public LiveConfigStartupResponse$LiveRevenueActivityConfig$LiveRevenueActivityPendantConfig mPendantConfig;
    public static final long serialVersionUID = 0xbe10ce6c24181d5b;

    public void LiveConfigStartupResponse$LiveRevenueActivityConfig(){
       super();
       this.mPendantConfig = new LiveConfigStartupResponse$LiveRevenueActivityConfig$LiveRevenueActivityPendantConfig();
       this.mLiveEnterRoomConfig = new LiveConfigStartupResponse$LiveRevenueActivityConfig$LiveEnterRoomConfig();
    }
}
