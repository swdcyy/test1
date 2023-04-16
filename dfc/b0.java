package dfc.b0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dfc.b0$a;
import dfc.a0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import df5.e;
import hf5.g;
import ew6.b;
import sy6.a;
import com.yxcorp.gifshow.action.RealActionBizType;
import lec.f;

public class b0 extends PresenterV2	// class@00219e
{
    public int p;
    public g q;
    public a r;
    public final c s;
    public final e t;

    public void b0(){
       super();
       this.s = new b0$a(this);
       this.t = new a0(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "2")) {
          return;
       }
       if (this.r == null) {
          return;
       }
       b0 tq = this.q;
       if (tq != null) {
          tq.L5(this.t);
       }
       this.r.R(this.s);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "4")) {
          return;
       }
       f.k("NEWS_SLIDE", RealActionBizType.NEWS_SLIDE, 4, this.p);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "3")) {
          return;
       }
       b0 tq = this.q;
       if (tq != null) {
          tq.p8(this.t);
       }
       tq = this.r;
       if (tq != null) {
          tq.O(this.s);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "1")) {
          return;
       }
       this.r = this.q8(a.class);
       this.q = this.q8(g.class);
       return;
    }
}
