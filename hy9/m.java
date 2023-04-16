package hy9.m;
import rq7.a;
import jh5.a;
import pp7.a;
import androidx.lifecycle.Observer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LifecycleOwner;
import qp7.x0;
import pp7.b;
import java.lang.Boolean;

public class m extends a	// class@00273e
{
    public final a d;
    public final a e;
    public final a f;
    public final a g;
    public final a h;
    public final a i;
    public final a j;

    public void m(a p0){
       super();
       this.d = p0;
       this.e = new a(p0);
       this.f = new a(p0);
       this.g = new a(p0);
       this.h = new a(p0);
       this.j = new a(p0);
       this.i = new a(p0);
    }
    public void g(Observer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "3")) {
          return;
       }
       this.f.d(this.c(), p0);
       return;
    }
    public void h(boolean p0){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, om, "7")) {
          return;
       }
       this.h.f(Boolean.valueOf(p0));
       return;
    }
}
