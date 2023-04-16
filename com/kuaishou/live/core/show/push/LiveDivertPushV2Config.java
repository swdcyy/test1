package com.kuaishou.live.core.show.push.LiveDivertPushV2Config;
import java.io.Serializable;
import java.lang.Object;

public class LiveDivertPushV2Config implements Serializable	// class@000e00
{
    public long mMaxShowTimesInOneDay;
    public long mPushShowIntervalInMs;
    public static final long serialVersionUID = 0xee4157858236610b;

    public void LiveDivertPushV2Config(){
       super();
       this.mPushShowIntervalInMs = 0x1b7740;
       this.mMaxShowTimesInOneDay = 3;
    }
}
