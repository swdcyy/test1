package com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.b;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.LiveMerchantDiscountDialogGrabButtonView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.marketing.shop.MerchantMarketingShopLogBiz;
import p74.a;
import o74.a;
import android.widget.ImageView;
import crd.b;
import lnc.b9;
import com.yxcorp.utility.f;
import brd.t;
import aa4.j;
import erd.g;

public class b extends AnimatorListenerAdapter	// class@001c20
{
    public final LiveMerchantDiscountDialogGrabButtonView a;

    public void b(LiveMerchantDiscountDialogGrabButtonView p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       super.onAnimationCancel(p0);
       a.s(MerchantMarketingShopLogBiz.LIVE_MERCHANT_TIME_DISCOUNT, "LiveMerchantDiscountDialogButtonView", "water wave animator cancel");
       b ta = this.a;
       ta.x = true;
       ta.m.setAlpha(0x3f800000);
       this.a.m.setScaleX(0x3f800000);
       this.a.m.setScaleY(0x3f800000);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       b ta = this.a;
       if (ta.x != null) {
          a.s(MerchantMarketingShopLogBiz.LIVE_MERCHANT_TIME_DISCOUNT, "LiveMerchantDiscountDialogButtonView", "manually cancel water wave animator, without repeat in onEnd");
          this.a.m.setVisibility(4);
          return;
       }else {
          b9.a(ta.u);
          this.a.u = f.d().e(1500).subscribe(new j(this, p0));
          return;
       }
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.m.setVisibility(0);
       return;
    }
}
