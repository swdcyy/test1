package com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.LiveMerchantContainerAnimViewBinder$showInAnimListener$2$a;
import v94.a;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.LiveMerchantContainerAnimViewBinder$showInAnimListener$2;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.LiveMerchantContainerAnimViewBinder;
import android.view.View;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.LiveMerchantContainerAnimViewBinder$showInAnimListener$2$a$a;
import android.view.View$OnClickListener;

public final class LiveMerchantContainerAnimViewBinder$showInAnimListener$2$a extends a	// class@001c26
{
    public final LiveMerchantContainerAnimViewBinder$showInAnimListener$2 a;

    public void LiveMerchantContainerAnimViewBinder$showInAnimListener$2$a(LiveMerchantContainerAnimViewBinder$showInAnimListener$2 p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantContainerAnimViewBinder$showInAnimListener$2$a.class, "2")) {
          return;
       }
       LiveMerchantContainerAnimViewBinder.V8(this.a.this$0).setOnClickListener(new LiveMerchantContainerAnimViewBinder$showInAnimListener$2$a$a(this));
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantContainerAnimViewBinder$showInAnimListener$2$a.class, "1")) {
          return;
       }
       LiveMerchantContainerAnimViewBinder.V8(this.a.this$0).setVisibility(0);
       return;
    }
}
