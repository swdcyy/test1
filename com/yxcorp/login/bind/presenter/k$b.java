package com.yxcorp.login.bind.presenter.k$b;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.login.bind.presenter.k;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.Animator$AnimatorListener;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.ImageView;

public class k$b extends AnimatorListenerAdapter	// class@001a80
{
    public final k a;

    public void k$b(k p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$b.class, "2")) {
          return;
       }
       super.onAnimationCancel(p0);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$b.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.p.v(this);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$b.class, "3")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.p.setVisibility(0);
       return;
    }
}
