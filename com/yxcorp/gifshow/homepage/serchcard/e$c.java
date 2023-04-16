package com.yxcorp.gifshow.homepage.serchcard.e$c;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.homepage.serchcard.e;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class e$c implements Animator$AnimatorListener	// class@0017ff
{
    public final float a;
    public final e b;

    public void e$c(e p0,float p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$c.class, "3")) {
          return;
       }
       this.b.B.setVisibility(0);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$c.class, "2")) {
          return;
       }
       this.b.B.setVisibility(0);
       p0.I = true;
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$c.class, "1")) {
          return;
       }
       this.b.E.setAlpha(0);
       this.b.C.setTranslationY(this.a);
       this.b.B.setVisibility(0);
       p0.I = false;
       return;
    }
}
