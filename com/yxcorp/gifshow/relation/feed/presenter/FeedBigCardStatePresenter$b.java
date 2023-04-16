package com.yxcorp.gifshow.relation.feed.presenter.FeedBigCardStatePresenter$b;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.relation.feed.presenter.FeedBigCardStatePresenter;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;
import android.view.View;
import android.view.ViewGroup;

public class FeedBigCardStatePresenter$b implements Animator$AnimatorListener	// class@001899
{
    public final FeedBigCardStatePresenter a;

    public void FeedBigCardStatePresenter$b(FeedBigCardStatePresenter p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeedBigCardStatePresenter$b.class, "2")) {
          return;
       }
       this.a.X8(true);
       FeedBigCardStatePresenter n = this.a.N;
       if (n != null) {
          n.clearAnimation();
          this.a.N.setAlpha(0x3f800000);
       }
       n = this.a.M;
       if (n != null) {
          n.clearAnimation();
          this.a.M.setAlpha(0);
          FeedBigCardStatePresenter$b ta = this.a;
          ta.L.removeView(ta.M);
       }
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeedBigCardStatePresenter$b.class, "1")) {
          return;
       }
       this.a.X8(false);
       return;
    }
}
