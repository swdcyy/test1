package ag1.h;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.effect.renderer.d;
import pz2.c;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.live.common.core.component.effect.renderer.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pz2.i;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import p91.m;
import java.lang.Boolean;
import pz2.a;
import java.lang.Long;
import com.kuaishou.android.live.log.b;
import gz2.h;

public final class h implements Runnable	// class@000089
{
    public final d b;
    public final c c;

    public void h(d p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       h tc = this.c;
       d a = this.b.a;
       Objects.requireNonNull(a);
       if (PatchProxy.applyVoidOneRefs(tc, a, c.class, "8")) {
       }else {
          int i = tc.p();
          if (i != 1) {
             if (i != 2) {
                c u = a.u;
                if (u != null) {
                   u.d(tc, false, "NO_SUPPORT_RENDER_TYPE");
                }
             }else {
                a.S8(tc);
             }
          }else {
             LiveLogTag lIVE_EFFECT = LiveLogTag.LIVE_EFFECT;
             lIVE_EFFECT.appendTag("LiveEffectRendererPresenter");
             LiveLogTag liveLogTag = lIVE_EFFECT;
             b.T(liveLogTag, "executeEffectTask: localRender", "isAnchor", Boolean.valueOf(a.r.e()), "magicFaceId", Long.valueOf(tc.b()));
             a.R8().e(tc);
          }
       }
       return;
    }
}
