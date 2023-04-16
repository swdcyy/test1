package com.kwai.library.dynamic_prefetcher.data.config.PrefetchConfig;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.Arrays;

public class PrefetchConfig	// class@00081d
{
    public d a;
    public d b;
    public a c;
    public a d;
    public b e;
    public b f;
    public c g;
    public boolean h;
    public boolean i;
    public int mBandWidthThreshold;
    public int mBandWidthThreshold4G;
    public String mCommonStrategyString;
    public String mCustomStrategyString;
    public int mDelayStartMs;
    public boolean mEnableHlsPrefetch;
    public boolean mEnablePrefetch;
    public int mFiltrationQueueLen;
    public String mGlobalConfigString;
    public HodorInitConfig mHodorInitConfig;
    public String mLowVVCommonStrategyString;
    public String mLowVVCustomStrategyString;
    public String mLowVVGlobalConfigString;
    public long[] mLowVVThreshold;
    public boolean mOnlyDetailPage;
    public String mP2spConfigString;
    public double mPctrThreshold;
    public long mPreloadMsFor4G;
    public long mPreloadMsForOtherNet;
    public long mPreloadMsForWiFi;

    public void PrefetchConfig(){
       super();
       this.mBandWidthThreshold = -1;
       this.mBandWidthThreshold4G = -1;
       this.mDelayStartMs = 1000;
       this.h = false;
       this.i = false;
    }
    public String toString(){
       return "PrefetchConfig = {mEnablePrefetch = "+this.mEnablePrefetch+", mEnableHlsPrefetch = "+this.mEnableHlsPrefetch+", mFiltrationQueueLen = "+this.mFiltrationQueueLen+", mPctrThreshold = "+this.mPctrThreshold+", mPreloadMsFor4G = "+this.mPreloadMsFor4G+", mPreloadMsForOtherNet = "+this.mPreloadMsForOtherNet+", mPreloadMsForWiFi = "+this.mPreloadMsForWiFi+", mBandWidthThreshold = "+this.mBandWidthThreshold+", mOnlyDetailPage = "+this.mOnlyDetailPage+", mBandWidthThreshold4G = "+this.mBandWidthThreshold4G+", mDelayStartMs = "+this.mDelayStartMs+", mHodorInitConfig = "+this.mHodorInitConfig+", mCommonStrategy = "+this.mCommonStrategyString+", mLowVVCommonStrategy = "+this.mLowVVCommonStrategyString+", mCustomStrategy = "+this.mCustomStrategyString+", mLowVVCustomStrategy = "+this.mLowVVCustomStrategyString+", mGlobalConfig = "+this.mGlobalConfigString+", mLowVVGlobalConfig = "+this.mLowVVGlobalConfigString+", mP2spConfig = "+this.mP2spConfigString+", mLowVVThreshold = "+Arrays.toString(this.mLowVVThreshold)+"}";
    }
}
