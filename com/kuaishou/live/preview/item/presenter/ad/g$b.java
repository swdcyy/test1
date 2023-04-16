package com.kuaishou.live.preview.item.presenter.ad.g$b;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$b;
import com.kuaishou.live.preview.item.presenter.ad.g;
import java.lang.Object;
import rj3.a;
import t99.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class g$b implements LiveAutoPlay$b	// class@000e11
{
    public final g a;

    public void g$b(g p0){
       this.a = p0;
       super();
    }
    public void a(a p0){
       c.e(this, p0);
    }
    public void onAnchorEndLive(){
       if (PatchProxy.applyVoid(null, this, g$b.class, "5")) {
          return;
       }
       this.a.R8();
       return;
    }
    public void onAudioStart(){
       c.b(this);
    }
    public void onPlayerCached(){
       if (PatchProxy.applyVoid(null, this, g$b.class, "3")) {
          return;
       }
       this.a.R8();
       return;
    }
    public void onPlayerRetrieved(){
       if (PatchProxy.applyVoid(null, this, g$b.class, "2")) {
          return;
       }
       this.a.P8();
       return;
    }
    public void onRenderStop(){
       if (PatchProxy.applyVoid(null, this, g$b.class, "4")) {
          return;
       }
       this.a.R8();
       return;
    }
    public void onVideoStart(){
       if (PatchProxy.applyVoid(null, this, g$b.class, "1")) {
          return;
       }
       this.a.P8();
       return;
    }
}
