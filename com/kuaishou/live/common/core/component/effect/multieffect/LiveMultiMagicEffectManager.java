package com.kuaishou.live.common.core.component.effect.multieffect.LiveMultiMagicEffectManager;
import com.kuaishou.live.common.core.component.effect.multieffect.LiveMultiMagicEffectManager$a;
import nsd.u;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import zf1.b;
import java.lang.Object;
import kotlin.jvm.internal.a;
import iy2.f;
import java.util.Set;
import com.google.common.collect.o;
import java.util.concurrent.ExecutorService;
import t45.c;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import ftd.o1;
import kotlin.coroutines.CoroutineContext;
import ftd.k0;
import ftd.l0;
import com.kuaishou.live.common.core.component.effect.multieffect.LiveMultiMagicEffectManager$mEffectRenderListener$1;
import com.kuaishou.live.common.core.component.effect.multieffect.LiveMultiMagicEffectManager$b;
import iy2.f$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.StringBuilder;
import pz2.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import pz2.a;
import xf1.f;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.effect.multieffect.LiveMultiMagicEffectManager$release$1;
import asd.c;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import java.util.Objects;
import com.kwai.sdk.switchconfig.a;

public final class LiveMultiMagicEffectManager	// class@0010e5
{
    public e a;
    public Integer b;
    public final f c;
    public Set d;
    public final ExecutorService e;
    public final k0 f;
    public final d g;
    public final f$a h;
    public final b i;
    public static final List j;
    public static final LiveMultiMagicEffectManager$a k;

    static {
       LiveMultiMagicEffectManager.k = new LiveMultiMagicEffectManager$a(null);
       LiveMultiMagicEffectManager.j = LiveLogTag.LIVE_EFFECT.appendTag("LiveMultiMagicEffectManager");
    }
    public void LiveMultiMagicEffectManager(b p0){
       a.p(p0, "mRenderProvider");
       super();
       this.i = p0;
       f uof = new f();
       this.c = uof;
       Set set = o.g();
       a.o(set, "Sets.newConcurrentHashSet\(\)");
       this.d = set;
       ExecutorService uExecutorSer = c.f("live-multi-effect");
       this.e = uExecutorSer;
       a.o(uExecutorSer, "mThreadExecutor");
       this.f = l0.a(o1.c(uExecutorSer));
       this.g = new LiveMultiMagicEffectManager$mEffectRenderListener$1(this);
       LiveMultiMagicEffectManager$b uob = new LiveMultiMagicEffectManager$b(this);
       this.h = uob;
       uof.d(uob);
    }
    public final void a(long p0){
       LiveMultiMagicEffectManager liveMultiMag = LiveMultiMagicEffectManager.class;
       if (PatchProxy.isSupport(liveMultiMag) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, liveMultiMag, "7")) {
          return;
       }
       LiveMultiMagicEffectManager.k.b("addEffectBannedBizBit:"+p0);
       this.c.a(p0);
       return;
    }
    public final boolean b(c p0,f p1){
       boolean b;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMultiMagicEffectManager.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       long l = p1.b((long)p0.n());
       p1 = l - null;
       if (p1) {
          b.Z(LiveLogTag.LIVE_EFFECT, "[isTaskBannedForBiz]: "+f.a(l, p0.b()));
       }
       b = (p1)? true: false;
       return b;
    }
    public final void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveMultiMagicEffectManager.class, "9")) {
          return;
       }
       a.f(this.f, null, null, new LiveMultiMagicEffectManager$release$1(this, objArray), 3, null);
       LiveMultiMagicEffectManager$a k = LiveMultiMagicEffectManager.k;
       Objects.requireNonNull(k);
       Object obj = PatchProxy.apply(objArray, k, LiveMultiMagicEffectManager$a.class, "1");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.t().d("kswitch_key_elastic_task_opt_enable", false);
       if (b) {
          this.e.shutdown();
       }
       return;
    }
}
