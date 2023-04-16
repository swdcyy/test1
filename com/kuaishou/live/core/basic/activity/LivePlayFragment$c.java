package com.kuaishou.live.core.basic.activity.LivePlayFragment$c;
import com.kwai.video.waynelive.listeners.LivePlayerRenderListener;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import p91.m;
import com.kuaishou.live.basic.model.StreamType;
import com.kwai.performance.fluency.page.monitor.PageMonitor;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import jw7.a;
import z12.n;
import kuaishou.perf.page.impl.b;

public class LivePlayFragment$c implements LivePlayerRenderListener	// class@00180f
{
    public final LivePlayFragment b;

    public void LivePlayFragment$c(LivePlayFragment p0){
       this.b = p0;
       super();
    }
    public void onAudioRenderingStart(){
       if (PatchProxy.applyVoid(null, this, LivePlayFragment$c.class, "2")) {
          return;
       }
       LivePlayFragment k = this.b.K;
       if (k != null && k.Z2.B0() == StreamType.AUDIO.toInt()) {
          PageMonitor.INSTANCE.trackPageRequestEnd(this.b.getActivity());
       }
       return;
    }
    public void onLivePlayViewShow(){
       a.b(this);
    }
    public void onRenderingStartAfterResume(){
       a.c(this);
    }
    public void onSwitchToAudioStreamFromVideoStream(){
       a.d(this);
    }
    public void onSwitchToVideoStreamFromAudioStream(){
       a.e(this);
    }
    public void onVideoRenderingStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LivePlayFragment$c.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, objArray, n.class, "2")) {
          b.d("live_click_to_destroy").h("PageClickToPlayerRenderedDuration");
       }
       PageMonitor.INSTANCE.trackPageRequestEnd(this.b.getActivity());
       return;
    }
}
