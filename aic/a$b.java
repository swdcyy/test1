package aic.a$b;
import mhc.f0;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import yhc.a;
import mhc.h2;
import kotlin.jvm.internal.a;
import mhc.f0$c;

public final class a$b implements f0	// class@000122
{

    public void a$b(){
       super();
    }
    public void a(Object p0,int p1){
       if (PatchProxy.isSupport(a$b.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, a$b.class, "1")) {
          return;
       }
       if (p1 == 1) {
          a.a.d();
       }
       return;
    }
    public void b(h2 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "3")) {
          return;
       }
       a.p(p0, "event");
       f0$c.b(this, p0);
       return;
    }
    public void c(h2 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "2")) {
          return;
       }
       a.p(p0, "event");
       f0$c.a(this, p0);
       return;
    }
    public void d(Object p0){
       PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "4");
    }
}
