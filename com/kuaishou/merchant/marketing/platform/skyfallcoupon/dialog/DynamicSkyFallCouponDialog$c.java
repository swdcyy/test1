package com.kuaishou.merchant.marketing.platform.skyfallcoupon.dialog.DynamicSkyFallCouponDialog$c;
import java.lang.Runnable;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.dialog.DynamicSkyFallCouponDialog;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import ekd.k1;
import n84.i;

public final class DynamicSkyFallCouponDialog$c implements Runnable	// class@001b3b
{
    public final DynamicSkyFallCouponDialog b;

    public void DynamicSkyFallCouponDialog$c(DynamicSkyFallCouponDialog p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, DynamicSkyFallCouponDialog$c.class, "1")) {
          return;
       }
       DynamicSkyFallCouponDialog$c tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, DynamicSkyFallCouponDialog.class, "16")) {
          k1.n(tb);
          k1.r(new i(tb), 300);
       }
       return;
    }
}
