package com.yxcorp.gifshow.detail.helper.FollowView$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.detail.helper.FollowView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import ok.o;

public class FollowView$a extends AnimatorListenerAdapter	// class@001563
{
    public final FollowView a;

    public void FollowView$a(FollowView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowView$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.e.setVisibility(8);
       this.a.i();
       FollowView p = this.a.p;
       if (p != null && !p.apply(null)) {
          this.a.m();
       }
       return;
    }
}
