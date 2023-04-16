package com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.a$c;
import q94.o;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.LiveMerchantDiscountDialogGrabButtonView;
import android.animation.ObjectAnimator;
import com.kuaishou.merchant.marketing.shop.MerchantMarketingShopLogBiz;
import p74.a;
import o74.a;
import android.widget.FrameLayout;
import android.util.Property;
import aa4.g;
import android.animation.Animator$AnimatorListener;

public final class a$c implements o	// class@001c2b
{
    public final a a;

    public void a$c(a p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       a b;
       LiveMerchantDiscountDialogGrabButtonView q;
       a$c uoc = a$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "1")) {
          return;
       }
       uoc = this.a;
       Objects.requireNonNull(uoc);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uoc, uoa, "10")) {
          String str = "mGrabButton";
          Object[] objArray = null;
          if (!p0) {
             b = uoc.B;
             if (b == null) {
                a.S(str);
             }
             Objects.requireNonNull(b);
             if (!PatchProxy.applyVoid(objArray, b, LiveMerchantDiscountDialogGrabButtonView.class, "5")) {
                q = b.q;
                if (q != null && q.isRunning()) {
                   a.s(MerchantMarketingShopLogBiz.LIVE_MERCHANT_TIME_DISCOUNT, "LiveMerchantDiscountDialogButtonView", "circle animator is already run");
                }else {
                   b.v = 4;
                   b.e();
                   if (b.q == null) {
                      ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(b.l, FrameLayout.ROTATION_Y, new float[2]{0,0x43b40000});
                      b.q = objectAnimat;
                      objectAnimat.setDuration(1000);
                      b.q.setRepeatCount(1);
                      b.q.setRepeatCount(-1);
                      b.q.addListener(new g(b));
                   }
                   b.q.start();
                }
             }
          }else {
             b = uoc.B;
             if (b == null) {
                a.S(str);
             }
             Objects.requireNonNull(b);
             if (!PatchProxy.applyVoid(objArray, b, LiveMerchantDiscountDialogGrabButtonView.class, "6")) {
                b.v = 1;
                q = b.q;
                if (q != null && q.isRunning()) {
                   b.q.cancel();
                }
             }
          }
       }
    label_00c0 :
       return;
    }
}
