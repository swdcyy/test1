package m31.a;
import im8.g;
import k51.c;
import mm1.h;
import m31.a$a;
import mm1.b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import m31.d;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import p91.m;
import ta1.a;
import t02.a0;
import com.kuaishou.live.core.show.pk.k$e;
import m91.b;

public class a extends c implements g	// class@003117
{
    public m p;
    public a0 q;
    public b r;
    public a s;
    public k$e t;
    public g u;
    public static String sLivePresenterClassName = "LiveAudienceCommonTracePresenter";

    public void a(){
       super();
       this.u = new h(new a$a(this));
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
       m om = this.r8("LIVE_BASIC_CONTEXT");
       this.p = om;
       this.s = om.o();
       this.q = this.q8(a0.class);
       this.t = this.q8(k$e.class);
       this.r = this.r8("LIVE_BIZ_RELATION_SERVICE");
       return;
    }
}
