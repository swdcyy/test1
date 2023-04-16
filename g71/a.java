package g71.a;
import com.kuaishou.live.jsbridge.AbstractLiveJsChannel;
import g71.a$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.jsbridge.LiveJsSubscribeParams$Params;
import kotlin.jvm.internal.a;
import lp3.e;
import gq1.l;
import lp3.c;
import gq1.q;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;

public final class a extends AbstractLiveJsChannel	// class@00242e
{
    public boolean h;
    public final p i;

    public void a(){
       super();
       this.i = new a$b(this);
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.o();
       return;
    }
    public void m(String p0,LiveJsSubscribeParams$Params p1){
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "1")) {
          return;
       }
       a.p(p0, "subscribeId");
       super.m(p0, p1);
       if (!PatchProxy.applyVoid(null, this, uoa, "4") && (!this.j().b() && this.h == null)) {
          this.h = true;
          c uoc = this.j().a(l.class);
          a.o(uoc, "serviceManager.getServic¡­ineServiceV2::class.java\)");
          q oq = uoc.xo();
          a ti = this.i;
          Objects.requireNonNull(oq);
          if (!PatchProxy.applyVoidOneRefs(ti, oq, q.class, "2")) {
             a.p(ti, "observer");
             oq.a.add(ti);
          }
       }
       return;
    }
    public void n(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.p(p0, "subscribeId");
       super.n(p0);
       this.o();
       return;
    }
    public final void o(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       if (this.j().b()) {
          return;
       }
       try{
          c uoc = this.j().a(l.class);
          a.o(uoc, "serviceManager.getServic¡­ineServiceV2::class.java\)");
          q oq = uoc.xo();
          a ti = this.i;
          Objects.requireNonNull(oq);
          if (!PatchProxy.applyVoidOneRefs(ti, oq, q.class, "3")) {
             a.p(ti, "observer");
             oq.a.remove(ti);
          }
          this.h = false;
       }catch(java.lang.Exception e0){
          b.y(LiveLogTag.LIVE_MULTI_INTERACT.appendTag("LiveJsMultiLineBizUpdate"), "removeObserverIfNeed", e0);
       }
       return;
    }
}
