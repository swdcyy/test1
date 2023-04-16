package c8c.c$a;
import qvb.q;
import c8c.c;
import com.yxcorp.gifshow.rankgather.api.b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import qvb.a;
import qvb.n0;
import qvb.o;
import qvb.p;
import java.util.Objects;
import java.util.List;
import java.util.Collection;
import qvb.f;
import java.util.ArrayList;

public class c$a implements q	// class@00055b
{
    public final b b;
    public final c c;

    public void c$a(c p0,b p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       this.b.f(this);
       c$a tc = this.c;
       a c = tc.c;
       tc = (tc.f != null || this.b.K())? true: false;
       c.m(tc, p1);
       tc = this.c;
       tc.e = false;
       tc.f = false;
       return;
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public final void b(){
       c$a tc = this.c;
       tc.e = false;
       tc.f = false;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       this.b.f(this);
       Throwable throwable = null;
       if (p0 && this.b.isEmpty()) {
          this.c.c.m(true, throwable);
          this.b();
       }else {
          c$a tc = this.c;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoid(throwable, tc, c.class, "4")) {
             tc.b.clear();
             if (!tc.d.isEmpty()) {
                tc.b.addAll(tc.d.getItems());
             }
          }
          if (p0) {
             this.c.g.clear();
          }else {
             List list = this.c.d.z0();
             if (list != null) {
                this.c.g = new ArrayList(list);
             }
          }
          this.c.c.j(true, p1);
          this.b();
          if (this.c.b.size() == 1 && (p0 && (!this.b.isEmpty() && this.c.hasMore()))) {
             this.c.load();
          }
       }
    label_00a5 :
       return;
    }
}
