package com.google.android.material.transformation.ExpandableTransformationBehavior$a;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import android.animation.Animator;

public class ExpandableTransformationBehavior$a extends AnimatorListenerAdapter	// class@0016e9
{
    public final ExpandableTransformationBehavior a;

    public void ExpandableTransformationBehavior$a(ExpandableTransformationBehavior p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       p0.b = null;
    }
}
