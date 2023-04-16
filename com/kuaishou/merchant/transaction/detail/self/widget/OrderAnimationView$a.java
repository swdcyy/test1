package com.kuaishou.merchant.transaction.detail.self.widget.OrderAnimationView$a;
import android.animation.Animator$AnimatorListener;
import com.kuaishou.merchant.transaction.detail.self.widget.OrderAnimationView;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.view.View;
import android.animation.ValueAnimator;

public class OrderAnimationView$a implements Animator$AnimatorListener	// class@00076d
{
    public final OrderAnimationView a;

    public void OrderAnimationView$a(OrderAnimationView p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OrderAnimationView$a.class, "1")) {
          return;
       }
       OrderAnimationView$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, OrderAnimationView.class, "23")) {
          if (ta.E != null) {
             ta.setVisibility(8);
          }else {
             ta.p();
          }
       }
       return;
    }
    public void onAnimationRepeat(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OrderAnimationView$a.class, "2")) {
          return;
       }
       OrderAnimationView$a ta = this.a;
       if (ta.h == null && ta.n()) {
          this.a.H.setStartDelay(0);
       }
       return;
    }
    public void onAnimationStart(Animator p0){
    }
}
