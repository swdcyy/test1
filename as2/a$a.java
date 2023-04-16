package as2.a$a;
import hp2.s;
import as2.a;
import java.lang.Object;
import hp2.c;
import hp2.r;
import hp2.g;
import hp2.h;
import hp2.f;
import hp2.m;
import hp2.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ry1.b;
import lp3.c;
import lp3.e;
import kotlin.jvm.internal.a;
import brd.t;
import as2.a$a$a;
import erd.g;
import crd.b;
import r92.b;
import q92.a;

public final class a$a implements s	// class@0002b5
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void K(c p0){
       r.k(this, p0);
    }
    public void L(c p0){
       r.j(this, p0);
    }
    public void R(c p0){
       r.o(this, p0);
    }
    public void S(g p0){
       r.d(this, p0);
    }
    public void T(h p0){
       r.e(this, p0);
    }
    public void U(c p0){
       r.n(this, p0);
    }
    public void V(c p0){
       r.l(this, p0);
    }
    public void Y(f p0){
       r.c(this, p0);
    }
    public void d0(m p0){
       r.f(this, p0);
    }
    public void g0(c p0){
       r.m(this, p0);
    }
    public void i(){
       r.a(this);
    }
    public void l(n p0){
       r.g(this, p0);
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       a$a tb = this.b;
       c uoc = tb.j.a(b.class);
       a.o(uoc, "serviceManager.getServic¡­btainService::class.java\)");
       tb.d = uoc.W().subscribe(new a$a$a(this));
       return;
    }
    public void o(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
          return;
       }
       a.p(p0, "reason");
       a$a tb = this.b;
       if (tb.e != null) {
          tb.e = false;
          tb.l.a(tb.f);
       }
       a d = this.b.d;
       if (d != null) {
          d.dispose();
       }
       d.d = null;
       return;
    }
    public void x(){
       r.h(this);
    }
}
