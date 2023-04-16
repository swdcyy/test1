package f72.d0$a;
import qvb.q;
import f72.d0;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import qvb.i;
import qvb.p;

public class d0$a implements q	// class@0028c6
{
    public final d0 b;

    public void d0$a(d0 p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(d0$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, d0$a.class, "3")) {
          return;
       }
       if (p0) {
          this.b.P8();
       }
       return;
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(d0$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, d0$a.class, "1")) {
          return;
       }
       if (p0 && this.b.z.isEmpty()) {
          this.b.R8();
       }
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       if (PatchProxy.isSupport(d0$a.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, d0$a.class, "4")) {
          return;
       }
       this.b.P8();
       return;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(d0$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, d0$a.class, "2")) {
          return;
       }
       if (p0) {
          this.b.P8();
       }
       return;
    }
}
