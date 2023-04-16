package com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.LiveMerchantDiscountDialogCoverView$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.LiveMerchantDiscountDialogCoverView;
import android.view.View;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveMerchantDiscountDialogCoverView$a extends AnimatorListenerAdapter	// class@001c1b
{
    public final View a;
    public final ObjectAnimator b;
    public final LiveMerchantDiscountDialogCoverView c;

    public void LiveMerchantDiscountDialogCoverView$a(LiveMerchantDiscountDialogCoverView p0,View p1,ObjectAnimator p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantDiscountDialogCoverView$a.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.b.removeAllListeners();
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantDiscountDialogCoverView$a.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.setScaleX(0x3f333333);
       this.a.setScaleY(0x3f333333);
       return;
    }
}
