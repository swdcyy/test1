package com.yxcorp.gifshow.decoration.widget.BaseDrawer$a;
import ekd.f$j;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;

public class BaseDrawer$a extends f$j	// class@0012ac
{
    public final float a;
    public final float b;
    public final Animator$AnimatorListener c;
    public final BaseDrawer d;

    public void BaseDrawer$a(BaseDrawer p0,float p1,float p2,Animator$AnimatorListener p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseDrawer$a.class, "3")) {
          return;
       }
       BaseDrawer$a td = this.d;
       td.mSmoothUpdateAnimator = null;
       td.update();
       td = this.c;
       if (td != null) {
          td.onAnimationCancel(p0);
       }
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseDrawer$a.class, "2")) {
          return;
       }
       BaseDrawer$a td = this.d;
       td.mSmoothUpdateAnimator = null;
       td.update();
       td = this.c;
       if (td != null) {
          td.onAnimationEnd(p0);
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseDrawer$a.class, "1")) {
          return;
       }
       BaseDrawer$a td = this.d;
       BaseDrawer mDecorationS = td.mDecorationShowingView;
       if (mDecorationS != null && td.mBaseDrawerData != null) {
          mDecorationS.setTranslationX(this.a);
          this.d.mDecorationShowingView.setTranslationY(this.b);
          if (this.d.mBaseDrawerData.y()) {
             this.d.mDecorationShowingView.setVisibility(0);
          }
       }
       td = this.c;
       if (td != null) {
          td.onAnimationStart(p0);
       }
       return;
    }
}
