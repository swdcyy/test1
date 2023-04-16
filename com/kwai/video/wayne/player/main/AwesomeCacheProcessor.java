package com.kwai.video.wayne.player.main.AwesomeCacheProcessor;
import com.kwai.video.wayne.player.main.AbsKpMidProcessor;
import com.kwai.video.wayne.player.CacheReceipt;
import java.util.concurrent.atomic.AtomicBoolean;
import com.kwai.video.wayne.player.main.AwesomeCacheProcessor$1;
import com.kwai.video.wayne.player.main.AwesomeCacheProcessor$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONObject;
import com.kwai.video.wayne.player.main.WaynePlayer;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.video.wayne.player.builder.WayneVideoContext;
import com.kwai.video.wayne.player.logreport.LogReport;
import com.kwai.video.wayne.player.logreport.IKSLogReport;
import com.kwai.video.wayne.player.WayneContext;
import java.lang.Enum;
import com.kwai.video.wayne.player.util.DebugLog;
import java.lang.Long;
import com.kwai.video.wayne.player.KSVodNativeCache;
import com.kwai.video.wayne.player.InjectHelper;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.video.cache.AwesomeCacheCallback;
import com.kwai.video.wayne.player.main._2_AbstractPlayerListenerDelegate;
import com.kwai.video.wayne.player.listeners.OnPlayerLoadingChangedListener;
import com.kwai.video.wayne.player.listeners.CacheListener;

public class AwesomeCacheProcessor extends AbsKpMidProcessor	// class@000d52
{
    public String TAG;
    public AwesomeCacheCallback awesomeCacheCallback;
    public AcCallBackInfo mAcCallBackInfo;
    public boolean mCompletedCalled;
    public AtomicBoolean mIsAborted;
    public CacheListener mListener;
    public CacheReceipt mReceipt;
    public OnPlayerLoadingChangedListener onPlayerLoadingChangedListener;

    public void AwesomeCacheProcessor(){
       super();
       this.mReceipt = new CacheReceipt();
       this.mCompletedCalled = false;
       this.TAG = "AwesomeCacheProcessor";
       this.mIsAborted = new AtomicBoolean(false);
       this.onPlayerLoadingChangedListener = new AwesomeCacheProcessor$1(this);
       this.awesomeCacheCallback = new AwesomeCacheProcessor$2(this);
    }
    public final void abort(){
       if (PatchProxy.applyVoid(null, this, AwesomeCacheProcessor.class, "6")) {
          return;
       }
       this.mIsAborted.set(true);
       return;
    }
    public boolean isSubtitleType(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AwesomeCacheProcessor.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (TextUtils.isEmpty(p0)) {
          return b;
       }
       if (!(p0.toLowerCase()).contains(".vtt") && ((p0.toLowerCase()).contains(".srt") || (p0.toLowerCase()).contains(".ass"))) {
          b = true;
       }
       return b;
    }
    public void logCdnStatJson(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AwesomeCacheProcessor.class, "4")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       try{
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("qos", p0);
          JSONObject jSONObject1 = new JSONObject();
          jSONObject1.put("rank", 0);
          if (this.getMediaPlayer().getBuildData().mVideoContext != null) {
             jSONObject1.put("video_id", this.getMediaPlayer().getBuildData().mVideoContext.mVideoId);
             jSONObject1.put("page_name", this.getMediaPlayer().getBuildData().mVideoContext.mPageName);
          }
          jSONObject1.put("resource_type", "VIDEO");
          jSONObject.put("stats", jSONObject1.toString());
          LogReport.get().getLogger().logEvent(WayneContext.app.name(), "VP_CDN_RESOURCE", jSONObject.toString(), true);
       }catch(java.lang.Exception e0){
          DebugLog.e(this.TAG, "logCdnStatJson when player released");
       }
       return;
    }
    public boolean notifyPreloadNextVideo(long p0){
       AwesomeCacheProcessor uAwesomeCach = AwesomeCacheProcessor.class;
       if (PatchProxy.isSupport(uAwesomeCach)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uAwesomeCach, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.mIsAborted.get()) {
          DebugLog.d(this.TAG, "notifyPreloadNextVideo return");
          return false;
       }else {
          try{
             long cachedSizeWi = KSVodNativeCache.getCachedSizeWithUrl(this.getMediaPlayer().getBuildData().getDataSource());
             if (p0 <= 0) {
                p0 = cachedSizeWi;
             }
             if (p0 - InjectHelper.getInstance().getPlayerLoadThreadhold() >= 0 || (KSVodNativeCache.isFullyCached(this.getMediaPlayer().getBuildData().getDataSource()) && this.getMediaPlayer().getKernelPlayer() != null)) {
                this.getMediaPlayer().getKernelPlayer().notifyKwaiOnInfo(0x11171, (int)p0);
             }
             return true;
          }catch(java.lang.NullPointerException e0){
             DebugLog.e(this.TAG, "notifyPreloadNextVideo when player released");
             return false;
          }
       }
    }
    public void onAttach(){
       if (PatchProxy.applyVoid(null, this, AwesomeCacheProcessor.class, "1")) {
          return;
       }
       this.getMediaPlayer().addAwesomeCallBack(this.awesomeCacheCallback);
       this.getMediaPlayer().addOnPlayerLoadingChangedListener(this.onPlayerLoadingChangedListener);
       return;
    }
    public void onDetach(){
       if (PatchProxy.applyVoid(null, this, AwesomeCacheProcessor.class, "2")) {
          return;
       }
       this.abort();
       this.getMediaPlayer().removeAwesomeCallBack(this.awesomeCacheCallback);
       this.getMediaPlayer().removeOnPlayerLoadingChangedListener(this.onPlayerLoadingChangedListener);
       return;
    }
    public void setCacheSessionListener(CacheListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AwesomeCacheProcessor.class, "7")) {
          return;
       }
       this.mListener = p0;
       if (p0 == null) {
          this.abort();
       }
       return;
    }
}
