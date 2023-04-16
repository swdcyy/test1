package c6a.d$a;
import erd.g;
import c6a.d;
import java.lang.Object;
import c6a.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.i;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import c6a.e;
import qvb.n0;

public final class d$a implements g	// class@000563
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
       }else {
          d p = this.b.p;
          n0 on0 = null;
          i oi = (p != null)? p.X0(): on0;
          if (oi instanceof e) {
             on0 = oi;
          }
          if (on0 != null) {
             on0.s = p0.a;
             on0.a();
          }
       }
       return;
    }
}
