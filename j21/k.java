package j21.k;
import c12.f;
import androidx.collection.ArrayMap;
import j21.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import vf1.a;
import lp3.c;
import lp3.i;
import vf1.b;
import com.google.common.base.Optional;
import com.kwai.robust.PatchProxyResult;
import j21.d;
import java.util.Map;
import ok.x;
import d61.r;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import vq5.d;
import ne1.h;
import t02.a0;
import j21.j;
import vq5.b;

public class k extends f	// class@002a42
{
    public d K;
    public i L;
    public h M;
    public a0 N;
    public final ArrayMap O;
    public boolean P;
    public final b Q;
    public static String sLivePresenterClassName = "LiveAudienceCommentGuideCardPresenter";

    public void k(){
       super();
       this.O = new ArrayMap();
       this.Q = new i(this);
    }
    public void Q(boolean p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ok, "6")) {
          return;
       }
       this.L.a(a.class).uh(this.Q);
       return;
    }
    public final Optional a9(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return r.b(this.O, p0, new d(this, p0));
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       super.j8();
       this.K = this.r8("LIVE_ROUTER_SERVICE");
       this.L = this.r8("LIVE_SERVICE_MANAGER");
       this.M = this.r8("LIVE_COMMENT_FEED_SERVICE");
       this.N = this.q8(a0.class);
       return;
    }
    public void x(boolean p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ok, "2")) {
          return;
       }
       this.K.t5("nearbyguide", new j(this));
       this.L.a(a.class).Z9(this.Q);
       return;
    }
}
