package g72.j;
import k51.c;
import g72.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hf3.a;
import p91.m;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCFeedPush;
import lf3.g;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenCommonData;
import x72.a;
import g72.j$a;
import gr5.a;
import kr5.a;
import zq5.b;
import ekd.k1;
import android.animation.Animator;
import z12.x;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import t02.a0;
import t02.r1;
import lp3.i;
import lp3.c;

public class j extends c	// class@002a88
{
    public m p;
    public a0 q;
    public r1 r;
    public final g s;
    public b t;
    public i u;
    public ObjectAnimator v;
    public static String sLivePresenterClassName = "LiveFansGroupEnterRoomPresenter";

    public void j(){
       super();
       this.s = new h(this);
       this.t = null;
       this.u = null;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, j.class, "2")) {
          return;
       }
       this.p.u().u0(310, LiveStreamMessages$SCFeedPush.class, this.s);
       j tt = this.t;
       if (tt != null) {
          tt.v9(4, LiveFloatingScreenCommonData.class, new a(), new j$a(this));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, j.class, "3")) {
          return;
       }
       this.p.u().o(310, this.s);
       k1.n(this);
       x.I(this.v);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_BASIC_CONTEXT");
       this.q = this.s8(a0.class);
       this.r = this.s8(r1.class);
       i oi = this.r8("LIVE_SERVICE_MANAGER");
       this.u = oi;
       this.t = oi.c(b.class);
       return;
    }
}
