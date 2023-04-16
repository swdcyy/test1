package j01.m;
import im8.g;
import j01.i0;
import k01.a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.sort.LiveGiftSortType;
import j01.m$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t45.d;
import brd.z;
import brd.t;
import j01.j;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lm1.i;
import java.lang.Integer;
import lp3.i;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import mm1.c;
import mm1.e;
import mm1.g;
import km1.b;
import java.util.List;
import com.kuaishou.android.live.log.b;
import com.kwai.robust.PatchProxyResult;
import j01.r;
import java.util.Map;
import java.util.HashMap;
import t02.a0;
import om1.a;
import lp3.c;
import bl1.a;
import mrd.c;

public class m extends i0 implements g	// class@002a03
{
    public a0 t;
    public i u;
    public a v;
    public a w;
    public LiveGiftSortType x;
    public c y;
    public m$b z;
    public static String sLivePresenterClassName = "GiftBoxSendGiftToAnchorPresenter";

    public void m(a p0){
       super(p0);
       this.x = LiveGiftSortType.DEFAULT;
       this.z = new m$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, m.class, "2")) {
          return;
       }
       this.X7(this.y.observeOn(d.a).subscribe(new j(this)));
       return;
    }
    public void R8(i p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, m.class, "4")) {
          return;
       }
       if (!this.u.b()) {
          this.v.yk(p0.e()).d(p1).f("SENDING_GIFT").g(p3).e(p2).a();
       }else {
          b.P(b.a, "[GiftBoxSendGiftToAnchorPresenter][logTraceInfo]service manager cleared");
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new r();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, m.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(m.class, new r());
       }else {
          obj.put(m.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       super.j8();
       this.t = this.q8(a0.class);
       i oi = this.r8("LIVE_SERVICE_MANAGER");
       this.u = oi;
       this.v = oi.a(a.class);
       this.w = this.q8(a.class);
       this.y = this.r8("current_sort_type_subject");
       return;
    }
}
