package dl9.o2$a;
import qvb.q;
import dl9.o2;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import e9c.k;
import y8c.t;
import qvb.p;

public class o2$a implements q	// class@001f8d
{
    public final o2 b;

    public void o2$a(o2 p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       o2$a uoa = o2$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "3")) {
          return;
       }
       this.b.q.x();
       this.b.q.k(p0, p1);
       return;
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(o2$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, o2$a.class, "1")) {
          return;
       }
       this.b.q.d(p0);
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       if (PatchProxy.isSupport(o2$a.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, o2$a.class, "4")) {
          return;
       }
       this.b.R8();
       return;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(o2$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, o2$a.class, "2")) {
          return;
       }
       this.t5(true);
       return;
    }
}
