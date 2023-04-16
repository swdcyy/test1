package bo1.h;
import bo1.c;
import java.lang.Object;
import bo1.d$a;
import mrd.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bo1.b;
import bo1.d$b;
import com.kuaishou.live.common.core.component.interactwatchdog.LiveInteractWatchDogPluginStopReason;
import bo1.d$c;
import bo1.d;
import java.lang.IllegalStateException;

public abstract class h implements c	// class@0003d3
{
    public a a;

    public void h(){
       super();
       a uoa = a.h(d$a.a);
       a.o(uoa, "BehaviorSubject.createDe¡­DogPluginState.Idle\n    \)");
       this.a = uoa;
    }
    public t a(){
       t obj = PatchProxy.apply(null, this, h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.distinctUntilChanged();
       a.o(obj, "_state.distinctUntilChanged\(\)");
       return obj;
    }
    public void e(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "3")) {
          return;
       }
       a.p(p0, "config");
       if (this.j(p0)) {
          this.a.onNext(d$b.a);
       }
       return;
    }
    public void f(LiveInteractWatchDogPluginStopReason p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "4")) {
          return;
       }
       a.p(p0, "reason");
       if (this.k(p0)) {
          this.a.onNext(new d$c(p0));
       }
       return;
    }
    public d getState(){
       Object obj = PatchProxy.apply(null, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.i();
       if (obj != null) {
          return obj;
       }
       throw new IllegalStateException("Required value was null.".toString());
    }
    public abstract boolean j(b p0);
    public abstract boolean k(LiveInteractWatchDogPluginStopReason p0);
}
