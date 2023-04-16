package com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantBasePendant$mStartSuccessAnimation$1$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantBasePendant$mStartSuccessAnimation$1;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantBasePendant;
import com.yxcorp.gifshow.ad.neo.widget.AdRewardPendant;
import kotlin.jvm.internal.a;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.ImageView;
import qw.e;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.TextView;
import l49.a;
import android.animation.Animator$AnimatorListener;

public final class AdNeoMerchantBasePendant$mStartSuccessAnimation$1$a implements Runnable	// class@001799
{
    public final AdNeoMerchantBasePendant$mStartSuccessAnimation$1 b;
    public final a c;

    public void AdNeoMerchantBasePendant$mStartSuccessAnimation$1$a(AdNeoMerchantBasePendant$mStartSuccessAnimation$1 p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, AdNeoMerchantBasePendant$mStartSuccessAnimation$1$a.class, "1")) {
          return;
       }
       AdNeoMerchantBasePendant a = this.b.this$0.a;
       if (a != null) {
          AdNeoMerchantBasePendant$mStartSuccessAnimation$1$a tc = this.c;
          if (!PatchProxy.applyVoidOneRefs(tc, a, AdRewardPendant.class, "3")) {
             a.p(tc, "complete");
             AdRewardPendant d = a.d;
             if (d == null) {
                a.S("mAnimationView");
             }
             d.t();
             d = a.d;
             if (d == null) {
                a.S("mAnimationView");
             }
             d.clearAnimation();
             d = a.d;
             if (d == null) {
                a.S("mAnimationView");
             }
             d.setAnimationFromUrl(e.b.c("https://static.yximgs.com/udata/pkg/ad-res/ad_neo_merchant_success_lottie.0ecc90f4d7c1997a.json"));
             d = a.d;
             if (d == null) {
                a.S("mAnimationView");
             }
             d.setProgress(0);
             d = a.b;
             if (d == null) {
                a.S("mInfoText");
             }
             d.setText(a1.p(R.string.arg_RES_7f10156c));
             d = a.d;
             if (d == null) {
                a.S("mAnimationView");
             }
             d.setVisibility(0);
             d = a.d;
             if (d == null) {
                a.S("mAnimationView");
             }
             d.a(new a(a, tc));
             AdRewardPendant d1 = a.d;
             if (d1 == null) {
                a.S("mAnimationView");
             }
             d1.s();
          }
       }
       return;
    }
}
