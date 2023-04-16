package d5a.a$b;
import d6a.a;
import d5a.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import q87.c;
import j1b.e;
import d5a.u;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.util.List;

public final class a$b extends a	// class@001e73
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "2")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       o.C().y("GravityAccessLandscapePresenter", "becomesDetachedOnPageSelected", objArray);
       a v = this.b.v;
       if (v != null) {
          v.a();
       }
       a$b tb = this.b;
       a u = tb.u;
       if (u != null) {
          v = tb.w;
          if (!PatchProxy.applyVoidOneRefs(v, u, u.class, "5")) {
             a.p(v, "listener");
             Object[] objArray1 = new Object[i];
             o.C().w("WindowOrientationManager", "removeListener "+v, objArray1);
             u.a.remove(v);
          }
       }
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       o.C().y("GravityAccessLandscapePresenter", "becomesAttachedOnPageSelected:", objArray);
       a v = this.b.v;
       if (v != null) {
          v.b();
       }
       a$b tb = this.b;
       a u = tb.u;
       if (u != null) {
          v = tb.w;
          if (!PatchProxy.applyVoidOneRefs(v, u, u.class, "4")) {
             a.p(v, "listener");
             Object[] objArray1 = new Object[i];
             o.C().w("WindowOrientationManager", "addListener "+v, objArray1);
             u.a.add(v);
          }
       }
       return;
    }
}
