package com.kwai.library.dynamic_prefetcher.data.config.HodorInitConfig;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public class HodorInitConfig	// class@00081c
{
    public int mCheckPreloadDelayTimeMs;
    public boolean mEnableVodAdaptive;
    public boolean mEnableVodCacheMsThreshold;
    public float mNetSpeedAdjustThreshold;
    public int mPreloadStrategy;
    public float mVodBufferLowRatio;
    public int mVodBufferReachMsThreshold;
    public int mVodCacheKbThreshold;
    public int mVodCacheMsThreshold;
    public int mVodPausePreloadMaxCount;

    public void HodorInitConfig(){
       super();
       this.mVodCacheKbThreshold = 600;
       this.mPreloadStrategy = 1;
       this.mVodBufferReachMsThreshold = 2500;
       this.mVodCacheMsThreshold = 3500;
       this.mVodBufferLowRatio = 0x3f19999a;
       this.mEnableVodCacheMsThreshold = false;
       this.mVodPausePreloadMaxCount = 5;
       this.mCheckPreloadDelayTimeMs = -1;
       this.mEnableVodAdaptive = false;
       this.mNetSpeedAdjustThreshold = 0;
    }
    public String toString(){
       return "{vodCacheKbThreshold = "+this.mVodCacheKbThreshold+", preloadStrategy = "+this.mPreloadStrategy+", vodBufferReachMsThreshold = "+this.mVodBufferReachMsThreshold+", vodCacheMsThreshold = "+this.mVodCacheMsThreshold+", vodBufferLowRatio = "+this.mVodBufferLowRatio+", enableVodCacheMsThreshold = "+this.mEnableVodCacheMsThreshold+", vodPausePreloadMaxCount = "+this.mVodPausePreloadMaxCount+", checkPreloadDelayTimeMs = "+this.mCheckPreloadDelayTimeMs+", enableVodAdaptive="+this.mEnableVodAdaptive+", netSpeedAdjustThreshold="+this.mNetSpeedAdjustThreshold+'}';
    }
}
