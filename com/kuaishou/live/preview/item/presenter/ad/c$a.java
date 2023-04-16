package com.kuaishou.live.preview.item.presenter.ad.c$a;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$b;
import com.kuaishou.live.preview.item.presenter.ad.c;
import java.lang.Object;
import rj3.a;
import t99.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class c$a implements LiveAutoPlay$b	// class@000e09
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(a p0){
       c.e(this, p0);
    }
    public void onAnchorEndLive(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "5")) {
          return;
       }
       this.a.R8(true);
       return;
    }
    public void onAudioStart(){
       c.b(this);
    }
    public void onPlayerCached(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "3")) {
          return;
       }
       this.a.R8(true);
       return;
    }
    public void onPlayerRetrieved(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "2")) {
          return;
       }
       this.a.P8();
       return;
    }
    public void onRenderStop(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "4")) {
          return;
       }
       this.a.R8(true);
       return;
    }
    public void onVideoStart(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "1")) {
          return;
       }
       this.a.P8();
       return;
    }
}
