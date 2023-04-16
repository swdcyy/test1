package fy9.a$b;
import qp7.b1;
import fy9.a;
import java.lang.Object;
import qp7.a1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.Iterator;
import java.lang.Iterable;
import cr7.i;
import qp7.x0;
import qp7.b;
import cr7.j;
import fy9.b;
import kotlin.jvm.internal.a;
import pp7.b;

public final class a$b implements b1	// class@00237d
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public void a(){
       a1.a(this);
    }
    public void b(){
       a1.g(this);
    }
    public void c(boolean p0){
       a1.b(this, p0);
    }
    public void d(boolean p0){
       a1.h(this, p0);
    }
    public void e(boolean p0){
       a1.f(this, p0);
    }
    public void f(boolean p0){
       a1.d(this, p0);
    }
    public void g(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$b.class, "2")) {
          return;
       }
       a1.e(this);
       a$b ta = this.a;
       ta.u = false;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, a.class, "9")) {
          a v = ta.v;
          if (v != null) {
             Iterator iterator = v.iterator();
             while (iterator.hasNext()) {
                iterator.next().b(false);
             }
          }
       }
       return;
    }
    public void h(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$b.class, "1")) {
          return;
       }
       a1.c(this);
       a$b ta = this.a;
       ta.u = true;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, a.class, "8")) {
          j oj = ta.E();
          b uob = new b(ta);
          Objects.requireNonNull(oj);
          if (!PatchProxy.applyVoidOneRefs(uob, oj, j.class, "6")) {
             a.p(uob, "showConsumer");
             oj.f.f(uob);
          }
       }
       return;
    }
}
