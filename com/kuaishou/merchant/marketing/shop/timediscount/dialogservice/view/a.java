package com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.LiveMerchantDiscountDialogCoverView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import aa4.d;
import java.lang.Runnable;
import android.view.View;

public class a extends AnimatorListenerAdapter	// class@001c1f
{
    public final LiveMerchantDiscountDialogCoverView a;

    public void a(LiveMerchantDiscountDialogCoverView p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.L.postDelayed(new d(this), 430);
       return;
    }
}
