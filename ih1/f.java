package ih1.f;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig;
import z1.k;
import ih1.l;
import ih1.i;
import zg1.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ih1.k;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig;
import ih1.o;
import ih1.s;
import ih1.c;
import ih1.p;
import ih1.f$a;
import java.lang.Runnable;
import java.util.concurrent.Future;
import ec3.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import hh1.j;
import yg1.e;
import eh1.e;
import ih1.f$b;
import ih1.k$b;
import yg1.a;
import hh1.h;
import brd.t;
import ih1.f$e;
import erd.o;
import rm1.g;
import java.util.concurrent.TimeUnit;
import ih1.f$f;
import brd.w;
import ih1.f$g;
import erd.r;
import ih1.f$h;
import com.kuaishou.live.core.basic.model.LiveGiftPanelRefreshConfig;
import ih1.f$c;
import ih1.f$d;
import erd.g;
import crd.b;

public final class f	// class@0028e1
{
    public final k a;
    public final o b;
    public final s c;
    public final c d;
    public final p e;
    public Future f;
    public final k g;
    public final k h;
    public final l i;

    public void f(LiveGiftBoxConfig p0,k p1,k p2,l p3,i p4,l p5){
       a.p(p0, "giftBoxConfig");
       a.p(p1, "liveStreamId");
       a.p(p2, "giftApiRequestPathSuffix");
       a.p(p3, "giftStoreRepository");
       a.p(p4, "listener");
       a.p(p5, "userStatusServiceAdapter");
       super();
       this.g = p1;
       this.h = p2;
       this.i = p5;
       this.a = new k(p0.c());
       this.b = new o(p0.c(), p3, p4);
       this.c = new s(p0.c(), p3, p4);
       this.d = new c(p0.c(), p3, p4);
       this.e = new p();
       if (p0.d != null) {
          this.f = d.a(new f$a(this));
       }
       return;
    }
    public final void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "2")) {
          return;
       }
       f ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, k.class, "3")) {
          ta.c = objArray;
          ta.a.clear();
          Objects.requireNonNull(ta.b);
       }
       ta = this.b;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, o.class, "3")) {
          ta.b = objArray;
          ta.a.clear();
       }
       this.c.clear();
       this.d.clear();
       Objects.requireNonNull(this.e);
       ta = this.f;
       if (ta != null) {
          ta.cancel(false);
       }
       return;
    }
    public final c b(){
       return this.d;
    }
    public final o c(){
       return this.b;
    }
    public final s d(){
       return this.c;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       f ta = this.a;
       Object obj = this.g.get();
       a.o(obj, "liveStreamId.get\(\)");
       Object obj1 = this.h.get();
       a.o(obj1, "giftApiRequestPathSuffix.get\(\)");
       e uoe = new e(new e(obj, obj1));
       f$b uob = new f$b();
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidThreeRefs("[LiveGiftBoxRepositories][prefetch]tab", uoe, uob, ta, k.class, "2")) {
          a.p("[LiveGiftBoxRepositories][prefetch]tab", "source");
          a.p(uoe, "request");
          a.p(uob, "callback");
          ta.a.a("[LiveGiftBoxRepositories][prefetch]tab", uoe, new k$b(ta, uob));
       }
       t ot = this.i.W().flatMap(f$e.b).timeout(g.g(), TimeUnit.MILLISECONDS, f$f.b).takeUntil(f$g.b).flatMap(f$h.b);
       if (!g.b()) {
          ot = t.just(new LiveGiftPanelRefreshConfig());
       }
       ot.subscribe(new f$c(this), f$d.b);
       return;
    }
}
