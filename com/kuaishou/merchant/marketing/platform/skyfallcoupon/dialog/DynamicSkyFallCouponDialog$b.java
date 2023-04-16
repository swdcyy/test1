package com.kuaishou.merchant.marketing.platform.skyfallcoupon.dialog.DynamicSkyFallCouponDialog$b;
import java.lang.Runnable;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.dialog.DynamicSkyFallCouponDialog;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import x74.h;
import kotlin.jvm.internal.a;
import com.airbnb.lottie.LottieAnimationView;
import w4.e;

public final class DynamicSkyFallCouponDialog$b implements Runnable	// class@001b3a
{
    public final DynamicSkyFallCouponDialog b;

    public void DynamicSkyFallCouponDialog$b(DynamicSkyFallCouponDialog p0){
       this.b = p0;
       super();
    }
    public final void run(){
       DynamicSkyFallCouponDialog x;
       DynamicSkyFallCouponDialog x1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, DynamicSkyFallCouponDialog$b.class, "1")) {
          return;
       }
       DynamicSkyFallCouponDialog$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, DynamicSkyFallCouponDialog.class, "14")) {
          if (!h.a()) {
             x = tb.x;
             if (x == null) {
                a.S("mDialogBackgroundView");
             }
             x.setAnimationFromUrl("https://js-ec.static.yximgs.com/udata/pkg/ks-merchant/merchant_rising_coupon/skyfall_v2.zip");
             x1 = tb.x;
             if (x1 == null) {
                a.S("mDialogBackgroundView");
             }
             x1.s();
          }else {
             x = tb.x;
             if (x == null) {
                a.S("mDialogBackgroundView");
             }
             if (x.getComposition() != null) {
                x1 = tb.x;
                if (x1 == null) {
                   a.S("mDialogBackgroundView");
                }
                x1.s();
             }
          }
       }
       return;
    }
}
