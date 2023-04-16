package a94.a$a;
import ks3.l$a;
import a94.a;
import java.lang.Object;
import bs3.a;
import ks3.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import u84.b;
import java.lang.Throwable;

public class a$a implements l$a	// class@000042
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(a p0){
       k.d(this, p0);
    }
    public void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       a$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, a.class, "4")) {
          ta.P8(1);
          b.k().h(ta.r, p0);
       }
       return;
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
          return;
       }
       a$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, a.class, "5")) {
          ta.P8(1);
          b.k().h(ta.r, p0);
       }
       return;
    }
    public void d(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "3")) {
          return;
       }
       a$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, a.class, "6")) {
          ta.P8(0);
          b.k().f(ta.r);
       }
       return;
    }
    public void e(a p0){
       k.f(this, p0);
    }
    public void f(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "4")) {
          return;
       }
       a$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, a.class, "7")) {
          ta.P8(0);
          b.k().f(ta.r);
       }
       return;
    }
}
