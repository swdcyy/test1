package com.yxcorp.gifshow.growth.halfscreenfollow.j;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import java.lang.Object;
import android.view.View;
import android.animation.Animator;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;

public final class j implements PopupInterface$b	// class@001390
{
    public static final j a;

    static {
       j.a = new j();
    }
    public void j(){
       super();
    }
    public final Animator a(View p0){
       float[] uofloatArray = new float[]{(float)p0.getMeasuredHeight()};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, View.TRANSLATION_Y, uofloatArray);
       objectAnimat.setDuration(250).setInterpolator(new AccelerateDecelerateInterpolator());
       return objectAnimat;
    }
}
