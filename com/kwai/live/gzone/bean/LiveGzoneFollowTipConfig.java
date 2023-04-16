package com.kwai.live.gzone.bean.LiveGzoneFollowTipConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveGzoneFollowTipConfig implements Serializable	// class@000c6f
{
    public long mDanmakuStayOnScreenDuringTimeMs;
    public long mNoOperationCloseDuringTimeMs;
    public boolean mStrategyMutuallyExclusive;
    public String mUserFollowLiveTipContent;
    public long mUserFullScreenWatchTimeMs;
    public long mUserMinimumWatchTimeInRoomMs;
    public static final long serialVersionUID = 0x1fba4ef20a4493ef;

    public void LiveGzoneFollowTipConfig(){
       super();
    }
}
