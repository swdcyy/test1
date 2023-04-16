package el9.g0;
import erd.g;
import com.yxcorp.gifshow.comment.presenter.global.i;
import java.lang.Object;
import pk9.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import al9.a;

public final class g0 implements g	// class@0021e9
{
    public final i b;

    public void g0(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g0 tb = this.b;
       tb.P8();
       tb.E = p0;
       if (PatchProxy.applyVoid(null, tb, i.class, "3")) {
       }else {
          p0 = tb.E;
          if (p0.e != null || p0.c() != null) {
             p0 = tb.p.q();
             p0.p0();
             if (tb.E.h != null) {
                p0.clear();
             }
             if (tb.E.c() != null) {
                p0.q1(tb.E.c());
             }
             p0.a();
             tb.E.e(false);
             tb.E.d(null);
             tb.A = false;
          }
       }
       if (tb.A != null) {
          tb.R8();
       }
       return;
    }
}
