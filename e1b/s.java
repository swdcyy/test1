package e1b.s;
import nl8.a;
import e1b.r;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.listcomponent.event.a;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashMap;
import y0b.h;
import java.lang.Boolean;
import z0b.b;
import y0b.n;
import y0b.s;
import java.util.Map;
import java.lang.Throwable;

public abstract class s extends a	// class@0025ff
{
    public final g u;

    public void s(){
       super();
       this.u = new r(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, s.class, "1")) {
          return;
       }
       this.X7(this.S8().c("kscc.event.page.arch.request.triggerFirstPageRequest", this.u));
       return;
    }
    public void Y8(){
       if (PatchProxy.applyVoid(null, this, s.class, "5")) {
          return;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("has_more", Boolean.valueOf(this.W8().m()));
       this.P8().Q8().G().e().f("kscc.event.page.arch.data.modified", hashMap, false);
       return;
    }
    public void Z8(boolean p0,Throwable p1){
       s os = s.class;
       if (PatchProxy.isSupport(os) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, os, "4")) {
          return;
       }
       if (p0) {
          HashMap hashMap = new HashMap();
          hashMap.put("is_first_page", Boolean.valueOf(p0));
          hashMap.put("throwable_info", p1);
          this.S8().e("kscc.event.page.arch.refresh.Error", hashMap);
          this.P8().Q8().G().e().f("kscc.event.page.arch.refresh_tips.Error", hashMap, false);
       }
       return;
    }
    public abstract void a9(Map p0);
    public void b9(boolean p0){
       s os = s.class;
       if (PatchProxy.isSupport(os) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, os, "2")) {
          return;
       }
       if (p0) {
          HashMap hashMap = new HashMap();
          hashMap.put("is_first_page", Boolean.valueOf(p0));
          this.S8().e("kscc.event.page.arch.refresh.startLoading", hashMap);
          this.P8().Q8().G().e().f("kscc.event.page.arch.refresh_tips.startLoading", hashMap, false);
       }
       return;
    }
    public void c9(boolean p0,boolean p1){
       s os = s.class;
       if (PatchProxy.isSupport(os) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, os, "3")) {
          return;
       }
       if (p0) {
          HashMap hashMap = new HashMap();
          hashMap.put("is_first_page", Boolean.valueOf(p0));
          hashMap.put("is_cache", Boolean.valueOf(p1));
          hashMap.put("has_more", Boolean.valueOf(this.W8().m()));
          this.S8().e("kscc.event.page.arch.refresh.FinishLoading", hashMap);
          this.P8().Q8().G().e().f("kscc.event.page.arch.refresh_tips.FinishLoading", hashMap, false);
       }
       return;
    }
}
