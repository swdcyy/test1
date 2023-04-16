package cb5.u;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import z1.a;
import cb5.u$a;
import cb5.u$b;
import cb5.u$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.q;
import qvb.j;
import java.util.Set;
import java.lang.Runnable;
import ekd.k1;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import g9c.a;
import com.yxcorp.gifshow.refresh.RefreshType;
import com.kwai.component.homepage_interface.homeitemfragment.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.lang.Boolean;
import brd.y;
import qvb.i;
import java.lang.Integer;

public class u extends PresenterV2	// class@00045c
{
    public final o A;
    public final q B;
    public RecyclerFragment p;
    public i q;
    public Set r;
    public a s;
    public int t;
    public y u;
    public final boolean v;
    public final boolean w;
    public final a x;
    public boolean y;
    public final Runnable z;

    public void u(boolean p0){
       super(p0, false, null);
    }
    public void u(boolean p0,boolean p1,a p2){
       super();
       this.z = new u$a(this);
       this.A = new u$b(this);
       this.B = new u$c(this);
       this.v = p0;
       this.w = p1;
       this.x = p2;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, u.class, "2")) {
          return;
       }
       this.q.h(this.B);
       this.r.add(this.A);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, u.class, "3")) {
          return;
       }
       this.q.f(this.B);
       this.r.remove(this.A);
       k1.m(this.z);
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, u.class, "7")) {
          return;
       }
       if (this.p.g7().R0()) {
          this.s.f(RefreshType.INIT);
       }
       k1.m(this.z);
       this.V8();
       return;
    }
    public void R8(){
    }
    public long S8(){
       Object obj = PatchProxy.apply(null, this, u.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return (long)(a.t().a("autoRefreshDuration", 30) * 1000);
    }
    public void V8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, u.class, "5")) {
          return;
       }
       if (this.y == null || (this.v != null && (this.p.g7() != null && this.p.g7().getItemCount() > 0))) {
          this.y = false;
          if (this.w == null) {
             this.u.onNext(Boolean.TRUE);
          }
          u tx = this.x;
          if (tx != null) {
             tx.accept(objArray);
          }
          this.s.g(RefreshType.RESUME, true);
       }
    label_0046 :
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, u.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.r8("PAGE_LIST");
       this.r = this.r8("FRAGMENT_SELECT_LISTENER");
       this.s = this.r8("HOME_REFRESH_CONTROLLER");
       this.t = this.r8("HOME_AUTO_SCROLL_TO_TOP_TYPE").intValue();
       this.u = this.r8("SHOW_SCANNING_LOADING");
       return;
    }
}
