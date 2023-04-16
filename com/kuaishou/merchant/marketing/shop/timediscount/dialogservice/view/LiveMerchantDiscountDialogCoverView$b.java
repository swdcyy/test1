package com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.LiveMerchantDiscountDialogCoverView$b;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.LiveMerchantDiscountDialogCoverView;
import android.animation.AnimatorSet;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;

public class LiveMerchantDiscountDialogCoverView$b extends AnimatorListenerAdapter	// class@001c1c
{
    public final AnimatorSet a;
    public final LiveMerchantDiscountDialogCoverView b;

    public void LiveMerchantDiscountDialogCoverView$b(LiveMerchantDiscountDialogCoverView p0,AnimatorSet p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantDiscountDialogCoverView$b.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.removeAllListeners();
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantDiscountDialogCoverView$b.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       this.b.G.setAlpha(0);
       return;
    }
}
