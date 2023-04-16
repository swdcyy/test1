package com.yxcorp.gifshow.v3.SocialSimpleEditorActivityViewBinder$b$a;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.v3.SocialSimpleEditorActivityViewBinder$b;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.SocialSimpleEditorActivityViewBinder;
import android.widget.FrameLayout;
import android.view.ViewGroup;

public final class SocialSimpleEditorActivityViewBinder$b$a implements Animator$AnimatorListener	// class@000d25
{
    public final SocialSimpleEditorActivityViewBinder$b a;

    public void SocialSimpleEditorActivityViewBinder$b$a(SocialSimpleEditorActivityViewBinder$b p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialSimpleEditorActivityViewBinder$b$a.class, "2")) {
          return;
       }
       SocialSimpleEditorActivityViewBinder u = this.a.b.u;
       if (u != null) {
          u.setVisibility(8);
       }
       u = this.a.b.C;
       if (u != null) {
          u.setVisibility(8);
       }
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialSimpleEditorActivityViewBinder$b$a.class, "1")) {
          return;
       }
       SocialSimpleEditorActivityViewBinder u = this.a.b.u;
       if (u != null) {
          u.setVisibility(8);
       }
       u = this.a.b.C;
       if (u != null) {
          u.setVisibility(8);
       }
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
    }
}
