package com.kwai.video.waynelive.wayneplayer.StaticsProcessor$onKernelPlayerCreated$1;
import com.kwai.video.player.IMediaPlayer$OnQosStatListener;
import com.kwai.video.waynelive.wayneplayer.StaticsProcessor;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import org.json.JSONObject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer;
import com.kwai.video.waynelive.wayneplayer.AbsWayneProcessor;
import com.kuaishou.android.live.model.LiveAdaptiveManifest;
import com.kwai.video.waynelive.wayneplayer.WayneTrace;
import java.lang.Exception;
import com.kwai.video.waynelive.debug.DebugLog;
import com.kwai.video.waynelive.listeners.LivePlayerQosLogListener;

public final class StaticsProcessor$onKernelPlayerCreated$1 implements IMediaPlayer$OnQosStatListener	// class@000e3a
{
    public final StaticsProcessor this$0;

    public void StaticsProcessor$onKernelPlayerCreated$1(StaticsProcessor p0){
       this.this$0 = p0;
       super();
    }
    public final void onQosStat(IMediaPlayer p0,JSONObject p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, StaticsProcessor$onKernelPlayerCreated$1.class, "1")) {
          return;
       }
       a.p(p0, "mp");
       String str = "jsonStat";
       try{
          a.p(p1, str);
          p1.put("play_session_id", this.this$0.getMediaPlayer().mPlaySessionId);
          p1.put("useWaynelive", "true");
          LiveAdaptiveManifest currentAdapt = this.this$0.getMediaPlayer().getCurrentAdaptiveManifest();
          a.o(currentAdapt, "mediaPlayer.currentAdaptiveManifest");
          p1.put("isTransformed", currentAdapt.isTransformed());
          p1.put("fallback_domain", this.this$0.getMediaPlayer().mFallbackDomain);
          p1.put("wayne_trace", this.this$0.getMediaPlayer().mKPMidTrace.getStrTrace());
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       this.this$0.addRetryInfo(p1);
       DebugLog.i(this.this$0.getLogTag(), "OnQosStatListener");
       StaticsProcessor mLivePlayerQ = this.this$0.mLivePlayerQosLogListener;
       if (mLivePlayerQ != null) {
          mLivePlayerQ.onQosStat(p1);
       }
       this.this$0.postLivePlayerQos(p1, false);
       return;
    }
}
