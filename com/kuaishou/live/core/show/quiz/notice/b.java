package com.kuaishou.live.core.show.quiz.notice.b;
import im8.g;
import c12.f;
import fg2.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import vq5.d;
import ekd.k1;
import androidx.fragment.app.KwaiDialogFragment;
import bg2.c;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.quiz.notice.d;
import java.util.Map;
import java.util.HashMap;
import t02.a0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dg2.u;

public class b extends f implements g	// class@000e2f
{
    public Map K;
    public b$a L;
    public a0 M;
    public d N;
    public u O;
    public LiveQuizNoticeDialog P;
    public static String sLivePresenterClassName = "LiveQuizNoticePresenter";

    public void b(){
       super();
       this.L = new f(this);
    }
    public void Q(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "2")) {
          return;
       }
       this.N.Z4("quiz");
       this.a9();
       k1.n(this);
       return;
    }
    public final void a9(){
       if (PatchProxy.applyVoid(null, this, b.class, "7")) {
          return;
       }
       c.c(this.P);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(b.class, new d());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       super.j8();
       this.M = this.q8(a0.class);
       this.N = this.r8("LIVE_ROUTER_SERVICE");
       this.O = this.q8(u.class);
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.a9();
       return;
    }
}
