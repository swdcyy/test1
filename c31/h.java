package c31.h;
import im8.g;
import k51.c;
import dk2.b;
import c31.h$b;
import c31.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import c31.e;
import wkd.b;
import dk2.a;
import dk2.a$a;
import c31.f;
import t02.a0;
import gq5.c;
import gq5.f;
import oq5.c;
import jv1.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import c31.h$a;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import c31.k;
import java.util.Map;
import java.util.HashMap;

public class h extends c implements g	// class@000465
{
    public a0 p;
    public final b q;
    public a$a r;
    public c s;
    public h$a t;
    public c u;
    public static String sLivePresenterClassName = "LiveAudienceLandscapeTopStatusBarPresenter";

    public void h(){
       super();
       this.q = new b();
       this.t = new h$b(this);
       this.u = new g(this);
    }
    public void E8(){
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oh, "5")) {
          this.r = new e(this);
          b.a(0x4bf3ccd7).d(this.r);
       }
       this.q.d();
       f uof = new f(this);
       this.s = uof;
       this.p.g2.k(uof);
       this.p.x.H6(this.u);
       this.t.a(y.d(this.getActivity()));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, h.class, "4")) {
          return;
       }
       b.a(0x4bf3ccd7).f(this.r);
       this.p.g2.l(this.s);
       this.p.x.Q0(this.u);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       this.q.a(p0);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new k();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, h.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(h.class, new k());
       }else {
          obj.put(h.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       return;
    }
}
