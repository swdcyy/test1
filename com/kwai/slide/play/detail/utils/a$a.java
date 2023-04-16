package com.kwai.slide.play.detail.utils.a$a;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class a$a extends AnimatorListenerAdapter	// class@001882
{
    public final boolean a;
    public final View b;

    public void a$a(boolean p0,View p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       this.onAnimationEnd(p0);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
          return;
       }
       if (this.a != null) {
          this.b.setVisibility(0);
       }else {
          this.b.setVisibility(4);
       }
       this.b.setTranslationY(0);
       return;
    }
}
