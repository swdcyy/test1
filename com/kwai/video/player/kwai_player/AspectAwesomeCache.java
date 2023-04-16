package com.kwai.video.player.kwai_player.AspectAwesomeCache;
import com.kwai.video.cache.AwesomeCacheCallback;
import java.lang.String;
import com.kwai.video.cache.CacheSessionListener;
import com.kwai.video.hodor.logEvent.CdnStatEvent;
import com.kwai.video.cache.HttpResponseErrorCallback;

public interface abstract AspectAwesomeCache	// class@000b28
{

    void release();
    void setAegonMTRequestDelayTime(int p0);
    void setAwesomeCacheCallback(AwesomeCacheCallback p0);
    void setBufferedDataSourceSizeKB(int p0);
    void setCacheDownloadConnectTimeoutMs(int p0);
    void setCacheDownloadReadTimeoutMs(int p0);
    void setCacheKey(String p0);
    void setCacheMode(int p0);
    void setCacheProgressCallbackIntervalMs(int p0);
    void setCacheSessionListener(CacheSessionListener p0);
    void setCacheSocketBufferSizeKb(int p0);
    void setCacheUpstreamType(int p0);
    void setCdnStatEvent(CdnStatEvent p0);
    void setDataSourceSeekReopenThresholdKB(int p0);
    void setDisableHodorCache(boolean p0);
    void setEnableHodorDownloadDebug(boolean p0);
    void setEnableRetryForForbiddenError(boolean p0);
    void setHlsP2spMode(int p0);
    void setHodorCdnLogExtraMsg(String p0);
    void setHodorTaskRetryType(int p0);
    void setHttpResponseErrorCallback(HttpResponseErrorCallback p0);
    void setMaxSpeedKbps(int p0);
    void setUnifyHodorCdnLog(boolean p0);
    void setVodP2spCdnRequestInitialSize(int p0);
    void setVodP2spCdnRequestMaxSize(int p0);
    void setVodP2spDisable();
    void setVodP2spHoleIgnoreSpeedcal(boolean p0);
    void setVodP2spOffThreshold(int p0);
    void setVodP2spOnThreshold(int p0);
    void setVodP2spParams(String p0);
    void setVodP2spPolicy(String p0);
    void setVodP2spTaskMaxSize(int p0);
    void setVodP2spTaskVersion(String p0);
}
