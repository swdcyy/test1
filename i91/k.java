package i91.k;
import lt.b;
import i91.j;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import i91.k$d;
import z1.a;
import java.lang.StringBuilder;
import i91.k$h;
import i91.k$f;
import i91.k$e;
import i91.k$c;
import java.lang.Integer;
import i91.k$a;
import i91.k$i;
import java.util.ArrayList;
import java.lang.Float;
import i91.k$g;
import i91.k$j;
import i91.k$b;

public final class k implements b	// class@002870
{
    public final j a;

    public void k(j p0){
       this.a = p0;
       super();
    }
    public void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k.class, "4")) {
          return;
       }
       a.p(p0, "sessionId");
       a.p(p1, "errorMessage");
       k ta = this.a;
       ta.j(ta.b, new k$d(p0, p1));
       this.a.k(true, "onError ,message "+p1);
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "6")) {
          return;
       }
       a.p(p0, "sessionId");
       k ta = this.a;
       ta.j(ta.b, new k$h(p0));
       return;
    }
    public void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "5")) {
          return;
       }
       a.p(p0, "sessionId");
       k ta = this.a;
       ta.j(ta.b, new k$f(p0));
       return;
    }
    public void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "3")) {
          return;
       }
       a.p(p0, "sessionId");
       k ta = this.a;
       ta.j(ta.b, new k$e(p0));
       this.a.k(false, "onFinishPlay");
       return;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       a.p(p0, "sessionId");
       k ta = this.a;
       ta.j(ta.b, new k$c(p0));
       return;
    }
    public void f(int p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ok, "10")) {
          return;
       }
       ok = this.a;
       ok.j(ok.b, new k$a(p0));
       return;
    }
    public void g(int p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ok, "7")) {
          return;
       }
       ok = this.a;
       ok.j(ok.b, new k$i(p0));
       return;
    }
    public void h(ArrayList p0,float p1,float p2){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, k.class, "9")) {
          return;
       }
       a.p(p0, "urlList");
       k ta = this.a;
       ta.j(ta.b, new k$g(p0, p1, p2));
       return;
    }
    public void i(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       a.p(p0, "sessionId");
       k ta = this.a;
       ta.j(ta.b, new k$j(p0));
       return;
    }
    public void j(int p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ok, "8")) {
          return;
       }
       ok = this.a;
       ok.j(ok.b, new k$b(p0));
       return;
    }
}
