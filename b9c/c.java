package b9c.c;
import k2b.j0;
import nsd.u;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Integer;

public final class c implements j0	// class@0003dd
{
    public j0 b;

    public void c(){
       super(null, 1, null);
    }
    public void c(j0 p0){
       super();
       this.b = p0;
    }
    public void c(j0 p0,int p1,u p2){
       super(null);
    }
    public void S2(Fragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       a.p(p0, "newFragment");
       c tb = this.b;
       if (tb != null) {
          tb.S2(p0);
       }
       return;
    }
    public final void a(j0 p0){
       if (this.b == null && p0 != null) {
          this.b = p0;
       }
       return;
    }
    public void b2(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "3")) {
          return;
       }
       uoc = this.b;
       if (uoc != null) {
          uoc.b2(p0);
       }
       return;
    }
}
