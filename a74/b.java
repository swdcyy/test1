package a74.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import a74.b$a;
import nsd.u;
import a74.b$b;
import a74.b$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import cs5.d;
import lp3.c;
import lp3.i;
import su.o;
import ks3.f0;
import vu.c;
import com.kwai.feature.api.live.merchant.miniwidget.LiveMiniWidgetItemType;
import com.kwai.feature.api.live.merchant.miniwidget.LiveMiniWidgetPositionType;
import com.kwai.robust.PatchProxyResult;
import ks3.a0;
import ds5.e;
import fq5.b;

public final class b extends PresenterV2	// class@00003a
{
    public a0 p;
    public f0 q;
    public b r;
    public i s;
    public d t;
    public e u;
    public b$b v;
    public final c w;
    public static final b$a x;

    static {
       b.x = new b$a(null);
    }
    public void b(){
       super();
       this.v = new b$b(this);
       this.w = new b$c(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       b ts = this.s;
       if (ts == null) {
          a.S("mServiceManager");
       }
       this.t = ts.a(d.class);
       o oo = o.c();
       b tq = this.q;
       if (tq == null) {
          a.S("mLiveMerchantLiveRouterProxyService");
       }
       oo.a("LIVE_WATCH", tq.J4(), "revenueWidget", this.w);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       o oo = o.c();
       b tq = this.q;
       if (tq == null) {
          a.S("mLiveMerchantLiveRouterProxyService");
       }
       oo.m("LIVE_WATCH", tq.J4(), this.w);
       b tt = this.t;
       if (tt == null) {
          a.S("mLiveMiniWidgetService");
       }
       tt.P8(LiveMiniWidgetItemType.MERCHANT_ACTIVITY_TYPE, LiveMiniWidgetPositionType.RIGHT_BOTTOM_NORMAL);
       return;
    }
    public final String P8(){
       b obj = PatchProxy.apply(null, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          a.S("mLiveMerchantCallContextService");
       }
       return obj.c();
    }
    public final String R8(){
       b obj = PatchProxy.apply(null, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          a.S("mLiveMerchantCallContextService");
       }
       return obj.getLiveStreamId();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.u = this.t8("LIVE_PLAY_CONFIG_SERVICE");
       this.p = this.r8("LIVE_MERCHANT_CALLER_CONTEXT_SERVICE");
       this.q = this.r8("LIVE_MERCHANT_LIVE_INTERNAL_ROUTER_SERVICE");
       this.r = this.r8("LIVE_BASIC_CONTEXT");
       this.s = this.r8("LIVE_SERVICE_MANAGER");
       return;
    }
}
