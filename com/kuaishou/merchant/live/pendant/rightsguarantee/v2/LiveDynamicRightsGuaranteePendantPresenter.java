package com.kuaishou.merchant.live.pendant.rightsguarantee.v2.LiveDynamicRightsGuaranteePendantPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.live.pendant.rightsguarantee.v2.LiveDynamicRightsGuaranteePendantPresenter$a;
import nsd.u;
import com.kuaishou.merchant.live.pendant.rightsguarantee.v2.LiveDynamicRightsGuaranteePendantPresenter$rnCommandHandler$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g14.e;
import g14.c;
import com.kwai.robust.PatchProxyResult;
import fq5.b;
import ks3.f0;

public final class LiveDynamicRightsGuaranteePendantPresenter extends PresenterV2	// class@001ac3
{
    public b p;
    public f0 q;
    public final p r;
    public int s;
    public static final LiveDynamicRightsGuaranteePendantPresenter$a t;

    static {
       LiveDynamicRightsGuaranteePendantPresenter.t = new LiveDynamicRightsGuaranteePendantPresenter$a(null);
    }
    public void LiveDynamicRightsGuaranteePendantPresenter(){
       super();
       this.r = s.c(new LiveDynamicRightsGuaranteePendantPresenter$rnCommandHandler$2(this));
       this.s = -1;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, LiveDynamicRightsGuaranteePendantPresenter.class, "3")) {
          return;
       }
       c.a(this.P8());
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiveDynamicRightsGuaranteePendantPresenter.class, "4")) {
          return;
       }
       c.b(this.P8());
       return;
    }
    public final e P8(){
       Object obj = PatchProxy.apply(null, this, LiveDynamicRightsGuaranteePendantPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.r.getValue();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveDynamicRightsGuaranteePendantPresenter.class, "2")) {
          return;
       }
       this.p = this.r8("LIVE_BASIC_CONTEXT");
       this.q = this.t8("LIVE_MERCHANT_LIVE_INTERNAL_ROUTER_SERVICE");
       return;
    }
}
