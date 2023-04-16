package com.kuaishou.live.effect.engine.render.LiveEffectRenderManager$a$a;
import java.lang.Runnable;
import com.kuaishou.live.effect.engine.render.LiveEffectRenderManager$a;
import pz2.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.effect.engine.render.LiveEffectRenderManager;
import java.util.List;
import com.kuaishou.android.live.log.b;
import pz2.i;
import pz2.a;
import java.lang.Long;
import cz2.b;
import kotlin.jvm.internal.a;
import cz2.a;

public final class LiveEffectRenderManager$a$a implements Runnable	// class@001b01
{
    public final LiveEffectRenderManager$a b;
    public final c c;

    public void LiveEffectRenderManager$a$a(LiveEffectRenderManager$a p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       LiveEffectRenderManager d;
       if (PatchProxy.applyVoid(null, this, LiveEffectRenderManager$a$a.class, "1")) {
          return;
       }
       LiveEffectRenderManager$a b = this.b.b;
       LiveEffectRenderManager$a$a tc = this.c;
       Objects.requireNonNull(b);
       LiveEffectRenderManager liveEffectRe = LiveEffectRenderManager.class;
       String str = "3";
       if (!PatchProxy.applyVoidOneRefs(tc, b, liveEffectRe, str)) {
          int i = tc.p();
          if (i != 1) {
             if (i != 2) {
                if (!PatchProxy.applyVoidOneRefs(tc, b, liveEffectRe, "6")) {
                   b.S(b.c, "[handleNotSupportEffectTask]", "task", tc);
                   d = b.d;
                   if (d != null) {
                      d.d(tc, false, "NO_SUPPORT_RENDER_TYPE");
                   }
                }
             }else if(PatchProxy.applyVoidOneRefs(tc, b, liveEffectRe, "4")){
                b.S(b.c, "handleStreamEffectTask", "magicFaceId", Long.valueOf(tc.b()));
                d = b.d;
                if (d != null) {
                   d.d(tc, false, "NO_SUPPORT_RENDER_TYPE");
                }
             }
          }else if(PatchProxy.applyVoidOneRefs(tc, b, liveEffectRe, "5")){
             b.S(b.c, "handleLocalEffectTask", "magicFaceId", Long.valueOf(tc.b()));
             d = b.f;
             Objects.requireNonNull(d);
             if (!PatchProxy.applyVoidOneRefs(tc, d, b.class, str)) {
                a.p(tc, "effectTask");
                b l = d.l;
                if (l == null) {
                   a.S("localRenderer");
                }
                l.e(tc);
             }
          }
       }
       return;
    }
}
