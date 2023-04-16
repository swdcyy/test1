package com.google.android.material.transformation.ExpandableTransformationBehavior;
import com.google.android.material.transformation.ExpandableBehavior;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.animation.AnimatorSet;
import com.google.android.material.transformation.ExpandableTransformationBehavior$a;
import android.animation.Animator$AnimatorListener;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior	// class@0016ea
{
    public AnimatorSet b;

    public void ExpandableTransformationBehavior(){
       super();
    }
    public void ExpandableTransformationBehavior(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public boolean e(View p0,View p1,boolean p2,boolean p3){
       ExpandableTransformationBehavior tb = this.b;
       boolean b = (tb != null)? true: false;
       if (b) {
          tb.cancel();
       }
       AnimatorSet uAnimatorSet = this.g(p0, p1, p2, b);
       this.b = uAnimatorSet;
       uAnimatorSet.addListener(new ExpandableTransformationBehavior$a(this));
       this.b.start();
       if (!p3) {
          this.b.end();
       }
       return true;
    }
    public abstract AnimatorSet g(View p0,View p1,boolean p2,boolean p3);
}
