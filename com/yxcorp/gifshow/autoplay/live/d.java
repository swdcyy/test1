package com.yxcorp.gifshow.autoplay.live.d;
import com.kwai.video.waynelive.listeners.LivePlayerRenderListener;
import com.yxcorp.gifshow.autoplay.live.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import u99.d;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$b;
import jw7.a;

public class d implements LivePlayerRenderListener	// class@001c16
{
    public final c b;

    public void d(c p0){
       this.b = p0;
       super();
    }
    public void onAudioRenderingStart(){
       LiveAutoPlay d;
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       d.h("LiveAutoPlayController", "onAudioRenderingStart", this.b.C());
       d = this.b.d;
       if (d != null) {
          d.onAudioStart();
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
       LiveAutoPlay d;
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       d.h("LiveAutoPlayController", "onVideoRenderingStart", this.b.C());
       d = this.b.d;
       if (d != null) {
          d.onVideoStart();
       }
       return;
    }
}
