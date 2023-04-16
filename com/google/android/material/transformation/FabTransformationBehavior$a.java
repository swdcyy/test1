package com.google.android.material.transformation.FabTransformationBehavior$a;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.FabTransformationBehavior;
import android.view.View;
import android.animation.Animator;

public class FabTransformationBehavior$a extends AnimatorListenerAdapter	// class@0016eb
{
    public final boolean a;
    public final View b;
    public final View c;
    public final FabTransformationBehavior d;

    public void FabTransformationBehavior$a(FabTransformationBehavior p0,boolean p1,View p2,View p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (this.a == null) {
          this.b.setVisibility(4);
          this.c.setAlpha(0x3f800000);
          this.c.setVisibility(0);
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (this.a != null) {
          this.b.setVisibility(0);
          this.c.setAlpha(0);
          this.c.setVisibility(4);
       }
       return;
    }
}
