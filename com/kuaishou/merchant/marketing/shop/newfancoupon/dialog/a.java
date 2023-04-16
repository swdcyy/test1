package com.kuaishou.merchant.marketing.shop.newfancoupon.dialog.a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.marketing.shop.newfancoupon.dialog.NewFanCouponBaseDialog;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.marketing.shop.newfancoupon.model.NewFanCouponModel;
import com.kuaishou.merchant.marketing.shop.newfancoupon.dialog.NewFanCouponBaseDialog$b;

public class a extends m	// class@001bf4
{
    public final NewFanCouponBaseDialog c;

    public void a(NewFanCouponBaseDialog p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       NewFanCouponBaseDialog a;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a tc = this.c;
       a = tc.A;
       if (a != null) {
          NewFanCouponBaseDialog c = tc.C;
          if (c != null) {
             a.a(c);
          }
       }
       return;
    }
}
