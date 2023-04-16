package com.kuaishou.merchant.marketing.shop.timediscount.a$b;
import q94.b;
import com.kuaishou.merchant.marketing.shop.timediscount.a;
import java.lang.Object;
import y94.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import da4.a;
import ea4.b;
import ea4.a;
import java.lang.Number;
import com.kuaishou.merchant.marketing.base.lifecycle.MarketingBasePresenter;
import fq5.b;
import java.util.Objects;
import brd.t;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import erd.g;
import io.reactivex.internal.functions.Functions;
import w74.b;
import com.kuaishou.merchant.marketing.shop.MerchantMarketingShopLogBiz;
import p74.a;
import crd.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import ks3.t;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.router.b;
import q94.o;
import java.lang.ref.WeakReference;
import q94.f;
import q94.e;
import o74.a;

public class a$b implements b	// class@001c01
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public void a(c p0){
       int i1;
       c b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "5")) {
          return;
       }
       if (p0 != null && p0.e() != null) {
          int i = (int)p0.e().r;
          if (i <= 0) {
             i = 1;
          }
          a$b ta = this.a;
          b uob = a.a();
          String str = p0.b();
          c obj = PatchProxy.apply(null, p0, c.class, "7");
          if (obj != patchProxyRe) {
             i1 = obj.intValue();
          }else {
             obj = p0.d;
             i1 = (obj != null)? obj.k: 0;
          }
          String liveStreamId = this.a.u.getLiveStreamId();
          String str1 = PatchProxy.apply(null, p0, c.class, "8");
          if (str1 != patchProxyRe) {
          }else {
             b = p0.b;
             if (b == 2 || b == 1) {
                if (b == 1) {
                   Objects.requireNonNull(a.F);
                   str1 = a.C;
                }else {
                   Objects.requireNonNull(a.F);
                   str1 = a.D;
                }
             }else {
                str1 = "";
             }
          }
          ta.S8(uob.a(str, i1, liveStreamId, str1).observeOn(d.a).map(new e()).delaySubscription((long)new Random().nextInt(i), TimeUnit.MILLISECONDS).subscribe(Functions.d(), new b(MerchantMarketingShopLogBiz.LIVE_MERCHANT_TIME_DISCOUNT, "LiveMerchantTimeDiscountPresenter", "expose coupon info failed ")));
          if (!PatchProxy.applyVoid(null, p0, c.class, "6")) {
             b = p0.b;
             if (b == 1 || b == 2) {
                p0 = p0.d;
                if (p0 != null) {
                   a t = p0.t;
                   if (t == 1) {
                      p0.u = p0.u - 1;
                   }else if(t == 2){
                      p0.w = p0.w - 1;
                   }
                }
             }
          }
       }
    label_00d4 :
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "2")) {
          return;
       }
       a$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, a.class, "8") && !TextUtils.isEmpty(p0)) {
          b.o(ta.p.a().getMerchantSessionId(), ta.getActivity(), p0);
       }
       return;
    }
    public void c(c p0,o p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$b.class, "3")) {
          return;
       }
       this.a.d9(p1, false);
       String str = "LiveMerchantTimeDiscountPresenter";
       if (p0 == null || p0.e() == null) {
          a.s(MerchantMarketingShopLogBiz.LIVE_MERCHANT_TIME_DISCOUNT, str, "failed to get discount coupon pendant info");
          return;
       }else {
          int i = (int)p0.e().s;
          if (i <= 0) {
             i = 1;
          }
          WeakReference weakReferenc = new WeakReference(p1);
          a$b ta = this.a;
          b uob = a.a().b(p0.b(), this.a.u.d(), this.a.u.getLiveStreamId()).observeOn(d.a).delaySubscription((long)new Random().nextInt(i), TimeUnit.MILLISECONDS).map(new e()).doOnError(new b(MerchantMarketingShopLogBiz.LIVE_MERCHANT_TIME_DISCOUNT, str, "failed to fetch coupon info")).subscribe(new f(this, p0, weakReferenc), new e(this, p0, weakReferenc));
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidOneRefs(uob, ta, a.class, "16")) {
             ta.S8(uob);
          }
          return;
       }
    }
    public void d(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       this.a.h9(p0);
       return;
    }
    public String getLiveStreamId(){
       Object obj = PatchProxy.apply(null, this, a$b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.u.getLiveStreamId();
    }
    public String h(){
       Object obj = PatchProxy.apply(null, this, a$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.u.d();
    }
}
