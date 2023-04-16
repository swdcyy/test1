package com.yxcorp.gateway.pay.loading.PayLoadingView$a;
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
import java.util.Objects;
import java.lang.Float;

public class PayLoadingView$a extends AnimatorListenerAdapter	// class@00122a
{
    public final PayLoadingView a;

    public void PayLoadingView$a(PayLoadingView p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PayLoadingView$a.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.setVisibility(0);
       PayLoadingView.a(this.a).setVisibility(0);
       PathLoadingView pathLoadingV = PayLoadingView.c(this.a);
       Objects.requireNonNull(pathLoadingV);
       if (!PatchProxy.applyVoid(null, pathLoadingV, PathLoadingView.class, "4")) {
          float f = 0;
          if (!PatchProxy.isSupport(PathLoadingView.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f), pathLoadingV, PathLoadingView.class, "5")) {
             pathLoadingV.j = false;
             pathLoadingV.k = true;
             pathLoadingV.setWillNotDraw(0);
             pathLoadingV.g();
          }
       }
       return;
    }
}
