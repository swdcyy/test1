package e1b.n;
import nl8.a;
import e1b.m;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import y0b.h;
import java.util.HashMap;
import java.lang.Boolean;
import z0b.b;
import y0b.n;
import y0b.s;
import com.yxcorp.gifshow.listcomponent.event.a;
import java.util.Map;
import java.lang.Throwable;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import erd.g;
import crd.b;

public abstract class n extends a	// class@0025f7
{
    public a u;
    public h v;
    public final g w;

    public void n(){
       super();
       this.w = new m(this);
    }
    public final int Y8(){
       Object obj = PatchProxy.apply(null, this, n.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.W8().h();
    }
    public void Z8(){
       if (PatchProxy.applyVoid(null, this, n.class, "6")) {
          return;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("has_more", Boolean.valueOf(this.W8().m()));
       this.P8().Q8().G().e().f("kscc.event.page.arch.data.modified", hashMap, false);
       return;
    }
    public void a9(boolean p0,Throwable p1){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, on, "5")) {
          return;
       }
       if (!p0) {
          HashMap hashMap = new HashMap();
          hashMap.put("is_first_page", Boolean.valueOf(p0));
          hashMap.put("throwable_info", p1);
          if (this.Y8() == 3) {
             this.S8().e("kscc.event.page.arch.load_more.Error", hashMap);
          }else if(this.Y8() == 2){
             this.S8().e("kscc.section.page.arch.load_more.Error", hashMap);
          }else if(this.Y8() == 1){
             this.S8().e("kscc.component.page.arch.load_more.Error", hashMap);
          }
       }
       return;
    }
    public abstract void b9(Map p0);
    public void c9(boolean p0){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, on, "3")) {
          return;
       }
       if (!p0) {
          HashMap hashMap = new HashMap();
          hashMap.put("is_first_page", Boolean.valueOf(p0));
          this.P8().Q8().G().e().f("kscc.event.page.arch.load_more_tips.startLoading", hashMap, false);
          if (this.Y8() == 3) {
             this.S8().e("kscc.event.page.arch.load_more.startLoading", hashMap);
          }else if(this.Y8() == 2){
             this.S8().e("kscc.event.section.arch.load_more.startLoading", hashMap);
          }else if(this.Y8() == 1){
             this.S8().e("kscc.event.component.arch.load_more.startLoading", hashMap);
          }
       }
       return;
    }
    public void d9(boolean p0,boolean p1){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, on, "4")) {
          return;
       }
       if (!p0) {
          HashMap hashMap = new HashMap();
          hashMap.put("has_more", Boolean.valueOf(p1));
          this.v.d().Q8().G().e().f("kscc.event.page.arch.load_more_tips.FinishLoading", hashMap, false);
          if (this.Y8() == 3) {
             this.u.e("kscc.event.page.arch.load_more.FinishLoading", hashMap);
          }else if(this.Y8() == 2){
             this.u.e("kscc.event.section.arch.load_more.FinishLoading", hashMap);
          }else if(this.Y8() == 1){
             this.u.e("kscc.event.component.arch.load_more.FinishLoading", hashMap);
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n.class, "2")) {
          return;
       }
       this.u = this.r8("KS_BUS");
       this.v = this.r8("CURRENT_MODULE_CONTEXT");
       if (this.Y8() == 3) {
          this.X7(this.S8().c("kscc.event.page.arch.request.triggerMorePageRequest", this.w));
       }else if(this.Y8() == 2){
          this.X7(this.S8().c("kscc.event.section.arch.request.triggerMorePageRequest", this.w));
       }else if(this.Y8() == 1){
          this.X7(this.S8().c("kscc.event.component.arch.request.triggerMorePageRequest", this.w));
       }
       return;
    }
}
