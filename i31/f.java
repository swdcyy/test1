package i31.f;
import k51.c;
import i31.b;
import i31.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hf3.a;
import p91.m;
import com.kuaishou.livestream.message.nano.LiveTopUserForbidden$SCTopUserForbiddenDialog;
import lf3.g;
import t02.a0;
import mq5.h;
import mq5.b;
import com.kwai.library.widget.popup.common.c;
import z12.x;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import vq5.d;

public class f extends c	// class@00281d
{
    public a0 p;
    public m q;
    public d r;
    public t s;
    public final g t;
    public final h u;
    public static String sLivePresenterClassName = "LiveAudienceUserGovernPresenter";

    public void f(){
       super();
       this.t = new b(this);
       this.u = new c(this);
    }
    public void E8(){
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uof, "7")) {
          this.q.u().u0(764, LiveTopUserForbidden$SCTopUserForbiddenDialog.class, this.t);
       }
       this.p.D2.Km(this.u);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       this.P8();
       this.p.D2.le(this.u);
       return;
    }
    public final void P8(){
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "6")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uof, "8")) {
          this.q.u().o(764, this.t);
       }
       x.f(this.s);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       this.q = this.r8("LIVE_BASIC_CONTEXT");
       this.r = this.t8("LIVE_ROUTER_SERVICE");
       return;
    }
}
