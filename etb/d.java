package etb.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import etb.d$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.q;
import qvb.a;
import android.view.View;
import ekd.m1;
import btb.e;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public class d extends PresenterV2	// class@0027ef
{
    public e p;
    public RecyclerFragment q;
    public View r;
    public View s;
    public final q t;
    public g u;
    public GridLayoutManager v;

    public void d(){
       super();
       this.t = new d$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       this.p.h(this.t);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       this.p.f(this.t);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a0475);
       this.s = m1.f(p0, 0x7f0a0be0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.q8(e.class);
       this.q = this.r8("NOTICE_BOX_FRAGMENT");
       return;
    }
}
