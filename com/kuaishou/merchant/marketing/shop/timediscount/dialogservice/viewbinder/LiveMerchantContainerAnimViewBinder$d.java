package com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.LiveMerchantContainerAnimViewBinder$d;
import v94.a;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.LiveMerchantContainerAnimViewBinder;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;

public final class LiveMerchantContainerAnimViewBinder$d extends a	// class@001c24
{
    public final LiveMerchantContainerAnimViewBinder a;

    public void LiveMerchantContainerAnimViewBinder$d(LiveMerchantContainerAnimViewBinder p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantContainerAnimViewBinder$d.class, "2")) {
          return;
       }
       LiveMerchantContainerAnimViewBinder w = this.a.w;
       if (w != null) {
          w.dismiss();
       }
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantContainerAnimViewBinder$d.class, "1")) {
          return;
       }
       LiveMerchantContainerAnimViewBinder w = this.a.w;
       if (w != null) {
          w.dismiss();
       }
       return;
    }
}
