package l19.d$a;
import d6a.a;
import l19.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import a09.b;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.screenclean.ScreenCleanController;
import com.kuaishou.commercial.q;
import msd.a;

public class d$a extends a	// class@002c74
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "1")) {
          return;
       }
       d$a tb = this.b;
       tb.C = false;
       d u = tb.u;
       if (u != null && u.get() != null) {
          tb = this.b;
          tb.R8(false, false, tb.u.get());
       }
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "2")) {
          return;
       }
       d$a tb = this.b;
       tb.C = true;
       d x = tb.x;
       if (x != null && x.get() != null) {
          this.b.x.get().e(false, q.b);
       }
       return;
    }
}
