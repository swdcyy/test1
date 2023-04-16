package h01.t;
import im8.g;
import k51.c;
import h01.t$a;
import j01.e0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lm1.i;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import lp3.i;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import mm1.c;
import mm1.e;
import mm1.g;
import km1.b;
import java.util.List;
import com.kuaishou.android.live.log.b;
import com.kwai.robust.PatchProxyResult;
import h01.w;
import java.util.Map;
import java.util.HashMap;
import t02.a0;
import om1.a;
import lp3.c;
import mk1.b;
import mk1.h;
import j01.e0$c;

public class t extends c implements g	// class@0025fb
{
    public a0 p;
    public i q;
    public a r;
    public b s;
    public h t;
    public e0$c u;
    public x v;
    public static String sLivePresenterClassName = "PacketGiftSendPresenter";

    public void t(){
       super();
       this.v = new t$a(this);
       this.U7(new e0());
    }
    public final void P8(i p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(t.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, t.class, "6")) {
          return;
       }
       if (!this.q.b()) {
          this.r.yk(p0.e()).d(p1).f("SENDING_GIFT").g(p3).e(p2).a();
       }else {
          b.P(b.a, "[PacketGiftSendPresenter][logTraceInfo]service manager cleared");
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, t.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new w();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, t.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(t.class, new w());
       }else {
          obj.put(t.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, t.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       i oi = this.r8("LIVE_SERVICE_MANAGER");
       this.q = oi;
       this.r = oi.a(a.class);
       this.s = this.q8(b.class);
       this.t = this.q8(h.class);
       this.u = this.q8(e0$c.class);
       return;
    }
}
