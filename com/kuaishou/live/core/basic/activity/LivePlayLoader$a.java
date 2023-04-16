package com.kuaishou.live.core.basic.activity.LivePlayLoader$a;
import com.kwai.video.waynelive.listeners.LivePlayerRenderListener;
import com.kuaishou.live.core.basic.activity.LivePlayLoader;
import java.lang.Object;
import jw7.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pp.c;
import com.kuaishou.android.live.log.b;
import yj3.b;
import en8.a;

public class LivePlayLoader$a implements LivePlayerRenderListener	// class@001813
{
    public final LivePlayLoader b;

    public void LivePlayLoader$a(LivePlayLoader p0){
       this.b = p0;
       super();
    }
    public void onAudioRenderingStart(){
       a.a(this);
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
       LivePlayLoader b;
       if (PatchProxy.applyVoid(null, this, LivePlayLoader$a.class, "1")) {
          return;
       }
       LivePlayLoader$a tb = this.b;
       b.c0(tb.a, "setAfterRenderTaskDispatcherLoopDurantion", "liveStreamId", tb.j);
       b = this.b.b;
       if (b != null) {
          b.c(b.a());
       }
       return;
    }
}
