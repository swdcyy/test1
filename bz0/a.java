package bz0.a;
import im8.g;
import k51.c;
import bz0.a$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bz0.d;
import java.util.Map;
import java.util.HashMap;
import t02.a0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import hg2.e;
import lp3.i;
import om1.a;
import lp3.c;

public class a extends c implements g	// class@000431
{
    public a0 p;
    public e q;
    public i r;
    public a s;
    public a t;
    public static String sLivePresenterClassName = "LiveAudienceSendGiftAbilityPresenter";

    public void a(){
       super();
       this.t = new a$a(this);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new d());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       this.q = this.r8("LIVE_AUDIENCE_SEND_GIFT_REAL_ACTION_SERVICE");
       i oi = this.r8("LIVE_SERVICE_MANAGER");
       this.r = oi;
       this.s = oi.a(a.class);
       return;
    }
}
