package com.kuaishou.merchant.marketing.shop.timediscount.LiveMerchantTimeDiscountControllerV2$TimeDiscountDiscountModel;
import y94.c;
import com.kuaishou.merchant.marketing.shop.timediscount.view.LiveMerchantTimeDiscountPendent$a;
import java.lang.Object;
import com.kuaishou.merchant.marketing.shop.timediscount.LiveMerchantTimeDiscountControllerV2$TimeDiscountDiscountModel$compositeDisposable$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import da4.a;
import wkd.b;
import com.kwai.framework.network.sntp.a;
import java.lang.Long;
import java.util.Objects;
import kotlin.jvm.internal.a;
import crd.a;
import com.yxcorp.utility.f;
import brd.t;
import com.kuaishou.merchant.marketing.shop.timediscount.b;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.marketing.shop.timediscount.LiveMerchantTimeDiscountControllerV2$TimeDiscountDiscountModel$a;

public final class LiveMerchantTimeDiscountControllerV2$TimeDiscountDiscountModel	// class@001bfc
{
    public final p a;
    public c b;
    public LiveMerchantTimeDiscountPendent$a c;

    public void LiveMerchantTimeDiscountControllerV2$TimeDiscountDiscountModel(c p0,LiveMerchantTimeDiscountPendent$a p1){
       super();
       this.b = p0;
       this.c = p1;
       this.a = s.c(LiveMerchantTimeDiscountControllerV2$TimeDiscountDiscountModel$compositeDisposable$2.INSTANCE);
       if (PatchProxy.applyVoid(null, this, LiveMerchantTimeDiscountControllerV2$TimeDiscountDiscountModel.class, "2")) {
       }else {
          a uoa = this.b.e();
          Long longx = b.a(0x3b1f7b44).a();
          Objects.requireNonNull(longx, "null cannot be cast to non-null type kotlin.Long");
          a.m(uoa);
          long l = uoa.g() - longx.longValue();
          if (l - null <= 0) {
             this.b();
          }else {
             this.a().c(f.d().e(l).subscribe(new b(this)));
          }
       }
       return;
    }
    public final a a(){
       Object obj = PatchProxy.apply(null, this, LiveMerchantTimeDiscountControllerV2$TimeDiscountDiscountModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantTimeDiscountControllerV2$TimeDiscountDiscountModel.class, "4")) {
          return;
       }
       a uoa = this.b.e();
       LiveMerchantTimeDiscountControllerV2$TimeDiscountDiscountModel$a timeDiscount = null;
       a n = (uoa != null)? uoa.n: timeDiscount;
       Long longx = b.a(0x3b1f7b44).a();
       if (longx == null) {
          longx = Long.valueOf(timeDiscount);
       }
       this.a().c(f.d().e((n - longx.longValue())).subscribe(new LiveMerchantTimeDiscountControllerV2$TimeDiscountDiscountModel$a(this)));
       return;
    }
}
