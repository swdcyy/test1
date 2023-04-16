package k21.r;
import im8.g;
import k51.c;
import k21.q;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.j;
import android.view.Window;
import tj3.e;
import java.lang.Boolean;
import tj3.k;
import tj3.i;
import tj3.r;
import com.kwai.robust.PatchProxyResult;
import k21.u;
import java.util.Map;
import java.util.HashMap;
import v12.f;
import d92.f$b;

public class r extends c implements g	// class@002c77
{
    public j p;
    public f q;
    public boolean r;
    public e s;
    public f$b t;
    public a u;
    public static String sLivePresenterClassName = "LiveAudienceScreenOrientationPresenter";

    public void r(){
       super();
       this.u = new q(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, r.class, "2")) {
          return;
       }
       if (this.getActivity() != null) {
          this.p = new j(this.getActivity().getWindow(), true);
       }
       return;
    }
    public final void P8(boolean p0,e p1){
       r or = r.class;
       if (PatchProxy.isSupport(or) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, or, "6")) {
          return;
       }
       k ok = p1.x();
       i oi = p1.h();
       if (p0) {
          ok.E();
          oi.J();
       }else {
          ok.d();
          oi.c();
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, r.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new u();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, r.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(r.class, new u());
       }else {
          obj.put(r.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r.class, "1")) {
          return;
       }
       this.q = this.r8("LIVE_SLIDE_PLAY_FUNCTION_SERVICE");
       this.r = this.r8("LIVE_IS_SLIDE_CONTAINER").booleanValue();
       this.s = this.r8("LIVE_LOG_REPORTER");
       this.t = this.q8(f$b.class);
       return;
    }
}
