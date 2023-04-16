package com.kuaishou.gifshow.platform.network.keyconfig.PlayerConfig;
import java.io.Serializable;
import java.lang.Object;

public class PlayerConfig implements Serializable	// class@00087e
{
    public int mBitrateInitLevel;
    public int mDetailMaxResolution;
    public int mDetailMaxSpeedbps;
    public int mDownloadPercentThreshhold;
    public int mLongKeepInterval;
    public int mMaxBufferDurMs;
    public int mMaxResolution;
    public int mMaxSpeedbps;
    public String mPreferQuality;
    public int mShortKeepInterval;

    public void PlayerConfig(){
       super();
       this.mMaxBufferDurMs = 0xea60;
       this.mPreferQuality = "SUPER";
       this.mShortKeepInterval = 0x7530;
       this.mLongKeepInterval = 0x2bf20;
       this.mBitrateInitLevel = 12;
       this.mMaxResolution = 0x271000;
       this.mMaxSpeedbps = 0xa00000;
       this.mDetailMaxSpeedbps = 0xa00000;
       this.mDetailMaxResolution = 0x271000;
       this.mDownloadPercentThreshhold = 20;
    }
}
