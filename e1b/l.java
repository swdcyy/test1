package e1b.l;
import nl8.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.listcomponent.event.a;
import e1b.e;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e1b.f;
import e1b.g;
import e1b.h;
import e1b.i;
import e1b.j;
import e1b.k;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.HashMap;
import java.util.Map;
import y8c.t;
import java.lang.Throwable;
import com.yxcorp.gifshow.listcomponent.module.b;
import y0b.n;

public class l extends a	// class@0025f5
{
    public t u;
    public n v;

    public void l(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, l.class, "2")) {
          return;
       }
       this.X7(this.S8().c("kscc.event.page.arch.refresh_tips.startLoading", new e(this)));
       this.X7(this.S8().c("kscc.event.page.arch.refresh_tips.FinishLoading", new f(this)));
       this.X7(this.S8().c("kscc.event.page.arch.refresh_tips.Error", new g(this)));
       this.X7(this.S8().c("kscc.event.page.arch.load_more_tips.startLoading", new h(this)));
       this.X7(this.S8().c("kscc.event.page.arch.load_more_tips.FinishLoading", new i(this)));
       this.X7(this.S8().c("kscc.event.page.arch.load_more_tips.Error", new j(this)));
       this.X7(this.S8().c("kscc.event.page.arch.data.modified", new k(this)));
       return;
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, l.class, "8");
    }
    public boolean Y8(){
       HashMap obj = PatchProxy.apply(null, this, l.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new HashMap();
       obj.put("can_show_empty_tips_key", Boolean.FALSE);
       this.S8().f("kscc.event.page.arch.common.canShowEmptyTips", obj, false);
       if (obj.get("can_show_empty_tips_key") != null) {
          return obj.get("can_show_empty_tips_key").booleanValue();
       }
       return false;
    }
    public void Z8(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "6")) {
          return;
       }
       if (this.Y8()) {
          this.u.i();
          this.u.g();
       }else {
          this.u.f();
          if (p0.get("has_more").booleanValue()) {
             this.u.g();
          }else {
             this.u.p();
          }
       }
       return;
    }
    public void a9(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "5")) {
          return;
       }
       this.u.x();
       this.u.k(p0.get("is_first_page").booleanValue(), p0.get("throwable_info"));
       return;
    }
    public void b9(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "4")) {
          return;
       }
       this.u.x();
       this.Z8(p0);
       return;
    }
    public void c9(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "3")) {
          return;
       }
       this.u.d(p0.get("is_first_page").booleanValue());
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.u = this.q8(t.class);
       this.v = this.R8();
       return;
    }
}
