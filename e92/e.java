package e92.e;
import im8.g;
import k51.c;
import ih1.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.gift.a;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lp3.e;
import vq5.d;
import hf3.a;
import java.util.Objects;
import com.kuaishou.livestream.message.nano.SCLiveGiftCommonRoute;
import lf3.g;
import com.kwai.robust.PatchProxyResult;
import e92.h;
import java.util.Map;
import java.util.HashMap;
import lp3.i;

public class e extends c implements g	// class@0026b1
{
    public d p;
    public a q;
    public i r;
    public a s;
    public l t;
    public static String sLivePresenterClassName = "LiveGiftPresenter";

    public void e(){
       super();
       this.t = new l(false);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "2")) {
          return;
       }
       a uoa = new a(this.r, this.p, this.q, this.getContext());
       this.s = uoa;
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoid(objArray, uoa, a.class, "1")) {
          uoa.f.u0(956, SCLiveGiftCommonRoute.class, uoa.g);
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "3")) {
          return;
       }
       e ts = this.s;
       Objects.requireNonNull(ts);
       if (!PatchProxy.applyVoid(objArray, ts, a.class, "2")) {
          ts.f.o(956, ts.g);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(e.class, new h());
       }else {
          obj.put(e.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.q = this.r8("LIVE_LONG_CONNECTION");
       this.r = this.r8("LIVE_SERVICE_MANAGER");
       this.p = this.r8("LIVE_ROUTER_SERVICE");
       return;
    }
}
