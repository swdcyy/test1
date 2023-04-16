package d6b.d$d;
import qvb.q;
import d6b.d;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import qvb.p;

public final class d$d implements q	// class@002459
{
    public final d b;

    public void d$d(d p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       d$d uod = d$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uod, "2")) {
          return;
       }
       p.a(this, p0, p1);
       this.b.X8();
       return;
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(d$d.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, d$d.class, "1")) {
          return;
       }
       if (p0) {
          p0.C = true;
       }
       this.b.X8();
       return;
    }
}
