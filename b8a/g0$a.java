package b8a.g0$a;
import qvb.q;
import b8a.g0;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import tkd.b;
import tkd.d;
import hn5.n;

public class g0$a implements q	// class@0003a5
{
    public final g0 b;

    public void g0$a(g0 p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
    }
    public void Z1(boolean p0,boolean p1){
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       if (PatchProxy.isSupport(g0$a.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, g0$a.class, "2")) {
          return;
       }
       this.b.P8();
       return;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(g0$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, g0$a.class, "1")) {
          return;
       }
       if (!d.a(-1883158055).j7()) {
          this.b.P8();
       }
       return;
    }
}
