package e12.o$a;
import qvb.q;
import e12.o;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import ub2.j;
import e12.c;
import qvb.j;
import d12.p;

public class o$a implements q	// class@002605
{
    public final o b;

    public void o$a(o p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(o$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, o$a.class, "1")) {
          return;
       }
       if (p0) {
          o k = this.b.k;
          if (k != null) {
             k.l1(null);
             this.b.k.g0().f(this);
             o$a tb = this.b;
             tb.k = p.a(tb.k);
             this.b.k.h(this);
          }
       }
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       p.b(this, p0, p1);
    }
}
