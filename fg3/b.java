package fg3.b;
import k51.c;
import fg3.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import p91.m;
import jt5.b;
import ks3.k0;
import ks5.c;

public abstract class b extends c	// class@0028ca
{
    public m p;
    public b q;
    public k0 r;
    public a0 s;
    public c t;
    public b u;
    public int v;
    public int w;
    public String x;
    public final c y;
    public static String sLivePresenterClassName = "LiveMerchantBaseHourlyRankPendantPresenter";

    public void b(){
       super();
       this.y = new b$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       b ts = this.s;
       if (ts != null && ts.h != null) {
          ts.y2.P4(this.y);
       }else {
          this.P8();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.R8();
       b ts = this.s;
       if (ts != null && ts.h != null) {
          ts.y2.d5(this.y);
       }
       return;
    }
    public abstract void P8();
    public abstract void R8();
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_BASIC_CONTEXT");
       this.q = this.r8("LIVE_HOURLY_RANK_LIST_SERVICE");
       this.r = this.r8("LIVE_MERCHANT_SIGNAL_SERVICE");
       this.s = this.s8(a0.class);
       this.t = this.q8(c.class);
       return;
    }
}
