package com.kuaishou.live.effect.engine.commoneffect.LiveCommonEffectManager;
import com.kuaishou.live.effect.base.Manager;
import androidx.lifecycle.LifecycleOwner;
import qy2.a;
import ny2.a;
import sz2.c;
import hf3.a;
import qr5.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.effect.engine.log.LiveEffectLogTag;
import java.util.List;
import pp.c;
import sy2.a;
import java.util.Set;
import com.google.common.collect.o;
import com.kuaishou.live.effect.engine.commoneffect.LiveCommonEffectManager$1;
import ky2.a$a;
import ky2.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import lf3.g;
import qr5.b$a;

public final class LiveCommonEffectManager extends Manager	// class@001afc
{
    public final List c;
    public final a d;
    public final Set e;
    public final a f;
    public final a g;
    public final c h;

    public void LiveCommonEffectManager(LifecycleOwner p0,a p1,a p2,c p3,a p4,b p5){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "config");
       a.p(p2, "effectEngine");
       a.p(p3, "effectResourceLoader");
       a.p(p4, "longConnection");
       a.p(p5, "streamInfoReader");
       super(p0);
       this.f = p1;
       this.g = p2;
       this.h = p3;
       this.c = LiveEffectLogTag.LIVE_EFFECT_ENGINE.appendTag("LiveCommonEffectManager");
       p1 = new a(p4, p5);
       this.d = p1;
       Set set = o.g();
       a.o(set, "Sets.newConcurrentHashSet\(\)");
       this.e = set;
       p1.a(p0, new LiveCommonEffectManager$1(this));
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCommonEffectManager.class, "4")) {
          return;
       }
       a.p(p0, "owner");
       super.onDestroy(p0);
       LiveCommonEffectManager td = this.d;
       Objects.requireNonNull(td);
       if (!PatchProxy.applyVoid(null, td, a.class, "2")) {
          td.k.o(510, td.i);
          td.l.j8(td.j);
       }
       return;
    }
}
