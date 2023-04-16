package com.google.android.material.transformation.FabTransformationBehavior$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.google.android.material.transformation.FabTransformationBehavior;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;

public class FabTransformationBehavior$b implements ValueAnimator$AnimatorUpdateListener	// class@0016ec
{
    public final View a;
    public final FabTransformationBehavior b;

    public void FabTransformationBehavior$b(FabTransformationBehavior p0,View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       this.a.invalidate();
    }
}
