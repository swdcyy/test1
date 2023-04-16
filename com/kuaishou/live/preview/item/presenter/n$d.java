package com.kuaishou.live.preview.item.presenter.n$d;
import d6a.a;
import com.kuaishou.live.preview.item.presenter.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$b;
import com.yxcorp.gifshow.autoplay.live.g;
import com.kwai.video.waynelive.LivePlayerController;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveInterActiveListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import java.lang.System;

public class n$d extends a	// class@000e34
{
    public final n b;

    public void n$d(n p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, n$d.class, "2")) {
          return;
       }
       this.b.Y8();
       n$d tb = this.b;
       tb.G = false;
       tb.r.Z(tb.J);
       if (this.b.r.Q() != null) {
          this.b.r.Q().removeLiveInterActiveTsptListener(this.b.K);
       }
       this.b.S8();
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, n$d.class, "1")) {
          return;
       }
       this.b.F = System.currentTimeMillis();
       n$d tb = this.b;
       tb.r.P(tb.J);
       if (this.b.r.Q() != null) {
          this.b.r.Q().addLiveInterActiveTsptListener(this.b.K);
       }
       return;
    }
}
