package e1b.d;
import nl8.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hka.k;
import android.view.ViewGroup;
import com.kwai.library.widget.refresh.RefreshLayout;
import e1b.d$b;
import com.kwai.library.widget.refresh.RefreshLayout$g;
import y0b.s;
import y0b.n;
import com.yxcorp.gifshow.listcomponent.event.a;
import y0b.h;
import e1b.c;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import h1b.a;
import com.yxcorp.gifshow.listcomponent.module.b;

public class d extends a	// class@0025ed
{
    public n u;
    public RefreshLayout v;
    public k w;
    public boolean x;
    public h$d y;
    public h$b z;

    public void d(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       this.x = this.S0();
       this.w = this.Y8();
       this.v.setEnabled(true);
       this.v.setNestedScrollingEnabled(true);
       this.v.setOnRefreshListener(new d$b(this));
       a uoa = this.u.G().e();
       if (uoa != null) {
          this.X7(uoa.c("kscc.event.page.arch.request.willTriggerFirstPageRequest", new c(this)));
       }
       return;
    }
    public void H8(){
       PatchProxy.applyVoid(null, this, d.class, "2");
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       this.v.setOnRefreshListener(null);
       return;
    }
    public boolean S0(){
       return true;
    }
    public k Y8(){
       Object obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this.u);
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.v = this.q8(RefreshLayout.class);
       this.u = this.R8();
       return;
    }
}
