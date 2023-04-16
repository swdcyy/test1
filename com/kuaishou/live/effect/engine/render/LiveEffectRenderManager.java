package com.kuaishou.live.effect.engine.render.LiveEffectRenderManager;
import com.kuaishou.live.effect.base.Manager;
import androidx.lifecycle.LifecycleOwner;
import zy2.a;
import hz2.a;
import dz2.c$a;
import az2.a;
import jy2.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.effect.engine.log.LiveEffectLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.live.effect.engine.render.LiveEffectRenderManager$a;
import cz2.b;
import dz2.a;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class LiveEffectRenderManager extends Manager	// class@001b03
{
    public final List c;
    public i d;
    public final LiveEffectRenderManager$a e;
    public b f;
    public final a g;

    public void LiveEffectRenderManager(LifecycleOwner p0,a p1,a p2,c$a p3,a p4,a p5){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "delegate");
       a.p(p2, "renderLogDependency");
       a.p(p3, "renderContextDependency");
       a.p(p4, "renderConfig");
       a.p(p5, "localRenderVcAttach");
       super(p0);
       this.g = p5;
       this.c = LiveEffectLogTag.LIVE_EFFECT_ENGINE.appendTag("LiveEffectRenderManager");
       this.e = new LiveEffectRenderManager$a(this, p4, p1);
       b uob = new b(p4.b, p3, p1, p2);
       this.f = uob;
       p5.a(uob);
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEffectRenderManager.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       super.onDestroy(p0);
       return;
    }
}
