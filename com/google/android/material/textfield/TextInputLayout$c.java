package com.google.android.material.textfield.TextInputLayout$c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Float;
import ck.c;

public class TextInputLayout$c implements ValueAnimator$AnimatorUpdateListener	// class@0016e3
{
    public final TextInputLayout a;

    public void TextInputLayout$c(TextInputLayout p0){
       this.a = p0;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       this.a.V0.P(p0.getAnimatedValue().floatValue());
    }
}
