package com.kwai.video.player.kwai_player.KwaiPlayerAspectAwesomeCache;
import com.kwai.video.player.kwai_player.AspectAwesomeCache;
import com.kwai.video.player.kwai_player.IBuildKwaiPlayer;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.video.cache.AwesomeCacheCallback;
import com.kwai.video.cache.CacheSessionListener;
import java.lang.IllegalStateException;
import com.kwai.video.hodor.logEvent.CdnStatEvent;
import java.lang.Boolean;
import com.kwai.video.cache.HttpResponseErrorCallback;
import com.kwai.video.player.kwai_player.KwaiPlayerAspectAwesomeCache$1;
import java.lang.ref.WeakReference;

public class KwaiPlayerAspectAwesomeCache implements AspectAwesomeCache	// class@000b3b
{
    public AwesomeCacheCallback mAwesomeCacheCallback;
    public CacheSessionListener mCacheSessionListener;
    public CacheSessionListener mCacheSessionListenerInnerBridge;
    public CdnStatEvent mCdnStatEvent;
    public HttpResponseErrorCallback mHttpResponseErrorCallback;
    public final IBuildKwaiPlayer mPlayer;

    public void KwaiPlayerAspectAwesomeCache(IBuildKwaiPlayer p0,boolean p1){
       super();
       this.mPlayer = p0;
       if (p1) {
          p0.setOption(4, "cache-enabled", 1);
       }else {
          p0.setOption(4, "cache-enabled", 0);
       }
       return;
    }
    public void release(){
       this.mAwesomeCacheCallback = null;
       this.mHttpResponseErrorCallback = null;
    }
    public void setAegonMTRequestDelayTime(int p0){
       KwaiPlayerAspectAwesomeCache kwaiPlayerAs = KwaiPlayerAspectAwesomeCache.class;
       if (PatchProxy.isSupport(kwaiPlayerAs) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiPlayerAs, "24")) {
          return;
       }
       kwaiPlayerAs = this.mPlayer;
       long l = (p0 < 0)? -1: (long)p0;
       kwaiPlayerAs.setOption(1, "mt_request_delay_ms", l);
       return;
    }
    public void setAwesomeCacheCallback(AwesomeCacheCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPlayerAspectAwesomeCache.class, "30")) {
          return;
       }
       this.mAwesomeCacheCallback = p0;
       this.mPlayer.setAwesomeCacheCallback(p0);
       return;
    }
    public void setBufferedDataSourceSizeKB(int p0){
       KwaiPlayerAspectAwesomeCache kwaiPlayerAs = KwaiPlayerAspectAwesomeCache.class;
       if (PatchProxy.isSupport(kwaiPlayerAs) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiPlayerAs, "7")) {
          return;
       }
       this.mPlayer.setOption(1, "buffered-datasource-size-kb", (long)p0);
       return;
    }
    public void setCacheDownloadConnectTimeoutMs(int p0){
       KwaiPlayerAspectAwesomeCache kwaiPlayerAs = KwaiPlayerAspectAwesomeCache.class;
       if (PatchProxy.isSupport(kwaiPlayerAs) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiPlayerAs, "4")) {
          return;
       }
       this.mPlayer.setOption(1, "cache-connect-timeout-ms", (long)p0);
       return;
    }
    public void setCacheDownloadReadTimeoutMs(int p0){
       KwaiPlayerAspectAwesomeCache kwaiPlayerAs = KwaiPlayerAspectAwesomeCache.class;
       if (PatchProxy.isSupport(kwaiPlayerAs) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiPlayerAs, "5")) {
          return;
       }
       this.mPlayer.setOption(1, "cache-read-timeout-ms", (long)p0);
       return;
    }
    public void setCacheKey(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPlayerAspectAwesomeCache.class, "2")) {
          return;
       }
       this.mPlayer.setOption(4, "cache-key", p0);
       return;
    }
    public void setCacheMode(int p0){
       KwaiPlayerAspectAwesomeCache kwaiPlayerAs = KwaiPlayerAspectAwesomeCache.class;
       if (PatchProxy.isSupport(kwaiPlayerAs) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiPlayerAs, "3")) {
          return;
       }
       this.mPlayer.setOption(1, "cache-mode", (long)p0);
       return;
    }
    public void setCacheProgressCallbackIntervalMs(int p0){
       KwaiPlayerAspectAwesomeCache kwaiPlayerAs = KwaiPlayerAspectAwesomeCache.class;
       if (PatchProxy.isSupport(kwaiPlayerAs) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiPlayerAs, "11")) {
          return;
       }
       this.mPlayer.setOption(1, "progress_cb_interval_ms", (long)p0);
       return;
    }
    public void setCacheSessionListener(CacheSessionListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPlayerAspectAwesomeCache.class, "29")) {
          return;
       }
       if (this.mCacheSessionListener != null) {
          throw new IllegalStateException("should not setCacheSessionListener twice");
       }
       this.mCacheSessionListener = p0;
       this.setupListener();
       return;
    }
    public void setCacheSocketBufferSizeKb(int p0){
       KwaiPlayerAspectAwesomeCache kwaiPlayerAs = KwaiPlayerAspectAwesomeCache.class;
       if (PatchProxy.isSupport(kwaiPlayerAs) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiPlayerAs, "9")) {
          return;
       }
       this.mPlayer.setOption(1, "cache-socket-buf-size-kb", (long)p0);
       return;
    }
    public void setCacheUpstreamType(int p0){
       KwaiPlayerAspectAwesomeCache kwaiPlayerAs = KwaiPlayerAspectAwesomeCache.class;
       if (PatchProxy.isSupport(kwaiPlayerAs) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiPlayerAs, "6")) {
          return;
       }
       this.mPlayer.setOption(1, "cache-upstream-type", (long)p0);
       return;
    }
    public void setCdnStatEvent(CdnStatEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPlayerAspectAwesomeCache.class, "32")) {
          return;
       }
       this.mCdnStatEvent = p0;
       this.mPlayer.setCdnStatEvent(p0);
       return;
    }
    public void setDataSourceSeekReopenThresholdKB(int p0){
       KwaiPlayerAspectAwesomeCache kwaiPlayerAs = KwaiPlayerAspectAwesomeCache.class;
       if (PatchProxy.isSupport(kwaiPlayerAs) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiPlayerAs, "8")) {
          return;
       }
       this.mPlayer.setOption(1, "datasource-seek-reopen-threshold-kb", (long)p0);
       return;
    }
    public void setDisableHodorCache(boolean p0){
       KwaiPlayerAspectAwesomeCache kwaiPlayerAs = KwaiPlayerAspectAwesomeCache.class;
       if (PatchProxy.isSupport(kwaiPlayerAs) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kwaiPlayerAs, "26")) {
          return;
       }
       kwaiPlayerAs = this.mPlayer;
       long l = (p0)? 1: 0;
       kwaiPlayerAs.setOption(1, "disable_hodor_cache", l);
       return;
    }
    public void setEnableHodorDownloadDebug(boolean p0){
       KwaiPlayerAspectAwesomeCache kwaiPlayerAs = KwaiPlayerAspectAwesomeCache.class;
       if (PatchProxy.isSupport(kwaiPlayerAs) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kwaiPlayerAs, "28")) {
          return;
       }
       kwaiPlayerAs = this.mPlayer;
       long l = (p0)? 1: 0;
       kwaiPlayerAs.setOption(1, "enable_hodor_download_debug", l);
       return;
    }
    public void setEnableRetryForForbiddenError(boolean p0){
       KwaiPlayerAspectAwesomeCache kwaiPlayerAs = KwaiPlayerAspectAwesomeCache.class;
       if (PatchProxy.isSupport(kwaiPlayerAs) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kwaiPlayerAs, "27")) {
          return;
       }
       kwaiPlayerAs = this.mPlayer;
       long l = (p0)? 1: 0;
       kwaiPlayerAs.setOption(1, "enable_retry_for_forbidden_error", l);
       return;
    }
    public void setHlsP2spMode(int p0){
       KwaiPlayerAspectAwesomeCache kwaiPlayerAs = KwaiPlayerAspectAwesomeCache.class;
       if (PatchProxy.isSupport(kwaiPlayerAs) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiPlayerAs, "13")) {
          return;
       }
       this.mPlayer.setOption(1, "hls_p2sp_mode", (long)p0);
       return;
    }
    public void setHodorCdnLogExtraMsg(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPlayerAspectAwesomeCache.class, "25")) {
          return;
       }
       this.mPlayer.setOption(1, "extra_msg", p0);
       return;
    }
    public void setHodorTaskRetryType(int p0){
       KwaiPlayerAspectAwesomeCache kwaiPlayerAs = KwaiPlayerAspectAwesomeCache.class;
       if (PatchProxy.isSupport(kwaiPlayerAs) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiPlayerAs, "23")) {
          return;
       }
       this.mPlayer.setOption(1, "hodor_task_retry_type", (long)p0);
       return;
    }
    public void setHttpResponseErrorCallback(HttpResponseErrorCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPlayerAspectAwesomeCache.class, "31")) {
          return;
       }
       this.mHttpResponseErrorCallback = p0;
       this.mPlayer.setHttpResponseErrorCallback(p0);
       return;
    }
    public void setMaxSpeedKbps(int p0){
       KwaiPlayerAspectAwesomeCache kwaiPlayerAs = KwaiPlayerAspectAwesomeCache.class;
       if (PatchProxy.isSupport(kwaiPlayerAs) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiPlayerAs, "10")) {
          return;
       }
       this.mPlayer.setOption(1, "max-speed-kbps", (long)p0);
       return;
    }
    public void setUnifyHodorCdnLog(boolean p0){
    }
    public void setVodP2spCdnRequestInitialSize(int p0){
       KwaiPlayerAspectAwesomeCache kwaiPlayerAs = KwaiPlayerAspectAwesomeCache.class;
       if (PatchProxy.isSupport(kwaiPlayerAs) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiPlayerAs, "19")) {
          return;
       }
       this.mPlayer.setOption(1, "vod-p2sp-cdn-request-initial-size", (long)p0);
       return;
    }
    public void setVodP2spCdnRequestMaxSize(int p0){
       KwaiPlayerAspectAwesomeCache kwaiPlayerAs = KwaiPlayerAspectAwesomeCache.class;
       if (PatchProxy.isSupport(kwaiPlayerAs) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiPlayerAs, "18")) {
          return;
       }
       this.mPlayer.setOption(1, "vod-p2sp-cdn-request-max-size", (long)p0);
       return;
    }
    public void setVodP2spDisable(){
       if (PatchProxy.applyVoid(null, this, KwaiPlayerAspectAwesomeCache.class, "12")) {
          return;
       }
       this.mPlayer.setOption(1, "vod-p2sp-disable", "1");
       return;
    }
    public void setVodP2spHoleIgnoreSpeedcal(boolean p0){
       KwaiPlayerAspectAwesomeCache kwaiPlayerAs = KwaiPlayerAspectAwesomeCache.class;
       if (PatchProxy.isSupport(kwaiPlayerAs) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kwaiPlayerAs, "22")) {
          return;
       }
       kwaiPlayerAs = this.mPlayer;
       long l = (p0)? 1: 0;
       kwaiPlayerAs.setOption(1, "vod-p2sp-hole-ignore-speedcal", l);
       return;
    }
    public void setVodP2spOffThreshold(int p0){
       KwaiPlayerAspectAwesomeCache kwaiPlayerAs = KwaiPlayerAspectAwesomeCache.class;
       if (PatchProxy.isSupport(kwaiPlayerAs) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiPlayerAs, "21")) {
          return;
       }
       this.mPlayer.setOption(1, "vod-p2sp-off-threshold", (long)p0);
       return;
    }
    public void setVodP2spOnThreshold(int p0){
       KwaiPlayerAspectAwesomeCache kwaiPlayerAs = KwaiPlayerAspectAwesomeCache.class;
       if (PatchProxy.isSupport(kwaiPlayerAs) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiPlayerAs, "20")) {
          return;
       }
       this.mPlayer.setOption(1, "vod-p2sp-on-threshold", (long)p0);
       return;
    }
    public void setVodP2spParams(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPlayerAspectAwesomeCache.class, "15")) {
          return;
       }
       this.mPlayer.setOption(1, "vod-p2sp-params", p0);
       return;
    }
    public void setVodP2spPolicy(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPlayerAspectAwesomeCache.class, "14")) {
          return;
       }
       this.mPlayer.setOption(1, "vod-p2sp-policy", p0);
       return;
    }
    public void setVodP2spTaskMaxSize(int p0){
       KwaiPlayerAspectAwesomeCache kwaiPlayerAs = KwaiPlayerAspectAwesomeCache.class;
       if (PatchProxy.isSupport(kwaiPlayerAs) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiPlayerAs, "17")) {
          return;
       }
       this.mPlayer.setOption(1, "vod-p2sp-task-max-size", (long)p0);
       return;
    }
    public void setVodP2spTaskVersion(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPlayerAspectAwesomeCache.class, "16")) {
          return;
       }
       this.mPlayer.setOption(1, "vod-p2sp-task-version", p0);
       return;
    }
    public void setupListener(){
       if (PatchProxy.applyVoid(null, this, KwaiPlayerAspectAwesomeCache.class, "1")) {
          return;
       }
       if (this.mCacheSessionListener != null) {
          this.mCacheSessionListenerInnerBridge = new KwaiPlayerAspectAwesomeCache$1(this);
          this.mPlayer.setupCacheSessionListener(new WeakReference(this.mCacheSessionListenerInnerBridge));
       }
       return;
    }
}
