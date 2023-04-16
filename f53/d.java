package f53.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f53.d$a;
import vq5.b;
import vq5.d;
import lm1.i;
import java.lang.Integer;
import lp3.e;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import mm1.c;
import mm1.e;
import mm1.g;
import km1.b;
import java.util.List;
import com.kuaishou.android.live.log.b;
import j47.c;
import y43.a;
import om1.a;
import lp3.c;
import xp5.i;
import xp5.g;
import rp5.a;
import bt5.b;
import ty1.d;

public class d extends PresenterV2	// class@0028a5
{
    public e p;
    public d q;
    public c r;
    public a s;
    public a t;
    public i u;
    public g v;
    public a w;
    public b x;
    public d y;
    public static String sLivePresenterClassName = "LiveGzoneLinkSendGiftPresenter";

    public void d(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       this.q.t5("sendgamegift", new d$a(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "7")) {
          return;
       }
       this.q.Z4("sendgamegift");
       return;
    }
    public final void P8(i p0,String p1,String p2,String p3,int p4){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uod, "5")) {
             return;
          }
       }
       if (!this.p.b()) {
          this.t.yk(p0.e()).d(p2).f(p1).g(p4).e(p3).a();
       }else {
          b.P(b.a, "[LiveJsCmdSendGiftToAnchor][logTraceInfo]service manager cleared");
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.q = this.r8("LIVE_ROUTER_SERVICE");
       this.p = this.r8("LIVE_SERVICE_MANAGER");
       this.r = this.q8(c.class);
       this.s = this.q8(a.class);
       this.t = this.p.a(a.class);
       this.u = this.p.a(i.class);
       this.v = this.p.a(g.class);
       this.w = this.p.a(a.class);
       this.x = this.p.a(b.class);
       this.y = this.p.a(d.class);
       return;
    }
}
