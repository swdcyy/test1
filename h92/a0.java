package h92.a0;
import k51.c;
import h92.a0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h92.c;
import h92.s$c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok.x;
import com.kuaishou.live.core.basic.model.LiveGiftGuideConfig;
import java.lang.Integer;
import lp3.i;
import km1.b;
import java.util.List;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import om1.a;
import com.kuaishou.live.common.core.component.trace.gift.bean.LiveSendGiftTraceInfo;
import com.yxcorp.gifshow.models.Gift;
import mm1.c;
import mm1.e;
import mm1.g;
import t02.a0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import h92.s$d;
import lp3.c;

public class a0 extends c	// class@002cfd
{
    public a0 p;
    public i q;
    public a r;
    public x s;
    public x t;
    public s$c u;
    public s$d v;
    public final c w;
    public static String sLivePresenterClassName = "LiveAudienceMagicBoxGiftGuidePresenter";

    public void a0(){
       super();
       this.w = new a0$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a0.class, "2")) {
          return;
       }
       this.u.b(this.w);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a0.class, "3")) {
          return;
       }
       this.u.a(this.w);
       return;
    }
    public boolean P8(){
       Object obj = PatchProxy.apply(null, this, a0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.s.get() != null && this.s.get().mExplicitGiftType == 2)? true: false;
       return b;
    }
    public void R8(String p0,String p1,int p2){
       if (PatchProxy.isSupport(a0.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, a0.class, "6")) {
          return;
       }
       if (this.q.b()) {
          b.P(b.a, "[LiveAudienceMagicBoxGiftGuidePresenter][logTraceInfo]service manager cleared");
          return;
       }else {
          LiveSendGiftTraceInfo liveSendGift = this.r.o6();
          Gift gift = this.t.get();
          if (gift != null) {
             liveSendGift.j(gift);
          }
          liveSendGift.t(6);
          liveSendGift.s(2);
          this.r.yk(liveSendGift).d(p0).f("PRE_SEND_GIFT").g(p2).e(p1).a();
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a0.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       this.s = this.r8("giftGuideInfoSupplierAccessId");
       this.t = this.r8("explicitGiftSupplierAccessId");
       this.u = this.q8(s$c.class);
       this.v = this.q8(s$d.class);
       i oi = this.r8("LIVE_SERVICE_MANAGER");
       this.q = oi;
       this.r = oi.a(a.class);
       return;
    }
}
