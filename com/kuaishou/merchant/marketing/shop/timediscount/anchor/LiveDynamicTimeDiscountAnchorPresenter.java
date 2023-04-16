package com.kuaishou.merchant.marketing.shop.timediscount.anchor.LiveDynamicTimeDiscountAnchorPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.marketing.shop.timediscount.anchor.LiveDynamicTimeDiscountAnchorPresenter$a;
import nsd.u;
import java.lang.String;
import java.lang.Class;
import com.kuaishou.merchant.marketing.shop.timediscount.anchor.LiveDynamicTimeDiscountAnchorPresenter$rnCommandHandler$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import g14.e;
import g14.c;
import com.kwai.robust.PatchProxyResult;
import fq5.b;
import y74.e;

public final class LiveDynamicTimeDiscountAnchorPresenter extends PresenterV2	// class@001c07
{
    public final String p;
    public b q;
    public e r;
    public final p s;
    public static final LiveDynamicTimeDiscountAnchorPresenter$a t;

    static {
       LiveDynamicTimeDiscountAnchorPresenter.t = new LiveDynamicTimeDiscountAnchorPresenter$a(null);
    }
    public void LiveDynamicTimeDiscountAnchorPresenter(){
       super();
       this.p = LiveDynamicTimeDiscountAnchorPresenter.class.getSimpleName();
       this.s = s.c(new LiveDynamicTimeDiscountAnchorPresenter$rnCommandHandler$2(this));
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, LiveDynamicTimeDiscountAnchorPresenter.class, "3")) {
          return;
       }
       c.a(this.P8());
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiveDynamicTimeDiscountAnchorPresenter.class, "5")) {
          return;
       }
       c.b(this.P8());
       return;
    }
    public final e P8(){
       Object obj = PatchProxy.apply(null, this, LiveDynamicTimeDiscountAnchorPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.getValue();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveDynamicTimeDiscountAnchorPresenter.class, "2")) {
          return;
       }
       this.q = this.r8("LIVE_BASIC_CONTEXT");
       this.r = this.r8("LIVE_MERCHANT_MARKETING_ROUTER_SERVICE");
       return;
    }
}
