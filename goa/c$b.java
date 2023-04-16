package goa.c$b;
import qn.l;
import java.lang.Object;
import rn.a;
import qn.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import goa.c;
import java.lang.Integer;
import kotlin.jvm.internal.a;

public final class c$b implements l	// class@002b38
{

    public void c$b(){
       super();
    }
    public void c(a p0){
       k.d(this, p0);
    }
    public void d(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "2")) {
          return;
       }
       k.a(this, p0);
       c.d(c.f, false);
       return;
    }
    public void e(a p0){
       k.c(this, p0);
    }
    public void f(a p0,int p1){
       c$b uob = c$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       a.p(p0, "popup");
       k.b(this, p0, p1);
       c.d(c.f, false);
       return;
    }
}
