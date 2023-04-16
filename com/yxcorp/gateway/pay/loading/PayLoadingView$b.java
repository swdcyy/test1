package com.yxcorp.gateway.pay.loading.PayLoadingView$b;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gateway.pay.loading.PayLoadingView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import android.view.View;
import com.yxcorp.gateway.pay.loading.PathLoadingView;

public class PayLoadingView$b extends AnimatorListenerAdapter	// class@00122b
{
    public final PayLoadingView a;

    public void PayLoadingView$b(PayLoadingView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PayLoadingView$b.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.setVisibility(8);
       PayLoadingView.a(this.a).setVisibility(8);
       PayLoadingView.c(this.a).e();
       return;
    }
}
