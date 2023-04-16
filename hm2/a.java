package hm2.a;
import im8.g;
import k51.c;
import mrd.a;
import hm2.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import brd.t;
import ry1.b;
import com.kuaishou.live.core.show.wealthgrade.a;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import hm2.d;
import java.util.Map;
import java.util.HashMap;
import vq5.d;

public class a extends c implements g	// class@002dcd
{
    public a0 p;
    public String q;
    public a r;
    public d s;
    public a$b t;
    public static String sLivePresenterClassName = "LiveWealthGradeAudiencePresenter";
    public static LiveWealthGradeInfo u;

    public void a(){
       super();
       this.r = a.g();
       this.t = new a$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.X7(this.p.b3.W().subscribe(a.b, e.b));
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
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
       this.s = this.r8("LIVE_ROUTER_SERVICE");
       return;
    }
}
