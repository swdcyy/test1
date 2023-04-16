package op2.g;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import wa1.i;
import java.lang.System;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterDisplayMode;
import op2.c;
import op2.g$a;
import op2.j;
import op2.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;

public abstract class g	// class@003b26
{
    public final i a;
    public long b;
    public TheaterDisplayMode c;
    public long d;
    public long e;
    public long f;
    public final c g;
    public final TheaterManager h;

    public void g(TheaterManager p0){
       a.p(p0, "theaterManager");
       super();
       this.h = p0;
       this.a = new i();
       this.b = System.currentTimeMillis();
       this.c = TheaterDisplayMode.HALF_SCREEN;
       this.d = System.currentTimeMillis();
       this.g = new c();
       p0.a(new g$a(this));
    }
    public final void a(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "4")) {
          return;
       }
       a.p(p0, "timer");
       this.a.add(p0);
       return;
    }
    public final long b(){
       return this.b;
    }
    public final long c(){
       return this.e;
    }
    public final long d(){
       return this.f;
    }
    public c e(){
       return this.g;
    }
    public final TheaterManager f(){
       return this.h;
    }
    public final void g(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "5")) {
          return;
       }
       a.p(p0, "timer");
       this.a.remove(p0);
       return;
    }
    public final void h(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "6")) {
          return;
       }
       a.p(p0, "info");
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       return;
    }
}
