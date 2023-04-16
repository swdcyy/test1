package b04.d$e;
import co4.d;
import b04.d;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import co4.c;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.bowl.core.component.a;
import java.lang.Boolean;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentResponse;
import com.kuaishou.bowl.data.center.data.model.page.component.Track;
import java.lang.Throwable;
import java.lang.Integer;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentGlobalInfo;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentGlobalEngineConfigInfo;

public class d$e implements d	// class@0002f7
{
    public final d b;

    public void d$e(d p0){
       this.b = p0;
       super();
    }
    public void A(JsonElement p0,JsonElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d$e.class, "3")) {
          return;
       }
       c.c(this, p0, p1);
       this.b.l.setValue(p0);
       return;
    }
    public void L7(a p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(d$e.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, d$e.class, "1")) {
          return;
       }
       if (p0 != null) {
          this.b.j.setValue(Boolean.TRUE);
       }
       if (!p2) {
          this.b.p.onEvent(8);
          this.b.g.setValue(p0);
       }
       return;
    }
    public void V6(PageComponentResponse p0){
       c.f(this, p0);
    }
    public void d0(JsonElement p0,JsonElement p1,JsonElement p2,JsonElement p3,Track p4){
       c.d(this, p0, p1, p2, p3, p4);
    }
    public void onRefresh(){
       c.g(this);
    }
    public void p6(a p0,int p1,Throwable p2){
       if (PatchProxy.isSupport(d$e.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, d$e.class, "2")) {
          return;
       }
       this.b.p.onEvent(9);
       this.b.h.setValue(p0);
       return;
    }
    public void r2(PageComponentGlobalInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$e.class, "4")) {
          return;
       }
       c.e(this, p0);
       if (p0 != null) {
          PageComponentGlobalInfo engineConfig = p0.engineConfig;
          if (engineConfig != null && engineConfig.refreshScene != null) {
             this.b.m.setValue(p0);
          }
       }
       return;
    }
}
