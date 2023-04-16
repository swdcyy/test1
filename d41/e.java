package d41.e;
import c12.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import fu4.b;
import com.kwai.robust.PatchProxyResult;
import lp3.c;
import lp3.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ry1.b;
import brd.t;
import d41.d;
import d41.c;
import erd.g;
import crd.b;

public class e extends f	// class@001f07
{
    public i K;
    public static String sLivePresenterClassName = "LiveAudienceRecruitStatusPresenter";

    public void e(){
       super();
    }
    public void Q(boolean p0){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, e.class, "3")) {
          return;
       }
       this.a9().k2();
       return;
    }
    public final b a9(){
       Object obj = PatchProxy.apply(null, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.K.a(b.class);
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       super.j8();
       this.K = this.r8("LIVE_SERVICE_MANAGER");
       return;
    }
    public void x(boolean p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "2")) {
          return;
       }
       b uob = PatchProxy.apply(null, this, uoe, "5");
       if (uob == PatchProxyResult.class) {
          uob = this.K.a(b.class);
       }
       this.X7(uob.W().subscribe(new d(this), new c(this)));
       return;
    }
}
