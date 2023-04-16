package com.google.android.material.transformation.FabTransformationScrimBehavior$a;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import android.view.View;
import android.animation.Animator;

public class FabTransformationScrimBehavior$a extends AnimatorListenerAdapter	// class@0016f1
{
    public final boolean a;
    public final View b;
    public final FabTransformationScrimBehavior c;

    public void FabTransformationScrimBehavior$a(FabTransformationScrimBehavior p0,boolean p1,View p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (this.a == null) {
          this.b.setVisibility(4);
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (this.a != null) {
          this.b.setVisibility(0);
       }
       return;
    }
}
