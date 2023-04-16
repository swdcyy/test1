package com.kwai.video.waynelive.wayneplayer.StaticsProcessor$AwesomeCacheCallbackInner;
import com.kwai.video.cache.AwesomeCacheCallback;
import com.kwai.video.waynelive.wayneplayer.StaticsProcessor;
import com.kwai.video.cache.AcCallBackInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonObject;
import java.lang.Long;
import java.lang.Number;
import com.kwai.video.waynelive.wayneplayer.logger.KSLiveVideoContext;
import kotlin.jvm.internal.a;
import com.google.gson.JsonElement;
import com.kwai.video.waynelive.wayneplayer.logger.KSLivePlayerLogUploader;

public final class StaticsProcessor$AwesomeCacheCallbackInner extends AwesomeCacheCallback	// class@000e38
{
    public final StaticsProcessor this$0;

    public void StaticsProcessor$AwesomeCacheCallbackInner(StaticsProcessor p0){
       this.this$0 = p0;
       super();
    }
    public void onDownloadFinish(AcCallBackInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StaticsProcessor$AwesomeCacheCallbackInner.class, "2")) {
          return;
       }
       AwesomeCacheCallback mCdnLoggerCa = this.this$0.getMCdnLoggerCallback();
       if (mCdnLoggerCa != null) {
          mCdnLoggerCa.onDownloadFinish(p0);
       }
       JsonObject jsonObject = new JsonObject();
       jsonObject.a0("play_start_time", Long.valueOf(this.this$0.mPlayStartTimeMs));
       jsonObject.c0("stream_id", this.this$0.mLiveVideoContext.liveStreamId);
       a.m(p0);
       jsonObject.c0("qos", p0.cdnStatJson);
       String str = jsonObject.toString();
       KSLivePlayerLogUploader.logEvent("VP_LIVE_NETWORK", str);
       return;
    }
    public void onSessionProgress(AcCallBackInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StaticsProcessor$AwesomeCacheCallbackInner.class, "1")) {
          return;
       }
       AwesomeCacheCallback mCdnLoggerCa = this.this$0.getMCdnLoggerCallback();
       if (mCdnLoggerCa != null) {
          mCdnLoggerCa.onSessionProgress(p0);
       }
       return;
    }
}
