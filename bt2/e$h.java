package bt2.e$h;
import at2.b;
import bt2.e;
import java.lang.Object;
import at2.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.util.Collection;
import com.kuaishou.live.core.voiceparty.micseats.guide.MicSeatGuideState;
import java.util.List;
import trd.t;
import java.lang.Runnable;
import ekd.k1;
import ss2.f;
import com.kuaishou.live.core.voiceparty.micseats.guide.ClickSource;
import at2.a;

public final class e$h implements b	// class@00044e
{
    public final e a;

    public void e$h(e p0){
       this.a = p0;
       super();
    }
    public void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$h.class, "2")) {
          return;
       }
       a.p(p0, "model");
       Iterator iterator = this.a.d.iterator();
       while (iterator.hasNext()) {
          boolean b = (iterator.next().d() == p0.d())? true: false;
          if (b) {
             iterator.remove();
          }
       }
       this.a.f(t.k(p0.b(MicSeatGuideState.IDLE)));
       e$h ta = this.a;
       k1.s(ta.e, ta, ta.f);
       this.a.g = p0.g();
       return;
    }
    public void b(c p0,f p1,ClickSource p2){
       a.a(this, p0, p1, p2);
    }
    public void c(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$h.class, "1")) {
          return;
       }
       a.p(p0, "model");
       c uoc = p0.b(MicSeatGuideState.SHOWN);
       this.a.f(t.k(uoc));
       Iterator iterator = this.a.d.iterator();
       while (iterator.hasNext()) {
          boolean b = (iterator.next().d() == p0.d())? true: false;
          if (b) {
             iterator.remove();
          }
       }
       this.a.d.add(uoc);
       return;
    }
}
