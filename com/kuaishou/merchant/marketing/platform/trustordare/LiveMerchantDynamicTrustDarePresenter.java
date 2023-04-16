package com.kuaishou.merchant.marketing.platform.trustordare.LiveMerchantDynamicTrustDarePresenter;
import ks3.p0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.marketing.platform.trustordare.LiveMerchantDynamicTrustDarePresenter$a;
import nsd.u;
import com.kuaishou.merchant.marketing.platform.trustordare.LiveMerchantDynamicTrustDarePresenter$rnCommandHandler$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g14.e;
import g14.c;
import kotlin.jvm.internal.a;
import ks3.t;
import ks3.o0;
import com.kwai.robust.PatchProxyResult;
import zp5.a;
import oq5.b;
import android.app.Dialog;

public final class LiveMerchantDynamicTrustDarePresenter extends PresenterV2 implements p0	// class@001b68
{
    public d p;
    public h q;
    public t r;
    public a s;
    public b t;
    public final p u;
    public static final LiveMerchantDynamicTrustDarePresenter$a v;

    static {
       LiveMerchantDynamicTrustDarePresenter.v = new LiveMerchantDynamicTrustDarePresenter$a(null);
    }
    public void LiveMerchantDynamicTrustDarePresenter(){
       super();
       this.u = s.c(new LiveMerchantDynamicTrustDarePresenter$rnCommandHandler$2(this));
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantDynamicTrustDarePresenter.class, "3")) {
          return;
       }
       c.a(this.P8());
       LiveMerchantDynamicTrustDarePresenter tr = this.r;
       if (tr == null) {
          a.S("mLiveMerchantAudienceCommonService");
       }
       tr.c(this);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantDynamicTrustDarePresenter.class, "5")) {
          return;
       }
       c.b(this.P8());
       LiveMerchantDynamicTrustDarePresenter tr = this.r;
       if (tr == null) {
          a.S("mLiveMerchantAudienceCommonService");
       }
       tr.d(this);
       return;
    }
    public void P(){
       o0.b(this);
    }
    public final e P8(){
       Object obj = PatchProxy.apply(null, this, LiveMerchantDynamicTrustDarePresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.u.getValue();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantDynamicTrustDarePresenter.class, "2")) {
          return;
       }
       this.r = this.r8("LIVE_MERCHANT_AUDIENCE_COMMON_SERVICE");
       this.s = this.r8("LIVE_FRAGMENT_SIMPLE_SERVICE");
       this.t = this.q8(b.class);
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantDynamicTrustDarePresenter.class, "4")) {
          return;
       }
       o0.a(this);
       LiveMerchantDynamicTrustDarePresenter tq = this.q;
       if (tq != null) {
          tq.dismiss();
       }
       tq = this.p;
       if (tq != null) {
          tq.dismiss();
       }
       return;
    }
    public void r(){
       o0.c(this);
    }
}
