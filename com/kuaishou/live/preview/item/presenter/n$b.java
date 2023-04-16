package com.kuaishou.live.preview.item.presenter.n$b;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$b;
import com.kuaishou.live.preview.item.presenter.n;
import java.lang.Object;
import rj3.a;
import t99.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.waynelive.LivePlayerController;
import com.yxcorp.gifshow.autoplay.live.g;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveInterActiveListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;

public class n$b implements LiveAutoPlay$b	// class@000e31
{
    public final n a;

    public void n$b(n p0){
       this.a = p0;
       super();
    }
    public void a(a p0){
       c.e(this, p0);
    }
    public void onAnchorEndLive(){
       if (PatchProxy.applyVoid(null, this, n$b.class, "2")) {
          return;
       }
       this.a.S8();
       return;
    }
    public void onAudioStart(){
       c.b(this);
    }
    public void onPlayerCached(){
       c.c(this);
    }
    public void onPlayerRetrieved(){
       c.d(this);
    }
    public void onRenderStop(){
       c.f(this);
    }
    public void onVideoStart(){
       if (PatchProxy.applyVoid(null, this, n$b.class, "1")) {
          return;
       }
       if (this.a.r.Q() != null) {
          this.a.r.Q().addLiveInterActiveTsptListener(this.a.K);
       }
       return;
    }
}
