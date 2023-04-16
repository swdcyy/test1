package com.google.android.material.transformation.FabTransformationBehavior$d;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.FabTransformationBehavior;
import com.google.android.material.circularreveal.c;
import android.animation.Animator;
import com.google.android.material.circularreveal.c$e;

public class FabTransformationBehavior$d extends AnimatorListenerAdapter	// class@0016ee
{
    public final c a;
    public final FabTransformationBehavior b;

    public void FabTransformationBehavior$d(FabTransformationBehavior p0,c p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       c$e revealInfo = this.a.getRevealInfo();
       revealInfo.c = Float.MAX_VALUE;
       this.a.setRevealInfo(revealInfo);
    }
}
