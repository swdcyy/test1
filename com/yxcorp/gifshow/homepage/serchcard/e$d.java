package com.yxcorp.gifshow.homepage.serchcard.e$d;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.homepage.serchcard.e;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class e$d implements Animator$AnimatorListener	// class@001800
{
    public final e a;

    public void e$d(e p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$d.class, "2")) {
          return;
       }
       this.a.B.setVisibility(8);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$d.class, "1")) {
          return;
       }
       this.a.B.setVisibility(8);
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
    }
}
