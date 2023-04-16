package b9c.b;
import qvb.q;
import hka.i;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import qvb.p;

public class b implements q	// class@0003dc
{
    public final i b;

    public void b(i p0){
       super();
       this.b = p0;
    }
    public final void M1(boolean p0,Throwable p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uob, "3")) {
          return;
       }
       if (!p0) {
          return;
       }
       this.b.c(p1);
       return;
    }
    public final void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, b.class, "1")) {
          return;
       }
       if (!p0) {
          return;
       }
       this.b.a();
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public final void v2(boolean p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uob, "2")) {
          return;
       }
       if (!p0) {
          return;
       }
       if (!p1) {
          this.b.b();
       }
       return;
    }
}
