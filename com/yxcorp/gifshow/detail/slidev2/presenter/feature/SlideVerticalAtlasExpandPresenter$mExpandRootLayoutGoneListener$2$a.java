package com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter$mExpandRootLayoutGoneListener$2$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter$mExpandRootLayoutGoneListener$2;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter;
import android.widget.ImageView;
import android.widget.FrameLayout;

public final class SlideVerticalAtlasExpandPresenter$mExpandRootLayoutGoneListener$2$a extends AnimatorListenerAdapter	// class@001933
{
    public final SlideVerticalAtlasExpandPresenter$mExpandRootLayoutGoneListener$2 a;

    public void SlideVerticalAtlasExpandPresenter$mExpandRootLayoutGoneListener$2$a(SlideVerticalAtlasExpandPresenter$mExpandRootLayoutGoneListener$2 p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideVerticalAtlasExpandPresenter$mExpandRootLayoutGoneListener$2$a.class, "2")) {
          return;
       }
       SlideVerticalAtlasExpandPresenter v = this.a.this$0.v;
       if (v != null) {
          v.setEnabled(true);
       }
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideVerticalAtlasExpandPresenter$mExpandRootLayoutGoneListener$2$a.class, "1")) {
          return;
       }
       SlideVerticalAtlasExpandPresenter s = this.a.this$0.s;
       if (s != null) {
          s.setVisibility(8);
       }
       s = this.a.this$0.v;
       if (s != null) {
          s.setEnabled(true);
       }
       return;
    }
}
