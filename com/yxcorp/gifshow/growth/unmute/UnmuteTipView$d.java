package com.yxcorp.gifshow.growth.unmute.UnmuteTipView$d;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.growth.unmute.UnmuteTipView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import com.yxcorp.gifshow.growth.unmute.UnmuteTipView$b;

public final class UnmuteTipView$d extends AnimatorListenerAdapter	// class@00158e
{
    public final UnmuteTipView a;

    public void UnmuteTipView$d(UnmuteTipView p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, UnmuteTipView$d.class, "3")) {
          return;
       }
       super.onAnimationCancel(p0);
       this.a.setAlpha(0);
       UnmuteTipView$b mOnHideListe = this.a.getMOnHideListener();
       if (mOnHideListe != null) {
          mOnHideListe.D();
       }
       PatchProxy.onMethodExit(UnmuteTipView$d.class, "3");
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, UnmuteTipView$d.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.setAlpha(0);
       UnmuteTipView$b mOnHideListe = this.a.getMOnHideListener();
       if (mOnHideListe != null) {
          mOnHideListe.D();
       }
       PatchProxy.onMethodExit(UnmuteTipView$d.class, "2");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, UnmuteTipView$d.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       p0.K = 0;
       PatchProxy.onMethodExit(UnmuteTipView$d.class, "1");
       return;
    }
}
