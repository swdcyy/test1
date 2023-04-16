package cta.g$d;
import fr6.d;
import cta.g;
import java.lang.Object;
import wq6.e;
import wq6.h;
import fr6.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import kotlin.jvm.internal.a;
import tra.b;
import q87.c;
import java.lang.Runnable;
import ekd.k1;

public final class g$d implements d	// class@0023b9
{
    public final g a;

    public void g$d(g p0){
       this.a = p0;
       super();
    }
    public void a(e p0,h p1){
       c.c(this, p0, p1);
    }
    public void b(e p0,e p1,h p2,h p3,float p4){
       g$d uod = g$d.class;
       int i = 1;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Float.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uod, "1")) {
             return;
          }
       }
       a.p(p0, "interactiveLeftAtomic");
       a.p(p1, "interactiveRightAtomic");
       a.p(p2, "leftBelongsToChild");
       a.p(p3, "rightBelongsToChild");
       c.b(this, p0, p1, p2, p3, p4);
       g$d ta = this.a;
       if (!p4) {
          i = false;
       }
       ta.p = i;
       return;
    }
    public void c(e p0,h p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g$d.class, "2")) {
          return;
       }
       a.p(p0, "atomicTab");
       a.p(p1, "belongsToChild");
       c.a(this, p0, p1);
       Object[] objArray = new Object[0];
       b.C().w("KCubeDynamicTabUpdatePresenter", "onTabFullShow", objArray);
       g$d ta = this.a;
       ta.p = false;
       k1.m(ta.t);
       k1.r(this.a.t, 0);
       return;
    }
}
