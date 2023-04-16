package o31.o;
import im8.g;
import c12.f;
import o31.a;
import o31.n;
import ok.x;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import ry1.b;
import lp3.c;
import lp3.i;
import com.kwai.robust.PatchProxyResult;
import o31.r;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class o extends f implements g	// class@00346c
{
    public i K;
    public b L;
    public static String sLivePresenterClassName = "LiveAudienceStatusPresenter";

    public void o(){
       super();
       this.L = new a(new n(this));
    }
    public void Q(boolean p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oo, "4")) {
          return;
       }
       this.K.a(b.class).k2();
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new r();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, o.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(o.class, new r());
       }else {
          obj.put(o.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       super.j8();
       this.K = this.r8("LIVE_SERVICE_MANAGER");
       return;
    }
    public void x(boolean p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oo, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, oo, "3")) {
          this.K.a(b.class);
       }
       return;
    }
}
