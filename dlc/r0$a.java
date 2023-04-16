package dlc.r0$a;
import qvb.q;
import dlc.r0;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import qvb.p;

public class r0$a implements q	// class@002268
{
    public final r0 b;

    public void r0$a(r0 p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(r0$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, r0$a.class, "1")) {
          return;
       }
       if (p0) {
          this.b.P8();
       }
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
       p.b(this, p0, p1);
    }
}
