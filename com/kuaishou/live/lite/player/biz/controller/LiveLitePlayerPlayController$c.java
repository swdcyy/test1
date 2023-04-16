package com.kuaishou.live.lite.player.biz.controller.LiveLitePlayerPlayController$c;
import mq5.f;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayerPlayController;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import lp3.e;
import lp3.c;
import lp3.b;
import mq5.i;
import java.util.concurrent.CopyOnWriteArrayList;

public final class LiveLitePlayerPlayController$c implements f	// class@000a90
{
    public final LiveLitePlayerPlayController b;

    public void LiveLitePlayerPlayController$c(LiveLitePlayerPlayController p0){
       this.b = p0;
       super();
    }
    public boolean H9(){
       return this.b.n;
    }
    public void Uk(int p0){
       LiveLitePlayerPlayController$c uoc = LiveLitePlayerPlayController$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       this.b.X2(p0, null);
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public void gf(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLitePlayerPlayController$c.class, "3")) {
          return;
       }
       if (p0 != null) {
          this.b.r.remove(p0);
       }
       return;
    }
    public void h9(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLitePlayerPlayController$c.class, "2")) {
          return;
       }
       if (p0 != null) {
          this.b.r.add(p0);
       }
       return;
    }
}
