package kx8.a;
import wo5.b;
import java.lang.String;
import java.lang.Object;
import kx8.a$b;
import kx8.a$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.log.model.CommonParams;
import lnc.i3;
import java.lang.Long;
import java.lang.Number;
import java.lang.Math;
import k2b.u1;
import on5.k;

public class a implements b	// class@002c37
{
    public String a;
    public a$b b;
    public a$b c;
    public a$b d;
    public a$b e;

    public void a(String p0){
       super();
       this.a = p0;
       this.b = new a$b(null);
       this.c = new a$b(null);
       this.d = new a$b(null);
       this.e = new a$b(null);
       this.b.b();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.b.c(p0);
       this.c.c(p0);
       this.b.a();
       this.c.b();
       this.e("click", this.b);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.c.a();
       this.d.b();
       this.e("enter", this.c);
       return;
    }
    public void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       this.e.c(p0);
       this.e.a();
       this.e("load", this.e);
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.d.a();
       this.e.b();
       this.e("ready", this.d);
       return;
    }
    public final void e(String p0,a$b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "5")) {
          return;
       }
       if (p1.d != null) {
          return;
       }
       p1.d = true;
       i3 oi3 = i3.f();
       oi3.d("activityId", this.a);
       oi3.d("action", p0);
       oi3.d("reason", p1.a);
       oi3.c("startTime", Long.valueOf(p1.b));
       oi3.c("endTime", Long.valueOf(Math.max(p1.c, p1.b)));
       oi3.c("cost", Long.valueOf(Math.max((p1.c - p1.b), 0)));
       p0 = oi3.e();
       u1.Z("activity_home_tab", p0, false, new CommonParams(), 14);
       k.b.a("KCUBE_ACTIVITYTAB_LOAD", p0);
       return;
    }
}
