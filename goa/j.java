package goa.j;
import qn.l;
import msd.a;
import java.lang.Object;
import rn.a;
import qn.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import qrd.l1;

public final class j implements l	// class@002b48
{
    public final a a;

    public void j(a p0){
       this.a = p0;
       super();
    }
    public void c(a p0){
       k.d(this, p0);
    }
    public void d(a p0){
       k.a(this, p0);
    }
    public void e(a p0){
       k.c(this, p0);
    }
    public void f(a p0,int p1){
       if (PatchProxy.isSupport2(j.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(p0, Integer.valueOf(p1), this, j.class, "1")) {
          return;
       }
       a.p(p0, "popup");
       j ta = this.a;
       if (ta != null) {
          ta.invoke();
       }
       PatchProxy.onMethodExit(j.class, "1");
       return;
    }
}
