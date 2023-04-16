package com.kuaishou.live.effect.engine.banned.LiveEffectBannedBizManager$effectAnchorDisableObserver$1;
import ky2.a$a;
import com.kuaishou.live.effect.engine.banned.LiveEffectBannedBizManager;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ky2.a$a$a;
import ny2.a;

public final class LiveEffectBannedBizManager$effectAnchorDisableObserver$1 implements a$a	// class@001af8
{
    public final LiveEffectBannedBizManager b;

    public void LiveEffectBannedBizManager$effectAnchorDisableObserver$1(LiveEffectBannedBizManager p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveEffectBannedBizManager$effectAnchorDisableObserver$1.class, "2")) {
       }else {
          a.p(p0, "source");
          if (!PatchProxy.applyVoidFourRefs(this, p0, p1, p2, null, a$a$a.class, "1")) {
             a.p(p0, "source");
          }
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveEffectBannedBizManager$effectAnchorDisableObserver$1.class, "1")) {
       }else {
          a.p(p0, "source");
          int i = 8192;
          if (a.g(p2, Boolean.TRUE)) {
             this.b.e.S0((long)i);
          }else {
             this.b.e.j1((long)i);
          }
       }
       return;
    }
}
