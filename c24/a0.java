package c24.a0;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import c24.a0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o63.a;
import lp3.c;
import lp3.i;
import com.kwai.robust.PatchProxyResult;
import c24.d0;
import java.util.Map;
import java.util.HashMap;
import vq5.d;

public class a0 extends PresenterV2 implements g	// class@00046b
{
    public d p;
    public i q;
    public a r;
    public f0 s;

    public void a0(){
       super();
       this.s = new a0$a(this);
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, a0.class, "2")) {
          return;
       }
       if (this.r != null) {
          return;
       }
       a0 tq = this.q;
       if (tq != null) {
          this.r = tq.a(a.class);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a0.class, new d0());
       }else {
          obj.put(a0.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a0.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_ROUTER_SERVICE");
       this.q = this.t8("LIVE_SERVICE_MANAGER");
       return;
    }
}
