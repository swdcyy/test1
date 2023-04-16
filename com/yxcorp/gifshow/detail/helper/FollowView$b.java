package com.yxcorp.gifshow.detail.helper.FollowView$b;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.detail.helper.FollowView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.Animator$AnimatorListener;
import android.widget.ImageView;

public class FollowView$b extends AnimatorListenerAdapter	// class@001564
{
    public final FollowView a;

    public void FollowView$b(FollowView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowView$b.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       p0.removeListener(this);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowView$b.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.g.setVisibility(4);
       FollowView$b ta = this.a;
       if (ta.m - 0x3f000000 > 0) {
          ta.h.setVisibility(0);
          this.a.i.setVisibility(8);
       }else {
          ta.i.setVisibility(0);
          this.a.h.setVisibility(8);
       }
       this.a.k.start();
       return;
    }
}
