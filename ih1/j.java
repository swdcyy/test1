package ih1.j;
import yg1.d;
import java.lang.Object;
import hh1.i;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import yg1.e;
import yg1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import yg1.f;
import ih1.j$a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import eh1.f;
import java.util.concurrent.TimeUnit;
import brd.t;
import hh1.i$a;
import erd.o;
import t45.d;
import brd.z;
import hh1.i$b;
import hh1.i$c;
import erd.g;
import crd.b;
import hh1.j;

public final class j implements d	// class@0028e7
{
    public final i a;
    public f b;

    public void j(){
       super();
       this.a = new i();
       b.Z(LiveGiftTag.GIFT_BOX, "[LiveGiftBoxVipGradeRepository][init] run");
    }
    public void a(String p0,e p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, j.class, "1")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "request");
       a.p(p2, "callback");
       j tb = this.b;
       if (tb != null && tb.e()) {
          p2.a(p0, tb);
       }else {
          this.b(p0, p1, p2);
       }
       return;
    }
    public void b(String p0,e p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, j.class, "2")) {
          return;
       }
       String str = "source";
       a.p(p0, str);
       String str1 = "request";
       a.p(p1, str1);
       a.p(p2, "callback");
       j ta = this.a;
       j$a uoa = new j$a(this, p2);
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, uoa, ta, i.class, "1")) {
          a.p(p0, str);
          a.p(p1, str1);
          a.p(uoa, "callback");
          if (ta.b.compareAndSet(false, true)) {
             b uob = t.timer(p1.a().b, TimeUnit.MILLISECONDS).flatMap(new i$a(ta, p1)).subscribeOn(d.b).observeOn(d.a).subscribe(new i$b(ta, uoa, p0), new i$c(ta, uoa, p0));
             a.o(uob, "Observable.timer\(request¡­    it\n        \)\n      }\)");
             ta.b(uob);
          }
       }
       return;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, j.class, "3")) {
          return;
       }
       this.b = null;
       this.a.clear();
       return;
    }
}
