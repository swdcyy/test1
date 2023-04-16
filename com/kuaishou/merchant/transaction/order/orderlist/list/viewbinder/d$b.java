package com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.d$b;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.d;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.merchant.transaction.order.orderlist.widget.MerchantOrderShadowLayout;
import cm4.b;
import java.lang.Runnable;
import android.view.View;

public class d$b extends AnimatorListenerAdapter	// class@0008a8
{
    public final d a;

    public void d$b(d p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$b.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       d w = this.a.w;
       Objects.requireNonNull(w);
       if (!PatchProxy.applyVoid(null, w, MerchantOrderShadowLayout.class, "3")) {
          w.post(new b(w));
       }
       return;
    }
}
