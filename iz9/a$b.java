package iz9.a$b;
import qp7.b1;
import iz9.a;
import java.lang.Object;
import qp7.a1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.entity.QPhoto;

public final class a$b implements b1	// class@0028cd
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
    }
    public void d(boolean p0){
    }
    public void e(boolean p0){
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "2")) {
          return;
       }
       a$b ta = this.a;
       ta.x = false;
       ta.y = false;
       k1.m(ta.E);
       k1.m(this.a.F);
       return;
    }
    public void f(boolean p0){
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "1")) {
          return;
       }
       a$b ta = this.a;
       boolean b = false;
       ta.x = b;
       a u = ta.u;
       if (u != null) {
          u.setPlayFailed(b);
       }
       u.y = true;
       return;
    }
    public void g(){
       a1.e(this);
    }
    public void h(){
       a1.c(this);
    }
}
