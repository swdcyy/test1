package com.yxcorp.gifshow.detail.fragments.milano.presenter.d$d;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.d;
import android.view.View;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class d$d implements Animator$AnimatorListener	// class@001523
{
    public final View a;
    public final d b;

    public void d$d(d p0,View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationCancel(Animator p0){
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$d.class, "1")) {
          return;
       }
       d$d ta = this.a;
       if (ta != null && !ta.getVisibility()) {
          this.a.setVisibility(4);
          this.a.setClickable(false);
       }
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
    }
}
