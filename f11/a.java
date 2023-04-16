package f11.a;
import im8.g;
import k51.c;
import f11.a$a;
import f11.a$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import ds5.c;
import ds5.a;
import com.kwai.robust.PatchProxyResult;
import f11.d;
import java.util.Map;
import java.util.HashMap;
import lo1.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lp3.e;
import wo1.a;
import n52.t;

public class a extends c implements g	// class@00226a
{
    public c p;
    public View$OnTouchListener q;
    public a0 r;
    public t s;
    public a t;
    public l u;
    public e v;
    public final c w;
    public c x;
    public static String sLivePresenterClassName = "LiveAudienceHeartParticlePresenter";

    public void a(){
       super();
       this.w = new a$a(this);
       this.x = new a$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.r.J.gd(this.w);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.r.J.fo(this.w);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
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
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.u = this.s8(l.class);
       this.v = this.r8("LIVE_SERVICE_MANAGER");
       this.r = this.q8(a0.class);
       this.t = this.s8(a.class);
       this.s = this.q8(t.class);
       return;
    }
}
