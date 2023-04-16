package com.yxcorp.gifshow.widget.e;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import java.lang.Object;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import l2.b;
import android.animation.TimeInterpolator;
import android.animation.Animator;

public final class e implements PopupInterface$c	// class@001977
{
    public static final e a;

    static {
       e.a = new e();
    }
    public void e(){
       super();
    }
    public final void a(View p0,Animator$AnimatorListener p1){
       View view = p0.findViewById(R.id.toast_content_layout);
       float[] uofloatArray = new float[]{(float)p0.getHeight(),0};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, uofloatArray);
       AnimatorSet uAnimatorSet = new AnimatorSet();
       uAnimatorSet.setInterpolator(new b());
       uAnimatorSet.setDuration(200);
       uAnimatorSet.addListener(p1);
       Animator[] uAnimatorArr = new Animator[]{objectAnimat,ObjectAnimator.ofFloat(view, View.ALPHA, new float[2]{0,0x3f800000})};
       uAnimatorSet.playTogether(uAnimatorArr);
       uAnimatorSet.start();
    }
}
